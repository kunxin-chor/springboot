-- Drop the database if it already exists
DROP DATABASE IF EXISTS example_db;

-- Create the database
CREATE DATABASE example_db;

-- Select the newly created database
USE example_db;

-- Create a 'product' table
CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL
);

-- Optionally, insert some initial data
INSERT INTO
    product (name, description, price)
VALUES (
        'Sample Product',
        'This is a sample product.',
        19.99
    );