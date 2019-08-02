package com.example.voizreg.repository;

import com.example.voizreg.domain.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlanRepository extends MongoRepository<Plan,String> {
    public List<Plan> findByPlanType(String planType);
}
