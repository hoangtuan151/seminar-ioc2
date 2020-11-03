package vn.com.ntqs.demo.ioc2.application;

import vn.com.ntqs.demo.ioc2.business.ILogger;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("[file] " + message);
	}

}
