-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 05, 2016 at 06:56 PM
-- Server version: 5.7.16-0ubuntu0.16.04.1
-- PHP Version: 7.0.8-0ubuntu0.16.04.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `HotelDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `Bill`
--

CREATE TABLE `Bill` (
  `custName` varchar(255) NOT NULL,
  `bill` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Bill`
--

INSERT INTO `Bill` (`custName`, `bill`) VALUES
('Padhee', 59.99),
('Subir', 69.97),
('Subir1480826', 14.99),
('Subir1480826560331', 48.97),
('Subir1480827046145', 32.989999999999995),
('Subir1480827075159', 73.96),
('Subir1480842743206', 70.99),
('Subir1480845797351', 114.94),
('Subir1480851336309', 14.99),
('Subir1480875480187', 0),
('Subir1480876656196', 14.99),
('Subir1480876820033', 76.98),
('Subir1480881206970', 69.97),
('Subir1480881364368', 61.97),
('Subir1480881491282', 0),
('Subir1480881594603', 0),
('Subir1480882192209', 48.97),
('Subir1480885510797', 57.98),
('Subir1480900300717', 91.96),
('Subir1480900702585', 14.99),
('Subir1480902696390', 14.99),
('Subir1480903611929', 16.99),
('Subir1480904109979', 14.99),
('Subir1480904245917', 14.99),
('Subir1480904332778', 14.99),
('Subir1480904519509', 14.99),
('Subir1480907246428', 14.99),
('Subir1480907528212', 14.99),
('Subir1480907832683', 14.99),
('Subir1480908128431', 14.99),
('Subir1480911540723', 100.97),
('Subir1480915111248', 48.97),
('Subir1480928334585', 14.99),
('Subir1480928676666', 14.99),
('Subir1480929306008', 31.979999999999997),
('Subir1480929450069', 0),
('Subir1480929650794', 14.99),
('Subir1480929763878', 14.99),
('Subir1480929790039', 14.99),
('Subir1480931822163', 0),
('Subir1480931956050', 0),
('Subir1480936231050', 29.98),
('Subir1480936314006', 31.979999999999997),
('Subir1480970254003', 31.979999999999997),
('Subir1480988004630', 14.99);

-- --------------------------------------------------------

--
-- Table structure for table `CreditCardTable`
--

