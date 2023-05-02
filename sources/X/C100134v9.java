package X;

import java.util.Iterator;

/* renamed from: X.4v9  reason: invalid class name and case insensitive filesystem */
public class C100134v9 implements C108465Oc {
    public long A00 = 0;
    public final /* synthetic */ C70963iD A01;

    public C100134v9(C70963iD r3) {
        this.A01 = r3;
    }

    public void APO(long j2) {
        long j3 = this.A00 + j2;
        this.A00 = j3;
        if (j2 > 0) {
            C70963iD r0 = this.A01;
            AnonymousClass12M r5 = r0.A01;
            C61743Ad r3 = r0.A02;
            AnonymousClass4WW r02 = r3.A02;
            long j4 = r02 != null ? r02.A00 : r3.A00;
            Iterator A002 = C16590tJ.A00(r5);
            while (A002.hasNext()) {
                ((AnonymousClass12R) A002.next()).ATj(j3, j4);
            }
        }
    }
}
