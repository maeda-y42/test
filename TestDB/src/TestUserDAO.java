
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUserDAO{

	//String name = "taro";
	//String password = "123";
  public void insert(int user_id,String name,String password){
	  DBConnector db = new DBConnector();
	  Connection con = db.getConnection();

	  String sql = "insert into test_table values(?,?,?)";
	  try{
		  PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1,user_id);
		  ps.setString(2,name);
		  ps.setString(3,password);

		 // ResultSet rs=ps.executeQuery();
		 // while(rs.next()){
			 // System.out.println(rs.getString("user_name"));
			 // System.out.println(rs.getString("password"));
		  int i=ps.executeUpdate();
		  if(i>0){
			  System.out.println(i+"件更新されました");
			  }//else{
				 // System.out.println("該当するデータはありませんでした");
			  //}
	  }catch(SQLException e){
		  e.printStackTrace();
	  }try{
		  con.close();
	  }catch(SQLException e){
		  e.printStackTrace();
	  }
  }
}