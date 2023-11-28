package com.mvc.practice.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCPracticeDemo {
	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:33065/sivakumari", "root", "root");

			statement = connection.createStatement();
			int id = 1;
			String n = "priya";
			statement.executeUpdate("insert into Corenuts values(" + id + ",'" + n + "')");

//			PreparedStatement pre = connection.prepareStatement("insert into  Corenuts values(?,?)");
//			pre.setInt(1,'4');
//			pre.setString(2,"lakshman");
		} catch (SQLException e) {
			System.out.println("exception error" + e);
		} finally {
			statement.close();
			connection.close();
		}
		System.out.println("end");

		// rowset
		JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
		rowset.setUrl("jdbc:mysql://localhost:33065/sivakumari");
		rowset.setUsername("root");
		rowset.setPassword("root");
		rowset.setCommand("select * from Corenuts");
		rowset.execute();
		while (rowset.next()) {
			int id = rowset.getInt("id");
			String name = rowset.getString("name");
			System.out.println(id + " " + name);

		}

	}

}
