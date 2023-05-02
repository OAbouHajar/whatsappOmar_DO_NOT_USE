package X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.components.Button;

/* renamed from: X.2yV  reason: invalid class name and case insensitive filesystem */
public class C59572yV extends C65013Sn {
    public final WaTextView A00;
    public final WaTextView A01;
    public final Button A02;

    public C59572yV(View view, CartFragment cartFragment) {
        super(view);
        this.A01 = C13680ns.A0S(view, R.id.total_quantity_textview);
        this.A00 = C13680ns.A0S(view, R.id.estimated_value_textview);
        Button button = (Button) C004601z.A0E(view, R.id.add_more_btn);
        this.A02 = button;
        if (cartFragment != null) {
            C34331k5.A04(button, this, cartFragment, 14);
        }
    }

    public void A07(AnonymousClass2W8 r7) {
        AnonymousClass2W9 r72 = (AnonymousClass2W9) r7;
        WaTextView waTextView = this.A01;
        Resources A0D = C13680ns.A0D(this.A0H);
        int i2 = r72.A00;
        Object[] A1b = C13680ns.A1b();
        boolean A1W = C13690nt.A1W(A1b, i2);
        C13700nu.A0M(A0D, waTextView, A1b, R.plurals.plurals011a, i2);
        boolean isEmpty = TextUtils.isEmpty(r72.A01);
        WaTextView waTextView2 = this.A00;
        if (isEmpty) {
            waTextView2.setVisibility(8);
        } else {
            waTextView2.setVisibility(A1W ? 1 : 0);
            waTextView2.setText(r72.A01);
        }
        boolean z2 = r72.A02;
        Button button = this.A02;
        if (z2) {
            button.setVisibility(A1W);
        } else {
            button.setVisibility(8);
        }
    }
}
