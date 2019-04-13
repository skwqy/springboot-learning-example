CREATE TABLE `tbl_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `province_id` int(11) NOT NULL COMMENT '身份编号',
  `city_name` varchar(100) NOT NULL COMMENT '城市名称',
  `description` varchar(256) NOT NULL COMMENT '城市描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `springboot`.`tbl_city` (`province_id`, `city_name`, `description`) VALUES('25','南京', '文化名城，八朝古都') ;