-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2021 at 04:03 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

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
-- Table structure for table `cart_table`
--

CREATE TABLE `cart_table` (
  `STOCK ID` varchar(255) NOT NULL,
  `CATEGORY` varchar(255) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `MODEL` varchar(255) NOT NULL,
  `KVA` varchar(255) NOT NULL,
  `PHASING` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `SUPPLIER PRICE` varchar(255) NOT NULL,
  `SELLER PRICE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `TOTAL PRICE` int(255) NOT NULL,
  `ENGINE S.N` varchar(255) NOT NULL,
  `ALTERNATOR S.N` varchar(255) NOT NULL,
  `SUPPLIER ID` varchar(255) NOT NULL,
  `DATE INBOUND` varchar(255) NOT NULL,
  `DATE OUTBOUND` varchar(255) NOT NULL,
  `IMAGE` mediumblob NOT NULL,
  `INCHARGE` varchar(255) NOT NULL,
  `REMARKS` varchar(255) NOT NULL,
  `PROCESS` varchar(255) NOT NULL,
  `VERIFY` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer_table`
--

CREATE TABLE `customer_table` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `CONTACT` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `history_table`
--

CREATE TABLE `history_table` (
  `ID` int(11) NOT NULL,
  `STOCK ID` varchar(255) NOT NULL,
  `CATEGORY` varchar(255) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `MODEL` varchar(255) NOT NULL,
  `KVA` varchar(255) NOT NULL,
  `PHASING` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `SUPPLIER PRICE` varchar(255) NOT NULL,
  `SELLER PRICE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `TOTAL PRICE` int(255) NOT NULL,
  `ENGINE S.N` varchar(255) NOT NULL,
  `ALTERNATOR S.N` varchar(255) NOT NULL,
  `SUPPLIER ID` varchar(255) NOT NULL,
  `CUSTOMER ID` varchar(255) NOT NULL,
  `DATE INBOUND` varchar(255) NOT NULL,
  `DATE OUTBOUND` varchar(255) NOT NULL,
  `IMAGE` mediumblob NOT NULL,
  `INCHARGE` varchar(255) NOT NULL,
  `REMARKS` varchar(255) NOT NULL,
  `PROCESS` varchar(255) NOT NULL,
  `VERIFY` varchar(255) NOT NULL,
  `PROJECT NO` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `USER LEVEL` varchar(255) NOT NULL,
  `USERNAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `CONFIRM PASSWORD` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `NAME`, `USER LEVEL`, `USERNAME`, `PASSWORD`, `CONFIRM PASSWORD`) VALUES
(2, 'JAVINEZ', 'paul', 'paul', '123', '123'),
(3, 'robles', 'good', 'good', '123', '123'),
(4, 'POL', 'STAFF', 'POL', 'POL', 'POL'),
(5, 'POL', 'STAFF', 'POL', 'POL', 'POL');

-- --------------------------------------------------------

--
-- Table structure for table `stock_table`
--

CREATE TABLE `stock_table` (
  `STOCK ID` int(11) NOT NULL,
  `CATEGORY` varchar(255) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `MODEL` varchar(255) NOT NULL,
  `KVA` varchar(255) NOT NULL,
  `PHASING` varchar(255) NOT NULL,
  `TYPE` varchar(255) NOT NULL,
  `SUPPLIER PRICE` varchar(255) NOT NULL,
  `SELLER PRICE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `TOTAL PRICE` int(255) NOT NULL,
  `ENGINE S.N` varchar(255) NOT NULL,
  `ALTERNATOR S.N` varchar(255) NOT NULL,
  `SUPPLIER ID` varchar(255) NOT NULL,
  `DATE INBOUND` varchar(255) NOT NULL,
  `IMAGE` mediumblob NOT NULL,
  `INCHARGE` varchar(255) NOT NULL,
  `REMARKS` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `supplier_table`
--

CREATE TABLE `supplier_table` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `CONTACT` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier_table`
--

INSERT INTO `supplier_table` (`ID`, `NAME`, `ADDRESS`, `CONTACT`) VALUES
(2, 'WQWE', 'QWE', 'QWE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_table`
--
ALTER TABLE `customer_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `history_table`
--
ALTER TABLE `history_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `stock_table`
--
ALTER TABLE `stock_table`
  ADD PRIMARY KEY (`STOCK ID`);

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
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `history_table`
--
ALTER TABLE `history_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `stock_table`
--
ALTER TABLE `stock_table`
  MODIFY `STOCK ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `supplier_table`
--
ALTER TABLE `supplier_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
