-- SQL File ran to create the current data on the PG Database
CREATE TABLE foods (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255),
    image VARCHAR(255),
    price INTEGER
);