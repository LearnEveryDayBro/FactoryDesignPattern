package com.singleton.controller;

public class SingletonClass {

	static SingletonClass obj;

	private SingletonClass() {
		System.out.println("Instance Created");
	}

	public static  SingletonClass getObj() {
		// public static synchronized SingletonClass getObj(){

		// we can use Synchronized keyword but it will decrease the performance by
		// hundred times. So we will use double checked method
		if (obj == null) {
			
			// we are using synchronized while creating the object of class
			synchronized(SingletonClass.class)
			{
				if (obj== null )
				{
					obj = new SingletonClass();
				}
				
			}
			
		}

		return obj;
	}

}
