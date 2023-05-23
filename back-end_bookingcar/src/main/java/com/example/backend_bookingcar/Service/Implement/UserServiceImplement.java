package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDTO userDTO) {
        User user = new User(userDTO.getFullname(), userDTO.getPhonenumber(),
                userDTO.getEmail(), userDTO.getPassword(), userDTO.getAddress(), userDTO.getRole());
        return userRepository.save(user);
    }

    @Override
    public Boolean checkPasswordUser(String email, String password) {
        User user = userRepository.findUserByEmail(email);
        if(user.getPassword().equals(password)) return true;
        return false;
    }

    @Override
    public Boolean checkUserByEmail(String email) {
        User user = userRepository.findUserByEmail(email);
        if(user == null) return false;
        return true;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }
    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
    @Override
    public User updateUser(UserDTO newUser,int id){
        return userRepository.findById(id).map(
                user->{
                    user.setFullname(newUser.getFullname());
                    user.setPhonenumber(newUser.getPhonenumber());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    user.setAddress(newUser.getAddress());
                    user.setRole(newUser.getRole());
                    return userRepository.save(user);
                }
        ).orElseThrow(()->new UserNotFoundException(id));
    }

    @Override
    public String deleteUser(int id) {
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "Delete Sucessfull";
    }


}
