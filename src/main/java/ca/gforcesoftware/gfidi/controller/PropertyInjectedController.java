package ca.gforcesoftware.gfidi.controller;

import ca.gforcesoftware.gfidi.services.GreetingService;
import jdk.jfr.Description;

/**
 * @author gavinhashemi
 */
@Description("This is a Property DI without using Spring Framework")
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
