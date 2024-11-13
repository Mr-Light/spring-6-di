package learn.doomispring.services.i18n;

import learn.doomispring.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("es")
@Service("i18nService")
public class EsGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo! - ES";
    }
}
