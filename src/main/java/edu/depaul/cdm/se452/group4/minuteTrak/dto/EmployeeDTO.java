package edu.depaul.cdm.se452.group4.minuteTrak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

  private String id;

  private String email;

  private String firstname;

  private String lastname;

  // private String password;

  // private String token;

}
