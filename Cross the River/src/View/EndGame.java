package View;

import java.awt.Container;

import Model.test;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EndGame{
	
	Stage stage;
	Image back;
	ImageView background;
	Label congrates;
	Button reset;
	Button home;
	TextField name;
	Button submit;
	
	
	public EndGame(Stage stage) {
		this.stage = stage;
	}
	
	public void buildScene(boolean win) {
		AnchorPane root = new AnchorPane();
		back = new Image("MainMenu.jpg");
		background = new ImageView(back);
		background.setFitWidth(1280);
		background.setFitHeight(720);
		background.setX(0);
		background.setY(0);
		root.getChildren().add(background);
		String State;
		System.out.println("did i win: "+win);
		if(win) {
			State = "Congratulations!";
			name = new TextField();
			name.setAlignment(Pos.CENTER);
			name.setPromptText("Enter your name here");
			name.setFont(Font.font("Cooper Black",21));
			name.setStyle("-fx-background-color:yellow;"+"-fx-background-radius:50;");
			name.setLayoutX(400);
			name.setLayoutY(475);
			name.setPrefHeight(50);
			name.setPrefWidth(450);
			
			submit = new Button("Submit");
			submit.setFont(Font.font("Cooper Black",21));
			submit.setStyle("-fx-background-color:yellow;"+"-fx-background-radius:50;");
			submit.setLayoutX(550);
			submit.setLayoutY(550);
			submit.setPrefHeight(50);
			submit.setPrefWidth(150);
			submit.setOnMouseEntered(e->{
				mouseEnterButton(submit);
			});
			submit.setOnMouseExited(e->{
				mouseExitButton(submit);
			});
			submit.setOnMousePressed(e->{
				mousePressButton(submit);
			});
			submit.setOnMouseReleased(e->{
				mouseReleaseButton(submit);
			});
			submit.setOnMouseClicked(e->{
				SaveScore(name.getText());
				mainMenu mainmenu = new mainMenu(stage);
				mainmenu.buildScene();
			});
			root.getChildren().addAll(name,submit);
		}
		else
			State = "Game Over";
			
		
		congrates = new Label(State);
		congrates.setFont(Font.font("Cooper Black",42));
		congrates.setTextFill(Color.YELLOW);
		congrates.setAlignment(Pos.CENTER);
		congrates.setPrefHeight(100);
		congrates.setPrefWidth(1280);
		congrates.setLayoutX(0);
		congrates.setLayoutY(300);
		
		reset = new Button("Reset");
		reset.setFont(Font.font("Cooper Black",21));
		reset.setStyle("-fx-background-color:yellow;"+"-fx-background-radius:50;");
		reset.setPrefHeight(50);
		reset.setPrefWidth(150);
		reset.setLayoutX(700);
		reset.setLayoutY(400);
		reset.setOnMouseEntered(e->{
			mouseEnterButton(reset);
		});
		reset.setOnMouseExited(e->{
			mouseExitButton(reset);
		});
		reset.setOnMousePressed(e->{
			mousePressButton(reset);
		});
		reset.setOnMouseReleased(e->{
			mouseReleaseButton(reset);
		});
		reset.setOnMouseClicked(e->{
			Level1 reset = new Level1(stage);
			reset.buildScene();
		});
		
		home = new Button("Home");
		home.setFont(Font.font("Cooper Black",21));
		home.setStyle("-fx-background-color:yellow;"+"-fx-background-radius:50;");
		home.setPrefHeight(50);
		home.setPrefWidth(150);
		home.setLayoutX(400);
		home.setLayoutY(400);
		home.setOnMouseEntered(e->{
			mouseEnterButton(home);
		});
		home.setOnMouseExited(e->{
			mouseExitButton(home);
		});
		home.setOnMousePressed(e->{
			mousePressButton(home);
		});
		home.setOnMouseReleased(e->{
			mouseReleaseButton(home);
		});
		home.setOnMouseClicked(e->{
			mainMenu mainmenu = new mainMenu(stage);
			mainmenu.buildScene();
		});
		
		root.getChildren().addAll(congrates,reset,home);
		Scene scene = new Scene(root,1280,720);
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
	
	private void SaveScore(String name) {
		if(name!="") {
			System.out.println(name);
		}
	}
}
