DROP TABLE IF EXISTS questions;

CREATE TABLE questions(
    id int NOT NULL AUTO_INCREMENT,
    question_title varchar(255) NOT NULL DEFAULT '',
    first_answer_option varchar(255) NOT NULL DEFAULT '',
    second_answer_option varchar(255) NOT NULL DEFAULT '',
    third_answer_option varchar NOT NULL DEFAULT '',
    fourth_answer_option varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)
);
