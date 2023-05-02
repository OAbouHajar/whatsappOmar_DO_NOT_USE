package com.obwhatsapp.mediacomposer.doodle.titlebar;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass2VI;
import X.AnonymousClass471;
import X.C447725m;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;

public class TitleBarView extends RelativeLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public RelativeLayout A07;
    public WaButton A08;
    public WaTextView A09;
    public AnonymousClass013 A0A;
    public AnonymousClass2VI A0B;
    public AnonymousClass2VI A0C;
    public AnonymousClass2VI A0D;
    public C52662eE A0E;
    public boolean A0F;

    public TitleBarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TitleBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0F) {
            this.A0F = true;
            this.A0A = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0E;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0E = r0;
        }
        return r0.generatedComponent();
    }

    public final int getCropToolId() {
        return this.A03.getId();
    }

    public float getCropToolOffsetX() {
        return (this.A05.getX() - this.A03.getX()) - this.A03.getTranslationX();
    }

    public float getDeleteToolOffsetX() {
        return (this.A05.getX() - this.A04.getX()) - this.A04.getTranslationX();
    }

    public final int getPenToolId() {
        return this.A05.getId();
    }

    public final int getShapeToolId() {
        return this.A06.getId();
    }

    public float getShapeToolOffsetX() {
        return (this.A05.getX() - this.A06.getX()) - this.A06.getTranslationX();
    }

    public View getStartingViewFromToolbarExtra() {
        return this.A02;
    }

    public final int getTextToolId() {
        return this.A09.getId();
    }

    public float getTextToolOffsetX() {
        return (this.A05.getX() - this.A09.getX()) - this.A09.getTranslationX();
    }

    public final RelativeLayout getToolbarExtra() {
        return this.A07;
    }

    public void setBackButtonDrawable(int i2) {
        this.A02.setImageDrawable(new C447725m(AnonymousClass00T.A04(getContext(), i2), this.A0A));
        this.A02.setVisibility(0);
        this.A08.setVisibility(8);
    }

    public void setCloseButtonAlpha(float f2) {
        this.A02.setAlpha(f2);
    }

    public final void setCropToolVisibility(int i2) {
        this.A03.setVisibility(i2);
    }

    public void setCropToolX(float f2) {
        this.A03.setTranslationX(f2);
    }

    public final void setDeleteButtonVisibility(int i2) {
        this.A04.setVisibility(i2);
    }

    public void setDeleteToolX(float f2) {
        this.A04.setTranslationX(f2);
    }

    public void setFont(int i2) {
        this.A09.setTypeface(AnonymousClass471.A00(getContext(), i2));
    }

    public void setPenToolDrawableStrokePreview(boolean z2) {
        this.A0B.A04 = z2;
    }

    public void setShapeToolDrawableStrokePreview(boolean z2) {
        this.A0C.A04 = z2;
    }

    public void setShapeToolX(float f2) {
        this.A06.setTranslationX(f2);
    }

    public void setTextToolX(float f2) {
        this.A09.setTranslationX(f2);
    }

    public void setToolBarExtra(RelativeLayout relativeLayout) {
        this.A07 = relativeLayout;
    }

    public final void setToolbarExtraVisibility(int i2) {
        this.A07.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5 == 4) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUndoButtonVisibility(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.A01
            int r0 = r0.getVisibility()
            if (r0 == r5) goto L_0x0031
            android.view.View r0 = r4.A01
            r0.setVisibility(r5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 4
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 == r1) goto L_0x0017
            r0 = 0
            if (r5 != r1) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r0, r3)
            if (r5 != r1) goto L_0x0032
            X.08r r0 = new X.08r
            r0.<init>()
        L_0x0024:
            r2.setInterpolator(r0)
            r0 = 100
            r2.setDuration(r0)
            android.view.View r0 = r4.A01
            r0.startAnimation(r2)
        L_0x0031:
            return
        L_0x0032:
            X.07q r0 = new X.07q
            r0.<init>()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView.setUndoButtonVisibility(int):void");
    }

    public void setUndoToolX(float f2) {
        this.A01.setTranslationX(f2);
    }
}
