package com.zemaster.ui;

import com.zemaster.controllers.FileController;
import com.zemaster.controllers.HelpController;

public class MainController
{
	public void menuFileCloseClicked()
	{
		FileController.getInstance().closeWindow();
	}
	
	public void menuHelpAboutClicked()
	{
		HelpController.getInstances().showAboutDialog();
	}
}
