package br.com.britto.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrUserApplication.class, args);
    }


}
