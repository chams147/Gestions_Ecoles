package Services;

import Modeles.ECOLE;
import Modeles.Eleve;
import Modeles.NiveauScolaire;
import Modeles.Profeseur;

public class SchoolService {
    ECOLE monecole;

    public SchoolService() {
    }

    public SchoolService(ECOLE monecole) {
        this.monecole = monecole;
    }

    public ECOLE getMonecole() {
        return monecole;
    }
    public void ajouterEléve(Eleve e){
        this.monecole.getEleves().add(e);

    }
    public void ajouterProf(Profeseur p ){
        this.monecole.getProfeseurs().add(p);

    }
    public void ajouterNiveauScolaire(NiveauScolaire ns){
        this.monecole.getNiveauScolaires().add(ns);

    }
public void removeEléve(Eleve e){
        this.monecole.getEleves().remove(e);

}
    public void removeprof(Profeseur p){
        this.monecole.getEleves().remove(p);

    }
    public void removeNiveauscolaire(NiveauScolaire ns){
        this.monecole.getEleves().remove(ns);

    }
    public Eleve findEleveByName(String name) {
        for (Eleve eleve : this.monecole.getEleves()) {
            if (eleve.getNom().equals(name)) //pk il faut utulser equal avec les chaines de caracteres
                return eleve;

        }
        return null;
    }
    public Profeseur findProfByName(String name) {
        for (Profeseur prof: this.monecole.getProfeseurs()) {
            if (prof.getNom().equals(name)) //pk il faut utulser equal avec les chaines de caracteres
                return prof;

        }
        return null;
    }
    public NiveauScolaire findNivScolaireBycode(String code) {
        for (NiveauScolaire ns: this.monecole.getNiveauScolaires()) {
            if (ns.getCode().equals(code)) //pk il faut utulser equal avec les chaines de caracteres
                return ns;

        }
        return null;
    }
}
