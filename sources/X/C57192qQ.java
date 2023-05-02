package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.2qQ  reason: invalid class name and case insensitive filesystem */
public class C57192qQ extends C016307t {
    public final int A00;
    public final C82364Cn A01;

    public C57192qQ(Bundle bundle, C001600r r2, C82364Cn r3, int i2) {
        super(bundle, r2);
        this.A01 = r3;
        this.A00 = i2;
    }

    public C003401n A02(C016407u r13, Class cls, String str) {
        C82364Cn r0 = this.A01;
        int i2 = this.A00;
        C50142Yd r1 = r0.A00;
        C16150sX r2 = r1.A04;
        C14710pd A0k = C16150sX.A0k(r2);
        Application A002 = C24221Fa.A00(r2.AS2);
        C14870pt A02 = C16150sX.A02(r2);
        C18150wE A0C = C16150sX.A0C(r2);
        C17050uS r12 = r1.A03;
        C613438n A03 = r12.A03();
        C16150sX r22 = r12.A0b;
        return new C57262qa(A002, r13, A02, (C25501Ka) r2.A2i.get(), A0C, new C84774Lv((C25501Ka) r22.A2i.get(), (AnonymousClass1PY) r22.A2h.get()), A03, A0k, i2);
    }
}
