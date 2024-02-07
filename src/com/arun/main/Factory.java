package com.arun.main;

public class Factory {
	
	
	public static ILogger getInstance(String str)
	{
		if(str.equals("INFO")){
			return new InfoLogger();
		}
		else if (str.equals("DEBUG"))
		{
			return new DebugLogger();
		}
		else
		{
			return new ErrorLogger();
		}
	}

}
