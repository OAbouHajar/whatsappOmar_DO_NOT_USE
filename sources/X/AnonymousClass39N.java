package X;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.Map;

/* renamed from: X.39N  reason: invalid class name */
public class AnonymousClass39N {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public RectF A02 = AnonymousClass000.A0K();
    public Vibrator A03;
    public C455829l A04;
    public Map A05 = AnonymousClass000.A0x();
    public boolean A06 = false;
    public boolean A07 = false;
    public final float A08;
    public final Handler A09;
    public final ViewGroup A0A;

    public AnonymousClass39N(Handler handler, ViewGroup viewGroup, AnonymousClass01V r5) {
        this.A0A = viewGroup;
        this.A09 = handler;
        this.A08 = (float) viewGroup.getResources().getDimensionPixelSize(R.dimen.dimen051a);
        this.A03 = r5.A0K();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r1 == 2) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A00(android.graphics.PointF r11, X.C455829l r12, float r13) {
        /*
            r10 = this;
            X.29l r0 = r10.A04
            if (r0 == r12) goto L_0x0009
            r10.A04 = r12
            r10.A01()
        L_0x0009:
            java.util.Map r4 = r10.A05
            java.lang.Integer r0 = X.C13680ns.A0a()
            java.lang.Object r3 = r4.get(r0)
            X.32o r3 = (X.C604932o) r3
            float r5 = r12.A00
            boolean r2 = r3.A03
            r1 = -1
            if (r2 == 0) goto L_0x005c
            float r6 = r3.A00
            float r6 = r6 + r13
            int r0 = X.C604932o.A00(r6)
            if (r0 == r1) goto L_0x0052
            r3.A00 = r6
            r13 = 0
        L_0x0028:
            float r5 = r5 + r13
            int r1 = X.C604932o.A00(r5)
            r0 = -1
            if (r1 == r0) goto L_0x0032
            r3.A01 = r1
        L_0x0032:
            r3.A02 = r11
            if (r2 == 0) goto L_0x00cc
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x004a
            r0 = 2
            if (r1 != r0) goto L_0x004a
        L_0x003d:
            java.lang.Object r0 = X.AnonymousClass000.A0Y(r4, r0)
            X.39j r0 = (X.C615539j) r0
            r0.A03()
        L_0x0046:
            r3.A04()
            return r13
        L_0x004a:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0046
            if (r1 != 0) goto L_0x0046
            r0 = 1
            goto L_0x003d
        L_0x0052:
            float r6 = r6 - r5
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A03 = r0
            r2 = 0
            r13 = r6
            goto L_0x0028
        L_0x005c:
            r7 = r13
            float r6 = java.lang.Math.abs(r13)
            r9 = 0
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            r7 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ca
            float r7 = r7 + r13
        L_0x006f:
            r8 = 1110704128(0x42340000, float:45.0)
            float r6 = r5 % r8
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            float r6 = r6 + r7
            if (r0 <= 0) goto L_0x00bf
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
        L_0x0084:
            float r7 = r5 + r13
            int r0 = X.C604932o.A00(r7)
            if (r0 == r1) goto L_0x0028
            r0 = 1
            r3.A03 = r0
            r2 = 1
            r3.A00 = r7
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 0
            if (r0 >= 0) goto L_0x0098
            r6 = 1
        L_0x0098:
            float r0 = r7 % r8
            float r1 = java.lang.Math.abs(r0)
            r0 = 1108869120(0x42180000, float:38.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b0
            float r1 = r8 - r1
            r6 = r6 ^ 1
        L_0x00a8:
            if (r6 != 0) goto L_0x00ab
            float r1 = -r1
        L_0x00ab:
            float r7 = r7 + r1
            float r13 = r7 - r5
            goto L_0x0028
        L_0x00b0:
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            java.lang.String r0 = java.lang.Float.toString(r7)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x00bf:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0084
            r0 = -1036779520(0xffffffffc2340000, float:-45.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0028
            goto L_0x0084
        L_0x00ca:
            float r7 = r7 - r13
            goto L_0x006f
        L_0x00cc:
            r3.A03()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39N.A00(android.graphics.PointF, X.29l, float):float");
    }

    public final void A01() {
        C604932o r2 = (C604932o) this.A05.get(C13680ns.A0a());
        if (r2 != null) {
            r2.A00 = 0.0f;
            r2.A03 = false;
        }
        this.A06 = false;
        this.A07 = false;
        this.A01 = 0.0f;
        this.A00 = 0.0f;
    }
}
