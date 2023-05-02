package X;

import java.util.Arrays;

/* renamed from: X.2gR  reason: invalid class name and case insensitive filesystem */
public class C53872gR {
    public final C35301lh A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C53872gR(C35301lh r1, String str, String str2, String str3) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C53872gR r5 = (C53872gR) obj;
            if (!(this.A00.equals(r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01, this.A03});
    }
}
