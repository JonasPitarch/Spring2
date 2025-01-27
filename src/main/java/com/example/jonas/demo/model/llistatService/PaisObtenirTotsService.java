package com.example.jonas.demo.model.llistatService;

import com.example.jonas.demo.model.Entitats.Pais;
import com.example.jonas.demo.model.Repositoris.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisObtenirTotsService {
    @Autowired
    private PaisRepository paisRepository;

    public List<Pais>obtenirTotsElsPaisos(){
        return paisRepository.findAll();
    }

    public Optional<Pais>obtenirPaisPerId(Long id){
        return paisRepository.findById(id);
    }
}
