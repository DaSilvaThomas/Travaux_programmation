package exam_java_poo_package;

import java.util.ArrayList;

public class Humain extends Personnage implements ICombat {
    // Attributs spécifiques de la classe Humain
    private ArrayList<Arme> armes; // Le type de l'attribut armes est une liste
    private Arme armeCombat;
    private Sac sac;

    // Constructeur de la classe Humain
    public Humain(String nom, int x, int y, int vitesse, ArrayList<Arme> armes, Arme armeCombat, Sac sac) {
        super(nom, x, y, vitesse);
        this.armes = armes;
        this.armeCombat = armeCombat;
        this.sac = sac;
    }

    // Getters
    public ArrayList<Arme> getArmes() {
        return this.armes;
    }
    public Arme getArmeCombat() {
        return this.armeCombat;
    }
    public Sac getSac() {
        return this.sac;
    }

    // Setters
    public void setArmes(ArrayList<Arme> armes) {
        this.armes = armes;
    }
    public void setArmeCombat(Arme armeCombat) {
        this.armeCombat = armeCombat;
    }
    public void setSac(Sac sac) {
        this.sac = sac;
    }
    
    // Redéfinision de la méthode seDeplacer de la classe Personnage
    public void seDeplacer(int dx, int dy, int t) {
        super.seDeplacer(dx, dy, t); // Appelle la méthode seDeplacer de la classe Personnage
    }

    // Redéfinision de l'interface ICombat dans la classe Humain
    public void combattre(Monstre[] monstres) { // La méthode combattre prend en paramètre un tableau d'objets de la classe Monstre
        for (int i = 0; i < monstres.length; i++) {
            Monstre monstre = monstres[i]; // La variable monstre va prendre à chaque tour de boucle une valeur contenu dans le tableau monstres. 
    
            // Si la puissance de l'arme est inférieure ou égale à celle du monstre, le personnage perd des points de vie
            if (armeCombat.getPuissance() <= monstre.getPuissance()) {
                int nouveauPointsVie = getPointsVie() - monstre.getDegatInflige(); // Soustraction du nombre de point de vie du personnage par les dégâts infligés du mosntre
                setPointsVie(nouveauPointsVie); // On applique le changement à l'aide de la méthode setPointsVie
            }
        }

        // Affichage du nouveau nombre de point de vie
        System.out.println("Points de vie du personnage : " + getPointsVie());

        // On vérifie si le personnage est toujours en vie
        if (getPointsVie() <= 0) { // Si le nombre de points de vie du personnage est inférieur ou égal à 0
            System.out.println("Le personnage est mort." + "\n");
        }
        else {
            System.out.println("Le personnage est toujours en vie." + "\n");
        }
    }
}