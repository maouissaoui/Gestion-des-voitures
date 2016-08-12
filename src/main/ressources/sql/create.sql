CREATE DATABASE  IF NOT EXISTS `gestionlocation` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gestionlocation`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: gestionlocation
-- ------------------------------------------------------
-- Server version	5.6.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nomUser` varchar(255) NOT NULL,
  `prenomUser` datetime NOT NULL,
  `cinUser` int(11) NOT NULL,
  `loginUser` varchar(255) NOT NULL,
  `passwordUser` varchar(255) NOT NULL,
  `adresseUser` varchar(255) NOT NULL,
  `telUser` int(11) NOT NULL,

  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `manager` (
  `idManager` int(11) NOT NULL AUTO_INCREMENT,
  `nomManager` varchar(255) NOT NULL,
  `prenomManager` datetime NOT NULL,
  `cinManager` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `permisconduit` varchar(255) NOT NULL,
  `ncartecredit` int(11) NOT NULL,
  PRIMARY KEY (`idRessource`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Table structure for table `voiture`
--

DROP TABLE IF EXISTS `voiture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  CONSTRAINT `FOREIGN_KEY1` FOREIGN KEY (`idManager`) REFERENCES `manger` (`idManager`) ON DELETE CASCADE ON UPDATE CASCADE,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `idLocation` int(11) NOT NULL AUTO_INCREMENT,
  `durée`  int(11) NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`idLocation`),
 KEY `FOREIGN_KEY1_idx` (`idUser`),
  KEY `FOREIGN_KEY2_idx` (`idVoiture`),
  CONSTRAINT `FOREIGN_KEY1` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FOREIGN_KEY2` FOREIGN KEY (`idVoiture`) REFERENCES `voiture` (`idVoiture`) ON DELETE CASCADE ON UPDATE CASCADE,  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