CREATE TABLE `CreditCardTable` (
  `cardNumber` varchar(30) NOT NULL,
  `cardHolderName` char(30) NOT NULL,
  `cvv` char(30) NOT NULL,
  `expiryMonth` varchar(30) NOT NULL,
  `expiryYear` varchar(30) NOT NULL,
  `totalPayment` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Credit Card Database';

--
-- Dumping data for table `CreditCardTable`
--

INSERT INTO `CreditCardTable` (`cardNumber`, `cardHolderName`, `cvv`, `expiryMonth`, `expiryYear`, `totalPayment`) VALUES
('1', 'q', '1', '1', '1', 130),
('1111111111111111', 'Radhika Paryekar', '111', '12', '2021', 130),
('5555555555555555', 'Subir Kumar Padhee', '555', '12', '2021', 0),
('9999999999999999', 'Meher Jain', '999', '12', '2021', 0);

-- --------------------------------------------------------

--
-- Table structure for table `Food`
--

CREATE TABLE `Food` (
  `foodItem` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Food`
--

INSERT INTO `Food` (`foodItem`, `price`, `quantity`) VALUES
('A1', 14.99, 1),
('A2', 15, 1),
('A3', 16, 1),
('A4', 13, 1),
('A5', 19.99, 1),
('A6', 16.99, 1),
('M1', 16.99, 1),
('M2', 30, 1),
('M3', 16.99, 1),
('M4', 24.99, 1),
('M5', 16.99, 1),
('M6', 26, 1);

-- --------------------------------------------------------

--
-- Table structure for table `FoodInventory`
--

CREATE TABLE `FoodInventory` (
  `inventory_id` int(11) NOT NULL,
  `itemName` varchar(255) DEFAULT NULL,
  `itemQuantity` int(11) NOT NULL,
  `needsToBeOrdered` bit(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `FoodInventory`
--

INSERT INTO `FoodInventory` (`inventory_id`, `itemName`, `itemQuantity`, `needsToBeOrdered`) VALUES
(1, 'Milk', 100, b'0'),
(2, 'Fruits', 500, b'0');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `RoomTable`
--

CREATE TABLE `RoomTable` (
  `roomNum` int(11) NOT NULL,
  `roomType` char(30) NOT NULL,
  `roomCheckIn` char(30) NOT NULL,
  `roomCheckOut` char(30) NOT NULL,
  `roomStatus` tinyint(1) NOT NULL,
  `basePrice` double NOT NULL,
  `roomPrice` double NOT NULL,
  `wifi` char(30) NOT NULL,
  `breakfast` char(30) NOT NULL,
  `customerName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `RoomTable`
--

INSERT INTO `RoomTable` (`roomNum`, `roomType`, `roomCheckIn`, `roomCheckOut`, `roomStatus`, `basePrice`, `roomPrice`, `wifi`, `breakfast`, `customerName`) VALUES
(101, 'Double Bed', 'Fri, Dec 09 2016', 'Fri, Dec 09 2016', 1, 95, 0, '0', '0', ''),
(102, 'Single Bed', 'Fri, Dec 09 2016', 'Fri, Dec 09 2016', 0, 65, 75, 'Yes', 'Yes', ''),
(103, 'Double Bed', 'Fri, Dec 09 2016', 'Fri, Dec 09 2016', 1, 95, 0, '0', '0', ''),
(104, 'Single Bed', 'Mon, Dec 05 2016', 'Mon, Dec 05 2016', 0, 65, 65, 'No', 'No', ''),
(201, 'Double Bed', 'Fri, Dec 16 2016', 'Fri, Dec 16 2016', 1, 95, 0, '0', '0', ''),
(202, 'Single Bed', 'Mon, Dec 05 2016', 'Mon, Dec 05 2016', 0, 65, 65, 'No', 'No', ''),
(203, 'Double Bed', 'Fri, Dec 16 2016', 'Fri, Dec 16 2016', 1, 95, 0, '0', '0', ''),
(204, 'Single Bed', 'Thu, Dec 15 2016', 'Thu, Dec 15 2016', 1, 65, 0, '0', '0', ''),
(301, 'Double Bed', 'Thu, Dec 08 2016', 'Thu, Dec 08 2016', 1, 95, 0, '0', '0', ''),
(302, 'Single Bed', 'Fri, Dec 09 2016', 'Fri, Dec 09 2016', 1, 65, 0, '0', '0', '');

-- --------------------------------------------------------

--
-- Table structure for table `SupplyInventory`
--

CREATE TABLE `SupplyInventory` (
  `inventory_id` int(11) NOT NULL,
  `itemName` varchar(255) DEFAULT NULL,
  `itemQuantity` int(11) NOT NULL,
  `needsToBeOrdered` bit(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `SupplyInventory`
--

INSERT INTO `SupplyInventory` (`inventory_id`, `itemName`, `itemQuantity`, `needsToBeOrdered`) VALUES
(1, 'Detergent', 100, b'1'),
(2, 'Soap', 100, b'0');

-- --------------------------------------------------------

--
-- Table structure for table `User_Details`
--

CREATE TABLE `User_Details` (
  `Id` int(11) NOT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `failedLogins` int(11) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `User_Details`
--

INSERT INTO `User_Details` (`Id`, `email_id`, `failedLogins`, `first_name`, `gender`, `last_name`, `password`, `phone_no`, `user_name`, `user_role`) VALUES
(0, 'a@gmail.com', 0, 'mjj', 'Male', 'mkl', 'mkl', '0', 'mkl', 'HouseKeeping'),
(1, 'subir.padhee@gmail.com', 0, 'subir', 'Male', 'kumar', 'subir', '9', 'subir', 'Customer'),
(2, 'm@gmail.com', 0, 'Meher', 'Male', 'j', 'mj', '9', 'mj', 'Catering');

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `Id` int(11) NOT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  `failedLogins` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`Id`, `email_id`, `first_name`, `gender`, `last_name`, `password`, `phone_no`, `user_name`, `user_role`, `failedLogins`) VALUES
(1, 'radhika@gmail.com', 'Radhika', 'Female', 'Paryekar', 'r', '3456789', 'r', 'Catering', 2),
(2, 'megs@@gmail.com', 'Meghana', 'Female', 'Iyer', 'meghana', '345678', 'meghana', 'Customer', 0),
(3, 'mjain@gmail.com', 'meher', 'Male', 'jain', 'm', '4657789', 'm', 'HouseKeeping', 0),
(4, 'sp@gmail.com', 'subir', 'Male', 'padhee', 's', '3456798', 's', 'Receptionist', 0),
(6, 'srk@gmail.com', 'Shah Rukh', 'Male', 'Khan', 'qwerty', '123456789', 'iamsrk', 'Customer', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Bill`
--
ALTER TABLE `Bill`
  ADD PRIMARY KEY (`custName`);

--
-- Indexes for table `CreditCardTable`
--
ALTER TABLE `CreditCardTable`
  ADD PRIMARY KEY (`cardNumber`);

--
-- Indexes for table `Food`
--
ALTER TABLE `Food`
  ADD PRIMARY KEY (`foodItem`);

--
-- Indexes for table `FoodInventory`
--
ALTER TABLE `FoodInventory`
  ADD PRIMARY KEY (`inventory_id`);

--
-- Indexes for table `RoomTable`
--
ALTER TABLE `RoomTable`
  ADD PRIMARY KEY (`roomNum`),
  ADD KEY `roomNum` (`roomNum`);

--
-- Indexes for table `SupplyInventory`
--
ALTER TABLE `SupplyInventory`
  ADD PRIMARY KEY (`inventory_id`);

--
-- Indexes for table `User_Details`
--
ALTER TABLE `User_Details`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `UKny6dxu9oo1fqaqxl2rda4gg06` (`user_name`,`email_id`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `UK_eq8p82mg6hlepqmad38cv0vbc` (`user_name`),
  ADD UNIQUE KEY `UK_n0atktbieawwmr9jfmwilt81f` (`email_id`),
  ADD UNIQUE KEY `UK_ny6dxu9oo1fqaqxl2rda4gg06` (`user_name`,`email_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_details`
--
ALTER TABLE `user_details`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
