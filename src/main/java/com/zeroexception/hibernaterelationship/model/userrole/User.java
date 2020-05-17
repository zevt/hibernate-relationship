package com.zeroexception.hibernaterelationship.model.userrole;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

  @Id()
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

}
