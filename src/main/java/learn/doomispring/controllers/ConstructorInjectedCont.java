package learn.doomispring.controllers;

import learn.doomispring.services.GreetingService;

public class ConstructorInjectedCont {

    // note here can be final because it is set as soon as the class is instantiated
    private final GreetingService greetingService;

    // here an assertion can be inserted to check for null test, so can't pass null arg
    public ConstructorInjectedCont(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
