package X;

import java.util.Arrays;

/* renamed from: X.1uc  reason: invalid class name and case insensitive filesystem */
public final class C40741uc {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;

    public C40741uc(String str, byte[] bArr, byte[] bArr2) {
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C40741uc.class != obj.getClass()) {
                return false;
            }
            C40741uc r5 = (C40741uc) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02) || !C34901l3.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((Arrays.hashCode(this.A01) + 31) * 31) + Arrays.hashCode(this.A02)) * 31;
        String str = this.A00;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
