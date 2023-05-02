package X;

import android.content.Context;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;

/* renamed from: X.4UK  reason: invalid class name */
public class AnonymousClass4UK {
    public final Context A00;
    public final WaImageButton A01;
    public final AnonymousClass013 A02;

    public AnonymousClass4UK(WaImageButton waImageButton, AnonymousClass013 r3) {
        this.A01 = waImageButton;
        this.A00 = waImageButton.getContext();
        this.A02 = r3;
    }

    public void A00(int i2) {
        if (i2 != 0) {
            WaImageButton waImageButton = this.A01;
            waImageButton.setImageResource(R.drawable.ic_done);
            C13680ns.A0t(this.A00, waImageButton, R.string.str072c);
            return;
        }
        WaImageButton waImageButton2 = this.A01;
        AnonymousClass013 r3 = this.A02;
        Context context = this.A00;
        waImageButton2.setImageDrawable(new C447725m(AnonymousClass00T.A04(context, R.drawable.input_send), r3));
        C13680ns.A0t(context, waImageButton2, R.string.str14e6);
    }

    public void A01(boolean z2) {
        int i2;
        int i3 = R.dimen.dimen0767;
        if (z2) {
            i3 = R.dimen.dimen0762;
        }
        Context context = this.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        WaImageButton waImageButton = this.A01;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(waImageButton);
        AnonymousClass013 r4 = this.A02;
        C45902Bo.A09(waImageButton, r4, A0O.leftMargin, A0O.topMargin, A0O.rightMargin, dimensionPixelSize);
        if (z2) {
            waImageButton.setImageDrawable(new C447725m(AnonymousClass00T.A04(context, R.drawable.input_send), r4));
            i2 = R.string.str14e6;
        } else {
            waImageButton.setImageResource(R.drawable.ic_done);
            i2 = R.string.str072c;
        }
        C13680ns.A0t(context, waImageButton, i2);
    }
}
