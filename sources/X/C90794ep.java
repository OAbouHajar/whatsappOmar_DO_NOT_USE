package X;

import java.util.Comparator;

/* renamed from: X.4ep  reason: invalid class name and case insensitive filesystem */
public abstract class C90794ep {
    public static final C90794ep ACTIVE = new C67753cK();
    public static final C90794ep GREATER = new C67743cJ(1);
    public static final C90794ep LESS = new C67743cJ(-1);

    public C90794ep() {
    }

    public /* synthetic */ C90794ep(C67753cK r2) {
        this();
    }

    public static C90794ep start() {
        return ACTIVE;
    }

    public abstract C90794ep compare(int i2, int i3);

    public abstract C90794ep compare(Object obj, Object obj2, Comparator comparator);

    public abstract C90794ep compareFalseFirst(boolean z2, boolean z3);

    public abstract C90794ep compareTrueFirst(boolean z2, boolean z3);

    public abstract int result();
}
