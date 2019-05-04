package com.zemaster.controllers;

import javafx.stage.Stage;

public class FileController
{
	private static FileController fileController;

	private Stage stage;

	public void setStage(Stage stage)
	{
		this.stage = stage;
	}

	private FileController()
	{

	}

	public void closeWindow()
	{
		stage.close();
	}

	public static FileController getInstance()
	{
		if (fileController == null)
			fileController = new FileController();

		return fileController;
	}
}
