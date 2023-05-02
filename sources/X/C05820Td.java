package X;

import com.facebook.redex.IDxKeyShape39S0000000_I1;

/* renamed from: X.0Td  reason: invalid class name and case insensitive filesystem */
public final class C05820Td {
    public static final C014406w A00 = new IDxKeyShape39S0000000_I1(0);
    public static final C014406w A01 = new IDxKeyShape39S0000000_I1(1);
    public static final C014406w A02 = new IDxKeyShape39S0000000_I1(2);

    public static final void A00(C013806q r2) {
        String str;
        C001600r r1 = (C001600r) r2.A00(A01);
        if (r1 == null) {
            str = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`";
        } else if (r2.A00(A02) != null) {
            r2.A00(A00);
            if (r2.A00(C014206u.A01) != null) {
                r1.AFh().A02();
                throw AnonymousClass000.A0V("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            }
            str = "CreationExtras must have a value by `VIEW_MODEL_KEY`";
        } else {
            str = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`";
        }
        throw AnonymousClass000.A0T(str);
    }
}
