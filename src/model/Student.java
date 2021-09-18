package model;

public class Student {
    String name;
    int age;
    int roll_no;

    // parametrized construction

    public Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
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

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}
