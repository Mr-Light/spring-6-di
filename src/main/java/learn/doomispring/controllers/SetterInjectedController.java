package learn.doomispring.controllers;

import learn.doomispring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

//    autowired has to be on setter instead of field to avoid reflection injection
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("from setter!");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
