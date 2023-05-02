package X;

import com.facebook.redex.RunnableRunnableShape0S0500000_I0;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1ND  reason: invalid class name */
public class AnonymousClass1ND {
    public final C14710pd A00;
    public final C16490t9 A01;
    public final C20060zR A02;
    public final C16320sq A03;
    public final AtomicInteger A04;

    public AnonymousClass1ND(C14710pd r3, C16490t9 r4, C20060zR r5, C16320sq r6) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.A04 = atomicInteger;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
        this.A02 = r5;
        atomicInteger.set(1);
    }

    public void A00(UserJid userJid, Integer num, Integer num2) {
        if (this.A00.A0E(C16620tM.A02, 1669)) {
            this.A03.Acl(new RunnableRunnableShape0S0500000_I0(this, userJid, num, 4, num2, 2));
        }
    }

    public void A01(UserJid userJid, Integer num, Integer num2) {
        if (this.A00.A0E(C16620tM.A02, 1669)) {
            this.A03.Acl(new RunnableRunnableShape0S0500000_I0(this, userJid, num, 5, num2, 2));
        }
    }
}
