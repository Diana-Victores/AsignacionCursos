-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: bduniversidad
-- ------------------------------------------------------
-- Server version	8.0.27

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
CREATE DATABASE AsignacionCurso CHARACTER SET utf8mb4;
USE AsignacionCurso;
--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `idAlumno` int NOT NULL,
  `nombres` varchar(20) DEFAULT NULL,
  `Apellidos` varchar(20) DEFAULT NULL,
  `dpi` int DEFAULT NULL,
  `idDir` int DEFAULT NULL,
  `idCorreos` int DEFAULT NULL,
  `idTel` int DEFAULT NULL,
  PRIMARY KEY (`idAlumno`),
  KEY `idDir` (`idDir`),
  KEY `idCorreos` (`idCorreos`),
  KEY `idTel` (`idTel`),
  CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`idDir`) REFERENCES `direcciones` (`idDir`),
  CONSTRAINT `alumno_ibfk_2` FOREIGN KEY (`idCorreos`) REFERENCES `correos` (`idCorreo`),
  CONSTRAINT `alumno_ibfk_3` FOREIGN KEY (`idTel`) REFERENCES `telefonos` (`idTelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignacionalumno`
--

DROP TABLE IF EXISTS `asignacionalumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignacionalumno` (
  `idAsignacion` int NOT NULL,
  `idAlumno` int DEFAULT NULL,
  `idCurso` int DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`idAsignacion`),
  KEY `idAlumno` (`idAlumno`),
  KEY `idCurso` (`idCurso`),
  CONSTRAINT `asignacionalumno_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  CONSTRAINT `asignacionalumno_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `cursos` (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignacionalumno`
--

LOCK TABLES `asignacionalumno` WRITE;
/*!40000 ALTER TABLE `asignacionalumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `asignacionalumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asignacioncat`
--

DROP TABLE IF EXISTS `asignacioncat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignacioncat` (
  `idAsignacion` int NOT NULL,
  `idCat` int DEFAULT NULL,
  `idCurso` int DEFAULT NULL,
  PRIMARY KEY (`idAsignacion`),
  KEY `idCat` (`idCat`),
  KEY `idCurso` (`idCurso`),
  CONSTRAINT `asignacioncat_ibfk_1` FOREIGN KEY (`idCat`) REFERENCES `catedratico` (`idCat`),
  CONSTRAINT `asignacioncat_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `cursos` (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asignacioncat`
--

LOCK TABLES `asignacioncat` WRITE;
/*!40000 ALTER TABLE `asignacioncat` DISABLE KEYS */;
/*!40000 ALTER TABLE `asignacioncat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aulas`
--

DROP TABLE IF EXISTS `aulas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aulas` (
  `idAula` int NOT NULL,
  `nombreAula` varchar(20) DEFAULT NULL,
  `idEdificio` int DEFAULT NULL,
  PRIMARY KEY (`idAula`),
  KEY `idEdificio` (`idEdificio`),
  CONSTRAINT `aulas_ibfk_1` FOREIGN KEY (`idEdificio`) REFERENCES `edificio` (`idEdificio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aulas`
--

LOCK TABLES `aulas` WRITE;
/*!40000 ALTER TABLE `aulas` DISABLE KEYS */;
/*!40000 ALTER TABLE `aulas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carrera`
--

DROP TABLE IF EXISTS `carrera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carrera` (
  `idCarrera` int NOT NULL,
  `idJornada` int DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `idPensum` int DEFAULT NULL,
  PRIMARY KEY (`idCarrera`),
  KEY `idJornada` (`idJornada`),
  KEY `idPensum` (`idPensum`),
  CONSTRAINT `carrera_ibfk_1` FOREIGN KEY (`idJornada`) REFERENCES `jornada` (`idJornada`),
  CONSTRAINT `carrera_ibfk_2` FOREIGN KEY (`idPensum`) REFERENCES `pensum` (`idPensum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carrera`
--

LOCK TABLES `carrera` WRITE;
/*!40000 ALTER TABLE `carrera` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catedratico`
--

DROP TABLE IF EXISTS `catedratico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catedratico` (
  `idCat` int NOT NULL,
  `nombres` varchar(20) DEFAULT NULL,
  `apellidos` varchar(20) DEFAULT NULL,
  `dpi` int DEFAULT NULL,
  `idDir` int DEFAULT NULL,
  `idCorreo` int DEFAULT NULL,
  `idTel` int DEFAULT NULL,
  PRIMARY KEY (`idCat`),
  KEY `idDir` (`idDir`),
  KEY `idCorreo` (`idCorreo`),
  KEY `idTel` (`idTel`),
  CONSTRAINT `catedratico_ibfk_1` FOREIGN KEY (`idDir`) REFERENCES `direcciones` (`idDir`),
  CONSTRAINT `catedratico_ibfk_2` FOREIGN KEY (`idCorreo`) REFERENCES `correos` (`idCorreo`),
  CONSTRAINT `catedratico_ibfk_3` FOREIGN KEY (`idTel`) REFERENCES `telefonos` (`idTelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catedratico`
--

LOCK TABLES `catedratico` WRITE;
/*!40000 ALTER TABLE `catedratico` DISABLE KEYS */;
/*!40000 ALTER TABLE `catedratico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `correos`
--

DROP TABLE IF EXISTS `correos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `correos` (
  `idCorreo` int NOT NULL,
  `Correo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idCorreo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correos`
--

LOCK TABLES `correos` WRITE;
/*!40000 ALTER TABLE `correos` DISABLE KEYS */;
/*!40000 ALTER TABLE `correos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `idCurso` int NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `seccion` varchar(20) DEFAULT NULL,
  `idAula` int DEFAULT NULL,
  `prerequisito` int DEFAULT NULL,
  `idPensum` int DEFAULT NULL,
  `idHorario` int DEFAULT NULL,
  PRIMARY KEY (`idCurso`),
  KEY `idAula` (`idAula`),
  KEY `idPensum` (`idPensum`),
  KEY `idHorario` (`idHorario`),
  CONSTRAINT `cursos_ibfk_1` FOREIGN KEY (`idAula`) REFERENCES `aulas` (`idAula`),
  CONSTRAINT `cursos_ibfk_2` FOREIGN KEY (`idPensum`) REFERENCES `pensum` (`idPensum`),
  CONSTRAINT `cursos_ibfk_3` FOREIGN KEY (`idHorario`) REFERENCES `horarios` (`idHorario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direcciones`
--

DROP TABLE IF EXISTS `direcciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direcciones` (
  `idDir` int NOT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Departamento` varchar(15) DEFAULT NULL,
  `Municipio` varchar(15) DEFAULT NULL,
  `codPostal` int DEFAULT NULL,
  PRIMARY KEY (`idDir`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direcciones`
--

LOCK TABLES `direcciones` WRITE;
/*!40000 ALTER TABLE `direcciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `direcciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `edificio`
--

DROP TABLE IF EXISTS `edificio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `edificio` (
  `idEdificio` int NOT NULL,
  `nombreEdificio` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idEdificio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `edificio`
--

LOCK TABLES `edificio` WRITE;
/*!40000 ALTER TABLE `edificio` DISABLE KEYS */;
/*!40000 ALTER TABLE `edificio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facultades`
--

DROP TABLE IF EXISTS `facultades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facultades` (
  `idFacultad` int NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `idJornada` int DEFAULT NULL,
  `idCarrera` int DEFAULT NULL,
  `idPensum` int DEFAULT NULL,
  PRIMARY KEY (`idFacultad`),
  KEY `idJornada` (`idJornada`),
  KEY `idCarrera` (`idCarrera`),
  KEY `idPensum` (`idPensum`),
  CONSTRAINT `facultades_ibfk_1` FOREIGN KEY (`idJornada`) REFERENCES `jornada` (`idJornada`),
  CONSTRAINT `facultades_ibfk_2` FOREIGN KEY (`idCarrera`) REFERENCES `carrera` (`idCarrera`),
  CONSTRAINT `facultades_ibfk_3` FOREIGN KEY (`idPensum`) REFERENCES `pensum` (`idPensum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facultades`
--

LOCK TABLES `facultades` WRITE;
/*!40000 ALTER TABLE `facultades` DISABLE KEYS */;
/*!40000 ALTER TABLE `facultades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horarios`
--

DROP TABLE IF EXISTS `horarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horarios` (
  `idHorario` int NOT NULL,
  `idJornada` int DEFAULT NULL,
  `dia` varchar(10) DEFAULT NULL,
  `hora` time DEFAULT NULL,
  PRIMARY KEY (`idHorario`),
  KEY `idJornada` (`idJornada`),
  CONSTRAINT `horarios_ibfk_1` FOREIGN KEY (`idJornada`) REFERENCES `jornada` (`idJornada`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horarios`
--

LOCK TABLES `horarios` WRITE;
/*!40000 ALTER TABLE `horarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `horarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jornada`
--

DROP TABLE IF EXISTS `jornada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jornada` (
  `idJornada` int NOT NULL,
  `jornada` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idJornada`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jornada`
--

LOCK TABLES `jornada` WRITE;
/*!40000 ALTER TABLE `jornada` DISABLE KEYS */;
/*!40000 ALTER TABLE `jornada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratorios`
--

DROP TABLE IF EXISTS `laboratorios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laboratorios` (
  `idLab` int NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `idEdificio` int DEFAULT NULL,
  `idAula` int DEFAULT NULL,
  PRIMARY KEY (`idLab`),
  KEY `idEdificio` (`idEdificio`),
  KEY `idAula` (`idAula`),
  CONSTRAINT `laboratorios_ibfk_1` FOREIGN KEY (`idEdificio`) REFERENCES `edificio` (`idEdificio`),
  CONSTRAINT `laboratorios_ibfk_2` FOREIGN KEY (`idAula`) REFERENCES `aulas` (`idAula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratorios`
--

LOCK TABLES `laboratorios` WRITE;
/*!40000 ALTER TABLE `laboratorios` DISABLE KEYS */;
/*!40000 ALTER TABLE `laboratorios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pensum`
--

DROP TABLE IF EXISTS `pensum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pensum` (
  `idPensum` int NOT NULL,
  `año` int DEFAULT NULL,
  PRIMARY KEY (`idPensum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pensum`
--

LOCK TABLES `pensum` WRITE;
/*!40000 ALTER TABLE `pensum` DISABLE KEYS */;
/*!40000 ALTER TABLE `pensum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sede`
--

DROP TABLE IF EXISTS `sede`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sede` (
  `idSede` int NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `idEdificio` int DEFAULT NULL,
  PRIMARY KEY (`idSede`),
  KEY `idEdificio` (`idEdificio`),
  CONSTRAINT `sede_ibfk_1` FOREIGN KEY (`idEdificio`) REFERENCES `edificio` (`idEdificio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sede`
--

LOCK TABLES `sede` WRITE;
/*!40000 ALTER TABLE `sede` DISABLE KEYS */;
/*!40000 ALTER TABLE `sede` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonos`
--

DROP TABLE IF EXISTS `telefonos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonos` (
  `idTelefono` int NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idTelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonos`
--

LOCK TABLES `telefonos` WRITE;
/*!40000 ALTER TABLE `telefonos` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefonos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tesoreia`
--

DROP TABLE IF EXISTS `tesoreia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tesoreia` (
  `numBoleta` int NOT NULL AUTO_INCREMENT,
  `numtransaccion` int DEFAULT NULL,
  `codMovimiento` int NOT NULL,
  `total` int NOT NULL,
  `idEstudiante` int NOT NULL,
  PRIMARY KEY (`numBoleta`),
  KEY `idEstudiante` (`idEstudiante`),
  CONSTRAINT `tesoreia_ibfk_1` FOREIGN KEY (`idEstudiante`) REFERENCES `alumno` (`idAlumno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tesoreia`
--

LOCK TABLES `tesoreia` WRITE;
/*!40000 ALTER TABLE `tesoreia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tesoreia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-19 18:27:45
