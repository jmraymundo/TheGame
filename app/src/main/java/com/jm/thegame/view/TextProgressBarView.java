package com.jm.thegame.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.jm.thegame.R;

/**
 * Created by Jan Michael Raymundo on 9/22/16.<br> Copyright © 2016 KlabCyscorpions. All rights reserved.
 */

public class TextProgressBarView extends ViewGroup {
    private TextView mTextView;

    private ProgressBar mProgressBar;

    public TextProgressBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        inflate(context, R.layout.view_text_progressbar, this);
        mTextView = (TextView) findViewById(R.id.view_text_progressbar_text);
        mProgressBar = (ProgressBar) findViewById(R.id.view_text_progressbar_progressbar);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (!changed) {
            return;
        }
        mTextView.layout(l, t, r, b);
        mProgressBar.layout(l, t, r, b);
    }

    public void setText(String text) {
        mTextView.setText(text);
    }

    public void setMaxValue(int value) {
        mProgressBar.setMax(value);
    }
}
