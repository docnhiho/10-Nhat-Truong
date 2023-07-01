package javaoop.exe5;

public class Student {
    public String id;
    public String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayStudent(){
        System.out.println("Name: " + name + " and " + "Id: " + id);
    }
}
