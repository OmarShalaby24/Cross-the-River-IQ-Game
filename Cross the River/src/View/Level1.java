
package View;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Level1 {
	int moves = 0;
	int i=1;
	Stage stage;
	
	Button reset;
	Button move;
	Button AutoSolve;
	Button Home;
	Image back;
	ImageView background;
	Image manInBoat;
	ImageView boat;
	Image Lettuce;
	ImageView lettuce;
	Image Sheep;
	ImageView sheep;
	Image Wolf;
	ImageView wolf;
	Label noOfMoves;
	
	TranslateTransition translate;
	
	Model.Boat B = new Model.Boat();
	Model.Wolf W = new Model.Wolf();
	Model.Sheep S = new Model.Sheep();
	Model.Lettuce L = new Model.Lettuce();

	public Level1(Stage stage) {
		this.stage = stage;
	}
	
	public void buildScene() {
		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root,1280,720);
		
		back = new Image("Background.jpg");
		background = new ImageView(back);
		background.setLayoutX(0);
		background.setLayoutY(0);
		background.setFitWidth(1280);
		background.setFitHeight(720);
		
		AutoSolve = new Button("Auto Solve");
		AutoSolve.setLayoutX(600);
		AutoSolve.setLayoutY(120);
		AutoSolve.setPrefHeight(50);
		AutoSolve.setPrefWidth(150);
		AutoSolve.setFont(Font.font("Cooper Black",21));
		AutoSolve.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		AutoSolve.setOnMouseEntered(e->{
			mouseEnterButton(AutoSolve);
		});
		AutoSolve.setOnMouseExited(e->{
			mouseExitButton(AutoSolve);
		});
		AutoSolve.setOnMousePressed(e->{
			mousePressButton(AutoSolve);
		});
		AutoSolve.setOnMouseReleased(e->{
			mouseReleaseButton(AutoSolve);
		});
		AutoSolve.setOnMouseClicked(e->{
			AutoSolve();
		});
		
		Home = new Button("Home");
		Home.setLayoutX(420);
		Home.setLayoutY(50);
		Home.setPrefHeight(50);
		Home.setPrefWidth(150);
		Home.setFont(Font.font("Cooper Black",21));
		Home.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		Home.setOnMouseEntered(e->{
			mouseEnterButton(Home);
		});
		Home.setOnMouseExited(e->{
			mouseExitButton(Home);
		});
		Home.setOnMousePressed(e->{
			mousePressButton(Home);
		});
		Home.setOnMouseReleased(e->{
			mouseReleaseButton(Home);
		});
		Home.setOnMouseClicked(e->{
			mainMenu mainmenu = new mainMenu(stage);
			mainmenu.buildScene();
		});
		
		reset = new Button("Reset");
		reset.setLayoutX(420);
		reset.setLayoutY(120);
		reset.setPrefHeight(50);
		reset.setPrefWidth(150);
		reset.setFont(Font.font("Cooper Black",21));
		reset.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
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
		
		move = new Button("Move");
		move.setLayoutX(600);
		move.setLayoutY(50);
		move.setPrefHeight(50);
		move.setPrefWidth(150);
		move.setFont(Font.font("Cooper Black",21));
		move.setStyle("-fx-background-color:yellow;" + "-fx-background-radius:50;");
		move.setOnMouseEntered(e->{
			mouseEnterButton(move);
		});
		move.setOnMouseExited(e->{
			mouseExitButton(move);
		});
		move.setOnMousePressed(e->{
			mousePressButton(move);
		});
		move.setOnMouseReleased(e->{
			mouseReleaseButton(move);
		});
		move.setOnMouseClicked(e->{
			moves++;
			noOfMoves.setText(Integer.toString(moves));
			changePos();
			move.setDisable(true);
			
			Move();
		});
		noOfMoves = new Label("0");
		noOfMoves.setFont(Font.font("Cooper Black",50));
		noOfMoves.setLayoutX(100);
		noOfMoves.setLayoutY(100);
		
		manInBoat = new Image("FarmerOnBoat.png");
		boat = new ImageView(manInBoat);
		boat.setFitWidth(185);
		boat.setFitHeight(180);
		boat.setX(550);
		boat.setY(530);
		
		Lettuce = new Image("Lettuce.png");
		lettuce = new ImageView(Lettuce);
		lettuce.setFitWidth(80);
		lettuce.setFitHeight(90);
		lettuce.setX(360);
		lettuce.setY(600);
		lettuce.setOnMouseClicked(e->{
			ClickLettuce();
		});
		
		Sheep = new Image("Sheep.png");
		sheep = new ImageView(Sheep);
		sheep.setFitWidth(90);
		sheep.setFitHeight(70);
		sheep.setX(425);
		sheep.setY(620);
		sheep.setOnMouseClicked(e->{
			ClickSheep();
		});
		
		Wolf = new Image("Wolf.png");
		wolf = new ImageView(Wolf);
		wolf.setFitWidth(80);
		wolf.setFitHeight(105);
		wolf.setX(480);
		wolf.setY(610);
		wolf.setOnMouseClicked(e->{
			ClickWolf();
		});
		
		root.getChildren().addAll(background,boat,wolf,sheep,lettuce,move,Home,reset,AutoSolve,noOfMoves);
		stage.setScene(scene);
	}
	
	private void ClickWolf() {
		if(!B.isRight() && !W.isRight()) {
			if(!W.isOnBoat() && B.getOnTheBoat().equals("null")) {
				W.setOnBoat(true);
				B.setOnTheBoat("Wolf");
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(120);
				translate.setByY(-30);
				translate.setNode(wolf);
				translate.play();
			}
			else if(W.isOnBoat()) {
				W.setOnBoat(false);
				B.setOnTheBoat("null");
				W.setRight(false);
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(-120);
				translate.setByY(30);
				translate.setNode(wolf);
				translate.play();
			}
		}
		else if(B.isRight() && W.isRight()) {
			if(!W.isOnBoat() && B.getOnTheBoat().equals("null")) {
				W.setOnBoat(true);
				B.setOnTheBoat("Wolf");
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(-195);
				translate.setByY(50);
				translate.setNode(wolf);
				translate.play();
			}
			else if(W.isOnBoat()) {
				W.setOnBoat(false);
				B.setOnTheBoat("null");
				W.setRight(true);
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(195);
				translate.setByY(-50);
				translate.setNode(wolf);
				translate.play();
			}
		}
		if(Win()) {
			EndGame win = new EndGame(stage);
			win.buildScene(true);
		}
	}
	private void ClickSheep() {
		if(!B.isRight() && !S.isRight()) {
			if(!S.isOnBoat() && B.getOnTheBoat().equals("null")) {
				S.setOnBoat(true);
				B.setOnTheBoat("Sheep");
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(175);
				translate.setByY(-15);
				translate.setNode(sheep);
				translate.play();
			}
			else if(S.isOnBoat()) {
				S.setOnBoat(false);
				B.setOnTheBoat("null");
				S.setRight(false);
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(-175);
				translate.setByY(15);
				translate.setNode(sheep);
				translate.play();
			}
		}
		else if(B.isRight() && S.isRight()) {
			if(!S.isOnBoat() && B.getOnTheBoat().equals("null")) {
				S.setOnBoat(true);
				B.setOnTheBoat("Sheep");
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(-135);
				translate.setByY(60);
				translate.setNode(sheep);
				translate.play();
			}
			else if(S.isOnBoat()) {
				S.setOnBoat(false);
				B.setOnTheBoat("null");
				S.setRight(true);
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(135);
				translate.setByY(-60);
				translate.setNode(sheep);
				translate.play();
			}
		}
		if(Win()) {
			EndGame win = new EndGame(stage);
			win.buildScene(true);
		}
	}
	private void ClickLettuce() {
		if(!B.isRight() && !L.isRight()) {
			if(!L.isOnBoat() && B.getOnTheBoat().equals("null")) {
				L.setOnBoat(true);
				B.setOnTheBoat("Lettuce");
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(240);
				translate.setByY(0);
				translate.setNode(lettuce);
				translate.play();
			}
			else if(L.isOnBoat()) {
				L.setOnBoat(false);
				B.setOnTheBoat("null");
				L.setRight(false);
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(-240);
				translate.setByY(0);
				translate.setNode(lettuce);
				translate.play();
			}
		}
		else if(B.isRight() && L.isRight()) {
			if(!L.isOnBoat() && B.getOnTheBoat().equals("null")) {
				L.setOnBoat(true);
				B.setOnTheBoat("Lettuce");
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(-70);
				translate.setByY(70);
				translate.setNode(lettuce);
				translate.play();
			}
			else if(L.isOnBoat()) {
				L.setOnBoat(false);
				B.setOnTheBoat("null");
				L.setRight(true);
				System.out.println("on Board: "+B.getOnTheBoat());
				translate = new TranslateTransition();
				translate.setByX(70);
				translate.setByY(-70);
				translate.setNode(lettuce);
				translate.play();
			}
		}
		if(Win()) {
			EndGame win = new EndGame(stage);
			win.buildScene(true);
		}
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
	
	private void move() {
		String crosser = B.getOnTheBoat();
		switch (crosser) {
		case "Sheep":
			travel(sheep,B.isRight());
			break;
		case "Wolf":
			travel(wolf,B.isRight());
			break;
		case "Lettuce":
			travel(lettuce,B.isRight());
			break;
		default:
			break;
		}
	}
	
	private void travel(Node A, boolean Right) {
		if(!Right) {
			translate = new TranslateTransition();
			translate.setDuration(Duration.seconds(2));
			translate.setByX(-350);
			translate.setByY(90);
			translate.setNode(A);
			translate.play();
		}
		else {
			translate = new TranslateTransition();
			translate.setDuration(Duration.seconds(2));
			translate.setByX(350);
			translate.setByY(-90);
			translate.setNode(A);
			translate.play();
		}
	}
	
	private boolean Win() {
		if(W.isRight() && S.isRight() && L.isRight())
			return true;
		else
			return false;
	}
	
	private boolean GameOver() {
		if(B.isRight()) {
			if((!W.isRight() && !S.isRight()) || (!S.isRight() && !L.isRight()) )
				return true;
			else
				return false;
		}
		else if(!B.isRight()) {
			if((W.isRight() && S.isRight()) || (S.isRight() && L.isRight()))
				return true;
			else
				return false;
		}
		return false;
	}
	
	private void changePos() {
		switch (B.getOnTheBoat()) {
		case "Wolf":
			if(W.isRight())
				W.setRight(false);
			else
				W.setRight(true);
			break;
		case "Sheep":
			if(S.isRight())
				S.setRight(false);
			else
				S.setRight(true);
			break;
		case "Lettuce":
			if(L.isRight())
				L.setRight(false);
			else
				L.setRight(true);
			break;

		default:
			break;
		}
		
	}
	
	private void AutoSolve() {
//		Level1 l1 = new Level1(stage);
//		l1.buildScene();
		wolf.setDisable(true);
		sheep.setDisable(true);
		lettuce.setDisable(true);
		move.setDisable(true);
		AutoSolve.setDisable(true);
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3.5), (event)->{
			ArrayOfMethods(i);
			i++;
		}));
		timeline.setCycleCount(17);
		timeline.play();
		/*
		 * Steps To Win
			ClickSheep();
			Move();
			ClickSheep();
			Move();
			ClickWolf();
			Move();
			ClickWolf();
			ClickSheep();
			Move();
			ClickSheep();
			ClickLettuce();
			Move();
			ClickLettuce();
			Move();
			ClickSheep();
			Move	();
			ClickSheep(); 
		 */
	}
	private void Move() {
		if(!B.isRight()) {
			B.setRight(true);
			
			translate = new TranslateTransition();
			translate.setDuration(Duration.seconds(2));
			translate.setByX(350);
			translate.setByY(-90);
			translate.setNode(boat);
			translate.setOnFinished(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					move.setDisable(false);
					if(GameOver()) {
						EndGame gameover = new EndGame(stage);
						gameover.buildScene(false);
					}
				}
			});
			translate.play();
			move();
		}
		else {
			B.setRight(false);
			translate = new TranslateTransition();
			translate.setDuration(Duration.seconds(2));
			translate.setByX(-350);
			translate.setByY(90);
			translate.setNode(boat);
			translate.setOnFinished(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					move.setDisable(false);
					if(GameOver()) {
						EndGame gameover = new EndGame(stage);
						gameover.buildScene(false);
					}
				}
			});
			translate.play();
			move();
		}
	}
	
	private void ArrayOfMethods(int i) {
		switch (i) {
		case 1:
			ClickSheep();
			System.out.println(i);
			break;
		case 2:
			System.out.println(i);
			Move();
			System.out.println(i);
			break;
		case 3:
			ClickSheep();
			System.out.println(i);
			break;
		case 4:
			Move();
			System.out.println(i);
			break;
		case 5:
			ClickWolf();
			System.out.println(i);
			break;
		case 6:
			Move();
			System.out.println(i);
			break;
		case 7:
			ClickWolf();
			System.out.println(i);
			break;
		case 8:
			ClickSheep();
			System.out.println(i);
			break;
		case 9:
			Move();
			System.out.println(i);
			break;
		case 10:
			ClickSheep();
			System.out.println(i);
			break;
		case 11:
			ClickLettuce();
			System.out.println(i);
			break;
		case 12:
			Move();
			System.out.println(i);
			break;
		case 13:
			ClickLettuce();
			System.out.println(i);
			break;
		case 14:
			Move();
			System.out.println(i);
			break;
		case 15:
			ClickSheep();
			System.out.println(i);
			break;
		case 16:
			Move();
			System.out.println(i);
			break;
		case 17:
			ClickSheep();
			System.out.println(i);
			break;
		default:
			break;
		}
	}
}
