package X;

import android.os.Parcel;

/* renamed from: X.3kI  reason: invalid class name and case insensitive filesystem */
public class C71393kI extends C35701mM {
    public final boolean A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C71393kI(X.C35701mM r20, boolean r21) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r6 = r1.A0D
            java.lang.String r7 = r1.A04
            java.lang.String r8 = r1.A0A
            java.math.BigDecimal r12 = r1.A05
            X.1sq r5 = r1.A03
            java.lang.String r9 = r1.A0C
            java.lang.String r10 = r1.A0E
            java.util.List r13 = r1.A06
            X.1mK r3 = r1.A01
            X.4jc r4 = r1.A02
            java.lang.String r11 = r1.A0B
            int r14 = r1.A00
            boolean r0 = r1.A07
            long r15 = r1.A08
            r17 = 1
            r2 = 0
            r1 = r19
            r18 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18)
            r0 = r21
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71393kI.<init>(X.1mM, boolean):void");
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof C71393kI) && this.A00 == ((C71393kI) obj).A00;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.A00 ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
