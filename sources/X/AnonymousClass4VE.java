package X;

import java.util.List;

/* renamed from: X.4VE  reason: invalid class name */
public class AnonymousClass4VE {
    public List A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final C34651kc A07;
    public final C16740tZ A08;
    public final boolean A09;

    public AnonymousClass4VE(C34651kc r1, C16740tZ r2, List list, int i2, int i3, int i4, int i5, long j2, boolean z2, boolean z3) {
        this.A09 = z2;
        this.A02 = i2;
        this.A05 = i3;
        this.A08 = r2;
        this.A06 = j2;
        this.A04 = i4;
        this.A03 = i5;
        this.A07 = r1;
        this.A00 = list;
        this.A01 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4VE r7 = (AnonymousClass4VE) obj;
            if (!(this.A09 == r7.A09 && this.A02 == r7.A02 && this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A08.equals(r7.A08) && C34901l3.A00(this.A07, r7.A07) && this.A00.equals(r7.A00) && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = Boolean.valueOf(this.A09);
        AnonymousClass000.A1L(objArr, this.A02);
        AnonymousClass3K2.A1W(objArr, this.A05);
        objArr[3] = this.A08;
        objArr[4] = 100;
        objArr[5] = Long.valueOf(this.A06);
        objArr[6] = Integer.valueOf(this.A04);
        objArr[7] = Integer.valueOf(this.A03);
        objArr[8] = this.A07;
        objArr[9] = this.A00;
        return AnonymousClass000.A0F(Boolean.valueOf(this.A01), objArr, 10);
    }
}
