package tn.sprit.nomads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import tn.sprit.nomads.entities.Role;
import tn.sprit.nomads.entities.User;
import tn.sprit.nomads.services.UserService;

import java.util.ArrayList;

@SpringBootApplication
public class NomadsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NomadsApplication.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_ENTREPRISE"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.saveUser(new User(null, "montassar", "slama", "1234", new ArrayList<>()));


        };
    }

}
