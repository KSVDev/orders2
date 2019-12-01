package com.kozinets.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersStarter {
    //@Autowired
    //FillDataFirst fillDataFirst;

    public static void main(String[] args){
        SpringApplication.run(OrdersStarter.class, args);
        FillerDataFirst.iteration();
    }

}
