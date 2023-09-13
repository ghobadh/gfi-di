package ca.gforcesoftware.gfidi.controller;

import ca.gforcesoftware.gfidi.services.GreetingService;

/**
 * @author gavinhashemi
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

