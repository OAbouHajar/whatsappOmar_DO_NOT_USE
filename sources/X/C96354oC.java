package X;

/* renamed from: X.4oC  reason: invalid class name and case insensitive filesystem */
public class C96354oC implements AnonymousClass5LD {
    public final AnonymousClass3UV A00;
    public final C96294o6 A01;
    public final C109765Tm[] A02;

    public C96354oC(C109765Tm... r6) {
        AnonymousClass3UV r4 = new AnonymousClass3UV();
        C96294o6 r3 = new C96294o6();
        int length = r6.length;
        C109765Tm[] r1 = new C109765Tm[(length + 2)];
        this.A02 = r1;
        System.arraycopy(r6, 0, r1, 0, length);
        this.A00 = r4;
        this.A01 = r3;
        r1[length] = r4;
        r1[length + 1] = r3;
    }
}
