package com.example.config;

import com.example.model.OperationModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {
    @Bean
    public OperationModel getOperationModel() {
        return new OperationModel();
    }
}
