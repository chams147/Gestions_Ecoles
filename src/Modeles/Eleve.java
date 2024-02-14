package Modeles;

public class Eleve extends Persone{
    String ntelparent;

    public Eleve(String nom, int age,String ntel ) {
        super(nom, age);
        this.ntelparent=ntel;
    }

    @Override
    public String getdata() {
        return this.getNom()+" "+this.getAge()+ " "+this.ntelparent;
    }

    public Eleve() {


    }

    public String getNtelparent() {
        return ntelparent;
    }

    public void setNtelparent(String ntelparent) {
        this.ntelparent = ntelparent;
    }
}
