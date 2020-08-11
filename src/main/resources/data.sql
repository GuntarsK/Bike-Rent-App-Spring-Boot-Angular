DROP TABLE IF EXISTS bike;

CREATE TABLE bike (
    id INT AUTO_INCREMENT PRIMARY KEY,
    manufacturer VARCHAR(250) NOT NULL,
    model VARCHAR(250) NOT NULL,
    price DOUBLE NOT NULL,
    category VARCHAR(250) NOT NULL,
    quantity INT NOT NULL
);

INSERT INTO bike (manufacturer, model, price, category, quantity) VALUES
    ('Trek', 'Procaliber', 20.0, 'Sport', 10),
    ('Trek', 'X-Caliber', 15.0, 'Sport', 15),
    ('Trek', 'Supercaliber', 25.0, 'Sport', 5);


DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    phone_number VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL
);

INSERT INTO customer (first_name, last_name, phone_number, email) VALUES
    ('John', 'Doe', '29001122', 'john.doe@gmail.com'),
    ('Jane', 'Doe', '29112233', 'jane.doe@gmail.com'),
    ('Tom', 'Sawyer', '29223344', 'tom.sawyer@gmail.com');
