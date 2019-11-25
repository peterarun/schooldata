insert into student(id, name) values(1, 'Arun');
insert into student(id, name) values(2, 'Eva');
insert into student(id, name) values(3, 'Merine');
insert into student(id, name) values(4, 'Jacu');

insert into teacher(id, name, course_id) values(1, 'Neethu', 1);
insert into teacher(id, name, course_id) values(2, 'Jayasree', 1);
insert into teacher(id, name, course_id) values(3, 'Manju', 3);

insert into course(id, name) values(1, 'Maths');
insert into course(id, name) values(2, 'Chemistry');
insert into course(id, name) values(3, 'Physics');
insert into course(id, name) values(4, 'CA');
insert into course(id, name) values(5, 'English');

insert into stud_tch_mp(student_id, teacher_id) values(1, 1);
insert into stud_tch_mp(student_id, teacher_id) values(1, 3);
insert into stud_tch_mp(student_id, teacher_id) values(2, 2);
insert into stud_tch_mp(student_id, teacher_id) values(3, 2);
insert into stud_tch_mp(student_id, teacher_id) values(4, 2);

insert into stud_crs_mp(student_id, course_id) values(1, 1);
insert into stud_crs_mp(student_id, course_id) values(1, 2);
insert into stud_crs_mp(student_id, course_id) values(1, 3);
insert into stud_crs_mp(student_id, course_id) values(2, 2);
