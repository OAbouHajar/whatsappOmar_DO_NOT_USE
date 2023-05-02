package X;

import java.util.Collection;
import java.util.Collections;

/* renamed from: X.3gS  reason: invalid class name and case insensitive filesystem */
public class C70313gS extends AnonymousClass4XQ {
    public final Collection A00;

    public C70313gS(AnonymousClass5OQ r2) {
        this.A00 = Collections.singletonList(r2);
    }

    public C70313gS(Collection collection) {
        this.A00 = collection;
    }

    public boolean A08(AnonymousClass4RV r5, C89314bx r6, Object obj, Object obj2) {
        C84634Lh r3 = new C84634Lh(r5, obj, obj2, r6.A06);
        for (AnonymousClass5OQ A54 : this.A00) {
            try {
                if (!A54.A54(r3)) {
                    return false;
                }
            } catch (C70003fx unused) {
            }
        }
        return true;
    }
}
