package com.my.pgproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String username;
  private String password;
  private String email;
}
