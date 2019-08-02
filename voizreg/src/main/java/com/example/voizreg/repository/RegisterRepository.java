package com.example.voizreg.repository;

import com.example.voizreg.domain.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RegisterRepository extends MongoRepository<Register,String> {
    List<Register> findByEmailAndAndPassword(String email,String password);
}

