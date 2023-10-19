package com.example.UserItem.Controller;

import com.example.UserItem.Entities.User;
import com.example.UserItem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="User")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add_User")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    
    // Creating get user by Id
    @GetMapping("/get_User/{Id}")
    public User getUserById(@PathVariable int Id){
    	
	    return userService.getUserById(Id);
    }
}
