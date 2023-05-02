package X;

import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.5li  reason: invalid class name and case insensitive filesystem */
public class C113235li extends C111025fD {
    public final LinearLayout A00;
    public final LinearLayout A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final AnonymousClass013 A05;
    public final C18090w8 A06;

    public C113235li(View view, AnonymousClass013 r3, C18090w8 r4) {
        super(view);
        this.A05 = r3;
        this.A06 = r4;
        this.A01 = C110115dX.A05(view, R.id.payment_details);
        this.A00 = C110115dX.A05(view, R.id.message_biz);
        this.A02 = C13690nt.A0R(view, R.id.payment_currency_symbol_icon);
        this.A04 = C13680ns.A0S(view, R.id.payment_details_status);
        this.A03 = C13680ns.A0S(view, R.id.message_biz_title);
    }
}
