package com.zemaster.controllers;

import com.zemaster.command.Commander;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class CommandLineController
{
	private static CommandLineController commandLineController;

	private TextField commandLineTextField;
	private Commander commander;

	private CommandLineController()
	{

	}

	public void setCommandLineTextField(TextField commandLineTextField)
	{
		this.commandLineTextField = commandLineTextField;

		commandLineTextField.setOnKeyPressed((KeyEvent keyEvent) ->
		{
			if (keyEvent.getCode().equals(KeyCode.ENTER))
			{
				commandEntered();
			}
		});
	}

	public void setCommander(Commander commander)
	{
		this.commander = commander;
	}

	public static CommandLineController getInstance()
	{
		if (commandLineController == null)
			commandLineController = new CommandLineController();

		return commandLineController;
	}

	private void commandEntered()
	{
		if (commander == null)
			throw new CommandLineTextFieldNotSetExceptio(
					"The TextField for the command line is not set in " + CommandLineController.class.getName());

		final String command = commandLineTextField	.getText()
													.trim()
													.toLowerCase();

		commander.executeCommand(command);

		commandLineTextField.clear();
	}

	class CommandLineTextFieldNotSetExceptio extends RuntimeException
	{
		private static final long serialVersionUID = 8076885752698488090L;

		public CommandLineTextFieldNotSetExceptio(String errorMessage)
		{
			super(errorMessage);
		}
	}
}
