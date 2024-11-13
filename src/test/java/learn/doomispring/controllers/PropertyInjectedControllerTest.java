package learn.doomispring.controllers;

import learn.doomispring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;

    /* this is an example of where the greetingService is injected using
     property, where the dependency needed to be injected
     is set via property/attribute access

     Why this is the worst type of injection is if you forget the property, try commenting
     out the greetingService line */
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}