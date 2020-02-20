package 算法;

import java.util.Objects;

public class Getwhile {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() == student2.hashCode());
    }
}

class Student {
    String name;
    Integer age;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name) &&
//                Objects.equals(age, student.age);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}