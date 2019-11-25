package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course
{
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "course")
    private Set<Teacher> teacherSet;

    @ManyToMany(mappedBy = "courseSet")
    private Set<Student> studentSet;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<Teacher> getTeacherSet()
    {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet)
    {
        this.teacherSet = teacherSet;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
