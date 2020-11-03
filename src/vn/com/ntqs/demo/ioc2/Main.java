package vn.com.ntqs.demo.ioc2;

import java.io.PrintStream;

import vn.com.ntqs.demo.ioc2.application.ConsoleLogger;
import vn.com.ntqs.demo.ioc2.application.FileLogger;
import vn.com.ntqs.demo.ioc2.business.CustomerManagement;
import vn.com.ntqs.demo.ioc2.business.ILogger;

public class Main {

	private static PrintStream log = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.println("!~ IOC V2 ~!");
//		ILogger logger = new ConsoleLogger(true);
		ILogger logger = new FileLogger();
		
		CustomerManagement inst = new CustomerManagement(logger);
		inst.registerUser("t0kuda", "123456");
	}
}
