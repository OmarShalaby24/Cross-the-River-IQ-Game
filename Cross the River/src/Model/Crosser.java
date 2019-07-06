package Model;

public abstract class Crosser {
	boolean onBoat;
	boolean right;
	
	public Crosser() {
		this.onBoat = false;
		this.right = false;
	}

	public boolean isOnBoat() {
		return onBoat;
	}

	public void setOnBoat(boolean onBoat) {
		this.onBoat = onBoat;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}
	
}
