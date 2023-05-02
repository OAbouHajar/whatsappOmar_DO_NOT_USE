package X;

import java.util.List;

/* renamed from: X.54r  reason: invalid class name and case insensitive filesystem */
public class C1042754r implements Cloneable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass2Wj A05;
    public List A06 = AnonymousClass000.A0u();
    public List A07 = AnonymousClass000.A0u();
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1042754r r5 = (C1042754r) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A08 == r5.A08 && this.A09 == r5.A09 && this.A0A == r5.A0A && this.A03 == r5.A03 && this.A04 == r5.A04 && C34901l3.A00(this.A06, r5.A06) && this.A05 == r5.A05 && C34901l3.A00(this.A07, r5.A07))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((217 + this.A00) * 31) + this.A01) * 31) + this.A06.hashCode()) * 31) + this.A02) * 31) + AnonymousClass000.A0C(this.A05)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + this.A03) * 31) + this.A07.hashCode()) * 31) + this.A04;
    }
}
