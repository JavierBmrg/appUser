-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 06, 2017 at 06:29 PM
-- Server version: 10.1.22-MariaDB
-- PHP Version: 7.1.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `appuser`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` bigint(20) UNSIGNED NOT NULL,
  `user_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `user_name`) VALUES
(1, 'dump12'),
(2, 'zte123'),
(5, 'dump123'),
(6, 'dump1234'),
(12, 'usuario'),
(15, 'speaker1900'),
(16, 'withoutrestricted'),
(19, 'usuario278');

-- --------------------------------------------------------

--
-- Table structure for table `user_restrict`
--

CREATE TABLE `user_restrict` (
  `id_restrict` bigint(20) UNSIGNED NOT NULL,
  `user_name_restrict` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user_restrict`
--

INSERT INTO `user_restrict` (`id_restrict`, `user_name_restrict`) VALUES
(1, 'drunk'),
(2, 'fuck'),
(3, 'fucking'),
(4, 'fucker'),
(5, 'nigga'),
(6, 'cannabis'),
(7, 'whore'),
(9, 'fucker'),
(10, 'crack'),
(11, 'abuse'),
(12, 'grass');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD UNIQUE KEY `id_user` (`id_user`);

--
-- Indexes for table `user_restrict`
--
ALTER TABLE `user_restrict`
  ADD UNIQUE KEY `id_restrict` (`id_restrict`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `user_restrict`
--
ALTER TABLE `user_restrict`
  MODIFY `id_restrict` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
