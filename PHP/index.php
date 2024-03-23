<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Exercice_php</title>
        <style>
            table{
                font-family: Arial, Helvetica, sans-sherif;
                border-collapse: collapse;
                width: 100%;
            }
            tr, td, th{
                border: 2px solid gray;
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <h1>Exercice en php : Tableaux associatifs et fonctions</h1>
        <?php
            // Création du tableau
            $tab = array(
                $tab1 = array(
                    "nom" => "Thomas",
                    "prenom" => "Da Silva",
                    "Naissance" => "06/01/2001",
                    "Age" => ""
                ),
                $tab2 = array(
                    "nom" => "Jesus",
                    "prenom" => "Nazareth",
                    "Naissance" => "00/00/0000",
                    "Age" => ""
                ),
                $tab3 = array(
                    "nom" => "Bob",
                    "prenom" => "Marley",
                    "Naissance" => "06/02/1945",
                    "Age" => ""
                ),
            );

            // Fonction qui calcul la différence en année entre deux dates
            function age($date1, $date2 = ""){
                // Si pas de deuxième date, on ajoute la date courante
                if($date2 == ""){
                    $date2 = date("d/m/Y");
                }
                
                // Méthode explode pour séparer des chaînes de caractère
                $tab1 = explode("/", $date1);
                $tab2 = explode("/", $date2);

                // On récupère seulement l'année
                $annee1 = $tab1[2];
                $annee2 = $tab2[2];

                // On calcule la différence entre les deux années
                $diff = abs($annee1 - $annee2);   // abs() => valeur absolue
                return $diff;
            }

            // Affichage du tableau dans la page html
            echo "<table>";
            echo "<tr>";
            foreach($tab[0] as $key => $value){   //tab[0] ou tab[1] ou tab[2]
                echo "<th>$key</th>";
            }
            echo "</tr>";
            foreach($tab as $ligne){
                echo "<tr>";
                foreach($ligne as $key => $value){
                    if($key == "Naissance"){
                        $valueNaissance = $value;
                    }
                    if($key == "Age"){
                        $value = age($valueNaissance);
                    }
                    echo "<td>$value</td>";
                }
                echo "</tr>";
            }
            echo "</table>";
        ?>
    </body>
</html>