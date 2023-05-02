package X;

import java.io.Serializable;

/* renamed from: X.54j  reason: invalid class name and case insensitive filesystem */
public final class C1042154j implements Serializable {
    public static final long serialVersionUID = 0;
    public final AnonymousClass1UM[] elements;

    public C1042154j(AnonymousClass1UM[] r1) {
        this.elements = r1;
    }

    private final Object readResolve() {
        AnonymousClass1UM[] r4 = this.elements;
        AnonymousClass1UM r3 = C1052258r.A00;
        int length = r4.length;
        int i2 = 0;
        while (i2 < length) {
            AnonymousClass1UM r0 = r4[i2];
            i2++;
            r3 = r3.plus(r0);
        }
        return r3;
    }
}
