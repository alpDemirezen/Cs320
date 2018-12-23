-- Estate Sample Database schema
-- Version 1.0
-- Copyright 2018, Elif Gocumoglu and/or its affiliates. 
-- Free redistribution

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

DROP SCHEMA IF EXISTS estatedb;
CREATE SCHEMA estatedb;
USE estatedb;
SET AUTOCOMMIT=0;

--
-- Database: `estatedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `estatetbl`
--

CREATE TABLE IF NOT EXISTS `estatetbl` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `saleType` varchar(16) NOT NULL,
  `price` int(7) NOT NULL,
  `area` int(5) NOT NULL,
  `location` varchar(64) NOT NULL,
  `realEstateType` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 ;

COMMIT;

SET AUTOCOMMIT=1;
