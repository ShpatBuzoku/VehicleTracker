-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: vehiclestracker
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Owner` varchar(45) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Vin` varchar(45) NOT NULL,
  `Registration` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (1,'Kalles Grustransporter AB ','Cementvägen 8, 111 11 Södertälje','YS2R4X20005399401','ABC123','DISCONNECTED'),(2,'Kalles Grustransporter AB','Cementvägen 8, 111 11 Södertälje','VLUR4X20009093588','DEF456','CONNECTED'),(3,'Kalles Grustransporter AB','Cementvägen 8, 111 11 Södertälje','VLUR4X20009048066','GHI789','CONNECTED'),(4,'Johans Bulk AB','Balkvägen 12, 222 22 Stockholm','YS2R4X20005388011','JKL012','DISCONNECTED'),(5,'Johans Bulk AB','Balkvägen 12, 222 22 Stockholm','YS2R4X20005387949','MNO345','CONNECTED'),(6,'Haralds Värdetransporter AB','Budgetvägen 1, 333 33 Uppsala','VLUR4X20009048066','PQR678','CONNECTED'),(7,'Haralds Värdetransporter AB','Budgetvägen 1, 333 33 Uppsala','YS2R4X20005387055','STU901','CONNECTED'),(8,'SHPAT','testtest','kfkf5656','mvjgi6767','DISCONNECTED');
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-12 19:08:24
