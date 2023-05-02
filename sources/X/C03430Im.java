package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.EnumSet;

/* renamed from: X.0Im  reason: invalid class name and case insensitive filesystem */
public class C03430Im extends AnonymousClass0IZ {
    public static Bitmap A03;
    public static PorterDuffColorFilter A04;
    public static AnonymousClass0S2 A05;
    public static final ArrayList A06 = new ArrayList(5);
    public EnumSet A00;
    public final Paint A01;
    public final C03310Ia A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C03430Im(X.AnonymousClass074 r19, X.C03310Ia r20) {
        /*
            r18 = this;
            X.0Nl r1 = new X.0Nl
            r1.<init>()
            r4 = r20
            r1.A00 = r4
            r3 = 0
            X.0S2 r0 = A05
            if (r0 != 0) goto L_0x0015
            X.0S2 r0 = new X.0S2
            r0.<init>()
            A05 = r0
        L_0x0015:
            r2 = r18
            r5 = r19
            r2.<init>(r5, r0, r1)
            r1 = 3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r2.A01 = r0
            r2.A03 = r3
            r2.A02 = r4
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "dark"
        L_0x002e:
            r4.A01 = r0
            X.074 r1 = r2.A09
            X.09W r0 = r1.A0R
            java.util.EnumSet r0 = r0.A0k
            r2.A00 = r0
            X.0Ib r0 = new X.0Ib
            r0.<init>(r2)
            r2.A08 = r0
            android.graphics.Bitmap r0 = A03
            if (r0 != 0) goto L_0x00a9
            int r3 = r1.A0O
            android.content.Context r0 = r1.A0P
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r0)
            int r1 = r0.densityDpi
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
            A03 = r0
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r0)
            r0 = 320(0x140, float:4.48E-43)
            r2 = 16
            if (r1 < r0) goto L_0x0062
            r2 = 32
        L_0x0062:
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r0 = -7235677(0xffffffffff9197a3, float:NaN)
            r9.setColor(r0)
            r6 = 0
            r5 = 0
        L_0x006f:
            float r8 = (float) r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00a9
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r0 = 18
            if (r1 != 0) goto L_0x0080
        L_0x007e:
            r0 = 44
        L_0x0080:
            r9.setAlpha(r0)
            r7 = r5
            r4.drawLine(r5, r6, r7, r8, r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r5 - r0
            r12 = 0
            r10 = r4
            r13 = r11
            r14 = r8
            r15 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r13 = 0
            r16 = r5
            r12 = r4
            r14 = r5
            r15 = r8
            r17 = r9
            r12.drawLine(r13, r14, r15, r16, r17)
            r16 = r11
            r14 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
            float r0 = (float) r2
            float r5 = r5 + r0
            goto L_0x006f
        L_0x00a7:
            r0 = 0
            goto L_0x002e
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03430Im.<init>(X.074, X.0Ia):void");
    }

    public static void A00(int[] iArr) {
        ArrayList arrayList = A06;
        int size = arrayList.size();
        if (size == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        double max = Math.max(1.6d - (((double) size) * 0.1d), 1.1d);
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((AnonymousClass0IX) arrayList.get(i3)).A00;
        }
        int i4 = ((int) (((double) i2) * max)) + 1;
        iArr[0] = i4;
        iArr[1] = Math.max((i4 - i2) - 1, 1);
    }

    public void A0D(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.A0D(canvas);
        AnonymousClass0V3.A01(AnonymousClass0V3.A0F, nanoTime);
    }

    public AnonymousClass0WN A0E(int i2, int i3, int i4) {
        AnonymousClass0WN A0E = super.A0E(i2, i3, i4);
        if (A0E != null) {
            A0E.A02 = i2;
            A0E.A03 = i3;
            A0E.A04 = i4;
        }
        return A0E;
    }

    public void A0F() {
        this.A00 = 0;
        ArrayList arrayList = A06;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            AnonymousClass0S2 r1 = this.A0A;
            if (r1.A03 != -1) {
                r1.A03 = -1;
            }
        }
        int[] iArr = this.A0B;
        A00(iArr);
        AnonymousClass0S2 r12 = this.A0A;
        r12.A01 = iArr[0];
        r12.A02 = iArr[1];
        r12.A01();
    }
}
