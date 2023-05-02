package com.obwhatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass2Xe;
import X.AnonymousClass41E;
import X.AnonymousClass49H;
import X.AnonymousClass5DM;
import X.AnonymousClass5DN;
import X.AnonymousClass5DO;
import X.AnonymousClass5DP;
import X.C1051058f;
import X.C13680ns;
import X.C13700nu;
import X.C15220qW;
import X.C18450wi;
import X.C31401e7;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.CircleWaImageView;

public final class AvatarProfilePhotoImageView extends CircleWaImageView {
    public float A00;
    public int A01;
    public final Paint A02;
    public final Paint A03;
    public final Paint A04;
    public final C15220qW A05 = new C1051058f(new AnonymousClass5DM(this));
    public final C15220qW A06 = new C1051058f(new AnonymousClass5DN(this));
    public final C15220qW A07 = new C1051058f(new AnonymousClass5DO(this));
    public final C15220qW A08 = new C1051058f(new AnonymousClass5DP(this));

    public AvatarProfilePhotoImageView(Context context) {
        super(context, (AttributeSet) null);
        Paint A052 = C13700nu.A05();
        A052.setColor(getBorderColorIdle());
        A052.setStrokeWidth(getBorderStrokeWidthIdle());
        A052.setStyle(Paint.Style.STROKE);
        A052.setAntiAlias(true);
        A052.setDither(true);
        this.A03 = A052;
        this.A02 = C31401e7.A01(this);
        Paint paint = new Paint();
        paint.setColor(getColorNeutral());
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.A04 = paint;
        A07((AttributeSet) null);
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint A052 = C13700nu.A05();
        A052.setColor(getBorderColorIdle());
        A052.setStrokeWidth(getBorderStrokeWidthIdle());
        A052.setStyle(Paint.Style.STROKE);
        A052.setAntiAlias(true);
        A052.setDither(true);
        this.A03 = A052;
        this.A02 = C31401e7.A01(this);
        Paint paint = new Paint();
        paint.setColor(getColorNeutral());
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.A04 = paint;
        A07(attributeSet);
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Paint A052 = C13700nu.A05();
        A052.setColor(getBorderColorIdle());
        A052.setStrokeWidth(getBorderStrokeWidthIdle());
        A052.setStyle(Paint.Style.STROKE);
        A052.setAntiAlias(true);
        A052.setDither(true);
        this.A03 = A052;
        this.A02 = C31401e7.A01(this);
        Paint paint = new Paint();
        paint.setColor(getColorNeutral());
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.A04 = paint;
        A07(attributeSet);
    }

    private final int getBorderColorIdle() {
        return AnonymousClass000.A0D(this.A05.getValue());
    }

    private final float getBorderStrokeWidthIdle() {
        return AnonymousClass000.A04(this.A06.getValue());
    }

    private final float getBorderStrokeWidthSelected() {
        return AnonymousClass000.A04(this.A07.getValue());
    }

    private final int getColorNeutral() {
        return AnonymousClass000.A0D(this.A08.getValue());
    }

    public static /* synthetic */ void setBorderStyle$default(AvatarProfilePhotoImageView avatarProfilePhotoImageView, AnonymousClass41E r2, int i2, float f2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f2 = 0.0f;
        }
        avatarProfilePhotoImageView.A08(r2, f2, i2);
    }

    public final void A06() {
        Paint paint = this.A03;
        paint.setColor(getBorderColorIdle());
        paint.setStrokeWidth(getBorderStrokeWidthIdle());
        this.A04.setStrokeWidth(0.0f);
        this.A00 = getBorderStrokeWidthIdle();
        invalidate();
    }

    public final void A07(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass49H.A00);
        C18450wi.A0B(obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A01 = obtainStyledAttributes.getInt(0, this.A01);
        }
        obtainStyledAttributes.recycle();
    }

    public final void A08(AnonymousClass41E r4, float f2, int i2) {
        C18450wi.A0H(r4, 0);
        Paint paint = this.A03;
        int ordinal = r4.ordinal();
        switch (ordinal) {
            case 0:
                break;
            case 1:
                i2 = getBorderColorIdle();
                break;
            default:
                throw new AnonymousClass2Xe();
        }
        paint.setColor(i2);
        paint.setStrokeWidth(ordinal != 0 ? getBorderStrokeWidthIdle() : getBorderStrokeWidthSelected());
        Paint paint2 = this.A04;
        if (ordinal != 0) {
            f2 = 0.0f;
        }
        paint2.setStrokeWidth(f2);
        this.A00 = ordinal != 0 ? getBorderStrokeWidthIdle() : getBorderStrokeWidthSelected();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        C18450wi.A0H(canvas, 0);
        int width = getWidth() >> 1;
        float f2 = (float) width;
        float height = (float) (getHeight() >> 1);
        float min = (float) (Math.min(C13680ns.A04(this), C13680ns.A03(this)) >> 1);
        canvas.drawCircle(f2, height, min, this.A02);
        super.onDraw(canvas);
        Paint paint = this.A04;
        if (paint.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(f2, height, min - this.A00, paint);
        }
        canvas.drawCircle(f2, height, min, this.A03);
    }

    public void onMeasure(int i2, int i3) {
        int defaultSize;
        int i4 = this.A01;
        if (i4 == 0) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2);
        } else if (i4 == 1) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumHeight(), i3);
        } else {
            throw AnonymousClass000.A0T(C18450wi.A06("Illegal value: ", Integer.valueOf(i4)));
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public final void setAvatarPoseBackgroundColor(int i2) {
        this.A02.setColor(i2);
        invalidate();
    }

    public final void setAvatarPoseBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
