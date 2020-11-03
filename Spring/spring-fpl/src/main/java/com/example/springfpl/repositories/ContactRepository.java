package com.example.springfpl.repositories;

import com.example.springfpl.models.PlayerContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository <PlayerContact,String> {
}
