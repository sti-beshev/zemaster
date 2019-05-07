package com.zemaster.controllers;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class CommandLineController
{
	private static CommandLineController commandLineController;

	@SuppressWarnings("unused")
	private TextField commandLineTextField;

	private CommandLineController()
	{

	}

	public void setCommandLineTextField(TextField commandLineTextField)
	{
		this.commandLineTextField = commandLineTextField;
		
		commandLineTextField.setOnKeyPressed((KeyEvent keyEvent)-> 
		{
			if (keyEvent.getCode().equals(KeyCode.ENTER))
            {
				commandLineTextField.clear();
            }
		});
	}

	public static CommandLineController getInstance()
	{
		if (commandLineController == null)
			commandLineController = new CommandLineController();

		return commandLineController;
	}
}
