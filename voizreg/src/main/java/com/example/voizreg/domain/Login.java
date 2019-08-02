package com.example.voizreg.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Login {

    @NotBlank

  private  String email;
    @NotBlank
    @Size(min=7,message = "specify atleast 7 character")
  private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
