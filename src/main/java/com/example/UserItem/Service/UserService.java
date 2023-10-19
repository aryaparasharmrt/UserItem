package com.example.UserItem.Service;

import com.example.UserItem.Entities.User;
import com.example.UserItem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added successfully";
    }

    // Creating or Writing Logic to get User
    public User getUserById(int Id) {
    	
	    User user = userRepository.findById(Id);

	    return user;
    }
}
