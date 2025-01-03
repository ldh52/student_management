package org.fastcampus.student_management.repo;

import java.util.HashMap;
import java.util.Map;
import org.fastcampus.student_management.application.course.interfaces.CourseCommandRepository;
import org.fastcampus.student_management.domain.Course;

public class CourseCommandRepositoryImpl implements CourseCommandRepository {

    private final Map<String, Course> courseMap = new HashMap<>();

    public void save(Course course) {
        courseMap.put(course.getCourseName(), course);
    }
}
