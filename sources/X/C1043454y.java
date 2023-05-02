package X;

import java.lang.ref.WeakReference;

/* renamed from: X.54y  reason: invalid class name and case insensitive filesystem */
public class C1043454y implements Comparable {
    public final int A00;
    public final long A01;
    public final AnonymousClass4VG A02;
    public final WeakReference A03;

    public C1043454y(AnonymousClass4VG r2, C41441vn r3, int i2, long j2) {
        this.A02 = r2;
        this.A01 = j2;
        this.A00 = i2;
        this.A03 = C13690nt.A0h(r3);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C1043454y r6 = (C1043454y) obj;
        if (r6 == null) {
            return -1;
        }
        long j2 = this.A01;
        long j3 = r6.A01;
        if (j2 >= j3) {
            return j2 == j3 ? 0 : 1;
        }
        return -1;
    }
}
