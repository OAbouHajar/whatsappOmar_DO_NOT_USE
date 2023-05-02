package X;

import android.view.ViewGroup;
import com.facebook.redex.IDxICallbackShape4S0000000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3Qr  reason: invalid class name and case insensitive filesystem */
public class C64533Qr extends AnonymousClass01W {
    public Map A00 = AnonymousClass000.A0x();

    public C64533Qr() {
        super(new AnonymousClass0US(new IDxICallbackShape4S0000000_2_I1(2)).A00());
    }

    public static C65063Ss A00(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new AnonymousClass3pZ(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout016a));
        }
        if (i2 == 2) {
            return new C74003pa(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0168));
        }
        if (i2 == 3) {
            return new C65063Ss(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0167));
        }
        String A0c = C13680ns.A0c(i2, "ItemAdapter/onCreateViewHolder type not handled - ");
        Log.e(A0c);
        throw AnonymousClass000.A0V(A0c);
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        ((C65063Ss) r2).A07((C86394Sn) A0E(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return A00(viewGroup, i2);
    }

    public int getItemViewType(int i2) {
        return ((C86394Sn) A0E(i2)).A00;
    }
}
