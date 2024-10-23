import com.bootcamp.dio.model.Enrollment;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Enrollment enrollment = new Enrollment();

        enrollment.setUser("Higor");
        enrollment.setBootcamp("Java");
        enrollment.setEnrollmentDate(new Date());

    }
}