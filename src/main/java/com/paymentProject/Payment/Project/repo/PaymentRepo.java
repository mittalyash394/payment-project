package com.paymentProject.Payment.Project.repo;

import com.paymentProject.Payment.Project.entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepo extends MongoRepository<Payment, String> {
}
