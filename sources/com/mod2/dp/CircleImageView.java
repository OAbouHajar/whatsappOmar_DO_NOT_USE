package com.mod2.dp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.bbm.ui.GifImageView;
import com.mod2.libs.Const;
import com.mod2.libs.TTR;
import com.mod2.libs.TTRPanel;
import com.mod2.libs.TTrigger;

public class CircleImageView extends GifImageView implements TTrigger.OnTriggerEvent {
    public static final int DEFAULT_BORDER_WIDTH = 2;
    public static final int DEFAULT_RADIUS = 0;
    public static final String TAG = "RoundedImageView";
    private Boolean NormallyCircle;
    private Boolean NormallyGrayscale;
    private TTR TR;
    private TTRPanel TRPanel;
    private TTrigger Trigger;
    private Context context;
    private String idCircle;
    private String idCornerRadius;
    private String idGrayscale;
    private String idOwner;
    private Drawable mBackgroundDrawable;
    private ColorStateList mBorderColor;
    private int mBorderWidth;
    private int mCornerRadius;
    private Drawable mDrawable;
    private boolean mOval;
    private int mResource;
    private boolean mRoundBackground;
    private ImageView.ScaleType mScaleType;

    public CircleImageView(Context context2) {
        super(context2);
        this.NormallyCircle = false;
        this.NormallyGrayscale = false;
        this.context = context2;
        InitCircle();
    }

    public CircleImageView(Context context2, AttributeSet attributeSet) {
        this(context2, attributeSet, 0);
        this.context = context2;
        InitCircle();
    }

    public CircleImageView(Context context2, AttributeSet attributeSet, int i2) {
        super(context2, attributeSet, i2);
        this.NormallyCircle = false;
        this.NormallyGrayscale = false;
        this.context = context2;
        InitCircle();
    }

