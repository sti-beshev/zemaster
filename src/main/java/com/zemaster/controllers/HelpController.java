package com.zemaster.controllers;

import javafx.scene.control.Alert;

public class HelpController
{
	private static HelpController helpController;
	
	private HelpController()
	{
	}
	
	public void showAboutDialog()
	{
		Alert aboutAlert = new Alert(Alert.AlertType.INFORMATION);
		aboutAlert.setHeaderText("Zemaster");
		aboutAlert.setContentText("version: 0.0.1");
		aboutAlert.show();
	}
	
	public static HelpController getInstances()
	{
		if(helpController == null)
			helpController = new HelpController();
		
		return helpController;
	}
}
