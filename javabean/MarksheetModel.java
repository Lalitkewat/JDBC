package javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

/**
 * @author Lalit. Write a program to create marksheet using JDBC.
 *
 */
public class MarksheetModel {

	public static void add(Marksheet bean) throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("javabean.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
		// "pass1234");
		// conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("INSERT INTO MARKSHEET VALUES(?,?,?,?,?,?,?)");

		ps.setInt(1, bean.getSTD_ID());
		ps.setInt(2, bean.getROLLNo());
		ps.setString(3, bean.getFname());
		ps.setString(4, bean.getLname());
		ps.setInt(5, bean.getPHY());
		ps.setInt(6, bean.getCHE());
		ps.setInt(7, bean.getMATHS());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Records inserted");
		ps.close();
		conn.close();
	}

	public static void update(Marksheet m1) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("javabean.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
		// "pass1234");
		// conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement(
				"UPDATE MARKSHEET SET ROLLNO=?, FNAME=?, LNAME =?, PHY=?,CHE=?,MATHS=? WHERE STD_ID=?");

		ps.setInt(1, m1.getROLLNo());
		ps.setString(2, m1.getFname());
		ps.setString(3, m1.getLname());
		ps.setInt(4, m1.getPHY());
		ps.setInt(5, m1.getCHE());
		ps.setInt(6, m1.getMATHS());
		ps.setInt(7, m1.getSTD_ID());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Records Updated");
		ps.close();
		conn.close();
	}

	public static void delete(Marksheet m2) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("javabean.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
		// "pass1234");
		// conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("DELETE  FROM MARKSHEET WHERE STD_ID=?");

		ps.setInt(1, m2.getSTD_ID());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Records Deleted");
		ps.close();
		conn.close();
	}

	public static void select(Marksheet m3) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("javabean.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
		// "pass1234");
		// conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("SELECT * FROM MARKSHEET ");

		ResultSet rs = ps.executeQuery();
		System.out.println("STD_ID\tROLLNO\tFNAME\tLNAME\tPHY\tCHE\tMATHS");

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getString(6));
			System.out.println("\t" + rs.getString(7));
		}
		conn.commit();
		System.out.println("Records selected");
		ps.close();
		conn.close();
	}

	public static void maritlist(Marksheet m4) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("javabean.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);

		// Class.forName("com.mysql.jdbc.Driver").newInstance();
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
		// "pass1234");
		// conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement(
				"select *,(phy+che+maths)as total, (((phy+che+maths)/300)*100)as percentage from marksheet where ((phy + che + maths)/300*100)>= 40 order by percentage desc limit 0,10;");
		ResultSet rs = ps.executeQuery();
		System.out.println("STD_ID\tROLLNO\tFNAME\tLNAME\tPHY\tCHE\tMATHS\tTOTAL\tPERCENTAGE");

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getString(6));
			System.out.print("\t" + rs.getString(7));
			System.out.print("\t" + rs.getString(8));
			System.out.println("\t" + rs.getString(9) + "%");
		}
		conn.commit();
		System.out.println("MARIT LIST UPLOADED");
		ps.close();
		conn.close();

	}

	public static void search(Marksheet m3) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("javabean.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		conn.setAutoCommit(false);

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
		// "pass1234");
		// conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("SELECT * FROM MARKSHEET WHERE ROLLNO=?");
		ps.setInt(1, m3.getROLLNo());
		ResultSet rs = ps.executeQuery();
		System.out.println("STD_ID\tROLLNO\tFNAME\tLNAME\tPHY\tCHE\tMATHS");

		while (rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getString(6));
			System.out.println("\t" + rs.getString(7));
		}
		conn.commit();
		System.out.println("Records selected");
		ps.close();
		conn.close();
	}
}
