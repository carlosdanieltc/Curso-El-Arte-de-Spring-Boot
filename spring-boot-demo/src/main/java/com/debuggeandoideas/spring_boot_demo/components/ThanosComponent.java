package com.debuggeandoideas.spring_boot_demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.debuggeandoideas.spring_boot_demo.models.ThanosModel;
import com.debuggeandoideas.spring_boot_demo.services.GauntletService;
import com.debuggeandoideas.spring_boot_demo.utils.AvengerNotifier;
import com.github.javafaker.Faker;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@ConditionalOnClass(value = Faker.class)
@Lazy
public class ThanosComponent {

    private final GauntletService gauntletService;
    private final ThanosModel thanosModel;

    public ThanosComponent(GauntletService gauntletService, ThanosModel thanosModel) {
        this.gauntletService = gauntletService;
        this.thanosModel = thanosModel;
    }

    @PostConstruct
    public void init(){
        log.info("Loading Thanos with configs: {}", thanosModel);
        AvengerNotifier.sendNotification(this.getClass());
    }
    
    public void snap(){

        final var faker = new Faker();
        final var country = faker.country().name();

        log.info("Thanos is using the gauntlet to perform snap in {}", country);

        this.gauntletService.useFullPower();

        final var impactPoints = faker.random().nextInt(1000);

        log.info("Thanos is get make danger points {}", impactPoints);
    }

    @PreDestroy
    public void destroy(){
        log.warn("BATTLE END");
    }
}
