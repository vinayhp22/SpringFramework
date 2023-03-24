package com.xworkz.poison.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import lombok.extern.slf4j.Slf4j;

@Slf4j
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
//			log.info("rowsAffected"+rowsAffected);

			log.info("=======================UPDATE===============================");

			String query1 = "Update poisonindia Set poison_name = 'Blender' where poison_company = 'vinay'";
			Statement createStatement1 = connectionObj.createStatement();
			int rowsAffected1 = createStatement1.executeUpdate(query1);
			log.info("rowsAffected" + rowsAffected1);

			log.info("========================DELETE==============================");

			String query2 = "Delete from poisonindia where poison_name = 'VINAY H P'";
			Statement createStatement2 = connectionObj.createStatement();
			int rowsAffected2 = createStatement1.executeUpdate(query2);
			log.info("rowsAffected" + rowsAffected2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
