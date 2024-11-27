package week3.day2.homeassignment.abstractionandinterface;

public class JavaConnect extends MySqlConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnect con = new JavaConnect();
		con.connect();
		con.disconnect();
		System.out.println("string returned is "+con.executeUpdate());
		con.executeQuery();

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect method");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect method");
		
	}

	@Override
	public String executeUpdate() {
		// TODO Auto-generated method stub
		return "TestLeaf";
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("abstract method implemented");
	}

}
