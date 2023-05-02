package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0A0  reason: invalid class name */
public class AnonymousClass0A0 extends ValueAnimator implements Choreographer.FrameCallback {
    public float A00 = 0.0f;
    public float A01 = 2.14748365E9f;
    public float A02 = -2.14748365E9f;
    public float A03 = 1.0f;
    public int A04 = 0;
    public long A05 = 0;
    public AnonymousClass0Rs A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final Set A09 = new CopyOnWriteArraySet();
    public final Set A0A = new CopyOnWriteArraySet();

    public static float A00(AnonymousClass0A0 r2) {
        AnonymousClass0Rs r0 = r2.A06;
        if (r0 == null) {
            return 0.0f;
        }
        float f2 = r2.A00;
        float f3 = r0.A02;
        return (f2 - f3) / (r0.A00 - f3);
    }

    public static void A01(AnonymousClass0A0 r1) {
        Choreographer.getInstance().removeFrameCallback(r1);
        r1.A07 = false;
    }

    public float A02() {
        AnonymousClass0Rs r2 = this.A06;
        if (r2 == null) {
            return 0.0f;
        }
        float f2 = this.A01;
        return f2 == 2.14748365E9f ? r2.A00 : f2;
    }

    public float A03() {
        AnonymousClass0Rs r2 = this.A06;
        if (r2 == null) {
            return 0.0f;
        }
        float f2 = this.A02;
        return f2 == -2.14748365E9f ? r2.A02 : f2;
    }

    public void A04() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.A0A) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void A05() {
        this.A07 = true;
        boolean z2 = false;
        if (this.A03 < 0.0f) {
            z2 = true;
        }
        for (Animator.AnimatorListener animatorListener : this.A09) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z2);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
        A07((float) ((int) (this.A03 < 0.0f ? A02() : A03())));
        this.A05 = 0;
        this.A04 = 0;
        A06();
    }

    public void A06() {
        if (this.A07) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void A07(float f2) {
        if (this.A00 != f2) {
            this.A00 = AnonymousClass000.A02(A02(), f2, A03());
            this.A05 = 0;
            A04();
        }
    }

    public void A08(float f2, float f3) {
        float f4;
        float f5;
        if (f2 <= f3) {
            AnonymousClass0Rs r0 = this.A06;
            if (r0 == null) {
                f4 = -3.4028235E38f;
                f5 = Float.MAX_VALUE;
            } else {
                f4 = r0.A02;
                f5 = r0.A00;
            }
            this.A02 = AnonymousClass000.A02(f5, f2, f4);
            this.A01 = AnonymousClass000.A02(f5, f3, f4);
            A07((float) ((int) AnonymousClass000.A02(f3, this.A00, f2)));
            return;
        }
        throw AnonymousClass000.A0T(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f2), Float.valueOf(f3)}));
    }

    public void A09(boolean z2) {
        for (Animator.AnimatorListener animatorListener : this.A09) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z2);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.A09.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0A.add(animatorUpdateListener);
    }

    public void cancel() {
        for (Animator.AnimatorListener onAnimationCancel : this.A09) {
            onAnimationCancel.onAnimationCancel(this);
        }
        A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r4 > r2) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r8) {
        /*
            r7 = this;
            r7.A06()
            X.0Rs r6 = r7.A06
            if (r6 == 0) goto L_0x008f
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x008f
            long r1 = r7.A05
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            long r3 = r8 - r1
        L_0x0015:
            r5 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r6.A01
            float r5 = r5 / r0
            float r2 = r7.A03
            float r0 = java.lang.Math.abs(r2)
            float r5 = r5 / r0
            float r1 = (float) r3
            float r1 = r1 / r5
            float r4 = r7.A00
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            float r1 = -r1
        L_0x002c:
            float r4 = r4 + r1
            r7.A00 = r4
            float r3 = r7.A03()
            float r2 = r7.A02()
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0040
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r1 = r0 ^ 1
            float r0 = X.AnonymousClass000.A02(r2, r4, r3)
            r7.A00 = r0
            r7.A05 = r8
            r7.A04()
            if (r1 == 0) goto L_0x007a
            int r1 = r7.getRepeatCount()
            r0 = -1
            if (r1 == r0) goto L_0x0095
            int r1 = r7.A04
            int r0 = r7.getRepeatCount()
            if (r1 < r0) goto L_0x0095
            float r0 = r7.A03
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0090
            float r0 = r7.A03()
        L_0x006a:
            r7.A00 = r0
            A01(r7)
            float r0 = r7.A03
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0077
            r0 = 1
        L_0x0077:
            r7.A09(r0)
        L_0x007a:
            X.0Rs r0 = r7.A06
            if (r0 == 0) goto L_0x008c
            float r4 = r7.A00
            float r3 = r7.A02
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00d9
            float r0 = r7.A01
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00d9
        L_0x008c:
            X.AnonymousClass0NI.A01()
        L_0x008f:
            return
        L_0x0090:
            float r0 = r7.A02()
            goto L_0x006a
        L_0x0095:
            java.util.Set r0 = r7.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x009b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r0.onAnimationRepeat(r7)
            goto L_0x009b
        L_0x00ab:
            int r0 = r7.A04
            int r0 = r0 + 1
            r7.A04 = r0
            int r1 = r7.getRepeatMode()
            r0 = 2
            if (r1 != r0) goto L_0x00c6
            boolean r0 = r7.A08
            r0 = r0 ^ 1
            r7.A08 = r0
            float r0 = r7.A03
            float r0 = -r0
            r7.A03 = r0
        L_0x00c3:
            r7.A05 = r8
            goto L_0x007a
        L_0x00c6:
            float r1 = r7.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d4
            float r0 = r7.A02()
        L_0x00d1:
            r7.A00 = r0
            goto L_0x00c3
        L_0x00d4:
            float r0 = r7.A03()
            goto L_0x00d1
        L_0x00d9:
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r2[r1] = r0
            r1 = 1
            float r0 = r7.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2[r1] = r0
            r1 = 2
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = "Frame must be [%f,%f]. It is %f"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A0.doFrame(long):void");
    }

    public float getAnimatedFraction() {
        float f2;
        float A032;
        if (this.A06 == null) {
            return 0.0f;
        }
        if (this.A03 < 0.0f) {
            f2 = A02();
            A032 = this.A00;
        } else {
            f2 = this.A00;
            A032 = A03();
        }
        return (f2 - A032) / (A02() - A03());
    }

    public Object getAnimatedValue() {
        return Float.valueOf(A00(this));
    }

    public long getDuration() {
        AnonymousClass0Rs r0 = this.A06;
        if (r0 == null) {
            return 0;
        }
        return (long) AnonymousClass0Rs.A00(r0);
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public boolean isRunning() {
        return this.A07;
    }

    public void removeAllListeners() {
        this.A09.clear();
    }

    public void removeAllUpdateListeners() {
        this.A0A.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.A09.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0A.remove(animatorUpdateListener);
    }

    public ValueAnimator setDuration(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.A08) {
            this.A08 = false;
            this.A03 = -this.A03;
        }
    }

    public void setStartDelay(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
