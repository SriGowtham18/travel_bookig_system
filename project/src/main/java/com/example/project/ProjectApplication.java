package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		connect();
	}
	public static void connect() {
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="root";
		
		try(Connection conn=DriverManager.getConnection(url, user, pass);)
		
		{
		if(conn!=null) {
			System.out.println("Connection successful");
		}
		}
		catch(Exception e) {
			System.out.println("Connection Unsuccessfull"+e.getMessage());
		}
	}
}
