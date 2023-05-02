package X;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X.0XU  reason: invalid class name */
public class AnonymousClass0XU implements TimeInterpolator {
    public int A00;
    public int A01;
    public int[] A02;

    public AnonymousClass0XU(AnimationDrawable animationDrawable, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.A00 = numberOfFrames;
        int[] iArr = this.A02;
        if (iArr == null || iArr.length < numberOfFrames) {
            iArr = new int[numberOfFrames];
            this.A02 = iArr;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < numberOfFrames; i3++) {
            int i4 = i3;
            if (z2) {
                i4 = (numberOfFrames - i3) - 1;
            }
            int duration = animationDrawable.getDuration(i4);
            iArr[i3] = duration;
            i2 += duration;
        }
        this.A01 = i2;
    }

    public float getInterpolation(float f2) {
        float f3 = (float) this.A01;
        int i2 = (int) ((f2 * f3) + 0.5f);
        int i3 = this.A00;
        int[] iArr = this.A02;
        int i4 = 0;
        while (i4 < i3 && i2 >= iArr[i4]) {
            i2 -= iArr[i4];
            i4++;
        }
        float f4 = 0.0f;
        if (i4 < i3) {
            f4 = ((float) i2) / f3;
        }
        return (((float) i4) / ((float) i3)) + f4;
    }
}
