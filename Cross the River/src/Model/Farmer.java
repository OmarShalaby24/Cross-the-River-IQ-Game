package Model;

public class Farmer extends Crosser{
	String Position;
	
	public Farmer() {
		this.Position = "Bank";
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}
	

}
