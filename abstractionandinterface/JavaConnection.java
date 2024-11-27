package week3.day2.homeassignment.abstractionandinterface;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatabaseConnection con = new JavaConnection();
		con.connect();
		con.disconnect();
		System.out.println("Returned text is "+ con.executeUpdate());

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connected");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected");
	}

	@Override
	public String executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("update executed");
		return "Interface";
		
	}

}
