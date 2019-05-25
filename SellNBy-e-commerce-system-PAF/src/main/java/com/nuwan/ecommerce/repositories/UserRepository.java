/*Author Nuwan Chamikara*/

package com.nuwan.ecommerce.repositories;

        import com.nuwan.ecommerce.models.UserDTO;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {

}
