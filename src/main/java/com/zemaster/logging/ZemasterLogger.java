package com.zemaster.logging;

public interface ZemasterLogger
{
	public void logInfo(String info);
	
	public void logError(String error);
	
	public void logError(String error, Exception e);
}
