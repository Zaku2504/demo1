package AIT.demo1;

import org.springframework.stereotype.Component;

public interface Course {
    String getTitle();
}

@Component("java")
class JavaCourse implements Course {
    public String getTitle() { return "Java"; }
}

@Component("python")
class PythonCourse implements Course {
    public String getTitle() { return "Python"; }
}

@Component("web")
class WebCourse implements Course {
    public String getTitle() { return "Web Development"; }
}