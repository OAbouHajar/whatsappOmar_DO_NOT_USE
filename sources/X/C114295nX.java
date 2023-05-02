package X;

import com.obwhatsapp.payments.ui.IndiaUpiChangePinActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5nX  reason: invalid class name and case insensitive filesystem */
public class C114295nX extends C16690tT {
    public final /* synthetic */ IndiaUpiChangePinActivity A00;

    public C114295nX(IndiaUpiChangePinActivity indiaUpiChangePinActivity) {
        this.A00 = indiaUpiChangePinActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return C110105dW.A0i(this.A00.A0P);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C30671cl r1;
        List list = (List) obj;
        if (list != null && list.size() == 1) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = this.A00;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = C110115dX.A0F(it);
                if (r1.A04() == 2) {
                    break;
                }
            }
            indiaUpiChangePinActivity.A02 = (C35521m4) r1;
        }
        IndiaUpiChangePinActivity indiaUpiChangePinActivity2 = this.A00;
        indiaUpiChangePinActivity2.A06.A02("pin-entry-ui");
        if (indiaUpiChangePinActivity2.A02 != null) {
            indiaUpiChangePinActivity2.A0A.A00();
            return;
        }
        indiaUpiChangePinActivity2.A05.A06("could not find bank account; showErrorAndFinish");
        indiaUpiChangePinActivity2.A3b();
    }
}
