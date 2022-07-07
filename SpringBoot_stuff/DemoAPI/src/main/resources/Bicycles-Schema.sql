DROP TABLE IF EXISTS `bicycles` CASCADE;
create table `bicycles` (
	`id` INTEGER UNIQUE PRIMARY KEY AUTO_INCREMENT,
	`brand` VARCHAR(255),
	`model` VARCHAR(255), 
	`release_year` INTEGER
);