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
