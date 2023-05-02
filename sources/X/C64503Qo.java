package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.3Qo  reason: invalid class name and case insensitive filesystem */
public final class C64503Qo extends AnonymousClass01W {
    public final AnonymousClass22J A00;

    public C64503Qo(AnonymousClass22J r2) {
        super(AnonymousClass49I.A00);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r3, int i2) {
        C65003Sm r32 = (C65003Sm) r3;
        C18450wi.A0H(r32, 0);
        C807845n r1 = (C807845n) A0E(i2);
        C18450wi.A09(r1);
        r32.A07(r1, new AnonymousClass5F8(this));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        int i3 = R.layout.layout0365;
        if (i2 == 0) {
            i3 = R.layout.layout0366;
        }
        View inflate = C13680ns.A0G(viewGroup).inflate(i3, viewGroup, false);
        if (i2 == 0) {
            C18450wi.A0B(inflate);
            return new C59342x6(inflate);
        }
        C18450wi.A0B(inflate);
        return new C70793hk(inflate);
    }

    public int getItemViewType(int i2) {
        Object A0E = A0E(i2);
        if (A0E instanceof C70823hn) {
            return 0;
        }
        if (A0E instanceof C70833ho) {
            return 1;
        }
        throw new AnonymousClass2Xe();
    }
}
