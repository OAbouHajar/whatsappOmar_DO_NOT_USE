package X;

import java.util.concurrent.Callable;

/* renamed from: X.676  reason: invalid class name */
public class AnonymousClass676 implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass5zC A01;
    public final /* synthetic */ String A02;

    public AnonymousClass676(AnonymousClass5zC r1, String str, long j2) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = j2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0113, code lost:
        if (X.C110115dX.A1E(r1, 6) != false) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r15 = this;
            X.5zC r4 = r15.A01
            X.5up r2 = r4.A0K
            X.5wx r1 = r2.A06
            java.lang.String r0 = "Setting focus mode for video must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0019
            r0 = 1
            r2.A0A = r0
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x00f7
            r0 = 0
            r2.A04 = r0
        L_0x0019:
            X.5vU r3 = r4.A0R
            int r0 = r4.A00
            X.5wI r2 = r3.A02(r0)
            X.5qO r0 = X.AnonymousClass5wI.A0T
            java.lang.Object r0 = r2.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r4.A0A = r0
            X.5qO r1 = X.AnonymousClass5wI.A0A
            int r0 = X.AnonymousClass5wI.A02(r1, r2)
            r4.A02 = r0
            int r0 = r4.A00
            X.5wI r7 = r3.A02(r0)
            java.util.HashSet r0 = X.AnonymousClass5w3.A01
            X.AnonymousClass5x0.A02(r0)
            r5 = 1
            X.5wm r6 = r4.A0J
            int r0 = r4.A00
            int r0 = r6.A02(r0)
            android.media.CamcorderProfile r8 = android.media.CamcorderProfile.get(r0, r5)
            X.5qO r0 = X.AnonymousClass5wI.A0s
            java.lang.Object r5 = r7.A05(r0)
            X.5vQ r5 = (X.AnonymousClass5vQ) r5
            if (r5 != 0) goto L_0x005f
            X.5qO r0 = X.AnonymousClass5wI.A0m
            java.lang.Object r5 = r7.A05(r0)
            X.5vQ r5 = (X.AnonymousClass5vQ) r5
        L_0x005f:
            r0 = 2
            r8.videoCodec = r0
            int r0 = r5.A02
            r8.videoFrameWidth = r0
            int r0 = r5.A01
            r8.videoFrameHeight = r0
            X.5qO r0 = X.AnonymousClass5wI.A0q
            int r0 = X.AnonymousClass5wI.A02(r0, r7)
            r8.videoFrameRate = r0
            X.69f r0 = r4.A06
            X.5zK r0 = (X.AnonymousClass5zK) r0
            X.5ol r5 = r0.A03
            X.5ol r0 = X.C114885ol.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00df
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x0083:
            r8.videoBitRate = r0
        L_0x0085:
            int r5 = r4.A00
            int r0 = r4.A0X
            int r12 = r6.A03(r5, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            int r11 = r4.A00
            X.5qO r0 = X.AnonymousClass5wI.A0K
            java.lang.Object r0 = r2.A05(r0)
            boolean r14 = X.AnonymousClass000.A1X(r0)
            X.5zQ r7 = r4.A0Z
            boolean r0 = X.AnonymousClass5zQ.A0C
            if (r0 != 0) goto L_0x00a4
            r7 = 0
        L_0x00a4:
            r4.A08 = r7
            if (r7 != 0) goto L_0x0125
            X.5fV r6 = r3.A00(r11)
            X.5qO r0 = X.AnonymousClass5wI.A0Q
            java.lang.Object r0 = r2.A05(r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r3 = r0 ^ 1
            X.5fQ r2 = r6.A00
            X.5qN r0 = X.AnonymousClass5wJ.A0R
            boolean r0 = X.AnonymousClass5wJ.A02(r0, r2)
            if (r0 == 0) goto L_0x00cd
            r0 = 0
            if (r3 == 0) goto L_0x00c6
            r0 = 3
        L_0x00c6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C115845qP.A02(r1, r6, r0)
        L_0x00cd:
            X.5qO r0 = X.AnonymousClass5wI.A0r
            X.C115845qP.A02(r0, r6, r5)
            r6.A02()
            X.69J r0 = r4.A0I
            X.5zP r7 = new X.5zP
            r7.<init>(r0, r14)
            r4.A08 = r7
            goto L_0x0125
        L_0x00df:
            X.5ol r0 = X.C114885ol.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00eb
            r0 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x0083
        L_0x00eb:
            X.5ol r0 = X.C114885ol.A03
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0085
            r0 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x0083
        L_0x00f7:
            X.5vU r1 = r2.A05
            int r0 = r2.A00
            X.5fV r5 = r1.A00(r0)
            X.5fQ r1 = r5.A00
            X.5qN r0 = X.AnonymousClass5wJ.A0k
            java.util.List r1 = X.AnonymousClass5wJ.A01(r0, r1)
            r3 = 3
            boolean r0 = X.C110115dX.A1E(r1, r3)
            if (r0 != 0) goto L_0x0115
            r3 = 6
            boolean r0 = X.C110115dX.A1E(r1, r3)
            if (r0 == 0) goto L_0x0120
        L_0x0115:
            X.5vL r2 = r5.A00
            X.5qO r1 = X.AnonymousClass5wI.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01(r1, r0)
        L_0x0120:
            r5.A02()
            goto L_0x0019
        L_0x0125:
            java.lang.String r10 = r15.A02     // Catch:{ all -> 0x0144 }
            r13 = 1
            r9 = 0
            X.5wl r0 = r7.AgG(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0144 }
            r4.A07 = r0     // Catch:{ all -> 0x0144 }
            android.hardware.Camera r0 = r4.A0Y
            r0.lock()
            X.5wl r3 = r4.A07
            X.5qU r2 = X.C119235wl.A0I
            long r0 = r15.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A02(r2, r0)
            X.5wl r0 = r4.A07
            return r0
        L_0x0144:
            r1 = move-exception
            android.hardware.Camera r0 = r4.A0Y
            r0.lock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass676.call():java.lang.Object");
    }
}
