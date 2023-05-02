package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass027;
import X.AnonymousClass2Qx;
import X.AnonymousClass34y;
import X.AnonymousClass3AH;
import X.C1035651w;
import X.C13680ns;
import X.C26811Ph;
import X.C56482nj;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.TimeUnit;

public class RunnableRunnableShape0S0102000_I1 implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape0S0102000_I1(Object obj, int i2, int i3, int i4) {
        this.A03 = i4;
        this.A02 = obj;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void run() {
        switch (this.A03) {
            case 0:
                AnonymousClass2Qx r4 = (AnonymousClass2Qx) this.A02;
                int i2 = this.A00;
                int i3 = this.A01;
                C26811Ph r0 = r4.A09;
                AnonymousClass00B.A01();
                UserJid userJid = r4.A0B;
                if (r0.A03.A0I(userJid)) {
                    Voip.setVideoPreviewSize(i2, i3);
                    return;
                } else {
                    Voip.setVideoDisplayPort(userJid, r4);
                    return;
                }
            case 1:
                int i4 = this.A00;
                int i5 = this.A01;
                AnonymousClass34y r3 = (AnonymousClass34y) ((C56482nj) this.A02).A0D.get();
                if (r3 != null) {
                    int max = Math.max(0, i4 - i5);
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds((long) max);
                    if (!r3.A04) {
                        r3.A0A.A01.setDuration(seconds);
                    }
                    if (max <= 50 && !r3.A06 && !r3.A07) {
                        r3.A05.A00();
                        r3.A06 = true;
                    }
                    r3.A00 = (((float) i5) / ((float) i4)) * 100.0f;
                    C1035651w r32 = r3.A0C;
                    C13680ns.A1O(r32.A04, i4);
                    int i6 = (i5 / 150) - 2;
                    AnonymousClass027 r02 = r32.A06;
                    if (i6 < -1) {
                        i6 = -4;
                    }
                    C13680ns.A1O(r02, i6);
                    return;
                }
                return;
            default:
                AnonymousClass3AH.A00((AnonymousClass3AH) this.A02, this.A00, this.A01);
                return;
        }
    }
}
