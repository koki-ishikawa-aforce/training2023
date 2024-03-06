DROP DATABASE IF EXISTS servlet_sample;

CREATE DATABASE servlet_sample;

USE servlet_sample;

CREATE TABLE users
	(user_id varchar(50) NOT NULL,
	 password varchar(100) NOT NULL,
	 user_name varchar(100),
	 age int(3),
	 created_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
	 created_user varchar(50) NOT NULL,
	 updated_datetime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
	 updated_user varchar(50) NOT NULL,
	 PRIMARY KEY(user_id));

INSERT INTO users
	(user_id, password, user_name, age, created_user, updated_user)
VALUES
	('admin', 'password', '管理者', 99, 'admin', 'admin'),
	('test_user', 'password', 'テストユーザ', 30, 'admin','admin');