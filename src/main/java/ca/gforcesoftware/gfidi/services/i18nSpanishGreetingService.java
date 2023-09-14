package ca.gforcesoftware.gfidi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author gavinhashemi on 2023-09-13
 */
/*
    by adding "default" to @Profile annotation , we define what profile would be defualt os active profile.
    In that case we can inactive spring.profile.active in application.preperties in resources.
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class i18nSpanishGreetingService  implements GreetingService{
    @Override
    public String sayGreeting(String service) {
        return "Hola Mundo - ES";
    }
}
