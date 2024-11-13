package learn.doomispring.controllers;

import learn.doomispring.services.GreetingService;
import learn.doomispring.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    // example of no injection because the object is being created where it is needed
    // instead of getting injected or passed like an arg for example
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
