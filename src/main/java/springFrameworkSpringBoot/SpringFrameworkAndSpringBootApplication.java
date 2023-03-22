package springFrameworkSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springFrameworkSpringBoot.S3DependencyInjectionWithSpring.Controller.MyController;

@SpringBootApplication
public class SpringFrameworkAndSpringBootApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkAndSpringBootApplication.class, args);
	}*/
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkAndSpringBootApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayHelloFromMyController());
	}
}
