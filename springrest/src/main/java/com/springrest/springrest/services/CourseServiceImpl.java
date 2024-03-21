package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService
{

    List<Course> list;
    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Course(145, "Java Core Course", "Explains Java"));
        list.add(new Course(4343, "Spring Core Course", "Explains Spring"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourses(long courseId) {
        Course c=null;
        for(Course course:list)
            {
                if(course.getId()==courseId)
                {
                    c=course;
                    break;
                }
            }

        return c;
    }

    @Override
    public Course addCourse(Course course) {

        list.add(course);
        return null;
    }

    public Course updateCourse(long courseId) {

        updateCourse().setId(courseId);

        return ResponseEntity.ok(updateCourse()).getBody();
    }

    private Course updateCourse() {
        return null;
    }


    public Course deleteCourse(long courseId) {

        list.remove(courseId);
        return null;
    }
}
