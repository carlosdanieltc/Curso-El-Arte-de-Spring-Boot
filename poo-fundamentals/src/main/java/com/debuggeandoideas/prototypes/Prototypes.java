package com.debuggeandoideas.prototypes;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.SoulStone;
import com.debuggeandoideas.models.SpaceStone;
import com.debuggeandoideas.models.TimeStone;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Prototypes {

    public static StonePrototype<MindStone> mindPrototype = stone -> stone.getPrototype();

    public static StonePrototype<PowerStone> powerPrototype = stone -> stone.getPrototype();

    public static StonePrototype<RealityStone> realityPrototype = stone -> stone.getPrototype();

    public static StonePrototype<SoulStone> soulPrototype = stone -> stone.getPrototype();

    public static StonePrototype<SpaceStone> spacePrototype = stone -> stone.getPrototype();

    public static StonePrototype<TimeStone> timePrototype = stone -> stone.getPrototype();
}
