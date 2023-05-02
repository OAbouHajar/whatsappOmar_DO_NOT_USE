package X;

import java.util.Arrays;

/* renamed from: X.2Qb  reason: invalid class name */
public class AnonymousClass2Qb {
    public int A00;
    public final int A01;
    public final int A02;
    public final C16010sH A03;
    public final C16010sH A04;
    public final C16050sL A05;
    public final AnonymousClass1ZT A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public AnonymousClass2Qb(C16010sH r2, C16010sH r3, C16050sL r4, AnonymousClass1ZT r5, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = z2;
        this.A08 = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A0D = z6;
        this.A0A = z7;
        this.A0B = z8;
        this.A0C = z9;
        this.A01 = i2;
        this.A09 = z10;
        this.A00 = i3;
        this.A02 = i4;
        this.A06 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2Qb r5 = (AnonymousClass2Qb) obj;
            if (!(this.A07 == r5.A07 && this.A08 == r5.A08 && this.A0E == r5.A0E && this.A0F == r5.A0F && this.A0D == r5.A0D && this.A0A == r5.A0A && this.A0B == r5.A0B && this.A0C == r5.A0C && this.A01 == r5.A01 && this.A03.equals(r5.A03) && C34901l3.A00(this.A05, r5.A05) && C34901l3.A00(this.A04, r5.A04) && this.A09 == r5.A09 && this.A02 == r5.A02 && this.A06 == r5.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A05, this.A04, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0A), false, Boolean.valueOf(this.A0B), Boolean.valueOf(this.A0C), Integer.valueOf(this.A01), Boolean.valueOf(this.A09), Integer.valueOf(this.A02), this.A06});
    }
}
