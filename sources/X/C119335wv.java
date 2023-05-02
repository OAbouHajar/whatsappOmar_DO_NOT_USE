package X;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxCallbackShape189S0100000_3_I1;
import java.util.List;

/* renamed from: X.5wv  reason: invalid class name and case insensitive filesystem */
public class C119335wv {
    public float A00;
    public int A01;
    public int A02;
    public Rect A03;
    public Rect A04;
    public C111185fT A05;
    public C111195fU A06;
    public AnonymousClass5wJ A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public MeteringRectangle[] A0B;
    public MeteringRectangle[] A0C;
    public final Handler A0D = new Handler(Looper.getMainLooper(), new IDxCallbackShape189S0100000_3_I1(this, 1));
    public final C118855vM A0E = new C118855vM();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r12 < r11) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r12 == r11) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A00(float r8, float r9, float r10, float r11, float r12) {
        /*
            r7 = 0
            r6 = 1
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x000b
            int r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            int r0 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            int r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            int r0 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            return r12
        L_0x0027:
            float r8 = r8 - r9
            float r10 = r10 - r9
            float r8 = r8 / r10
            float r12 = r12 - r11
            float r8 = r8 * r12
            float r8 = r8 + r11
            return r8
        L_0x002e:
            return r11
        L_0x002f:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0088
            java.lang.String r0 = "invalid range bounds"
        L_0x0039:
            r5.append(r0)
            if (r3 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            java.lang.String r0 = " & "
        L_0x0042:
            r5.append(r0)
            if (r2 == 0) goto L_0x0049
            java.lang.String r1 = "zero source range"
        L_0x0049:
            r5.append(r1)
            java.lang.String r3 = "Camera2Device"
            java.util.Locale r4 = java.util.Locale.US
            r0 = 6
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r2[r7] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r2[r6] = r0
            r1 = 2
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r2[r1] = r0
            r1 = 3
            java.lang.Float r0 = java.lang.Float.valueOf(r11)
            r2[r1] = r0
            r1 = 4
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            r2[r1] = r0
            r1 = 5
            java.lang.String r0 = r5.toString()
            r2[r1] = r0
            java.lang.String r0 = "Projecting zoom value %.3f from [%.2f, %.2f] to [%.2f, %.2f] failed - %s"
            java.lang.String r0 = java.lang.String.format(r4, r0, r2)
            X.AnonymousClass5xH.A01(r3, r0)
            r8 = 0
            return r8
        L_0x0086:
            r0 = r1
            goto L_0x0042
        L_0x0088:
            r0 = r1
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119335wv.A00(float, float, float, float, float):float");
    }

    public float A01() {
        float f2;
        List list;
        float A042;
        Object obj;
        C111185fT r1 = this.A05;
        float A043 = r1 == null ? -1.0f : AnonymousClass000.A04(r1.A05(AnonymousClass5wI.A0p));
        if (this.A09 == null || (list = this.A08) == null) {
            f2 = 0.0f;
        } else {
            float A002 = A00(A043, -1.0f, 1.0f, (float) (-(list.size() - 1)), (float) (this.A09.size() - 1));
            double d2 = (double) A002;
            int floor = (int) Math.floor(d2);
            int ceil = (int) Math.ceil(d2);
            if (A002 >= 0.0f) {
                A042 = AnonymousClass000.A04(this.A09.get(floor)) / 100.0f;
                obj = this.A09.get(ceil);
            } else {
                A042 = AnonymousClass000.A04(this.A08.get(-floor)) / 100.0f;
                obj = this.A08.get(-ceil);
            }
            f2 = A00(A002, (float) floor, (float) ceil, A042, AnonymousClass000.A04(obj) / 100.0f);
        }
        return f2 * 100.0f;
    }

    public int A02() {
        C111185fT r1 = this.A05;
        if (r1 == null) {
            return 0;
        }
        return AnonymousClass5wI.A02(AnonymousClass5wI.A0v, r1);
    }

    public void A03() {
        this.A0D.removeMessages(1);
        this.A07 = null;
        this.A05 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A09 = null;
        this.A0C = null;
        this.A0B = null;
    }

    public void A04(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2) {
        this.A0C = meteringRectangleArr;
        this.A0B = meteringRectangleArr2;
    }

    public MeteringRectangle[] A05() {
        return A07(this.A0B);
    }

    public MeteringRectangle[] A06() {
        return A07(this.A0C);
    }

    public final MeteringRectangle[] A07(MeteringRectangle[] meteringRectangleArr) {
        if (this.A07 == null || !this.A0A) {
            C111185fT r1 = this.A05;
            if (r1 == null || this.A03 == null) {
                throw AnonymousClass000.A0V("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
            } else if (AnonymousClass5wI.A02(AnonymousClass5wI.A0v, r1) != 0) {
                return new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, this.A03.width(), this.A03.height()), 0)};
            }
        }
        return meteringRectangleArr;
    }
}
