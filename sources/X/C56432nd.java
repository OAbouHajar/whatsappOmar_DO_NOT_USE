package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2nd  reason: invalid class name and case insensitive filesystem */
public class C56432nd extends Handler {
    public final /* synthetic */ AnonymousClass2DG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56432nd(Looper looper, AnonymousClass2DG r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r21) {
        /*
            r20 = this;
            r0 = r21
            int r1 = r0.what
            r10 = 1
            r0 = r20
            X.2DG r0 = r0.A00
            X.2iH r0 = r0.A03
            if (r1 != r10) goto L_0x002d
            X.1aI r1 = r0.A00
            X.2Qt r0 = r1.A0C
            boolean r0 = r0.AIv()
            if (r0 == 0) goto L_0x002c
            X.2Qt r0 = r1.A0C
            boolean r0 = r0.AJZ()
            if (r0 != 0) goto L_0x002c
            X.0pN r0 = r1.A0A
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.AIm()
            if (r0 != 0) goto L_0x002c
            r1.A0D()
        L_0x002c:
            return
        L_0x002d:
            X.1aI r9 = r0.A00
            X.2Qt r0 = r9.A0C
            boolean r0 = r0.AJZ()
            X.2DG r8 = r9.A0J
            if (r0 == 0) goto L_0x00ba
            java.io.File r4 = r9.A0N
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r2 = r2 - r0
            com.obwhatsapp.camera.recording.RecordingView r7 = r8.A04
            java.lang.String r1 = r8.A00(r2)
            android.widget.TextView r0 = r7.A00
            r0.setText(r1)
            r6 = 0
            if (r4 == 0) goto L_0x0082
            long r4 = r4.length()
            java.util.List r0 = r8.A07
            boolean r19 = X.C16030sJ.A0S(r0)
            X.0s5 r14 = r8.A02
            X.0tC r0 = X.C15910s6.A1y
            int r0 = r14.A02(r0)
            long r17 = X.C13690nt.A08(r0)
            X.0tC r13 = X.C15910s6.A1f
            int r0 = r14.A02(r13)
            long r0 = (long) r0
            r15 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r15
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x007b
            if (r19 == 0) goto L_0x009f
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x009f
        L_0x007b:
            X.2iH r0 = r8.A03
            X.1aI r0 = r0.A00
            r0.A0V(r10)
        L_0x0082:
            r1 = 0
        L_0x0083:
            r8.A01(r10, r10, r6)
            android.os.Handler r0 = r8.A01
            r2 = 50
            r0.sendEmptyMessageDelayed(r6, r2)
            boolean r0 = r9.A0w
            if (r0 == 0) goto L_0x002c
            X.2V5 r2 = r9.A0F
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x002c
            com.obwhatsapp.CircularProgressBar r0 = r2.A06
            if (r0 == 0) goto L_0x002c
            r0.setProgress(r1)
            return
        L_0x009f:
            r11 = 100
            long r4 = r4 * r11
            int r0 = r14.A02(r13)
            long r0 = (long) r0
            long r0 = r0 * r15
            long r4 = r4 / r0
            int r1 = (int) r4
            if (r19 == 0) goto L_0x00b4
            long r2 = r2 * r11
            long r2 = r2 / r17
            int r0 = (int) r2
            int r1 = java.lang.Math.max(r1, r0)
        L_0x00b4:
            com.obwhatsapp.CircularProgressBar r0 = r7.A01
            r0.setProgress(r1)
            goto L_0x0083
        L_0x00ba:
            boolean r1 = r9.A0X()
            r0 = 0
            r8.A01(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56432nd.handleMessage(android.os.Message):void");
    }
}
