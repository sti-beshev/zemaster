package com.zemaster.controllers;

import com.zemaster.logging.ZeLogMaster;
import com.zemaster.logging.ZemasterLogger;

import javafx.stage.Stage;

public class FileController
{
	private ZemasterLogger logger = ZeLogMaster.getZeLogger();
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
		logger.logInfo("*** Zamaster closed **************************************************");
		
		stage.close();
	}

	public static FileController getInstance()
	{
		if (fileController == null)
			fileController = new FileController();

		return fileController;
	}
}
