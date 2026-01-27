package br.com.britto.hruser.controller;

import br.com.britto.hruser.model.User;
import br.com.britto.hruser.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRespository respository;

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam("email") String email) {
        return ResponseEntity.ok(respository.findByEmail(email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(respository.findById(id).get());
    }
}
