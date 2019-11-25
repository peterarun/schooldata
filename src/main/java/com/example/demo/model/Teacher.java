package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class Teacher
{
    @Id
    private Long id;

    @ManyToOne
    private Course course;

    @ManyToMany(mappedBy = "teacherSet")
    private Set<Student> studentSet;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Course getCourse()
    {
        return course;
    }

    public void setCourse(Course course)
    {
        this.course = course;
    }

    public Set<Student> getStudentSet()
    {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet)
    {
        this.studentSet = studentSet;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append("id=").append(id);
        sb.append(", course=").append(course);
        sb.append('}');
        return sb.toString();
    }
}
