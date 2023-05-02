package X;

import java.util.HashSet;

/* renamed from: X.0QI  reason: invalid class name */
public class AnonymousClass0QI {
    public final AnonymousClass024 A00;
    public final AnonymousClass0S3 A01;

    public AnonymousClass0QI(AnonymousClass024 r1, AnonymousClass0S3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass0S3 r2 = this.A01;
        AnonymousClass024 r0 = this.A00;
        HashSet hashSet = r2.A06;
        if (hashSet.remove(r0) && hashSet.isEmpty()) {
            r2.A00();
        }
    }

    public boolean A01() {
        AnonymousClass0S3 r1 = this.A01;
        C03890Kg A012 = C03890Kg.A01(r1.A04.A0A);
        C03890Kg r12 = r1.A01;
        if (A012 == r12) {
            return true;
        }
        C03890Kg r0 = C03890Kg.VISIBLE;
        return (A012 == r0 || r12 == r0) ? false : true;
    }
}
