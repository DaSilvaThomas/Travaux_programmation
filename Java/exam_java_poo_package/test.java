package exam_java_poo_package;

import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        
        // Création des armes pour Ellie
        Arme revolver = new Arme("Revolver", 15);
        Arme arc = new Arme("Arc", 50);
        Arme fusilPompe = new Arme("Fusil à pompe", 80);

        // Création des armes pour Abby
        Arme lanceFlamme = new Arme("Lance-flamme", 30);
        Arme fusilAssaut = new Arme("Fusil d'assaut", 90);

        // Création de la liste d'armes pour Ellie
        ArrayList<Arme> armesEllie = new ArrayList<>();
        armesEllie.add(revolver);
        armesEllie.add(arc);
        armesEllie.add(fusilPompe);

        // Création de la liste d'armes pour Abby
        ArrayList<Arme> armesAbby = new ArrayList<>();
        armesAbby.add(lanceFlamme);
        armesAbby.add(fusilAssaut);

        // Création des objets pour Ellie
        TrousseUrgence TrousseA = new TrousseUrgence("Trousse d'urgence");

        // Création des objets pour Abby
        TrousseUrgence TrousseB = new TrousseUrgence("Trousse d'urgence");
        Lettre lettreAbby = new Lettre("Lettre", 30);

        // Création de la liste d'objets pour Ellie
        ArrayList<Objet> objetsEllie = new ArrayList<>();
        objetsEllie.add(TrousseA);
        
        // Création de la liste d'objets pour Abby
        ArrayList<Objet> objetsAbby = new ArrayList<>();
        objetsAbby.add(TrousseB);
        objetsAbby.add(lettreAbby);

        // Création du sac pour Ellie
        Sac sacEllie = new Sac(5, objetsEllie);

        // Création du sac pour Abby
        Sac sacAbby = new Sac(3, objetsAbby);

        // Création des personnages Ellie et Abby (la vitesse de déplacement des deux personnages est arbitraire)
        Humain Ellie = new Humain("Ellie", 100, 200, 7, armesEllie, arc, sacEllie);
        Humain Abby = new Humain("Abby", 50, 100, 5, armesAbby, lanceFlamme, sacAbby);

        // Attribution des points de vie pour Ellie et Abby
        Ellie.setPointsVie(100);
        Abby.setPointsVie(100);

        // Déplacement des personnages
        Ellie.seDeplacer(50, 50, 5);
        Abby.seDeplacer(10, 10, 2);
        
        // Création des différents Monstres
        Coureurs coureur1 = new Coureurs(10, 5);
        Coureurs coureur2 = new Coureurs(10, 5);
        Coureurs coureur3 = new Coureurs(10, 5);
        
        Rodeurs rodeur1 = new Rodeurs(20, 30);
        Rodeurs rodeur2 = new Rodeurs(20, 30);
        Rodeurs rodeur3 = new Rodeurs(20, 30);

        Colosses colosse1 = new Colosses(40, 80);

        // Ellie combat les deux Coureurs avec un arc (arme de combat actuel)
        System.out.println("Combat entre Ellie avec un arc et 2 Coureurs :");
        Monstre[] EllieVsCoureurs = {coureur1, coureur2};
        Ellie.combattre(EllieVsCoureurs);

        // Ellie combat le Rodeur avec un fusil à pompe
        System.out.println("Combat entre Ellie avec un fusil à pompe et 1 Rodeur :");
        Ellie.setArmeCombat(fusilPompe); // On change l'arme de combat pour Ellie
        Monstre[] EllieVsRodeurs = {rodeur1};
        Ellie.combattre(EllieVsRodeurs);

        // Abby combat le Coureur avec un lance-flamme
        System.out.println("Combat entre Abby avec un fusil à pompe et 1 Coureur :");
        Monstre[] AbbyVsCoureurs = {coureur3};
        Abby.combattre(AbbyVsCoureurs);

        // Abby combat les deux Rodeurs et le Colosse avec un fusil d'assault
        System.out.println("Combat entre Abby avec un fusil d'assault et 2 Rodeurs et 1 Colosse :");
        Abby.setArmeCombat(fusilAssaut); // On change l'arme de combat pour Abby
        Monstre[] AbbyVsRodeursEtColosse = {rodeur2, rodeur3, colosse1};
        Abby.combattre(AbbyVsRodeursEtColosse);
    }
}