package learn.doomispring.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    // this is an example without injection because the no-args constructor
    // manually creates the dependencies needed for the MyController class in
    // the MyController constructor
    @Test
    void sayHello() {

        MyController controller = new MyController();
        System.out.println(controller.sayHello());
    }
}