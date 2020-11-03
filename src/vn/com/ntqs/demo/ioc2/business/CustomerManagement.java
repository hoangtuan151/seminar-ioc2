package vn.com.ntqs.demo.ioc2.business;

public class CustomerManagement {

	private ILogger logger;
	
	public CustomerManagement(ILogger logger) {
		this.logger = logger;
	}
	
	public void registerUser(String username, String passwd) {
		// do some register logic...
		
		// log the result
		logger.log("Success register user: " + username);
	}
}
