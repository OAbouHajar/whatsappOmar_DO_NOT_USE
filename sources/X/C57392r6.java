package X;

import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.2r6  reason: invalid class name and case insensitive filesystem */
public class C57392r6 extends AnonymousClass01X {
    public final C000900k A00;
    public final AnonymousClass3Pj A01;
    public final int[] A02;
    public final int[] A03;

    public C57392r6(C000900k r1, AnonymousClass3Pj r2, int[] iArr, int[] iArr2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = iArr;
        this.A03 = iArr2;
    }

    public int A0C() {
        return this.A02.length;
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r3, int i2) {
        C57762ri r32 = (C57762ri) r3;
        boolean A1R = AnonymousClass000.A1R(i2, AnonymousClass000.A0D(this.A01.A01.A01()));
        r32.A07(A1R, i2);
        r32.A01.setChecked(A1R);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C57762ri r2 = new C57762ri(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout02e2), this.A02, this.A03);
        this.A01.A01.A0A(this.A00, r2);
        C13680ns.A1C(r2.A00, this, r2, 31);
        return r2;
    }
}
