package com.debuggeandoideas.configs;

import java.util.function.Consumer;

import com.debuggeandoideas.factories.MindStoneFactory;
import com.debuggeandoideas.factories.PowerStoneFactory;
import com.debuggeandoideas.factories.RealityStoneFactory;
import com.debuggeandoideas.factories.SoulStoneFactory;
import com.debuggeandoideas.factories.SpaceStoneFactory;
import com.debuggeandoideas.factories.TimeStoneFactory;
import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.SoulStone;
import com.debuggeandoideas.models.SpaceStone;
import com.debuggeandoideas.models.TimeStone;
import com.debuggeandoideas.services.GauntletService;
import com.debuggeandoideas.services.GauntletServiceImpl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

//IoC
@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StoneContext {

    public static GauntletService setContext(Consumer<Void> preConstruct, Consumer<Void> postConstruct){

        log.info("IoC set Scope");
        System.setProperty("scope", "singleton");

        log.info("IoC executing PreConstruct");
        //@PreConstruct
        preConstruct.accept(null);

        log.info("IoC creating factories");
        var realityfactory = new RealityStoneFactory();
        var timefactory = new TimeStoneFactory();
        var soulfactory = new SoulStoneFactory();
        var powerfactory = new PowerStoneFactory();
        var spacefactory = new SpaceStoneFactory();
        var mindfactory = new MindStoneFactory();

        log.info("IoC instance objects");
        RealityStone reality = (RealityStone) realityfactory.createStone();
        TimeStone time = (TimeStone) timefactory.createStone();
        SoulStone soul = (SoulStone) soulfactory.createStone();
        PowerStone power = (PowerStone) powerfactory.createStone();
        SpaceStone space = (SpaceStone) spacefactory.createStone();
        MindStone mind = (MindStone) mindfactory.createStone();

        log.info("IoC loading GauntletServiceImpl in container");
        final var gauntletService = new GauntletServiceImpl(mind, power, reality, soul, space, time);

        log.info("IoC executing PostConstruct");
        //@PostConstruct
        postConstruct.accept(null);

        return gauntletService;
    }

    public static void destroyContext(GauntletService gauntletService){

        log.info("Cleaning context");
        if (gauntletService instanceof GauntletServiceImpl) {
            ((GauntletServiceImpl) gauntletService).getMind().clear();
            ((GauntletServiceImpl) gauntletService).getTime().clear();
            ((GauntletServiceImpl) gauntletService).getSoul().clear();
            ((GauntletServiceImpl) gauntletService).getPower().clear();
            ((GauntletServiceImpl) gauntletService).getSpace().clear();
            ((GauntletServiceImpl) gauntletService).getReality().clear();
        }

        log.info("Cleaning properties");
        System.clearProperty("scope");
    }
}
