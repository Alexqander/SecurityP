package com.example.security.controller;

import com.example.security.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerDrive {

    @Autowired
    PasswordEncoder encoder;
    @GetMapping("drive")
    @Secured("ROLE_ADMIN")
    public String drive() {
//        User user = new User();
//        String contra = "12345alex";
//        user.setUsername("alexander");
//        user.setPassword(encoder.encode(contra));
//        System.out.println("contraseña : " + " " + user.getPassword());
        return "drive";
    }
    @GetMapping("home")
    public String home() {
        User user = new User();
        String contra = "12345alex";
        user.setUsername("alexander");
        user.setPassword(encoder.encode(contra));
        System.out.println("contraseña : " + " " + user.getPassword());
        return "home";
    }
}
