package vn.com.ntqs.demo.ioc2.application;

public class ConsoleLogger {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	
	private Boolean colorful;
	
	public ConsoleLogger() {
	}
	
	public void setColorful(Boolean colorful) {
		this.colorful = colorful;
	}
	
	public void log(String message) {
		String colorCode = colorful ? ANSI_RED : ANSI_BLACK;
		System.out.println(colorCode + "[console] " + message + ANSI_RESET);
	}
}
