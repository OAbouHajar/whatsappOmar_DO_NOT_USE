package X;

/* renamed from: X.4uN  reason: invalid class name and case insensitive filesystem */
public class C99654uN implements AnonymousClass5OT {
    public final AnonymousClass4RV A00;
    public final AnonymousClass4TN A01;
    public final Object A02;
    public final String A03;

    public C99654uN(AnonymousClass4RV r2, AnonymousClass4TN r3, Object obj) {
        this.A01 = r3;
        this.A03 = obj.toString();
        this.A00 = r2;
        this.A02 = r3.A00(r2, obj, obj).A00();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C99654uN r5 = (C99654uN) obj;
            if (!AnonymousClass09S.A00(this.A01, r5.A01) || !this.A03.equals(r5.A03) || !AnonymousClass09S.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public Object get() {
        return this.A02;
    }
}
