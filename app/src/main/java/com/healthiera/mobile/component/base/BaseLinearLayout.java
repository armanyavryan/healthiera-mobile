package com.healthiera.mobile.component.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.healthiera.mobile.R;

/**
 * Created by Davit on 28.08.2016.
 */
public class BaseLinearLayout extends LinearLayout {
    public BaseLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public BaseLinearLayout(Context context) {
        super(context, null);
    }

}
