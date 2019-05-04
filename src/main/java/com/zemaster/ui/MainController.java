package com.zemaster.ui;

import com.zemaster.controllers.FileController;

public class MainController 
{
	
	public void menuFileClosePressed()
	{
		FileController.getInstance().closeWindow();
	}
}
