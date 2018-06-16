package com.zeroexception.hibernaterelationship.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import javax.persistence.*;

/** @author Viet Quoc Tran on 4/15/18. www.zeroexception.com */
@Entity
@Table(name = "tb_PARENTAL")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parental {

  @Getter @Id @GeneratedValue private Long id;

  @Getter private String fatherName;

  @Getter private String motherName;

  @Getter private String guardianName;

  @Getter
  @OneToOne(mappedBy = "parental", fetch = FetchType.LAZY)
  //     No Join column on inverse side
  //     No cascade on inverse side
  private Student student;

  public Parental() {}

  public Parental setId(Long id) {
    this.id = id;
    return this;
  }

  public Parental setFatherName(String fatherName) {
    this.fatherName = fatherName;
    return this;
  }

  public Parental setMotherName(String motherName) {
    this.motherName = motherName;
    return this;
  }

  public Parental setGuardianName(String guardianName) {
    this.guardianName = guardianName;
    return this;
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}
