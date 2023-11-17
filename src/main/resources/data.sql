DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS answers;

CREATE TABLE questions(
    id int NOT NULL AUTO_INCREMENT,
    question_title varchar(255) NOT NULL DEFAULT '',
    first_answer_option varchar(255) NOT NULL DEFAULT '',
    second_answer_option varchar(255) NOT NULL DEFAULT '',
    third_answer_option varchar NOT NULL DEFAULT '',
    fourth_answer_option varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)
);

CREATE TABLE answers(
    id int NOT NULL AUTO_INCREMENT,
    question_id int NOT NULL,
    question_title varchar(255) NOT NULL DEFAULT '',
    answer_option varchar(255) NOT NULL DEFAULT '',
    user_id int NOT NULL
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)

);

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL DEFAULT '',
    last_name varchar(255) NOT NULL DEFAULT '',
    email varchar(255) NOT NULL DEFAULT '',
    age int NOT NULL DEFAULT '',
    address varchar(255) NOT NULL DEFAULT '',
    joining_date varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)
