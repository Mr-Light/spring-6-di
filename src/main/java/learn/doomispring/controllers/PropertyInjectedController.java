package learn.doomispring.controllers;

import learn.doomispring.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;


    // this will give a null pointer exception if greeting service is not "injected"
    // where it should be injected
    public String sayHello(){
        return greetingService.sayHello();
    }
}
