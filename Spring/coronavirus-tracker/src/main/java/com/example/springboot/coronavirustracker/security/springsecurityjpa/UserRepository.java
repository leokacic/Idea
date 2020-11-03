package com.example.springboot.coronavirustracker.security.springsecurityjpa;

import com.example.springboot.coronavirustracker.security.springsecurityjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User,String>{
    Optional<User> findByUserName(String userName);

}
