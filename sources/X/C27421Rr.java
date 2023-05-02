package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Rr  reason: invalid class name and case insensitive filesystem */
public class C27421Rr {
    public final AnonymousClass126 A00;
    public final C16820th A01;
    public final C16920ts A02;
    public final C15810rt A03;
    public final C19650ym A04;

    public C27421Rr(AnonymousClass126 r1, C16820th r2, C16920ts r3, C15810rt r4, C19650ym r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
    }

    public AnonymousClass1WT A00(UserJid userJid) {
        C15840rx A06 = this.A03.A06(userJid);
        if (A06 == null) {
            return null;
        }
        long j2 = A06.A0A;
        if (j2 == -1) {
            return null;
        }
        C16740tZ A002 = this.A01.A00(j2);
        if (!(A002 instanceof AnonymousClass1WU) || ((AnonymousClass1WU) A002).A00 != 28) {
            return null;
        }
        return (AnonymousClass1WT) A002;
    }
}
