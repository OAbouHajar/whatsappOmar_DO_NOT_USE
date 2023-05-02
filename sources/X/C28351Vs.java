package X;

import java.util.Arrays;

/* renamed from: X.1Vs  reason: invalid class name and case insensitive filesystem */
public class C28351Vs {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C40111ta A04;
    public final C40111ta A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C28351Vs(C40111ta r1, C40111ta r2, String str, String str2, int i2, int i3, int i4, int i5, boolean z2) {
        this.A03 = i2;
        this.A01 = i3;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r1;
        this.A04 = r2;
        this.A08 = z2;
        this.A02 = i4;
        this.A00 = i5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C28351Vs r5 = (C28351Vs) obj;
            if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A08 == r5.A08 && this.A02 == r5.A02 && this.A00 == r5.A00 && C34901l3.A00(this.A07, r5.A07) && C34901l3.A00(this.A06, r5.A06) && C34901l3.A00(this.A05, r5.A05) && C34901l3.A00(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A01), this.A07, this.A06, this.A05, this.A04, Boolean.valueOf(this.A08), Integer.valueOf(this.A02), Integer.valueOf(this.A00)});
    }
}
