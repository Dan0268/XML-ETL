package io.etlexercise.xml_app.config;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.security.AnyTypePermission;
import io.etlexercise.xml_app.domain.Data;
import io.etlexercise.xml_app.domain.DataList;
import io.etlexercise.xml_app.repos.DataRepository;
import io.etlexercise.xml_app.service.IntConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class DataConfig {
    @Bean
    CommandLineRunner commandLineRunner(DataRepository repository) throws Exception {
        return args -> {
            XStream xStream = new XStream();
            xStream.addPermission(AnyTypePermission.ANY);
            xStream.registerConverter((Converter) new IntConverter());
            xStream.processAnnotations(Data.class);
            xStream.processAnnotations(DataList.class);
            DataList dataList = (DataList) xStream.fromXML(new URL("http://www.mbsonline.gov.au/internet/mbsonline/publishing" +
                    ".nsf/Content/5CED1C3BD911E21BCA25875700113FF4/$File/MBS-xml-211108.XML"));
            repository.saveAll(dataList.getDataList());
        };
    }
}
