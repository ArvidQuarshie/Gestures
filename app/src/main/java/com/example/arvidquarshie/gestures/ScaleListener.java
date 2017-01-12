package com.example.arvidquarshie.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/**
 * Created by arvid.quarshie on 1/12/2017.
 */

public class ScaleListener extends
        ScaleGestureDetector.SimpleOnScaleGestureListener {
    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        return false;
    }


    public boolean onTouchEvent(MotionEvent ev) {
        View scaleGestureDetector = null;
        scaleGestureDetector.onTouchEvent(ev);
        return true;
    }
}
