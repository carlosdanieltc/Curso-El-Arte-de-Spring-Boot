package com.debuggeandoideas.spring_boot_demo.models;

import com.debuggeandoideas.spring_boot_demo.utils.AvengerNotifier;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
public class SoulStone extends Stone{

    public SoulStone(String colorProperty, String nameProperty, String locationProperty, Integer energyLevelProperty) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendSoul(){
        AvengerNotifier.sendNotification(SoulStone.class);
    }

    @Override
    public void usePower() {
        System.out.println("Total control: "+ super.toString());
    }

}
