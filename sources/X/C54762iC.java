package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.2iC  reason: invalid class name and case insensitive filesystem */
public class C54762iC extends OrientationEventListener {
    public int A00 = -1;
    public final C54842iM A01;

    public C54762iC(Context context, C54842iM r3) {
        super(context);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0100, code lost:
        if (r14 >= 300) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r14) {
        /*
            r13 = this;
            r1 = -1
            if (r14 == r1) goto L_0x00bb
            r0 = 330(0x14a, float:4.62E-43)
            if (r14 >= r0) goto L_0x0105
            r0 = 30
            if (r14 < r0) goto L_0x0105
            r0 = 60
            if (r14 < r0) goto L_0x0102
            r0 = 120(0x78, float:1.68E-43)
            if (r14 >= r0) goto L_0x00ee
            r4 = 1
        L_0x0014:
            int r0 = r13.A00
            if (r4 == r0) goto L_0x00bb
            if (r4 == r1) goto L_0x00bb
            r13.A00 = r4
            X.2iM r0 = r13.A01
            X.1aI r2 = r0.A00
            X.0pN r0 = r2.A0A
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r2.A0X()
            if (r0 != 0) goto L_0x00bb
            X.2V5 r3 = r2.A0F
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x008f
            int r5 = r3.A03
            r0 = 1
            r1 = 90
            if (r5 == r0) goto L_0x00ea
            r0 = 3
            if (r5 == r0) goto L_0x003c
            int r1 = r5 * 90
        L_0x003c:
            r0 = 1
            r5 = 90
            if (r4 == r0) goto L_0x00e6
            r0 = 3
            if (r4 == r0) goto L_0x0046
            int r5 = r4 * 90
        L_0x0046:
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != 0) goto L_0x00de
            if (r5 != r0) goto L_0x004e
            r1 = 360(0x168, float:5.04E-43)
        L_0x004e:
            float r7 = (float) r1
            float r8 = (float) r5
            r9 = 1
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            r12 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.RotateAnimation r6 = new android.view.animation.RotateAnimation
            r6.<init>(r7, r8, r9, r10, r11, r12)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r6.setInterpolator(r0)
            r0 = 100
            r6.setDuration(r0)
            r6.setFillAfter(r9)
            com.obwhatsapp.WaImageView r0 = r3.A0G
            r0.startAnimation(r6)
            com.obwhatsapp.WaImageView r0 = r3.A0J
            r0.startAnimation(r6)
            com.obwhatsapp.WaImageView r0 = r3.A0H
            r0.startAnimation(r6)
            android.view.View r1 = r3.A0C
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0085
            r1.startAnimation(r6)
        L_0x0085:
            r3.A00 = r5
            r3.A03 = r4
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x00d5
            r3.A07 = r9
        L_0x008f:
            X.2DG r1 = r2.A0J
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x00bb
            com.obwhatsapp.camera.recording.RecordingView r5 = r1.A04
            r0 = 1
            r1 = 90
            if (r4 == r0) goto L_0x00d2
            r0 = 3
            if (r4 == r0) goto L_0x00a1
            int r1 = r4 * 90
        L_0x00a1:
            float r0 = (float) r1
            r5.setRotation(r0)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            X.06X r3 = (X.AnonymousClass06X) r3
            r2 = -1
            r1 = 0
            r0 = 1
            if (r4 != r0) goto L_0x00bc
            r3.A0T = r1
            r3.A0p = r1
            r3.A0l = r2
        L_0x00b6:
            r3.A0B = r1
        L_0x00b8:
            r5.setLayoutParams(r3)
        L_0x00bb:
            return
        L_0x00bc:
            r0 = 3
            if (r4 != r0) goto L_0x00c6
            r3.A0T = r2
            r3.A0p = r1
            r3.A0l = r1
            goto L_0x00b6
        L_0x00c6:
            r3.A0T = r1
            r0 = 2131362554(0x7f0a02fa, float:1.8344892E38)
            r3.A0p = r0
            r3.A0l = r1
            r3.A0B = r2
            goto L_0x00b8
        L_0x00d2:
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x00a1
        L_0x00d5:
            if (r4 == r9) goto L_0x00da
            r0 = 3
            if (r4 != r0) goto L_0x008f
        L_0x00da:
            r2.A0C()
            goto L_0x008f
        L_0x00de:
            if (r1 != r0) goto L_0x004e
            if (r5 != 0) goto L_0x004e
            r5 = 360(0x168, float:5.04E-43)
            goto L_0x004e
        L_0x00e6:
            r5 = 270(0x10e, float:3.78E-43)
            goto L_0x0046
        L_0x00ea:
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x003c
        L_0x00ee:
            r0 = 150(0x96, float:2.1E-43)
            if (r14 < r0) goto L_0x0102
            r0 = 210(0xd2, float:2.94E-43)
            if (r14 >= r0) goto L_0x00f9
            r4 = 2
            goto L_0x0014
        L_0x00f9:
            r0 = 240(0xf0, float:3.36E-43)
            if (r14 < r0) goto L_0x0102
            r0 = 300(0x12c, float:4.2E-43)
            r4 = 3
            if (r14 < r0) goto L_0x0014
        L_0x0102:
            r4 = -1
            goto L_0x0014
        L_0x0105:
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54762iC.onOrientationChanged(int):void");
    }
}
