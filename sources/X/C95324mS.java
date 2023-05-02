package X;

/* renamed from: X.4mS  reason: invalid class name and case insensitive filesystem */
public class C95324mS implements AnonymousClass04o {
    public boolean A00;
    public final C16760tb A01;
    public final C16820th A02;
    public final C15810rt A03;
    public final C15830rv A04;
    public final AnonymousClass23T A05;
    public final C25791Ld A06;

    public C95324mS(C16760tb r1, C16820th r2, C15810rt r3, C15830rv r4, AnonymousClass23T r5, C25791Ld r6, boolean z2) {
        this.A03 = r3;
        this.A01 = r1;
        this.A06 = r6;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = z2;
    }

    public C003401n A6s(Class cls) {
        if (cls.equals(C55782kM.class)) {
            C15810rt r3 = this.A03;
            return new C55782kM(this.A01, this.A02, r3, this.A04, this.A05, this.A06, this.A00);
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0g("Unknown class ", cls));
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
