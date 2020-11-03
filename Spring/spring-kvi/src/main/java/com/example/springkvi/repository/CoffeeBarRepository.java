package com.example.springkvi.repository;

import com.example.springkvi.model.CoffeeBar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeBarRepository extends JpaRepository <CoffeeBar,Long> {
}
