package com.zemaster.ui;

import com.zemaster.command.CommandMaster;
import com.zemaster.command.Commander;
import com.zemaster.command.CommandsLibrarian;
import com.zemaster.command.CommandsLibrary;
import com.zemaster.command.control.ClearCommand;
import com.zemaster.controllers.CommandLineController;
import com.zemaster.controllers.ConsoleController;
import com.zemaster.controllers.FileController;
import com.zemaster.controllers.HelpController;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController
{
	@FXML
	TextField commandLineTextField;
	@FXML
	TextArea consoleTextArea;

	CommandsLibrary commandsLibrary;
	Commander commander;

	@FXML
	public void initialize()
	{
		CommandLineController.getInstance().setCommandLineTextField(commandLineTextField);
		ConsoleController.getInstance().setConsoleTextArea(consoleTextArea);
	
		commandsLibrary = CommandsLibrarian.getInstance();
		commander = new CommandMaster(commandsLibrary);
	}

	public void menuFileCloseClicked()
	{
		FileController.getInstance().closeWindow();
	}

	public void menuHelpAboutClicked()
	{
		HelpController.getInstances().showAboutDialog();
	}
	
	public void menuFileClearClicked()
	{
		commander.executeCommand(ClearCommand.COMMAND_NAME);
	}
}
