package br.com.britto.hroauth.service;

import br.com.britto.hroauth.feignclients.UserFeignClients;
import br.com.britto.hroauth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OAuthService implements UserDetailsService {

    @Autowired
    private UserFeignClients userFeignClients;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User existingUser = userFeignClients.findByEmail(email).getBody();
        User user = new User(existingUser.getId(),existingUser.getname(), existingUser.getEmail(), existingUser.getPassword());
        user.setRoles(existingUser.getRoles());
        return user;
    }

    public User findByEmail(String email) {
        User existingUser = userFeignClients.findByEmail(email).getBody();
        User user = new User(existingUser.getId(),existingUser.getname(), existingUser.getEmail(), existingUser.getPassword());
        user.setRoles(existingUser.getRoles());
        return user;
    }
}
