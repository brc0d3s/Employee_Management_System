-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 25, 2023 at 09:07 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) NOT NULL,
  `name` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `sec_q` varchar(25) NOT NULL,
  `sec_ans` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `name`, `password`, `sec_q`, `sec_ans`) VALUES
('blockchains', 'blockchains', 'blockchains', 'Your NickName?', 'web3');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `fname` varchar(25) NOT NULL,
  `lname` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` int(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `education` varchar(15) NOT NULL,
  `post` varchar(15) NOT NULL,
  `ID_no` varchar(12) NOT NULL,
  `emp_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`fname`, `lname`, `age`, `dob`, `address`, `phone`, `email`, `education`, `post`, `ID_no`, `emp_id`) VALUES
('Allan', 'Kibet', 20, '2021-09-23', 'Kapsabet', 723654789, 'allan@gmail.com', 'B.tech', 'programer', '789654123654', 101),
('Karl', 'Kipkirui', 19, '2002-05-15', 'Bomet', 1236547895, 'karl@gmail.com', 'IT', 'HR', '456987123654', 102),
('brian', 'omondi', 21, '2021-09-29', 'Sagana', 770872383, 'brc0d3s@gmail.com', 'Comp Science', 'CEO', '3555466', 103);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
