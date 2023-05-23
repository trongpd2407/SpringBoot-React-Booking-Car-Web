package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.Implement.UserServiceImplement;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/registration")
public class UserRegistratrionController {
    @Autowired
    private UserService userService;
    @PostMapping("/add_user")
    public User newUser(@RequestBody UserDTO userDTO){
        User user = new User();
        if(!userService.checkUserByEmail(userDTO.getEmail())){
            user = userService.save(userDTO);
        }
        else {
            throw new RuntimeException("Email Existed");
        }
        return user;

    }

}
