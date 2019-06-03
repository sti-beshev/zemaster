package com.zemaster.logging;

public class ZeLogMaster
{
	private static ZemasterLogger zeMasterLogger;
	
	public static ZemasterLogger getZeLogger()
	{
		if (zeMasterLogger == null)
			zeMasterLogger = new ZeLogger();

		return zeMasterLogger;
	}
}
