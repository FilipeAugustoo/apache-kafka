package com.payment.common.services;

import com.payment.common.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
