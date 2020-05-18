package com.zeroexception.hibernaterelationship.model.userrole;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Role {

  @Id
  private String roleName;

//  @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
//  private Set<User> users = new HashSet<>();

}
