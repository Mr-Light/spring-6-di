package learn.doomispring.controllers;

import learn.doomispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    // autowired has to be on setter instead of field to avoid reflection injection
    // qualifier will not work if the primary annotation does not exist on the primary service
    @Autowired
    public void setGreetingService(@Qualifier("setterGreeting") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
