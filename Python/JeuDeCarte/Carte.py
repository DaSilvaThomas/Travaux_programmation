class Carte:
    # Attributs
    figure:str
    couleur:str

    # Constructeur
    def __init__(self, figure, couleur):
        self.figure = figure
        self.couleur = couleur

    # Getters
    def getFigure(self):
        return self.figure
    
    def getCouleur(self):
        return self.couleur

    # Setters
    def setFigure(self, figure):
        self.figure = figure
    
    def setCouleur(self, couleur):
        self.couleur = couleur

    # Méthode Affiche
    def afficheCarte(self):
        message:str = str("Carte (" + str(self.couleur) + " ; " + str(self.figure) + ")")
        print(message)
