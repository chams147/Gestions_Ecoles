package Main;

import Modeles.ECOLE;
import Modeles.Eleve;
import Modeles.Persone;
import Modeles.Profeseur;
import Services.SchoolService;
import Tools.Actions;

import java.sql.SQLOutput;
import java.util.Scanner;

//humain machine interface
public class Hmi{
    private static  SchoolService schoolService;
    public static void start(){

// il faut un rapelle pour les methodes statique
        ECOLE e1=new ECOLE();
    e1=Hmi.creationEcole();
    affichageEcole(e1);

        Scanner sc=new Scanner(System.in);

String nom;
        String action;

        do {
            System.out.println("what do you want to do ");
              action=sc.next();
              switch (action){

                  case "ajouterEleve":
                      Hmi.addStudent();

                      break;
                  case "affichageEleves":
                      Hmi.printallstudents();

                    break;
                  case "ajouterprof":
                      Hmi.ajouterProf();
                      break;
                  case "affichageprof" :
                      Hmi.printallteachers();
                      break;
                      //1ere methode
                /*  case"trouvereleve" :
                      Eleve eleve=new Eleve();
                      Hmi.chercher(eleve);
                      break;
                  case"trouverprof":
                      Profeseur prof=new Profeseur();
                      Hmi.chercher(prof);
*/
                  //2eme méthode
                  case"trouvereleve" :
                   Hmi.chercher(Actions.Student);
                  case"trouverprof": // pk si il exite espace ne fonctione pas par exple " trouver prof
               Hmi.chercher(Actions.Teacher);


              }



        }while (!action.equals("exit"));



    }
    private static ECOLE   creationEcole(){
        ECOLE e1=new ECOLE();
        e1.setNom("Al Charguia School");
        e1.setAdresse("kasserine");
        e1.setNtel("+21698645324");
        Hmi.schoolService=new SchoolService(e1);

        return  e1;


    }
    private static void   addStudent(){
        Eleve eleve =new Eleve();
      DataPerson(eleve);
        schoolService.ajouterEléve(eleve);


    }

    public static void  affichageEcole(ECOLE e1){

        System.out.println("Bienvenue pour l'Ecole "+e1.getNom() + " situer dans : "+e1.getAdresse());

    }
    public static void printallstudents() {
        for (Eleve eleves :Hmi.schoolService.getMonecole().getEleves()) {

            //System.out.println(eleves.getNom() + " " + eleves.getAge());
            System.out.println(eleves.getdata());

        }
    }
    public static void printallteachers() {
        for (Profeseur profs :Hmi.schoolService.getMonecole().getProfeseurs()) {

            System.out.println(profs.getdata());

        }
    }
    public static void ajouterProf (){ //rappel sur les methodes static
        Profeseur prof=new Profeseur();
        Scanner reader=new Scanner(System.in);
        DataPerson(prof);
/*
        System.out.println("Entrer le nom de prof ");
        prof.setNom(reader.next());
        System.out.println("Entrer le salaire de prof ");
        prof.setSalaire(reader.nextFloat());
        System.out.println("plz enter the age");
        prof.setAge(reader.nextInt());:*/



        Hmi.schoolService.getMonecole().getProfeseurs().add(prof);





    }

    public static void  DataPerson(Persone p){ // rappel sur la polymorphisme
        Scanner reader=new Scanner(System.in);
        System.out.println("Entrer le nom de  "+(p.getClass().getSimpleName()));
        p.setNom(reader.next());

        System.out.println("plz enter the age of " +(p.getClass().getSimpleName()));
        p.setAge(reader.nextInt());
        if(p instanceof Profeseur ) {
            System.out.println("Entrer le salaire de prof ");
            ((Profeseur) p).setSalaire(reader.nextFloat()); // rappel sur le casting

        }else if(p instanceof Eleve) {
            System.out.println("plz enter the Phone Number of Parent  of Student ");
            ((Eleve) p ).setNtelparent(reader.next());


        }





    }
//1ére méthode
  /*  public static void chercher(Persone p){
        Scanner reader=new Scanner(System.in);
        String nom;
        System.out.println("entrer le nom de:"+p.getClass().getSimpleName());
        nom=reader.next();
        try {
            if ((p instanceof Eleve))
            System.out.println(schoolService.findEleveByName(nom).getdata());
            else
                System.out.println(schoolService.findProfByName(nom).getdata());

        }catch (Exception e){

            System.out.println(p.getClass().getSimpleName()+" "+nom+" n'existe pas");
        }


       }*/

       //2eme methode

    public static void chercher(Actions action){
        Scanner reader=new Scanner(System.in);
        Persone p;
        String nom;
        System.out.println("entrer le nom de:");
        nom=reader.next();

        if (action==Actions.Student)
             p=Hmi.schoolService.findEleveByName(nom);
            else
              p=schoolService.findProfByName(nom);

        if(p==null)
            System.out.println("Not found");



        else
            System.out.println(p.getdata());


    }

  /*  public static void trouverprof(){
        Scanner reader=new Scanner(System.in);
        String nom;
        System.out.println("entrer le nom de prof");
        nom=reader.next();
        try {
            System.out.println(schoolService.findProfByName(nom).getdata());

        }catch (Exception e){

            System.out.println("prof    "+nom+ " n'existe pas");
        }


    }*/
    /*
public static void removeperson() {



    if (p instanceof Eleve)
        Hmi.schoolService.removeEléve((Eleve) p);
    else {
        Hmi.schoolService.removeEléve((Eleve) p);
    }



}
*/


    public  void affichage(){

        System.out.println("welcome");
    }
}