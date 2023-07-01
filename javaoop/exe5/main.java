package javaoop.exe5;

public class main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student = new Student("01", "Nhat");
        Course course = new Course("j1", "java");
        student.displayStudent();
        course.displayCourse();
    }
}
