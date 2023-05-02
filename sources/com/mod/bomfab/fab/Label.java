package com.mod.bomfab.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.TextView;

public class Label extends TextView {
    /* access modifiers changed from: private */
    public static final Xfermode PORTER_DUFF_CLEAR = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    private Drawable mBackgroundDrawable;
    /* access modifiers changed from: private */
    public int mColorNormal;
    private int mColorPressed;
    private int mColorRipple;
    /* access modifiers changed from: private */
    public int mCornerRadius;
    /* access modifiers changed from: private */
    public FloatingActionButton mFab;
    GestureDetector mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener(this) {
        private final Label this$0;

        {
            this.this$0 = r1;
        }

        static Label access$0(AnonymousClass100000001 r1) {
            return r1.this$0;
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            this.this$0.onActionDown();
            if (this.this$0.mFab != null) {
                this.this$0.mFab.onActionDown();
            }
            return super.onDown(motionEvent);
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.this$0.onActionUp();
            if (this.this$0.mFab != null) {
                this.this$0.mFab.onActionUp();
            }
            return super.onSingleTapUp(motionEvent);
        }
    });
    private boolean mHandleVisibilityChanges = true;
    private Animation mHideAnimation;
    /* access modifiers changed from: private */
    public int mRawHeight;
    /* access modifiers changed from: private */
    public int mRawWidth;
    /* access modifiers changed from: private */
    public int mShadowColor;
    /* access modifiers changed from: private */
    public int mShadowRadius;
    /* access modifiers changed from: private */
    public int mShadowXOffset;
    /* access modifiers changed from: private */
    public int mShadowYOffset;
    private Animation mShowAnimation;
    private boolean mShowShadow = true;
    private boolean mUsingStyle;

    private class Shadow extends Drawable {
        private Paint mErase = new Paint(1);
        private Paint mPaint = new Paint(1);
        private final Label this$0;

        Shadow(Label label) {
            this.this$0 = label;
            init();
        }

        static Label access$0(Shadow shadow) {
            return shadow.this$0;
        }

        private void init() {
            this.this$0.setLayerType(1, (Paint) null);
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setColor(this.this$0.mColorNormal);
            this.mErase.setXfermode(Label.PORTER_DUFF_CLEAR);
            if (!this.this$0.isInEditMode()) {
                this.mPaint.setShadowLayer((float) this.this$0.mShadowRadius, (float) this.this$0.mShadowXOffset, (float) this.this$0.mShadowYOffset, this.this$0.mShadowColor);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            RectF rectF = new RectF((float) (this.this$0.mShadowRadius + Math.abs(this.this$0.mShadowXOffset)), (float) (this.this$0.mShadowRadius + Math.abs(this.this$0.mShadowYOffset)), (float) this.this$0.mRawWidth, (float) this.this$0.mRawHeight);
            canvas.drawRoundRect(rectF, (float) this.this$0.mCornerRadius, (float) this.this$0.mCornerRadius, this.mPaint);
            canvas.drawRoundRect(rectF, (float) this.this$0.mCornerRadius, (float) this.this$0.mCornerRadius, this.mErase);
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i2) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public Label(Context context) {
        super(context);
    }

    public Label(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Label(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private int calculateMeasuredHeight() {
        if (this.mRawHeight == 0) {
            this.mRawHeight = getMeasuredHeight();
        }
        return getMeasuredHeight() + calculateShadowHeight();
    }

    private int calculateMeasuredWidth() {
        if (this.mRawWidth == 0) {
            this.mRawWidth = getMeasuredWidth();
        }
        return getMeasuredWidth() + calculateShadowWidth();
    }

    @TargetApi(21)
    private Drawable createFillDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, createRectDrawable(this.mColorPressed));
        stateListDrawable.addState(new int[0], createRectDrawable(this.mColorNormal));
        if (Util.hasLollipop()) {
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.mColorRipple}), stateListDrawable, (Drawable) null);
            setOutlineProvider(new ViewOutlineProvider(this) {
                private final Label this$0;

                {
                    this.this$0 = r1;
                }

                static Label access$0(AnonymousClass100000000 r1) {
                    return r1.this$0;
                }

                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, view.getWidth(), view.getHeight());
                }
            });
            setClipToOutline(true);
            this.mBackgroundDrawable = rippleDrawable;
            return rippleDrawable;
        }
        this.mBackgroundDrawable = stateListDrawable;
        return stateListDrawable;
    }

    private Drawable createRectDrawable(int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{(float) this.mCornerRadius, (float) this.mCornerRadius, (float) this.mCornerRadius, (float) this.mCornerRadius, (float) this.mCornerRadius, (float) this.mCornerRadius, (float) this.mCornerRadius, (float) this.mCornerRadius}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    private void playHideAnimation() {
        if (this.mHideAnimation != null) {
            this.mShowAnimation.cancel();
            startAnimation(this.mHideAnimation);
        }
    }

    private void playShowAnimation() {
        if (this.mShowAnimation != null) {
            this.mHideAnimation.cancel();
            startAnimation(this.mShowAnimation);
        }
    }

    @SuppressWarnings("deprecation")
    @TargetApi(21)
    private void setBackgroundCompat(Drawable drawable) {
        if (Util.hasJellyBean()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    private void setShadow(FloatingActionButton floatingActionButton) {
        this.mShadowColor = floatingActionButton.getShadowColor();
        this.mShadowRadius = floatingActionButton.getShadowRadius();
        this.mShadowXOffset = floatingActionButton.getShadowXOffset();
        this.mShadowYOffset = floatingActionButton.getShadowYOffset();
        this.mShowShadow = floatingActionButton.hasShadow();
    }

    /* access modifiers changed from: package-private */
    public int calculateShadowHeight() {
        if (this.mShowShadow) {
            return this.mShadowRadius + Math.abs(this.mShadowYOffset);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int calculateShadowWidth() {
        if (this.mShowShadow) {
            return this.mShadowRadius + Math.abs(this.mShadowXOffset);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void hide(boolean z2) {
        if (z2) {
            playHideAnimation();
        }
        setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    public boolean isHandleVisibilityChanges() {
        return this.mHandleVisibilityChanges;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    public void onActionDown() {
        if (this.mUsingStyle) {
            this.mBackgroundDrawable = getBackground();
        }
        if (this.mBackgroundDrawable instanceof StateListDrawable) {
            ((StateListDrawable) this.mBackgroundDrawable).setState(new int[]{16842919});
        } else if (Util.hasLollipop() && (this.mBackgroundDrawable instanceof RippleDrawable)) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.mBackgroundDrawable;
            rippleDrawable.setState(new int[]{16842910, 16842919});
            rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
            rippleDrawable.setVisible(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    public void onActionUp() {
        if (this.mUsingStyle) {
            this.mBackgroundDrawable = getBackground();
        }
        if (this.mBackgroundDrawable instanceof StateListDrawable) {
            ((StateListDrawable) this.mBackgroundDrawable).setState(new int[0]);
        } else if (Util.hasLollipop() && (this.mBackgroundDrawable instanceof RippleDrawable)) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.mBackgroundDrawable;
            rippleDrawable.setState(new int[0]);
            rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
            rippleDrawable.setVisible(true, true);
        }
    }

    /* access modifiers changed from: protected */
    @Override
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(calculateMeasuredWidth(), calculateMeasuredHeight());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mFab == null || this.mFab.getOnClickListener() == null || !this.mFab.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 1:
                onActionUp();
                this.mFab.onActionUp();
                break;
            case 3:
                onActionUp();
                this.mFab.onActionUp();
                break;
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setColors(int i2, int i3, int i4) {
        this.mColorNormal = i2;
        this.mColorPressed = i3;
        this.mColorRipple = i4;
    }

    /* access modifiers changed from: package-private */
    public void setCornerRadius(int i2) {
        this.mCornerRadius = i2;
    }

    /* access modifiers changed from: package-private */
    public void setFab(FloatingActionButton floatingActionButton) {
        this.mFab = floatingActionButton;
        setShadow(floatingActionButton);
    }

    /* access modifiers changed from: package-private */
    public void setHandleVisibilityChanges(boolean z2) {
        this.mHandleVisibilityChanges = z2;
    }

    /* access modifiers changed from: package-private */
    public void setHideAnimation(Animation animation) {
        this.mHideAnimation = animation;
    }

    /* access modifiers changed from: package-private */
    public void setShowAnimation(Animation animation) {
        this.mShowAnimation = animation;
    }

    /* access modifiers changed from: package-private */
    public void setShowShadow(boolean z2) {
        this.mShowShadow = z2;
    }

    /* access modifiers changed from: package-private */
    public void setUsingStyle(boolean z2) {
        this.mUsingStyle = z2;
    }

    /* access modifiers changed from: package-private */
    public void show(boolean z2) {
        if (z2) {
            playShowAnimation();
        }
        setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public void updateBackground() {
        LayerDrawable layerDrawable;
        if (this.mShowShadow) {
            layerDrawable = new LayerDrawable(new Drawable[]{new Shadow(this), createFillDrawable()});
            layerDrawable.setLayerInset(1, this.mShadowRadius + Math.abs(this.mShadowXOffset), this.mShadowRadius + Math.abs(this.mShadowYOffset), this.mShadowRadius + Math.abs(this.mShadowXOffset), this.mShadowRadius + Math.abs(this.mShadowYOffset));
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{createFillDrawable()});
        }
        setBackgroundCompat(layerDrawable);
    }
}
