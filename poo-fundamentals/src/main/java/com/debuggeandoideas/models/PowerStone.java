package com.debuggeandoideas.models;

import lombok.ToString;

@ToString
public class PowerStone extends Stone{

    private static final String COLOR = "Purple";
    private static final String  NAME = "Power Stone";
    private static final String  LOCATION = "Xandar";
    private static final int  ENERGY_LAVEL = 10;

    public PowerStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);

    }

    @Override
    public void usePower() {
        System.out.println("Increase power and energy: "+ super.toString());
    }

}
