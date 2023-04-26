package cl.wildtrip.testspring.config;

import cl.wildtrip.testspring.service.HolaService;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.context.annotation.Configuration
public class Configuration {

    Configuration(HolaService holaService, @Qualifier("holaDos") String h) {
        System.out.println(holaService.hola());
        ;
        System.out.println(h);
        ;
    }

}
