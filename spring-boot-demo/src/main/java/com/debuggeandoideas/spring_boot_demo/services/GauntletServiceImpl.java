package com.debuggeandoideas.spring_boot_demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.debuggeandoideas.spring_boot_demo.models.MindStone;
import com.debuggeandoideas.spring_boot_demo.models.PowerStone;
import com.debuggeandoideas.spring_boot_demo.models.RealityStone;
import com.debuggeandoideas.spring_boot_demo.models.SoulStone;
import com.debuggeandoideas.spring_boot_demo.models.SpaceStone;
import com.debuggeandoideas.spring_boot_demo.models.Stone;
import com.debuggeandoideas.spring_boot_demo.models.TimeStone;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Getter
@Primary
@ConditionalOnBean( value = {
    MindStone.class,
    PowerStone.class,
    RealityStone.class,
    SoulStone.class,
    SpaceStone.class,
    TimeStone.class
})
public class GauntletServiceImpl implements GauntletService {

    private final Stone reality;
    private final Stone soul;
    private final Stone mind;
    private final Stone power;
    private final Stone space;
    private final Stone time;

    @Autowired
    public GauntletServiceImpl(
        @Qualifier("reality") Stone reality, 
        @Qualifier("soul") Stone soul, 
        @Qualifier("mind") Stone mind, 
        @Qualifier("power") Stone power,
        @Qualifier("space") Stone space,
        @Qualifier("time") Stone time) {
            this.reality = reality;
            this.soul = soul;
            this.mind = mind;
            this.power = power;
            this.space = space;
            this.time = time;
    }

    @Override
    public void useGauntlet(String stoneName) {
        switch (stoneName) {
            case "reality" -> log.info("Use stone: "+this.reality);
            case "soul" -> log.info("Use stone: "+this.soul);
            case "mind" -> log.info("Use stone: "+this.mind);
            case "power" -> log.info("Use stone: "+this.power);
            case "space" -> log.info("Use stone: "+this.space);
            case "time" -> log.info("Use stone: "+this.time);
            default -> throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public void useFullPower() {
        if (this.time != null && this.reality != null && this.space != null && this.power != null && this.mind != null && this.soul != null) {
            log.info("USING ALL POWER");
        }else{
            throw new IllegalStateException("Cant be using full power because service have field null");
        }
    }

}
