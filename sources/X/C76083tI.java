package X;

import android.app.Activity;
import android.view.View;
import com.facebook.redex.ViewOnClickCListenerShape2S0500000_I1;
import com.obwhatsapp.R;

/* renamed from: X.3tI  reason: invalid class name and case insensitive filesystem */
public class C76083tI extends C55982kl {
    public C76083tI(Activity activity, View view, AnonymousClass1L3 r11, AnonymousClass1L4 r12, C17750va r13, C17800vf r14) {
        super(view);
        View A0E = C004601z.A0E(view, R.id.empty_community_row_button);
        AnonymousClass1UP.A06(C13680ns.A0L(view, R.id.empty_community_row_title));
        A0E.setOnClickListener(new ViewOnClickCListenerShape2S0500000_I1(activity, r11, r12, r13, r14));
    }
}
