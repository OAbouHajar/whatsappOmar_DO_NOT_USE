package X;

import android.animation.TypeEvaluator;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.0XX  reason: invalid class name */
public class AnonymousClass0XX implements TypeEvaluator {
    public static final AnonymousClass0XX A00 = new AnonymousClass0XX();

    public Object evaluate(float f2, Object obj, Object obj2) {
        int A0D = AnonymousClass000.A0D(obj);
        float f3 = ((float) ((A0D >> 24) & MotionEventCompat.ACTION_MASK)) / 255.0f;
        int A0D2 = AnonymousClass000.A0D(obj2);
        float pow = (float) Math.pow((double) (((float) ((A0D >> 16) & MotionEventCompat.ACTION_MASK)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((A0D >> 8) & MotionEventCompat.ACTION_MASK)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (A0D & MotionEventCompat.ACTION_MASK)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((A0D2 >> 16) & MotionEventCompat.ACTION_MASK)) / 255.0f), 2.2d);
        float pow5 = (float) Math.pow((double) (((float) ((A0D2 >> 8) & MotionEventCompat.ACTION_MASK)) / 255.0f), 2.2d);
        float f4 = pow + ((pow4 - pow) * f2);
        float A01 = AnonymousClass000.A01((float) Math.pow((double) (((float) (A0D2 & MotionEventCompat.ACTION_MASK)) / 255.0f), 2.2d), pow3, f2);
        return Integer.valueOf((Math.round(((float) Math.pow((double) f4, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f3 + (((((float) ((A0D2 >> 24) & MotionEventCompat.ACTION_MASK)) / 255.0f) - f3) * f2)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * f2)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) A01, 0.45454545454545453d)) * 255.0f));
    }
}
