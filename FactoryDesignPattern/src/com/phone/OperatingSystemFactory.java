package com.phone;

public class OperatingSystemFactory {
	
	public OS getInstance(String str)
	{
		if(str.equals("Open"))
		return new Android();
		else if(str.equals("Secure"))
			return new Ios();
		else
			return new Windows();
	}
	
	
}
