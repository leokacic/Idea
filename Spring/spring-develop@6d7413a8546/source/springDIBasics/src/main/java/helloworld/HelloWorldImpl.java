package helloworld;

import java.sql.Connection;

public class HelloWorldImpl implements HelloWorld {

	private String hello ;
	
//	private Connection conn;
//	private SomeType someType;
	
	
	public void sayHello() {
		System.out.println(hello);
	}


//	public void setSomeType(SomeType someType) {
//		this.someType = someType;
//	}


	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}


//	public Connection getConn() {
//		return conn;
//	}


//	public void setConn(Connection conn) {
//		this.conn = conn;
//	}


}
