package ca.gforcesoftware.gfidi;

import ca.gforcesoftware.gfidi.controller.ConstructorInjectedController;
import ca.gforcesoftware.gfidi.controller.MyController;
import ca.gforcesoftware.gfidi.controller.PropertyInjectedController;
import ca.gforcesoftware.gfidi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GfiDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(GfiDiApplication.class, args);
		/*
		This is an example of Dependency Injection..
		Instead of creation of myController object in the class, we create a bean.
		The rest of behaviour of bean would be same as when we create "has a" object from the class.
		 */
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-------- Primary ");
		System.out.println(myController.sayHello());

		/*
		This part is for using DI with Spring Framework
		Please note:
		1- you need to add @Controller to each controller
		2- you need to add @Service to the implementation (GreetingServiceImpl). In this way Spring Framework it uses this class for implement the interface
		3- for property and setter controller we need to explicitly wire the implementation of the class using @Autowired

		if you don't either of these annotation, you get different error in runtime.
		 */
		System.out.println("----------- Property Spring Framework");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
