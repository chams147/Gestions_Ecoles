package Modeles;

import java.util.ArrayList;

public class NiveauScolaire
{
    String code;
    String nom;
Profeseur prof;
ArrayList<Eleve> eleves;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Profeseur getProf() {
        return prof;
    }

    public void setProf(Profeseur prof) {
        this.prof = prof;
    }

    public ArrayList<Eleve> getEleves() {
        return eleves;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public NiveauScolaire(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public NiveauScolaire() {
    }
}
