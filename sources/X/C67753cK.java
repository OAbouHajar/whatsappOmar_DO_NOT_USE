package X;

import java.util.Comparator;

/* renamed from: X.3cK  reason: invalid class name and case insensitive filesystem */
public class C67753cK extends C90794ep {
    public C67753cK() {
        super((C67753cK) null);
    }

    public C90794ep classify(int i2) {
        return i2 < 0 ? C90794ep.LESS : i2 > 0 ? C90794ep.GREATER : C90794ep.ACTIVE;
    }

    public C90794ep compare(int i2, int i3) {
        return classify(i2 < i3 ? -1 : C13700nu.A0g(i2, i3));
    }

    public C90794ep compare(Object obj, Object obj2, Comparator comparator) {
        return classify(comparator.compare(obj, obj2));
    }

    public C90794ep compareFalseFirst(boolean z2, boolean z3) {
        int i2;
        if (z2 == z3) {
            i2 = 0;
        } else {
            i2 = -1;
            if (z2) {
                i2 = 1;
            }
        }
        return classify(i2);
    }

    public C90794ep compareTrueFirst(boolean z2, boolean z3) {
        int i2;
        if (z3 == z2) {
            i2 = 0;
        } else {
            i2 = -1;
            if (z3) {
                i2 = 1;
            }
        }
        return classify(i2);
    }

    public int result() {
        return 0;
    }
}
