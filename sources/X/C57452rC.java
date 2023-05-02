package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape7S0200000_I1_2;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2rC  reason: invalid class name and case insensitive filesystem */
public class C57452rC extends AnonymousClass01X {
    public final List A00 = AnonymousClass000.A0u();
    public final /* synthetic */ AnonymousClass3GM A01;

    public C57452rC(AnonymousClass3GM r2) {
        this.A01 = r2;
        A0B(true);
    }

    public int A0C() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r5, int i2) {
        AnonymousClass4SV r3 = (AnonymousClass4SV) this.A00.get(i2);
        ((C65073St) r5).A07(new ViewOnClickCListenerShape7S0200000_I1_2(this, 17, r3), r3, AnonymousClass000.A1R(this.A01.A00, r3.A00()));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        LayoutInflater A0G = C13680ns.A0G(viewGroup);
        return i2 == 0 ? new AnonymousClass356(A0G.inflate(R.layout.layout0085, viewGroup, false)) : new AnonymousClass355(A0G.inflate(R.layout.layout0582, viewGroup, false));
    }

    public int getItemViewType(int i2) {
        return this.A00.get(i2) instanceof C78423y1 ? 0 : 1;
    }
}
