package javaoop.exe5;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public List<Student> students =new ArrayList<>();
    public List<Course> courses =new ArrayList<>();
    public List<Enrollment> enrollments =new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
    public void displayEnrollments() {
        for (Enrollment enrollment : enrollments) {
            Student student = enrollment.getStudent();
            Course course = enrollment.getCourse();
            System.out.println("Student: " + student.getId() + " - " + student.getName() +
                    " | Course: " + course.getIdCourse() + " - " + course.getNameCourse());
        }
    }
}
