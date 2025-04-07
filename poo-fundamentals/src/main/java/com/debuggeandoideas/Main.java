package com.debuggeandoideas;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.services.GauntletServiceImpl;

public class Main {
    public static void main(String[] args) {
        
        final var gauntletService = new GauntletServiceImpl();

        gauntletService.useGauntlet("");
    }
}