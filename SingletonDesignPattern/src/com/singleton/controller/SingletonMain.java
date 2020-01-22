package com.singleton.controller;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable()
				{
					public void run()
					{
						SingletonClass obj= SingletonClass.getObj();
					}
				});
		
		
		Thread t2= new Thread(new Runnable()
		{
			public void run()
			{
				SingletonClass obj= SingletonClass.getObj();
			}
		});
		
		t1.start();
		t2.start(); 
	
	
		// SingletonClass obj0= SingletonClass.getObj();
		// SingletonClass obj1= SingletonClass.getObj();
	}
	
}
