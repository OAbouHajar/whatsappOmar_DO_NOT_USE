package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4Fk  reason: invalid class name and case insensitive filesystem */
public final class C83114Fk {
    public final C28371Vv A00;

    public C83114Fk(AnonymousClass4QV r11, C83124Fl r12, String str, String str2) {
        C32461gQ A0S = AnonymousClass3K4.A0S("iq");
        C32461gQ A0S2 = AnonymousClass3K4.A0S("account");
        C32461gQ.A00(A0S2, "action", "upi-activate-international-payments");
        if (C32271fx.A0D(str, 6, 20, false)) {
            C32461gQ.A00(A0S2, "start-date", str);
        }
        if (C32271fx.A0D(str2, 6, 20, false)) {
            C32461gQ.A00(A0S2, "end-date", str2);
        }
        A0S2.A02(new C35081lL("version", 1));
        C28371Vv r5 = r12.A00;
        A0S2.A05(r5, AnonymousClass000.A0u());
        List list = Collections.EMPTY_LIST;
        A0S2.A07(r5, list, AnonymousClass000.A0u());
        AnonymousClass3K4.A0s(A0S2, A0S);
        A0S.A05(r11.A00, AnonymousClass000.A0u());
        r11.A00(A0S, list);
        this.A00 = A0S.A01();
    }
}
