package X;

/* renamed from: X.4Tf  reason: invalid class name and case insensitive filesystem */
public final class C86544Tf {
    public final C28371Vv A00;
    public final C86534Te A01;

    public C86544Tf(C16300so r2, C28371Vv r3) {
        C28371Vv.A06(r3, "choice");
        this.A01 = (C86534Te) AnonymousClass3K2.A0c(r2, r3, 19);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86544Tf.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86544Tf) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
