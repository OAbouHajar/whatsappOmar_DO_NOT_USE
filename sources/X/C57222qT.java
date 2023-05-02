package X;

import android.app.Application;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.Collection;

/* renamed from: X.2qT  reason: invalid class name and case insensitive filesystem */
public class C57222qT extends C016307t {
    public final AnonymousClass4CQ A00;
    public final C31241dn A01;
    public final Jid A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C57222qT(Bundle bundle, C001600r r2, AnonymousClass4CQ r3, C31241dn r4, Jid jid, String str, boolean z2, boolean z3) {
        super(bundle, r2);
        this.A01 = r4;
        this.A02 = jid;
        this.A04 = z2;
        this.A00 = r3;
        this.A03 = str;
        this.A05 = z3;
    }

    public C003401n A02(C016407u r33, Class cls, String str) {
        AnonymousClass4CQ r0 = this.A00;
        boolean z2 = this.A04;
        String str2 = this.A03;
        C31241dn r8 = this.A01;
        boolean z3 = this.A05;
        Jid jid = this.A02;
        C50142Yd r2 = r0.A00;
        C16150sX r1 = r2.A04;
        Application A002 = C24221Fa.A00(r1.AS2);
        AnonymousClass013 A0Z = C16150sX.A0Z(r1);
        C17180uf A0D = C16150sX.A0D(r1);
        C17150uc A09 = C16150sX.A09(r1);
        AnonymousClass2Z2 A07 = r2.A01.A07();
        C17050uS r7 = r2.A03;
        AnonymousClass4Q8 r3 = new AnonymousClass4Q8(C16150sX.A0D(r7.A0b));
        C17210ui A0E = C16150sX.A0E(r1);
        AnonymousClass4HM r23 = new AnonymousClass4HM();
        C17380uz copyOf = C17380uz.copyOf((Collection) C13680ns.A0o());
        C016407u r13 = r33;
        AnonymousClass4Q8 r20 = r3;
        C108655Ov r21 = (C108655Ov) r7.A06.get();
        AnonymousClass5P2 r22 = (AnonymousClass5P2) r7.A04.get();
        AnonymousClass5P3 r24 = (AnonymousClass5P3) r7.A05.get();
        return new C57272qc(A002, r13, (AnonymousClass4CR) r7.A07.get(), A09, A0D, A0E, A07, (AnonymousClass1PS) r1.A6z.get(), r20, r21, r22, r23, r24, r8, A0Z, jid, str2, copyOf, z2, z3);
    }
}
