package com.facebook.msys.mci.common;

import X.C48862Pr;
import com.facebook.msys.mci.NetworkSession;

public class RunnableNRunnableShape0S1203000_I0 extends C48862Pr {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RunnableNRunnableShape0S1203000_I0(com.facebook.msys.mci.NetworkSession r2, X.AnonymousClass1z9 r3, java.lang.String r4, int r5, int r6, int r7, int r8) {
        /*
            r1 = this;
            r1.A06 = r8
            if (r8 == 0) goto L_0x0017
            java.lang.String r0 = "updateDataTaskUploadProgress"
            r1.A03 = r3
            r1.A04 = r2
            r1.A05 = r4
            r1.A00 = r5
            r1.A01 = r6
            r1.A02 = r7
        L_0x0013:
            r1.<init>(r0)
            return
        L_0x0017:
            java.lang.String r0 = "updateDataTaskDownloadProgress"
            r1.A03 = r3
            r1.A04 = r2
            r1.A05 = r4
            r1.A02 = r5
            r1.A01 = r6
            r1.A00 = r7
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.common.RunnableNRunnableShape0S1203000_I0.<init>(com.facebook.msys.mci.NetworkSession, X.1z9, java.lang.String, int, int, int, int):void");
    }

    public void run() {
        int i2 = this.A06;
        NetworkSession networkSession = (NetworkSession) this.A04;
        String str = this.A05;
        if (i2 != 0) {
            networkSession.updateDataTaskUploadProgress(str, (long) this.A00, (long) this.A01, (long) this.A02);
        } else {
            networkSession.updateDataTaskDownloadProgress(str, (long) this.A02, (long) this.A01, (long) this.A00);
        }
    }
}
