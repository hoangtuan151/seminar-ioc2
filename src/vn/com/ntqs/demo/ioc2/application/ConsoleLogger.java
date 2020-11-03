package vn.com.ntqs.demo.ioc2.application;

import vn.com.ntqs.demo.ioc2.business.ILogger;

public class ConsoleLogger implements ILogger {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	
	private Boolean colorful;
	
	public ConsoleLogger() {
	}
	
	public ConsoleLogger(Boolean colorful) {
		this.colorful = colorful;
	}
	
	public void log(String message) {
		String colorCode = colorful ? ANSI_RED : ANSI_BLACK;
		System.out.println(colorCode + "[console] " + message + ANSI_RESET);
	}
}
