package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: X.0Yp  reason: invalid class name and case insensitive filesystem */
public class C06960Yp implements View.OnTouchListener {
    public static final int A0G = ViewConfiguration.getTapTimeout();
    public int A00;
    public Runnable A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float[] A07 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A08 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A09 = {0.0f, 0.0f};
    public float[] A0A = {0.0f, 0.0f};
    public float[] A0B = {0.0f, 0.0f};
    public final View A0C;
    public final Interpolator A0D = new AccelerateInterpolator();
    public final ListView A0E;
    public final AnonymousClass0Q1 A0F = new AnonymousClass0Q1();

    public C06960Yp(ListView listView) {
        this.A0C = listView;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.A08;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.A09;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        float[] fArr3 = this.A07;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.A0A;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.A0B;
        float f5 = 1.0f / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        this.A00 = A0G;
        AnonymousClass0Q1 r1 = this.A0F;
        r1.A04 = 500;
        r1.A03 = 500;
        this.A0E = listView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r1 == 0.0f) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        if (r6.A03 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r6.A03 != false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00(float r7, float r8, float r9, int r10) {
        /*
            r6 = this;
            float[] r0 = r6.A0A
            r3 = r0[r10]
            float[] r0 = r6.A07
            r1 = r0[r10]
            float r3 = r3 * r8
            r5 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r3 = r1
        L_0x000f:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            float r0 = r7 / r3
            float r1 = r1 - r0
        L_0x0020:
            float r8 = r8 - r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            float r8 = r8 / r3
            float r2 = r2 - r8
        L_0x0031:
            float r2 = r2 - r1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            android.view.animation.Interpolator r1 = r6.A0D
            float r0 = -r2
            float r0 = r1.getInterpolation(r0)
            float r1 = -r0
        L_0x003e:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0048:
            float[] r0 = r6.A0B
            r4 = r0[r10]
            float[] r0 = r6.A09
            r3 = r0[r10]
            float[] r0 = r6.A08
            r2 = r0[r10]
            float r4 = r4 * r9
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L_0x008e
            return r3
        L_0x0064:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0048
        L_0x006b:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            android.view.animation.Interpolator r0 = r6.A0D
            float r1 = r0.getInterpolation(r2)
            goto L_0x003e
        L_0x0076:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0048
        L_0x007a:
            return r5
        L_0x007b:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0080
            goto L_0x0031
        L_0x0080:
            r2 = 0
            goto L_0x0031
        L_0x0082:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x008c
            goto L_0x0020
        L_0x0087:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x000f
            r3 = 0
        L_0x008c:
            r1 = 0
            goto L_0x0020
        L_0x008e:
            return r2
        L_0x008f:
            float r1 = -r1
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L_0x009b
            r2 = r3
        L_0x009b:
            float r2 = -r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06960Yp.A00(float, float, float, int):float");
    }

    public final void A01() {
        if (this.A06) {
            this.A03 = false;
            return;
        }
        AnonymousClass0Q1 r6 = this.A0F;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - r6.A06);
        int i3 = r6.A03;
        if (i2 <= i3) {
            i3 = i2;
            if (i2 < 0) {
                i3 = 0;
            }
        }
        r6.A02 = i3;
        r6.A00 = r6.A00(currentAnimationTimeMillis);
        r6.A07 = currentAnimationTimeMillis;
    }

    public boolean A02() {
        ListView listView;
        int count;
        float f2 = this.A0F.A01;
        int abs = (int) (f2 / Math.abs(f2));
        if (abs == 0 || (count = listView.getCount()) == 0) {
            return false;
        }
        int childCount = (listView = this.A0E).getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        return abs > 0 ? firstVisiblePosition + childCount < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight() : firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            boolean r0 = r6.A04
            r5 = 0
            if (r0 == 0) goto L_0x0014
            int r1 = r8.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r4) goto L_0x006e
            r0 = 2
            if (r1 == r0) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x006e
        L_0x0014:
            return r5
        L_0x0015:
            r6.A05 = r4
            r6.A02 = r5
        L_0x0019:
            float r2 = r8.getX()
            int r0 = r7.getWidth()
            float r1 = (float) r0
            android.view.View r3 = r6.A0C
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r6.A00(r2, r1, r0, r5)
            float r2 = r8.getY()
            int r0 = r7.getHeight()
            float r1 = (float) r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r1 = r6.A00(r2, r1, r0, r4)
            X.0Q1 r0 = r6.A0F
            r0.A01 = r1
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x0014
            boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x0014
            java.lang.Runnable r2 = r6.A01
            if (r2 != 0) goto L_0x0057
            X.0hJ r2 = new X.0hJ
            r2.<init>(r6)
            r6.A01 = r2
        L_0x0057:
            r6.A03 = r4
            r6.A06 = r4
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x006a
            int r0 = r6.A00
            if (r0 <= 0) goto L_0x006a
            long r0 = (long) r0
            r3.postOnAnimationDelayed(r2, r0)
        L_0x0067:
            r6.A02 = r4
            return r5
        L_0x006a:
            r2.run()
            goto L_0x0067
        L_0x006e:
            r6.A01()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06960Yp.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
