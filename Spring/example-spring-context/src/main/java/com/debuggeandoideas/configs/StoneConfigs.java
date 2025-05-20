package com.debuggeandoideas.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.SoulStone;
import com.debuggeandoideas.models.SpaceStone;
import com.debuggeandoideas.models.TimeStone;

@Configuration
@ComponentScan(basePackages = "com.debuggeandoideas")
public class StoneConfigs {

    @Bean(name = "mind")
    @Scope("prototype")
    public MindStone mindStone() {
        return new MindStone();
    }

    @Bean(name = "power")
    @Scope("prototype")
    public PowerStone powerStone() {
        return new PowerStone();
    }

    @Bean(name = "reality")
    @Scope("prototype")
    public RealityStone realityStone() {
        return new RealityStone();
    }

    @Bean(name = "time")
    @Scope("prototype")
    public TimeStone timeStone() {
        return new TimeStone();
    }

    @Bean(name = "soul")
    @Scope("prototype")
    public SoulStone soulStone() {
        return new SoulStone();
    }

    @Bean(name = "space")
    @Scope("prototype")
    public SpaceStone spaceStone() {
        return new SpaceStone();
    }
}
