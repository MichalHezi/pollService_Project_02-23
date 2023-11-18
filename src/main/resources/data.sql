DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS answers;

CREATE TABLE questions(
    id int NOT NULL AUTO_INCREMENT,
    question_title varchar(255) NOT NULL DEFAULT '',
    A varchar(255) NOT NULL DEFAULT '',
    B varchar(255) NOT NULL DEFAULT '',
    C varchar NOT NULL DEFAULT '',
    D varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)
);

CREATE TABLE answers(
    id int NOT NULL AUTO_INCREMENT,
    question_id int NOT NULL,
    question_title varchar(255) NOT NULL DEFAULT '',
    answer_option varchar(255) NOT NULL DEFAULT '',
    user_id int NOT NULL,
    PRIMARY KEY (id)
    FOREIGN KEY (question_id) REFERENCES questions(id)
    FOREIGN KEY (question_title) REFERENCES questions(question_title)

);


INSERT INTO questions (question_title,A,B,C,D)
VALUES ('Between the following, what do you most love to do ?',
        'Watch TV',
        'Play the computer',
        'Hanging out with friends',
        'Travel the world'
        );

INSERT INTO questions (question_title,A,B,C,D)
VALUES ('Where is your preferred place to travel ?',
        'USA',
        'France',
        'South America',
        'Thailand'
        );

INSERT INTO questions (question_title,A,B,C,D)
VALUES ('Between the following, what do you most like to eat ?',
        'Pizza',
        'Hamburger',
        'Fish',
        'Chocolate'
        );

INSERT INTO questions (question_title,A,B,C,D)
VALUES ('Of the following, which pastime would you prefer ?',
        'Watch a movie',
        'Go to the beach',
        'Eat in a restaurant',
        'Play snooker'
        );

INSERT INTO questions (question_title,A,B,C,D)
VALUES ('Of the following, which movie do you like the most ?',
        'Harry Potter',
        'Titanic',
        'John wick',
        'Fast&Furious'
        );
