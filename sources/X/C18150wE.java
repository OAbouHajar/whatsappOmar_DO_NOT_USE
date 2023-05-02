package X;

/* renamed from: X.0wE  reason: invalid class name and case insensitive filesystem */
public class C18150wE {
    public AnonymousClass4KD A00;
    public C84774Lv A01;
    public C57262qa A02;
    public AnonymousClass32K A03;
    public final C18130wC A04;
    public final C18140wD A05;
    public final C18110wA A06;
    public final C18120wB A07;

    public C18150wE(C18130wC r1, C18140wD r2, C18110wA r3, C18120wB r4) {
        this.A06 = r3;
        this.A07 = r4;
        this.A04 = r1;
        this.A05 = r2;
    }

    public void A00() {
        AnonymousClass32K r0 = this.A03;
        if (r0 != null && r0.A06.A03() != 2 && !this.A03.A06.A02.isCancelled()) {
            this.A03.A06.A06(true);
            this.A03 = null;
        }
    }

    public void A01(C73553oL r14, AnonymousClass4VT r15) {
        A00();
        C18140wD r1 = this.A05;
        C25551Kf r9 = this.A06.A00;
        C62873Fg r8 = new C62873Fg(this);
        C16150sX r12 = r1.A00.A01;
        AnonymousClass013 r6 = (AnonymousClass013) r12.AR8.get();
        C16670tR A072 = C16150sX.A07(r12);
        C17120uZ r5 = (C17120uZ) r12.AQT.get();
        C25631Kn r11 = (C25631Kn) r12.A5m.get();
        C73553oL r4 = r14;
        AnonymousClass33K r13 = new AnonymousClass33K((C16300so) r12.A5p.get(), A072, r4, r5, r6, (C14710pd) r12.A05.get(), r8, r9, r15, r11, (C16320sq) r12.ARB.get());
        r13.A04();
        this.A03 = r13;
    }
}
