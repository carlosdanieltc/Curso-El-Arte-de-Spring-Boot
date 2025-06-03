package com.debuggeandoideas.spring_boot_demo.models;

import com.debuggeandoideas.spring_boot_demo.utils.AvengerNotifier;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)
@Log
public class TimeStone extends Stone {

    public TimeStone(String colorProperty, String nameProperty, String locationProperty, Integer energyLevelProperty) {
        super(colorProperty, nameProperty, locationProperty, energyLevelProperty);
    }

    public void sendTime() {
        AvengerNotifier.sendNotification(TimeStone.class);
    }

    @Override
    public void usePower() {
        System.out.println("Control time: " + super.toString());
    }

}
