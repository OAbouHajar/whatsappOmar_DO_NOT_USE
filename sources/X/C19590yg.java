package X;

/* renamed from: X.0yg  reason: invalid class name and case insensitive filesystem */
public class C19590yg extends C16590tJ {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C15480r5 A02;
    public final C19710ys A03;
    public final AnonymousClass1RE A04;
    public final AnonymousClass11T A05;
    public final AnonymousClass1SS A06;
    public final AnonymousClass11R A07;
    public final C15860rz A08;
    public final C14710pd A09;
    public final AnonymousClass1KP A0A;

    public C19590yg(C14870pt r1, C16040sK r2, C15480r5 r3, C19710ys r4, AnonymousClass1RE r5, AnonymousClass11T r6, AnonymousClass1SS r7, AnonymousClass11R r8, C15860rz r9, C14710pd r10, AnonymousClass1KP r11) {
        this.A00 = r1;
        this.A09 = r10;
        this.A01 = r2;
        this.A08 = r9;
        this.A04 = r5;
        this.A0A = r11;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r4;
    }

    public boolean A04() {
        C14710pd r3 = this.A09;
        C16620tM r2 = C16620tM.A02;
        return r3.A0E(r2, 2380) || (r3.A0E(r2, 1500) && this.A06.A00() != C47132Hs.A01 && !r3.A0E(r2, 1761));
    }

    public boolean A05() {
        return this.A01.A0G() && !this.A09.A0E(C16620tM.A02, 1978);
    }

    public boolean A06() {
        return !this.A07.A00().getBoolean("previously_logged_out_from_primary", false) && !this.A04.A01() && this.A06.A00() != C47132Hs.A01;
    }
}
