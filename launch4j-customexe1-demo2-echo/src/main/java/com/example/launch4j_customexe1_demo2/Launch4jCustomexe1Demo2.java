package com.example.launch4j_customexe1_demo2;

public class Launch4jCustomexe1Demo2 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World! Echo!");
        System.out.println("java.version="+System.getProperty("java.version"));
        System.out.println("java.home="+System.getProperty("java.home"));
        System.out.println();
	
        System.out.println("Hello World! Echo!");
	
	
        System.out.println("Say something.");
	
	for(int i=0;i<6;i++)
	{
	    String s = System.console().readLine();
	    System.out.println("You said: "+s);
	    if(s.equalsIgnoreCase("exit"))
	    {
		break;
	    }
	}
	
	
    }
}
