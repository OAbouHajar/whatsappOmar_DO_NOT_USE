package X;

import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Gf  reason: invalid class name and case insensitive filesystem */
public class C63123Gf implements C19550yc {
    public final C14870pt A00;
    public final C83494Gx A01;
    public final C17120uZ A02;
    public final C17190ug A03;

    public C63123Gf(C14870pt r1, C83494Gx r2, C17120uZ r3, C17190ug r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00() {
        this.A00.Acq(new RunnableRunnableShape12S0200000_I1(this, 48, new AnonymousClass4DA((List) null)));
    }

    public void APb(String str) {
        Log.e("GetCustomUrlsByJidProtocol/onDeliveryFailure");
        A00();
    }

    public void AQe(C28371Vv r2, String str) {
        Log.e("GetCustomUrlsByJidProtocol/onError");
        C34451kH.A00(r2);
        A00();
    }

    public void AYG(C28371Vv r6, String str) {
        C28371Vv A0J;
        String A0L;
        Log.e("GetCustomUrlsByJidProtocol/onSuccess");
        C28371Vv A0J2 = r6.A0J("custom_urls");
        if (A0J2 != null) {
            List A0O = A0J2.A0O("custom_url");
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator it = A0O.iterator();
            while (it.hasNext()) {
                C28371Vv A0S = C13690nt.A0S(it);
                if (!(A0S == null || (A0J = A0S.A0J("path")) == null || (A0L = A0J.A0L()) == null || A0L.isEmpty())) {
                    A0u.add(A0L);
                }
            }
            this.A00.Acq(new RunnableRunnableShape12S0200000_I1(this, 48, new AnonymousClass4DA(A0u)));
            return;
        }
        A00();
    }
}
