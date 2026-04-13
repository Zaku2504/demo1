package AIT.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    String name;
    double gpa;
    //@Autowired
    Faculty faculty;


    public Student(){
        name="";
        gpa=0.0;
    }

    public Student(String s, double g){
        name=s;
        gpa=g;
    }


    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", faculty=" + faculty +
                '}';
    }
}
