package com.obwhatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass41E;
import X.AnonymousClass5DK;
import X.AnonymousClass5DL;
import X.C1051058f;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C15220qW;
import X.C18450wi;
import X.C54392hN;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public final class AvatarProfilePhotoColorView extends View {
    public AnonymousClass41E A00;
    public final Paint A01;
    public final Paint A02;
    public final C15220qW A03;
    public final C15220qW A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context) {
        this(context, (AttributeSet) null);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18450wi.A0H(context, 1);
        this.A03 = new C1051058f(new AnonymousClass5DK(this));
        this.A04 = new C1051058f(new AnonymousClass5DL(this));
        this.A00 = AnonymousClass41E.IDLE;
        Paint A05 = C13700nu.A05();
        A05.setStrokeWidth(getBorderStrokeWidthSelected());
        C13690nt.A0y(A05);
        A05.setAntiAlias(true);
        A05.setDither(true);
        this.A02 = A05;
        Paint A052 = C13700nu.A05();
        C13690nt.A0n(AnonymousClass00T.A00(context, R.color.color06c5), A052);
        A052.setAntiAlias(true);
        A052.setDither(true);
        this.A01 = A052;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet, int i2, C54392hN r5) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    private final float getBorderStrokeWidthSelected() {
        return AnonymousClass000.A04(this.A03.getValue());
    }

    private final float getSelectedBorderMargin() {
        return AnonymousClass000.A04(this.A04.getValue());
    }

    public void onDraw(Canvas canvas) {
        C18450wi.A0H(canvas, 0);
        int width = getWidth() >> 1;
        int height = getHeight() >> 1;
        float min = ((float) Math.min(C13680ns.A04(this), C13680ns.A03(this))) / 2.0f;
        AnonymousClass41E r0 = this.A00;
        AnonymousClass41E r4 = AnonymousClass41E.SELECTED;
        float f2 = (float) width;
        float f3 = (float) height;
        canvas.drawCircle(f2, f3, r0 == r4 ? min - getSelectedBorderMargin() : min, this.A01);
        if (this.A00 == r4) {
            canvas.drawCircle(f2, f3, min, this.A02);
        }
    }

    public void onMeasure(int i2, int i3) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i3);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
