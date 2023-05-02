package X;

/* renamed from: X.2Qh  reason: invalid class name */
public abstract class AnonymousClass2Qh {
    public void A00(C28371Vv r6) {
        if (this instanceof C49002Qg) {
            C49002Qg r3 = (C49002Qg) this;
            C28371Vv A0K = r6.A0K("error");
            r3.A01.set(A0K.A0A("code", 0));
            C28371Vv A0J = A0K.A0J("identity");
            if (A0J != null) {
                r3.A02.set(A0J.A01);
                return;
            }
            return;
        }
        for (C28371Vv r32 : r6.A0O("error")) {
            if (r32 != null) {
                String A0N = r32.A0N("code", (String) null);
                r32.A0N("text", (String) null);
                if (A0N != null) {
                    A01(Integer.parseInt(A0N));
                }
            }
        }
    }

    public void A01(int i2) {
    }

    public abstract void A02(C28371Vv r1);
}
