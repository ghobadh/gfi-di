package ca.gforcesoftware.gfidi.services;

/**
 * @author gavinhashemi
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Greeting Service!";
    }
}
