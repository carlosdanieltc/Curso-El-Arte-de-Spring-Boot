package com.debuggeandoideas.models;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
