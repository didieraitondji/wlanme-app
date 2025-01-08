package com.wlanme.wlanmeapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartupConfig {

    private final MongoConfig mongoConfig;

    public StartupConfig(MongoConfig mongoConfig) {
        this.mongoConfig = mongoConfig;
    }

    @SuppressWarnings("unused")
    @Bean
    public CommandLineRunner initializeDatabase() {
        return args -> {
            mongoConfig.createCollectionIfNotExists();
            System.out.println("La collection 'users' a été vérifiée ou créée avec succès.");
            System.out.println("La collection 'discussions' a été vérifiée ou créée avec succès.");
            System.out.println("La collection 'contacts' a été vérifiée ou créée avec succès.");
            System.out.println("La collection 'messages' a été vérifiée ou créée avec succès.");
        };
    }
}
