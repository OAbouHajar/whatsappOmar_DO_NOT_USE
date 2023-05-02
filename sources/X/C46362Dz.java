package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2Dz  reason: invalid class name and case insensitive filesystem */
public class C46362Dz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final AnonymousClass2E0 A04;

    static {
        TimeUnit.DAYS.toMillis(14);
    }

    public C46362Dz(C46312Dn r2, String str, String str2, int i2, int i3, int i4, long j2, long j3) {
        AnonymousClass2E0 r0 = new AnonymousClass2E0(r2, str, str2, i2);
        this.A02 = j2;
        this.A03 = j3;
        this.A01 = i3;
        this.A00 = i4;
        this.A04 = r0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C46362Dz)) {
                return false;
            }
            C46362Dz r9 = (C46362Dz) obj;
            AnonymousClass2E0 r6 = this.A04;
            int i2 = r6.A00;
            AnonymousClass2E0 r5 = r9.A04;
            if (!(i2 == r5.A00 && r6.A03.equals(r5.A03) && r6.A02.equals(r5.A02) && this.A02 == r9.A02 && this.A03 == r9.A03 && this.A01 == r9.A01 && this.A00 == r9.A00 && r6.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A04.A00;
    }
}
