package learn.doomispring.controllers;

import learn.doomispring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedContTest {

    @Autowired
    ConstructorInjectedCont controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}