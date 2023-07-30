package model;

import algaworks.DAO.LogFormatter;
import algaworks.DAO.Logger;

public class ConsoleLogger implements Logger{
	
	private LogFormatter formatter;
	
	public ConsoleLogger(LogFormatter formatter) {
		this.formatter = formatter;
	}

	public void log(String message) {
		String formattedMessage = formatter.format(message);
		System.out.println(formattedMessage);

	}

}
