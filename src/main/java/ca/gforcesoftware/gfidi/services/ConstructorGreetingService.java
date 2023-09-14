package ca.gforcesoftware.gfidi.services;

import org.springframework.stereotype.Service;

/**
 * @author gavinhashemi
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting(String service) {
        return "Hello World from -- Constructor --".concat(service);
    }
}
