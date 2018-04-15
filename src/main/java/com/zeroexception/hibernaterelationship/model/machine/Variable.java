package com.zeroexception.hibernaterelationship.model.machine;

import lombok.Getter;

import javax.persistence.Embeddable;

/**
 * @author Viet Quoc Tran
 * on 4/15/18.
 * www.zeroexception.com
 */

@Embeddable
public class Variable {

    @Getter
    private String dataType;
    @Getter
    private String  value;

    public Variable() {
    }

    public Variable setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    public Variable setValue(String value) {
        this.value = value;
        return this;
    }
}
