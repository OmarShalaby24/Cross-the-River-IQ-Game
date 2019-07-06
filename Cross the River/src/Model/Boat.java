package Model;

import java.util.ArrayList;

public class Boat {
	boolean Right;
	String onTheBoat;
	boolean Occupied1;
	boolean Occupied2;
	
	public Boat() {
		this.Right = false;
		this.onTheBoat = "null";
		this.Occupied1 = false;
		this.Occupied2 = false;
	}
	public boolean isRight() {
		return Right;
	}
	public void setRight(boolean right) {
		Right = right;
	}
	public String getOnTheBoat() {
		return onTheBoat;
	}
	public void setOnTheBoat(String onTheBoat) {
		this.onTheBoat = onTheBoat;
	}
	public boolean isOccupied1() {
		return Occupied1;
	}
	public void setOccupied1(boolean occupied1) {
		Occupied1 = occupied1;
	}
	public boolean isOccupied2() {
		return Occupied2;
	}
	public void setOccupied2(boolean occupied2) {
		Occupied2 = occupied2;
	}
	
	
	
}
