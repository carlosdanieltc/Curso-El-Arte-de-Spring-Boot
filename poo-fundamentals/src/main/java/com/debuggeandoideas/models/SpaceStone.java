package com.debuggeandoideas.models;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString
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

    public SpaceStone getPrototype(){
        try (
            //convert object into bytes
            final var bos = new ByteArrayOutputStream();
            final var oos = new ObjectOutputStream(bos);
        ){
            //serialize object and clone
            oos.writeObject(this);
            oos.flush();

            try (
                //deserialize
                final var bis = new ByteArrayInputStream(bos.toByteArray());
                final var ois = new ObjectInputStream(bis);
            ){
                //Return and Casting
                return (SpaceStone) ois.readObject();
            }
            
        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class");
            throw new RuntimeException(e.getMessage());
        }
    }

}
