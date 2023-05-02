package X;

import android.graphics.Path;

/* renamed from: X.0dn  reason: invalid class name and case insensitive filesystem */
public class C08530dn implements C12660kl {
    public final Path.FillType A00;
    public final AnonymousClass0HO A01;
    public final AnonymousClass0HU A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C08530dn(Path.FillType fillType, AnonymousClass0HO r2, AnonymousClass0HU r3, String str, boolean z2, boolean z3) {
        this.A03 = str;
        this.A04 = z2;
        this.A00 = fillType;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = z3;
    }

    public C13150lY Agn(AnonymousClass0Ak r2, C08360dV r3) {
        return new C08340dT(r2, this, r3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ShapeFill{color=, fillEnabled=");
        A0r.append(this.A04);
        return AnonymousClass000.A0k(A0r);
    }
}
