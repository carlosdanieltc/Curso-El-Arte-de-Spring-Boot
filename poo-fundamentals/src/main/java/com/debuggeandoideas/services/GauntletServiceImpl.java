package com.debuggeandoideas.services;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import lombok.extern.java.Log;

@Log
public class GauntletServiceImpl implements GauntletService {

    private final Stone reality = new RealityStone();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use stone: " + reality);
    }

}
