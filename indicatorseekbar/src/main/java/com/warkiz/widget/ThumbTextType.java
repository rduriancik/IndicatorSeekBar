package com.warkiz.widget;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Robert Duriancik on 3/2/20.
 */

@Retention(RetentionPolicy.SOURCE)
@IntDef({ThumbTextType.NONE, ThumbTextType.INSIDE, ThumbTextType.BELOW})
public @interface ThumbTextType {

    int NONE = 0;

    int INSIDE = 1;

    int BELOW = 2;

    int FLOATING = 3;
}
