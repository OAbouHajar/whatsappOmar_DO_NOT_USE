package com.obwhatsapp.businessdirectory.view.custom;

import X.AnonymousClass4PG;
import X.C13680ns;
import X.C18450wi;
import X.C54392hN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.R;

public final class DirectoryProductImagesCardView extends CardView {
    public ShimmerFrameLayout A00;
    public final LinearLayout A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C18450wi.A0H(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, linearLayout.getResources().getDimensionPixelSize(R.dimen.dimen02ee)));
        this.A01 = linearLayout;
        addView(linearLayout);
        setPreventCornerOverlap(false);
        setRadius(getResources().getDimension(R.dimen.dimen0656));
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i2, int i3, C54392hN r6) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public final void A00(boolean z2) {
        LinearLayout linearLayout = this.A01;
        linearLayout.removeAllViews();
        LayoutInflater A0G = C13680ns.A0G(this);
        C18450wi.A0B(A0G);
        View inflate = A0G.inflate(R.layout.layout00c9, this, false);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        if (z2) {
            View findViewById = shimmerFrameLayout.findViewById(R.id.product_empty_view);
            C18450wi.A0B(findViewById);
            findViewById.setVisibility(0);
            shimmerFrameLayout.A04((AnonymousClass4PG) null);
        }
        this.A00 = shimmerFrameLayout;
        linearLayout.addView(shimmerFrameLayout);
    }

    public final LinearLayout getImagesContainerView() {
        return this.A01;
    }
}
