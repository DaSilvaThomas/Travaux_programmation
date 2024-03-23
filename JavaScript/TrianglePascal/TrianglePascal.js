function Nombre() {
	
	// On récupère la valeur saisie dans l'input de type number (html) grâce à son id
	let n = document.getElementById("taille").value;
	
	// Pour convertir n de String à Interger
    n = parseInt(n);
	
	// On délimite les bornes du tableau (ligne, colonne) en fonction de l'indice n
    nbL = n + 1;
    nbC = n + nbL;   // ou (n*2 + 1)
	
	// Création du tableau de n+1 ligne par n*2+1 colonne
	let tab = Array.from(Array(nbL), () => new Array(nbC));

	// Remplissage (initialisation) du tableau par la valeur 0
	for(let i=0; i<nbL; i++){
		for(let j=0; j<nbC; j++){
			tab[i][j]=0;
		}
	}

	// Premier "1" à positionner ("graine")
    tab[0][n] = 1;
	
	// Remplissage du tableau avec les bonnes valeurs
	for (let i=1; i < nbL; i++){   // On incrémente i de 1 (la deuxième ligne) jusqu'à "ligne" (la dernière ligne)
		for (let j = n-i; j <= n+i; j=j+2){   // Les colonnes sont remplie d'une case sur deux de n-i à n+i
			if (j == 0){
				tab[i][j] = tab[i-1][j+1];   // Si on déborde à gauche du tableau
			}
			else if (j == nbC - 1){
				tab[i][j] = tab[i-1][j-1];   // Si on déborde à droite du tableau
			}
			else{ 
				tab[i][j] = tab[i-1][j-1] + tab[i-1][j+1];   // Si on ne déborde pas
			}
		}
	}
	
	// Création du triangle dans la page html
	let table = "<table>\n";
	for (let i=0; i < nbL; i++){
		table += "<tr>\n";
		for (let j=0; j < nbC; j++){
			if (tab[i][j] != 0){
				table += "<td id='colore'>" + tab[i][j] + "</td\n>";
			}
			else{
				table += "<td></td>\n";
			}
		}
		table += "</tr\n>";
	}
	table += "</table>";
	
	document.getElementById("triangle").innerHTML = table;
}