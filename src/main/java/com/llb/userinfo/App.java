package com.llb.userinfo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * UserInfo app
 * 
 */
@SpringBootApplication
public class App  implements CommandLineRunner
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class,args);
    }

	public void run(String... args) throws Exception {
		System.out.println("start success");
		Thread.currentThread().join();
		
	}
}
