package com.example.jonas.demo.model.llistatService;

import com.example.jonas.demo.model.Entitats.Ciutat;
import com.example.jonas.demo.model.Repositoris.CiutatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiutatPoblacioMinimaService {
    @Autowired
    private CiutatRepository ciutatRepository;

    public List<Ciutat> obtenirCiutatAmbPoblacioMinima(int poblacioMinima){
        List<Ciutat> totesLesCiutats = ciutatRepository.findAll();
        List<Ciutat>ciutatsFiltrades = new ArrayList<>();

        for (Ciutat ciutat : totesLesCiutats){
            if (ciutat.getPoblacio() > poblacioMinima){
                ciutatsFiltrades.add(ciutat);
            }
        }

        return ciutatsFiltrades;
    }
}