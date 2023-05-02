package X;

import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3Sn  reason: invalid class name and case insensitive filesystem */
public abstract class C65013Sn extends C005602k {
    public C65013Sn(View view) {
        super(view);
    }

    public void A07(AnonymousClass2W8 r6) {
        WaTextView waTextView;
        String str;
        if (this instanceof C71373kG) {
            waTextView = ((C71373kG) this).A00;
            str = ((C71343kD) r6).A00;
        } else {
            C71383kH r4 = (C71383kH) this;
            if (r6 instanceof C71363kF) {
                C71363kF r62 = (C71363kF) r6;
                boolean isEmpty = TextUtils.isEmpty(r62.A00);
                WaTextView waTextView2 = r4.A01;
                if (isEmpty) {
                    waTextView2.setVisibility(8);
                    r4.A00.setVisibility(8);
                } else {
                    waTextView2.setVisibility(0);
                    WaTextView waTextView3 = r4.A00;
                    waTextView3.setVisibility(0);
                    waTextView3.setText(r62.A00);
                }
                boolean isEmpty2 = TextUtils.isEmpty(r62.A01);
                WaTextView waTextView4 = r4.A03;
                if (isEmpty2) {
                    waTextView4.setVisibility(8);
                    r4.A02.setVisibility(8);
                    return;
                }
                waTextView4.setVisibility(0);
                waTextView = r4.A02;
                waTextView.setVisibility(0);
                str = r62.A01;
            } else {
                return;
            }
        }
        waTextView.setText(str);
    }
}
