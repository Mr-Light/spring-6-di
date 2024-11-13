package learn.doomispring.controllers;

import learn.doomispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;


    // this will give a null pointer exception if greeting service is not "injected"
    // where it should be injected
    public String sayHello(){
        return greetingService.sayHello();
    }
}
