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