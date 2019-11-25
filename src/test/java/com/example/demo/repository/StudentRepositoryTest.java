package com.example.demo.repository;

import com.example.demo.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest
{
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testStudent()
    {
        Optional<Student> student = studentRepository.findById(1L);
        student.ifPresent(System.out::println);
    }

}