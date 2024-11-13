package learn.doomispring.controllers;

import learn.doomispring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedContTest {

    ConstructorInjectedCont controller =
            new ConstructorInjectedCont(new GreetingServiceImpl());

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}