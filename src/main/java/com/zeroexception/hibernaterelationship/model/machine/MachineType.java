package com.zeroexception.hibernaterelationship.model.machine;


import lombok.Getter;

import javax.persistence.*;
import java.util.Map;

/**
 * @author Viet Quoc Tran
 * on 4/15/18.
 * www.zeroexception.com
 */


@Entity
@Table(name = "tb_MACHINE_TYPE")
public class MachineType {
    
    @Getter
    @Id
    @GeneratedValue
    private String id;
    
    @Getter
    private String name;
    
    @Getter
    @ElementCollection
    @CollectionTable(name = "tb_VARIABLE",
        joinColumns = @JoinColumn(name = "MACHINE_TYPE_ID")
    )
    @MapKeyColumn(name = "VARIABLE_NAME")
    private Map<String, Variable> variableMap;
    
    public MachineType() {
    }

    public MachineType setId(String id) {
        this.id = id;
        return this;
    }

    public MachineType setName(String name) {
        this.name = name;
        return this;
    }

    public MachineType setVariableMap(Map<String, Variable> variableMap) {
        this.variableMap = variableMap;
        return this;
    }
}
