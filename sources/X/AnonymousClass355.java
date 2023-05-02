package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

/* renamed from: X.355  reason: invalid class name */
public final class AnonymousClass355 extends C65073St {
    public final View A00;
    public final WaImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass355(View view) {
        super(view);
        C18450wi.A0H(view, 1);
        View view2 = this.A0H;
        this.A00 = C18450wi.A00(view2, R.id.sel_marker);
        this.A01 = (WaImageView) C18450wi.A00(view2, R.id.icon);
    }

    public void A07(View.OnClickListener onClickListener, AnonymousClass4SV r6, boolean z2) {
        if (r6 instanceof C78433y2) {
            WaImageView waImageView = this.A01;
            C78433y2 r62 = (C78433y2) r6;
            C13680ns.A1D(waImageView, r62.A00, z2);
            waImageView.setOnClickListener(onClickListener);
            View view = this.A00;
            Context context = view.getContext();
            int i2 = R.color.color0792;
            if (z2) {
                i2 = R.color.color061d;
            }
            C13680ns.A0u(context, view, i2);
            waImageView.setContentDescription(r62.A02);
            return;
        }
        throw AnonymousClass000.A0T("item should be AvocadoHeaderIconItem");
    }
}
