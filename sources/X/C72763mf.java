package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3mf  reason: invalid class name and case insensitive filesystem */
public class C72763mf extends C72663mV {
    public C72763mf(View view) {
        super(view);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        int i2;
        C72313lv r6 = (C72313lv) obj;
        View view = this.A0H;
        C34331k5.A04(view, this, r6, 19);
        C34331k5.A04(this.A00, this, r6, 20);
        this.A01.setImageDrawable(AnonymousClass2SR.A01(view.getContext(), R.drawable.ic_location_nearby));
        this.A03.setText(R.string.str021d);
        boolean z2 = r6.A00;
        WaTextView waTextView = this.A02;
        if (z2) {
            waTextView.setText(R.string.str021e);
            i2 = 0;
            waTextView.setVisibility(0);
            this.A00.setImageDrawable(AnonymousClass2SR.A01(view.getContext(), R.drawable.ic_action_info));
        } else {
            i2 = 8;
            waTextView.setVisibility(8);
        }
        this.A00.setVisibility(i2);
    }
}
