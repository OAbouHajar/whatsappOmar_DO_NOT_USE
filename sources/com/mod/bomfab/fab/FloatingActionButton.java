package com.mod.bomfab.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.mod.ColorTools.ColorManager;
import com.mod.bomfab.R$styleable;
import com.mod.bomfab.utils.Tools;
import com.mod.tools.utils.Prefs;

public class FloatingActionButton extends ImageButton {
    private static final int BAR_MAX_LENGTH = 270;
    private static final double BAR_SPIN_CYCLE_TIME = 500.0d;
    private static final long PAUSE_GROWING_TIME = 200;
    /* access modifiers changed from: private */
    public static final Xfermode PORTER_DUFF_CLEAR = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private boolean mAnimateProgress;
    private Drawable mBackgroundDrawable;
    private Paint mBackgroundPaint;
    private float mBarExtraLength;
    private boolean mBarGrowingFromFront;
    private int mBarLength;
    private boolean mButtonPositionSaved;
    /* access modifiers changed from: private */
    public View.OnClickListener mClickListener;
    private int mColorDisabled;
    /* access modifiers changed from: private */
    public int mColorNormal;
    private int mColorPressed;
    private int mColorRipple;
    private float mCurrentProgress;
    int mFabSize;
    GestureDetector mGestureDetector;
    private Animation mHideAnimation;
    private Drawable mIcon;
    private int mIconSize;
    private String mLabelText;
    private long mLastTimeAnimated;
    private float mOriginalX;
    private float mOriginalY;
    private long mPausedTimeWithoutGrowing;
    private int mProgress;
    private int mProgressBackgroundColor;
    /* access modifiers changed from: private */
    public boolean mProgressBarEnabled;
    private RectF mProgressCircleBounds;
    private int mProgressColor;
    private boolean mProgressIndeterminate;
    private int mProgressMax;
    private Paint mProgressPaint;
    /* access modifiers changed from: private */
    public int mProgressWidth;
    int mShadowColor;
    int mShadowRadius;
    int mShadowXOffset;
    int mShadowYOffset;
    private boolean mShouldProgressIndeterminate;
    private boolean mShouldSetProgress;
    private boolean mShouldUpdateButtonPosition;
    private Animation mShowAnimation;
    /* access modifiers changed from: private */
    public boolean mShowProgressBackground;
    boolean mShowShadow;
    private float mSpinSpeed;
    private float mTargetProgress;
    private double mTimeStartGrowing;
    private boolean mUsingElevation;
    private boolean mUsingElevationCompat;

    private class CircleDrawable extends ShapeDrawable {
        private int circleInsetHorizontal;
        private int circleInsetVertical;
        private final FloatingActionButton this$0;

        CircleDrawable(FloatingActionButton floatingActionButton) {
            this.this$0 = floatingActionButton;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CircleDrawable(FloatingActionButton floatingActionButton, Shape shape) {
            super(shape);
            int i2 = 0;
            this.this$0 = floatingActionButton;
            this.circleInsetHorizontal = this.this$0.hasShadow() ? this.this$0.mShadowRadius + Math.abs(this.this$0.mShadowXOffset) : 0;
            this.circleInsetVertical = this.this$0.hasShadow() ? Math.abs(this.this$0.mShadowYOffset) + this.this$0.mShadowRadius : i2;
            if (this.this$0.mProgressBarEnabled) {
                this.circleInsetHorizontal += this.this$0.mProgressWidth;
                this.circleInsetVertical += this.this$0.mProgressWidth;
            }
        }

        static FloatingActionButton access$0(CircleDrawable circleDrawable) {
            return circleDrawable.this$0;
        }

        @Override
        public void draw(Canvas canvas) {
            setBounds(this.circleInsetHorizontal, this.circleInsetVertical, this.this$0.calculateMeasuredWidth() - this.circleInsetHorizontal, this.this$0.calculateMeasuredHeight() - this.circleInsetVertical);
            super.draw(canvas);
        }
    }

    static class ProgressSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<ProgressSavedState> CREATOR = new Parcelable.Creator<ProgressSavedState>() {
            public ProgressSavedState createFromParcel(Parcel parcel) {
                return new ProgressSavedState(parcel);
            }

            public /* bridge */ Object createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public ProgressSavedState[] newArray(int i2) {
                return new ProgressSavedState[i2];
            }

