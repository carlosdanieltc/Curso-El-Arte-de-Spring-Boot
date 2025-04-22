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

    public RealityStone getPrototype(){
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
                return (RealityStone) ois.readObject();
            }
            
        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class");
            throw new RuntimeException(e.getMessage());
        }
    }

}
