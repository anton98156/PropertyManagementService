CREATE TABLE IF NOT EXISTS propertyTable (
    id INT AUTO_INCREMENT PRIMARY KEY,
    address varchar(50) NOT NULL,
    description varchar(50) NOT NULL,
    space INT NOT NULL,
    sublease BOOLEAN NOT NULL
);