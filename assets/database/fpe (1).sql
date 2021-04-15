-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2021 at 08:12 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fpe`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer_table`
--

CREATE TABLE `customer_table` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `CONTACT` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_table`
--

INSERT INTO `customer_table` (`ID`, `NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES
(1, 'qwe', 'qwe', 'qwe', 'qwe'),
(2, 'qq', 'qq', 'qq', 'qq'),
(3, 'rr', 'rr', 'rr', 'rr'),
(4, 'qq', 'qq', 'qq', 'qqqq'),
(5, 'qq', 'qq', 'qq', 'qqqq'),
(6, 'eeee', 'ee', 'eeeee', 'eeee'),
(7, 'qqqq', 'qq', 'qqq', 'qqqq'),
(8, 'qqqq', 'qq', 'qqq', 'qqqq'),
(9, 'qqqq', 'qq', 'qqq', 'qqqq'),
(10, 'ff', 'fff', 'ff', 'ff');

-- --------------------------------------------------------

--
-- Table structure for table `genset_table`
--

CREATE TABLE `genset_table` (
  `ID` int(11) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `MODEL` varchar(255) NOT NULL,
  `KVA` varchar(255) NOT NULL,
  `PHASING` varchar(255) NOT NULL,
  `PRICE` varchar(255) NOT NULL,
  `ENGINE_SN` varchar(255) NOT NULL,
  `ALTERNATOR_SN` varchar(255) NOT NULL,
  `FUEL_TANK_CAP` varchar(255) NOT NULL,
  `BODY_TYPE` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `genset_table`
--

INSERT INTO `genset_table` (`ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `PRICE`, `ENGINE_SN`, `ALTERNATOR_SN`, `FUEL_TANK_CAP`, `BODY_TYPE`, `DATE`) VALUES
(1, 'qwe', 'qweqwe', 'qwe', 'qwe', 'qwe', 'qe', 'qwe', 'qwe', 'qwe', '4/16/21');

-- --------------------------------------------------------

--
-- Table structure for table `supplier_table`
--

CREATE TABLE `supplier_table` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `CONTACT` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier_table`
--

INSERT INTO `supplier_table` (`ID`, `NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES
(1, 'QWE123', 'QWE123', 'QWE123', '456'),
(2, 'QWE123', 'QWE123', 'QWE123', '123'),
(3, 'qaqwe', 'qwe', 'qwe', 'qwe'),
(4, 'supp_qwe', 'supp_qwe', 'supp_qwe', 'supp_123456789');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_table`
--
ALTER TABLE `customer_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `genset_table`
--
ALTER TABLE `genset_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `supplier_table`
--
ALTER TABLE `supplier_table`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer_table`
--
ALTER TABLE `customer_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `genset_table`
--
ALTER TABLE `genset_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `supplier_table`
--
ALTER TABLE `supplier_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
