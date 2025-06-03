package com.debuggeandoideas.spring_boot_demo.models;

import com.debuggeandoideas.spring_boot_demo.utils.AvengerNotifier;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
public class PowerStone extends Stone{

    public PowerStone(String colorProperty, String nameProperty, String locationProperty, Integer energyLevelProperty) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendPower(){
        AvengerNotifier.sendNotification(PowerStone.class);
    }

    @Override
    public void usePower() {
        System.out.println("Increase power and energy: "+ super.toString());
    }

}
