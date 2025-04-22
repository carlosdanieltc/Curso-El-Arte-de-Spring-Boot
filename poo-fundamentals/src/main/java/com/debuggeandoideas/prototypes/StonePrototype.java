package com.debuggeandoideas.prototypes;

import com.debuggeandoideas.models.Stone;

@FunctionalInterface
public interface StonePrototype<S extends Stone>{

    S buildPrototype(S stone);
}
