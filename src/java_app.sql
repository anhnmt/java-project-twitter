-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 17, 2019 lúc 06:44 PM
-- Phiên bản máy phục vụ: 10.1.38-MariaDB
-- Phiên bản PHP: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `java_app`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `likes`
--

CREATE TABLE `likes` (
  `like_id` int(15) NOT NULL,
  `user_id` int(15) NOT NULL,
  `post_id` int(15) NOT NULL,
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `likes`
--

INSERT INTO `likes` (`like_id`, `user_id`, `post_id`, `created`) VALUES
(1, 3, 7, '2019-05-06 23:24:30'),
(3, 2, 1, '2019-05-06 23:24:34'),
(5, 1, 4, '2019-05-06 23:32:37'),
(6, 2, 7, '2019-05-06 23:32:50'),
(7, 2, 3, '2019-05-06 23:32:57'),
(8, 1, 7, '2019-05-06 23:33:19');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `posts`
--

CREATE TABLE `posts` (
  `post_id` int(15) NOT NULL,
  `user_id` int(15) NOT NULL,
  `content` varchar(255) NOT NULL,
  `like` int(15) DEFAULT '0',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `posts`
--

INSERT INTO `posts` (`post_id`, `user_id`, `content`, `like`, `created`) VALUES
(1, 2, 'Hawkeye là một trong 6 mảnh ghép đầu tiên của Avengers và là nhân tố không thể thiếu trong siêu bom tấn Avengers: Endgame. Anh đã chia sẻ về hành trình hơn 10 năm tuyệt vời với MCU, về tình bạn giữa các siêu anh hùng cả trong phim lẫn ngoài đời thực.', 1, '2019-05-05 22:09:37'),
(2, 1, 'Thu 10 triệu đô sau hơn 7 ngày công chiếu, Avengers: Endgame chính thức trở thành phim ăn khách nhất mọi thời đại tại Việt Nam. Avengers: Endgame hiện đang khởi chiếu tại các rạp CGV trên toàn quốc. ', 0, '2019-05-05 22:13:25'),
(3, 1, 'Muốn có hòa bình thì phải chuẩn bị chiến tranh. Chỉ còn 2 tuần nữa để gặp lại siêu sát thủ John Wick. Liệu phe nào sẽ giành phần thắng trong cuộc truy đuổi ko cân sức này?', 1, '2019-05-05 22:14:50'),
(4, 1, 'Với 12 ngày (11 ngày công chiếu chính thức & 1 ngày chiếu sớm) doanh thu đạt $2.188 tỷ. Liệu Avengers: Endgame có soán ngôi được Avatar và trở thành phim có doanh thu CAO NHẤT MỌI THỜI ĐẠI?', 1, '2019-05-05 22:27:53'),
(5, 2, 'Chỉ sau vài ngày công chiếu, không những phá đảo nhiều kỷ lục phòng vé nội địa và quốc tế, bom tấn Avengers: Endgame cũng nhận được vô số lời khen từ giới phê bình và truyền thông từ kỷ xảo đến nội dung phim.', 0, '2019-05-05 22:55:19'),
(6, 1, 'Với những khán giả đã được thưởng thức siêu bom tấn Avengers: Hồi Kết, đừng làm hỏng bộ phim. Hãy giữ cảm xúc của bộ phim một cách trọn vẹn nhất. Đó cũng là nhiệm vụ cuối cùng mà \"Iron Man\" Robert Downey Jr dành đến tất cả khán giả.', 0, '2019-05-05 22:59:12'),
(7, 3, 'Anh sống giữa lòng thành phố nhưng lại mơ về thị trấn hoang.', 3, '2019-05-05 23:10:53'),
(8, 3, 'Đồ án Java - Mạng xã hội Twitter. Thiết kế bởi: Nguyễn Mạnh Tuấn Anh - TH22.12 - 17103282.', 0, '2019-05-13 23:45:46'),
(9, 2, 'TT Trump: ‘Nhiều công ty chịu thuế sẽ rời bỏ TQ, tìm đến Việt Nam\'.', 0, '2019-05-13 23:50:27');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `user_id` int(15) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(150) DEFAULT NULL,
  `gender` bit(1) NOT NULL DEFAULT b'0',
  `level` bit(1) NOT NULL DEFAULT b'0',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `gender`, `level`, `created`) VALUES
(1, 'admin', '$2a$12$IKsZmYyPp2mNdjP690zJ2.AS.y.CRulLWWVU7y53epoHpJAfoQPFe', b'1', b'1', '2019-05-05 18:09:28'),
(2, 'user', '$2a$12$KA0FX.OZO5XZCGpv4ja2AO.5frS9R0wSnnpKxgIJyISJaqeiGwbHm', b'0', b'0', '2019-05-05 18:09:28'),
(3, 'anyone', '$2a$10$7Lvw5dj9CZChKi9XYaEki.77LrgEJvSMKzQMzKKZvA3ym0QWMRuDy', b'1', b'0', '2019-05-05 23:10:01');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `likes`
--
ALTER TABLE `likes`
  ADD PRIMARY KEY (`like_id`),
  ADD KEY `user_id` (`user_id`,`post_id`),
  ADD KEY `post_id` (`post_id`);

--
-- Chỉ mục cho bảng `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`post_id`,`user_id`),
  ADD KEY `post_id` (`post_id`,`user_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `likes`
--
ALTER TABLE `likes`
  MODIFY `like_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `posts`
--
ALTER TABLE `posts`
  MODIFY `post_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `likes`
--
ALTER TABLE `likes`
  ADD CONSTRAINT `likes_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `posts` (`post_id`),
  ADD CONSTRAINT `likes_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

--
-- Các ràng buộc cho bảng `posts`
--
ALTER TABLE `posts`
  ADD CONSTRAINT `posts_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
