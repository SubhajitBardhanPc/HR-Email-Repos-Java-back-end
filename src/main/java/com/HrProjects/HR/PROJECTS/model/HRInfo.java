package com.HrProjects.HR.PROJECTS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class HRInfo {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String name;
      private String email;
      private String company;
      private String role;
      private LocalDateTime postDateTime;

      public HRInfo() {
            this.postDateTime = LocalDateTime.now();

      }

      public HRInfo(String name, String email, String company, String role) {
            this.name = name;
            this.email = email;
            this.company = company;
            this.role = role;
            this.postDateTime = LocalDateTime.now();
      }

      public Long getId() {
            return id;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getName() {
            return name;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getMail() {
            return email;
      }

      public void setCompany(String company) {
            this.company = company;
      }

      public String getCompany() {
            return company;
      }

      public void setRole(String role) {
            this.role = role;
      }

      public String getRole() {
            return role;
      }
      public void setDateTime(LocalDateTime postDateTime){
            this.postDateTime = postDateTime;
      }
      public LocalDateTime getDateTime(){
            return postDateTime;
      }
}
