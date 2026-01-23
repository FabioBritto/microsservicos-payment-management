package br.com.britto.hrpayroll.controller;

import br.com.britto.hrpayroll.model.Payment;
import br.com.britto.hrpayroll.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    private static Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private Environment env;

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable("workerId") Long workerId, @PathVariable("days") Integer days) {
        logger.info("PORT = " + env.getProperty("local.server.port"));

        return ResponseEntity.ok(paymentService.getPayment(workerId, days));
    }
}
