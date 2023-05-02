package com.obwhatsapp.community;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass08E;
import X.AnonymousClass2Ao;
import X.AnonymousClass4BW;
import X.C004601z;
import X.C13680ns;
import X.C16010sH;
import X.C16150sX;
import X.C17160ud;
import X.C447725m;
import X.C45902Bo;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.IDxPDisplayerShape106S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;

public class SubgroupPileView extends LinearLayout implements AnonymousClass006 {
    public ImageView A00;
    public ThumbnailButton A01;
    public C17160ud A02;
    public AnonymousClass013 A03;
    public C52662eE A04;
    public boolean A05;

    public SubgroupPileView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SubgroupPileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubgroupPileView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A05) {
            this.A05 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A03 = C16150sX.A0Z(A002);
            this.A02 = C16150sX.A0L(A002);
        }
        LayoutInflater.from(context).inflate(R.layout.layout05a0, this, true);
        setGravity(1);
        this.A01 = (ThumbnailButton) C004601z.A0E(this, R.id.subgroup_pile_top_profile_photo);
        this.A00 = C13680ns.A0J(this, R.id.subgroup_pile_bottom_cresents);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4BW.A0G);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelSize(R.dimen.dimen076c));
            obtainStyledAttributes.recycle();
            this.A00.setLayoutParams(new LinearLayout.LayoutParams(-2, dimensionPixelSize));
            this.A01.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        }
    }

    private void setBottomCirclesDrawable(int i2) {
        Context context = getContext();
        AnonymousClass013 r3 = this.A03;
        C447725m r0 = new C447725m(AnonymousClass08E.A01(context, i2), r3);
        ImageView imageView = this.A00;
        imageView.setImageDrawable(r0);
        C45902Bo.A07(imageView, r3, 0, getResources().getDimensionPixelSize(R.dimen.dimen07c7));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public View getTransitionView() {
        return this.A01;
    }

    public void setSubgroupProfilePhoto(C16010sH r4, int i2, boolean z2, AnonymousClass2Ao r7) {
        int i3;
        r7.A03(this.A01, new IDxPDisplayerShape106S0200000_2_I1(this, 1, r4), r4, false);
        if (z2) {
            i3 = R.drawable.vec_ic_subgroup_bottom_cresents_toolbar;
            if (i2 == 3) {
                i3 = R.drawable.vec_ic_subgroup_bottom_cresents_cag_toolbar;
            }
        } else {
            i3 = R.drawable.vec_ic_subgroup_bottom_cresents;
            if (i2 == 3) {
                i3 = R.drawable.vec_ic_subgroup_bottom_cresents_cag;
            }
        }
        setBottomCirclesDrawable(i3);
    }
}
