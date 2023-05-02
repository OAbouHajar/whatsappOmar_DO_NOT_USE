package X;

import java.util.Arrays;

/* renamed from: X.4UL  reason: invalid class name */
public final class AnonymousClass4UL {
    public final int A00;
    public final String A01;
    public final String A02;

    public AnonymousClass4UL(String str, String str2, int i2) {
        C18450wi.A0H(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass4UL)) {
                return false;
            }
            AnonymousClass4UL r4 = (AnonymousClass4UL) obj;
            if (!C18450wi.A0R(this.A01, r4.A01) || !C18450wi.A0R(this.A02, r4.A02) || this.A00 != r4.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        AnonymousClass3K2.A1W(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }
}
