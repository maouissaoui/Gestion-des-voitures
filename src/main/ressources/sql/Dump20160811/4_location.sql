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
    REFERENCES `gestionlocation`.`user` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk2`
    FOREIGN KEY (`idVoiture`)
    REFERENCES `gestionlocation`.`voiture` (`idVoiture`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
