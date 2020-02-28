-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: parkingproject
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `car` (
  `carid` int(11) NOT NULL AUTO_INCREMENT,
  `carNumber` varchar(40) DEFAULT NULL,
  `carColor` varchar(45) DEFAULT NULL,
  `slot` int(11) DEFAULT NULL,
  `entryDate` date DEFAULT NULL,
  `exitDate` date DEFAULT NULL,
  PRIMARY KEY (`carid`),
  KEY `fk_idx` (`slot`),
  CONSTRAINT `fk` FOREIGN KEY (`slot`) REFERENCES `slotdata` (`slot`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (6,'MH 45  hs 4585','blue',10,'2020-02-08','2020-02-06'),(8,'mh 15 kj 8585','black',1,'2020-02-14',NULL),(9,'mp 12 lk 4521','blue',5,'2020-02-14','2020-02-13'),(10,'go 45 na 5896','blue',2,'2020-02-13',NULL),(11,'mh 77 na 8888','blue',3,'2020-02-15','2020-02-13'),(12,'mp 77 na 8800','white',4,'2020-02-16',NULL);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `slotdata`
--

DROP TABLE IF EXISTS `slotdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `slotdata` (
  `slot` int(11) NOT NULL,
  `rate` int(11) DEFAULT NULL,
  `flag` tinyint(1) DEFAULT '0' COMMENT '0-empty 1-park ',
  PRIMARY KEY (`slot`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `slotdata`
--

LOCK TABLES `slotdata` WRITE;
/*!40000 ALTER TABLE `slotdata` DISABLE KEYS */;
INSERT INTO `slotdata` VALUES (1,200,1),(2,200,1),(3,200,0),(4,200,1),(5,200,0),(6,100,0),(7,100,0),(8,100,0),(9,100,0),(10,100,0),(11,100,0),(12,100,0),(13,100,0),(14,100,0),(15,100,0),(16,100,0),(17,100,0),(18,50,0),(19,50,0),(20,50,0);
/*!40000 ALTER TABLE `slotdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-28 16:03:16
