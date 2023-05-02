package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.obwhatsapp.R;

/* renamed from: X.2ox  reason: invalid class name and case insensitive filesystem */
public class C56882ox extends LinearLayout {
    public C798641q A00;
    public final ImageView A01;
    public final ImageView A02;
    public final Space A03;

    public C56882ox(Context context) {
        super(context, (AttributeSet) null, 0);
        View inflate = LinearLayout.inflate(getContext(), R.layout.layout0025, this);
        this.A02 = C13680ns.A0J(inflate, R.id.rate_button);
        this.A01 = C13680ns.A0J(inflate, R.id.action_button);
        this.A03 = (Space) C004601z.A0E(inflate, R.id.space);
    }

    public final void A00() {
        Space space;
        int i2;
        if (this.A02.getVisibility() == 0 && this.A01.getVisibility() == 0) {
            space = this.A03;
            i2 = 0;
        } else {
            space = this.A03;
            i2 = 8;
        }
        space.setVisibility(i2);
    }

    public ImageView getActionButton() {
        return this.A01;
    }

    public ImageView getRateButton() {
        return this.A02;
    }

    public void setupActionButton(C798641q r6, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        int i2;
        Drawable drawable;
        int i3;
        this.A00 = r6;
        ImageView imageView = this.A01;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(onLongClickListener);
        switch (r6.ordinal()) {
            case 0:
                i2 = R.string.str0028;
                drawable = AnonymousClass2SR.A02(getContext(), R.drawable.ic_offline_info, R.color.color0675);
                i3 = R.dimen.dimen0534;
                break;
            case 1:
                i2 = R.string.str0098;
                drawable = AnonymousClass2SR.A02(getContext(), R.drawable.ic_search_normal, R.color.color090b);
                i3 = R.dimen.dimen06aa;
                break;
            case 2:
                i2 = R.string.str0912;
                drawable = C13690nt.A0C(getContext(), R.drawable.ic_action_forward);
                i3 = R.dimen.dimen03ee;
                break;
            case 3:
                i2 = R.string.str0029;
                drawable = AnonymousClass2SR.A02(getContext(), R.drawable.ic_action_avatar, R.color.color0675);
                i3 = R.dimen.dimen0094;
                break;
            default:
                imageView.setVisibility(8);
                break;
        }
        C13680ns.A0t(getContext(), imageView, i2);
        imageView.setImageDrawable(drawable);
        int dimensionPixelSize = C13680ns.A0D(this).getDimensionPixelSize(i3);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        A00();
    }

    public void setupRateButton(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        ImageView imageView = this.A02;
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(onLongClickListener);
        imageView.setVisibility(0);
        A00();
    }
}
