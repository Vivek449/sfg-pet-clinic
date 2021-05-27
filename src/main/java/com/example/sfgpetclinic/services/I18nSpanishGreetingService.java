package com.example.sfgpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("SPN")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mudo - SPN";
    }
}
