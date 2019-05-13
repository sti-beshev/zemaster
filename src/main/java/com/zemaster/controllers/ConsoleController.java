package com.zemaster.controllers;

import javafx.scene.control.TextArea;

public class ConsoleController implements ConsoleWriter
{
	private static ConsoleController consoleController;
	
	private TextArea consoleTextArea;
	private StringBuilder consoleText;

	private ConsoleController()
	{
		consoleText = new StringBuilder();
	}

	public void setConsoleTextArea(TextArea consoleTextArea)
	{
		this.consoleTextArea = consoleTextArea;
	}

	public static ConsoleController getInstance()
	{
		if (consoleController == null)
			consoleController = new ConsoleController();

		return consoleController;
	}

	@Override
	public void writeToConsole(String text)
	{
		if (consoleTextArea == null)
		{
			throw new ConsoleTextAreaFieldNotSetExceptio("The text area for the console is not set in " + this.getClass().getName());
		}
		else
		{
			consoleText.append(text + "\n\n");
			
			consoleTextArea.setText(consoleText.toString());
			
			consoleTextArea.setScrollTop(Double.MAX_VALUE);
		}
	}
	
	class ConsoleTextAreaFieldNotSetExceptio extends RuntimeException
	{
		private static final long serialVersionUID = -4729510944325667018L;

		public ConsoleTextAreaFieldNotSetExceptio(String errorMessage)
		{
			super(errorMessage);
		}
	}
}
