-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 15 Haz 2020, 10:22:15
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
-- Tablo için tablo yapısı `personeller`
--

CREATE TABLE `personeller` (
  `id` int(11) NOT NULL,
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text COLLATE utf8_turkish_ci NOT NULL,
  `tc` text COLLATE utf8_turkish_ci NOT NULL,
  `maas` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `personeller`
--

INSERT INTO `personeller` (`id`, `ad`, `soyad`, `tc`, `maas`) VALUES
(1, 'Sueda', 'AKIN', '45623158456', '6000'),
(2, 'Sumeyye', 'BAYRAKTAR', '78945612341', '5000'),
(3, 'Sevval', 'SAHİN', '41256389748', '5000'),
(4, 'Esra', 'CELİK', '12563479854', '5000'),
(5, 'Sehriban', 'YİLDİRİM', '74185296345', '5000'),
(6, 'Esma', 'ARSLAN', '46345295974', '5000'),
(7, 'Kubra', 'GUNES', '32654985431', '5000'),
(8, 'Turhan', 'KAYAER', '13465927580', '5000');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `personeller`
--
ALTER TABLE `personeller`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `personeller`
--
ALTER TABLE `personeller`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
