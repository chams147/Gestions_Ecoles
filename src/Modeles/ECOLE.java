package Modeles;

import java.util.ArrayList;

public class ECOLE {
    String nom,adresse,ntel;
    ArrayList<Eleve> eleves;
    ArrayList<Profeseur> profeseurs;
    ArrayList<NiveauScolaire> niveauScolaires;
    private void InitObject(){
        this.eleves=new ArrayList<Eleve>(); //Réservation de espace memoire nécessaiare;
        this.profeseurs=new ArrayList<Profeseur>();
        this.niveauScolaires=new ArrayList<NiveauScolaire>();


    }

    public ECOLE() {
        InitObject();

    }

    public ECOLE(String nom) {
        this.nom = nom;
        InitObject();
    }

    public ECOLE(String nom, String adresse, String ntel) {
        this.nom = nom;
        this.adresse = adresse;
        this.ntel = ntel;
    }

    public ArrayList<Eleve> getEleves() {
        return eleves;
    }


    public ArrayList<Profeseur> getProfeseurs() {
        return profeseurs;
    }



    public ArrayList<NiveauScolaire> getNiveauScolaires() {
        return niveauScolaires;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNtel() {
        return ntel;
    }

    public void setNtel(String ntel) {
        this.ntel = ntel;
    }

}
