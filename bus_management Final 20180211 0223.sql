-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bus_management
--

CREATE DATABASE IF NOT EXISTS bus_management;
USE bus_management;

--
-- Definition of table `add_booking`
--

DROP TABLE IF EXISTS `add_booking`;
CREATE TABLE `add_booking` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `bus_no` varchar(45) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `passenger_name` varchar(45) NOT NULL,
  `contact_no` varchar(45) NOT NULL,
  `departure_date` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_booking`
--

/*!40000 ALTER TABLE `add_booking` DISABLE KEYS */;
INSERT INTO `add_booking` (`id`,`bus_no`,`seat_no`,`passenger_name`,`contact_no`,`departure_date`) VALUES 
 (1,'A1',1,'Mohsin','01956285246','2018-02-10'),
 (2,'A1',2,'Abid','01965852450','2018-02-10'),
 (3,'B1',1,'Jalal','01689562346','2018-02-10'),
 (4,'B1',2,'Younus','01785654215','2018-02-10'),
 (5,'B2',1,'Jakir','01986452518','2018-02-10'),
 (6,'A2',1,'Kabir','01985245625','2018-02-10'),
 (7,'C1',1,'Rakib','01685462580','2018-02-10'),
 (8,'A1',3,'Mannan','01985465581','2018-02-10'),
 (9,'A2',2,'Jahid','01958475225','2018-02-10'),
 (10,'C2',1,'Abir','01985454455','2018-02-10');
/*!40000 ALTER TABLE `add_booking` ENABLE KEYS */;


--
-- Definition of table `bus_details`
--

DROP TABLE IF EXISTS `bus_details`;
CREATE TABLE `bus_details` (
  `bid` int(10) unsigned NOT NULL auto_increment,
  `bus_no` varchar(45) NOT NULL,
  `source` varchar(45) NOT NULL,
  `destination` varchar(45) NOT NULL,
  `total_seat` varchar(45) NOT NULL,
  `available_seat` int(11) NOT NULL default '0',
  `booked_seat` int(11) default NULL,
  `updated_date` date default NULL,
  `bus_time` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_details`
--

/*!40000 ALTER TABLE `bus_details` DISABLE KEYS */;
INSERT INTO `bus_details` (`bid`,`bus_no`,`source`,`destination`,`total_seat`,`available_seat`,`booked_seat`,`updated_date`,`bus_time`) VALUES 
 (1,'A1','Dhaka','Khulna','50',47,3,'2018-02-10','11:00 AM'),
 (2,'A2','Dhaka','Jessor','50',48,2,'2018-02-10','11:00 AM'),
 (3,'B1','Khulna','Dhaka','50',48,2,'2018-02-10','11:00 AM'),
 (4,'B2','Jessor','Dhaka','50',49,1,'2018-02-10','11:00 AM'),
 (5,'C1','Dhaka','Rajshahi','55',55,0,'2018-02-10','10:00 AM'),
 (6,'C2','Rajshahi','Dhaka','55',54,1,'2018-02-10','10:00 AM');
/*!40000 ALTER TABLE `bus_details` ENABLE KEYS */;


--
-- Definition of table `new_employees`
--

DROP TABLE IF EXISTS `new_employees`;
CREATE TABLE `new_employees` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `firstname` varchar(45) default NULL,
  `lastname` varchar(45) default NULL,
  `address` varchar(45) default NULL,
  `contact_no` varchar(45) default NULL,
  `email_id` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `new_employees`
--

/*!40000 ALTER TABLE `new_employees` DISABLE KEYS */;
INSERT INTO `new_employees` (`id`,`firstname`,`lastname`,`address`,`contact_no`,`email_id`) VALUES 
 (1,'Rajib','Khan','Dhaka','01856455445','rajib@yahoo.com'),
 (2,'Wasim','Mulla','Khulna','01986528520','mulla23@gmail.com'),
 (3,'Rahmat','Ali','Jessor','01587952415','rahmat02@hotmail.com'),
 (5,'Fahad','Hossain','Dhaka','01926586958','fahad12@gmail.com');
/*!40000 ALTER TABLE `new_employees` ENABLE KEYS */;


--
-- Definition of table `new_user`
--

DROP TABLE IF EXISTS `new_user`;
CREATE TABLE `new_user` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `firstname` varchar(45) default NULL,
  `lastname` varchar(45) default NULL,
  `username` varchar(45) default NULL,
  `password` varchar(45) default NULL,
  `email_id` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `new_user`
--

/*!40000 ALTER TABLE `new_user` DISABLE KEYS */;
INSERT INTO `new_user` (`id`,`firstname`,`lastname`,`username`,`password`,`email_id`) VALUES 
 (1,'Mohsin','Hasan','mohsin','1234','mohsin34@gmail.com'),
 (2,'Abid','Jewel','abid','2568','jewelrana@yahoo.com'),
 (3,'Rakib','Hossain','rakib','2569','rakib@yahoo.com'),
 (4,'Younus','Miah','younus','2858','younus34@gmail.com'),
 (5,'Kabir','Hossain','kabir','5855','kabir34@gmail.com'),
 (6,'Mannan','Khan','mannan','8885','mannan34@gmail.com'),
 (7,'Jahid','Hassan','jahid','8585','jahid24@gmail.com'),
 (8,'Hasan','Molla','hasan','5858','hasan34@gmail.com'),
 (9,'Riaz','Hossain','riaz','2589','riaz34@gmail.com'),
 (10,'Tanvir','Ahmed','tanvir','8565','tanvir34@gmail.com'),
 (11,'Jalal','Matbor','jalal','7575','jalal34@gmail.com'),
 (12,'Tamim','Ikbal','tamim','586','tamim58@gmail.com');
/*!40000 ALTER TABLE `new_user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
