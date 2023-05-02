package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0dk  reason: invalid class name and case insensitive filesystem */
public class C08500dk implements C12660kl {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C08500dk(String str, List list, boolean z2) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z2;
    }

    public C13150lY Agn(AnonymousClass0Ak r2, C08360dV r3) {
        return new C08310dQ(r2, this, r3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ShapeGroup{name='");
        A0r.append(this.A00);
        A0r.append("' Shapes: ");
        A0r.append(Arrays.toString(this.A01.toArray()));
        return AnonymousClass000.A0k(A0r);
    }
}
