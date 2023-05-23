package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/manage_user")
public class ManageUserController {
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
    @GetMapping("/list_user")
    List<User> getAllUsers(){
        List<User> arrayUser = userService.getAllUsers();
        return arrayUser;
    }
    @GetMapping("/{id}")
    User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PutMapping("/edit_user/{id}")
    User updateUser(@RequestBody UserDTO userDTO, @PathVariable int id){
        return userService.updateUser(userDTO,id);
    }
    @DeleteMapping("/delete_user/{id}")
    String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}
