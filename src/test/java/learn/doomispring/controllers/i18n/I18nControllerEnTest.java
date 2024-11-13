package learn.doomispring.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("en")
@SpringBootTest
class I18nControllerEnTest {

    @Autowired
    I18nController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}