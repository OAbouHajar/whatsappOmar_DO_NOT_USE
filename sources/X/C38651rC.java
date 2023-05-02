package X;

import java.util.Arrays;

/* renamed from: X.1rC  reason: invalid class name and case insensitive filesystem */
public class C38651rC extends C38661rD {
    public String A00;
    public String A01;

    public C38651rC(C28381Vw r2, long j2) {
        super(r2, (byte) 33, j2);
    }

    public void A0X(int i2) {
        boolean z2 = false;
        if (i2 == 2) {
            z2 = true;
        }
        AnonymousClass00B.A0C("FMessageBlankReply can only be quote message.", z2);
        super.A0X(i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C38651rC r5 = (C38651rC) obj;
            if (!C34901l3.A00(this.A00, r5.A00) || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }
}
