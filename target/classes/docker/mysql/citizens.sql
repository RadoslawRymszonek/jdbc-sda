/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`citizens` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `citizens`;

DROP TABLE IF EXISTS `persons`;

CREATE TABLE `persons` (
  `personId` int(11) NOT NULL,
  `personName` varchar(50) NOT NULL,
  `addressLine1` varchar(50) NOT NULL DEFAULT '',
  `addressLine2` varchar(50) NOT NULL DEFAULT '',
  `city` varchar(50) NOT NULL DEFAULT '',
  `postalCode` varchar(15) NOT NULL DEFAULT '',
  `country` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

insert into `persons`(`personId`, `personName`, `addressLine1`, `addressLine2`, `city`, `postalCode`, `country` ) values
(22, 'Jan Dlugi', 'Kopytkowo 1', null, 'Kozigrod', '64-273', 'Polska'),
(76, 'Tomek Maly', 'Bronowice 135', null, 'Rolniki', '78-234', 'Polska'),
(234534, 'Robert Maloreki', 'Bronowice Kolonia', 'ul. Boczna 3', 'Kozigrod', '64-273', 'Polska');

DROP TABLE IF EXISTS `phones`;

CREATE TABLE `phones` (
  `phoneId` int(11) NOT NULL,
  `manufacturedDate` date NOT NULL,
  `number` int(15) NOT NULL,
  `model` varchar (10) NOT NULL,
  `personId` int(11) not null,
  PRIMARY KEY (`phoneId`),
  KEY `personId` (`personId`),
  CONSTRAINT `personId_fk` FOREIGN KEY (`personId`) REFERENCES `persons` (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


insert into `phones` (`phoneId`, `manufacturedDate`, `number`, `model`, `personId`) values 
(7493, '2003-01-06', 123456789,'XC32', 22),
(3455, '2013-10-23', 897834589,'DH90', 22),
(8974, '2013-11-16', 187435212,'PP3', 22),
(9430, '2000-01-09', 999999999,'II2', 234534),
(4367, '2019-03-15', 333333333,'PP3', 234534);