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
			Class.forName("org.hsqldb.jdbcDriver");
			Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost:9001/mydb","sa","");
			if (c != null) {
				System.out.println("Connected db success!");
				Statement stmt = c.createStatement();
//				String sql = "CREATE TABLE TBL_USERS(ID INTEGER, NAME VARCHAR, BIRTHDAY DATE);";
//				stmt.execute(sql);
//				sql = "INSERT INTO TBL_USERS(ID, NAME, BIRTHDAY) VALUES ('1', 'ADMIN', SYSDATE);";
//				stmt.executeUpdate(sql);
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
				if (stmt != null) {
					stmt.close();
				}
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
}
