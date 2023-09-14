package ca.gforcesoftware.gfidi.controller;

import ca.gforcesoftware.gfidi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;



/**
 * @author gavinhashemi
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /*
    Since this is a Constructor DI , Spring can find the right content so we don't need to add @AutoWired in this constructor

    In new changes we created a new service with @Primary in PrimaryGreetingSerice. In this case, if we remove the qualifier annotation @Qualifier,
    Application will not have any error as it will take the primary bean to wire up (implement) the interface.
    However, with @Qualifier we explicitly specify which service class should be run in order to implement the interface
     */
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting(" constructor Service");
    }
}

