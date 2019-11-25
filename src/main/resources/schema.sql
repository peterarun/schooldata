CREATE TABLE student (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE course (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE teacher (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    course_id INTEGER NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE stud_tch_mp (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    student_id INTEGER NOT NULL,
    teacher_id INTEGER NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE stud_crs_mp (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    student_id INTEGER NOT NULL,
    course_id INTEGER NOT NULL,
    PRIMARY KEY (id)
);
