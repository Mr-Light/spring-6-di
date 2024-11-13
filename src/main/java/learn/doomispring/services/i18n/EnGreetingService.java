package learn.doomispring.services.i18n;

import learn.doomispring.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("en")
@Service("i18nService")
public class EnGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! - EN";
    }
}
