package com.debuggeandoideas.spring_boot_demo.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
public class MindStone extends Stone{

    private static final String COLOR = "Yellow";
    private static final String  NAME = "Mind Stone";
    private static final String  LOCATION = "Scepter";
    private static final int  ENERGY_LAVEL = 4;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Mind control in stone: "+ super.toString());
    }

}
