-- inserer des valeurs dans la table user
INSERT INTO `gestionlocation3`.`user`( `nomUser`, `prenomUser`, `cinUser`, `loginUser`, `passwordUser`,`adresseUser`,`telUser`)VALUES ( 'AB', 'Haroun', '1187452', 'logg1', 'password1', 'adresse1','0752626485');
INSERT INTO `gestionlocation3`.`user`( `nomUser`, `prenomUser`, `cinUser`, `loginUser`, `passwordUser`,`adresseUser`,`telUser`)VALUES ( 'AC', 'h', '51516', 'logg2', 'password2', 'adresse2','8754278');
INSERT INTO `gestionlocation3`.`user`(`nomUser`, `prenomUser`, `cinUser`, `loginUser`, `passwordUser`,`adresseUser`,`telUser`)VALUES ( 'A', 'med', '54252', 'logg3', 'password3', 'adresse3','15151541');

commit;

-- inserer des valeurs dans la table projet
INSERT INTO `gestionlocation3`.`manager`( `nomManager`, `prenomManager`, `cinManager`, `login`, `password`, `permisconduit`,`ncartecredit`)VALUES ( 'AOUISSAOUI', 'Moufida', '07548215', 'log1', 'pass1','permis1','074566');

INSERT INTO `gestionlocation3`.`manager`( `nomManager`, `prenomManager`, `cinManager`, `login`, `password`, `permisconduit`,`ncartecredit`)VALUES ( 'A', 'Nadia', '516512', 'log2', 'pass2','permis2','254545');

INSERT INTO `gestionlocation3`.`manager`( `nomManager`, `prenomManager`, `cinManager`, `login`, `password`, `permisconduit`,`ncartecredit`)VALUES ( 'Issaoui', 'Fatma', '16515313', 'log3', 'pass3','permis3','57435');
commit;


-- inserer des valeurs dans la table voiture
INSERT INTO `gestionlocation3`.`voiture` ( `matricule`, `modele`, `marque`,`constructeur`, `moteur`,`prix`,`idManager`)VALUES ( 'mat1', 'mod1', 'marque1','const1','moteur1','5462','2');
INSERT INTO `gestionlocation3`.`voiture` ( `matricule`, `modele`, `marque`,`constructeur`, `moteur`,`prix`,`idManager`)VALUES ( 'mat2', 'mod2', 'marque2','const2','moteur2','5462','3');
INSERT INTO `gestionlocation3`.`voiture` ( `matricule`, `modele`, `marque`,`constructeur`, `moteur`,`prix`,`idManager`)VALUES ( 'mat3', 'mod3', 'marque3','const3','moteur3','46163','1');

commit;
-- inserer des valeurs dans la table location

INSERT INTO `gestionlocation3`.`location` ( `durée`, `date`, `idUser`, `idVoiture`) VALUES ( '424', '2016-08-12 14:43:34', '1', '1');
INSERT INTO `gestionlocation3`.`location` ( `durée`, `date`, `idUser`, `idVoiture`) VALUES ( '455', '2016-08-12 14:43:34', '1', '2');
INSERT INTO `gestionlocation3`.`location` ( `durée`, `date`, `idUser`, `idVoiture`) VALUES ( '454', '2016-08-12 14:43:34', '1', '2');

commit;


