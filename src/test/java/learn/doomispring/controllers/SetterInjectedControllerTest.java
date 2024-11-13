package learn.doomispring.controllers;

import learn.doomispring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller = new SetterInjectedController();

    // Example of injecting dependency via setter method, as bas property injection
    @BeforeEach
    void setUp() {
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
        System.out.println("hi");
    }
}