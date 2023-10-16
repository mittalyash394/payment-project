package com.paymentProject.Payment.Project.repo;

import com.paymentProject.Payment.Project.entity.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepo extends MongoRepository<Sender, String> {
}
