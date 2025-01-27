package com.example.jonas.demo.model.Repositoris;

import com.example.jonas.demo.model.Entitats.Franquicia;
import com.example.jonas.demo.model.Entitats.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FranquiciaRepository extends JpaRepository<Franquicia, Long> {
}
