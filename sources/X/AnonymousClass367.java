package X;

import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.367  reason: invalid class name */
public class AnonymousClass367 extends C16690tT {
    public final /* synthetic */ C001000l A00;
    public final /* synthetic */ AnonymousClass1WD A01;
    public final /* synthetic */ C25721Kw A02;

    public AnonymousClass367(C001000l r1, AnonymousClass1WD r2, C25721Kw r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return Boolean.valueOf(C13700nu.A0i(this.A02.A04.A07()));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Boolean bool = (Boolean) obj;
        C001000l r5 = this.A00;
        if (AnonymousClass29T.A03(r5)) {
            return;
        }
        if (!bool.booleanValue()) {
            this.A01.A02(Boolean.FALSE);
            return;
        }
        boolean A05 = this.A02.A01.A05(C15910s6.A0X);
        int i2 = R.layout.layout022a;
        if (A05) {
            i2 = R.layout.layout0229;
        }
        AnonymousClass2T3 r4 = new AnonymousClass2T3();
        r4.A02 = i2;
        r4.A05 = R.string.str0695;
        r4.A0B = new Object[0];
        r4.A01(new IDxCListenerShape29S0200000_2_I1(this.A01, 34, this), R.string.str0693);
        C13680ns.A1J(r4.A00(), r5);
    }
}
