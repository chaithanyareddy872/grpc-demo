package com.stackroute.musicmantra.noty5.Logger;

import org.apache.log4j.Logger;

public class LoggerService {

	public static Logger logger;

	public LoggerService(Class classname) {
		this.logger = Logger.getLogger(classname);
	}
}
