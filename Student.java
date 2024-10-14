import java.util.*;



public class Student {
    private String name;
    private int roll;
    private int age;
    private String department;


    public Student() {

    }

    public Student(String name, int roll, int age, String department) {
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return department;
    }

    public void setDept(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override public String toString()
    {

        // Returning the record
        return "Students{"
                + "name=" + name + ", roll no=" + roll
                + ", age=" + age + ",department=" + department + '}';
    }
}
