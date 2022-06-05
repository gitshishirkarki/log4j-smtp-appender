package com.shishir.smtpappender;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SmtpAppenderApplication {
    Logger logger = LogManager.getLogger(SmtpAppenderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SmtpAppenderApplication.class, args);
    }

    @PostConstruct
    public void testLog4jSmtpAppender() {

        logger.error("ERROR LOG");
        logger.info("INFO LOG");
        logger.debug("DEBUG LOG");
        logger.trace("TRACE LOG");
    }
}
