package com.debuggeandoideas;

import com.debuggeandoideas.factories.PowerStoneFactory;
import com.debuggeandoideas.factories.RealityStoneFactory;
import com.debuggeandoideas.factories.TimeStoneFactory;
import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.prototypes.Prototypes;
import com.debuggeandoideas.services.GauntletServiceImpl;

public class Main {
    public static void main(String[] args) {

        System.setProperty("scope", "singleton");
        var realityfactory = new RealityStoneFactory();
        var timefactory = new TimeStoneFactory();

        final var gauntletService = new GauntletServiceImpl();

        // DI by Setter
        gauntletService.setReality(realityfactory.createStone());
        gauntletService.setTime(timefactory.createStone());

        gauntletService.useGauntlet("reality");
        gauntletService.useGauntlet("time");
        gauntletService.useGauntlet("soul");

        gauntletService.useFullPower();
        
    }
}