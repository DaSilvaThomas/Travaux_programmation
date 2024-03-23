from Carte import Carte
from jeuDe52Cartes import jeuDe52Cartes

if __name__ == "__main__":
    
    # Création d'un jeu de carte
    jeuDeCarte = jeuDe52Cartes()

    # On affiche le jeu de carte
    print("\n Jeu de carte : \n")
    jeuDeCarte.afficherJeuCarte()

    # On mélange le jeu de carte
    jeuDeCarte.battreLeJeu()
    
    # On affiche le jeu de carte mélangé
    print("\n Jeu de carte mélangé : \n")
    jeuDeCarte.afficherJeuCarte()

    # On tire une carte aléatoirement
    carteTiré = jeuDeCarte.tirerCarte()
    print("\n Carte tiré aléatoirement dans le jeu de carte : \n")
    carteTiré.afficheCarte()
