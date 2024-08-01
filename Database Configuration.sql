-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2024 at 08:39 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee_expenses`
--
DROP DATABASE IF EXISTS `employee_expenses`;
CREATE DATABASE IF NOT EXISTS `employee_expenses` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `employee_expenses`;

-- --------------------------------------------------------

--
-- Table structure for table `budget_management`
--

DROP TABLE IF EXISTS `budget_management`;
CREATE TABLE `budget_management` (
  `Department` varchar(20) NOT NULL,
  `Budget` float NOT NULL,
  `Budget_Used` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELATIONSHIPS FOR TABLE `budget_management`:
--

--
-- Dumping data for table `budget_management`
--

INSERT INTO `budget_management` (`Department`, `Budget`, `Budget_Used`) VALUES
('Finance', 82912, 18000),
('Human Resources', 1500, 13500),
('IT', 17000, 0),
('Marketing', 14000, 0),
('Sales', 12000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `expenses`
--

DROP TABLE IF EXISTS `expenses`;
CREATE TABLE `expenses` (
  `Expense_Type` varchar(20) NOT NULL,
  `Cost` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELATIONSHIPS FOR TABLE `expenses`:
--

--
-- Dumping data for table `expenses`
--

INSERT INTO `expenses` (`Expense_Type`, `Cost`) VALUES
('Accomodations', 1500),
('Meal/Entertainment', 1500),
('Operations', 2000),
('Travel', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `expense_tracking`
--

DROP TABLE IF EXISTS `expense_tracking`;
CREATE TABLE `expense_tracking` (
  `Expense_ID` varchar(10) NOT NULL,
  `Department` varchar(20) NOT NULL,
  `Expense_Type` varchar(20) DEFAULT NULL,
  `Date` date NOT NULL,
  `Description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELATIONSHIPS FOR TABLE `expense_tracking`:
--   `Expense_Type`
--       `expenses` -> `Expense_Type`
--

--
-- Dumping data for table `expense_tracking`
--

INSERT INTO `expense_tracking` (`Expense_ID`, `Department`, `Expense_Type`, `Date`, `Description`) VALUES
('dij4w', 'Finance', 'Meal/Entertainment', '2024-04-04', 'uoegniro3h'),
('elps8', 'Finance', 'Travel', '2024-04-04', 'lagos'),
('gdp0a', 'Finance', 'Travel', '2024-04-04', 'mombasa trip'),
('h719n', 'Finance', 'Meal/Entertainment', '2024-04-04', 'annual gathering'),
('nx4px', 'Human Resources', 'Travel', '2024-04-04', ''),
('qow66', 'Human Resources', 'Travel', '2024-04-04', ''),
('svj20', 'Finance', 'Travel', '2024-04-04', 'degkigpe'),
('v4mot', 'Finance', 'Travel', '2024-04-04', 'khgffgvk'),
('x2pu5', 'Finance', 'Meal/Entertainment', '2024-04-04', 'okfjoir3'),
('y92pz', 'Human Resources', 'Travel', '2024-04-04', 'ojbo'),
('ybh8j', 'Finance', 'Meal/Entertainment', '2024-04-04', 'irwnn'),
('z6j94', 'Human Resources', 'Travel', '2024-04-04', 'pof3jpo'),
('zqgrq', 'Human Resources', 'Meal/Entertainment', '2024-04-04', 'chinese chickern');

--
-- Triggers `expense_tracking`
--
DROP TRIGGER IF EXISTS `after_delete_transaction`;
DELIMITER $$
CREATE TRIGGER `after_delete_transaction` AFTER DELETE ON `expense_tracking` FOR EACH ROW BEGIN
  DECLARE expense_cost FLOAT;

  -- Find the cost associated with the deleted Expense_Type
  SELECT Cost INTO expense_cost
  FROM expenses
  WHERE expenses.Expense_Type = OLD.Expense_Type;

  -- Update budget and budget_used
  UPDATE budget_management
  SET Budget = Budget + expense_cost,
      Budget_Used = Budget_Used - expense_cost
  WHERE budget_management.Department = OLD.Department;
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `before_insert_transaction`;
DELIMITER $$
CREATE TRIGGER `before_insert_transaction` BEFORE INSERT ON `expense_tracking` FOR EACH ROW BEGIN
  DECLARE expense_cost FLOAT;

  -- Find the cost associated with the Expense_type
  SELECT Cost INTO expense_cost
  FROM expenses
  WHERE expenses.Expense_Type = NEW.Expense_Type;

  -- Check if the budget is sufficient
  IF expense_cost IS NOT NULL AND (SELECT Budget FROM budget_management WHERE Department = NEW.Department) - expense_cost <= 0 THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient budget to cover the expense cost';
  END IF;
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `minus_Budget`;
DELIMITER $$
CREATE TRIGGER `minus_Budget` AFTER UPDATE ON `expense_tracking` FOR EACH ROW BEGIN
  DECLARE expense_cost FLOAT;

  -- Find the cost associated with the Expense_type
  SELECT Cost INTO expense_cost
  FROM expenses
  WHERE expenses.Expense_Type = NEW.Expense_Type;

  -- Update budget and budget_used (check for null cost)
  IF expense_cost IS NOT NULL THEN
    UPDATE budget_management
    SET Budget = Budget - expense_cost,
        Budget_Used = Budget_Used + expense_cost
    WHERE budget_management.Department = NEW.Department;
  END IF;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `budget_management`
--
ALTER TABLE `budget_management`
  ADD PRIMARY KEY (`Department`);

--
-- Indexes for table `expenses`
--
ALTER TABLE `expenses`
  ADD PRIMARY KEY (`Expense_Type`);

--
-- Indexes for table `expense_tracking`
--
ALTER TABLE `expense_tracking`
  ADD PRIMARY KEY (`Expense_ID`),
  ADD KEY `eType` (`Expense_Type`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `expense_tracking`
--
ALTER TABLE `expense_tracking`
  ADD CONSTRAINT `eType` FOREIGN KEY (`Expense_Type`) REFERENCES `expenses` (`Expense_Type`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
