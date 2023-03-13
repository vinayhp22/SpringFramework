package com.xworkz.poison.runner;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connectionObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_jdbc", "root",
					"89708@Vhp");
//			String query = "INSERT INTO `new_jdbc`.`poisonindia`\r\n"
//					+"VALUES\r\n"
//					+ "(0,'Dhanuka Agritech',\r\n"
//					+ "'TETRODOTOXIN POISON',\r\n"
//					+ "6000.0,\r\n"
//					+ "'Hazardous Chemicals',\r\n"
//					+ "'Australia'\r\n"
//					+ ");";
//			Statement createStatement = connectionObj.createStatement();
//			int rowsAffected = createStatement.executeUpdate(query);
//			System.out.println("rowsAffected"+rowsAffected);

			System.out.println("=======================UPDATE===============================");

			String query1 = "Update poisonindia Set poison_name = 'Blender' where poison_company = 'vinay'";
			Statement createStatement1 = connectionObj.createStatement();
			int rowsAffected1 = createStatement1.executeUpdate(query1);
			System.out.println("rowsAffected" + rowsAffected1);

			System.out.println("========================DELETE==============================");

			String query2 = "Delete from poisonindia where poison_name = 'VINAY H P'";
			Statement createStatement2 = connectionObj.createStatement();
			int rowsAffected2 = createStatement1.executeUpdate(query2);
			System.out.println("rowsAffected" + rowsAffected2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
