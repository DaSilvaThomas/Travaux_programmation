package exam_java_poo_package;
/*
 * IMPORTANT : Cette classe est une classe abstraite déjà développée. Elle sert de base à ses classes filles. 
 * Elle n'est pas à modifier.
 */

public abstract class Objet {
    String nom;

    public Objet(String n) {
        this.nom = n;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }
}