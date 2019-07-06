package View;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class mainMenu{
	Stage stage;
	Image back;
	ImageView background;
	Button start;
	Button load;
	Button highScore;
	Button credit;
	Button exit;
	
	public mainMenu(Stage stage) {
		this.stage = stage;
	}
	
	public void buildScene() {
		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root,1268,708);

		back = new Image("MainMenu.jpg");
		background = new ImageView(back);
		background.setX(0);
		background.setY(0);
		background.setFitWidth(1280);
		background.setFitHeight(720);
		
		start = new Button("Start New Game");
		start.setFont(Font.font("Cooper Black",21));
		start.setPrefWidth(430);
		start.setPrefHeight(50);;
		start.setLayoutX(424);
		start.setLayoutY(330);
		start.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		start.setOnMouseEntered(e->{
			mouseEnterButton(start);
		});
		start.setOnMouseExited(e->{
			mouseExitButton(start);
		});
		start.setOnMousePressed(e->{
			mousePressButton(start);
		});
		start.setOnMouseReleased(e->{
			mouseReleaseButton(start);
		});
		start.setOnMouseClicked(e->{
			selectLevel select = new selectLevel(stage);
			select.buildScene();
		});
		
//		Label label = new Label("hello mother fucker");
//		label.setFont(Font.font("Cooper Black",21));
//		label.setLayoutX(10);
//		label.setLayoutY(10);
		
		load = new Button("Load");
		load.setFont(Font.font("Cooper Black",21));
		load.setPrefWidth(430);
		load.setPrefHeight(50);;
		load.setLayoutX(424);
		load.setLayoutY(400);
		load.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		load.setOnMouseEntered(e->{
			mouseEnterButton(load);
		});
		load.setOnMouseExited(e->{
			mouseExitButton(load);
		});
		load.setOnMousePressed(e->{
			mousePressButton(load);
		});
		load.setOnMouseReleased(e->{
			mouseReleaseButton(load);
		});
		
		highScore= new Button("Hig Score");
		highScore.setFont(Font.font("Cooper Black",21));
		highScore.setPrefWidth(430);
		highScore.setPrefHeight(50);;
		highScore.setLayoutX(424);
		highScore.setLayoutY(470);
		highScore.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		highScore.setOnMouseEntered(e->{
			mouseEnterButton(highScore);
		});
		highScore.setOnMouseExited(e->{
			mouseExitButton(highScore);
		});
		highScore.setOnMousePressed(e->{
			mousePressButton(highScore);
		});
		highScore.setOnMouseReleased(e->{
			mouseReleaseButton(highScore);
		});
		
		credit = new Button("Credit");
		credit.setFont(Font.font("Cooper Black",21));
		credit.setPrefWidth(430);
		credit.setPrefHeight(50);;
		credit.setLayoutX(424);
		credit.setLayoutY(540);
		credit.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		credit.setOnMouseEntered(e->{
			mouseEnterButton(credit);
		});
		credit.setOnMouseExited(e->{
			mouseExitButton(credit);
		});
		credit.setOnMousePressed(e->{
			mousePressButton(credit);
		});
		credit.setOnMouseReleased(e->{
			mouseReleaseButton(credit);
		});
		credit.setOnMouseClicked(e->{
			Level2 l2 = new Level2(stage);
			l2.buildScene();
		});
		
		exit = new Button("Exit");
		exit.setFont(Font.font("Cooper Black",21));
		exit.setPrefWidth(430);
		exit.setPrefHeight(50);;
		exit.setLayoutX(424);
		exit.setLayoutY(610);
		exit.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		exit.setOnMouseEntered(e->{
			mouseEnterButton(exit);
		});
		exit.setOnMouseExited(e->{
			mouseExitButton(exit);
		});
		exit.setOnMousePressed(e->{
			mousePressButton(exit);
		});
		exit.setOnMouseReleased(e->{
			mouseReleaseButton(exit);
		});
		exit.setOnMouseClicked(e->{
			Exit();
		});
		
		
		root.getChildren().addAll(background,start,load,highScore,credit,exit);
		stage.setScene(scene);
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
	
	private void Start() {
		selectLevel select = new selectLevel(stage);
		select.buildScene();
	}
	private void Load() {
		
	}
	private void HighScore() {
		
	}
	private void Credit() {
		
	}
	private void Exit() {
		stage.close();
	}
	
}
