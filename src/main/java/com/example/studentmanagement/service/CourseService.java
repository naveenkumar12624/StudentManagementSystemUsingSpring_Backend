package com.example.studentmanagement.service;

import com.example.studentmanagement.exception.ResourceNotFoundException;
import com.example.studentmanagement.model.Course;
import com.example.studentmanagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course getCourseById(Long id) {
        return courseRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with ID: " + id));
    }

    public Course updateCourse(Long id, Course updated) {
        Course existing = getCourseById(id);
        existing.setTitle(updated.getTitle());
        existing.setDescription(updated.getDescription());
        return courseRepo.save(existing);
    }

    public void deleteCourse(Long id) {
        Course course = getCourseById(id);
        courseRepo.delete(course);
    }
}
