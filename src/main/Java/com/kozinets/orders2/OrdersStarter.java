package com.kozinets.orders2;

import org.springframework.boot.SpringApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersStarter {
    //@Autowired
    //FillDataFirst fillDataFirst;

    private static Logger LOGGER = LogManager.getLogger(OrdersStarter.class);

    public static void main(String[] args){
        LOGGER.info("Simple log statement with inputs 1, 2 and 3");
        SpringApplication.run(OrdersStarter.class, args);
        FillerDataFirst.iteration();
    }

}
