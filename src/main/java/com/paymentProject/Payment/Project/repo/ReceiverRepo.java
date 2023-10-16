package com.paymentProject.Payment.Project.repo;

import com.paymentProject.Payment.Project.entity.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiverRepo extends MongoRepository<Receiver, String> {
}
