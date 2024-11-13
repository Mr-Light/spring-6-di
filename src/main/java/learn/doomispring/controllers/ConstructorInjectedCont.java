package learn.doomispring.controllers;

import learn.doomispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedCont {

    // note here can be final because it is set as soon as the class is instantiated
    private final GreetingService greetingService;

    // here an assertion can be inserted to check for null test, so can't pass null arg
    public ConstructorInjectedCont(@Qualifier("setterGreeting")
                                   GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
