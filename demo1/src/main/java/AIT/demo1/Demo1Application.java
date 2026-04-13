package AIT.demo1;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(Demo1Application.class, args);

//		Student s = ac.getBean(Student.class);
//		Student s1 = ac.getBean(Student.class);
//		System.out.println(s1 == s);
//		Faculty f = ac.getBean(Faculty.class);
//		System.out.println(s.faculty == f);
//		System.out.println(s.toString());

		ObjectProvider<Student> sprovider = ac.getBeanProvider(Student.class);
		System.out.println(sprovider.getObject());
		Student s = sprovider.getObject("Nurbolot", 4.0);

		ObjectProvider<Faculty> fprovider = ac.getBeanProvider(Faculty.class);
		s.faculty = fprovider.getObject("EmilB", "CS", 400);

		Student s2 = sprovider.getObject();
		System.out.println(s);
	}

}
