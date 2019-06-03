package com.zemaster.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class ZeLogger implements ZemasterLogger
{
	private Logger logger;
	
	public ZeLogger()
	{
		FileHandler fileTxt = null;
		try
		{
			fileTxt = new FileHandler("zemaster.log", true);
		}
		catch (SecurityException | IOException e)
		{
			System.out.println("Error while creating logger: \n " + e);
		}

		final SimpleFormatter formatterTxt = new SimpleFormatter();
		final Logger logger = Logger.getLogger("Zemaster Logger");
		fileTxt.setFormatter(formatterTxt);
		logger.addHandler(fileTxt);
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
}
