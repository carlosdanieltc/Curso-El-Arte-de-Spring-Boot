package com.debuggeandoideas.spring_boot_demo.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties(prefix = "thanos.config")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ThanosModel {

    private String planet;
    private String galaxy;
    private String defaultDestructionLevel;
    
    


}
