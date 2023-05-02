package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.57K  reason: invalid class name */
public final class AnonymousClass57K implements Comparator, Serializable {
    public final float average;

    public AnonymousClass57K(float f2) {
        this.average = f2;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C69743fX r4 = (C69743fX) obj;
        C69743fX r5 = (C69743fX) obj2;
        int A00 = AnonymousClass03H.A00(r5.A01, r4.A01);
        if (A00 != 0) {
            return A00;
        }
        float f2 = r4.A00;
        float f3 = this.average;
        return Float.compare(AnonymousClass3K4.A01(f2, f3), AnonymousClass3K4.A01(r5.A00, f3));
    }
}
