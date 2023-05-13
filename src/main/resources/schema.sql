CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL
);

INSERT INTO users (name, email)
VALUES ('John Doe', 'johndoe@example.com'),
       ('Jane Doe', 'janedoe@example.com');