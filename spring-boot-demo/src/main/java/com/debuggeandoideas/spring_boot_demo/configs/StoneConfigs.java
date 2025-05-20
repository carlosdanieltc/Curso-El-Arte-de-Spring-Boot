package com.debuggeandoideas.spring_boot_demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.debuggeandoideas.spring_boot_demo.models.MindStone;
import com.debuggeandoideas.spring_boot_demo.models.PowerStone;
import com.debuggeandoideas.spring_boot_demo.models.RealityStone;
import com.debuggeandoideas.spring_boot_demo.models.SoulStone;
import com.debuggeandoideas.spring_boot_demo.models.SpaceStone;
import com.debuggeandoideas.spring_boot_demo.models.TimeStone;

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
