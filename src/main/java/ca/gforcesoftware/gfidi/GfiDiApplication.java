package ca.gforcesoftware.gfidi;

import ca.gforcesoftware.gfidi.controller.MyController;
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

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
