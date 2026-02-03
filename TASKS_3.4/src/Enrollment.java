import java.io.*;

public class Enrollment implements Serializable {
    private String enrollmentDate;
    private Student student;
    private Course course;


    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
        this.student = student;
        this.course = course;


    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    @Override
    public String toString() {
        return "Student: " + student + "\nCourse: " + course + "\nEnrollment date: " + getEnrollmentDate() + "\n";
    }
}


