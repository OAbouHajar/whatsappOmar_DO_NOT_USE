package X;

import java.util.List;

/* renamed from: X.39Q  reason: invalid class name */
public class AnonymousClass39Q {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass2XG A03;
    public final C34651kc A04;
    public final C16740tZ A05;
    public final C16740tZ A06;
    public final C28381Vw A07;
    public final Integer A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass39Q(AnonymousClass2XG r1, C34651kc r2, C16740tZ r3, C16740tZ r4, C28381Vw r5, Integer num, List list, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4) {
        this.A0B = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A09 = list;
        this.A02 = i3;
        this.A00 = i4;
        this.A01 = i2;
        this.A04 = r2;
        this.A03 = r1;
        this.A08 = num;
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass39Q r5 = (AnonymousClass39Q) obj;
            if (!(this.A0B == r5.A0B && this.A02 == r5.A02 && this.A04.equals(r5.A04) && C34901l3.A00(this.A08, r5.A08) && C34901l3.A00(this.A03, r5.A03) && C34901l3.A00(this.A05, r5.A05) && this.A0C == r5.A0C && this.A0A == r5.A0A && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A06 == r5.A06 && this.A07 == r5.A07 && C34901l3.A00(this.A09, r5.A09))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[13];
        objArr[0] = Boolean.valueOf(this.A0B);
        objArr[1] = this.A04;
        objArr[2] = Integer.valueOf(this.A02);
        objArr[3] = this.A08;
        objArr[4] = this.A03;
        objArr[5] = this.A05;
        objArr[6] = Boolean.valueOf(this.A0C);
        objArr[7] = Boolean.valueOf(this.A0A);
        objArr[8] = Integer.valueOf(this.A00);
        objArr[9] = Integer.valueOf(this.A01);
        objArr[10] = this.A06;
        objArr[11] = this.A07;
        return AnonymousClass000.A0F(this.A09, objArr, 12);
    }
}
