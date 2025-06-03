package com.debuggeandoideas.spring_boot_demo.models;

import com.debuggeandoideas.spring_boot_demo.utils.AvengerNotifier;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
public class MindStone extends Stone{

    public MindStone(String colorProperty, String nameProperty, String locationProperty, Integer energyLevelProperty) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendMind(){
        AvengerNotifier.sendNotification(MindStone.class);
    }

    @Override
    public void usePower() {
        System.out.println("Mind control in stone: "+ super.toString());
    }

}
