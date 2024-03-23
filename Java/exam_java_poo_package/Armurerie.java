package exam_java_poo_package;

/*
 * IMPORTANT : Cette classe est une classe abstraite déjà développée. Elle sert de base à ses classes filles. 
 * Elle n'est pas à modifier.
 */

public abstract class Armurerie {
    private String nom;
    private int puissance;

    public Armurerie(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int p) {
        this.puissance = p;
    }
}