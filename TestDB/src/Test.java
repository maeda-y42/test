
public class Test {

	public static void main(String[] args){
		TestUserDAO dao = new TestUserDAO();
		dao.selectByPassword("456");
	}
}