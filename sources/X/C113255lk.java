package X;

import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.5lk  reason: invalid class name and case insensitive filesystem */
public class C113255lk extends C111025fD {
    public final View A00;
    public final View A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final WaTextView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;

    public C113255lk(View view) {
        super(view);
        this.A06 = C13680ns.A0S(view, R.id.subtotal_key);
        this.A07 = C13680ns.A0S(view, R.id.subtotal_amount);
        this.A08 = C13680ns.A0S(view, R.id.taxes_key);
        this.A09 = C13680ns.A0S(view, R.id.taxes_amount);
        this.A02 = C13680ns.A0S(view, R.id.discount_key);
        this.A03 = C13680ns.A0S(view, R.id.discount_amount);
        this.A04 = C13680ns.A0S(view, R.id.shipping_key);
        this.A05 = C13680ns.A0S(view, R.id.shipping_amount);
        this.A0B = C13680ns.A0S(view, R.id.total_charge_key);
        this.A0A = C13680ns.A0S(view, R.id.total_charge_amount);
        this.A01 = C004601z.A0E(view, R.id.dashed_underline2);
        this.A00 = C004601z.A0E(view, R.id.dashed_underline3);
    }

    public final void A08(int i2) {
        this.A01.setVisibility(i2);
        WaTextView waTextView = this.A06;
        waTextView.setVisibility(i2);
        waTextView.setVisibility(i2);
        this.A08.setVisibility(i2);
        this.A09.setVisibility(i2);
        this.A02.setVisibility(i2);
        this.A03.setVisibility(i2);
        this.A04.setVisibility(i2);
        this.A05.setVisibility(i2);
    }

    public final void A09(WaTextView waTextView, WaTextView waTextView2, AnonymousClass013 r7, String str, String str2, int i2) {
        StringBuilder A0q;
        if (TextUtils.isEmpty(str2)) {
            waTextView.setVisibility(8);
            waTextView2.setVisibility(8);
            return;
        }
        String string = this.A0H.getContext().getString(i2);
        if (!TextUtils.isEmpty(str)) {
            if (!r7.A0T()) {
                A0q = AnonymousClass000.A0q(string);
                A0q.append(" (");
                A0q.append(str);
                A0q.append(") ");
            } else {
                A0q = AnonymousClass000.A0q(" (");
                A0q.append(str);
                A0q.append(") ");
                A0q.append(string);
            }
            string = A0q.toString();
        }
        waTextView.setText(string);
        waTextView.setVisibility(0);
        waTextView2.setText(str2);
        waTextView2.setVisibility(0);
        int i3 = 5;
        int i4 = 3;
        if (r7.A0T()) {
            i4 = 5;
        }
        waTextView.setGravity(i4);
        if (r7.A0T()) {
            i3 = 3;
        }
        waTextView2.setGravity(i3);
    }
}
