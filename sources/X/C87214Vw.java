package X;

/* renamed from: X.4Vw  reason: invalid class name and case insensitive filesystem */
public final class C87214Vw {
    public final int A00;
    public final AnonymousClass3HS A01;
    public final String A02;

    public C87214Vw(AnonymousClass3HS r2, String str, int i2) {
        if (i2 < 0) {
            throw AnonymousClass000.A0T("Start index must be >= 0.");
        } else if (str != null) {
            this.A00 = i2;
            this.A02 = str;
            this.A01 = r2;
        } else {
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87214Vw)) {
            return false;
        }
        C87214Vw r4 = (C87214Vw) obj;
        return this.A02.equals(r4.A02) && this.A00 == r4.A00 && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1K(objArr, this.A00);
        objArr[1] = this.A02;
        return AnonymousClass000.A0F(this.A01, objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("PhoneNumberMatch [");
        int i2 = this.A00;
        A0r.append(i2);
        A0r.append(",");
        String str = this.A02;
        A0r.append(i2 + str.length());
        A0r.append(") ");
        return AnonymousClass000.A0h(str, A0r);
    }
}