    private Drawable resolveResource() {
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        Drawable drawable = null;
        if (this.mResource != 0) {
            try {
                drawable = resources.getDrawable(this.mResource);
            } catch (Exception e2) {
                Log.w(TAG, "PPLUnable to find resource: " + this.mResource, e2);
                this.mResource = 0;
                return CircleDrawable.fromDrawable((Drawable) null);
            }
        }
        return CircleDrawable.fromDrawable(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r10.mRoundBackground == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAttrs(android.graphics.drawable.Drawable r11, boolean r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0030
            boolean r8 = r11 instanceof com.mod2.dp.CircleDrawable
            if (r8 == 0) goto L_0x0037
            com.mod2.dp.CircleDrawable r11 = (com.mod2.dp.CircleDrawable) r11
            android.widget.ImageView$ScaleType r8 = r10.mScaleType
            com.mod2.dp.CircleDrawable r4 = r11.setScaleType(r8)
            if (r12 == 0) goto L_0x0031
            boolean r8 = r10.mRoundBackground
            if (r8 != 0) goto L_0x0031
            r5 = 0
        L_0x0015:
            float r8 = (float) r5
            com.mod2.dp.CircleDrawable r6 = r4.setCornerRadius(r8)
            if (r12 == 0) goto L_0x0034
            boolean r0 = r10.mRoundBackground
            r7 = 0
            if (r0 != 0) goto L_0x0034
        L_0x0021:
            com.mod2.dp.CircleDrawable r8 = r6.setBorderWidth(r7)
            android.content.res.ColorStateList r9 = r10.mBorderColor
            com.mod2.dp.CircleDrawable r8 = r8.setBorderColors(r9)
            boolean r9 = r10.mOval
            r8.setOval(r9)
        L_0x0030:
            return
        L_0x0031:
            int r5 = r10.mCornerRadius
            goto L_0x0015
        L_0x0034:
            int r7 = r10.mBorderWidth
            goto L_0x0021
        L_0x0037:
            boolean r8 = r11 instanceof android.graphics.drawable.LayerDrawable
            if (r8 == 0) goto L_0x0030
            r1 = r11
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            int r2 = r1.getNumberOfLayers()
            r3 = 0
        L_0x0043:
            if (r3 >= r2) goto L_0x0030
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r3)
            r10.updateAttrs(r8, r12)
            int r3 = r3 + 1
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mod2.dp.CircleImageView.updateAttrs(android.graphics.drawable.Drawable, boolean):void");
    }

    private void updateBackgroundDrawableAttrs() {
        updateAttrs(this.mBackgroundDrawable, true);
    }

    private void updateDrawableAttrs() {
        updateAttrs(this.mDrawable, false);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.view.View, com.mod2.dp.CircleImageView, com.mod2.libs.TTrigger$OnTriggerEvent] */
    public void InitCircle() {
        if (!isInEditMode()) {
            this.TR = new TTR(this.context);
            this.idOwner = "TImage";
            this.Trigger = new TTrigger(this.context, this);
            this.TRPanel = new TTRPanel(this.context, (View) this, this.idOwner, (Boolean) true);
            this.Trigger = this.TRPanel.InitPanel(this.Trigger);
            this.idCircle = String.valueOf(this.idOwner) + ".Circle";
            this.Trigger.setOnTriggerEvent(this.idCircle);
            this.idCornerRadius = String.valueOf(this.idOwner) + ".CornerRadius";
            this.Trigger.setOnTriggerEvent(this.idCornerRadius);
            this.idGrayscale = String.valueOf(this.idOwner) + ".Grayscale";
            this.Trigger.setOnTriggerEvent(this.idGrayscale);
            if (this.TR.FreshSharedVar(this.idCornerRadius).booleanValue()) {
                this.mCornerRadius = Const.TrackBarRadiusDef;
            } else {
                this.mCornerRadius = this.TR.GetSharedInteger(this.idCornerRadius);
            }
            if (this.TR.FreshSharedVar(this.idCircle).booleanValue()) {
                SetShape(this.NormallyCircle);
            } else {
                SetShape(this.TR.GetSharedBool(this.idCircle));
            }
            if (this.TR.FreshSharedVar(this.idGrayscale).booleanValue()) {
                SetImageFilter(this.NormallyGrayscale);
            } else {
                SetImageFilter(this.TR.GetSharedBool(this.idGrayscale));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.ImageView, com.mod2.dp.CircleImageView] */
    public void SetImageFilter(Boolean bool) {
        if (bool.booleanValue()) {
            this.TR.setGrayScale(this);
        } else {
            this.TR.resetImageFilter(this);
        }
    }

    public void SetShape(Boolean bool) {
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mBorderColor = ColorStateList.valueOf(17170444);
        if (bool.booleanValue()) {
            this.mBorderWidth = 2;
            this.mRoundBackground = true;
            this.mOval = true;
        } else {
            this.mBorderWidth = 0;
            this.mRoundBackground = false;
            this.mOval = false;
        }
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        CircleImageView.super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.mBorderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.mBorderColor;
    }

    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    public int getCornerRadius() {
        return this.mCornerRadius;
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public boolean isOval() {
        return this.mOval;
    }

    public boolean isRoundBackground() {
        return this.mRoundBackground;
    }

    public void onTriggered(String str) {
        this.TRPanel.DoTrigger(str);
        if (str.equals(this.idCircle)) {
            SetShape(this.TR.GetSharedBool(this.idCircle));
        }
        if (str.equals(this.idCornerRadius)) {
            Boolean GetSharedBool = this.TR.GetSharedBool(this.idCircle);
            this.mCornerRadius = this.TR.GetSharedInteger(this.idCornerRadius);
            SetShape(GetSharedBool);
        }
        if (str.equals(this.idGrayscale)) {
            SetImageFilter(this.TR.GetSharedBool(this.idGrayscale));
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mBackgroundDrawable = CircleDrawable.fromDrawable(drawable);
        updateBackgroundDrawableAttrs();
        CircleImageView.super.setBackgroundDrawable(this.mBackgroundDrawable);
    }

    public void setBorderColor(int i2) {
        setBorderColors(ColorStateList.valueOf(i2));
    }

    public void setBorderColors(ColorStateList colorStateList) {
        if (!this.mBorderColor.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(17170444);
            }
            this.mBorderColor = colorStateList;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs();
            if (this.mBorderWidth > 0) {
                invalidate();
            }
        }
    }

    public void setBorderWidth(int i2) {
        if (this.mBorderWidth != i2) {
            this.mBorderWidth = i2;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs();
            invalidate();
        }
    }

    public void setCornerRadius(int i2) {
        if (this.mCornerRadius != i2) {
            this.mCornerRadius = i2;
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.mResource = 0;
        this.mDrawable = CircleDrawable.fromBitmap(bitmap);
        updateDrawableAttrs();
        CircleImageView.super.setImageDrawable(this.mDrawable);
    }

    public void setImageDrawable(Drawable drawable) {
        this.mResource = 0;
        this.mDrawable = CircleDrawable.fromDrawable(drawable);
        updateDrawableAttrs();
        CircleImageView.super.setImageDrawable(this.mDrawable);
    }

    public void setImageResource(int i2) {
        if (this.mResource != i2) {
            this.mResource = i2;
            this.mDrawable = resolveResource();
            updateDrawableAttrs();
            CircleImageView.super.setImageDrawable(this.mDrawable);
        }
    }

    public void setImageURI(Uri uri) {
        CircleImageView.super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z2) {
        this.mOval = z2;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs();
        invalidate();
    }

    public void setRoundBackground(boolean z2) {
        if (this.mRoundBackground != z2) {
            this.mRoundBackground = z2;
            updateBackgroundDrawableAttrs();
            invalidate();
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.mScaleType = scaleType;
        CircleImageView.super.setScaleType(ImageView.ScaleType.FIT_XY);
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs();
        invalidate();
    }
}
