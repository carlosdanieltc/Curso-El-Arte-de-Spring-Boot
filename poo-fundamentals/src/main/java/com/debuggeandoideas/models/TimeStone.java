package com.debuggeandoideas.models;

import lombok.ToString;

@ToString
public class TimeStone extends Stone {

    private static final String COLOR = "Green";
    private static final String  NAME = "Time Stone";
    private static final String  LOCATION = "Agamotto";
    private static final int  ENERGY_LAVEL = 9;

    public TimeStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Control time: "+ super.toString());
    }

}
