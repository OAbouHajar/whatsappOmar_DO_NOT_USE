package com.obwhatsapp.chatinfo.view.custom;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.C004601z;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.obwhatsapp.R;

public class CollapsingProfilePhotoView extends FrameLayout implements AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ImageView A07;
    public ImageView A08;
    public AnonymousClass013 A09;
    public C52662eE A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;

    public CollapsingProfilePhotoView(Context context) {
        super(context);
        A00();
        this.A04 = -1;
        this.A00 = -1.0f;
        this.A05 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A0C = true;
        this.A0E = getResources().getDimensionPixelSize(R.dimen.dimen0767);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = false;
        A02(context);
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A04 = -1;
        this.A00 = -1.0f;
        this.A05 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A0C = true;
        this.A0E = getResources().getDimensionPixelSize(R.dimen.dimen0767);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = false;
        A02(context);
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A04 = -1;
        this.A00 = -1.0f;
        this.A05 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A0C = true;
        this.A0E = getResources().getDimensionPixelSize(R.dimen.dimen0767);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = false;
        A02(context);
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A0D) {
            this.A0D = true;
            this.A09 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public void A01(int i2, int i3) {
        if (i2 != -1 && i3 != -1) {
            this.A06 = i2;
            this.A01 = i3;
            if (this.A02 != 0) {
                int i4 = (i2 - i3) >> 1;
                if (!(!this.A09.A0T())) {
                    i2 = (this.A02 - i3) - ((int) this.A00);
                }
                this.A04 = i2 - i4;
            }
        }
    }

    public final void A02(Context context) {
        FrameLayout.inflate(context, R.layout.layout010a, this);
        this.A08 = (ImageView) C004601z.A0E(this, R.id.wds_profile_picture);
        this.A07 = (ImageView) C004601z.A0E(this, R.id.profile_photo_halo);
        this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 9));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public ImageView getProfileImage() {
        return this.A08;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (!this.A0B) {
            int left = this.A08.getLeft();
            this.A05 = left;
            this.A03 = left;
        }
    }

    public void setAnimationValue(float f2) {
        if (!this.A0B) {
            boolean z2 = false;
            if (f2 > 0.0f) {
                z2 = true;
            }
            this.A0B = z2;
        }
        boolean z3 = !this.A09.A0T();
        int i2 = this.A04;
        if (i2 != -1) {
            float f3 = this.A00;
            if (f3 != -1.0f) {
                float width = 1.0f - ((1.0f - (f3 / ((float) this.A08.getWidth()))) * f2);
                float width2 = (((float) this.A08.getWidth()) - this.A00) / 2.0f;
                this.A08.setTranslationX((z3 ? -(((float) (this.A05 - this.A04)) + width2) : ((float) (this.A04 - this.A05)) - width2) * f2);
                this.A08.setScaleX(width);
                this.A08.setScaleY(width);
                int width3 = this.A07.getWidth();
                if (this.A0C && width3 > 0) {
                    float f4 = this.A00;
                    float f5 = (float) width3;
                    float f6 = 1.0f - ((1.0f - (f4 / f5)) * f2);
                    float f7 = (f5 - f4) / 2.0f;
                    this.A07.setTranslationX((z3 ? -(((float) (this.A03 - this.A04)) + f7) : ((float) (this.A04 - this.A03)) - f7) * f2);
                    this.A07.setScaleX(f6);
                    this.A07.setScaleY(f6);
                    return;
                }
                return;
            }
        }
        String.format("Required values not set: profilePhotoCollapsedX = %s , targetDimen = %s", new Object[]{Integer.valueOf(i2), Float.valueOf(this.A00)});
    }

    public void setCollapsedProfilePhotoDimen(float f2) {
        this.A00 = f2;
    }

    public void setHaloEnabled(boolean z2) {
        if (this.A0C != z2) {
            this.A0C = z2;
            ImageView imageView = this.A07;
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }
}
