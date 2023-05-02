package X;

/* renamed from: X.4Td  reason: invalid class name and case insensitive filesystem */
public final class C86524Td {
    public final C28371Vv A00;
    public final AnonymousClass5N9 A01;

    public C86524Td(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "card");
        C32261fw[] r2 = new C32261fw[3];
        r2[0] = AnonymousClass3K3.A0X(r5, 12);
        r2[1] = AnonymousClass3K3.A0X(r5, 14);
        this.A01 = (AnonymousClass5N9) C32271fx.A04(r6, "BRCard|MXCard|ESCard", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 13), r2, 2), new String[0]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86524Td.class != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C86524Td) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass3K2.A07(this.A01, C13680ns.A1b());
    }
}
