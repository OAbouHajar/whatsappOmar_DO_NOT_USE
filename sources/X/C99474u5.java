package X;

/* renamed from: X.4u5  reason: invalid class name and case insensitive filesystem */
public class C99474u5 implements AnonymousClass5OR {
    public boolean A8k(C89494cI r4, C89494cI r5, C84634Lh r6) {
        int compareTo;
        if ((r4 instanceof C70173gE) && (r5 instanceof C70173gE)) {
            compareTo = C70173gE.A00(r4, r5);
        } else if ((r4 instanceof C70133gA) && (r5 instanceof C70133gA)) {
            compareTo = C70133gA.A00(r4, r5);
        } else if (!(r4 instanceof C70143gB) || !(r5 instanceof C70143gB)) {
            return false;
        } else {
            compareTo = r4.A04().A07().compareTo(r5.A04().A07());
        }
        return compareTo <= 0;
    }
}
