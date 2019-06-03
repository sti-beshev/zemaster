package com.zemaster.main;

import com.zemaster.command.CommandMaster;
import com.zemaster.command.CommandsLibrarian;
import com.zemaster.command.control.ClearCommand;
import com.zemaster.controllers.CommandLineController;
import com.zemaster.controllers.ConsoleController;
import com.zemaster.controllers.FileController;
import com.zemaster.logging.ZeLogMaster;
import com.zemaster.logging.ZemasterLogger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Zemaster extends Application
{
	
	private ZemasterLogger logger = ZeLogMaster.getZeLogger();

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Zemaster");

		Parent mainParent = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));

		Scene scene = new Scene(mainParent, 800, 600);
		scene.getStylesheets().add("css/main.css");

		primaryStage.setScene(scene);

		primaryStage.show();
		
		primaryStage.setOnCloseRequest(e -> {
			
			e.consume();
			
			logger.logInfo("*** Zamaster closed **************************************************");
			
			primaryStage.close();
			
		});

		FileController.getInstance().setStage(primaryStage);

		initSystem();
		
		logger.logInfo("*** Zamaster started **************************************************");

	}

	private void initSystem()
	{
		CommandLineController.getInstance().setCommander(new CommandMaster(CommandsLibrarian.getInstance()));
		
		initCommands();
	}
	
	private void initCommands()
	{
		CommandsLibrarian.getInstance().addCommand(new ClearCommand(ConsoleController.getInstance()));
	}
}
