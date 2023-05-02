package X;

import java.util.concurrent.Callable;

/* renamed from: X.673  reason: invalid class name */
public class AnonymousClass673 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5zD A01;

    public AnonymousClass673(AnonymousClass5zD r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        if (r2 >= r1) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r16 = this;
            r2 = r16
            X.5zD r5 = r2.A01
            boolean r0 = r5.isConnected()
            if (r0 == 0) goto L_0x0111
            X.5xW r4 = r5.A0Y
            X.5vP r1 = r4.A0H
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0111
            X.5wv r8 = r5.A09
            if (r8 == 0) goto L_0x0111
            int r1 = r2.A00
            X.5fT r0 = r8.A05
            if (r0 == 0) goto L_0x0035
            X.5fU r0 = r8.A06
            if (r0 == 0) goto L_0x0035
            X.5wJ r0 = r8.A07
            if (r0 == 0) goto L_0x0035
            java.util.List r0 = r8.A09
            if (r0 == 0) goto L_0x0035
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0040
            java.util.List r0 = r8.A08
            if (r0 != 0) goto L_0x0040
        L_0x0035:
            X.5wv r0 = r5.A09
            int r0 = r0.A02()
        L_0x003b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0040:
            android.graphics.Rect r0 = r8.A03
            if (r0 == 0) goto L_0x0035
            android.graphics.Rect r0 = r8.A04
            if (r0 == 0) goto L_0x0035
            int r0 = r8.A02
            int r1 = java.lang.Math.max(r1, r0)
            int r0 = r8.A01
            int r7 = java.lang.Math.min(r1, r0)
            int r0 = r8.A02()
            if (r7 == r0) goto L_0x0035
            float r6 = (float) r7
            int r0 = r8.A02
            float r3 = (float) r0
            int r0 = r8.A01
            float r2 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = X.C119335wv.A00(r6, r3, r2, r1, r0)
            X.5fT r1 = r8.A05
            if (r1 != 0) goto L_0x0105
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x006f:
            float r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00f9
            r15 = 1
        L_0x007a:
            int r0 = r8.A02
            float r3 = (float) r0
            int r0 = r8.A01
            float r2 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = X.C119335wv.A00(r6, r3, r2, r1, r0)
            X.5fU r2 = r8.A06
            X.5qO r1 = X.AnonymousClass5wI.A0v
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.C111195fU.A00(r2, r1, r0)
            X.5fU r2 = r8.A06
            X.5qO r1 = X.AnonymousClass5wI.A0p
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            X.C111195fU.A00(r2, r1, r0)
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x00d2
            java.util.List r0 = r8.A09
            java.lang.Object r0 = r0.get(r7)
            float r2 = X.AnonymousClass000.A04(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            android.graphics.Rect r0 = r8.A04
            android.graphics.Rect r9 = r8.A03
            int r12 = r0.width()
            int r11 = r0.height()
            double r0 = (double) r12
            double r2 = (double) r2
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 * r13
            double r0 = r0 / r2
            int r10 = (int) r0
            double r0 = (double) r11
            double r0 = r0 / r2
            int r6 = (int) r0
            int r3 = r12 >> 1
            int r2 = r3 - r10
            int r3 = r3 + r10
            int r1 = r11 >> 1
            int r0 = r1 - r6
            int r1 = r1 + r6
            r9.set(r2, r0, r3, r1)
        L_0x00d2:
            android.os.Handler r2 = r8.A0D
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0 = 1
            android.os.Message r0 = r2.obtainMessage(r0, r7, r0, r1)
            r2.sendMessage(r0)
            X.5wv r0 = r5.A09
            float r3 = r0.A01()
            X.5wv r0 = r5.A09
            android.graphics.Rect r2 = r0.A03
            android.hardware.camera2.params.MeteringRectangle[] r1 = r0.A06()
            X.5wv r0 = r5.A09
            android.hardware.camera2.params.MeteringRectangle[] r0 = r0.A05()
            r4.A08(r2, r1, r0, r3)
            goto L_0x0035
        L_0x00f9:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0102
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r15 = 2
            if (r0 < 0) goto L_0x007a
        L_0x0102:
            r15 = 0
            goto L_0x007a
        L_0x0105:
            X.5qO r0 = X.AnonymousClass5wI.A0p
            java.lang.Object r0 = r1.A05(r0)
            float r2 = X.AnonymousClass000.A04(r0)
            goto L_0x006f
        L_0x0111:
            r0 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass673.call():java.lang.Object");
    }
}
