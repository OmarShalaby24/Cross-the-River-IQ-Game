package View;

import Model.Boat;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Level2 {
	Stage stage;
	
	Image back;
	ImageView background;
	
	Image Raft;
	ImageView boat;
	Image Animal;
	ImageView animal;
	Image Farmer40;
	ImageView farmer40;
	Image Farmer60;
	ImageView farmer60;
	Image Farmer80;
	ImageView farmer80;
	Image Farmer90;
	ImageView farmer90;
	TranslateTransition transition;
	
	Model.Boat B = new Model.Boat();
	Model.Farmer F40 = new Model.Farmer();
	Model.Farmer F60 = new Model.Farmer();
	Model.Farmer F80 = new Model.Farmer();
	Model.Farmer F90 = new Model.Farmer();
	Model.Animal A = new Model.Animal();
	
	public Level2(Stage stage) {
		this.stage = stage;
	}
	
	public void buildScene() {
		AnchorPane root = new AnchorPane();
		back = new Image("Background.jpg");
		background = new ImageView(back);
		background.setX(0);
		background.setY(0);
		background.setFitWidth(1280);
		background.setFitHeight(720);
		
		Raft = new Image("Boat.png");
		boat = new ImageView(Raft);
		boat.setFitWidth(200);
		boat.setFitHeight(120);
		boat.setX(570);
		boat.setY(600);
		
		Animal = new Image("Animal.png");
		animal = new ImageView(Animal);
		animal.setX(510);
		animal.setY(610);
		animal.setFitWidth(80);
		animal.setFitHeight(100);
		animal.setOnMouseClicked(e->{
			ClickAnimal();
		});
		
		Farmer40 = new Image("40.png");
		farmer40 = new ImageView(Farmer40);
		farmer40.setX(440);
		farmer40.setY(580);
		farmer40.setFitWidth(105);
		farmer40.setFitHeight(120);
		farmer40.setOnMouseClicked(e->{
			ClickFarmer40();
		});
		
		Farmer60 = new Image("60.png");
		farmer60 = new ImageView(Farmer60);
		farmer60.setX(360);
		farmer60.setY(580);
		farmer60.setFitWidth(105);
		farmer60.setFitHeight(120);
		
		Farmer80 = new Image("80.png");
		farmer80 = new ImageView(Farmer80);
		farmer80.setX(285);
		farmer80.setY(545);
		farmer80.setFitWidth(105);
		farmer80.setFitHeight(160);
		
		Farmer90 = new Image("90.png");
		farmer90 = new ImageView(Farmer90);
		farmer90.setX(200);
		farmer90.setY(540);
		farmer90.setFitWidth(105);
		farmer90.setFitHeight(160);
		
		root.getChildren().addAll(background,boat,farmer90,farmer80,farmer60,farmer40,animal);
		Scene scene = new Scene(root);
		stage.setScene(scene);
	}
	
	private void Move1(Node A) {
		
	}
	private void Move2(Node A) {
		
	}
	
	private void ClickAnimal() {
		if(!A.isRight() && !B.isRight()) {
			if(!A.isOnBoat()) {
				if(!B.isOccupied1()) {
					B.setOccupied1(true);
					A.setPosition("Pos1");
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(80);
					transition.setByY(-30);
					transition.setNode(animal);
					transition.play();
				}
				else if(!B.isOccupied2()) {
					B.setOccupied2(true);
					A.setPosition("Pos2");
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(150);
					transition.setByY(-40);
					transition.setNode(animal);
					transition.play();
				}
				A.setOnBoat(true);
			}
			else {
				if(A.getPosition().equals("Pos1")) {
					B.setOccupied1(false);
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(-80);
					transition.setByY(30);
					transition.setNode(animal);
					transition.play();
				}
				else if(A.getPosition().equals("Pos2")) {
					B.setOccupied2(false);
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(-150);
					transition.setByY(40);
					transition.setNode(animal);
					transition.play();
				}
				A.setOnBoat(false);
			}
		}
		else if(A.isRight() && B.isRight()) {
			if(!A.isOnBoat()) {
				if(!B.isOccupied1()) {
				}
				else if(!B.isOccupied2()) {
					
				}
			}
			else {
				
			}
		}
	}
	
	private void ClickFarmer40() {
		if(!F40.isRight() && !B.isRight()) {
			if(!F40.isOnBoat()) {
				if(!B.isOccupied1()) {
					travel1(farmer40, F40.isOnBoat());
					B.setOccupied1(true);
					F40.setPosition("Pos1");
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(130);
					transition.setByY(-30);
					transition.setNode(farmer40);
					transition.play();
				}
				else if(!B.isOccupied2()) {
					travel2(farmer40, F40.isOnBoat());
					B.setOccupied2(true);
					F40.setPosition("Pos2");
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(220);
					transition.setByY(-40);
					transition.setNode(farmer40);
					transition.play();
				}
				F40.setOnBoat(true);
			}
			else {
				if(F40.getPosition().equals("Pos1")) {
					B.setOccupied1(false);
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(-130);
					transition.setByY(30);
					transition.setNode(farmer40);
					transition.play();
				}
				else if(F40.getPosition().equals("Pos2")) {
					B.setOccupied2(false);
					//TODO: move
					transition = new TranslateTransition();
					transition.setByX(-220);
					transition.setByY(40);
					transition.setNode(farmer40);
					transition.play();
				}
				F40.setOnBoat(false);
			}
		}
		else if(F40.isRight() && B.isRight()) {
			if(!F40.isOnBoat()) {
				if(!B.isOccupied1()) {
				}
				else if(!B.isOccupied2()) {
					
				}
			}
			else {
				
			}
		}
	}	
	
	
	private void travel1(Node A, boolean onBoat){
		
	}
	private void travel2(Node A, boolean onBoat) {
		
	}
	
}