create database blockchain;
use blockchain;

-- Create the admin table
CREATE TABLE admin (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);

-- Insert data into the admin table
INSERT INTO admin (username, password) VALUES
    ('admin1', 'password1'),
    ('admin2', 'password2'),
    ('admin3', 'password3');

-- Create the employees table
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);

-- Insert data into the employees table
INSERT INTO employees (username, password) VALUES
    ('employee1', 'password1'),
    ('employee2', 'password2'),
    ('employee3', 'password3');

