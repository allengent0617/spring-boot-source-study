CREATE TABLE `account` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT 'user id',
   `name` varchar(16) NOT NULL COMMENT 'user name ',
  `age` int  COMMENT 'user age',
  PRIMARY KEY (`id`)
) COMMENT 'user table';

