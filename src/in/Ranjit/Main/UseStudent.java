package in.Ranjit.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.Ranjit.web.Student;

public class UseStudent {

    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext(
                "in/Ranjit/xml/beanconfig.xml");

        Student beanconfig =
            context.getBean("stdObj", Student.class);

        beanconfig.display();
    }
}