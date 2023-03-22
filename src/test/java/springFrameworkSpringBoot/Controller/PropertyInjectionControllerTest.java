package springFrameworkSpringBoot.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springFrameworkSpringBoot.S3DependencyInjectionWithSpring.Controller.PropertyInjectionController;

@SpringBootTest
class PropertyInjectionControllerTest {

    @Autowired
    PropertyInjectionController propertyInjectionController;

    @Test
    void sayHelloFromPropertyController() {
        System.out.println(propertyInjectionController.sayHelloFromPropertyController());
    }
}