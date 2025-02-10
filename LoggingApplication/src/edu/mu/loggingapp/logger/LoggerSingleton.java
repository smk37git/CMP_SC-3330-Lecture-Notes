package edu.mu.loggingapp.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LoggerSingleton {

	private static LoggerSingleton instance;
	private static final String filename = "log.txt";
	
	// prevent from being invoked outside
	private LoggerSingleton() {
		
	}
	
	public static LoggerSingleton getInstance() {
		if(instance == null) {
			instance = new LoggerSingleton();
		}
		return instance;
	}
	
	public void logUser() {
		BufferedWriter bw = null;
		bw = new BufferedWriter(new FileWriter(filename));
	}
}
