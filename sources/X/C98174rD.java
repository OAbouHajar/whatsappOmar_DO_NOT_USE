package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.4rD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98174rD implements C108435Nz {
    public final C88774b4 A00;
    public final C90644eV A01;

    public C98174rD(C88774b4 r1, C90644eV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object AjQ() {
        C90644eV r4 = this.A01;
        C88774b4 r3 = this.A00;
        Map A002 = C90644eV.A02() ? AnonymousClass000.A1X(C90644eV.A00(new C98164rC("gms:phenotype:phenotype_flag:debug_disable_caching"))) : false ? r3.A00() : r3.A06;
        if (A002 == null) {
            synchronized (r3.A03) {
                A002 = r3.A06;
                if (A002 == null) {
                    A002 = r3.A00();
                    r3.A06 = A002;
                }
            }
        }
        if (A002 == null) {
            A002 = Collections.emptyMap();
        }
        return A002.get(r4.A02);
    }
}
