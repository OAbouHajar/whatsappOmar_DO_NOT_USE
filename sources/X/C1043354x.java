package X;

/* renamed from: X.54x  reason: invalid class name and case insensitive filesystem */
public final class C1043354x implements Comparable {
    public final boolean A00;
    public final boolean A01;

    public C1043354x(C32491gT r4, int i2) {
        this.A00 = (r4.A0G & 1) == 0 ? false : true;
        this.A01 = (i2 & 7) != 4 ? false : true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C1043354x r4 = (C1043354x) obj;
        return C90794ep.start().compareFalseFirst(this.A01, r4.A01).compareFalseFirst(this.A00, r4.A00).result();
    }
}
