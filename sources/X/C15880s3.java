package X;

import java.util.Arrays;

/* renamed from: X.0s3  reason: invalid class name and case insensitive filesystem */
public class C15880s3 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C15880s3(String str, String str2, int i2, boolean z2) {
        this.A03 = z2;
        this.A00 = i2;
        this.A01 = str;
        this.A02 = str2;
    }

    public void A00() {
        if (!this.A03) {
            throw new SecurityException(toString());
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C15880s3 r5 = (C15880s3) obj;
            if (this.A03 != r5.A03 || this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A03), Integer.valueOf(this.A00), this.A01, this.A02});
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.A03) {
            str = "Trusted callers: uid=";
        } else {
            sb = new StringBuilder();
            str = "Untrusted caller: uid=";
        }
        sb.append(str);
        sb.append(this.A00);
        sb.append(", package=");
        sb.append(this.A01);
        sb.append(", signature=");
        sb.append(this.A02);
        return sb.toString();
    }
}
