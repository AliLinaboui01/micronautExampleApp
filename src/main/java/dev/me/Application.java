package dev.me;

import dev.me.services.MyBean;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        try (ApplicationContext context = ApplicationContext.run()) {
            MyBean myBean = context.getBean(MyBean.class);
            System.out.println(myBean.start());
        }

    }

}