            public /* bridge */ Object[] newArray(int i2) {
                return newArray(i2);
            }
        };
        boolean mAnimateProgress;
        float mCurrentProgress;
        int mProgress;
        int mProgressBackgroundColor;
        boolean mProgressBarEnabled;
        boolean mProgressBarVisibilityChanged;
        int mProgressColor;
        boolean mProgressIndeterminate;
        int mProgressWidth;
        boolean mShouldProgressIndeterminate;
        boolean mShouldSetProgress;
        boolean mShowProgressBackground;
        float mSpinSpeed;
        float mTargetProgress;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ProgressSavedState(Parcel parcel) {
            super(parcel);
            boolean z2 = false;
            this.mCurrentProgress = parcel.readFloat();
            this.mTargetProgress = parcel.readFloat();
            this.mProgressBarEnabled = parcel.readInt() != 0;
            this.mSpinSpeed = parcel.readFloat();
            this.mProgress = parcel.readInt();
            this.mProgressWidth = parcel.readInt();
            this.mProgressColor = parcel.readInt();
            this.mProgressBackgroundColor = parcel.readInt();
            this.mProgressBarVisibilityChanged = parcel.readInt() != 0;
            this.mProgressIndeterminate = parcel.readInt() != 0;
            this.mShouldProgressIndeterminate = parcel.readInt() != 0;
            this.mShouldSetProgress = parcel.readInt() != 0;
            this.mAnimateProgress = parcel.readInt() != 0;
            this.mShowProgressBackground = parcel.readInt() != 0 ? true : z2;
        }

        ProgressSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i2) {
            int i3 = 1;
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.mCurrentProgress);
            parcel.writeFloat(this.mTargetProgress);
            parcel.writeInt(this.mProgressBarEnabled ? 1 : 0);
            parcel.writeFloat(this.mSpinSpeed);
            parcel.writeInt(this.mProgress);
            parcel.writeInt(this.mProgressWidth);
            parcel.writeInt(this.mProgressColor);
            parcel.writeInt(this.mProgressBackgroundColor);
            parcel.writeInt(this.mProgressBarVisibilityChanged ? 1 : 0);
            parcel.writeInt(this.mProgressIndeterminate ? 1 : 0);
            parcel.writeInt(this.mShouldProgressIndeterminate ? 1 : 0);
            parcel.writeInt(this.mShouldSetProgress ? 1 : 0);
            parcel.writeInt(this.mAnimateProgress ? 1 : 0);
            if (!this.mShowProgressBackground) {
                i3 = 0;
            }
            parcel.writeInt(i3);
        }
    }

    private class Shadow extends Drawable {
        private Paint mErase = new Paint(1);
        private Paint mPaint = new Paint(1);
        private float mRadius;
        private final FloatingActionButton this$0;

        Shadow(FloatingActionButton floatingActionButton) {
            this.this$0 = floatingActionButton;
            init();
        }

        static FloatingActionButton access$0(Shadow shadow) {
            return shadow.this$0;
        }

        private void init() {
            this.this$0.setLayerType(1, (Paint) null);
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setColor(this.this$0.mColorNormal);
            this.mErase.setXfermode(FloatingActionButton.PORTER_DUFF_CLEAR);
            if (!this.this$0.isInEditMode()) {
                this.mPaint.setShadowLayer((float) this.this$0.mShadowRadius, (float) this.this$0.mShadowXOffset, (float) this.this$0.mShadowYOffset, this.this$0.mShadowColor);
            }
            this.mRadius = (float) (this.this$0.getCircleSize() / 2);
            if (this.this$0.mProgressBarEnabled && this.this$0.mShowProgressBackground) {
                this.mRadius += (float) this.this$0.mProgressWidth;
            }
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawCircle(this.this$0.calculateCenterX(), this.this$0.calculateCenterY(), this.mRadius, this.mPaint);
            canvas.drawCircle(this.this$0.calculateCenterX(), this.this$0.calculateCenterY(), this.mRadius, this.mErase);
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

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
        initHide(context);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        initHide(context);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initHide(context);
        this.mShadowRadius = Util.dpToPx(getContext(), 4.0f);
        this.mShadowXOffset = Util.dpToPx(getContext(), 1.0f);
        this.mShadowYOffset = Util.dpToPx(getContext(), 3.0f);
        this.mIconSize = Util.dpToPx(getContext(), 24.0f);
        this.mProgressWidth = Util.dpToPx(getContext(), 6.0f);
        this.mOriginalX = (float) -1;
        this.mOriginalY = (float) -1;
        this.mProgressCircleBounds = new RectF();
        this.mBackgroundPaint = new Paint(1);
        this.mProgressPaint = new Paint(1);
        this.mSpinSpeed = 195.0f;
        this.mPausedTimeWithoutGrowing = (long) 0;
        this.mBarGrowingFromFront = true;
        this.mBarLength = 16;
        this.mProgressMax = 100;
        this.mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener(this) {
            private final FloatingActionButton this$0;

            {
                this.this$0 = r1;
            }

            static FloatingActionButton access$0(AnonymousClass100000001 r1) {
                return r1.this$0;
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                Label label = (Label) this.this$0.getTag(Tools.intId("fab_label"));
                if (label != null) {
                    label.onActionDown();
                }
                this.this$0.onActionDown();
                return super.onDown(motionEvent);
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Label label = (Label) this.this$0.getTag(Tools.intId("fab_label"));
                if (label != null) {
                    label.onActionUp();
                }
                this.this$0.onActionUp();
                return super.onSingleTapUp(motionEvent);
            }
        });
        init(context, attributeSet, i2);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mShadowRadius = Util.dpToPx(getContext(), 4.0f);
        this.mShadowXOffset = Util.dpToPx(getContext(), 1.0f);
        this.mShadowYOffset = Util.dpToPx(getContext(), 3.0f);
        this.mIconSize = Util.dpToPx(getContext(), 24.0f);
        this.mProgressWidth = Util.dpToPx(getContext(), 6.0f);
        this.mOriginalX = (float) -1;
        this.mOriginalY = (float) -1;
        this.mProgressCircleBounds = new RectF();
        this.mBackgroundPaint = new Paint(1);
        this.mProgressPaint = new Paint(1);
        this.mSpinSpeed = 195.0f;
        this.mPausedTimeWithoutGrowing = (long) 0;
        this.mBarGrowingFromFront = true;
        this.mBarLength = 16;
        this.mProgressMax = 100;
        this.mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener(this) {
            private final FloatingActionButton this$0;

            {
                this.this$0 = r1;
            }

            static FloatingActionButton access$0(AnonymousClass100000001 r1) {
                return r1.this$0;
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                Label label = (Label) this.this$0.getTag(Tools.intId("fab_label"));
                if (label != null) {
                    label.onActionDown();
                }
                this.this$0.onActionDown();
                return super.onDown(motionEvent);
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Label label = (Label) this.this$0.getTag(Tools.intId("fab_label"));
                if (label != null) {
                    label.onActionUp();
                }
                this.this$0.onActionUp();
                return super.onSingleTapUp(motionEvent);
            }
        });
        init(context, attributeSet, i2);
    }

    /* access modifiers changed from: private */
    public float calculateCenterX() {
        return (float) (getMeasuredWidth() / 2);
    }

    /* access modifiers changed from: private */
    public float calculateCenterY() {
        return (float) (getMeasuredHeight() / 2);
    }

    /* access modifiers changed from: private */
    public int calculateMeasuredHeight() {
        int circleSize = getCircleSize() + calculateShadowHeight();
        return this.mProgressBarEnabled ? circleSize + (this.mProgressWidth * 2) : circleSize;
    }

    /* access modifiers changed from: private */
    public int calculateMeasuredWidth() {
        int circleSize = getCircleSize() + calculateShadowWidth();
        return this.mProgressBarEnabled ? circleSize + (this.mProgressWidth * 2) : circleSize;
    }

    private Drawable createCircleDrawable(int i2) {
        CircleDrawable circleDrawable = new CircleDrawable(this, new OvalShape());
        circleDrawable.getPaint().setColor(i2);
        return circleDrawable;
    }

    @TargetApi(21)
    private Drawable createFillDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, createCircleDrawable(this.mColorDisabled));
        stateListDrawable.addState(new int[]{16842919}, createCircleDrawable(this.mColorPressed));
        stateListDrawable.addState(new int[0], createCircleDrawable(this.mColorNormal));
        if (Util.hasLollipop()) {
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.mColorRipple}), stateListDrawable, (Drawable) null);
            setOutlineProvider(new ViewOutlineProvider(this) {
                private final FloatingActionButton this$0;

                {
                    this.this$0 = r1;
                }

                static FloatingActionButton access$0(AnonymousClass100000000 r1) {
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

    /* access modifiers changed from: private */
    public int getCircleSize() {
        return getResources().getDimensionPixelSize(this.mFabSize == 0 ? Tools.intDimen("fab_size_normal") : Tools.intDimen("fab_size_mini"));
    }

    private int getShadowX() {
        return this.mShadowRadius + Math.abs(this.mShadowXOffset);
    }

    private int getShadowY() {
        return this.mShadowRadius + Math.abs(this.mShadowYOffset);
    }

    private void init(Context context, AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton, i2, 0);
        Context context2 = getContext();
        this.mColorNormal = ColorManager.getPrimaryColor();
        Context context3 = getContext();
        this.mColorPressed = ColorManager.getPrimaryColor();
        Context context4 = getContext();
        this.mColorDisabled = ColorManager.getPrimaryColor();
        Context context5 = getContext();
        this.mColorRipple = ColorManager.getPrimaryColor();
        this.mShowShadow = true;
        this.mShadowColor = 1711276032;
        this.mFabSize = 1;
        this.mLabelText = obtainStyledAttributes.getString(12);
        this.mShouldProgressIndeterminate = false;
        initShowAnimation();
        initHideAnimation();
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            if (this.mShouldProgressIndeterminate) {
                setIndeterminate(true);
            } else if (this.mShouldSetProgress) {
                saveButtonOriginalPosition();
                setProgress(this.mProgress, false);
            }
        }
        setClickable(true);
    }

    private void initHide(Context context) {
        if (Prefs.getBoolean("naljaede_key_fab_caht", false)) {
            setVisibility(8);
        }
    }

    private void initHideAnimation() {
        this.mHideAnimation = AnimationUtils.loadAnimation(getContext(), Tools.intAnim("fab_scale_down"));
    }

    private void initShowAnimation() {
        this.mShowAnimation = AnimationUtils.loadAnimation(getContext(), Tools.intAnim("fab_scale_up"));
    }

    private void saveButtonOriginalPosition() {
        if (!this.mButtonPositionSaved) {
            if (this.mOriginalX == ((float) -1)) {
                this.mOriginalX = getX();
            }
            if (this.mOriginalY == ((float) -1)) {
                this.mOriginalY = getY();
            }
            this.mButtonPositionSaved = true;
        }
    }

    @SuppressWarnings("deprecation")
    @TargetApi(16)
    private void setBackgroundCompat(Drawable drawable) {
        if (Util.hasJellyBean()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    private void setupProgressBarPaints() {
        this.mBackgroundPaint.setColor(this.mProgressBackgroundColor);
        this.mBackgroundPaint.setStyle(Paint.Style.STROKE);
        this.mBackgroundPaint.setStrokeWidth((float) this.mProgressWidth);
        this.mProgressPaint.setColor(this.mProgressColor);
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setStrokeWidth((float) this.mProgressWidth);
    }

    private void setupProgressBounds() {
        int i2 = 0;
        int shadowX = hasShadow() ? getShadowX() : 0;
        if (hasShadow()) {
            i2 = getShadowY();
        }
        this.mProgressCircleBounds = new RectF((float) ((this.mProgressWidth / 2) + shadowX), (float) ((this.mProgressWidth / 2) + i2), (float) ((calculateMeasuredWidth() - shadowX) - (this.mProgressWidth / 2)), (float) ((calculateMeasuredHeight() - i2) - (this.mProgressWidth / 2)));
    }

    private void updateButtonPosition() {
        float f2;
        float f3;
        if (this.mProgressBarEnabled) {
            f2 = this.mOriginalX > getX() ? getX() + ((float) this.mProgressWidth) : getX() - ((float) this.mProgressWidth);
            f3 = this.mOriginalY > getY() ? getY() + ((float) this.mProgressWidth) : getY() - ((float) this.mProgressWidth);
        } else {
            f2 = this.mOriginalX;
            f3 = this.mOriginalY;
        }
        setX(f2);
        setY(f3);
    }

    private void updateProgressLength(long j2) {
        boolean z2 = false;
        if (this.mPausedTimeWithoutGrowing >= PAUSE_GROWING_TIME) {
            this.mTimeStartGrowing += (double) j2;
            if (this.mTimeStartGrowing > BAR_SPIN_CYCLE_TIME) {
                this.mTimeStartGrowing -= BAR_SPIN_CYCLE_TIME;
                this.mPausedTimeWithoutGrowing = (long) 0;
                if (!this.mBarGrowingFromFront) {
                    z2 = true;
                }
                this.mBarGrowingFromFront = z2;
            }
            float cos = (((float) Math.cos(((this.mTimeStartGrowing / BAR_SPIN_CYCLE_TIME) + ((double) 1)) * 3.141592653589793d)) / ((float) 2)) + 0.5f;
            float f2 = (float) (270 - this.mBarLength);
            if (this.mBarGrowingFromFront) {
                this.mBarExtraLength = cos * f2;
                return;
            }
            float f3 = (((float) 1) - cos) * f2;
            this.mCurrentProgress += this.mBarExtraLength - f3;
            this.mBarExtraLength = f3;
            return;
        }
        this.mPausedTimeWithoutGrowing += j2;
    }

    /* access modifiers changed from: package-private */
    public int calculateShadowHeight() {
        if (hasShadow()) {
            return getShadowY() * 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int calculateShadowWidth() {
        if (hasShadow()) {
            return getShadowX() * 2;
        }
        return 0;
    }

    public int getButtonSize() {
        return this.mFabSize;
    }

    public int getColorDisabled() {
        return this.mColorDisabled;
    }

    public int getColorNormal() {
        return this.mColorNormal;
    }

    public int getColorPressed() {
        return this.mColorPressed;
    }

    public int getColorRipple() {
        return this.mColorRipple;
    }

    /* access modifiers changed from: package-private */
    public Animation getHideAnimation() {
        return this.mHideAnimation;
    }

    /* access modifiers changed from: protected */
    public Drawable getIconDrawable() {
        return this.mIcon != null ? this.mIcon : new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    /* access modifiers changed from: package-private */
    public Label getLabelView() {
        return (Label) getTag(Tools.intId("fab_label"));
    }

    public int getLabelVisibility() {
        Label labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public synchronized int getMax() {
        return this.mProgressMax;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener getOnClickListener() {
        return this.mClickListener;
    }

    public synchronized int getProgress() {
        return this.mProgressIndeterminate ? 0 : this.mProgress;
    }

    public int getShadowColor() {
        return this.mShadowColor;
    }

    public int getShadowRadius() {
        return this.mShadowRadius;
    }

    public int getShadowXOffset() {
        return this.mShadowXOffset;
    }

    public int getShadowYOffset() {
        return this.mShadowYOffset;
    }

    /* access modifiers changed from: package-private */
    public Animation getShowAnimation() {
        return this.mShowAnimation;
    }

    public boolean hasShadow() {
        return !this.mUsingElevation && this.mShowShadow;
    }

    public void hide(boolean z2) {
        if (!isHidden()) {
            if (z2) {
                playHideAnimation();
            }
            super.setVisibility(4);
        }
    }

    public void hideButtonInMenu(boolean z2) {
        if (!isHidden() && getVisibility() != 8) {
            hide(z2);
            Label labelView = getLabelView();
            if (labelView != null) {
                labelView.hide(z2);
            }
            getHideAnimation().setAnimationListener(new Animation.AnimationListener(this) {
                private final FloatingActionButton this$0;

                {
                    this.this$0 = r1;
                }

                static FloatingActionButton access$0(AnonymousClass100000004 r1) {
                    return r1.this$0;
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    this.this$0.setVisibility(8);
                    this.this$0.getHideAnimation().setAnimationListener((Animation.AnimationListener) null);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                }

                @Override
                public void onAnimationStart(Animation animation) {
                }
            });
        }
    }

    public synchronized void hideProgress() {
        this.mProgressBarEnabled = false;
        this.mShouldUpdateButtonPosition = true;
        updateBackground();
    }

    public boolean isHidden() {
        return getVisibility() == 4;
    }

    public synchronized boolean isProgressBackgroundShown() {
        return this.mShowProgressBackground;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    public void onActionDown() {
        if (this.mBackgroundDrawable instanceof StateListDrawable) {
            ((StateListDrawable) this.mBackgroundDrawable).setState(new int[]{16842910, 16842919});
        } else if (Util.hasLollipop()) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.mBackgroundDrawable;
            rippleDrawable.setState(new int[]{16842910, 16842919});
            rippleDrawable.setHotspot(calculateCenterX(), calculateCenterY());
            rippleDrawable.setVisible(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    public void onActionUp() {
        if (this.mBackgroundDrawable instanceof StateListDrawable) {
            ((StateListDrawable) this.mBackgroundDrawable).setState(new int[]{16842910});
        } else if (Util.hasLollipop()) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.mBackgroundDrawable;
            rippleDrawable.setState(new int[]{16842910});
            rippleDrawable.setHotspot(calculateCenterX(), calculateCenterY());
            rippleDrawable.setVisible(true, true);
        }
    }

    /* access modifiers changed from: protected */
    @Override
    public void onDraw(Canvas canvas) {
        boolean z2 = true;
        super.onDraw(canvas);
        if (this.mProgressBarEnabled) {
            if (this.mShowProgressBackground) {
                canvas.drawArc(this.mProgressCircleBounds, (float) 360, (float) 360, false, this.mBackgroundPaint);
            }
            if (this.mProgressIndeterminate) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.mLastTimeAnimated;
                updateProgressLength(uptimeMillis);
                this.mCurrentProgress += (((float) uptimeMillis) * this.mSpinSpeed) / 1000.0f;
                if (this.mCurrentProgress > 360.0f) {
                    this.mCurrentProgress -= 360.0f;
                }
                this.mLastTimeAnimated = SystemClock.uptimeMillis();
                float f2 = this.mCurrentProgress - ((float) 90);
                float f3 = ((float) this.mBarLength) + this.mBarExtraLength;
                if (isInEditMode()) {
                    f2 = (float) 0;
                    f3 = (float) 135;
                }
                canvas.drawArc(this.mProgressCircleBounds, f2, f3, false, this.mProgressPaint);
            } else {
                if (this.mCurrentProgress != this.mTargetProgress) {
                    float uptimeMillis2 = (((float) (SystemClock.uptimeMillis() - this.mLastTimeAnimated)) / ((float) 1000)) * this.mSpinSpeed;
                    if (this.mCurrentProgress > this.mTargetProgress) {
                        this.mCurrentProgress = Math.max(this.mCurrentProgress - uptimeMillis2, this.mTargetProgress);
                    } else {
                        this.mCurrentProgress = Math.min(uptimeMillis2 + this.mCurrentProgress, this.mTargetProgress);
                    }
                    this.mLastTimeAnimated = SystemClock.uptimeMillis();
                } else {
                    z2 = false;
                }
                canvas.drawArc(this.mProgressCircleBounds, (float) -90, this.mCurrentProgress, false, this.mProgressPaint);
            }
            if (z2) {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(calculateMeasuredWidth(), calculateMeasuredHeight());
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ProgressSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ProgressSavedState progressSavedState = (ProgressSavedState) parcelable;
        super.onRestoreInstanceState(progressSavedState.getSuperState());
        this.mCurrentProgress = progressSavedState.mCurrentProgress;
        this.mTargetProgress = progressSavedState.mTargetProgress;
        this.mSpinSpeed = progressSavedState.mSpinSpeed;
        this.mProgressWidth = progressSavedState.mProgressWidth;
        this.mProgressColor = progressSavedState.mProgressColor;
        this.mProgressBackgroundColor = progressSavedState.mProgressBackgroundColor;
        this.mShouldProgressIndeterminate = progressSavedState.mShouldProgressIndeterminate;
        this.mShouldSetProgress = progressSavedState.mShouldSetProgress;
        this.mProgress = progressSavedState.mProgress;
        this.mAnimateProgress = progressSavedState.mAnimateProgress;
        this.mShowProgressBackground = progressSavedState.mShowProgressBackground;
        this.mLastTimeAnimated = SystemClock.uptimeMillis();
    }

    @Override
    public Parcelable onSaveInstanceState() {
        ProgressSavedState progressSavedState = new ProgressSavedState(super.onSaveInstanceState());
        progressSavedState.mCurrentProgress = this.mCurrentProgress;
        progressSavedState.mTargetProgress = this.mTargetProgress;
        progressSavedState.mSpinSpeed = this.mSpinSpeed;
        progressSavedState.mProgressWidth = this.mProgressWidth;
        progressSavedState.mProgressColor = this.mProgressColor;
        progressSavedState.mProgressBackgroundColor = this.mProgressBackgroundColor;
        progressSavedState.mShouldProgressIndeterminate = this.mProgressIndeterminate;
        progressSavedState.mShouldSetProgress = this.mProgressBarEnabled && this.mProgress > 0 && !this.mProgressIndeterminate;
        progressSavedState.mProgress = this.mProgress;
        progressSavedState.mAnimateProgress = this.mAnimateProgress;
        progressSavedState.mShowProgressBackground = this.mShowProgressBackground;
        return progressSavedState;
    }

    /* access modifiers changed from: protected */
    @Override
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        saveButtonOriginalPosition();
        if (this.mShouldProgressIndeterminate) {
            setIndeterminate(true);
            this.mShouldProgressIndeterminate = false;
        } else if (this.mShouldSetProgress) {
            setProgress(this.mProgress, this.mAnimateProgress);
            this.mShouldSetProgress = false;
        } else if (this.mShouldUpdateButtonPosition) {
            updateButtonPosition();
            this.mShouldUpdateButtonPosition = false;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        setupProgressBounds();
        setupProgressBarPaints();
        updateBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mClickListener != null && isEnabled()) {
            Label label = (Label) getTag(Tools.intId("fab_label"));
            if (label == null) {
                return super.onTouchEvent(motionEvent);
            }
            switch (motionEvent.getAction()) {
                case 1:
                    if (label != null) {
                        label.onActionUp();
                    }
                    onActionUp();
                    break;
                case 3:
                    if (label != null) {
                        label.onActionUp();
                    }
                    onActionUp();
                    break;
            }
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void playHideAnimation() {
        this.mShowAnimation.cancel();
        startAnimation(this.mHideAnimation);
    }

    /* access modifiers changed from: package-private */
    public void playShowAnimation() {
        this.mHideAnimation.cancel();
        startAnimation(this.mShowAnimation);
    }

    public void setButtonSize(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Use @FabSize constants only!");
        } else if (this.mFabSize != i2) {
            this.mFabSize = i2;
            updateBackground();
        }
    }

    public void setColorDisabled(int i2) {
        if (i2 != this.mColorDisabled) {
            this.mColorDisabled = i2;
            updateBackground();
        }
    }

    public void setColorDisabledResId(int i2) {
        setColorDisabled(getResources().getColor(i2));
    }

    public void setColorNormal(int i2) {
        if (this.mColorNormal != i2) {
            this.mColorNormal = i2;
            updateBackground();
        }
    }

    public void setColorNormalResId(int i2) {
        setColorNormal(getResources().getColor(i2));
    }

    public void setColorPressed(int i2) {
        if (i2 != this.mColorPressed) {
            this.mColorPressed = i2;
            updateBackground();
        }
    }

    public void setColorPressedResId(int i2) {
        setColorPressed(getResources().getColor(i2));
    }

    public void setColorRipple(int i2) {
        if (i2 != this.mColorRipple) {
            this.mColorRipple = i2;
            updateBackground();
        }
    }

    public void setColorRippleResId(int i2) {
        setColorRipple(getResources().getColor(i2));
    }

    /* access modifiers changed from: package-private */
    public void setColors(int i2, int i3, int i4) {
        this.mColorNormal = i2;
        this.mColorPressed = i3;
        this.mColorRipple = i4;
    }

    @Override
    public void setElevation(float f2) {
        if (Util.hasLollipop() && f2 > ((float) 0)) {
            super.setElevation(f2);
            if (!isInEditMode()) {
                this.mUsingElevation = true;
                this.mShowShadow = false;
            }
            updateBackground();
        }
    }

    @TargetApi(21)
    public void setElevationCompat(float f2) {
        this.mShadowColor = 637534208;
        this.mShadowRadius = Math.round(f2 / ((float) 2));
        this.mShadowXOffset = 0;
        this.mShadowYOffset = Math.round(this.mFabSize == 0 ? f2 : f2 / ((float) 2));
        if (Util.hasLollipop()) {
            super.setElevation(f2);
            this.mUsingElevationCompat = true;
            this.mShowShadow = false;
            updateBackground();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.mShowShadow = true;
        updateBackground();
    }

    @Override
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        Label label = (Label) getTag(Tools.intId("fab_label"));
        if (label != null) {
            label.setEnabled(z2);
        }
    }

    public void setHideAnimation(Animation animation) {
        this.mHideAnimation = animation;
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            this.mIcon.setColorFilter(Tools.fabIconColor(getContext()), PorterDuff.Mode.SRC_IN);
            updateBackground();
        }
    }

    @Override
    public void setImageResource(int i2) {
        Drawable drawable = getResources().getDrawable(i2);
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            updateBackground();
        }
    }

    public synchronized void setIndeterminate(boolean z2) {
        if (!z2) {
            this.mCurrentProgress = 0.0f;
        }
        this.mProgressBarEnabled = z2;
        this.mShouldUpdateButtonPosition = true;
        this.mProgressIndeterminate = z2;
        this.mLastTimeAnimated = SystemClock.uptimeMillis();
        setupProgressBounds();
        updateBackground();
    }

    public void setLabelColors(int i2, int i3, int i4) {
        Label labelView = getLabelView();
        int paddingLeft = labelView.getPaddingLeft();
        int paddingTop = labelView.getPaddingTop();
        int paddingRight = labelView.getPaddingRight();
        int paddingBottom = labelView.getPaddingBottom();
        labelView.setColors(i2, i3, i4);
        labelView.updateBackground();
        labelView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
        Label labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setLabelTextColor(int i2) {
        getLabelView().setTextColor(i2);
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        getLabelView().setTextColor(colorStateList);
    }

    public void setLabelVisibility(int i2) {
        Label labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i2);
            labelView.setHandleVisibilityChanges(i2 == 0);
        }
    }

    @TargetApi(21)
    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.mUsingElevationCompat) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += getShadowX();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += getShadowY();
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += getShadowX();
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += getShadowY();
        }
        super.setLayoutParams(layoutParams);
    }

    public synchronized void setMax(int i2) {
        this.mProgressMax = i2;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.mClickListener = onClickListener;
        View view = (View) getTag(Tools.intId("fab_label"));
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener(this) {
                private final FloatingActionButton this$0;

                {
                    this.this$0 = r1;
                }

                static FloatingActionButton access$0(AnonymousClass100000003 r1) {
                    return r1.this$0;
                }

                @Override
                public void onClick(View view) {
                    if (this.this$0.mClickListener != null) {
                        this.this$0.mClickListener.onClick(this.this$0);
                    }
                }
            });
        }
    }

    public synchronized void setProgress(int i2, boolean z2) {
        if (!this.mProgressIndeterminate) {
            this.mProgress = i2;
            this.mAnimateProgress = z2;
            if (!this.mButtonPositionSaved) {
                this.mShouldSetProgress = true;
            } else {
                this.mProgressBarEnabled = true;
                this.mShouldUpdateButtonPosition = true;
                setupProgressBounds();
                saveButtonOriginalPosition();
                updateBackground();
                if (i2 < 0) {
                    i2 = 0;
                } else if (i2 > this.mProgressMax) {
                    i2 = this.mProgressMax;
                }
                if (((float) i2) != this.mTargetProgress) {
                    this.mTargetProgress = this.mProgressMax > 0 ? (((float) i2) / ((float) this.mProgressMax)) * ((float) 360) : (float) 0;
                    this.mLastTimeAnimated = SystemClock.uptimeMillis();
                    if (!z2) {
                        this.mCurrentProgress = this.mTargetProgress;
                    }
                    invalidate();
                }
            }
        }
    }

    public void setShadowColor(int i2) {
        if (this.mShadowColor != i2) {
            this.mShadowColor = i2;
            updateBackground();
        }
    }

    public void setShadowColorResource(int i2) {
        int color = getResources().getColor(i2);
        if (this.mShadowColor != color) {
            this.mShadowColor = color;
            updateBackground();
        }
    }

    public void setShadowRadius(float f2) {
        this.mShadowRadius = Util.dpToPx(getContext(), f2);
        requestLayout();
        updateBackground();
    }

    public void setShadowRadius(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        if (this.mShadowRadius != dimensionPixelSize) {
            this.mShadowRadius = dimensionPixelSize;
            requestLayout();
            updateBackground();
        }
    }

    public void setShadowXOffset(float f2) {
        this.mShadowXOffset = Util.dpToPx(getContext(), f2);
        requestLayout();
        updateBackground();
    }

    public void setShadowXOffset(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        if (this.mShadowXOffset != dimensionPixelSize) {
            this.mShadowXOffset = dimensionPixelSize;
            requestLayout();
            updateBackground();
        }
    }

    public void setShadowYOffset(float f2) {
        this.mShadowYOffset = Util.dpToPx(getContext(), f2);
        requestLayout();
        updateBackground();
    }

    public void setShadowYOffset(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        if (this.mShadowYOffset != dimensionPixelSize) {
            this.mShadowYOffset = dimensionPixelSize;
            requestLayout();
            updateBackground();
        }
    }

    public void setShowAnimation(Animation animation) {
        this.mShowAnimation = animation;
    }

    public synchronized void setShowProgressBackground(boolean z2) {
        this.mShowProgressBackground = z2;
    }

    public void setShowShadow(boolean z2) {
        if (!this.mShowShadow) {
            if (!z2) {
                return;
            }
        } else if (z2) {
            return;
        }
        this.mShowShadow = z2;
        updateBackground();
    }

    @Override
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        Label label = (Label) getTag(Tools.intId("fab_label"));
        if (label != null) {
            label.setVisibility(i2);
        }
    }

    public void show(boolean z2) {
        if (isHidden()) {
            if (z2) {
                playShowAnimation();
            }
            super.setVisibility(0);
        }
    }

    public void showButtonInMenu(boolean z2) {
        if (getVisibility() != 0) {
            setVisibility(4);
            show(z2);
            Label labelView = getLabelView();
            if (labelView != null) {
                labelView.show(z2);
            }
        }
    }

    public void toggle(boolean z2) {
        if (isHidden()) {
            show(z2);
        } else {
            hide(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateBackground() {
        int i2;
        int i3;
        int i4 = 0;
        LayerDrawable layerDrawable = hasShadow() ? new LayerDrawable(new Drawable[]{new Shadow(this), createFillDrawable(), getIconDrawable()}) : new LayerDrawable(new Drawable[]{createFillDrawable(), getIconDrawable()});
        int i5 = -1;
        if (getIconDrawable() != null) {
            i5 = Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight());
        }
        int circleSize = getCircleSize();
        if (i5 <= 0) {
            i5 = this.mIconSize;
        }
        int i6 = (circleSize - i5) / 2;
        int abs = hasShadow() ? this.mShadowRadius + Math.abs(this.mShadowXOffset) : 0;
        if (hasShadow()) {
            i4 = this.mShadowRadius + Math.abs(this.mShadowYOffset);
        }
        if (this.mProgressBarEnabled) {
            int i7 = abs + this.mProgressWidth;
            i2 = i4 + this.mProgressWidth;
            i3 = i7;
        } else {
            i2 = i4;
            i3 = abs;
        }
        layerDrawable.setLayerInset(hasShadow() ? 2 : 1, i3 + i6, i2 + i6, i3 + i6, i2 + i6);
        setBackgroundCompat(layerDrawable);
    }
}
