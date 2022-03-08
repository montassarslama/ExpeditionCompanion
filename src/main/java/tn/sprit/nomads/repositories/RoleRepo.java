package tn.sprit.nomads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.sprit.nomads.entities.Role;


public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
