package X;

import java.util.Set;

/* renamed from: X.0o6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13800o6 implements C13810o7 {
    public static final C13800o6 A00 = new C13800o6();

    public Object A72(C13830o9 r5) {
        Set A03 = r5.A03();
        C14080oa r2 = C14080oa.A01;
        if (r2 == null) {
            synchronized (C14080oa.class) {
                r2 = C14080oa.A01;
                if (r2 == null) {
                    r2 = new C14080oa();
                    C14080oa.A01 = r2;
                }
            }
        }
        return new C13780o4(r2, A03);
    }
}
