package com.example.demo.repository;

import com.example.demo.domain.DonglePlan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DongleRepo extends MongoRepository<DonglePlan, String> {
}
