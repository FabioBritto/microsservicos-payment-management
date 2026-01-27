package br.com.britto.hruser.repository;

import br.com.britto.hruser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
