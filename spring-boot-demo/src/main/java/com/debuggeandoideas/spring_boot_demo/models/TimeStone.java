package com.debuggeandoideas.spring_boot_demo.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
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
