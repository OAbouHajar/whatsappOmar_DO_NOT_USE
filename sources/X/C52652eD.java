package X;

/* renamed from: X.2eD  reason: invalid class name and case insensitive filesystem */
public final class C52652eD extends C52642eC {
    public AnonymousClass01J A00;
    public AnonymousClass01J A01;
    public AnonymousClass01J A02;
    public AnonymousClass01J A03;
    public AnonymousClass01J A04;
    public final C49132Rg A05;
    public final AnonymousClass2YU A06;
    public final C16150sX A07;
    public final C52652eD A08 = this;

    public /* synthetic */ C52652eD(C49132Rg r7, AnonymousClass2YU r8, C16150sX r9) {
        C16150sX r3 = r9;
        this.A07 = r9;
        AnonymousClass2YU r2 = r8;
        this.A06 = r8;
        C49132Rg r1 = r7;
        this.A05 = r7;
        this.A00 = C17280up.A00(new AnonymousClass2TO(r1, r2, r3, this, 0));
        this.A01 = C17280up.A00(new AnonymousClass2TO(r1, r2, r3, this, 1));
        this.A02 = C17280up.A00(new AnonymousClass2TO(r1, r2, r3, this, 2));
        this.A03 = C17280up.A00(new AnonymousClass2TO(r1, r2, r3, this, 3));
        this.A04 = C17280up.A00(new AnonymousClass2TO(r1, r2, r3, this, 4));
    }

    public static C16150sX A00(Object obj) {
        return ((C52652eD) ((C52642eC) obj)).A07;
    }

    public final C52822eV A01() {
        C52802eT r3 = new C52802eT();
        C16150sX r1 = this.A07;
        return new C52822eV(r3, new C52812eU((C16980tz) r1.AQB.get(), (AnonymousClass013) r1.AR8.get()));
    }

    public final C52832eW A02() {
        return new C52832eW((C14710pd) this.A07.A05.get());
    }

    public final C52912ee A03() {
        C16150sX r2 = this.A07;
        C52842eX r6 = new C52842eX((C14870pt) r2.AB3.get());
        AnonymousClass1KA r1 = (AnonymousClass1KA) r2.A3a.get();
        C52862eZ r8 = new C52862eZ((C17170ue) r2.A3W.get(), r1, (C16460t6) r2.A5k.get());
        C52872ea r10 = new C52872ea();
        AnonymousClass01J r12 = r2.A05;
        r10.A01 = (C14710pd) r12.get();
        r10.A04 = (AnonymousClass1N2) r2.AHZ.get();
        r10.A00 = (AnonymousClass1ME) r2.AGk.get();
        r10.A03 = (C18090w8) r2.AI6.get();
        r10.A02 = (C227919h) r2.AH8.get();
        return new C52912ee(C17930vs.of(2, r6, 1, r8, 3, r10, 4, new C52882eb((C16300so) r2.A5p.get(), (C17090uW) r2.ADM.get(), (C14710pd) r12.get(), (C25321Ji) r2.AQy.get()), 5, new C52902ed(C16150sX.A0S(r2))));
    }

    public final AnonymousClass2TZ A04() {
        C16150sX r1 = this.A07;
        return new AnonymousClass2TZ((C14710pd) r1.A05.get(), this.A05.A0I(), (AnonymousClass15W) r1.AOC.get(), (AnonymousClass1BL) r1.AJE.get(), (C16320sq) r1.ARB.get());
    }
}
