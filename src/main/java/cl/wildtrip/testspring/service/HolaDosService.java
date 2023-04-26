package cl.wildtrip.testspring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolaDosService {

    @Bean("holaDos")
    public String holaDos() {
        return "Hola Por segunda vez Gabo";
    }


}
