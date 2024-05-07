package com.proyecto_v2;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppProyecto_v2 {
    private final static Logger LOGGER = LoggerFactory.getLogger(AppProyecto_v2.class);

    public static void main(String[] args) {
        SpringApplication.run(AppProyecto_v2.class, args);
        LOGGER.info("App corriendo en el PUERTO : ${MYSQL_HOST}:${MYSQL_PORT}");
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

