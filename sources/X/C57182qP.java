package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.2qP  reason: invalid class name and case insensitive filesystem */
public class C57182qP extends C016307t {
    public final C50512Zx A00;

    public C57182qP(Bundle bundle, C001600r r2, C50512Zx r3) {
        super(bundle, r2);
        this.A00 = r3;
    }

    public C003401n A02(C016407u r18, Class cls, String str) {
        C50212Yk r1 = this.A00.A00;
        C16150sX r6 = r1.A03;
        Application A002 = C24221Fa.A00(r6.AS2);
        C16260sj A0X = C16150sX.A0X(r6);
        C17180uf A0D = C16150sX.A0D(r6);
        C49132Rg r4 = r1.A01;
        AnonymousClass2Z2 A07 = r4.A07();
        C16150sX r5 = r4.A1s;
        AnonymousClass3FG r15 = new AnonymousClass3FG(C16150sX.A0D(r5), new C85894Qk(r4.A07(), C16150sX.A0V(r5)));
        C18170wG A0F = C16150sX.A0F(r6);
        return new AnonymousClass269(A002, r18, A0D, C16150sX.A0E(r6), new AnonymousClass399((C50592a6) r4.A0N.get(), (C18110wA) r5.ABF.get()), A07, (C25641Ko) r6.ALS.get(), A0F, r15, A0X);
    }
}
