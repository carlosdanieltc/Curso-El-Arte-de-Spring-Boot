package com.debuggeandoideas;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;

public class Main {
    public static void main(String[] args) {
        
        final var mind= new MindStone();
        final var power= new PowerStone();
        final var reality= new RealityStone();

        System.out.println("---");
        mind.usePower();
        System.out.println("---");
        power.usePower();
        System.out.println("---");
        reality.usePower();
        System.out.println("---");
    }
}