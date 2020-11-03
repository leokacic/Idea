package com.example.springfpl.springsecurityjpa;
import com.example.springfpl.springsecurityjpa.models.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository <User,String>{
    Optional<User> findByUserName(String userName);

}
