package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxDListenerShape159S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.464  reason: invalid class name */
public class AnonymousClass464 {
    public static void A00(C001000l r5, C18890xQ r6) {
        C32241fu A00 = C32241fu.A00(r5);
        View inflate = View.inflate(r5, R.layout.layout022e, (ViewGroup) null);
        View A0E = C004601z.A0E(inflate, R.id.not_now_btn);
        C13680ns.A1B(C004601z.A0E(inflate, R.id.update_btn), r5, r6, 12);
        C13680ns.A18(A0E, r5, 0);
        A00.A0C(new IDxDListenerShape159S0100000_2_I1(r5, 0));
        A00.setView(inflate);
        A00.A00();
    }
}
