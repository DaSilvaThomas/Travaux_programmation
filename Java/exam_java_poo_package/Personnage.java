package exam_java_poo_package;
/*
 * IMPORTANT : Cette classe est une classe abstraite déjà développée. Elle sert de base à ses classes filles. 
 * Elle n'est pas à modifier.
 */

public abstract class Personnage {
    private String nom;
    private int pointsVie;
    private int x;
    private int y;
    private int vitesse;

    public Personnage(String n, int x, int y, int v) {
        this.nom = n;
        this.x = x;
        this.y = y;
        this.pointsVie = 100;
        this.vitesse = v;
    }

    public int getPointsVie() {
        return this.pointsVie;
    }

    public void setPointsVie(int pv) {
        this.pointsVie = pv;
    }

    /** Le personnage se deplace dans la direction (dx,dy) durant un temps t (exprimé en seconde). */
    public void seDeplacer(int dx, int dy, int t) {
        this.x = (int) (this.x + dx * this.vitesse * t / Math.sqrt(dx * dx + dy * dy));
        this.y = (int) (this.y + dy * this.vitesse * t / Math.sqrt(dx * dx + dy * dy));
    }
}