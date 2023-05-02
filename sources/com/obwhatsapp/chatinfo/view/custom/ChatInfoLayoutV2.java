package com.obwhatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass2XQ;
import X.C004601z;
import X.C13680ns;
import X.C16620tM;
import X.C59972zg;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.components.ScalingFrameLayout;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.status.ScalingContactStatusThumbnail;

public class ChatInfoLayoutV2 extends C59972zg {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public TextView A07;
    public CollapsingProfilePhotoView A08;
    public ScalingFrameLayout A09;
    public AnonymousClass2XQ A0A;
    public boolean A0B = true;
    public boolean A0C = false;

    public ChatInfoLayoutV2(Context context) {
        super(context);
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatInfoLayoutV2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private ImageView getProfilePhotoImage() {
        CollapsingProfilePhotoView collapsingProfilePhotoView = (CollapsingProfilePhotoView) C004601z.A0E(this, R.id.collapsing_profile_photo_view);
        this.A08 = collapsingProfilePhotoView;
        ImageView imageView = collapsingProfilePhotoView.A08;
        ImageView A0J = C13680ns.A0J(this, R.id.profile_picture_image);
        boolean z2 = this.A0C;
        CollapsingProfilePhotoView collapsingProfilePhotoView2 = this.A08;
        if (z2) {
            collapsingProfilePhotoView2.setVisibility(0);
            if (this.A0C) {
                CollapsingProfilePhotoView collapsingProfilePhotoView3 = this.A08;
                collapsingProfilePhotoView3.A00 = (float) (this.A07 - (this.A01 << 1));
                collapsingProfilePhotoView3.A01(this.A04, this.A03);
            }
            A0J.setVisibility(8);
            return imageView;
        }
        collapsingProfilePhotoView2.setVisibility(8);
        A0J.setVisibility(0);
        return A0J;
    }

    public int A03(int i2) {
        return getResources().getDimensionPixelSize(R.dimen.dimen0192) + getResources().getDimensionPixelSize(R.dimen.dimen0765);
    }

    public void A04() {
        super.A04();
        this.A0N.setVisibility(0);
        A0F();
    }

    public void A05() {
        super.A05();
        this.A03 = getResources().getDimensionPixelSize(R.dimen.dimen00e1);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.dimen00e6);
        this.A0C = this.A0S.A0E(C16620tM.A01, 1533);
        this.A02 = getResources().getConfiguration().orientation;
        this.A09 = (ScalingFrameLayout) C004601z.A0E(this, R.id.profile_picture_scaler);
        this.A07 = C13680ns.A0L(this, R.id.conversation_contact_name);
        this.A04 = C004601z.A0E(this, R.id.profile_picture_circle);
        this.A05 = C13680ns.A0J(this, R.id.picture);
        this.A06 = getProfilePhotoImage();
    }

    public void A0A(int i2, int i3) {
        super.A0A(i2, i3);
        if (this.A0C) {
            CollapsingProfilePhotoView collapsingProfilePhotoView = this.A08;
            collapsingProfilePhotoView.A00 = (float) (this.A07 - (this.A01 << 1));
            collapsingProfilePhotoView.A01(this.A04, this.A03);
        }
    }

    public final void A0F() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0G.getLayoutParams();
        int i2 = 80;
        if (getWidth() >= getHeight()) {
            i2 = 17;
        }
        layoutParams.gravity = i2;
        this.A0G.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r5 = this;
            X.2XQ r4 = r5.A0A
            com.obwhatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r2 = r5.A08
            boolean r0 = r5.A0B
            r3 = 1
            if (r0 == 0) goto L_0x0014
            android.widget.ImageView r0 = r5.A05
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.setHaloEnabled(r0)
            if (r4 == 0) goto L_0x0051
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x0051
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0051
            android.widget.ImageView r2 = r5.A06
            boolean r0 = r2 instanceof com.obwhatsapp.status.ScalingContactStatusThumbnail
            if (r0 == 0) goto L_0x0036
            com.obwhatsapp.status.ScalingContactStatusThumbnail r2 = (com.obwhatsapp.status.ScalingContactStatusThumbnail) r2
            r2.A00 = r3
            int r1 = r4.A01
            int r0 = r4.A00
            r2.A05(r1, r0)
        L_0x0035:
            return
        L_0x0036:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0035
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            r2.setStatusIndicatorEnabled(r3)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x004e
            X.42X r1 = X.AnonymousClass42X.A03
        L_0x0045:
            X.3zx r0 = new X.3zx
            r0.<init>(r1)
            r2.setProfileStatus(r0)
            return
        L_0x004e:
            X.42X r1 = X.AnonymousClass42X.A02
            goto L_0x0045
        L_0x0051:
            android.widget.ImageView r2 = r5.A06
            boolean r0 = r2 instanceof com.obwhatsapp.status.ScalingContactStatusThumbnail
            r1 = 0
            if (r0 == 0) goto L_0x005d
            com.obwhatsapp.status.ScalingContactStatusThumbnail r2 = (com.obwhatsapp.status.ScalingContactStatusThumbnail) r2
            r2.A00 = r1
            return
        L_0x005d:
            boolean r0 = r2 instanceof com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0035
            com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            r2.setStatusIndicatorEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.chatinfo.view.custom.ChatInfoLayoutV2.A0G():void");
    }

    public int getToolbarColorResId() {
        return R.color.color0784;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = this.A02;
        int i3 = configuration.orientation;
        if (i2 != i3) {
            this.A02 = i3;
            CollapsingProfilePhotoView collapsingProfilePhotoView = this.A08;
            collapsingProfilePhotoView.A08.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(collapsingProfilePhotoView, 9));
            this.A0B = true;
            A0G();
        }
    }

    public void setOnPhotoClickListener(View.OnClickListener onClickListener) {
        this.A0A = onClickListener;
    }

    public void setRadius(float f2) {
        this.A00 = f2;
        ImageView imageView = this.A06;
        if (imageView instanceof ScalingContactStatusThumbnail) {
            ((ThumbnailButton) imageView).A02 = f2;
        }
        this.A04.setBackground(AnonymousClass000.A1O((f2 > -2.14748365E9f ? 1 : (f2 == -2.14748365E9f ? 0 : -1))) ? AnonymousClass00T.A04(getContext(), R.drawable.business_profile_photo_bg) : null);
    }

    public void setStatusData(AnonymousClass2XQ r1) {
        this.A0A = r1;
        A0G();
    }
}
