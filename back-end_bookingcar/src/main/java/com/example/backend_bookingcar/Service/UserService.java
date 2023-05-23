package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.User;

import java.util.List;

public interface UserService {
    User save(UserDTO userDTO);
    Boolean checkPasswordUser(String email,String password);
    Boolean checkUserByEmail(String email);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    User getUserById(int id);
    User updateUser(UserDTO user, int id);
    String deleteUser(int id);
}
