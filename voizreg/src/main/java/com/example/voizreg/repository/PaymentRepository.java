package com.example.voizreg.repository;

import com.example.voizreg.domain.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {


}