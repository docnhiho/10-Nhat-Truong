package javaoop.exe5;

public class Course {
    public String IdCourse;
    public String NameCourse;

    public Course(String IdCourse, String NameCourse) {
        this.IdCourse = IdCourse;
        this.NameCourse = NameCourse;
    }

    public Course() {
    }

    public String getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(String idCourse) {
        this.IdCourse = idCourse;
    }

    public String getNameCourse() {
        return NameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.NameCourse = nameCourse;
    }

    public void displayCourse(){
        System.out.println("Course: " + NameCourse + " and " + "Id: " + IdCourse);
    }
}
