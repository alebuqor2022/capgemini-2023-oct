INSERT INTO `capgemini_asturias`.`employees` (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `hire_date`, `job_id`, `salary`, `commission_pct`, `department_id`) VALUES ('99', 'Whalen', 'Hugo', 'hugo@gmail', '111', '2000/09/11', '3', '4000', '10', '10');
INSERT INTO `capgemini_asturias`.`employees` (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `job_id`, `salary`, `commission_pct`, `manager_id`, `department_id`) VALUES ('100', 'Fay', 'Maria', 'mari@gmail', '222', '1', '3000', '20', '100', '20');
INSERT INTO `capgemini_asturias`.`employees` (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `job_id`, `salary`, `commission_pct`, `manager_id`, `department_id`) VALUES ('101', 'De Haan', 'Patricia', 'pato@gmail', '333', '2', '2000', '22', '103', '20');
INSERT INTO `capgemini_asturias`.`employees` (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `job_id`, `salary`, `commission_pct`, `manager_id`, `department_id`) VALUES ('102', 'Kochhar', 'Juan', 'juan@gmail', '444', '3', '1000', '21', '124', '90');
INSERT INTO `capgemini_asturias`.`employees` (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `job_id`, `salary`, `commission_pct`, `manager_id`, `department_id`) VALUES ('103', 'King', 'Sergio', 'ser@gmail', '555', '4', '2000', '13', '149', '90');
INSERT INTO `capgemini_asturias`.`employees` (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `job_id`, `salary`, `commission_pct`, `manager_id`, `department_id`) VALUES ('104', 'Higgins', 'Pedro', 'pr@gmail', '666', '5', '7000', '15', '200', '110');
INSERT INTO `capgemini_asturias`.`employees` (`employee_id`, `first_name`, `last_name`, `email`, `phone_number`, `job_id`, `salary`, `commission_pct`, `manager_id`) VALUES ('105', 'Grant', 'Luis', 'gr@gmail', '777', '2', '8500', '17', '201');

UPDATE `capgemini_asturias`.`employees` SET `hire_date` = '2001-11-07' WHERE (`employee_id` = '100');
UPDATE `capgemini_asturias`.`employees` SET `hire_date` = '2002-08-01' WHERE (`employee_id` = '101');
UPDATE `capgemini_asturias`.`employees` SET `hire_date` = '2005-1-31' WHERE (`employee_id` = '102');
UPDATE `capgemini_asturias`.`employees` SET `hire_date` = '2010-04-01' WHERE (`employee_id` = '103');
UPDATE `capgemini_asturias`.`employees` SET `hire_date` = '2015-06-09' WHERE (`employee_id` = '104');
UPDATE `capgemini_asturias`.`employees` SET `hire_date` = '2020-03-01' WHERE (`employee_id` = '105');
