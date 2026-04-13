package AIT.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Faculty {
    String dean;
    String name;
    int capacityStudents;

    public Faculty() {
//        dean = "Dr. Munara";
//        name = "AIT";
//        capacityStudents = 120;
    }

    public Faculty(String deanname, String fname, int cap){
        dean = deanname;
        name = fname;
        capacityStudents=cap;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "dean='" + dean + '\'' +
                ", name='" + name + '\'' +
                ", capacityStudents='" + capacityStudents + '\'' +
                '}';
    }
}
