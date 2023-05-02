package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.37H  reason: invalid class name */
public class AnonymousClass37H extends C16690tT {
    public C439822h A00;
    public final C16040sK A01;
    public final AnonymousClass13V A02;
    public final C19230xz A03;
    public final UserJid A04;
    public final WeakReference A05;
    public final CountDownLatch A06 = new CountDownLatch(1);

    public AnonymousClass37H(C16040sK r3, C14530pL r4, AnonymousClass13V r5, C19230xz r6, UserJid userJid) {
        this.A05 = C13690nt.A0h(r4);
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = userJid;
        this.A00 = new C71323kB(this, userJid);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C452927v r2;
        C453027w r0;
        if (this.A01.A0G()) {
            r2 = new C452927v(C34861kz.A0C);
            r0 = C453027w.A0A;
        } else {
            r2 = new C452927v(C34861kz.A0A);
            r0 = C453027w.A09;
        }
        r2.A00 = r0;
        r2.A02 = true;
        UserJid userJid = this.A04;
        if (userJid != null) {
            r2.A07.add(userJid);
        }
        if (!this.A03.A01(r2.A01()).A00()) {
            return null;
        }
        try {
            this.A06.await(AnonymousClass1NO.A0L, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException unused) {
            Log.w("ConversationRowContact/OpenBusinessProfileNotInContactListTask was interrupted while waiting for biz identity response.");
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A02.A03(this.A00);
        C14550pN r2 = (C14550pN) this.A05.get();
        if (r2 != null) {
            r2.Ac1();
            r2.A2X(C14750ph.A0Z(r2, this.A04, (Integer) null, true), false);
        }
    }
}
