package com.debuggeandoideas.models;

import lombok.ToString;

@ToString
public class SoulStone extends Stone{

    private static final String COLOR = "Orange";
    private static final String  NAME = "Soul Stone";
    private static final String  LOCATION = "Vormir";
    private static final int  ENERGY_LAVEL = 3;

    public SoulStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);

    }

    @Override
    public void usePower() {
        System.out.println("Total control: "+ super.toString());
    }

}
