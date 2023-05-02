package com.obwhatsapp.backup.google;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass2SR;
import X.C47762Ki;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.obwhatsapp.R;

public class GoogleDriveRestoreAnimationView extends View implements AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Resources A05;
    public Paint A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public C47762Ki A0A;
    public AnonymousClass013 A0B;
    public C52662eE A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final DecelerateInterpolator A0G;

    public GoogleDriveRestoreAnimationView(Context context) {
        super(context);
        A00();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A03(context, (AttributeSet) null);
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A03(context, attributeSet);
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0G = new DecelerateInterpolator();
        this.A01 = 0;
        A03(context, attributeSet);
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A0E) {
            this.A0E = true;
            this.A0B = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public void A01() {
        if (this.A0A == null) {
            A02();
        }
        this.A01 = 1;
        startAnimation(this.A0A);
    }

    public final void A02() {
        C47762Ki r2 = new C47762Ki(this);
        this.A0A = r2;
        r2.setDuration(2000);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r0 != null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            r3 = 0
            if (r8 == 0) goto L_0x0061
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            int[] r0 = X.AnonymousClass4BW.A06
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r0, r3, r3)
            r5 = 0
            r4 = 1
            X.013 r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r1 = r0.A0T()     // Catch:{ all -> 0x0059 }
            r0 = 0
            if (r1 == 0) goto L_0x001d
            r0 = 3
        L_0x001d:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)     // Catch:{ all -> 0x0059 }
            r6.A09 = r0     // Catch:{ all -> 0x0059 }
            X.013 r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.A0T()     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x002c
            r5 = 3
        L_0x002c:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r5)     // Catch:{ all -> 0x0059 }
            r6.A07 = r0     // Catch:{ all -> 0x0059 }
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)     // Catch:{ all -> 0x0059 }
            r6.A0F = r0     // Catch:{ all -> 0x0059 }
            X.013 r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r1 = r0.A0T()     // Catch:{ all -> 0x0059 }
            r0 = 1
            if (r1 == 0) goto L_0x0043
            r0 = 4
        L_0x0043:
            int r0 = r2.getColor(r0, r3)     // Catch:{ all -> 0x0059 }
            r6.A03 = r0     // Catch:{ all -> 0x0059 }
            X.013 r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.A0T()     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0052
            r4 = 4
        L_0x0052:
            int r0 = r2.getColor(r4, r3)     // Catch:{ all -> 0x0059 }
            r6.A02 = r0     // Catch:{ all -> 0x0059 }
            goto L_0x005e
        L_0x0059:
            r0 = move-exception
            r2.recycle()
            throw r0
        L_0x005e:
            r2.recycle()
        L_0x0061:
            android.content.res.Resources r2 = r7.getResources()
            r6.A05 = r2
            android.graphics.drawable.Drawable r0 = r6.A09
            if (r0 != 0) goto L_0x0081
            X.013 r0 = r6.A0B
            boolean r1 = r0.A0T()
            r0 = 2131232014(0x7f08050e, float:1.8080125E38)
            if (r1 == 0) goto L_0x0079
            r0 = 2131232013(0x7f08050d, float:1.8080123E38)
        L_0x0079:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A09 = r0
            if (r0 == 0) goto L_0x0085
        L_0x0081:
            int r3 = r0.getIntrinsicWidth()
        L_0x0085:
            r6.A04 = r3
            android.graphics.drawable.Drawable r0 = r6.A07
            if (r0 != 0) goto L_0x00a1
            android.content.res.Resources r2 = r6.A05
            X.013 r0 = r6.A0B
            boolean r1 = r0.A0T()
            r0 = 2131232013(0x7f08050d, float:1.8080123E38)
            if (r1 == 0) goto L_0x009b
            r0 = 2131232014(0x7f08050e, float:1.8080125E38)
        L_0x009b:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A07 = r0
        L_0x00a1:
            android.graphics.drawable.Drawable r1 = r6.A09
            int r0 = r6.A03
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A06(r1, r0)
            r6.A09 = r0
            android.graphics.drawable.Drawable r1 = r6.A07
            int r0 = r6.A02
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A06(r1, r0)
            r6.A07 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView.A03(android.content.Context, android.util.AttributeSet):void");
    }

    public void A04(boolean z2) {
        int i2;
        if (this.A0A == null) {
            A02();
        }
        clearAnimation();
        Resources resources = this.A05;
        if (z2) {
            this.A08 = AnonymousClass2SR.A06(resources.getDrawable(R.drawable.ic_restore_error), AnonymousClass00T.A00(getContext(), R.color.color046c));
            i2 = 3;
        } else {
            this.A09 = AnonymousClass2SR.A06(resources.getDrawable(R.drawable.ill_restore_anim), this.A03);
            this.A08 = AnonymousClass2SR.A06(this.A05.getDrawable(R.drawable.ill_restore_success_checkmark), AnonymousClass00T.A00(getContext(), R.color.color046d));
            i2 = 2;
        }
        this.A01 = i2;
        C47762Ki r2 = this.A0A;
        if (r2 != null) {
            r2.setDuration(800);
            startAnimation(this.A0A);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0C;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47762Ki r2 = new C47762Ki(this);
        this.A0A = r2;
        r2.setDuration(2000);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
        startAnimation(this.A0A);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0036, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01cb, code lost:
        if (r4 < (r2 - 0.5d)) goto L_0x01cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r12 = r24
            int r6 = r12.getWidth()
            int r0 = r12.getHeight()
            float r5 = (float) r6
            r16 = 1073741824(0x40000000, float:2.0)
            float r4 = r5 / r16
            float r0 = (float) r0
            float r0 = r0 / r16
            r13 = r25
            r13.translate(r4, r0)
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            int r2 = (int) r0
            int r0 = -r6
            float r7 = (float) r0
            float r7 = r7 / r16
            float r9 = (float) r2
            float r9 = r9 / r16
            float r7 = r7 + r9
            int r0 = r12.A01
            r3 = 3
            r8 = 1056964608(0x3f000000, float:0.5)
            r10 = 1
            r11 = 1058642330(0x3f19999a, float:0.6)
            r2 = 2
            if (r0 == r2) goto L_0x0225
            if (r0 == r3) goto L_0x0039
        L_0x0038:
            r8 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r9 = (int) r0
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            float r1 = r1 / r16
            int r14 = (int) r1
            android.graphics.drawable.Drawable r11 = r12.A09
            int r0 = r9 >> 1
            float r15 = (float) r0
            float r0 = r7 - r15
            int r10 = (int) r0
            int r1 = -r14
            float r7 = r7 + r15
            int r0 = (int) r7
            r11.setBounds(r10, r1, r0, r14)
            android.graphics.drawable.Drawable r0 = r12.A09
            r0.draw(r13)
            double r0 = (double) r8
            r14 = 0
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x0087
            android.graphics.drawable.Drawable r0 = r12.A08
            if (r0 == 0) goto L_0x0087
            int r0 = r0.getIntrinsicWidth()
            float r1 = (float) r0
            float r1 = r1 * r8
            android.graphics.drawable.Drawable r0 = r12.A08
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r8 = r8 * r0
            android.graphics.drawable.Drawable r11 = r12.A08
            int r10 = (int) r1
            int r7 = -r10
            int r1 = (int) r8
            int r0 = -r1
            r11.setBounds(r7, r0, r10, r1)
            android.graphics.drawable.Drawable r0 = r12.A08
            r0.draw(r13)
        L_0x0087:
            android.graphics.drawable.Drawable r0 = r12.A07
            int r7 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r0 = r12.A07
            int r10 = r0.getIntrinsicHeight()
            int r10 = r10 / r2
            int r0 = r12.A01
            if (r0 == r2) goto L_0x00a6
            android.graphics.drawable.Drawable r8 = r12.A07
            int r6 = r6 / r2
            int r1 = r6 - r7
            int r0 = -r10
            r8.setBounds(r1, r0, r6, r10)
            android.graphics.drawable.Drawable r0 = r12.A07
            r0.draw(r13)
        L_0x00a6:
            int r0 = r12.A01
            if (r0 == r2) goto L_0x019a
            if (r0 == r3) goto L_0x019a
            float r1 = -r5
            float r1 = r1 / r16
            float r0 = (float) r9
            float r1 = r1 + r0
            double r8 = (double) r1
            float r0 = (float) r7
            float r4 = r4 - r0
            double r2 = (double) r4
            double r0 = r8 - r2
            double r0 = r0 * r0
            double r0 = r0 + r14
            double r4 = java.lang.Math.sqrt(r0)
            float r0 = (float) r4
            double r6 = (double) r0
            r10 = 4599526299433487565(0x3fd4cccccccccccd, double:0.325)
            double r4 = java.lang.Math.sin(r10)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r0
            double r6 = r6 / r4
            double r8 = r8 + r2
            double r8 = r8 / r0
            double r20 = java.lang.Math.cos(r10)
            double r20 = r20 * r6
            double r20 = r20 + r14
            android.graphics.Paint r1 = r12.A06
            r0 = 1
            r1.setAntiAlias(r0)
            r14 = 0
        L_0x00dd:
            double r10 = (double) r14
            r18 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            double r2 = r10 * r18
            r16 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r2 = r2 / r16
            r4 = -4623935809413835653(0xbfd47ae147ae147b, double:-0.32)
            double r2 = r2 + r4
            int r22 = r14 + 1
            r0 = r22
            double r0 = (double) r0
            double r0 = r0 * r18
            double r0 = r0 / r16
            double r0 = r0 + r4
            boolean r4 = r12.A0F
            if (r4 == 0) goto L_0x0221
            r5 = 0
        L_0x00fe:
            float r4 = (float) r2
            float r2 = (float) r0
            float r2 = r2 - r4
            r3 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x021b
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x010e:
            float r2 = r2 * r3
            float r4 = r4 + r2
            double r2 = (double) r4
            double r4 = java.lang.Math.sin(r2)
            double r4 = r4 * r6
            X.013 r0 = r12.A0B
            boolean r1 = r0.A0T()
            r0 = 1
            if (r1 == 0) goto L_0x0120
            r0 = -1
        L_0x0120:
            double r0 = (double) r0
            double r4 = r4 * r0
            double r4 = r4 + r8
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x0212
            r2 = 0
        L_0x0129:
            android.graphics.Paint r0 = r12.A06
            r18 = r0
            android.content.res.Resources r15 = r12.getResources()
            boolean r1 = r12.A0F
            r0 = 2131100769(0x7f060461, float:1.7813929E38)
            if (r1 == 0) goto L_0x013b
            r0 = 2131100771(0x7f060463, float:1.7813933E38)
        L_0x013b:
            int r1 = r15.getColor(r0)
            r0 = r18
            r0.setColor(r1)
            android.graphics.Paint r1 = r12.A06
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131166877(0x7f07069d, float:1.7948012E38)
            float r15 = r1.getDimension(r0)
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x019b
            if (r14 == 0) goto L_0x0188
            float r0 = r12.A00
            float r0 = -r0
            double r0 = (double) r0
            r16 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r0 = r0 * r16
            r16 = 4602891378046628709(0x3fe0c152382d7365, double:0.5235987755982988)
            double r16 = r16 * r10
            double r0 = r0 + r16
            double r0 = java.lang.Math.cos(r0)
            r10 = 4638637247447433216(0x405fc00000000000, double:127.0)
            double r0 = r0 * r10
            double r0 = r0 + r10
            android.graphics.Paint r11 = r12.A06
            int r10 = (int) r0
            r11.setAlpha(r10)
            float r10 = (float) r4
            float r1 = (float) r2
            android.graphics.Paint r0 = r12.A06
            r13.drawCircle(r10, r1, r15, r0)
        L_0x0188:
            r14 = r22
            r1 = 12
            if (r14 < r1) goto L_0x00dd
            int r1 = r12.A01
            r0 = 4
            if (r1 != r0) goto L_0x019a
            X.2Ki r0 = r12.A0A
            if (r0 == 0) goto L_0x019a
            r0.cancel()
        L_0x019a:
            return
        L_0x019b:
            float r0 = (float) r4
            r23 = r0
            float r14 = (float) r2
            android.graphics.Paint r1 = r12.A06
            r13.drawCircle(r0, r14, r15, r1)
            r0 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r0 = r0 * r10
            double r0 = r0 / r16
            double r4 = java.lang.Math.sin(r0)
            float r10 = r12.A00
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r0 = r10 - r0
            double r2 = (double) r0
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r2 = r2 * r0
            r0 = 1053609164(0x3ecccccc, float:0.39999998)
            double r0 = (double) r0
            double r2 = r2 / r0
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01cd
            double r16 = r2 - r18
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            r11 = 1
            if (r0 >= 0) goto L_0x01ce
        L_0x01cd:
            r11 = 0
        L_0x01ce:
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L_0x0188
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0188
            if (r11 == 0) goto L_0x0188
            r10 = 4634204016564240384(0x4050000000000000, double:64.0)
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r2 - r18
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r4 = r4 + r10
            int r2 = (int) r4
            r0 = 255(0xff, float:3.57E-43)
            if (r2 < r0) goto L_0x01ed
            r2 = 255(0xff, float:3.57E-43)
        L_0x01ed:
            android.graphics.Paint r3 = r12.A06
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131100770(0x7f060462, float:1.781393E38)
            int r0 = r1.getColor(r0)
            r3.setColor(r0)
            android.graphics.Paint r1 = r12.A06
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            android.graphics.Paint r0 = r12.A06
            r0.setAlpha(r2)
            android.graphics.Paint r1 = r12.A06
            r0 = r23
            r13.drawCircle(r0, r14, r15, r1)
            goto L_0x0188
        L_0x0212:
            double r0 = java.lang.Math.cos(r2)
            double r0 = r0 * r6
            double r2 = r20 - r0
            goto L_0x0129
        L_0x021b:
            float r5 = r5 - r3
            float r1 = r1 - r3
            float r5 = r5 / r1
            r3 = r5
            goto L_0x010e
        L_0x0221:
            float r5 = r12.A00
            goto L_0x00fe
        L_0x0225:
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x0278
            float r7 = r12.A00
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            android.view.animation.DecelerateInterpolator r0 = r12.A0G
            if (r1 >= 0) goto L_0x0267
            float r7 = r7 / r11
            float r7 = r0.getInterpolation(r7)
            android.graphics.drawable.Drawable r0 = r12.A09
            int r1 = r0.getIntrinsicWidth()
            int r0 = r12.A04
            float r8 = (float) r0
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r8 = r8 / r0
            float r1 = (float) r1
            int r0 = r12.A04
            float r0 = (float) r0
            float r1 = r1 - r0
            float r1 = r1 * r7
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r1 = r1 + r8
            float r9 = r9 - r4
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r5 - r0
            float r7 = r7 * r0
            float r7 = r7 / r16
            float r7 = r7 + r9
            goto L_0x0038
        L_0x0267:
            float r7 = r7 - r11
            float r0 = r0.getInterpolation(r7)
            float r8 = r8 * r0
            float r1 = r12.A00
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0278
            r12.A0D = r10
        L_0x0278:
            r1 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView.onDraw(android.graphics.Canvas):void");
    }

    public void onVisibilityChanged(View view, int i2) {
        C47762Ki r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A0A) != null) {
            startAnimation(r0);
        }
    }
}
