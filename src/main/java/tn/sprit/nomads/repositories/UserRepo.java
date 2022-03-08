package tn.sprit.nomads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.sprit.nomads.entities.User;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
