package com.debuggeandoideas.models;

import lombok.ToString;

@ToString
public class RealityStone extends Stone{

    private static final String COLOR = "Red";
    private static final String  NAME = "reality Stone";
    private static final String  LOCATION = "Asgard";
    private static final int  ENERGY_LAVEL = 6;

    public RealityStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);

    }

    @Override
    public void usePower() {
        System.out.println("Alter reality: "+ super.toString());
    }

}
