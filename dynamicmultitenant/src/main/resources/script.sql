create database nomdb;
DROP TABLE IF EXISTS `nomdb`.`tbl_product`;
CREATE TABLE  `nomdb`.`tbl_product` (  `product_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
`product_name` varchar(50) NOT NULL,  `quantity` int(10) unsigned NOT NULL DEFAULT '0',
`size` varchar(3) NOT NULL,  PRIMARY KEY (`product_id`)) ENGINE=InnoDB;
