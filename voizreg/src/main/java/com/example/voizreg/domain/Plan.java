package com.example.voizreg.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Plan")
public class Plan {
    @Id
   private final String planId;
    private final int planAmt;
    private final String planType;
    private final String planName;
    private final String planValidity;

}
