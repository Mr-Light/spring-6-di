package learn.doomispring.controllers;

import learn.doomispring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController controller = new SetterInjectedController();

    // Example of injecting dependency via setter method, as bas property injection
//    @BeforeEach
//    void setUp() {
//        controller.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}