package com.jm.thegame.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Jan Michael Raymundo on 9/21/16.<br> Copyright © 2016 KlabCyscorpions. All rights reserved.
 */

public class UnitButton extends View {
    public UnitButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}

class UnitHPArea extends ViewGroup {

    private TextView mHPText;

    private ProgressBar mHPBar;

    public UnitHPArea(Context context, AttributeSet attrs) {
        super(context, attrs);
        mHPText = new TextView(context);
        mHPBar = new ProgressBar(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}

class UnitBBArea extends ViewGroup {

    public UnitBBArea(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
