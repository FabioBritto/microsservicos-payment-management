package br.com.britto.hrpayroll.service;

import br.com.britto.hrpayroll.feignclients.WorkerFeignClients;
import br.com.britto.hrpayroll.model.Payment;
import br.com.britto.hrpayroll.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClients workerFeignClients;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = workerFeignClients.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
