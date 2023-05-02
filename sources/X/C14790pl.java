package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.0pl  reason: invalid class name and case insensitive filesystem */
public class C14790pl {
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final AnonymousClass013 A06;

    public C14790pl(ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, AnonymousClass013 r7) {
        this.A06 = r7;
        AnonymousClass00B.A04(imageView);
        this.A02 = imageView;
        AnonymousClass00B.A04(imageView2);
        this.A03 = imageView2;
        AnonymousClass00B.A04(imageView3);
        this.A04 = imageView3;
        AnonymousClass00B.A04(textView);
        this.A05 = textView;
    }

    public static Drawable A00(Drawable drawable, Drawable drawable2) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0) {
                drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
            }
        }
        if (drawable == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return drawable2;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(50);
        A01(drawable, transitionDrawable, 0);
        A01(drawable2, transitionDrawable, 1);
        return transitionDrawable;
    }

    public static void A01(Drawable drawable, TransitionDrawable transitionDrawable, int i2) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        transitionDrawable.setLayerWidth(i2, drawable.getIntrinsicWidth());
        transitionDrawable.setLayerHeight(i2, intrinsicHeight);
        transitionDrawable.setLayerGravity(i2, 17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r6 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        if (r8 == null) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C14800pm r23) {
        /*
            r22 = this;
            r13 = r23
            android.graphics.drawable.Drawable r6 = r13.ADJ()
            java.lang.String r10 = r13.ADI()
            android.graphics.drawable.Drawable r8 = r13.AFp()
            java.lang.String r5 = r13.AFo()
            r3 = 0
            r7 = r22
            android.widget.ImageView r9 = r7.A02
            r1 = 0
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r0.<init>(r13, r1, r7)
            r9.setOnClickListener(r0)
            android.widget.ImageView r0 = r7.A03
            r14 = 1
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r1 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r1.<init>(r13, r14, r7)
            r0.setOnClickListener(r1)
            android.widget.ImageView r4 = r7.A04
            r2 = 2
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r1 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r1.<init>(r13, r2, r7)
            r4.setOnClickListener(r1)
            if (r10 == 0) goto L_0x003b
            r9.setContentDescription(r10)
        L_0x003b:
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r1 = r9.getDrawable()
            android.graphics.drawable.Drawable r1 = A00(r1, r6)
            if (r1 == 0) goto L_0x0162
            r9.setImageDrawable(r1)
        L_0x004a:
            boolean r2 = r7.A00
            r1 = 8
            if (r2 != 0) goto L_0x0053
            r12 = 0
            if (r6 != 0) goto L_0x0055
        L_0x0053:
            r12 = 8
        L_0x0055:
            java.lang.String r2 = r13.ADK()
            if (r2 == 0) goto L_0x0132
            android.widget.TextView r11 = r7.A05
            r10 = 3
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r2 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r2.<init>(r13, r10, r7)
            r11.setOnClickListener(r2)
            android.content.Context r10 = r11.getContext()
            r2 = 2131891834(0x7f12167a, float:1.94184E38)
            java.lang.String r10 = r10.getString(r2)
            r9.setVisibility(r1)
            r11.setVisibility(r12)
            if (r12 != 0) goto L_0x00a3
            X.013 r2 = r7.A06
            boolean r2 = r2.A0T()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x012d
            r11.setCompoundDrawables(r6, r3, r3, r3)
        L_0x0086:
            X.AnonymousClass1UP.A06(r11)
            java.lang.CharSequence r2 = r11.getText()
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00a3
            android.os.Handler r9 = r7.A01
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r6 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r6.<init>(r14, r10, r7)
            r2 = 3000(0xbb8, double:1.482E-320)
            r9.postDelayed(r6, r2)
        L_0x00a3:
            r11.setContentDescription(r10)
        L_0x00a6:
            if (r8 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            android.graphics.drawable.Drawable r2 = A00(r2, r8)
            if (r2 == 0) goto L_0x0129
            r0.setImageDrawable(r2)
        L_0x00b5:
            boolean r2 = r7.A00
            if (r2 != 0) goto L_0x00bc
            r3 = 0
            if (r8 != 0) goto L_0x00be
        L_0x00bc:
            r3 = 8
        L_0x00be:
            int r2 = r0.getVisibility()
            if (r3 == r2) goto L_0x00e4
            r0.setVisibility(r3)
            r15 = 0
            if (r3 != 0) goto L_0x0111
            r19 = 1061997773(0x3f4ccccd, float:0.8)
            r16 = 1
            r17 = 0
            r18 = 1
            r20 = 1
            r21 = 0
            android.view.animation.TranslateAnimation r13 = new android.view.animation.TranslateAnimation
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 100
            r13.setDuration(r2)
        L_0x00e1:
            r0.startAnimation(r13)
        L_0x00e4:
            if (r5 == 0) goto L_0x00e9
            r0.setContentDescription(r5)
        L_0x00e9:
            int r0 = r4.getVisibility()
            if (r1 == r0) goto L_0x010d
            r4.setVisibility(r1)
            r15 = 0
            r21 = 1061997773(0x3f4ccccd, float:0.8)
            r16 = 1
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            android.view.animation.TranslateAnimation r13 = new android.view.animation.TranslateAnimation
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 100
            r13.setDuration(r0)
            r4.startAnimation(r13)
        L_0x010d:
            com.obwhatsapp.yo.HomeUI.bringYoFAB_Chats()
            return
        L_0x0111:
            r21 = 1061997773(0x3f4ccccd, float:0.8)
            r16 = 1
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            android.view.animation.TranslateAnimation r13 = new android.view.animation.TranslateAnimation
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 100
            r13.setDuration(r2)
            goto L_0x00e1
        L_0x0129:
            r0.setImageDrawable(r8)
            goto L_0x00b5
        L_0x012d:
            r11.setCompoundDrawables(r3, r3, r6, r3)
            goto L_0x0086
        L_0x0132:
            android.widget.TextView r2 = r7.A05
            r2.setVisibility(r1)
            int r2 = r9.getVisibility()
            if (r12 == r2) goto L_0x00a6
            r9.setVisibility(r12)
            if (r12 != 0) goto L_0x0154
            r3 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r6 = new android.view.animation.AlphaAnimation
            r6.<init>(r3, r2)
            r2 = 100
            r6.setDuration(r2)
        L_0x014f:
            r9.startAnimation(r6)
            goto L_0x00a6
        L_0x0154:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            android.view.animation.AlphaAnimation r6 = new android.view.animation.AlphaAnimation
            r6.<init>(r3, r2)
            r2 = 100
            r6.setDuration(r2)
            goto L_0x014f
        L_0x0162:
            r9.setImageDrawable(r6)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14790pl.A02(X.0pm):void");
    }
}
