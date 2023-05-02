package X;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* renamed from: X.3YQ  reason: invalid class name */
public abstract class AnonymousClass3YQ extends C90164db implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (getClass().isInstance(obj)) {
                    C90164db r7 = (C90164db) obj;
                    Iterator A0q = C13680ns.A0q(A05());
                    while (A0q.hasNext()) {
                        AnonymousClass3Y5 r2 = (AnonymousClass3Y5) A0q.next();
                        boolean A06 = A06(r2);
                        boolean A062 = r7.A06(r2);
                        if (A06) {
                            if (A062 && AnonymousClass45A.A00(A04(r2), r7.A04(r2))) {
                            }
                        } else if (A062) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Iterator A0q = C13680ns.A0q(A05());
        int i2 = 0;
        while (A0q.hasNext()) {
            AnonymousClass3Y5 r2 = (AnonymousClass3Y5) A0q.next();
            if (A06(r2)) {
                Object A04 = A04(r2);
                C13710nw.A01(A04);
                i2 = AnonymousClass3K2.A06(A04, i2 * 31);
            }
        }
        return i2;
    }
}
