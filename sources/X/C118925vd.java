package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.5vd  reason: invalid class name and case insensitive filesystem */
public class C118925vd {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public final int A03;
    public final C112885jv A04;

    public C118925vd(C112885jv r2) {
        this.A04 = r2;
        this.A03 = AnonymousClass00T.A00(r2, r2 instanceof BrazilPaymentCardDetailsActivity ? R.color.color0226 : R.color.color070f);
    }

    public void A00(C30671cl r6) {
        C39891tE r0;
        C39891tE r3;
        if (this instanceof C112755jA) {
            C112755jA r4 = (C112755jA) this;
            boolean A1R = AnonymousClass000.A1R(r6.A01, 2);
            WaTextView waTextView = r4.A06;
            int i2 = R.string.str0ef6;
            if (A1R) {
                i2 = R.string.str0ef7;
            }
            waTextView.setText(i2);
            WaTextView waTextView2 = r4.A06;
            if (A1R) {
                int i3 = r4.A09;
            } else {
                int i4 = r4.A08;
            }
            ImageView imageView = r4.A04;
            int i5 = R.drawable.ic_group;
            if (A1R) {
                i5 = R.drawable.vec_ic_check_circle_24dp;
            }
            imageView.setImageResource(i5);
            AnonymousClass2SR.A08(imageView, A1R ? r4.A07 : r4.A03);
            ViewGroup viewGroup = r4.A02;
            C34331k5 r02 = r4.A0D;
            if (A1R) {
                viewGroup.setOnClickListener((View.OnClickListener) null);
                viewGroup.setBackground((Drawable) null);
            } else {
                viewGroup.setOnClickListener(r02);
                C55352jN.A00(viewGroup);
            }
            boolean A1R2 = AnonymousClass000.A1R(r6.A03, 2);
            WaTextView waTextView3 = r4.A05;
            int i6 = R.string.str0eef;
            if (A1R2) {
                i6 = R.string.str0ef0;
            }
            waTextView3.setText(i6);
            WaTextView waTextView4 = r4.A05;
            if (A1R2) {
                int i7 = r4.A09;
            } else {
                int i8 = r4.A08;
            }
            ImageView imageView2 = r4.A03;
            int i9 = R.drawable.ic_shopping_cart;
            if (A1R2) {
                i9 = R.drawable.vec_ic_check_circle_24dp;
            }
            imageView2.setImageResource(i9);
            AnonymousClass2SR.A08(imageView2, A1R2 ? r4.A07 : r4.A03);
            ViewGroup viewGroup2 = r4.A01;
            C34331k5 r03 = r4.A0C;
            if (A1R2) {
                viewGroup2.setOnClickListener((View.OnClickListener) null);
                viewGroup2.setBackground((Drawable) null);
            } else {
                viewGroup2.setOnClickListener(r03);
                C55352jN.A00(viewGroup2);
            }
            if (C119405xi.A09(r6) && (r3 = (C39891tE) r6.A08) != null) {
                int i10 = 0;
                r4.A02.setVisibility(C13680ns.A02(r3.A0X ? 1 : 0));
                ViewGroup viewGroup3 = r4.A01;
                if (!r3.A0T) {
                    i10 = 8;
                }
                viewGroup3.setVisibility(i10);
                return;
            }
            return;
        }
        AnonymousClass2SR.A08(this.A01, this.A03);
        boolean A1R3 = AnonymousClass000.A1R(r6.A01, 2);
        ImageView imageView3 = this.A01;
        int i11 = R.drawable.ic_settings_unstarred;
        if (A1R3) {
            i11 = R.drawable.ic_settings_starred;
        }
        imageView3.setImageResource(i11);
        TextView textView = this.A02;
        int i12 = R.string.str0665;
        if (A1R3) {
            i12 = R.string.str0664;
        }
        textView.setText(i12);
        this.A00.setOnClickListener(!A1R3 ? this.A04 : null);
        if (C119405xi.A09(r6) && (r0 = (C39891tE) r6.A08) != null && !r0.A0X) {
            this.A00.setVisibility(8);
        }
    }
}
