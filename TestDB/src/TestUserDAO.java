
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO{

	String name ="";
	String password = "";

	public void updateUserName(String oldName,String newName){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

	String sql = "update test_table set user_name=? where";
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,password);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	}
}