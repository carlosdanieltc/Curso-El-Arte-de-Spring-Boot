package com.debuggeandoideas.spring_boot_demo.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
public class SpaceStone extends Stone{

    private static final String COLOR = "Blue";
    private static final String  NAME = "Space Stone";
    private static final String  LOCATION = "Tesseract";
    private static final int  ENERGY_LAVEL = 7;

    public SpaceStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LAVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Manipulate all space: "+ super.toString());
    }

}
