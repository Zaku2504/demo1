package AIT.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    String name;
    double gpa;
    Course course;

    public Student() {
        this.name = "";
        this.gpa = 0.0;
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", GPA: " + gpa + ", Course: " + course;
    }
}