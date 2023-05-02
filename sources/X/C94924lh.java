package X;

import android.os.Bundle;

/* renamed from: X.4lh  reason: invalid class name and case insensitive filesystem */
public class C94924lh implements C016807y {
    public final /* synthetic */ C45692Af A00;

    public C94924lh(C45692Af r1) {
        this.A00 = r1;
    }

    public boolean AVa(String str) {
        C45692Af r3 = this.A00;
        r3.A0O = str;
        r3.A0P = C40661uU.A02(r3.A01, str);
        Bundle A0D = C13690nt.A0D();
        A0D.putString("query", str);
        r3.A0W().A00(A0D, r3);
        return false;
    }

    public boolean AVb(String str) {
        return false;
    }
}
