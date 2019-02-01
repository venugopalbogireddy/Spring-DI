package com.venugopalb.springdi;

import com.venugopalb.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
    }

}

