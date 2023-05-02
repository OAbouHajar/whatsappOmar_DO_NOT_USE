package X;

import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.2Nv  reason: invalid class name and case insensitive filesystem */
public class C48552Nv implements AnonymousClass1YD {
    public final /* synthetic */ C48562Nw A00;

    public C48552Nv(C48562Nw r1) {
        this.A00 = r1;
    }

    public void AOL() {
        C48562Nw r1 = this.A00;
        if (r1.A02 != null) {
            Log.e("ContactUsActivity/createTicketIq/onDeliveryFailure, falling back to email support.");
            r1.A02.Ac1();
            r1.A01();
        }
    }

    public void AOM(int i2) {
        C48562Nw r2 = this.A00;
        if (r2.A02 != null) {
            StringBuilder sb = new StringBuilder("ContactUsActivity/createTicketIq/onError/errorCode=");
            sb.append(i2);
            sb.append(" falling back to email support.");
            Log.e(sb.toString());
            r2.A02.Ac1();
            r2.A01();
        }
    }

    public void AON(GroupJid groupJid) {
        C48562Nw r3 = this.A00;
        if (r3.A02 != null) {
            Log.i("ContactUsActivity/createTicketIq/onSuccess, removing spinner and finishing activity");
            boolean z2 = false;
            int max = Math.max(0, r3.A0A.A03(C16620tM.A02, 974));
            r3.A03 = groupJid;
            r3.A04 = false;
            AnonymousClass11A r2 = r3.A09;
            C33501ig r1 = r3.A08;
            r2.A02(r1);
            if (max <= 0) {
                z2 = true;
            }
            if (!r3.A04(z2)) {
                r3.A06.A0L(new RunnableRunnableShape10S0100000_I0_9((Object) this, 4), (long) max);
            } else {
                r2.A03(r1);
            }
        }
    }
}
