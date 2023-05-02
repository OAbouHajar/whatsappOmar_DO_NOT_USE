package com.facebook.redex;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

public class IDxPropertyShape0S0000000_I0 extends Property {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxPropertyShape0S0000000_I0(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0012;
                case 2: goto L_0x0017;
                case 3: goto L_0x0017;
                case 4: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "position"
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "thumbPos"
            goto L_0x0009
        L_0x0012:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "topLeft"
            goto L_0x0009
        L_0x0017:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "bottomRight"
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxPropertyShape0S0000000_I0.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        if (this.A00 != 0) {
            return null;
        }
        return Float.valueOf(((SwitchCompat) obj).A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a1, code lost:
        X.C06430Vt.A02.A08(r4, r5, r6, r7, r8);
        r2.A05 = 0;
        r2.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        X.C06430Vt.A02.A08(r2, r3, r4, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void set(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r2 = r10
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x007d;
                case 2: goto L_0x0058;
                case 3: goto L_0x003f;
                case 4: goto L_0x0026;
                default: goto L_0x0006;
            }
        L_0x0006:
            android.view.View r2 = (android.view.View) r2
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            float r0 = r11.x
            int r3 = java.lang.Math.round(r0)
            float r0 = r11.y
            int r4 = java.lang.Math.round(r0)
            int r5 = r2.getWidth()
            int r5 = r5 + r3
            int r6 = r2.getHeight()
            int r6 = r6 + r4
        L_0x0020:
            X.0SD r1 = X.C06430Vt.A02
            r1.A08(r2, r3, r4, r5, r6)
        L_0x0025:
            return
        L_0x0026:
            android.view.View r2 = (android.view.View) r2
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            float r0 = r11.x
            int r3 = java.lang.Math.round(r0)
            float r0 = r11.y
            int r4 = java.lang.Math.round(r0)
            int r5 = r2.getRight()
            int r6 = r2.getBottom()
            goto L_0x0020
        L_0x003f:
            android.view.View r2 = (android.view.View) r2
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            int r3 = r2.getLeft()
            int r4 = r2.getTop()
            float r0 = r11.x
            int r5 = java.lang.Math.round(r0)
            float r0 = r11.y
            int r6 = java.lang.Math.round(r0)
            goto L_0x0020
        L_0x0058:
            X.0P4 r2 = (X.AnonymousClass0P4) r2
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            float r0 = r11.x
            int r7 = java.lang.Math.round(r0)
            r2.A03 = r7
            float r0 = r11.y
            int r8 = java.lang.Math.round(r0)
            r2.A00 = r8
            int r0 = r2.A01
            int r1 = r0 + 1
            r2.A01 = r1
            int r0 = r2.A05
            if (r0 != r1) goto L_0x0025
            android.view.View r4 = r2.A06
            int r5 = r2.A02
            int r6 = r2.A04
            goto L_0x00a1
        L_0x007d:
            X.0P4 r2 = (X.AnonymousClass0P4) r2
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            float r0 = r11.x
            int r5 = java.lang.Math.round(r0)
            r2.A02 = r5
            float r0 = r11.y
            int r6 = java.lang.Math.round(r0)
            r2.A04 = r6
            int r0 = r2.A05
            int r1 = r0 + 1
            r2.A05 = r1
            int r0 = r2.A01
            if (r1 != r0) goto L_0x0025
            android.view.View r4 = r2.A06
            int r7 = r2.A03
            int r8 = r2.A00
        L_0x00a1:
            X.0SD r3 = X.C06430Vt.A02
            r3.A08(r4, r5, r6, r7, r8)
            r0 = 0
            r2.A05 = r0
            r2.A01 = r0
            return
        L_0x00ac:
            androidx.appcompat.widget.SwitchCompat r2 = (androidx.appcompat.widget.SwitchCompat) r2
            float r0 = X.AnonymousClass000.A04(r11)
            r2.setThumbPosition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxPropertyShape0S0000000_I0.set(java.lang.Object, java.lang.Object):void");
    }
}
