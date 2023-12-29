package in.ashokit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.ashokit.util.ConnectionFactory;

public class BookDao {
	
	private static final String INSERT_SQL = "insert into books1 values(?,?,?)";
	
	public boolean saveBook(int bookId,String bookName,double price) throws Exception{
		
		
		Connection con = ConnectionFactory.getConnection();
		
	PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		pstmt.setInt(1, bookId);
		pstmt.setString(2, bookName);
		pstmt.setDouble(3, price);
		String ="HITESH";
		int count = pstmt.executeUpdate();
		
		con.close();
		System.out.println("JDBC APPLICATION");
		
		return count > 0 ;
		
		
		
		
	}
	
		
	}


