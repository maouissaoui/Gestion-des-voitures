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