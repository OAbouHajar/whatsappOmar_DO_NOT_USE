package X;

import java.util.Arrays;

/* renamed from: X.2gM  reason: invalid class name and case insensitive filesystem */
public class C53822gM {
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;

    public C53822gM(String str, String str2, int i2, boolean z2) {
        this.A00 = i2;
        this.A03 = z2;
        this.A02 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53822gM) {
                C53822gM r5 = (C53822gM) obj;
                if (this.A00 != r5.A00 || this.A03 != r5.A03 || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A03), this.A02, this.A01});
    }
}
