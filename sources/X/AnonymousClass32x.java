package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.json.JSONObject;

/* renamed from: X.32x  reason: invalid class name */
public class AnonymousClass32x extends C455829l {
    public int A00;
    public Bitmap A01;
    public PointF A02;
    public C61773Ag A03;
    public C88254aC A04;
    public boolean A05;
    public final float A06;

    public AnonymousClass32x(float f2) {
        this.A00 = 1;
        this.A05 = false;
        C13690nt.A0y(this.A01);
        this.A06 = f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r6 != null) goto L_0x003b;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass32x(org.json.JSONObject r19, float r20) {
        /*
            r18 = this;
            r0 = r18
            r14 = r20
            r0.<init>(r14)
            r2 = r19
            super.A0A(r2)
            r1 = 1
            r0.A05 = r1
            r4 = 0
            java.lang.String r9 = "brush_blur"
            boolean r8 = r2.optBoolean(r9, r4)     // Catch:{ JSONException -> 0x00f5 }
            java.lang.String r1 = "points"
            org.json.JSONArray r7 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x00f5 }
            r6 = 0
            if (r8 != 0) goto L_0x0026
            java.lang.String r1 = "times"
            org.json.JSONArray r6 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x00f5 }
        L_0x0026:
            java.lang.String r3 = "width"
            int r1 = r2.getInt(r3)     // Catch:{ JSONException -> 0x00f5 }
            float r5 = (float) r1     // Catch:{ JSONException -> 0x00f5 }
            r1 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r1
            r1 = 0
            if (r8 == 0) goto L_0x0037
            if (r7 == 0) goto L_0x00f5
            goto L_0x003b
        L_0x0037:
            if (r7 == 0) goto L_0x00f5
            if (r6 == 0) goto L_0x00f5
        L_0x003b:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f5
            boolean r1 = r2.optBoolean(r9, r4)
            if (r1 == 0) goto L_0x007d
            android.graphics.Bitmap r7 = r0.A01
            android.graphics.PointF r10 = r0.A02
            int r13 = r0.A00
            android.graphics.Paint r8 = r0.A01
            int r1 = r2.getInt(r3)
            float r12 = (float) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 / r1
            java.util.List r5 = X.C61773Ag.A00(r2)
            java.lang.Object r9 = r5.get(r4)
            android.graphics.PointF r9 = (android.graphics.PointF) r9
            r11 = 0
            X.333 r6 = new X.333
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4 = 1
        L_0x0066:
            int r1 = r5.size()
            if (r4 >= r1) goto L_0x007a
            java.lang.Object r3 = r5.get(r4)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            r1 = 0
            r6.A04(r3, r1)
            int r4 = r4 + 1
            goto L_0x0066
        L_0x007a:
            r0.A03 = r6
            return
        L_0x007d:
            android.graphics.Bitmap r9 = r0.A01
            android.graphics.PointF r12 = r0.A02
            int r15 = r0.A00
            android.graphics.Paint r10 = r0.A01
            int r1 = r2.getInt(r3)
            float r13 = (float) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 / r1
            java.util.List r3 = X.C61773Ag.A00(r2)
            java.lang.String r1 = "times"
            org.json.JSONArray r6 = r2.getJSONArray(r1)
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            r5 = 0
        L_0x009d:
            int r1 = r6.length()
            if (r5 >= r1) goto L_0x00ad
            long r1 = r6.getLong(r5)
            X.C13700nu.A0d(r4, r1)
            int r5 = r5 + 1
            goto L_0x009d
        L_0x00ad:
            r1 = 0
            java.lang.Object r11 = r3.get(r1)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            java.lang.Object r1 = r4.get(r1)
            long r16 = X.C13700nu.A01(r1)
            X.3uu r8 = new X.3uu
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 1
            r6 = 1
        L_0x00c3:
            int r1 = r3.size()
            if (r6 >= r1) goto L_0x00dd
            java.lang.Object r5 = r3.get(r6)
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            java.lang.Object r1 = r4.get(r6)
            long r1 = X.C13700nu.A01(r1)
            r8.A04(r5, r1)
            int r6 = r6 + 1
            goto L_0x00c3
        L_0x00dd:
            int r1 = X.C13700nu.A00(r3, r7)
            java.lang.Object r3 = r3.get(r1)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            java.lang.Object r1 = r4.get(r1)
            long r1 = X.C13700nu.A01(r1)
            r8.A03(r3, r1)
            r0.A03 = r8
            return
        L_0x00f5:
            java.lang.String r0 = "Json is not valid for PenBrushModel"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32x.<init>(org.json.JSONObject, float):void");
    }

    public void A0N(JSONObject jSONObject) {
        super.A0N(jSONObject);
        this.A03.A05(jSONObject);
    }

    public void A0R(C88254aC r3) {
        this.A04 = r3;
        C61773Ag r1 = this.A03;
        if (r1 != null && (r1 instanceof AnonymousClass333)) {
            ((AnonymousClass333) r1).A00 = r3;
        }
    }
}
