package br.com.britto.hrpayroll.service;

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
    private RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    private String wokerHost;

    public Payment getPayment(Long workerId, Integer days) {
        Map<String, String> uriVariables = new HashMap<String, String>();
        uriVariables.put("id", workerId.toString());
        Worker worker = restTemplate.getForObject(wokerHost + "/workers/{id}", Worker.class, uriVariables);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
