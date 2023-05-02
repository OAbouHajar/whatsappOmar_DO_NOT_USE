package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.4Rq  reason: invalid class name and case insensitive filesystem */
public class C86194Rq {
    public final int A00;
    public final int A01;
    public final Button A02;
    public final TextView A03;
    public final AnonymousClass013 A04;

    public C86194Rq(Activity activity, AnonymousClass013 r4, int i2, int i3, int i4, int i5) {
        this.A04 = r4;
        this.A01 = i4;
        this.A00 = i5;
        Button button = (Button) activity.findViewById(i2);
        this.A02 = button;
        this.A03 = (TextView) activity.findViewById(i3);
        button.setAllCaps(false);
        A00(true);
    }

    public void A00(boolean z2) {
        Button button = this.A02;
        button.setEnabled(z2);
        if (z2) {
            this.A03.setVisibility(8);
        }
        Drawable A042 = AnonymousClass00T.A04(button.getContext(), z2 ? this.A01 : this.A00);
        AnonymousClass00B.A06(A042);
        Context context = button.getContext();
        int i2 = R.color.color07c3;
        if (z2) {
            i2 = R.color.color07c6;
        }
        Drawable A06 = AnonymousClass2SR.A06(A042, AnonymousClass00T.A00(context, i2));
        if (C13680ns.A1Z(this.A04)) {
            button.setCompoundDrawablesWithIntrinsicBounds(A06, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A06, (Drawable) null);
        }
    }
}
