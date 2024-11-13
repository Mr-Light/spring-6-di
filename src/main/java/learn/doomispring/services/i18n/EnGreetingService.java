package learn.doomispring.services.i18n;

import learn.doomispring.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// default is a special type of profile that can mean if no profile is active use me
@Profile({"en", "default"})
@Service("i18nService")
public class EnGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! - EN";
    }
}
