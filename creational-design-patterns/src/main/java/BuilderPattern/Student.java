package BuilderPattern;

import java.util.List;

public class Student {
    int rollNo;
    int age;
    String name;
    String fatherName;
    String motherName;
    String phone;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.age = studentBuilder.age;
        this.rollNo = studentBuilder.rollNo;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.phone = studentBuilder.phone;
        this.name = studentBuilder.name;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", phone='" + phone + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
