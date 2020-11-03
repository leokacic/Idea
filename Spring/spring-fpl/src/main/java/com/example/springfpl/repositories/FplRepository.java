package com.example.springfpl.repositories;

import com.example.springfpl.models.FplStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FplRepository extends JpaRepository<FplStats,String> {
}
