package exam_java_poo_package;

import java.util.ArrayList;

public class Sac {
    // Attributs de la classe Sac
    private int poids;
    private ArrayList<Objet> objet; // Le type de l'attribut objet est une liste

    // Constructeur de la classe Sac
    public Sac(int poids, ArrayList<Objet> objet) {
        this.poids = poids;
        this.objet = objet;
    }

    // Getters
    public int getPoids() {
        return this.poids;
    }
    public ArrayList<Objet> getObjet() {
        return this.objet;
    }

    // Setters
    public void setPoids(int poids) {
        this.poids = poids;
    }
    public void setObjet(ArrayList<Objet> objet) {
        this.objet = objet;
    }
}