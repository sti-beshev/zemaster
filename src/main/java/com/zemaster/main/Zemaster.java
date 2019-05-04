package com.zemaster.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Zemaster extends Application 
{
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("Zemaster");

		Parent mainParent = FXMLLoader.load(getClass().getResource("/Main.fxml"));

		Scene scene = new Scene(mainParent, 800, 600);

		primaryStage.setScene(scene);

		primaryStage.show();
	}

}
