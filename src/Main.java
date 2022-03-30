import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Java Course");
        course1.setWorkload(100);

        Course course2 = new Course();
        course2.setTitle("GoLang");
        course2.setDescription("GoLang Course");
        course2.setWorkload(18);

        System.out.println(course1);
        System.out.println(course2);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Mentorship 1");
        mentorship1.setDescription("Mentorship 1 description");
        mentorship1.setDate(LocalDate.now());

        System.out.println(mentorship1);
    }
}
