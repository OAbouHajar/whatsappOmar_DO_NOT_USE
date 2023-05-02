package com.obwhatsapp.search.views.itemviews;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass2SR;
import X.AnonymousClass4BW;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C16150sX;
import X.C45902Bo;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;

public class VoiceNoteProfileAvatarView extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public WaButton A06;
    public AnonymousClass013 A07;
    public C52662eE A08;
    public boolean A09;
    public boolean A0A;

    public VoiceNoteProfileAvatarView(Context context) {
        super(context);
        A00();
        this.A00 = 0;
        A02(context, (AttributeSet) null);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = 0;
        A02(context, attributeSet);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            this.A07 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r18, boolean r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.A00
            r8 = 1
            r9 = 0
            r10 = 0
            r4 = r18
            if (r4 == r0) goto L_0x000c
            r10 = 1
        L_0x000c:
            r3.A00 = r4
            if (r20 != 0) goto L_0x0113
            if (r21 == 0) goto L_0x0113
            android.widget.ImageView r2 = r3.A03
        L_0x0014:
            if (r18 == 0) goto L_0x0039
            if (r4 == r8) goto L_0x0103
            r7 = 2
            if (r4 == r7) goto L_0x00e9
            com.obwhatsapp.WaButton r6 = r3.A06
            android.content.Context r5 = r3.getContext()
            r1 = 2131888350(0x7f1208de, float:1.9411333E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.AnonymousClass000.A1M(r0, r7, r9)
        L_0x0029:
            java.lang.String r0 = r5.getString(r1, r0)
            r6.setText(r0)
        L_0x0030:
            com.obwhatsapp.WaButton r1 = r3.A06
            if (r20 == 0) goto L_0x00e5
            android.content.res.ColorStateList r0 = r3.A02
        L_0x0036:
            X.C004601z.A0O(r0, r1)
        L_0x0039:
            android.widget.ImageView r0 = r3.A05
            r5 = 8
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.A03
            r0.setVisibility(r5)
            com.obwhatsapp.WaButton r0 = r3.A06
            if (r18 != 0) goto L_0x007d
            r0.setVisibility(r5)
            android.widget.ImageView r1 = r3.A04
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0053
            r5 = 0
        L_0x0053:
            r1.setVisibility(r5)
            r2.setVisibility(r9)
            r3.setClickable(r9)
        L_0x005c:
            if (r19 == 0) goto L_0x007c
            if (r10 == 0) goto L_0x007c
            com.obwhatsapp.WaButton r5 = r3.A06
            if (r18 != 0) goto L_0x0117
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            X.C13680ns.A14(r5, r1, r0)
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0076
            android.widget.ImageView r3 = r3.A04
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C13680ns.A14(r3, r1, r0)
        L_0x0076:
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C13680ns.A14(r2, r1, r0)
        L_0x007c:
            return
        L_0x007d:
            r0.setVisibility(r9)
            android.widget.ImageView r1 = r3.A04
            r0 = 4
            r1.setVisibility(r0)
            r2.setVisibility(r0)
            r3.setClickable(r8)
            if (r21 == 0) goto L_0x00b1
            if (r20 != 0) goto L_0x00cc
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167282(0x7f070832, float:1.7948833E38)
            int r14 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167279(0x7f07082f, float:1.7948827E38)
            int r15 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r16 = 0
        L_0x00a9:
            X.013 r12 = r3.A07
            com.obwhatsapp.WaButton r11 = r3.A06
            X.C45902Bo.A09(r11, r12, r13, r14, r15, r16)
            goto L_0x005c
        L_0x00b1:
            if (r20 != 0) goto L_0x00cc
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167280(0x7f070830, float:1.794883E38)
            int r15 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167278(0x7f07082e, float:1.7948825E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r14 = 0
            goto L_0x00a9
        L_0x00cc:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167281(0x7f070831, float:1.7948831E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167278(0x7f07082e, float:1.7948825E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r14 = 0
            r15 = 0
            goto L_0x00a9
        L_0x00e5:
            android.content.res.ColorStateList r0 = r3.A01
            goto L_0x0036
        L_0x00e9:
            com.obwhatsapp.WaButton r7 = r3.A06
            android.content.Context r6 = r3.getContext()
            r5 = 2131888351(0x7f1208df, float:1.9411335E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 1069547520(0x3fc00000, float:1.5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r0 = X.C13680ns.A0d(r6, r0, r1, r9, r5)
            r7.setText(r0)
            goto L_0x0030
        L_0x0103:
            com.obwhatsapp.WaButton r6 = r3.A06
            android.content.Context r5 = r3.getContext()
            r1 = 2131888350(0x7f1208de, float:1.9411333E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.AnonymousClass000.A1M(r0, r8, r9)
            goto L_0x0029
        L_0x0113:
            android.widget.ImageView r2 = r3.A05
            goto L_0x0014
        L_0x0117:
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C13680ns.A14(r5, r1, r0)
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0129
            android.widget.ImageView r3 = r3.A04
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            X.C13680ns.A14(r3, r1, r0)
        L_0x0129:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            X.C13680ns.A14(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView.A01(int, boolean, boolean, boolean):void");
    }

    public final void A02(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        FrameLayout.inflate(context2, R.layout.layout05e6, this);
        this.A05 = C13680ns.A0J(this, R.id.picture);
        this.A03 = C13680ns.A0J(this, R.id.picture_in_group);
        this.A04 = C13680ns.A0J(this, R.id.mic_overlay);
        this.A06 = (WaButton) C004601z.A0E(this, R.id.fast_playback_overlay);
        this.A02 = AnonymousClass00T.A03(context2, R.color.color07db);
        this.A01 = AnonymousClass00T.A03(context2, R.color.color07d7);
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, AnonymousClass4BW.A0I);
            View A0E = C004601z.A0E(this, R.id.picture_frame);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, Integer.MIN_VALUE);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            C45902Bo.A0A(A0E, this.A07, dimensionPixelSize, dimensionPixelSize2, A0E.getPaddingRight(), dimensionPixelSize3);
            int i2 = dimensionPixelSize4;
            int i3 = dimensionPixelSize4;
            int i4 = dimensionPixelSize4;
            C45902Bo.A0A(this.A05, this.A07, dimensionPixelSize4, i4, i2, i3);
            C45902Bo.A0A(this.A03, this.A07, dimensionPixelSize4, i4, i2, i3);
            if (dimensionPixelSize5 != Integer.MIN_VALUE) {
                ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                this.A05.setLayoutParams(layoutParams);
                this.A03.setLayoutParams(layoutParams);
            }
            this.A04.setBackground(drawable);
            C004601z.A0O(colorStateList, this.A04);
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this.A04);
            AnonymousClass013 r3 = this.A07;
            ImageView imageView = this.A04;
            ImageView imageView2 = imageView;
            AnonymousClass013 r17 = r3;
            C45902Bo.A09(imageView2, r17, dimensionPixelSize6, A0O.topMargin, A0O.rightMargin, dimensionPixelSize7);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public int getFastPlaybackViewState() {
        return this.A00;
    }

    public ImageView getGroupProfileImageView() {
        return this.A03;
    }

    public ImageView getProfileImageView() {
        return this.A05;
    }

    public void setIsForwardedByNonAuthorPttUi(boolean z2) {
        int i2 = 8;
        this.A0A = z2;
        ImageView imageView = this.A05;
        int i3 = R.drawable.avatar_contact;
        if (z2) {
            i3 = R.drawable.audio_ptt_forwarded_icon;
        }
        imageView.setImageResource(i3);
        ImageView imageView2 = this.A04;
        if (!z2) {
            i2 = 0;
        }
        imageView2.setVisibility(i2);
    }

    public void setMicColorTint(int i2) {
        this.A04.setImageDrawable(AnonymousClass2SR.A02(getContext(), R.drawable.mic_played, i2));
    }

    public void setOnFastPlaybackButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.A06.setOnClickListener(onClickListener);
        if (this.A06.getVisibility() == 8 || this.A06.getVisibility() == 4) {
            setClickable(false);
        }
    }

    public void setupMicBackgroundColor(int i2) {
        Context context = getContext();
        Drawable mutate = C13690nt.A0C(context, R.drawable.mic_background_incoming).mutate();
        ColorStateList A032 = AnonymousClass00T.A03(context, i2);
        this.A04.setBackground(mutate);
        C004601z.A0O(A032, this.A04);
    }
}
