package Modeles;

public class Profeseur extends Persone{
   float salaire;

    public Profeseur() {
    }

    @Override
    public String getdata() {
        return this.getNom()+"  "+this.age+"  "+this.salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(float  salaire) {
        this.salaire = salaire;
    }

    public Profeseur(String nom, int age,float salaire) {
        super(nom, age);
        this.salaire=salaire;
    }
}
