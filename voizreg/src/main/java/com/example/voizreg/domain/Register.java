package com.example.voizreg.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*import org.springframework.data.annotation.Id;

import javax.persistence.Entity;*/
import javax.validation.constraints.*;

@Data
@RequiredArgsConstructor
@Document
/*@Entity*/
public class Register {

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z\\s]{2,20}$",message = "Specify atleast two letters")
    private  String full_name;
@Id
    @NotBlank
    @Digits(integer=10,message="Invalid no", fraction = 0)
    private String mobile_no;
    @NotBlank
    @Size(min=7,message = "invalid ")
    private String email;
    @NotBlank
    @Size(min = 6,message = "minimum 6 characters")
    private String password;

    public String getFull_name() {
        return full_name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
