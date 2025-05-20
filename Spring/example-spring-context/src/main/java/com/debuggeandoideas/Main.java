package com.debuggeandoideas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.debuggeandoideas.beans.HelloWorld;
import com.debuggeandoideas.configs.StoneConfigs;
import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.SoulStone;
import com.debuggeandoideas.models.SpaceStone;
import com.debuggeandoideas.models.TimeStone;
import com.debuggeandoideas.services.GauntletService;
import com.debuggeandoideas.services.GauntletServiceImpl;

public class Main {
    public static void main(String[] args) {

        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(StoneConfigs.class);

        final GauntletServiceImpl gauntletService = applicationContext.getBean(GauntletServiceImpl.class);

        gauntletService.useFullPower();
        
        // final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("stones.xml");
        // final GauntletServiceImpl gauntletService = applicationContext.getBean("gauntlet", GauntletServiceImpl.class);

        // gauntletService.useGauntlet("reality");
        // gauntletService.useGauntlet("power");

        // final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("stones.xml");

        // final MindStone mind = applicationContext.getBean("mind", MindStone.class);
        // final PowerStone power = applicationContext.getBean("power", PowerStone.class);
        // final RealityStone reality = applicationContext.getBean("reality", RealityStone.class);
        // final SoulStone soul = applicationContext.getBean("soul", SoulStone.class);
        // final SpaceStone space = applicationContext.getBean("space", SpaceStone.class);
        // final TimeStone time = applicationContext.getBean("time", TimeStone.class);

        // final GauntletService gauntletService = new GauntletServiceImpl(reality, soul, mind, power, space, time);

        // gauntletService.useFullPower();
        // gauntletService.useGauntlet("mind");

        // applicationContext.close();
    }
}