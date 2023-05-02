package X;

import java.util.Comparator;

/* renamed from: X.2By  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46002By implements Comparator {
    public final /* synthetic */ boolean A00;

    public /* synthetic */ C46002By(boolean z2) {
        this.A00 = z2;
    }

    public final int compare(Object obj, Object obj2) {
        long j2;
        long j3;
        boolean z2 = this.A00;
        C37871ps r7 = (C37871ps) obj;
        C37871ps r8 = (C37871ps) obj2;
        boolean equals = r7.getClass().equals(r8.getClass());
        C16740tZ r1 = r7.A00;
        if (equals) {
            j2 = r1.A13;
            j3 = r8.A00.A13;
        } else {
            C16740tZ r0 = r8.A00;
            j2 = r1.A0I;
            j3 = r0.A0I;
        }
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        return z2 ? -i2 : i2;
    }
}
