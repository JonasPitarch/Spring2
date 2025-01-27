package com.example.jonas.demo.model.Repositoris;

import com.example.jonas.demo.model.Entitats.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
