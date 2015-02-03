/**
 *@Project: Team-Excellence-Hibernate-Repository
 *
 *@Date: 2015Äê2ÔÂ3ÈÕ
 *@Copyright: 2015 sg.nomaka.tk Inc. All rights reserved.
 */
package com.team.excellence.hibernate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Cain
 * 
 */
public class JDBCTest {
	public static void main(String args[]) {
		String url = "jdbc:hsqldb:hsql://localhost:9001";
		String className = "org.hsqldb.jdbcDriver";
		String user = "sa";
		String password = "sa";
		String query = "select * from Email";
		try {
			Class.forName(className).newInstance();
			Connection conn = DriverManager.getConnection(url, user, null);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
