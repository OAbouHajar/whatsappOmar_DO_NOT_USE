package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3GW  reason: invalid class name */
public class AnonymousClass3GW implements C19550yc {
    public final /* synthetic */ C40821uk A00;
    public final /* synthetic */ C17780vd A01;
    public final /* synthetic */ C40841um A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass3GW(C40821uk r1, C17780vd r2, C40841um r3, Runnable runnable, boolean z2) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = z2;
        this.A03 = runnable;
        this.A00 = r1;
    }

    public void APb(String str) {
        StringBuilder A0r = AnonymousClass000.A0r("GroupIqResponseUtil/remove-admin/delivery fail; groupId=");
        A0r.append(this.A00.A01);
        C13680ns.A1V(A0r);
    }

    public void AQe(C28371Vv r3, String str) {
        this.A02.Ach(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r7, String str) {
        C17780vd r5 = this.A01;
        C16300so r1 = r5.A00;
        Jid A0F = r7.A0F(r1, C16050sL.class, "from");
        if (A0F == null) {
            this.A02.Ach(800);
            return;
        }
        HashMap A0x = AnonymousClass000.A0x();
        HashMap A0x2 = AnonymousClass000.A0x();
        AnonymousClass3BT.A01(r1, r7, this.A04 ? "admin" : "demote", A0x, A0x2);
        r5.A04.get();
        StringBuilder A0r = AnonymousClass000.A0r("groupmgr/onDemoteGroupParticipants/");
        A0r.append(A0F);
        Log.i(AnonymousClass000.A0h(C13680ns.A0k(A0r, A0x, A0x2), A0r));
        if (A0x2.size() > 0) {
            C17240ul.A01(3004, A0x2);
        }
        this.A03.run();
    }
}
