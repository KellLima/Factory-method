package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import algaworks.DAO.LogFormatter;

public class DefaultLogFormatter implements LogFormatter{

	DateTimeFormatter dateTimeFormatter;
	
	public DefaultLogFormatter() {
		this.dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	}
	
	public String format(String message) {
		String timestamp = LocalDateTime.now().format(dateTimeFormatter);
		return "[" + timestamp + "]" + message;

	}

}
