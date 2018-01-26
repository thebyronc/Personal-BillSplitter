SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS users (
  id int PRIMARY KEY auto_increment,
  name VARCHAR,
  email VARCHAR
);

--CREATE TABLE IF NOT EXISTS receipts (
--  id int PRIMARY KEY auto_increment,
--  name VARCHAR,
--  name VARCHAR,
--  email VARCHAR
--);
--
--CREATE TABLE IF NOT EXISTS items (
--  id int PRIMARY KEY auto_increment,
--  teamId int,
--  name VARCHAR,
--  email VARCHAR
--);