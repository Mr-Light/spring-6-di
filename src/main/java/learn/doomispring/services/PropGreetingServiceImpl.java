package learn.doomispring.services;

import org.springframework.stereotype.Service;

@Service("propService")
public class PropGreetingServiceImpl implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello from the property service!!!";
    }
}
