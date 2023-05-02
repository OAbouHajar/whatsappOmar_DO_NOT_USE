package X;

import java.util.List;

/* renamed from: X.4Qh  reason: invalid class name and case insensitive filesystem */
public class C85864Qh {
    public final AnonymousClass4N4 A00;
    public final List A01;

    public C85864Qh(AnonymousClass4N4 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        for (AnonymousClass4N4 r0 : this.A01) {
            A0o.append(r0.A01);
            A0o.append(",");
        }
        Object[] A1Z = C13690nt.A1Z();
        C13690nt.A1L(this.A00.A01, A0o, A1Z);
        return String.format("CategoryResponse{responseCategoryId=%s, subCategories=%s}", A1Z);
    }
}
