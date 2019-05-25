/*Author Nuwan Chamikara*/

package com.nuwan.ecommerce.services;

import com.nuwan.ecommerce.models.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserDTO> allUser();

    String saveUser (UserDTO userdata);

    String updateUser (UserDTO userdata);

    Optional<UserDTO> searchUser(Integer id);

    String deleteUser (Integer id);

}
