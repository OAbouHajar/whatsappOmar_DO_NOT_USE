package X;

import java.util.Arrays;

/* renamed from: X.2Pz  reason: invalid class name and case insensitive filesystem */
public class C48942Pz {
    public final int A00;
    public final String A01;

    public C48942Pz(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C48942Pz r5 = (C48942Pz) obj;
            if (this.A00 != r5.A00 || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }
}
