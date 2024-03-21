package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController
{
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses()
    {

        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourses(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@PathVariable String courseId, @RequestBody Course course)
    {
        return this.courseService.updateCourse(Long.parseLong(courseId));
    }

    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable String courseId)
    {
        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }
}
