package com.example.jonas.demo.model.llistatService;

import com.example.jonas.demo.model.Entitats.Ciutat;
import com.example.jonas.demo.model.Entitats.Pais;
import com.example.jonas.demo.model.Entitats.Provincia;
import com.example.jonas.demo.model.Repositoris.CiutatRepository;
import com.example.jonas.demo.model.Repositoris.PaisRepository;
import com.example.jonas.demo.model.Repositoris.ProvinciaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LlistarBDAService {

    @Autowired
    private PaisRepository paisRepository;

    @Autowired
    private CiutatRepository ciutatRepository;

    @Autowired
    private ProvinciaRepository provinciaRepository;


    public void llistarCiutats(){
        List<Ciutat>ciutats = ciutatRepository.findAll();
        System.out.println("==== Llistat de Paisos ====");

        for (Ciutat ciutat : ciutats){
            System.out.println("Ciutat: "  + ciutat.getNom());
        }
    }


    public void llistarPaisos(){
        List<Pais>paisos = paisRepository.findAll();
        System.out.println("==== Llistat de Paisos ====");

        for (Pais pais : paisos){
            System.out.println("Pais: "  + pais.getNom());
        }
    }

    public void llistarProvincies(){
        List<Provincia>provincias = provinciaRepository.findAll();
        System.out.println("==== Llistat de Paisos ====");

        for (Provincia provincia : provincias){
            System.out.println("Provincia: "  + provincia.getNom());
        }
    }


    @PostConstruct
    public void inicializar(){
        System.out.println("=== Inicialitzen el servei ");
        llistarPaisos();
        llistarProvincies();
        llistarCiutats();

    }
}
