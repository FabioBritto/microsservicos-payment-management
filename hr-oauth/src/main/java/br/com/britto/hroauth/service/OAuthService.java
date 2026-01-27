package br.com.britto.hroauth.service;

import br.com.britto.hroauth.feignclients.UserFeignClients;
import br.com.britto.hroauth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OAuthService {

    @Autowired
    private UserFeignClients userFeignClients;

    public User findByEmail(String email) {
        User existingUser = userFeignClients.findByEmail(email).getBody();
        User user = new User(existingUser.getId(),existingUser.getname(), existingUser.getEmail(), existingUser.getPassword());
        user.setRoles(existingUser.getRoles());
        return user;
    }
}
