package com.zeroexception.hibernaterelationship.model.machine;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * @author Viet Quoc Tran
 * on 4/15/18.
 * www.zeroexception.com
 */

@Embeddable
public class Variable {

    @Getter
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Getter
    @Column(name = "VALUE")
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Variable)) return false;
        Variable variable = (Variable) o;
        return Objects.equals(dataType, variable.dataType) &&
                Objects.equals(value, variable.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dataType, value);
    }
}
