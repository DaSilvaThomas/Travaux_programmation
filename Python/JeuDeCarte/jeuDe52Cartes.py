from random import randint, shuffle, seed
from Carte import Carte

class jeuDe52Cartes:
    # Attributs
    listeFigure:str = []
    listeCouleur:str = []
    jeuCartes:Carte = []

    # Constructeur
    def __init__(self):
        self.listeFigure = [2, 3, 4, 5, 6, 7, 8, 9, 10, "valet", "dame", "roi", "as"]
        self.listeCouleur = ["coeur", "carreau", "trèfle", "pique"]

        # Création d'un jeu de 52 cartes
        for i in range(0, len(self.listeCouleur)):
            for j in range(0, len(self.listeFigure)):
                nouvelleCarte:Carte = Carte(self.listeCouleur[i], self.listeFigure[j])
                self.jeuCartes.append(nouvelleCarte)
            
    # Méthode : Mélanger le jeu de carte
    def battreLeJeu(self) -> None:
        seed(4523)   # Le jeu de carte mélangé sera toujours le même
        shuffle(self.jeuCartes)

    # Méthode : tirer une carte aléatoirement dans le jeu de carte
    def tirerCarte(self) -> Carte:
        nombreAleatoire:int = randint(0, 52)
        carteAleatoire:Carte = self.jeuCartes[nombreAleatoire]
        return carteAleatoire
    
    # Méthode : Afficher le jeu de carte complet
    def afficherJeuCarte(self):
        cpt:int = 1
        for carte in self.jeuCartes:
            message:str = str("Carte " + str(cpt) + " (" + str(carte.couleur) + " ; " + str(carte.figure) + ")")
            print(message)
            cpt = cpt + 1
