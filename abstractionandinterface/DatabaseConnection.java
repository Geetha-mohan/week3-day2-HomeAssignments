package week3.day2.homeassignment.abstractionandinterface;

public interface DatabaseConnection {
	
	public void connect();
	public void disconnect();
	public String executeUpdate();

}
