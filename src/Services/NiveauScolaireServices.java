package Services;

import Modeles.Eleve;
import Modeles.NiveauScolaire;

public class NiveauScolaireServices {
    NiveauScolaire nivscol;

    public NiveauScolaireServices(NiveauScolaire nivscol) {
        this.nivscol = nivscol;
    }

    public NiveauScolaireServices() {
    }
    public  void AjouterEleve(Eleve e){
        this.nivscol.getEleves().add(e);
    }
    public void removeEleve(Eleve e){
        this.nivscol.getEleves().remove(e);

    }


}
