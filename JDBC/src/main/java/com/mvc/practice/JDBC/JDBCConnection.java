package com.mvc.practice.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		Statement stat = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");

			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			rowSet.setUrl("jdbc:mysql://localhost:33065/sivakumari");
			rowSet.setUsername("root");
			rowSet.setPassword("root");
			rowSet.setCommand("select * from Corenuts");
			rowSet.execute();
			while (rowSet.next()) {
				int id = rowSet.getInt(1);
				String name = rowSet.getString(2);
				System.out.println(id + " " + name);

			}

//			conn = DriverManager.getConnection("jdbc:mysql://localhost:33065/sivakumari", "root", "root");
//			stat = conn.createStatement();

			// String sql = "create table Corenuts (id int,name varchar(10))";
			// String sql1="insert into Corenuts values(1,'sivakumari')";

//			ResultSet rs = stat.executeQuery("select * from Corenuts");
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				System.out.println(id + " " + name);
//			}

//		try {
//			stat.executeUpdate(sql1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		} catch (SQLException e) {
			// TODO: handle exception
		}

		finally {
			try {
				stat.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
