package X;

import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1kV  reason: invalid class name and case insensitive filesystem */
public class C34581kV implements C34571kU {
    public final C34571kU A00;
    public final /* synthetic */ C211212w A01;

    public C34581kV(C211212w r1, C34571kU r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void APU(UserJid userJid) {
        C34571kU r0 = this.A00;
        if (r0 != null) {
            r0.APU(userJid);
        }
    }

    public void AQV(UserJid userJid, int i2) {
        C34571kU r0 = this.A00;
        if (r0 != null) {
            r0.AQV(userJid, i2);
        }
        this.A01.A02.postDelayed(new RunnableRunnableShape2S0100000_I0_1(this, 10), 25);
    }

    public void AU1(UserJid userJid) {
        C34571kU r0 = this.A00;
        if (r0 != null) {
            r0.AU1(userJid);
        }
        C211212w r1 = this.A01;
        if (r1.A09.A01(userJid)) {
            r1.A02.postDelayed(new RunnableRunnableShape2S0100000_I0_1(this, 11), 50);
        }
    }

    public void AXe(UserJid userJid, String str, long j2) {
        C34571kU r0 = this.A00;
        if (r0 != null) {
            r0.AXe(userJid, str, j2);
        }
        this.A01.A02.post(new RunnableRunnableShape0S1100000_I0(2, str, this));
    }
}
