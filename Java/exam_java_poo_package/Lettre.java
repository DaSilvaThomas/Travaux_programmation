package exam_java_poo_package;

public class Lettre extends Objet {
    // Attribut spécifique de la classe fille Lettre
    private int nbLignes;

    // Construteur de la classe Objet auquel on rajoute l'attribut spécifique de la classe fille Lettre
    public Lettre(String nom, int nbLignes) {
        super(nom);
        this.nbLignes = nbLignes;
    }

    // Getters
    public void setNbLignes(int nbLignes) {
        this.nbLignes = nbLignes;
    }

    // Setters
    public int getNbLignes() {
        return this.nbLignes;
    }
}