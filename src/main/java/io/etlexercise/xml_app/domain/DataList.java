package io.etlexercise.xml_app.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@XStreamAlias("DataList")
public class DataList {

    @XStreamImplicit(itemFieldName = "Data")
    private List<Data> dataList = new ArrayList<>();

}
