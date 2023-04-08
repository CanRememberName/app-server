package org.dhkj.appserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(AppServerApplication.class);

    public static void main(String[] args) {
        logger.error("started - 帝皇铠甲");
        SpringApplication.run(AppServerApplication.class, args);
    }

}
