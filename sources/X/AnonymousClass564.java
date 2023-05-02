package X;

import com.facebook.redex.IDxPCallbackShape80S0200000_2_I1;
import com.facebook.redex.IDxSListenerShape362S0100000_2_I1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.564  reason: invalid class name */
public final /* synthetic */ class AnonymousClass564 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C18690x6 A03;
    public final /* synthetic */ UserJid A04;

    public /* synthetic */ AnonymousClass564(C18690x6 r1, UserJid userJid, int i2, int i3, long j2) {
        this.A03 = r1;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = j2;
        this.A04 = userJid;
    }

    public final void run() {
        int i2;
        C18690x6 r7 = this.A03;
        int i3 = this.A00;
        int i4 = this.A01;
        long j2 = this.A02;
        UserJid userJid = this.A04;
        C75253rr r6 = new C75253rr();
        r6.A01 = Integer.valueOf(i3);
        r6.A02 = Integer.valueOf(i4);
        r6.A03 = Long.valueOf(j2);
        C14710pd r1 = r7.A00;
        if (r1.A0C(2887)) {
            r6.A04 = userJid.getRawString();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C18680x5 r2 = r7.A02;
        boolean A0C = r1.A0C(2888);
        AnonymousClass4H4 r9 = new AnonymousClass4H4(r6, countDownLatch);
        C18450wi.A0H(userJid, 0);
        if (A0C) {
            C18670x4 r3 = r2.A00;
            C28331Vq A002 = r3.A01.A00(userJid);
            i2 = null;
            if (A002 != null) {
                if (A002.A02()) {
                    i2 = 1;
                } else if (A002.A01()) {
                    C17150uc r32 = r3.A00;
                    r32.A03(new IDxPCallbackShape80S0200000_2_I1(new IDxSListenerShape362S0100000_2_I1(r9, 1), 0, r32), userJid);
                    countDownLatch.await();
                    r7.A01.A06(r6);
                }
            }
        } else {
            i2 = null;
        }
        C75253rr r12 = r9.A00;
        CountDownLatch countDownLatch2 = r9.A01;
        r12.A00 = i2;
        countDownLatch2.countDown();
        try {
            countDownLatch.await();
            r7.A01.A06(r6);
        } catch (InterruptedException e2) {
            Log.e("log interrupted", e2);
        }
    }
}
