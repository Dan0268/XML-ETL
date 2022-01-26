package io.etlexercise.xml_app.service;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import io.micrometer.core.instrument.util.StringUtils;
import org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter;
import org.springframework.stereotype.Service;


//public class IntConverter extends AbstractBasicConverter {
//
//    public boolean canConvert(Class type) {
//        return type.equals(int.class) || type.equals(Integer.class);
//    }
//
//    protected Object fromString(String str) {
//        /* If empty tag. */
//        if (str == null || str.trim().length() == 0) {
//
//            /* Default to zero. */
//            str = "null";
//        }
//
//        return Integer.decode(str);
//    }
//}

@Service
public class IntConverter implements Converter {
    @Override
    public boolean canConvert(Class clazz) {
        return clazz.equals(Integer.class);
    }

    @Override
    public void marshal(Object Obj, HierarchicalStreamWriter arg1, MarshallingContext arg2) {

    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        String value = reader.getValue();
        if(StringUtils.isEmpty(value)){
            return null;
        }
        return Integer.valueOf(value);
    }
}