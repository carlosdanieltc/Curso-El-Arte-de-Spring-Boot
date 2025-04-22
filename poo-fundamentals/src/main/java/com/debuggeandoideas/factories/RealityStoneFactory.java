package com.debuggeandoideas.factories;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.prototypes.Prototypes;
import com.debuggeandoideas.singletons.RealityStoneSingleton;

public class RealityStoneFactory extends ConfigurableStoneFactory {

    @Override
    public Stone createStone() {
        if (super.isSingleton()) {
            return RealityStoneSingleton.getInstance();
        }else{
            return Prototypes.realityPrototype.buildPrototype(new RealityStone());
        }
    }

}
