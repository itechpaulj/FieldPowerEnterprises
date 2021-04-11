-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2021 at 10:48 AM
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
-- Database: `fieldpowerenterprises`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer_tbl`
--

CREATE TABLE `customer_tbl` (
  `CUSTOMER_ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `CONTACT` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `generator_tbl`
--

CREATE TABLE `generator_tbl` (
  `GENERATOR_ID` int(11) NOT NULL,
  `PHASING` varchar(25) NOT NULL,
  `KVA` varchar(255) NOT NULL,
  `VAC` varchar(255) NOT NULL,
  `SUPPLIER_PRICE` varchar(255) NOT NULL,
  `SELLER_PRICE` varchar(255) NOT NULL,
  `QUANTITY` varchar(255) NOT NULL,
  `PRODUCT_BRANDNAME` varchar(255) NOT NULL,
  `ENGINE_MODEL` varchar(255) NOT NULL,
  `ENGINE_SN` varchar(255) NOT NULL,
  `ALTERNATOR_SN` varchar(255) NOT NULL,
  `UNIT_TYPE` varchar(255) NOT NULL,
  `STARTING_SYSTEM` varchar(255) NOT NULL,
  `BODY_TYPE` varchar(255) NOT NULL,
  `DIMENSION` varchar(255) NOT NULL,
  `FUEL_TANK_CAP` varchar(255) NOT NULL,
  `WEIGHT` varchar(255) NOT NULL,
  `FRAME` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login_tbl`
--

CREATE TABLE `login_tbl` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_tbl`
--

INSERT INTO `login_tbl` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `parts_tbl`
--

CREATE TABLE `parts_tbl` (
  `ITEM_ID` int(11) NOT NULL,
  `ITEM_NAME` varchar(255) NOT NULL,
  `BRAND` varchar(255) NOT NULL,
  `PRICE` varchar(255) NOT NULL,
  `QUANTIITY` varchar(255) NOT NULL,
  `TOTAL_PRICE` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier_tbl`
--

CREATE TABLE `supplier_tbl` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `CONTACT` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `DATE` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier_tbl`
--

INSERT INTO `supplier_tbl` (`ID`, `NAME`, `ADDRESS`, `CONTACT`, `EMAIL`, `DATE`) VALUES
(1, 'paul javinez', 'bulacan', '095068250268', 'itechpaulj@gmail.com', '5/30/97'),
(5, 'althea javinez', 'bulacan', '09287514087', 'javinezalthea@gmail.com', '4/10/21'),
(9, 'juan dela cruz', 'cavite', '987654231', 'juandelacruz@gmail.com', '1/1/08');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_tbl`
--
ALTER TABLE `customer_tbl`
  ADD PRIMARY KEY (`CUSTOMER_ID`);

--
-- Indexes for table `generator_tbl`
--
ALTER TABLE `generator_tbl`
  ADD PRIMARY KEY (`GENERATOR_ID`);

--
-- Indexes for table `login_tbl`
--
ALTER TABLE `login_tbl`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `parts_tbl`
--
ALTER TABLE `parts_tbl`
  ADD PRIMARY KEY (`ITEM_ID`);

--
-- Indexes for table `supplier_tbl`
--
ALTER TABLE `supplier_tbl`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer_tbl`
--
ALTER TABLE `customer_tbl`
  MODIFY `CUSTOMER_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `generator_tbl`
--
ALTER TABLE `generator_tbl`
  MODIFY `GENERATOR_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `login_tbl`
--
ALTER TABLE `login_tbl`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `parts_tbl`
--
ALTER TABLE `parts_tbl`
  MODIFY `ITEM_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `supplier_tbl`
--
ALTER TABLE `supplier_tbl`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
