package Extends;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Person{
    public Person(){
        System.out.println("this is a Person");
    }
}
public class Teacher extends Person {

    private  String name = "tom";

    public Teacher(){

        System.out.println("this is a teacher");

//        super();
    }

    public static void main(String[] args) throws SQLException {

        Teacher teacher = new Teacher();

//        System.out.println(this.name);
        Connection connection = DriverManager.getConnection("select ");
        connection.setAutoCommit(true); //connection是与事务打交道的
        Statement statement = connection.createStatement();
        statement.executeQuery("");
    }
}
