package X;

import java.util.List;

/* renamed from: X.3xz  reason: invalid class name and case insensitive filesystem */
public class C78403xz extends C38401qj {
    public final AnonymousClass027 A00;
    public final AnonymousClass027 A01;
    public final AnonymousClass027 A02;
    public final C26211Mt A03;
    public final AnonymousClass1CX A04;

    public C78403xz(AnonymousClass027 r1, AnonymousClass027 r2, AnonymousClass027 r3, C26211Mt r4, AnonymousClass1CX r5) {
        super(r5);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public void A09() {
        this.A00.A0B(new AnonymousClass2VE((List) null));
    }

    public Void A0B(Void... voidArr) {
        this.A03.A05();
        this.A01.A09(Boolean.TRUE);
        if (C16690tT.A02(this)) {
            return null;
        }
        this.A00.A09(new AnonymousClass2VE(this.A04.A09(0)));
        C13680ns.A1P(this.A02, 1);
        return super.A08(voidArr);
    }
}
