package X;

import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2Te  reason: invalid class name and case insensitive filesystem */
public class C49442Te implements C34571kU {
    public final C14870pt A00;
    public final C18930xU A01;
    public final C16000sG A02;
    public final C17140ub A03;
    public final C16320sq A04;

    public C49442Te(C14870pt r1, C18930xU r2, C16000sG r3, C17140ub r4, C16320sq r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void APU(UserJid userJid) {
        StringBuilder sb = new StringBuilder("getstatus/delete jid=");
        sb.append(userJid);
        Log.i(sb.toString());
        C16010sH A08 = this.A02.A08(userJid);
        if (A08 != null) {
            A08.A0T = null;
            A08.A0B = 0;
            this.A04.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 40, A08));
        }
    }

    public void AQV(UserJid userJid, int i2) {
        StringBuilder sb = new StringBuilder("getstatus/failed jid=");
        sb.append(userJid);
        sb.append(" code=");
        sb.append(i2);
        Log.w(sb.toString());
    }

    public void AU1(UserJid userJid) {
        StringBuilder sb = new StringBuilder("getstatus/nochange jid=");
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public void AXe(UserJid userJid, String str, long j2) {
        C16010sH A08 = this.A02.A08(userJid);
        if (A08 != null) {
            A08.A0T = str;
            A08.A0B = j2;
            StringBuilder sb = new StringBuilder("getstatus/received  jid=");
            sb.append(userJid);
            sb.append(" status=");
            sb.append(A08.A0T);
            sb.append(" timestamp=");
            sb.append(A08.A0B);
            Log.i(sb.toString());
            this.A04.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 40, A08));
        }
    }
}
