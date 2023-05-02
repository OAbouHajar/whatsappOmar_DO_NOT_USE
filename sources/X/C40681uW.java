package X;

import java.util.Arrays;

/* renamed from: X.1uW  reason: invalid class name and case insensitive filesystem */
public final class C40681uW {
    public final String A00;
    public final byte[] A01;

    public C40681uW(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C40681uW.class != obj.getClass()) {
                return false;
            }
            C40681uW r5 = (C40681uW) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !C34901l3.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.A01) + 31) * 31;
        String str = this.A00;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
