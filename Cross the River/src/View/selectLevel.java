package View;

import java.util.logging.Level;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class selectLevel {
	Stage stage;
	Image back;
	ImageView background;
	Image L1;
	ImageView Level1;
	Image L2;
	ImageView Level2;
	Button Back;
	
	public selectLevel(Stage stage) {
		this.stage = stage;
	}
	
	public void buildScene() {
		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root,1280,720);
		
		back = new Image("MainMenu.jpg");
		background = new ImageView(back);
		background.setX(0);
		background.setY(0);
		background.setFitWidth(1280);
		background.setFitHeight(720);
		
		Back = new Button("Back");
		Back.setFont(Font.font("Cooper Black",21));
		Back.setStyle("-fx-background-color:yellow;"+"-fx-background-radius:50;");
		Back.setLayoutX(10);
		Back.setLayoutY(10);
		Back.setPrefHeight(50);
		Back.setPrefWidth(150);
		Back.setOnMouseEntered(e->{
			mouseEnterButton(Back);
		});
		Back.setOnMouseExited(e->{
			mouseExitButton(Back);
		});
		Back.setOnMousePressed(e->{
			mousePressButton(Back);
		});
		Back.setOnMouseReleased(e->{
			mouseReleaseButton(Back);
		});
		Back.setOnMouseClicked(e->{
			mainMenu mainmenu = new mainMenu(stage);
			mainmenu.buildScene();
		});
		
		L1 = new Image("Story1.png");
		Level1 = new ImageView(L1);
		Level1.setX(200);
		Level1.setY(210);
		Level1.setFitWidth(400);
		Level1.setFitHeight(300);
		Level1.setOnMouseEntered(e->{
			mouseEnterButton(Level1);
		});
		Level1.setOnMouseExited(e->{
			mouseExitButton(Level1);
		});
		Level1.setOnMousePressed(e->{
			mousePressButton(Level1);
		});
		Level1.setOnMouseReleased(e->{
			mouseReleaseButton(Level1);
		});
		Level1.setOnMouseClicked(e->{
			Level1 l1 = new Level1(stage);
			l1.buildScene();
		});
		
		L2 = new Image("Story2.png");
		Level2 = new ImageView(L2);
		Level2.setX(680);
		Level2.setY(210);
		Level2.setFitWidth(400);
		Level2.setFitHeight(300);
		Level2.setOnMouseEntered(e->{
			mouseEnterButton(Level2);
		});
		Level2.setOnMouseExited(e->{
			mouseExitButton(Level2);
		});
		Level2.setOnMousePressed(e->{
			mousePressButton(Level2);
		});
		Level2.setOnMouseReleased(e->{
			mouseReleaseButton(Level2);
		});
		Level2.setOnMouseClicked(e->{
			Level2 l2 = new Level2(stage);
			l2.buildScene();
		});
		

		root.getChildren().addAll(background,Level1,Level2,Back);
		stage.setScene(scene);
	}
	
	private void mouseEnterButton(ImageView A) {
		A.setFitWidth(A.getFitWidth()+6);
		A.setFitHeight(A.getFitHeight()+6);;
		A.setX(A.getX()-3);
		A.setY(A.getY()-3);
	}
	private void mouseExitButton(ImageView A) {
		A.setFitWidth(A.getFitWidth()-6);
		A.setFitHeight(A.getFitHeight()-6);;
		A.setX(A.getX()+3);
		A.setY(A.getY()+3);
	}
	private void mousePressButton(ImageView A) {
		A.setFitWidth(A.getFitWidth()-6);
		A.setFitHeight(A.getFitHeight()-6);;
		A.setX(A.getX()+3);
		A.setY(A.getY()+3);
	}
	private void mouseReleaseButton(ImageView A) {
		A.setFitWidth(A.getFitWidth()+6);
		A.setFitHeight(A.getFitHeight()+6);;
		A.setX(A.getX()-3);
		A.setY(A.getY()-3);
	}

	private void mouseEnterButton(Button A) {
		A.setFont(Font.font("Cooper Black",22));
		A.setPrefWidth(A.getPrefWidth()+6);
		A.setPrefHeight(A.getPrefHeight()+6);;
		A.setLayoutX(A.getLayoutX()-3);
		A.setLayoutY(A.getLayoutY()-3);
	}
	private void mouseExitButton(Button A) {
		A.setFont(Font.font("Cooper Black",21));
		A.setPrefWidth(A.getPrefWidth()-6);
		A.setPrefHeight(A.getPrefHeight()-6);;
		A.setLayoutX(A.getLayoutX()+3);
		A.setLayoutY(A.getLayoutY()+3);
	}
	private void mousePressButton(Button A) {
		A.setFont(Font.font("Cooper Black",21));
		A.setPrefWidth(A.getPrefWidth()-6);
		A.setPrefHeight(A.getPrefHeight()-6);;
		A.setLayoutX(A.getLayoutX()+3);
		A.setLayoutY(A.getLayoutY()+3);
	}
	private void mouseReleaseButton(Button A) {
		A.setFont(Font.font("Cooper Black",22));
		A.setPrefWidth(A.getPrefWidth()+6);
		A.setPrefHeight(A.getPrefHeight()+6);;
		A.setLayoutX(A.getLayoutX()-3);
		A.setLayoutY(A.getLayoutY()-3);
	}
}
