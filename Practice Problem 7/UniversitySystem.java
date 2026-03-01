import java.util.Date;

public class UniversitySystem {
    public static void main(String[] args) {

        Student s1 = new Student(2023831040L, "Nahid", "SWE");
        Student s2 = new Student(2023331069L, "Ratul", "CSE");
        Student s3 = new Student(2023131049L, "Biplob", "EEE");

        Instructor i1 = new Instructor(101, "Fazle", "SWE", "Lecturer");
        Instructor i2 = new Instructor(103, "Shifat", "CSE", "Lecturer");
        Instructor i3 = new Instructor(105, "Adnan", "EEE", "Lecturer");

        Course c1 = new Course(2122, "bst, segment tree, fenwick tree", "ICP", 2, "none");
        Course c2 = new Course(2123, "java, class, method", "OOP", 3, "none");
        Course c3 = new Course(1102, "circuit, electricity", "EEE", 3, "physics");

        CourseOffering co1 = new CourseOffering(s1.id, i1.id, c1.id, new Date(), 1, 830, 2026, "3rd");
        CourseOffering co2 = new CourseOffering(s2.id, i2.id, c2.id, new Date(), 1, 629, 2026, "3rd");
        CourseOffering co3 = new CourseOffering(s3.id, i3.id, c3.id, new Date(), 1, 403, 2026, "2nd");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println(co1);
        System.out.println(co2);
        System.out.println(co3);
    }
}
