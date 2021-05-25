package com.example.sfgpetclinic;

import com.example.sfgpetclinic.controllers.ConstructorInjectedController;
import com.example.sfgpetclinic.controllers.MyController;
import com.example.sfgpetclinic.controllers.PropertyInjectedController;
import com.example.sfgpetclinic.controllers.SetterInjectedController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("-------------Primary Bean");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        System.out.println("-----------Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--------------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());




    }

}
