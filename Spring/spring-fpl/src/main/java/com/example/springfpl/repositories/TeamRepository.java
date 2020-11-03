package com.example.springfpl.repositories;

import com.example.springfpl.models.FplTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository <FplTeam,String> {
}
