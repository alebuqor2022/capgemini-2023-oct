CREATE SCHEMA `capgemini_asturias` ;

use capgemini_asturias;

CREATE TABLE `capgemini_asturias`.`regions` (
  `region_id` INT NOT NULL,
  `region_name` VARCHAR(45) NULL,
  PRIMARY KEY (`region_id`));

CREATE TABLE `capgemini_asturias`.`countries` (
  `country_id` INT NOT NULL,
  `country_name` VARCHAR(45) NOT NULL,
  `region_id` INT NOT NULL,
  PRIMARY KEY (`country_id`),
  INDEX `region_id_idx` (`region_id` ASC) VISIBLE,
  CONSTRAINT `region_id`
    FOREIGN KEY (`region_id`)
    REFERENCES `capgemini_asturias`.`regions` (`region_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `capgemini_asturias`.`locations` (
  `location_id` INT NOT NULL,
  `street_address` VARCHAR(45) NULL,
  `postal_code` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `state_province` VARCHAR(45) NULL,
  `country_id` INT NULL,
  PRIMARY KEY (`location_id`),
  INDEX `country_id_idx` (`country_id` ASC) VISIBLE,
  CONSTRAINT `country_id`
    FOREIGN KEY (`country_id`)
    REFERENCES `capgemini_asturias`.`countries` (`country_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `capgemini_asturias`.`managers` (
  `manager_id` INT NOT NULL,
  `manager_name` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`manager_id`));

CREATE TABLE `capgemini_asturias`.`departments` (
  `department_id` INT NOT NULL,
  `department_name` VARCHAR(45) NOT NULL,
  `manager_id` INT NULL,
  `location_id` INT NULL,
  PRIMARY KEY (`department_id`),
  INDEX `manager_id_idx` (`manager_id` ASC) VISIBLE,
  INDEX `location_id_idx` (`location_id` ASC) VISIBLE,
  CONSTRAINT `manager_id`
    FOREIGN KEY (`manager_id`)
    REFERENCES `capgemini_asturias`.`managers` (`manager_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `location_id`
    FOREIGN KEY (`location_id`)
    REFERENCES `capgemini_asturias`.`locations` (`location_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



CREATE TABLE `capgemini_asturias`.`jobs` (
  `job_id` INT NOT NULL,
  `job_title` VARCHAR(45) NOT NULL,
  `min_salary` INT NULL,
  `max_salary` INT NULL,
  PRIMARY KEY (`job_id`));

CREATE TABLE `capgemini_asturias`.`employees` (
  `employee_id` INT NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `phone_number` INT NULL,
  `hire_date` DATE NULL,
  `job_id` INT NULL,
  `salary` INT NULL,
  `commission_pct` INT NULL,
  `manager_id` INT NULL,
  `department_id` INT NULL,
  PRIMARY KEY (`employee_id`),
  INDEX `job_id_idx` (`job_id` ASC) VISIBLE,
  INDEX `department_id_idx` (`department_id` ASC) VISIBLE,
  INDEX `manager_id_idx` (`manager_id` ASC) VISIBLE,
  CONSTRAINT `job_id`
    FOREIGN KEY (`job_id`)
    REFERENCES `capgemini_asturias`.`jobs` (`job_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_manager_id`
    FOREIGN KEY (`manager_id`)
    REFERENCES `capgemini_asturias`.`managers` (`manager_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `capgemini_asturias`.`departments` (`department_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);