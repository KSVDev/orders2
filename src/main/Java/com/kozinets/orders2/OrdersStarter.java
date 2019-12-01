package com.kozinets.orders2;

        import org.springframework.boot.SpringApplication;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
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
