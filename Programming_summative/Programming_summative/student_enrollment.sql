-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Apr 27, 2022 at 03:45 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_enrollment`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `admission_number` varchar(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `grade` varchar(2) DEFAULT NULL,
  `marks_awarded` int(9) DEFAULT NULL,
  `course_selected` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `username`, `password`, `admission_number`, `first_name`, `last_name`, `gender`, `grade`, `marks_awarded`, `course_selected`) VALUES
(1, 'assassin', 'kranko', '2022/1', 'samuel', 'wanza', 'Male', 'A', 20, 'Computer Science'),
(2, 'amos', 'amo', '2022/2', 'Amos', 'Mwangi', 'Male', 'B-', 16, 'Global Challenges'),
(3, 'ayub', 'marisia', '2022/3', 'ahmed', 'mohamed', 'Male', 'A-', 19, 'Computer Science'),
(4, 'ednah', 'akoth', '2022/4', 'Ednah', 'Akoth', 'Female', 'A', 20, 'Computer Science'),
(5, 'myra', 'lugwiri', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(6, 'deng', 'juok', '2022/6', 'Deng', 'Juok', 'Male', 'C', 14, 'Business Studies'),
(7, 'spencer', 'kamayo', '2022/7', 'Spencer', 'Kamayo', 'Male', 'C-', 12, 'Business Studies'),
(8, 'dancan', 'odira', '2022/8', 'Dancan', 'Odira', 'Male', 'C', 14, 'Business Studies'),
(9, 'natasha', 'nzale', '2022/9', 'Natasha', 'Nzale', 'Female', 'A-', 19, 'Computer Science'),
(10, 'swaleh', 'mwinyi', '2022/10', 'Swaleh', 'Mwinyi', 'Male', 'C+', 15, 'Global Challenges'),
(11, 'jere', 'ater', '2022/11', 'Jeremiah', 'Ater', 'Male', 'E', 8, 'Unqualified for Admission'),
(12, 'osman', 'wata', '2022/12', 'Osman', 'Wata', 'Male', 'B', 17, 'Global Challenges');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
