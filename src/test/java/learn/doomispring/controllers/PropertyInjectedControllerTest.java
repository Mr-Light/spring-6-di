package learn.doomispring.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    /* with spring mark the test as a spring component with annotation
    put the autowired annotation for spring to know what to inject
    and now no need for the manual injection in the setUp() method
     */
    @Autowired
    PropertyInjectedController controller;

    /* this is an example of where the greetingService is injected using
     property, where the dependency needed to be injected
     is set via property/attribute access

     Why this is the worst type of injection is if you forget the property, try commenting
     out the greetingService line */
//    @BeforeEach
//    void setUp() {
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
//
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}