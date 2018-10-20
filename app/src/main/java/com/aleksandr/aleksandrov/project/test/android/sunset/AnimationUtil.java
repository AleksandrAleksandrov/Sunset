package com.aleksandr.aleksandrov.project.test.android.sunset;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by Alexandrov Alex on 10/20/18.
 */
public class AnimationUtil {

    public static ObjectAnimator animateColor(View view, long duration, int fromColor, int toColor) {
        ObjectAnimator sunsetSkyAnimator = ObjectAnimator
                .ofInt(view, "backgroundColor", fromColor, toColor)
                .setDuration(duration);
        sunsetSkyAnimator.setEvaluator(new ArgbEvaluator());

        return sunsetSkyAnimator;
    }
}
