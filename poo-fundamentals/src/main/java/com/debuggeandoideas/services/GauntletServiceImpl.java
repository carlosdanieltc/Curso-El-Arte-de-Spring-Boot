package com.debuggeandoideas.services;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.singletons.MindStoneSingleton;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

@Log
@Getter
public class GauntletServiceImpl implements GauntletService {

    private final Stone reality;
    private final Stone soul;
    private final Stone mind;
    private final Stone power;
    private final Stone space;
    private final Stone time;

    public GauntletServiceImpl(Stone mind, Stone power, Stone reality, Stone soul, Stone space, Stone time){
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
