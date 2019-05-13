package com.zemaster.ui;

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

	@FXML
	public void initialize()
	{
		CommandLineController.getInstance().setCommandLineTextField(commandLineTextField);
		ConsoleController.getInstance().setConsoleTextArea(consoleTextArea);
	}

	public void menuFileCloseClicked()
	{
		FileController.getInstance().closeWindow();
	}

	public void menuHelpAboutClicked()
	{
		HelpController.getInstances().showAboutDialog();
	}
}
