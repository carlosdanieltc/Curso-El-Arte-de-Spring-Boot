package com.debuggeandoideas.spring_boot_demo.models;

import com.debuggeandoideas.spring_boot_demo.utils.AvengerNotifier;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
public class SpaceStone extends Stone{

    public SpaceStone(String colorProperty, String nameProperty, String locationProperty, Integer energyLevelProperty) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

     public void sendSpace(){
        AvengerNotifier.sendNotification(SpaceStone.class);
    }

    @Override
    public void usePower() {
        System.out.println("Manipulate all space: "+ super.toString());
    }

}
