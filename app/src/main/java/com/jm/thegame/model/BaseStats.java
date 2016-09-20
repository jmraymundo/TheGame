package com.jm.thegame.model;

/**
 * Created by Jan Michael Raymundo on 9/20/16.<br> Copyright © 2016 KlabCyscorpions. All rights reserved.
 */

public class BaseStats {
    private final int mHp;

    private final int mAtk;

    private final int mDef;

    private final int mRec;

    private BaseStats mInstance;

    private BaseStats(int hp, int atk, int def, int rec) {
        mHp = hp;
        mAtk = atk;
        mDef = def;
        mRec = rec;
    }

    public static BaseStats generate(int hp, int atk, int def, int rec) {
        return new BaseStats(hp, atk, def, rec);
    }

    public int getHp() {
        return mHp;
    }

    public int getAtk() {
        return mAtk;
    }

    public int getDef() {
        return mDef;
    }

    public int getRec() {
        return mRec;
    }
}