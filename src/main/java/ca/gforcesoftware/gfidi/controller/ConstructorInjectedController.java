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
     */
     public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting(" constructor Service");
    }
}

