package X;

/* renamed from: X.3Va  reason: invalid class name and case insensitive filesystem */
public final class C65503Va extends AnonymousClass3Uc implements Comparable {
    public long A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C65503Va r8 = (C65503Va) obj;
        boolean A1R = AnonymousClass000.A1R(this.flags & 4, 4);
        if (A1R != AnonymousClass000.A1R(r8.flags & 4, 4)) {
            return A1R ? 1 : -1;
        }
        long j2 = this.A00 - r8.A00;
        if (j2 == 0) {
            j2 = this.A00 - r8.A00;
            if (j2 == 0) {
                return 0;
            }
        }
        return j2 > 0 ? 1 : -1;
    }
}
