package tn.sprit.nomads.services;

import tn.sprit.nomads.entities.Role;
import tn.sprit.nomads.entities.User;
import java.util.List;


public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    void deleteRoleToUser(String username, String roleName);

    User getUser(String username);
    List<User>getUsers();
}
