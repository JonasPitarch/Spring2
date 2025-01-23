package com.example.jonas.demo.model.Entitats;

import jakarta.persistence.*;

    @Entity
    @Table
    public class Ciutat {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        @Column(nullable = false)
        String nom;
        int poblacio;
        String descripcio;
        String imatge;

        public Ciutat(long id, String nom, int poblacio, String descripcio, String imatge) {
            this.id = id;
            this.nom = nom;
            this.poblacio = poblacio;
            this.descripcio = descripcio;
            this.imatge = imatge;
        }

        public Ciutat() {

        }


        public Long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getPoblacio() {
            return poblacio;
        }

        public void setPoblacio(int poblacio) {
            this.poblacio = poblacio;
        }

        public String getDescripcio() {
            return descripcio;
        }

        public void setDescripcio(String descripcio) {
            this.descripcio = descripcio;
        }

        public String getImatge() {
            return imatge;
        }

        public void setImatge(String imatge) {
            this.imatge = imatge;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

