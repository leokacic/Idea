package com.example.springtestna.repository;

import com.example.springtestna.models.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FplRepository extends JpaRepository <Players,Long> {
}
