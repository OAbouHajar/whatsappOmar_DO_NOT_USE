package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass1UP;
import X.AnonymousClass2Ao;
import X.AnonymousClass2OY;
import X.C004601z;
import X.C16000sG;
import X.C16150sX;
import X.C17160ud;
import X.C17200uh;
import X.C49572Tv;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.IDxCallbackShape187S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.obwhatsapp.calling.views.VoipCallControlRingingDotsIndicator;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;

public class VoipInCallNotifBanner extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public int A02;
    public Animator A03;
    public InCallBannerViewModel A04;
    public C49572Tv A05;
    public C17160ud A06;
    public C16000sG A07;
    public AnonymousClass2OY A08;
    public C17200uh A09;
    public AnonymousClass01V A0A;
    public C52662eE A0B;
    public boolean A0C;
    public final Handler A0D;
    public final ImageView A0E;
    public final TextEmojiLabel A0F;
    public final TextEmojiLabel A0G;
    public final WaImageButton A0H;
    public final VoipCallControlRingingDotsIndicator A0I;
    public final AnonymousClass2Ao A0J;
    public final MultiContactThumbnail A0K;

    public VoipInCallNotifBanner(Context context) {
        this(context, (AttributeSet) null);
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A0D = new Handler(new IDxCallbackShape187S0100000_2_I0(this, 0));
        LayoutInflater.from(context).inflate(R.layout.layout05f8, this, true);
        setVisibility(8);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(this, R.id.title);
        this.A0G = textEmojiLabel;
        this.A0F = (TextEmojiLabel) C004601z.A0E(this, R.id.subtitle);
        this.A0E = (ImageView) C004601z.A0E(this, R.id.leftAddOn);
        this.A0K = (MultiContactThumbnail) C004601z.A0E(this, R.id.avatar);
        this.A0I = (VoipCallControlRingingDotsIndicator) C004601z.A0E(this, R.id.ringing_dots);
        this.A0H = (WaImageButton) C004601z.A0E(this, R.id.close_button);
        textEmojiLabel.setTypeface(AnonymousClass1UP.A03(context), 0);
        textEmojiLabel.setTextColor(AnonymousClass00T.A00(context, R.color.color05c2));
        this.A0J = this.A09.A05("voip-in-call-notif-banner-multi", 0.0f, getResources().getDimensionPixelSize(R.dimen.dimen074c));
        C004601z.A0d(this, 4);
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A09 = (C17200uh) r1.A52.get();
            this.A06 = (C17160ud) r1.A4t.get();
            this.A07 = (C16000sG) r1.A4x.get();
            this.A0A = (AnonymousClass01V) r1.AOi.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r11, X.C49572Tv r12) {
        /*
            if (r12 == 0) goto L_0x01c8
            android.content.Context r4 = r11.getContext()
            android.animation.Animator r0 = r11.A03
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0015
            android.animation.Animator r0 = r11.A03
            r0.cancel()
        L_0x0015:
            com.obwhatsapp.calling.views.VoipCallControlRingingDotsIndicator r6 = r11.A0I
            r6.clearAnimation()
            r5 = 8
            r6.setVisibility(r5)
            android.widget.ImageView r10 = r11.A0E
            r2 = 0
            r10.setImageDrawable(r2)
            r10.setVisibility(r5)
            android.widget.ImageView$ScaleType r0 = r12.A02
            r10.setScaleType(r0)
            com.obwhatsapp.ui.voip.MultiContactThumbnail r9 = r11.A0K
            r9.setVisibility(r5)
            X.2Tv r0 = r11.A05
            if (r0 == 0) goto L_0x003c
            int r1 = r12.A00
            int r0 = r0.A00
            if (r1 == r0) goto L_0x0041
        L_0x003c:
            int r0 = r12.A00
            r11.setupBannerBackground(r0)
        L_0x0041:
            X.4Ht r3 = r12.A03
            if (r3 == 0) goto L_0x009b
            int r0 = r3.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r4, r0)
            if (r0 == 0) goto L_0x009b
            android.graphics.drawable.Drawable r8 = X.C018208n.A03(r0)
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r3.A01
            int r0 = r1.getColor(r0)
            X.C018208n.A0A(r8, r0)
        L_0x005e:
            boolean r0 = r12.A09
            r3 = 0
            if (r0 == 0) goto L_0x009d
            java.util.List r7 = r12.A07
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x009d
            X.2OY r0 = r11.A08
            if (r0 == 0) goto L_0x0073
            X.2Tv r0 = r11.A05
            if (r0 != 0) goto L_0x007c
        L_0x0073:
            X.0ud r1 = r11.A06
            com.facebook.redex.IDxPDisplayerShape297S0100000_2_I0 r0 = new com.facebook.redex.IDxPDisplayerShape297S0100000_2_I0
            r0.<init>(r1, r3)
            r11.A08 = r0
        L_0x007c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0085:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r7.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0sG r0 = r11.A07
            X.0sH r0 = r0.A0A(r1)
            r8.add(r0)
            goto L_0x0085
        L_0x009b:
            r8 = r2
            goto L_0x005e
        L_0x009d:
            if (r8 == 0) goto L_0x00b0
            r10.setImageDrawable(r8)
            r10.setVisibility(r3)
            goto L_0x00b0
        L_0x00a6:
            r9.setVisibility(r3)
            X.2Ao r1 = r11.A0J
            X.2OY r0 = r11.A08
            r9.A00(r0, r1, r8)
        L_0x00b0:
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x00c3
            r6.setVisibility(r3)
            X.3NP r1 = new X.3NP
            r1.<init>(r6)
            r0 = -1
            r1.setRepeatCount(r0)
            r6.startAnimation(r1)
        L_0x00c3:
            if (r4 == 0) goto L_0x00ed
            com.obwhatsapp.TextEmojiLabel r1 = r11.A0G
            X.2Wj r0 = r12.A06
            java.lang.String r0 = r0.A00(r4)
            r1.setText(r0)
            X.2Wj r0 = r12.A05
            com.obwhatsapp.TextEmojiLabel r1 = r11.A0F
            if (r0 == 0) goto L_0x01d9
            r1.setVisibility(r3)
            java.lang.String r0 = r0.A00(r4)
            r1.setText(r0)
        L_0x00e0:
            X.2Wj r0 = r12.A04
            if (r0 == 0) goto L_0x00ed
            X.01V r1 = r11.A0A
            java.lang.String r0 = r0.A00(r4)
            X.AnonymousClass2JP.A00(r4, r1, r0)
        L_0x00ed:
            int r0 = r11.getVisibility()
            if (r0 == 0) goto L_0x01a2
            r11.setVisibility(r3)
            int r0 = r11.A01
            if (r0 == 0) goto L_0x00fe
            int r0 = r11.A00
            if (r0 != 0) goto L_0x0132
        L_0x00fe:
            android.view.ViewParent r0 = r11.getParent()
            android.view.View r0 = (android.view.View) r0
            int r4 = r0.getWidth()
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131166267(0x7f07043b, float:1.7946775E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            int r0 = r0 << 1
            int r4 = r4 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r11.measure(r1, r0)
            int r0 = r11.getMeasuredWidth()
            int r0 = r0 >> 1
            r11.A00 = r0
            int r0 = r11.getMeasuredHeight()
            r11.A01 = r0
        L_0x0132:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r0 = 600(0x258, double:2.964E-321)
            r4.setDuration(r0)
            com.facebook.redex.IDxLAdapterShape3S0100000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape3S0100000_2_I0
            r0.<init>(r11, r5)
            r4.addListener(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r4.setInterpolator(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            r8 = 2
            if (r1 < r0) goto L_0x01cd
            int r10 = r11.A00
            int r9 = r11.A01
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165476(0x7f070124, float:1.794517E38)
            float r7 = r1.getDimension(r0)
            int r0 = r11.A00
            float r5 = (float) r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165475(0x7f070123, float:1.7945168E38)
            float r0 = r1.getDimension(r0)
            float r5 = r5 + r0
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r11, r10, r9, r7, r5)
        L_0x017c:
            r6.add(r0)
            float[] r5 = new float[r8]
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165477(0x7f070125, float:1.7945172E38)
            float r0 = r1.getDimension(r0)
            r5[r3] = r0
            r1 = 1
            r0 = 0
            r5[r1] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r11, r0, r5)
            r6.add(r0)
            r4.playTogether(r6)
            r4.start()
        L_0x01a2:
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x01c9
            r1 = 10
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r0.<init>(r11, r1, r12)
            r11.setOnClickListener(r0)
        L_0x01b0:
            android.os.Handler r2 = r11.A0D
            r2.removeMessages(r3)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.sendEmptyMessageDelayed(r3, r0)
            r11.A05 = r12
            com.obwhatsapp.WaImageButton r2 = r11.A0H
            r1 = 13
            com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1 r0 = new com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
        L_0x01c8:
            return
        L_0x01c9:
            r11.setOnClickListener(r2)
            goto L_0x01b0
        L_0x01cd:
            float[] r1 = new float[r8]
            r1 = {0, 1065353216} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r11, r0, r1)
            goto L_0x017c
        L_0x01d9:
            r1.setVisibility(r5)
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner.A00(com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner, X.2Tv):void");
    }

    private void setupBannerBackground(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AnonymousClass00T.A00(getContext(), i2));
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.dimen0126));
        setBackground(gradientDrawable);
    }

    public void A01() {
        this.A0D.removeMessages(0);
        if (getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", new float[]{0.0f, getResources().getDimension(R.dimen.dimen0125)});
            this.A03 = ofFloat;
            ofFloat.setDuration(600);
            this.A03.setInterpolator(new DecelerateInterpolator(2.0f));
            this.A03.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 9));
            this.A03.start();
        }
        this.A0I.clearAnimation();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public int getBannerHeight() {
        int i2 = this.A02;
        if (i2 != 0) {
            return i2;
        }
        int dimension = (((int) getResources().getDimension(R.dimen.dimen0203)) + (((int) getResources().getDimension(R.dimen.dimen043b)) << 1)) - ((int) getResources().getDimension(R.dimen.dimen0127));
        this.A02 = dimension;
        return dimension;
    }
}
