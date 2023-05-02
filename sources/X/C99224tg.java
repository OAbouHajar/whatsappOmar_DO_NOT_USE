package X;

/* renamed from: X.4tg  reason: invalid class name and case insensitive filesystem */
public final class C99224tg implements AnonymousClass5ON {
    public final /* synthetic */ C84244Ju A00;
    public final /* synthetic */ C84244Ju A01;

    public C99224tg(C84244Ju r1, C84244Ju r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final boolean Ahl(C31201dg r6) {
        C84244Ju r4 = this.A01;
        C84244Ju r3 = this.A00;
        int i2 = r6.A00;
        Object obj = r4.A02.get(i2);
        if (obj != null) {
            r3.A02.put(i2, obj);
        }
        Object obj2 = r4.A00.get(i2);
        if (obj2 != null) {
            r3.A00.put(i2, obj2);
        }
        Object obj3 = r4.A01.get(i2);
        if (obj3 == null) {
            return false;
        }
        r3.A01.put(i2, obj3);
        return false;
    }
}
