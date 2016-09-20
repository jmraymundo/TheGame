package com.jm.thegame.model;

/**
 * Created by Jan Michael Raymundo on 9/20/16.<br> Copyright © 2016 KlabCyscorpions. All rights reserved.
 */

public class Unit {
    private int mId;

    private int mRarity;

    private String mName;

    private BaseStats mBaseStats;

    private UnitType mUnitType;

    private enum UnitType {
        LORD, ANIMA, BREAKER, GUARDIAN, ORACLE;
    }
}
