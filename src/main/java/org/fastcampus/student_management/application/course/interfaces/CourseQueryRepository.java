package org.fastcampus.student_management.application.course.interfaces;

import java.util.List;
import org.fastcampus.student_management.domain.Course;
import org.fastcampus.student_management.domain.DayOfWeek;

public interface CourseQueryRepository {

    List<Course> getCourseDayOfWeek(DayOfWeek dayOfWeek);

    List<Course> getCourseListByStudent(String studentName);
}
