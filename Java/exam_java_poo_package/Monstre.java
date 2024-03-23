package exam_java_poo_package;

/*
 * IMPORTANT : Cette classe est une classe abstraite déjà développée. Elle sert de base à ses classes filles. 
 * Elle n'est pas à modifier.
 */

public abstract class Monstre {
    private int degatInflige;
    private int puissance;

    public Monstre(int degatInflige, int puissance) {
        this.degatInflige = degatInflige;
        this.puissance = puissance;
    }

    public int getDegatInflige() {
        return this.degatInflige;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int p) {
        this.puissance = p;
    }

    public void setDegatInflige(int di) {
        this.degatInflige = di;
    }
}