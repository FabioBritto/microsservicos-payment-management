package br.com.britto.hrpayroll.service;

import br.com.britto.hrpayroll.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        //Mocked payment
        Payment payment = new Payment("Fabio Mockado", 200.0, days);
        return payment;
    }
}
