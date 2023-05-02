package X;

/* renamed from: X.4Uk  reason: invalid class name and case insensitive filesystem */
public class C86854Uk {
    public final int A00;
    public final int A01;
    public final AnonymousClass4TR A02;
    public final C86354Sj A03;

    public C86854Uk(AnonymousClass4TR r1, C86354Sj r2, int i2, int i3) {
        this.A01 = i2;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C86854Uk r5 = (C86854Uk) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1K(objArr, this.A01);
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[2] = this.A03;
        return AnonymousClass000.A0F(this.A02, objArr, 3);
    }
}
