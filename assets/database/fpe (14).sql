-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2021 at 08:17 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Table structure for table `add_cart`
--

CREATE TABLE `add_cart` (
  `ID` int(11) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `PRICE` varchar(255) NOT NULL,
  `TOTAL PRICE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

-- --------------------------------------------------------

--
-- Table structure for table `filter_table`
--

CREATE TABLE `filter_table` (
  `ID` int(11) NOT NULL,
  `DATE` varchar(255) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `SUPPLIER PRICE` varchar(255) NOT NULL,
  `SELLER PRICE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `IMAGE` mediumblob NOT NULL,
  `SUPPLIER` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  `PRICE` varchar(255) NOT NULL,
  `SELLER_PRICE` varchar(255) NOT NULL,
  `ENGINE_SERIAL_NO` varchar(255) NOT NULL,
  `ALTERNATOR_SERIAL_NO` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL,
  `IMAGE` mediumblob NOT NULL,
  `SUPPLIER` varchar(255) NOT NULL,
  `ENERGIZED DATE` varchar(255) NOT NULL,
  `TANK CAPACITY` varchar(255) NOT NULL,
  `OIL USAGE` varchar(255) NOT NULL,
  `TECHNICIAN` varchar(255) NOT NULL,
  `STARTING SYSTEM` varchar(255) NOT NULL,
  `WEIGHT` varchar(255) NOT NULL,
  `FRAME` varchar(255) NOT NULL,
  `UPDATED AT` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `history_filter`
--

CREATE TABLE `history_filter` (
  `ID` int(11) NOT NULL,
  `DATE` varchar(255) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `IMAGE` mediumblob NOT NULL,
  `PRICE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `TOTAL PRICE` int(11) NOT NULL,
  `QUOTATION` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `CONTACT` varchar(255) NOT NULL,
  `AGENT_NAME` varchar(255) NOT NULL,
  `AGENT_CONTACT` varchar(255) NOT NULL,
  `DEALING INFO` varchar(255) NOT NULL,
  `ID FILTER` varchar(255) NOT NULL,
  `ID CART` varchar(255) NOT NULL,
  `COUNT_PROCESS` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `history_genset_table`
--

CREATE TABLE `history_genset_table` (
  `ID` int(11) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `MODEL` varchar(255) NOT NULL,
  `KVA` varchar(255) NOT NULL,
  `PHASING` varchar(255) NOT NULL,
  `UNIT_TYPE` varchar(255) NOT NULL,
  `DIMENSION` varchar(255) NOT NULL,
  `PRICE` varchar(255) NOT NULL,
  `SELLER PRICE` varchar(255) NOT NULL,
  `ENGINE_SERIAL_NO` varchar(255) NOT NULL,
  `ALTERNATOR_SERIAL_NO` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL,
  `IMAGE` mediumblob NOT NULL,
  `SUPPLIER` varchar(255) NOT NULL,
  `ENERGIZED DATE` varchar(255) NOT NULL,
  `TANK CAPACITY` varchar(255) NOT NULL,
  `OIL USAGE` varchar(255) NOT NULL,
  `TECHNICIAN` varchar(255) NOT NULL,
  `STARTING SYSTEM` varchar(255) NOT NULL,
  `WEIGHT` varchar(255) NOT NULL,
  `FRAME` varchar(255) NOT NULL,
  `UPDATED AT` varchar(255) NOT NULL,
  `QUOTATION` varchar(255) NOT NULL,
  `CUSTOMER_NAME` varchar(255) NOT NULL,
  `CUSTOMER_ADDRESS` varchar(255) NOT NULL,
  `CUSTOMER_EMAIL` varchar(255) NOT NULL,
  `CUSTOMER_CONTACT` varchar(255) NOT NULL,
  `DEALING INFO` varchar(255) NOT NULL,
  `AGENT_NAME` varchar(255) NOT NULL,
  `AGENT_CONTACT` varchar(255) NOT NULL,
  `ID_GENSET` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(255) NOT NULL,
  `EMPLOYER ID` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `USERNAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `EMPLOYER ID`, `NAME`, `EMAIL`, `USERNAME`, `PASSWORD`) VALUES
(1, '21-fpe0001', 'FPE', 'fieldpowerenterprises@gmail.com', 'fpe', 'fpe2021');

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
-- Indexes for dumped tables
--

--
-- Indexes for table `add_cart`
--
ALTER TABLE `add_cart`
  ADD PRIMARY KEY (`ID`);

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
-- Indexes for table `history_filter`
--
ALTER TABLE `history_filter`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `history_genset_table`
--
ALTER TABLE `history_genset_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
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
-- AUTO_INCREMENT for table `add_cart`
--
ALTER TABLE `add_cart`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customer_table`
--
ALTER TABLE `customer_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `filter_table`
--
ALTER TABLE `filter_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `genset_table`
--
ALTER TABLE `genset_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `history_filter`
--
ALTER TABLE `history_filter`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `history_genset_table`
--
ALTER TABLE `history_genset_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `supplier_table`
--
ALTER TABLE `supplier_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
