package X;

import java.util.Map;

/* renamed from: X.4uS  reason: invalid class name and case insensitive filesystem */
public final class C99704uS implements AnonymousClass5OU {
    public C70283gP A00;
    public final C89314bx A01;

    public C99704uS(C89314bx r1, AnonymousClass4XQ r2) {
        this.A01 = r1;
        this.A00 = (C70283gP) r2;
    }

    public boolean ALN(Object obj) {
        AnonymousClass4RV r1 = this.A01.A01;
        C109755Tl r4 = r1.A00;
        if (!(obj instanceof Map)) {
            return false;
        }
        C70283gP r3 = this.A00;
        if (!r3.A06() || (r3.A01 == null && r1.A03.contains(AnonymousClass420.DEFAULT_PATH_LEAF_TO_NULL))) {
            return true;
        }
        return r4.AFG(obj).containsAll(r3.A01);
    }
}
