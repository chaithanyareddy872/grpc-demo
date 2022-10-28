package com.musicmantra.classbooking.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {
    public static Logger loggerservice() throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        // This block configure the logger with handler and formatter
        FileHandler fh = new FileHandler("/home/chaitanya/musicmantra/musicmantra/" +
                "class-booking-service/src/main/resources/logs/logging.log",1024,1,true);
        logger.addHandler(fh);
//        logger.setUseParentHandlers(false);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        return logger;
    }
}
