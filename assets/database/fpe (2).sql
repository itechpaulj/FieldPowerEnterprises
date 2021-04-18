-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2021 at 11:39 AM
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
-- Table structure for table `filter_table`
--

CREATE TABLE `filter_table` (
  `ID` int(11) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `QUANTIITY` varchar(255) NOT NULL,
  `PRICE` varchar(255) NOT NULL,
  `TOTAL PRICE` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `PICTURE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `filter_table`
--

INSERT INTO `filter_table` (`ID`, `BRAND`, `NAME`, `DESCRIPTION`, `QUANTIITY`, `PRICE`, `TOTAL PRICE`, `DATE`, `TYPE`, `PICTURE`) VALUES
(1, 'PAUL', 'JAVINEZ', 'QWE', '2', '100', '', '1/12/2021', '12', 'ASD'),
(2, 'ASD', 'ASD', 'ASD', '5', '10', '', 'QWE', 'QWE', 'QWE');

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
  `UNIT_TYPE` varchar(255) NOT NULL,
  `DIMENSION` varchar(255) NOT NULL,
  `TANK_CAP` varchar(255) NOT NULL,
  `BODY_TYPE` varchar(255) NOT NULL,
  `PRICE` varchar(255) NOT NULL,
  `ENGINE_SERIAL_NO` varchar(255) NOT NULL,
  `ALTERNATOR_SERIAL_NO` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `genset_table`
--

INSERT INTO `genset_table` (`ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `TANK_CAP`, `BODY_TYPE`, `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`) VALUES
(1, '123', '123', '23', '23123', '123', '123', '123', '123', '123', '123', '123', '4/18/21'),
(2, 'qwe', 'qweqwe', 'e', 'ee', 'e', 'qw', 'e', 'ee', 'e', 'e', 'e', '4/18/21'),
(3, '123', 'qwe', 'zfsfsdf', 'sdf', 'sdf', 'seqw', '12', 'sdf', 'sdf', '123OLD', 'OLDweqwe', '4/18/21'),
(4, '', '', '', '', '', '', '', '', '', ' - OLD', ' - OLD', '4/18/21'),
(5, '', '', '', '', '', '', '', '', '', ' - OLD', ' - OLD', '4/18/21');

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
(4, 'supp_qwe', 'supp_qwe', 'supp_qwe', 'supp_123456789'),
(5, 'qweqwe', 'qweqwe', 'qweqwe', 'qwe');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_table`
--
ALTER TABLE `customer_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `filter_table`
--
ALTER TABLE `filter_table`
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
-- AUTO_INCREMENT for table `filter_table`
--
ALTER TABLE `filter_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `genset_table`
--
ALTER TABLE `genset_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `supplier_table`
--
ALTER TABLE `supplier_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
