CREATE DATABASE  IF NOT EXISTS `db-cloud-school-spring-course1` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8_romanian_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db-cloud-school-spring-course1`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: db-cloud-school-spring-course1
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  `last_name` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  `first_name` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  `phone` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  `address` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  `city` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  `postal_code` varchar(15) COLLATE utf8_romanian_ci DEFAULT NULL,
  `country` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone_UNIQUE` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_romanian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'alinpopescu','Popescu','Alin','0745356543','Str. Mihai 53','București',NULL,'România'),(2,'mariusionescu','Ionescu','Marius','0789543214','Str. Florilor 15','București',NULL,'România'),(3,'alexiapopa','Popa','Alexia','0788963211','Str. Mihai Bravu 51','București','033092','România'),(4,'mariaionescu','Ionescu','Maria','0789663214','Str. Grigorescu 17','București','025392','România'),(5,'ancamarin','Marin','Anca','0789543564','Bd. Eroilor 57','București',NULL,'România'),(6,'alexpop','Pop','Alex','0788763214','Str. Traian 1','București','034392','România');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-27 22:41:20
