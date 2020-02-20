package com.cy.pj.hashtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//连接数据库的核心代码  JDBC
public class GetJDBC {
	
	public static void main(String[] args){
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8",
					"15222083907",
					"614826532");
			//3.获取传输器
			PreparedStatement prepareStatement = connection.prepareStatement("select * from tab_dept");
			//4.发送sql语句到数据库
			ResultSet executeQuery = prepareStatement.executeQuery();
			//5.处理结果集
			while (executeQuery.next()) {
				String string = executeQuery.getString(1);
				String string2 = executeQuery.getString(2);
				System.out.println(string);
				System.out.println(string2);
			}
			//6.关闭资源
			connection.close();
			prepareStatement.close();
			executeQuery.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
