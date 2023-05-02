package X;

/* renamed from: X.0ek  reason: invalid class name and case insensitive filesystem */
public class C09000ek implements AnonymousClass5OO {
    public final /* synthetic */ AnonymousClass0X5 A00;
    public final /* synthetic */ AnonymousClass5OO A01;

    public C09000ek(AnonymousClass0X5 r1, AnonymousClass5OO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AWG(AnonymousClass4Q1 r5) {
        AnonymousClass0X5 r3 = this.A00;
        if (r3.A0B.getAndSet(r5) != r5) {
            try {
                r3.A0A.set(r5.A00());
                r3.A09.set(r3.A07.now());
            } finally {
                this.A01.AWG(r5);
            }
        }
    }
}
