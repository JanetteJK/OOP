import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Enrollment implements Serializable {
    private String enrollmentDate;


    public Enrollment(Student student, Course course, String enrollmentDate){
        this.enrollmentDate = enrollmentDate;
        Student student1 = student;
        Course course1 = course;

    }

    public String getEnrollmentDate(){
        return enrollmentDate;
    }

    @Override
    }
    public String toString(){
        return "Student: " + student + "\nCourse: " + course + "\nEnrollment date: " + getEnrollmentDate() + "\n";
    }
}
