package springFrameworkSpringBoot.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springFrameworkSpringBoot.S3DependencyInjectionWithSpring.Controller.SetterInjectionController;

@SpringBootTest
class SetterInjectionControllerTest {
    @Autowired
    SetterInjectionController setterInjectionController;


    @Test
    void sayHelloFromSetterController() {
        System.out.println(setterInjectionController.sayHelloFromSetterController());
    }
}