package X;

import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape0S0301000_3_I1;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.5ey  reason: invalid class name and case insensitive filesystem */
public class C110875ey extends AnonymousClass01X {
    public int A00 = 0;
    public C35361lo A01;
    public final C209512f A02;
    public final C209712h A03;
    public final C1220468b A04;
    public final List A05 = AnonymousClass000.A0u();

    public C110875ey(C209512f r2, C209712h r3, C1220468b r4) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public int A0C() {
        return this.A05.size();
    }

    public void A0E(List list) {
        list.size();
        List list2 = this.A05;
        AnonymousClass07C A002 = AnonymousClass07B.A00(new C110805er(list2, list));
        list2.clear();
        list2.addAll(list);
        A002.A02(this);
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r8, int i2) {
        C111055fG r2 = (C111055fG) r8;
        C118275uQ r3 = (C118275uQ) this.A05.get(i2);
        r2.A07(r3);
        r2.A0H.setOnClickListener(new IDxCListenerShape0S0301000_3_I1(r2, r3, this, i2, 0));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C111055fG(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout027e), this.A02, this.A03);
    }
}
