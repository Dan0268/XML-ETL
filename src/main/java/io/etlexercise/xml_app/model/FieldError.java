package io.etlexercise.xml_app.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FieldError {

    private String field;
    private String errorCode;

}