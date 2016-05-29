package com.nanodegree;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by priteshjain on 29/05/16.
 */
public class SquareButtonView extends Button {
    public SquareButtonView(Context context) {
        super(context);
    }

    public SquareButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); //Snap to width
    }
}