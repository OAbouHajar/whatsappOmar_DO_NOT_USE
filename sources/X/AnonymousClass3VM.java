package X;

import android.util.Pair;
import java.util.Map;

/* renamed from: X.3VM  reason: invalid class name */
public final class AnonymousClass3VM extends AnonymousClass3VO {
    public final int A00;
    public final AnonymousClass3VN A01;
    public final Map A02 = AnonymousClass000.A0x();
    public final Map A03 = AnonymousClass000.A0x();

    public AnonymousClass3VM(AnonymousClass2PW r3, int i2) {
        C90524eJ.A03(AnonymousClass000.A1Q(i2));
        this.A01 = new AnonymousClass3VN(r3, false);
        this.A00 = i2;
    }

    public void A03(AnonymousClass5LZ r2) {
        super.A03(r2);
        A04(this.A01);
    }

    public C15070qH A7W(C30271c3 r4, AnonymousClass5RB r5, long j2) {
        if (this.A00 == Integer.MAX_VALUE) {
            return this.A01.A7W(r4, r5, j2);
        }
        C30271c3 A012 = r4.A01(((Pair) r4.A04).second);
        this.A02.put(A012, r4);
        C97284ph A05 = this.A01.A7W(A012, r5, j2);
        this.A03.put(A05, A012);
        return A05;
    }

    public C86924Ur ADS() {
        return this.A01.A07.ADS();
    }

    public void Abl(C15070qH r3) {
        this.A01.Abl(r3);
        Object remove = this.A03.remove(r3);
        if (remove != null) {
            this.A02.remove(remove);
        }
    }
}
