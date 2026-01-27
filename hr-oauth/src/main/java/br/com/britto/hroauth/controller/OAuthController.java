package br.com.britto.hroauth.controller;

import br.com.britto.hroauth.feignclients.UserFeignClients;
import br.com.britto.hroauth.model.User;
import br.com.britto.hroauth.service.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class OAuthController {

    @Autowired
    private OAuthService oAuthService;

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam("email") String email) {
        User user = oAuthService.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}
