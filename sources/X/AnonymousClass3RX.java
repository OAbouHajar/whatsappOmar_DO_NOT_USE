package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.3RX  reason: invalid class name */
public class AnonymousClass3RX extends C005602k {
    public AnonymousClass3RX(View.OnClickListener onClickListener, View view, C19980zJ r14, C14870pt r15, AnonymousClass01V r16, C17220uj r17, String str, int i2) {
        super(view);
        C004601z.A0E(view, R.id.cancel_warning_button).setOnClickListener(onClickListener);
        Context context = view.getContext();
        C45922Bq.A08(context, r17.A04(str), r14, r15, C13680ns.A0Q(view, R.id.warning_text), r16, C13680ns.A0d(context, "learn-more", C13680ns.A1b(), 0, i2));
    }
}
