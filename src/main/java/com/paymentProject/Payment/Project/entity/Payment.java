package com.paymentProject.Payment.Project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Payment {

    private String paymentId;
    private String amount;
    private Sender sender;
    private Receiver receiver;
    private String createdAt;
    private String updatedAt;



}
