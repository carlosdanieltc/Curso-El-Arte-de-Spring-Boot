package com.debuggeandoideas;

import com.debuggeandoideas.configs.StoneContext;
import com.debuggeandoideas.factories.MindStoneFactory;
import com.debuggeandoideas.factories.PowerStoneFactory;
import com.debuggeandoideas.factories.RealityStoneFactory;
import com.debuggeandoideas.factories.SoulStoneFactory;
import com.debuggeandoideas.factories.SpaceStoneFactory;
import com.debuggeandoideas.factories.TimeStoneFactory;
import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.prototypes.Prototypes;
import com.debuggeandoideas.services.GauntletServiceImpl;

public class Main {
    public static void main(String[] args) {

        final var gauntletService = StoneContext.setContext(pre -> System.out.println("EN 1"), post -> System.out.println("EN 2"));

        gauntletService.useGauntlet("power");

        gauntletService.useFullPower();

        StoneContext.destroyContext(gauntletService);
        
    }
}