package com.example.jonas.demo.model.Repositoris;

import com.example.jonas.demo.model.Entitats.Ciutat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CiutatRepository extends JpaRepository<Ciutat, Long> {
}
