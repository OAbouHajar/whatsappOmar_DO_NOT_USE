package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1N9  reason: invalid class name */
public class AnonymousClass1N9 {
    public final C16070sO A00;
    public final C16490t9 A01;

    public AnonymousClass1N9(C16070sO r1, C16490t9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final void A00(C75453sB r4, C39171s2 r5) {
        long j2 = r5.A0I;
        r4.A04 = Long.valueOf((j2 - (j2 % 86400000)) / 1000);
        r4.A05 = Long.valueOf((long) r5.A05.size());
    }

    public final void A01(C75453sB r3, C15830rv r4) {
        boolean z2 = r4 instanceof C16050sL;
        r3.A00 = Boolean.valueOf(z2);
        if (z2) {
            C16070sO r1 = this.A00;
            GroupJid groupJid = (GroupJid) r4;
            r3.A01 = Boolean.valueOf(r1.A0A(groupJid));
            r3.A02 = Integer.valueOf(C40511uF.A01(r1.A01(groupJid)));
        }
    }
}
