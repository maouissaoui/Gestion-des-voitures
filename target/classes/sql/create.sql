CREATE DATABASE  IF NOT EXISTS `gestionlocation` ;
USE `gestionlocation`;
--
-- Table structure for table `user`
--

CREATE DATABASE  IF NOT EXISTS `gestionlocation` ;
USE `gestionlocationtest2`;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nomUser` varchar(255) NOT NULL,
  `prenomUser` varchar(255) NOT NULL,
  `cinUser` int(11) NOT NULL,
  `loginUser` varchar(255) NOT NULL,
  `passwordUser` varchar(255) NOT NULL,
  `adresseUser` varchar(255) NOT NULL,
  `telUser` int(11) NOT NULL,
  PRIMARY KEY (`idUser`)
);
--
-- Table structure for table `manager`
--

CREATE DATABASE  IF NOT EXISTS `gestionlocation` ;
USE `gestionlocationtest2`;
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `idManager` int(11) NOT NULL AUTO_INCREMENT,
  `nomManager` varchar(255) NOT NULL,
  `prenomManager` varchar(255) NOT NULL,
  `cinManager` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `permisconduit` varchar(255) NOT NULL,
  `ncartecredit` int(11) NOT NULL,
  PRIMARY KEY (`idManager`)
) ;


--
-- Table structure for table `voiture`
--


CREATE DATABASE  IF NOT EXISTS `gestionlocation` ;
USE `gestionlocationtest2`;
DROP TABLE IF EXISTS `voiture`;
CREATE TABLE `voiture` (
  `idVoiture` int(11) NOT NULL AUTO_INCREMENT,
  `matricule` varchar(255) NOT NULL,
  `modele` varchar(255) NOT NULL,
  `marque` varchar(255) NOT NULL,
  `constructeur` varchar(255) NOT NULL,
  `moteur` varchar(255) NOT NULL,
  `prix` double NOT NULL,
  `idManager` int(11) NOT NULL,
  PRIMARY KEY (`idVoiture`),
  KEY `FOREIGN_KEY1_idx` (`idManager`),
  CONSTRAINT `FOREIGN_KEY1` FOREIGN KEY (`idManager`) REFERENCES `manager` (`idManager`) ON DELETE CASCADE ON UPDATE CASCADE
);

--
-- Table structure for table `location`
--

CREATE DATABASE  IF NOT EXISTS `gestionlocation` ;
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `idLocaion` INT(11) NOT NULL AUTO_INCREMENT,
  `durée`  int(11) NOT NULL,
  `date` datetime NOT NULL,
   `idUser` int(11) NOT NULL, 
   `idVoiture` int(11) NOT NULL,
  PRIMARY KEY (`idLocaion`),
  INDEX `fk1_idx` (`idUser` ASC),
  INDEX `fk2_idx` (`idVoiture` ASC),
  CONSTRAINT `fk1`
    FOREIGN KEY (`idUser`)
    REFERENCES `gestionlocationtest`.`user` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk2`
    FOREIGN KEY (`idVoiture`)
    REFERENCES `gestionlocationtest`.`voiture` (`idVoiture`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



