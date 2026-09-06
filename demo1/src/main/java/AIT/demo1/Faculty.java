package AIT.demo1;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class Faculty {
    private final ObjectProvider<Student> studentProvider;
    private final Map<String, Course> courseMap;

    public Faculty(ObjectProvider<Student> studentProvider, Map<String, Course> courseMap) {
        this.studentProvider = studentProvider;
        this.courseMap = courseMap;
    }

    public Student createStudent(String name, double gpa, String courseKey) {
        Student student = studentProvider.getObject(name, gpa);
        Course selectedCourse = courseMap.get(courseKey);
        student.setCourse(selectedCourse);
        return student;
    }
} 