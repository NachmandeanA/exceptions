import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Java");
        try {
            course.print();
        } catch (Exception e) {

        }
    }
}
