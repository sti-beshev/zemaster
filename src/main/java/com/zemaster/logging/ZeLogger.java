package com.zemaster.logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class ZeLogger implements ZemasterLogger
{
	private Logger logger;
	
	private final String logFolderPath = "log";
	
	public ZeLogger()
	{
		FileHandler fileTxt = null;
		try
		{
			createLogFolder(logFolderPath);
			fileTxt = new FileHandler(logFolderPath + "/zemaster.log", true);
		}
		catch (SecurityException | IOException e)
		{
			System.out.println("Error while creating logger: \n " + e);
		}

		final SimpleFormatter formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		
		logger = Logger.getLogger("Zemaster Logger");
		logger.addHandler(fileTxt);
		logger.setUseParentHandlers(false);
	}

	@Override
	public void logInfo(String info)
	{
		logger.log(Level.INFO, info);
	}

	@Override
	public void logError(String error)
	{
		logger.log(Level.SEVERE, error);
	}

	@Override
	public void logError(String error, Exception e)
	{
		logger.log(Level.SEVERE, error, e);

	}
	
	private void createLogFolder(String path)
	{
		File logDirectory = new File(path);
		
		if (! logDirectory.exists())
		{
			logDirectory.mkdir();
		}
	}
}
