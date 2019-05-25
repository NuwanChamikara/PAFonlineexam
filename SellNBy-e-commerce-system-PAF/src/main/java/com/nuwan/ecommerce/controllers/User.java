/*Author Nuwan Chamikara*/

package com.nuwan.ecommerce.controllers;

import com.nuwan.ecommerce.models.UserDTO;
import com.nuwan.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //for rest working
@RequestMapping ("/api/User") //controller
public class User {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserDTO> allUser(){
        return userService.allUser();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO userData){
        return userService.saveUser(userData);
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody UserDTO userData){
        return userService.updateUser(userData);
    }

    @GetMapping("/find/{id}")
    public Optional<UserDTO> searchUser(@PathVariable Integer id){
        return userService.searchUser(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }


    /*Login*/

    /*Sign Up*/

    /*profile update*/

    /*password change*/


    /*user id
    first name
     last name
     email
     phone
     role
     password

     Login get
     sign up post
     profile update put
             password put
     */

}
