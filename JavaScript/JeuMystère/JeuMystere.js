// Création du tableau avec toutes les lettres de l'alphabet
let tabL = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"];

// Création du tableau avec les nombres allant de 1 à 26
let tabN = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26];

// Fonction qui renvoi un nombre aléatoire entre -0.5 et 0.5 avec Math.random()
function triAleatoire(){
    return Math.random() - 0.5;
}

// Méthode sort() qui appel la fonction triAleatoire() pour trier le tableau de nombre
tabN.sort(triAleatoire);

// La méthode sort() compare deux valeurs du tableau à la fois, à chaque nouvelle comparaison, la fonction triAleatoire() est appelé et une nouvelle valeur aléatoire entre -0.5 et 0.5 est généré,
// Si la valeur renvoyer par la fonction triAleatoire() est positif (ex : 0.3), alors la méthode sort() change de place les valeurs comparées,
// Si la valeur renvoyer par la fonction triAleatoire() est négatif (ex : -0.2), alors la méthode sort() ne change pas les valeurs comparées,

// Création d'un tableau associatif avec comme clé les lettres et comme valeurs les nombres
let tabA = {};
for(let i=0; i<tabN.length; i++){
    tabA[tabL[i]] = tabN[i];   // Ajout d'une clé (lettre) d'un nombre (valeur) à chaque itération
}
console.log(tabA);
// Affichage du tableau dans la page html
let grosseChaine = "<table> \n <tr> \n";

for(let i=0; i<tabN.length; i++){
    grosseChaine += "<td>" + tabN[i] + "</td>\n";
}

grosseChaine += "</tr> \n <tr> \n";

for(let i=0; i<tabL.length; i++){
    grosseChaine += "<td>" + tabL[i] + "</td>\n";
}

grosseChaine += "</tr> \n </table>";

document.getElementById("tableau").innerHTML = grosseChaine;

// Création du code à chiffre à partir du mot secret
function Code(mot){
    // Séparation des lettres du mot secret et stockage dans un tableau
    let tabMot = mot.split('');

    //
    let lettre = "";
    //let exp = /[A-Z]/;
    let codeSecret = "Code secret : ";
    for(lettre of tabMot){
        // Gestion des erreurs
        if(!(/[A-Z]/.test(lettre))){   // On utilise une expression régulière et la méthode test()
            let messageErreur = "Vous devez saisir un mot en lettre majuscule sans espace. Exemple : HELLO";
            document.getElementById("resultat").innerHTML = messageErreur;
            break;   // Pour quitter la boucle
        }
        // Création et affichage du code correspondant au mot secret dans la page html
        else{
            codeSecret += tabA[lettre] + " ";   // tabA[lettre] renvoi la valeur associé à la clé (lettre)
        }
        document.getElementById("resultat").innerHTML = codeSecret;
    }
}