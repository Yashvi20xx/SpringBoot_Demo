package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService
{
    public List<Course> getCourses();

    public Course getCourses(long courseId);

    public Course addCourse(Course course);

    public Course deleteCourse(long course);

    public Course updateCourse(long l);
}
