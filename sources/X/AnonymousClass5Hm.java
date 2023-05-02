package X;

/* renamed from: X.5Hm  reason: invalid class name */
public class AnonymousClass5Hm extends C32061fa {
    public AnonymousClass5I5[] A00;

    public AnonymousClass5Hm(C32411gJ r5) {
        if (r5.A0A() >= 1) {
            this.A00 = new AnonymousClass5I5[r5.A0A()];
            for (int i2 = 0; i2 != r5.A0A(); i2++) {
                Object[] objArr = this.A00;
                Object A0C = r5.A0C(i2);
                if (!(A0C instanceof AnonymousClass5I5)) {
                    A0C = A0C != null ? new AnonymousClass5I5(C32411gJ.A00(A0C)) : null;
                }
                objArr[i2] = A0C;
            }
            return;
        }
        throw AnonymousClass000.A0T("sequence may not be empty");
    }

    public C32051fZ Agm() {
        return new C32401gI((C32071fb[]) this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AuthorityInformationAccess: Oid(");
        A0r.append(this.A00[0].A00.A01);
        return AnonymousClass000.A0h(")", A0r);
    }
}
