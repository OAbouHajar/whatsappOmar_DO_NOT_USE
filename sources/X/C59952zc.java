package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2zc  reason: invalid class name and case insensitive filesystem */
public class C59952zc extends AnonymousClass373 {
    public final C14870pt A00;
    public final C16000sG A01;
    public final C16440t3 A02;
    public final AnonymousClass18P A03;
    public final C16050sL A04;
    public final WeakReference A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59952zc(X.C14870pt r13, X.C16000sG r14, X.C16440t3 r15, X.C25711Kv r16, X.AnonymousClass18P r17, X.C25701Ku r18, X.AnonymousClass17N r19, X.C16480t8 r20, X.AnonymousClass10G r21, X.C16010sH r22, X.AnonymousClass3o0 r23, X.C18090w8 r24, X.C18290wS r25) {
        /*
            r12 = this;
            r1 = r12
            r2 = r13
            r4 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r3 = r23
            r10 = r24
            r11 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r15
            r12.A00 = r13
            java.lang.ref.WeakReference r0 = X.C13690nt.A0h(r3)
            r12.A05 = r0
            r12.A01 = r14
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r9.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0sL r0 = (X.C16050sL) r0
            r12.A04 = r0
            r0 = r17
            r12.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59952zc.<init>(X.0pt, X.0sG, X.0t3, X.1Kv, X.18P, X.1Ku, X.17N, X.0t8, X.10G, X.0sH, X.3o0, X.0w8, X.0wS):void");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass3o0 r0 = (AnonymousClass3o0) this.A05.get();
        if (r0 != null) {
            r0.A03.A0B(AnonymousClass22M.A00);
        }
    }

    public Void A0B(Void... voidArr) {
        super.A08(voidArr);
        if (C16690tT.A02(this)) {
            return null;
        }
        List<C30071bh> A002 = this.A03.A00(this.A04, C13690nt.A09(this.A02.A00()));
        HashSet A0o = C13680ns.A0o();
        ArrayList A0u = AnonymousClass000.A0u();
        for (C30071bh r2 : A002) {
            C15830rv r1 = r2.A11.A00;
            if (r1 != null && !A0o.contains(r1)) {
                A0o.add(r1);
                C16010sH A08 = this.A01.A08(r1);
                if (A08 != null) {
                    A0u.add(new AnonymousClass4I2(A08, r2));
                }
            }
        }
        C14870pt.A03(this.A00, this, A0u, 26);
        return null;
    }
}
