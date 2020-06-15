-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 15 Haz 2020, 10:21:59
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.3.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ilaclar`
--

CREATE TABLE `ilaclar` (
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `turu` text COLLATE utf8_turkish_ci NOT NULL,
  `son kullanma tarihi` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `ilaclar`
--

INSERT INTO `ilaclar` (`ad`, `turu`, `son kullanma tarihi`) VALUES
('parol', 'agrı kesici', '21.03.2021'),
('metpamid', 'bulantı ve kusma önleyici', '27.06.2022'),
('aferin', 'antigribal', '30.08.2020'),
('lansor', 'mide koruyucu', '14.07.2022');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
