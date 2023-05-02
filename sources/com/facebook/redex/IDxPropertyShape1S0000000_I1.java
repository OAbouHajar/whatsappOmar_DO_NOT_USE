package com.facebook.redex;

import X.AnonymousClass000;
import X.C004601z;
import X.C05190Pq;
import X.C06430Vt;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

public class IDxPropertyShape1S0000000_I1 extends Property {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxPropertyShape1S0000000_I1(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0012;
                case 2: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r0 = "clipBounds"
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "translationAlpha"
            goto L_0x0009
        L_0x0012:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "translations"
            goto L_0x0009
        L_0x0017:
            java.lang.Class<float[]> r1 = float[].class
            java.lang.String r0 = "nonTranslations"
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxPropertyShape1S0000000_I1.<init>(int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxPropertyShape1S0000000_I1(Class cls, int i2) {
        super(cls, 4 - i2 != 0 ? "alpha" : "translationXPercent");
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        float f2;
        switch (this.A00) {
            case 2:
                f2 = C06430Vt.A02.A00((View) obj);
                break;
            case 3:
                return C004601z.A0B((View) obj);
            case 4:
                View view = (View) obj;
                float width = (float) view.getWidth();
                f2 = 0.0f;
                if (width > 0.0f) {
                    f2 = view.getTranslationX() / width;
                    break;
                }
                break;
            case 5:
                f2 = ((View) obj).getAlpha();
                break;
            default:
                return null;
        }
        return Float.valueOf(f2);
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C05190Pq r5;
        switch (this.A00) {
            case 0:
                r5 = (C05190Pq) obj;
                float[] fArr = (float[]) obj2;
                System.arraycopy(fArr, 0, r5.A04, 0, fArr.length);
                break;
            case 1:
                r5 = (C05190Pq) obj;
                PointF pointF = (PointF) obj2;
                r5.A00 = pointF.x;
                r5.A01 = pointF.y;
                break;
            case 2:
                float A04 = AnonymousClass000.A04(obj2);
                C06430Vt.A02.A06((View) obj, A04);
                return;
            case 3:
                C004601z.A0i((View) obj, (Rect) obj2);
                return;
            case 4:
                View view = (View) obj;
                view.setTranslationX(((float) view.getWidth()) * ((Number) obj2).floatValue());
                return;
            default:
                ((View) obj).setAlpha(AnonymousClass000.A04(obj2));
                return;
        }
        float[] fArr2 = r5.A04;
        fArr2[2] = r5.A00;
        fArr2[5] = r5.A01;
        Matrix matrix = r5.A02;
        matrix.setValues(fArr2);
        C06430Vt.A02.A01(matrix, r5.A03);
    }
}
