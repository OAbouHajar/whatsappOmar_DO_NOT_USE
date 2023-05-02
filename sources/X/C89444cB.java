package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* renamed from: X.4cB  reason: invalid class name and case insensitive filesystem */
public final class C89444cB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public Surface A0B;
    public boolean A0C;
    public final WindowManager A0D;
    public final C86114Rg A0E = new C86114Rg();
    public final C91734gP A0F;
    public final C92004gq A0G;

    public C89444cB(Context context) {
        C91734gP r3 = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
            this.A0D = windowManager;
            if (windowManager != null) {
                this.A0F = AnonymousClass3C1.A01 >= 17 ? A01(applicationContext) : r3;
                this.A0G = C92004gq.A05;
            }
        }
        this.A09 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
    }

    public static void A00(Surface surface, float f2) {
        int i2 = 1;
        if (f2 == 0.0f) {
            i2 = 0;
        }
        try {
            surface.setFrameRate(f2, i2);
        } catch (IllegalStateException e2) {
            C89504cL.A01("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }

    public final C91734gP A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C91734gP(displayManager, this);
    }

    public void A02() {
        if (this.A0D != null) {
            C91734gP r0 = this.A0F;
            if (r0 != null) {
                r0.A01();
            }
            this.A0G.A02.sendEmptyMessage(2);
        }
    }

    public void A03() {
        if (this.A0D != null) {
            this.A0G.A02.sendEmptyMessage(1);
            C91734gP r0 = this.A0F;
            if (r0 != null) {
                r0.A00();
            }
            A04();
        }
    }

    public final void A04() {
        long j2;
        Display defaultDisplay = this.A0D.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.A09 = refreshRate;
            j2 = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j2 = -9223372036854775807L;
            this.A09 = -9223372036854775807L;
        }
        this.A0A = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r9.A06 < 5000000000L) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r9.A00 != 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r12 = this;
            int r0 = X.AnonymousClass3C1.A01
            r7 = 30
            if (r0 < r7) goto L_0x0061
            android.view.Surface r0 = r12.A0B
            if (r0 == 0) goto L_0x0061
            X.4Rg r8 = r12.A0E
            X.4V5 r9 = r8.A03
            long r1 = r9.A03
            r3 = 15
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
            int r0 = r9.A00
            r11 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r11 = 0
        L_0x001c:
            if (r11 == 0) goto L_0x006b
            r4 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            long r2 = r9.A05
            r0 = 0
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x002e
            long r0 = r9.A06
            long r0 = r0 / r2
        L_0x002e:
            double r2 = (double) r0
            double r4 = r4 / r2
            float r6 = (float) r4
        L_0x0031:
            float r10 = r12.A02
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            if (r11 == 0) goto L_0x0052
            long r3 = r9.A06
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            if (r0 >= 0) goto L_0x0054
        L_0x0052:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0054:
            float r0 = X.AnonymousClass3K4.A01(r6, r10)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0061
        L_0x005c:
            r12.A02 = r6
            r12.A06(r5)
        L_0x0061:
            return
        L_0x0062:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            int r0 = r8.A00
            if (r0 < r7) goto L_0x0061
            goto L_0x005c
        L_0x006b:
            float r6 = r12.A00
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89444cB.A05():void");
    }

    public final void A06(boolean z2) {
        Surface surface;
        if (AnonymousClass3C1.A01 >= 30 && (surface = this.A0B) != null) {
            float f2 = 0.0f;
            if (this.A0C) {
                float f3 = this.A02;
                if (f3 != -1.0f) {
                    f2 = this.A01 * f3;
                }
            }
            if (z2 || this.A03 != f2) {
                this.A03 = f2;
                A00(surface, f2);
            }
        }
    }
}
