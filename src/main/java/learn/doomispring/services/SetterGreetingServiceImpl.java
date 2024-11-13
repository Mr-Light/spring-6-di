package learn.doomispring.services;

import org.springframework.stereotype.Service;

@Service("setterGreeting")
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello everyone from the setter greeting";
    }
}
