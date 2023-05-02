package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.57L  reason: invalid class name */
public final class AnonymousClass57L implements Comparator, Serializable {
    public final float average;

    public AnonymousClass57L(float f2) {
        this.average = f2;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float f2 = ((C69743fX) obj2).A00;
        float f3 = this.average;
        return Float.compare(AnonymousClass3K4.A01(f2, f3), AnonymousClass3K4.A01(((C69743fX) obj).A00, f3));
    }
}
