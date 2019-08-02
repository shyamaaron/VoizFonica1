package com.example.voizreg.domain;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

@Data
@Document(collection = "cardDetails")
public class Payment {
    @Id
    String id;
    @NotNull
    @Size(min = 5, max = 50)
    private String name;
    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNum;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;
}