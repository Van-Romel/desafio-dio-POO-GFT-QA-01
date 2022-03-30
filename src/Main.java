import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

import java.time.LocalDate;
import java.util.HashSet;

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

        Bootcamp bootcamp = new Bootcamp("Bootcamp GFT Quality Assurance #1 ",
                "Conheça já o Bootcamp GFT Quality Assurance #1: um programa feito para você que planeja desenvolver suas habilidades em QA. Com cursos, desafios de códigos, mentorias e desafios de projeto, suas chances de ganhar destaque no mercado só aumentam! Não perca essa chance e inscreva-se já.",
                new HashSet<>(), new HashSet<>());

        bootcamp.getEvent().add(course1);
        bootcamp.getEvent().add(course2);
        bootcamp.getEvent().add(mentorship1);

        Dev devRomel = new Dev();
        devRomel.setName("Romel");
        devRomel.inscribeBootcamp(bootcamp);
        System.out.println("Inscribed events " + devRomel.getInscribedEvents());
        devRomel.toProgress();
        System.out.println("Inscribed events " + devRomel.getInscribedEvents());
        System.out.println("Completed events " + devRomel.getCompletedEvents());

        Dev devJesse = new Dev();
        devJesse.setName("Jessé");
        devJesse.inscribeBootcamp(bootcamp);
        System.out.println("Inscribed events " + devJesse.getInscribedEvents());
        System.out.println("Completed events " + devJesse.getCompletedEvents());

    }
}
