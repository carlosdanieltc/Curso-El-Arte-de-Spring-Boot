package com.debuggeandoideas.models;

import lombok.ToString;

@ToString
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
