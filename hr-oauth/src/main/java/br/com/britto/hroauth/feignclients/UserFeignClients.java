package br.com.britto.hroauth.feignclients;

import br.com.britto.hroauth.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClients {

    @GetMapping(value = "/{id}")
    ResponseEntity<User> findById(@PathVariable("id") Long id);

    @GetMapping(value = "/search")
    ResponseEntity<User> findByEmail(@RequestParam("email") String email);
}
