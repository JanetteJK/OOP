import java.io.*;

public class Main {
    public static void main(String[]args){
        File file = new File("TASKS_3.4/src/enrollments.ser");
        Student student;
        Course course;
        Enrollment enrollment;


        Student s1 = new Student(1, "Tony G.", 20);
        Student s2 = new Student(2, "Sarah J.", 19);
        Student s3 = new Student(3,"Rudolf S.", 25);

        Course c1 = new Course("420", "Green Earth 101", "Marley Bobert");
        Course c2 = new Course("6969", "Feminine Men In Dresses", "Paul Rupert");
        Course c3 = new Course("1111", "Religious symbolism", "Jesus Christopher");

        Enrollment e1 = new Enrollment(s2,c1,"1.1.2001");
        Enrollment e2 = new Enrollment(s1,c3,"1.2.2002");
        Enrollment e3 = new Enrollment(s2,c2, "1.10.2006");

        try (
                FileOutputStream outputstream = new FileOutputStream("TASKS_3.4/src/enrollments.ser");
                ObjectOutputStream objects = new ObjectOutputStream(outputstream);
                ){
                objects.writeObject(s1);
                objects.writeObject(s2);
                objects.writeObject(s3);
                objects.writeObject(c1);
                objects.writeObject(c2);
                objects.writeObject(c3);
                objects.writeObject(e1);
                objects.writeObject(e2);
                objects.writeObject(e3);
        } catch (Exception e) {
            System.err.println("Writing: " + e);
        }

        if (file.exists() && file.isFile()){
            try (
                    FileInputStream inputstream = new FileInputStream("enrollments.ser");
                    ObjectInputStream objects = new ObjectInputStream(inputstream);
                    ){
                s1 = (Student) objects.readObject();
                s2 = (Student) objects.readObject();
                c1 = (Course) objects.readObject();
                e1 = (Enrollment) objects.readObject();
            }catch (Exception e){
                System.err.println("Reading: ");
            }
        }
        System.out.println(c1 + "\n" + s1 + "\n" + s2 + "" + e1);
    }
}
