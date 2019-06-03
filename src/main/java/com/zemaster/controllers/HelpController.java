package com.zemaster.controllers;

import com.zemaster.logging.ZeLogMaster;
import com.zemaster.logging.ZemasterLogger;

import javafx.scene.control.Alert;

public class HelpController
{
	private ZemasterLogger logger = ZeLogMaster.getZeLogger();
	private static HelpController helpController;
	
	private HelpController()
	{
	}
	
	public void showAboutDialog()
	{
		Alert aboutAlert = new Alert(Alert.AlertType.INFORMATION);
		aboutAlert.setHeaderText("Zemaster");
		aboutAlert.setContentText("version: 0.1.0");
		aboutAlert.show();
		
		logger.logInfo("Showing the about dialog");
	}
	
	public static HelpController getInstances()
	{
		if(helpController == null)
			helpController = new HelpController();
		
		return helpController;
	}
}
