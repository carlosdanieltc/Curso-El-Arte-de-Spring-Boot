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
