package cz.upce.nnpia.be.controller;

import cz.upce.nnpia.be.entity.Role;
import cz.upce.nnpia.be.entity.User;
import cz.upce.nnpia.be.repository.RoleRepository;
import cz.upce.nnpia.be.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/user")
    public void addUser(){
        Role role = new Role();
        role.setName("Admin");
        role = roleRepository.save(role);

        User user = new User();
        user.setMail("karel.andres@student.upce.cz");
        user.setFirstName("Karel");
        user.setLastName("Andres");
        user.setPassword("heslo");
        user.setRole(role);

        userRepository.save(user);
    }
}
