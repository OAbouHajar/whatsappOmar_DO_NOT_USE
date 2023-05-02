package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3uu  reason: invalid class name and case insensitive filesystem */
public class C76923uu extends C61773Ag {
    public float A00;
    public int A01 = 0;
    public final float A02;
    public final long A03;
    public final long A04;
    public final C88764b3 A05;
    public final C86244Rv A06;
    public final List A07 = AnonymousClass000.A0u();
    public final float[] A08 = new float[4];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76923uu(android.graphics.Bitmap r10, android.graphics.Paint r11, android.graphics.PointF r12, android.graphics.PointF r13, float r14, float r15, int r16, long r17) {
        /*
            r9 = this;
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r9.A07 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r9.A08 = r0
            r0 = 0
            r9.A01 = r0
            r0 = r17
            r9.A04 = r0
            X.4Rv r2 = new X.4Rv
            r2.<init>(r12, r0)
            r9.A06 = r2
            X.4Rm r2 = r2.A01
            X.4b3 r2 = r2.A03
            r9.A05 = r2
            r9.A02 = r15
            r9.A03 = r0
            float r2 = r9.A06(r8)
            r9.A00 = r2
            r9.A04(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76923uu.<init>(android.graphics.Bitmap, android.graphics.Paint, android.graphics.PointF, android.graphics.PointF, float, float, int, long):void");
    }

    public void A01(Bitmap bitmap, PointF pointF, int i2) {
        super.A01(bitmap, pointF, i2);
        this.A00 = A06(i2);
    }

    public void A02(Canvas canvas) {
        A07(canvas, 0);
    }

    public void A03(PointF pointF, long j2) {
        long max = Math.max(j2, this.A03 + 1);
        this.A03.add(pointF);
        this.A07.add(Long.valueOf(max - this.A04));
        C86244Rv r6 = this.A06;
        C63653Kz r9 = r6.A03;
        r9.set(pointF);
        while (((double) r6.A00) + 3.0d < ((double) max)) {
            r6.A00();
        }
        C63653Kz r5 = r6.A04;
        float A022 = AnonymousClass3K3.A02(r5, r9);
        float f2 = A022;
        C63653Kz r2 = new C63653Kz();
        while (f2 > 0.0f && A022 > 0.0f) {
            r2.set(r5);
            r6.A00();
            A022 = AnonymousClass3K3.A02(r5, r2);
            f2 -= A022;
        }
        C86174Rm r4 = r6.A01;
        long j3 = r4.A02;
        C63653Kz r1 = r4.A00;
        if (r1 != r4.A01) {
            r4.A00(r1, j3);
            r4.A01 = r4.A00;
        }
        Canvas canvas = this.A00;
        if (canvas != null) {
            A07(canvas, this.A01);
        }
    }

    public void A04(PointF pointF, long j2) {
        if (this.A03 <= j2) {
            this.A03.add(pointF);
            this.A07.add(Long.valueOf(j2 - this.A04));
            C86244Rv r5 = this.A06;
            r5.A03.set(pointF);
            while (((double) r5.A00) + 3.0d < ((double) j2)) {
                r5.A00();
            }
            Canvas canvas = this.A00;
            if (canvas != null) {
                A07(canvas, this.A01);
            }
        }
    }

    public void A05(JSONObject jSONObject) {
        super.A05(jSONObject);
        JSONArray jSONArray = new JSONArray();
        for (Object put : this.A07) {
            jSONArray.put(put);
        }
        jSONObject.put("times", jSONArray);
    }

    public final float A06(int i2) {
        float f2 = (this.A01 * 0.03f) - 0.125f;
        if (f2 < 0.125f) {
            f2 = 0.125f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (f2 * this.A02) / ((float) i2);
    }

    public final void A07(Canvas canvas, int i2) {
        float A002;
        if (canvas != null) {
            C88764b3 r4 = this.A05;
            float f2 = this.A00;
            r4.A03 = f2;
            int floor = ((int) Math.floor((double) (r4.A02 / f2))) + 1;
            while (true) {
                this.A01 = i2;
                if (i2 < floor) {
                    float[] fArr = this.A08;
                    float f3 = ((float) i2) * r4.A03;
                    if (f3 < r4.A01 || f3 > r4.A00) {
                        Map.Entry floorEntry = r4.A06.floorEntry(Float.valueOf(f3));
                        if (floorEntry == null) {
                            r4.A04 = null;
                            r4.A01 = 1.0f;
                            A002 = 0.0f;
                        } else {
                            r4.A04 = (C89004bR) floorEntry.getValue();
                            float A042 = AnonymousClass000.A04(floorEntry.getKey());
                            r4.A01 = A042;
                            A002 = A042 + r4.A04.A00();
                        }
                        r4.A00 = A002;
                    }
                    C89004bR r7 = r4.A04;
                    float f4 = 1.0f;
                    if (r7 != null) {
                        float A003 = r7.A00();
                        if (A003 != 0.0f) {
                            f4 = (f3 - r4.A01) / A003;
                        }
                    } else {
                        r7 = r4.A05;
                    }
                    r7.A01(fArr, f4);
                    PointF pointF = new PointF(fArr[2], fArr[3]);
                    float f5 = this.A01;
                    float f6 = pointF.x;
                    float f7 = pointF.y;
                    double sqrt = Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
                    float f8 = C816949j.A00;
                    float sqrt2 = (((float) Math.sqrt(sqrt)) - 0.0f) / ((0.4f * f5) - 0.0f);
                    if (sqrt2 < 0.0f) {
                        sqrt2 = 0.0f;
                    } else if (sqrt2 > 1.0f) {
                        sqrt2 = 1.0f;
                    }
                    int i3 = (int) (f5 * (1.0f - (f8 * ((sqrt2 * sqrt2) * (3.0f - (sqrt2 * 2.0f))))));
                    float f9 = fArr[0];
                    float f10 = fArr[1];
                    Paint paint = this.A02;
                    paint.setStrokeWidth((float) i3);
                    canvas.drawPoint(f9, f10, paint);
                    i2 = this.A01 + 1;
                } else {
                    return;
                }
            }
        }
    }
}
