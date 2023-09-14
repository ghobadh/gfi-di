package ca.gforcesoftware.gfidi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author gavinhashemi
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting(String service) {
        return "Hello world -- From PRIMARY Bean";
    }
}
