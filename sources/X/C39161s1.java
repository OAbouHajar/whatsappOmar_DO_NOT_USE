package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1s1  reason: invalid class name and case insensitive filesystem */
public class C39161s1 extends C38831rU {
    public UserJid A00;

    public C39161s1(C28381Vw r7, long j2) {
        super(r7, (byte) 64, 8, j2);
    }

    public C39161s1(C28381Vw r2, C39161s1 r3, long j2) {
        super(r2, r3, j2);
        this.A00 = r3.A00;
    }

    public void A12(C33241iG r2) {
        super.A12(r2);
        r2.A08(false);
        UserJid A0C = A0C();
        if (A0C != null) {
            r2.A06(A0C.getRawString());
        }
    }
}
