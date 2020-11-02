package vn.com.ntqs.demo.ioc2;

import java.io.PrintStream;

import vn.com.ntqs.demo.ioc2.business.CustomerManagement;

public class Main {

	private static PrintStream log = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.println("!~ IOC V2 ~!");
		CustomerManagement inst = new CustomerManagement();
		inst.registerUser("t0kuda", "123456");
	}
}
