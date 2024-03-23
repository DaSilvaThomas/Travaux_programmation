-- ############### Création de table ################

-- Création d'une table 'Employe' avec 4 colonnes
create table Employe
(
    NSS char(15),
    Nom varchar(15),
    Prenom varchar(15),
    Salaire integer,
);

-- Ajouter une nouvelle colonne 'Naissance' de type 'date'
alter table Employe add column Naissance date;

-- Ajouter les propriétés 'not null' et 'default 1150' aux attributs
alter table Employe
alter column NSS set not null,
alter column Nom set not null,
alter column Prenom set not null,
alter column Salaire set default 1150;

-- Ajouter une clé primaire
alter table Employe add primary key(NSS);

-- Ajouter une clé unique 'cle_candidate'
alter table Employe 
add constraint cle_candidate unique(nom, prenom);

-- Création d'une table 'Theatre' avec une clé unique
create table Theatre
(
    Nom varchar(15) primary key,
    -- Clé unique 'Telephone'
    Telephone varchar(15) unique,
    Ville varchar(40) not null
);

-- Création d'une table 'Travail' avec des clés étrangères
create table Travail
(
    idTheatre varchar(15) not null,
    idEmploye char(15) not null,
    role varchar(15) not null,
    primary key(idTheatre, idEmploye),
    -- Clé étrangères des tables 'Theatre' et 'Employe'
    foreign key(idTheatre) references Theatre(Nom)
        -- Option de Cascade
        on update cascade
        -- Option de Suppression 
        on delete no action,
    foreign key(idEmploye) references Employe(NSS)
        on update cascade
        on delete no action
);

-- ############### Insertion de données dans des tables ################

-- Insertion de valeurs pour la table 'Employe'
insert into Employe
values ('12854', 'Martin', 'Alice', 2650),
('12855', 'Martin', 'Luc', 2300),
('12856', 'Lopez', 'Maria', 1890);

-- Autre exemple d'insertion de valeurs dans la table 'Employe'
insert into Employe(NSS, Nom, Prenom)
-- Utilise la valeur par défaut pour la colonne Salaire
values ('12853', 'Dubois', 'François');

-- Insertion de valeurs dans la table 'Theatre'
insert into Theatre
values ('Odeon', '0623475749', 'Paris'),
('Comedie', '0612345677', 'Lyon'),
('Arenes', '0672859391', 'Paris');

-- Insertion de valeurs de la table 'Travail'
insert into Travail
values ('Odeon', '12853', 'Lumieres'),
('Comedie', '12855', 'Scene'),
('Arenes', '12854', 'Costumes'),
('Odeon', '12856', 'Scene');


-- ############# Requête SQL ##############

-- Sélection de toute la table 'Theatre'
Select * 
from Theatre

-- Sélection des colonnes 'Nom' et 'Ville' de la table 'Theatre'
select Nom, Ville 
from Theatre;

-- Sélection et afficher deux fois la colonnes 'Nom' de la table 'Theatre'
select Nom, Nom 
from Theatre;

-- Clause distinct : Cette clause permet de supprimer les doublons
select distinct Ville 
from Theatre;

-- Sélectionner les 'Nom' de théatre qui sont dans la ville de 'Paris'
select Nom 
from Theatre 
where Ville = 'Paris';

-- Ajouter 3 lignes supplémentaire à la table 'Employe'
insert into Employe
values ('1123', 'Anzalone', 'Salvatore', 2200, '09/11/1982'),
('2125', 'Dupont', 'Marie', 1700, '11/02/1981'),
('2516', 'Najar', 'Anis', 3100, '25/07/1983');

-- Ajouter une date de naissance aux employés
update Employe
set Naissance = '08/09/1980'
where Nss = '12853'

update Employe
set Naissance = '02/04/1975'
where Nss = '12854'

update Employe
set Naissance = '17/07/1974'
where Nss = '12855'

update Employe
set Naissance = '30/08/1987'
where Nss = '12856'

-- Sélection du nom et prénom des employés avec un salaire supérieure à 2000 €
select Nom, Prenom
from Employe
where Salaire > 2000;

-- Sélection du nom et prénom des employés nés après le 15/03/1983
select Nom, Prenom
from Employe
where Naissance > '1983-03-15';

-- Sélection du nom et prénom des employés dont le nom se termine par ‘e’ et avec un salaire inférieur à 3000 €
select Nom, Prenom
from Employe
where (Salaire < 3000) and (Nom like '%e');

-- Sélection du nss et du salaire annuel des employés dont le nom commence par ‘A’ et avec un salaire inférieur à 3000 €
-- 'as' permet de modifier le nom de la sélection, içi le nss et le salaire
-- '* 12' on multiplie par 12 pour obtenir le salaire annuel
select Nss as Numéro_de_sécurité_social, 
Salaire * 12 as Salaire_annuel
from Employe
where (Salaire < 3000) and (Nom like 'A%')

-- Suppression de la ligne correspondant à monsieur 'Dubois' dans la table 'Employe'
DELETE FROM Employe
WHERE Nom = 'Dubois';

-- Modification du salaire de Anzalone dans la table 'Employe'
UPDATE Employe
SET Salaire = Salaire * 1.1
WHERE NSS = '1123';

-- Modification du salaire des employés dont le salaire est inférieur à 2000
UPDATE Employe
SET Salaire = Salaire * 1.1
WHERE Salaire < 2000;