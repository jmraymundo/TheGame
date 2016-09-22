package com.jm.thegame.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jm.thegame.R;

/**
 * Created by Jan Michael Raymundo on 9/21/16.<br> Copyright © 2016 KlabCyscorpions. All rights reserved.
 */

public class UnitButton extends LinearLayout {

    private ImageView mUnitImage;

    private TextView mUnitName;

    private UnitHPArea mUnitHPArea;

    private UnitBBArea mUnitBBArea;

    public UnitButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        setClickable(true);
    }

    private void initView(Context context) {
        inflate(context, R.layout.view_battle_button_unit, this);
        mUnitImage = (ImageView) findViewById(R.id.view_battle_button_unit_image);
        mUnitName = (TextView) findViewById(R.id.view_battle_button_unit_name);
        mUnitHPArea = (UnitHPArea) findViewById(R.id.view_battle_button_unit_hp_area);
        mUnitBBArea = (UnitBBArea) findViewById(R.id.view_battle_button_unit_bb_area);
    }

    @Override
    public void setOnClickListener(OnClickListener l) {
        super.setOnClickListener(l);
    }
}

class UnitHPArea extends TextProgressBarView {

    public UnitHPArea(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}

class UnitBBArea extends TextProgressBarView {

    public UnitBBArea(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
