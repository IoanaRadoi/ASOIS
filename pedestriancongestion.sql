-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 01, 2016 at 07:39 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pedestriancongestion`
--

-- --------------------------------------------------------

--
-- Table structure for table `coordinates`
--

CREATE TABLE `coordinates` (
  `id` int(11) NOT NULL,
  `currentLatitude` double NOT NULL,
  `currentLongitude` double NOT NULL,
  `timestamp` double NOT NULL,
  `android_id` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coordinates`
--

INSERT INTO `coordinates` (`id`, `currentLatitude`, `currentLongitude`, `timestamp`, `android_id`) VALUES
(1, 44.4445171, 26.0544711, 1472718667, '5bf54cb7c0206a33'),
(2, 44.452431, 26.08665, 1472718667, '5bf54cb7c0206a34'),
(3, 44.479283, 26.10052, 1472718667, '5bf54cb7c0206a35'),
(4, 44.434765, 26.055006, 1472718667, '5bf54cb7c0206a37'),
(5, 44.434512, 26.033658, 1472718667, '5bf54cb7c0206a38'),
(6, 44.428955, 26.102709, 1472718667, '5bf54cb7c0206a41'),
(7, 44.416603, 26.113438, 1472718667, '5bf54cb7c0206a42'),
(8, 44.427473, 26.0872, 1472718667, '5bf54cb7c0206a43'),
(9, 44.426247, 26.088423, 1472718667, '5bf54cb7c0206a43'),
(10, 44.45306, 26.104813, 1472718667, '5bf54cb7c0206a45'),
(11, 44.452869, 26.104802, 1472718667, '5bf54cb7c0206a46');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coordinates`
--
ALTER TABLE `coordinates`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `coordinates`
--
ALTER TABLE `coordinates`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
