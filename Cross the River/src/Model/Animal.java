package Model;

public class Animal extends Crosser{
	String Position;
	
	public Animal() {
		this.Position = "Bank";
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}
	
}
