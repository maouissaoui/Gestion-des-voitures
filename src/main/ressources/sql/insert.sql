
-- inserer des valeurs dans la table user
INSERT INTO `gestionlocation`.`user`(`idUser`, `nomUser`, `prenomUser`, `cinUser`, `loginUser`, `passwordUser`,`adresseUser`,`telUser`)VALUES ('1', 'AB', 'Haroun', '1187452', 'logg1', 'password1', 'adresse1','0752626485');
INSERT INTO `gestionlocation`.`user`(`idUser`, `nomUser`, `prenomUser`, `cinUser`, `loginUser`, `passwordUser`,`adresseUser`,`telUser`)VALUES ('2', 'AC', 'h', '51516', 'logg2', 'password2', 'adresse2','8754278');
INSERT INTO `gestionlocation`.`user`(`idUser`, `nomUser`, `prenomUser`, `cinUser`, `loginUser`, `passwordUser`,`adresseUser`,`telUser`)VALUES ('3', 'A', 'med', '54252', 'logg3', 'password3', 'adresse3','15151541');

commit;

-- inserer des valeurs dans la table projet
INSERT INTO `gestionlocation`.`manager`
(`idManager`, `nomManager`, `prenomManager`, `cinManager`, `login`, `password`, `permisconduit`,`ncartecredit`)
VALUES ('1', 'AOUISSAOUI', 'Moufida', '07548215', 'log1', 'pass1','permis1','074566');

INSERT INTO `gestionlocation`.`manager`
(`idManager`, `nomManager`, `prenomManager`, `cinManager`, `login`, `password`, `permisconduit`,`ncartecredit`)
VALUES ('2', 'A', 'Nadia', '516512', 'log2', 'pass2','permis2','254545');

INSERT INTO `gestionlocation`.`manager`
(`idManager`, `nomManager`, `prenomManager`, `cinManager`, `login`, `password`, `permisconduit`,`ncartecredit`)
VALUES ('3', 'Issaoui', 'Fatma', '16515313', 'log3', 'pass3','permis3','57435');
commit;


-- inserer des valeurs dans la table voiture
INSERT INTO `gestionlocation`.`voiture` (`idVoiture`, `matricule`, `modele`, `marque`,`constructeur`, `moteur`,`prix`,`idManager`)VALUES ('1', 'mat1', 'mod1', 'marque1','const1','moteur1','5462','2');
INSERT INTO `gestionlocation`.`voiture` (`idVoiture`, `matricule`, `modele`, `marque`,`constructeur`, `moteur`,`prix`,`idManager`)VALUES ('2', 'mat2', 'mod2', 'marque2','const2','moteur2','5462','3');
INSERT INTO `gestionlocation`.`voiture` (`idVoiture`, `matricule`, `modele`, `marque`,`constructeur`, `moteur`,`prix`,`idManager`)VALUES ('3', 'mat3', 'mod3', 'marque3','const3','moteur3','46163','1');

commit;
-- inserer des valeurs dans la table locaion
INSERT INTO `gestionlocation`.`locaion` (`idLocation`, `durée`, `date`, `idUser`,'idVoiture') VALUES ('1', '5', '22-08-2016', '2','3');
INSERT INTO `gestionlocation`.`locaion` (`idLocation`, `durée`, `date`, `idUser`,'idVoiture') VALUES ('2', '8', '25-08-2016', '1','2');
INSERT INTO `gestionlocation`.`locaion` (`idLocation`, `durée`, `date`, `idUser`,'idVoiture') VALUES ('3', '4', '13-08-2016', '3','1');

commit;


