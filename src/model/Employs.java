package model;

public class Employs {
    String name;
    int age;
    String department;

    // parametrised construction

    public Employs(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    // getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
