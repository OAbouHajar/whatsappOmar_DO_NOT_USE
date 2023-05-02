package X;

import com.whatsapp.util.IDxCListenerShape107S0100000_3_I1;
import java.util.Iterator;

/* renamed from: X.64Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64Y implements Runnable {
    public final /* synthetic */ IDxCListenerShape107S0100000_3_I1 A00;

    public /* synthetic */ AnonymousClass64Y(IDxCListenerShape107S0100000_3_I1 iDxCListenerShape107S0100000_3_I1) {
        this.A00 = iDxCListenerShape107S0100000_3_I1;
    }

    public final void run() {
        C30671cl r2;
        IDxCListenerShape107S0100000_3_I1 iDxCListenerShape107S0100000_3_I1 = this.A00;
        C112755jA r4 = (C112755jA) iDxCListenerShape107S0100000_3_I1.A00;
        Iterator it = C110105dW.A0i(r4.A04.A0C).iterator();
        while (true) {
            if (!it.hasNext()) {
                r2 = null;
                break;
            }
            r2 = C110115dX.A0F(it);
            if (r2.A03 == 2) {
                break;
            }
        }
        r4.A0A.A0K(new C1213765g(r2, iDxCListenerShape107S0100000_3_I1));
    }
}
