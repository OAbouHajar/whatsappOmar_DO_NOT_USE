package com.obwhatsapp.wds.components.internal.header;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass44T;
import X.C13680ns;
import X.C18450wi;
import X.C52662eE;
import X.C54392hN;
import X.C796440r;
import X.C813547v;
import X.C89264br;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public final class WDSHeader extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context) {
        this(context, (AttributeSet) null);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18450wi.A0H(context, 1);
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.layout061d, this);
        this.A02 = (ImageView) C18450wi.A00(this, R.id.icon);
        this.A04 = (TextView) C18450wi.A00(this, R.id.headline);
        this.A03 = (TextView) C18450wi.A00(this, R.id.description);
    }

    public WDSHeader(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSHeader(Context context, AttributeSet attributeSet, int i2, C54392hN r5) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    private final void setSize(C796440r r5) {
        TextView textView;
        Resources resources;
        int i2;
        switch (r5.ordinal()) {
            case 0:
                textView = this.A04;
                resources = C13680ns.A0D(this);
                i2 = R.dimen.dimen088c;
                break;
            case 1:
                textView = this.A04;
                resources = C13680ns.A0D(this);
                i2 = R.dimen.dimen088b;
                break;
            default:
                return;
        }
        float dimension = resources.getDimension(i2);
        C18450wi.A0H(textView, 0);
        textView.setTextSize(0, dimension);
        TextView textView2 = this.A03;
        float dimension2 = C13680ns.A0D(this).getDimension(R.dimen.dimen085d);
        C18450wi.A0H(textView2, 0);
        textView2.setTextSize(0, dimension2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setDescriptionGravity(int i2) {
        this.A03.setGravity(i2);
    }

    public final void setHeaderImageMarginEnabled(boolean z2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ImageView imageView = this.A02;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = 0;
        int i3 = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
        int dimensionPixelOffset = z2 ? C13680ns.A0D(this).getDimensionPixelOffset(R.dimen.dimen08ae) : 0;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int i4 = (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams2.rightMargin;
        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        C813547v.A00(imageView, new C89264br(i3, dimensionPixelOffset, i4, i2));
    }

    public final void setViewState(AnonymousClass44T r2) {
        C18450wi.A0H(r2, 0);
        throw AnonymousClass000.A0W("getHeaderImage");
    }
}
