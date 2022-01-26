package io.etlexercise.xml_app;

import io.etlexercise.xml_app.repos.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DBRunner implements CommandLineRunner {

    @Autowired
    DataRepository repository;

    @Override
    public void run(String... args) throws Exception {

//        XStream xStream = new XStream();
//        xStream.addPermission(AnyTypePermission.ANY);
//        xStream.registerConverter((Converter) new IntConverter());
//        xStream.processAnnotations(Data.class);
//        xStream.processAnnotations(DataList.class);
//        DataList datalist = (DataList) xStream.fromXML(new FileInputStream("src/main/resources/MBS-xml-211108.XML"));
//        repository.saveAll(datalist.getDataList());

//        System.out.println(new File(".").getAbsoluteFile());
//        Data newXML = new Data();
//        newXML.setItemNum(4);
//        newXML.setItemStartDate("01.12.1989");
//        newXML.setCategory(1);
//        newXML.setGroup("A1");
//        newXML.setSubHeading("1");
//        newXML.setItemType("S");
//        newXML.setFeeType("D");
//        newXML.setNewItem("N");
//        newXML.setItemChange("N");
//        newXML.setAnaesChange("N");
//        newXML.setDescriptorChange("N");
//        newXML.setFeeChange("N");
//        newXML.setEMSNChange("N");
//        newXML.setEMSNCap("P");
//        newXML.setBenefitType("D");
//        newXML.setBenefitStartDate("01.11.2012");
//        newXML.setEMSNStartDate("01.01.2013");
//        newXML.setEMSNMaximumCap("500.00");
//        newXML.setEMSNPercentageCap("300.00");
//        newXML.setEMSNDescription("300% of the Derived fee for this item, or $500, whichever is the lesser amount");
//        newXML.setDerivedFeeStartDate("01.07.2021");
//        newXML.setDerivedFee("The fee for item 3, plus $27.40 divided by the number of patients seen, up to a maximum of six patients. For seven or more patients - the fee for item 3 plus $2.15 per patient.");
//        newXML.setDescriptionStartDate("01.01.2013");
//        newXML.setDescription("Professional attendance by a general practitioner (other than attendance at consulting rooms or a residential aged care facility or a service to which another item in the table applies) that requires a short patient history and, if necessary, limited examination and management-an attendance on one or more patients at one place on one occasion-each patient");
//        xRepo.saveAll(List.of(newXML));
    }
}
