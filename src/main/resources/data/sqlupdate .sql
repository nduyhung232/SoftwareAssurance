-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbclpm
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
-- Table structure for table `congviec`
--

DROP TABLE IF EXISTS `congviec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `congviec` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NguoiDongBHXH_CMT` int(11) DEFAULT NULL,
  `macongty` varchar(255) DEFAULT NULL,
  `tencongty` varchar(255) DEFAULT NULL,
  `diachi` varchar(255) DEFAULT NULL,
  `chucvu` varchar(255) DEFAULT NULL,
  `ngaybatdau` varchar(255) DEFAULT NULL,
  `ngayketthuc` varchar(255) DEFAULT NULL,
  `luong` double DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKCongViec785738` (`NguoiDongBHXH_CMT`),
  CONSTRAINT `FKCongViec785738` FOREIGN KEY (`NguoiDongBHXH_CMT`) REFERENCES `nguoidongbhxh` (`CMT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `congviec`
--

LOCK TABLES `congviec` WRITE;
/*!40000 ALTER TABLE `congviec` DISABLE KEYS */;
/*!40000 ALTER TABLE `congviec` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lichsudongbhxh`
--

DROP TABLE IF EXISTS `lichsudongbhxh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `lichsudongbhxh` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NguoiDongBHXH_CMT` int(11) DEFAULT NULL,
  `thang` int(11) DEFAULT NULL,
  `nam` int(11) DEFAULT NULL,
  `sotienphaidong` double DEFAULT NULL,
  `ngaydongtien` varchar(255) DEFAULT NULL,
  `trangthai` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKLichSuDong85676` (`NguoiDongBHXH_CMT`),
  CONSTRAINT `FKLichSuDong85676` FOREIGN KEY (`NguoiDongBHXH_CMT`) REFERENCES `nguoidongbhxh` (`CMT`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lichsudongbhxh`
--

LOCK TABLES `lichsudongbhxh` WRITE;
/*!40000 ALTER TABLE `lichsudongbhxh` DISABLE KEYS */;
INSERT INTO `lichsudongbhxh` VALUES (1,123456,1,2019,500000,'1-1-2019','true');
/*!40000 ALTER TABLE `lichsudongbhxh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mucdongbhxh`
--

DROP TABLE IF EXISTS `mucdongbhxh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mucdongbhxh` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `mamucdong` varchar(255) DEFAULT NULL,
  `mota` varchar(255) DEFAULT NULL,
  `huutri_tutuat` double DEFAULT NULL,
  `tainanLD_nghenghiep` double DEFAULT NULL,
  `omdau_thaisan` double DEFAULT NULL,
  `yte` double DEFAULT NULL,
  `ngaybatdau` varchar(255) DEFAULT NULL,
  `trangthai` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mucdongbhxh`
--

LOCK TABLES `mucdongbhxh` WRITE;
/*!40000 ALTER TABLE `mucdongbhxh` DISABLE KEYS */;
/*!40000 ALTER TABLE `mucdongbhxh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoidongbhxh`
--

DROP TABLE IF EXISTS `nguoidongbhxh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nguoidongbhxh` (
  `CMT` int(11) NOT NULL,
  `hoten` varchar(255) DEFAULT NULL,
  `ngaysinh` varchar(255) DEFAULT NULL,
  `gioitinh` varchar(255) DEFAULT NULL,
  `quequan` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `dienthoai` varchar(255) DEFAULT NULL,
  `ngaythamgia` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CMT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoidongbhxh`
--

LOCK TABLES `nguoidongbhxh` WRITE;
/*!40000 ALTER TABLE `nguoidongbhxh` DISABLE KEYS */;
INSERT INTO `nguoidongbhxh` VALUES (123456,'abc','2019-04-01','nam','hanoi','adas@gmail.com','0123456789',NULL);
/*!40000 ALTER TABLE `nguoidongbhxh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoidongbhxh_mucdongbhxh`
--

DROP TABLE IF EXISTS `nguoidongbhxh_mucdongbhxh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nguoidongbhxh_mucdongbhxh` (
  `NguoiDongBHXHCMT` int(11) NOT NULL,
  `MucDongBHXHID` int(11) NOT NULL,
  PRIMARY KEY (`NguoiDongBHXHCMT`,`MucDongBHXHID`),
  KEY `FKNguoiDongB651728` (`MucDongBHXHID`),
  CONSTRAINT `FKNguoiDongB519213` FOREIGN KEY (`NguoiDongBHXHCMT`) REFERENCES `nguoidongbhxh` (`CMT`),
  CONSTRAINT `FKNguoiDongB651728` FOREIGN KEY (`MucDongBHXHID`) REFERENCES `mucdongbhxh` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoidongbhxh_mucdongbhxh`
--

LOCK TABLES `nguoidongbhxh_mucdongbhxh` WRITE;
/*!40000 ALTER TABLE `nguoidongbhxh_mucdongbhxh` DISABLE KEYS */;
/*!40000 ALTER TABLE `nguoidongbhxh_mucdongbhxh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoidongbhxh_vung`
--

DROP TABLE IF EXISTS `nguoidongbhxh_vung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nguoidongbhxh_vung` (
  `NguoiDongBHXHCMT` varchar(255) NOT NULL,
  `VungID` int(11) NOT NULL,
  PRIMARY KEY (`NguoiDongBHXHCMT`,`VungID`),
  KEY `FKNguoiDongB941047` (`VungID`),
  CONSTRAINT `FKNguoiDongB941047` FOREIGN KEY (`VungID`) REFERENCES `vung` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoidongbhxh_vung`
--

LOCK TABLES `nguoidongbhxh_vung` WRITE;
/*!40000 ALTER TABLE `nguoidongbhxh_vung` DISABLE KEYS */;
/*!40000 ALTER TABLE `nguoidongbhxh_vung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vung`
--

DROP TABLE IF EXISTS `vung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vung` (
  `ID` int(11) NOT NULL,
  `mavung` varchar(255) DEFAULT NULL,
  `xa_phuong` varchar(255) DEFAULT NULL,
  `quan_huyen` varchar(255) DEFAULT NULL,
  `tinh_tp` varchar(255) DEFAULT NULL,
  `khuvuc` int(10) DEFAULT NULL,
  `sotienduocdongbh` double DEFAULT NULL,
  `vuotmucdongbh` int(10) DEFAULT NULL,
  `ngaybatdau` varchar(255) DEFAULT NULL,
  `trangthai` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vung`
--

LOCK TABLES `vung` WRITE;
/*!40000 ALTER TABLE `vung` DISABLE KEYS */;
/*!40000 ALTER TABLE `vung` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-05  0:41:11
