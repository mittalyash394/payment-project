package com.paymentProject.Payment.Project.service;

import com.paymentProject.Payment.Project.controller.PaymentController;
import com.paymentProject.Payment.Project.entity.Payment;
import com.paymentProject.Payment.Project.repo.PaymentRepo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{

    public static final Logger log = LogManager.getLogger(PaymentServiceImpl.class);

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public List<Payment> getAllPayments() {
        log.info("All the payments are here");
        List<Payment> paymentList = paymentRepo.findAll();
        log.info("The paymentList is here ------------->>>>>");
        return paymentList;
    }
}
