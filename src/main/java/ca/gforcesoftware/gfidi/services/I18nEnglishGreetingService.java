package ca.gforcesoftware.gfidi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author gavinhashemi on 2023-09-13
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting(String service) {
        return "Hello World - EN";
    }
}
