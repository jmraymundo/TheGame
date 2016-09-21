package com.jm.thegame.model;

/**
 * Created by Jan Michael Raymundo on 9/20/16.<br> Copyright © 2016 KlabCyscorpions. All rights reserved.
 */

public class UnitStats {
    private int mId;

    private int mRarity;

    private String mName;

    private BaseStats mBaseStats;

    private UnitType mUnitType;

    private enum UnitType {
        LORD(0, 0, 0, 0), ANIMA(10, 0, 0, -10), BREAKER(0, 10, -10, 0), GUARDIAN(0, 0, 5, -5), ORACLE(0, 0, -5, 5);

        private final int mHpInc;

        private final int mAtkInc;

        private final int mDefInc;

        private final int mRecInc;

        UnitType(int hp, int atk, int def, int rec) {
            mHpInc = hp;
            mAtkInc = atk;
            mDefInc = def;
            mRecInc = rec;
        }
    }
}
