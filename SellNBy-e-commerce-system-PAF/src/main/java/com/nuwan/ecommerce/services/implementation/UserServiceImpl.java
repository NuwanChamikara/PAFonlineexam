/*Author Nuwan Chamikara*/

package com.nuwan.ecommerce.services.implementation;

import com.nuwan.ecommerce.models.UserDTO;
import com.nuwan.ecommerce.repositories.UserRepository;
import com.nuwan.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> allUser() {
        List<UserDTO> allusers = userRepository.findAll();
        return allusers;
    }

    @Override
    public String saveUser(UserDTO userdata) {
        userRepository.save(userdata);
        return "user added";
    }

    @Override
    public String updateUser(UserDTO userdata) {
        String msg = null;

        if(userdata.getUser_id() != null){
            userRepository.save(userdata);
            msg = "User Updated";
        }
        else{
            msg = "can't update User";
        }
        return msg;
    }

    @Override
    public Optional<UserDTO> searchUser(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public String deleteUser(Integer id) {
        userRepository.deleteById(id);
        return "user deleted";
    }
}
