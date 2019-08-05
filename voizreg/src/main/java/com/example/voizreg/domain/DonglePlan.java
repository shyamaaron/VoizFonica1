package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Plans")
public class DonglePlan {
    @Id
    private final String dongleId;
    private final int dongleAmt;
    private final String dongleType;
    private final String dongleValidity;
}
