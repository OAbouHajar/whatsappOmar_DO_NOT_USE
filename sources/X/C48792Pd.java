package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Pd  reason: invalid class name and case insensitive filesystem */
public class C48792Pd {
    public final int A00;
    public final C221816y A01;
    public final AnonymousClass16V A02;
    public final C28381Vw A03;
    public final HashSet A04;

    public C48792Pd(C221816y r1, AnonymousClass16V r2, C28381Vw r3, HashSet hashSet, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = hashSet;
        this.A03 = r3;
        this.A00 = i2;
    }

    public Collection A00() {
        Set A022;
        HashSet hashSet = this.A04;
        if (hashSet == null || hashSet.isEmpty()) {
            return this.A02.A00(this.A03);
        }
        C221816y r4 = this.A01;
        C28381Vw r1 = this.A03;
        int i2 = this.A00;
        HashSet hashSet2 = new HashSet();
        C16030sJ.A0D(DeviceJid.class, hashSet, hashSet2);
        if (!hashSet2.isEmpty()) {
            if (i2 == 58 || i2 == 69) {
                C15830rv r12 = r1.A00;
                AnonymousClass00B.A06(r12);
                A022 = r4.A02(r12, (C16740tZ) null, i2);
            } else if (i2 != 77) {
                A022 = r4.A05.A00(r1);
            }
            hashSet2.retainAll(A022);
        }
        return hashSet2;
    }
}
