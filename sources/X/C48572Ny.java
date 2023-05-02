package X;

import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.2Ny  reason: invalid class name and case insensitive filesystem */
public class C48572Ny implements C19550yc {
    public final C14870pt A00;
    public final AnonymousClass2Nz A01;
    public final C17190ug A02;

    public C48572Ny(C14870pt r1, AnonymousClass2Nz r2, C17190ug r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void APb(String str) {
        Log.e("ChatSupportTicketProtocolHelper/onDeliveryFailure");
        this.A00.Acq(new RunnableRunnableShape10S0100000_I0_9((Object) this.A01, 1));
    }

    public void AQe(C28371Vv r5, String str) {
        StringBuilder sb = new StringBuilder("ChatSupportTicketProtocolHelper/onError: error response:");
        sb.append(r5);
        Log.e(sb.toString());
        C28371Vv A0J = r5.A0J("error");
        if (A0J != null) {
            this.A00.Acq(new RunnableRunnableShape0S0101000_I0((Object) this, A0J.A0A("code", 0), 18));
        }
    }

    public void AYG(C28371Vv r6, String str) {
        C28371Vv A0J = r6.A0J("response");
        Jid jid = null;
        if (A0J != null) {
            C28371Vv A0J2 = A0J.A0J("ticket_id");
            String A0L = A0J2 != null ? A0J2.A0L() : null;
            C28371Vv A0J3 = A0J.A0J("group_jid");
            if (A0J3 != null) {
                try {
                    String A0L2 = A0J3.A0L();
                    Jid jid2 = Jid.get(A0L2);
                    if (jid2 instanceof GroupJid) {
                        jid = jid2;
                    } else {
                        throw new AnonymousClass1W4(A0L2);
                    }
                } catch (AnonymousClass1W4 unused) {
                    Log.e("ChatSupportTicketProtocolHelper/onSuccess called with invalid jid");
                }
            }
            if (A0L != null) {
                StringBuilder sb = new StringBuilder("ChatSupportTicketProtocolHelper/onSuccess called, ticketId=");
                sb.append(A0L);
                Log.i(sb.toString());
                this.A00.Acq(new RunnableRunnableShape0S1200000_I0(jid, A0L, this, 23));
                return;
            }
        }
        Log.e("ChatSupportTicketProtocolHelper/onSuccess called but ticketId is null, posting an error");
        this.A00.Acq(new RunnableRunnableShape10S0100000_I0_9((Object) this, 2));
    }
}
