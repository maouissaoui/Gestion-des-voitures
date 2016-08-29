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