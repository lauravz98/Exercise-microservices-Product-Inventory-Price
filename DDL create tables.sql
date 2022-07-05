DROP SCHEMA exercise_jul_5;
CREATE SCHEMA exercise_jul_5;
USE exercise_jul_5;

CREATE TABLE inventory(
serial_number BIGINT NOT NULL AUTO_INCREMENT,
quantity INT,
PRIMARY KEY(serial_number)
);

CREATE TABLE price(
serial_number BIGINT NOT NULL AUTO_INCREMENT,
product_name VARCHAR(255),
price DOUBLE,
PRIMARY KEY(serial_number)
);

INSERT INTO inventory(quantity) VALUES
(50),
(10),
(10);

SELECT * FROM inventory;
INSERT INTO price(product_name, price) VALUES
("shirt", 15),
("pants", 30),
("socks", 1.50);

SELECT * FROM price;