package com.mod.bomfab.fab;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.mod.ColorTools.ColorManager;
import com.mod.bomfab.utils.Tools;
import java.util.ArrayList;

public class FloatingActionMenu extends ViewGroup {
    private static final int ANIMATION_DURATION = 300;
    private static final float CLOSED_PLUS_ROTATION = 0.0f;
    private static final int LABELS_POSITION_LEFT = 0;
    private static final int LABELS_POSITION_RIGHT = 1;
    private static final float OPENED_PLUS_ROTATION_LEFT = -135.0f;
    private static final float OPENED_PLUS_ROTATION_RIGHT = 135.0f;
    private static final int OPEN_DOWN = 1;
    private static final int OPEN_UP = 0;
    private int mAnimationDelayPerItem;
    private int mBackgroundColor;
    private int mButtonSpacing;
    private int mButtonsCount;
    private AnimatorSet mCloseAnimatorSet;
    private Interpolator mCloseInterpolator;
    private Typeface mCustomTypefaceFromFont;
    private ValueAnimator mHideBackgroundAnimator;
    private Drawable mIcon;
    private boolean mIconAnimated;
    private AnimatorSet mIconToggleSet;
    private ImageView mImageToggle;
    private Animation mImageToggleHideAnimation;
    private Animation mImageToggleShowAnimation;
    /* access modifiers changed from: private */
    public boolean mIsAnimated;
    /* access modifiers changed from: private */
    public boolean mIsMenuButtonAnimationRunning;
    private boolean mIsMenuOpening;
    private boolean mIsSetClosedOnTouchOutside;
    private int mLabelsColorNormal;
    private int mLabelsColorPressed;
    private int mLabelsColorRipple;
    private Context mLabelsContext;
    private int mLabelsCornerRadius;
    private int mLabelsEllipsize;
    private int mLabelsHideAnimation;
    private int mLabelsMargin;
    private int mLabelsMaxLines;
    private int mLabelsPaddingBottom;
    private int mLabelsPaddingLeft;
    private int mLabelsPaddingRight;
    private int mLabelsPaddingTop;
    private int mLabelsPosition;
    private int mLabelsShowAnimation;
    private boolean mLabelsShowShadow;
    private boolean mLabelsSingleLine;
    private int mLabelsStyle;
    private ColorStateList mLabelsTextColor;
    private float mLabelsTextSize;
    private int mLabelsVerticalOffset;
    private int mMaxButtonWidth;
    /* access modifiers changed from: private */
    public FloatingActionButton mMenuButton;
    /* access modifiers changed from: private */
    public Animation mMenuButtonHideAnimation;
    private Animation mMenuButtonShowAnimation;
    private int mMenuColorNormal;
    private int mMenuColorPressed;
    private int mMenuColorRipple;
    private int mMenuFabSize;
    private String mMenuLabelText;
    /* access modifiers changed from: private */
    public boolean mMenuOpened;
    private int mMenuShadowColor;
    private float mMenuShadowRadius;
    private float mMenuShadowXOffset;
    private float mMenuShadowYOffset;
    private boolean mMenuShowShadow;
    private AnimatorSet mOpenAnimatorSet;
    private int mOpenDirection;
    private Interpolator mOpenInterpolator;
    private ValueAnimator mShowBackgroundAnimator;
    /* access modifiers changed from: private */
    public OnMenuToggleListener mToggleListener;
    private Handler mUiHandler;
    private boolean mUsingMenuLabel;

    public interface OnMenuToggleListener {
        void onMenuToggle(boolean z2);
    }

    public FloatingActionMenu(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mOpenAnimatorSet = new AnimatorSet();
        this.mCloseAnimatorSet = new AnimatorSet();
        this.mButtonSpacing = Util.dpToPx(getContext(), CLOSED_PLUS_ROTATION);
        this.mLabelsMargin = Util.dpToPx(getContext(), CLOSED_PLUS_ROTATION);
        this.mLabelsVerticalOffset = Util.dpToPx(getContext(), CLOSED_PLUS_ROTATION);
        this.mUiHandler = new Handler();
        this.mLabelsPaddingTop = Util.dpToPx(getContext(), 4.0f);
        this.mLabelsPaddingRight = Util.dpToPx(getContext(), 8.0f);
        this.mLabelsPaddingBottom = Util.dpToPx(getContext(), 4.0f);
        this.mLabelsPaddingLeft = Util.dpToPx(getContext(), 8.0f);
        this.mLabelsCornerRadius = Util.dpToPx(getContext(), 3.0f);
        this.mMenuShadowRadius = 4.0f;
        this.mMenuShadowXOffset = 1.0f;
        this.mMenuShadowYOffset = 3.0f;
        this.mIsAnimated = true;
        this.mIconAnimated = true;
        init(context, attributeSet);
    }

    private void addLabel(FloatingActionButton floatingActionButton) {
        String labelText = floatingActionButton.getLabelText();
        if (!TextUtils.isEmpty(labelText)) {
            Label label = new Label(this.mLabelsContext);
            label.setClickable(true);
            label.setFab(floatingActionButton);
            label.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.mLabelsShowAnimation));
            label.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.mLabelsHideAnimation));
            if (this.mLabelsStyle > 0) {
                label.setTextAppearance(getContext(), this.mLabelsStyle);
                label.setShowShadow(false);
                label.setUsingStyle(true);
            } else {
                label.setColors(this.mLabelsColorNormal, this.mLabelsColorPressed, this.mLabelsColorRipple);
                label.setShowShadow(this.mLabelsShowShadow);
                label.setCornerRadius(this.mLabelsCornerRadius);
                if (this.mLabelsEllipsize > 0) {
                    setLabelEllipsize(label);
                }
                label.setMaxLines(this.mLabelsMaxLines);
                label.updateBackground();
                label.setTextSize(0, this.mLabelsTextSize);
                label.setTextColor(this.mLabelsTextColor);
                int i2 = this.mLabelsPaddingLeft;
                int i3 = this.mLabelsPaddingTop;
                if (this.mLabelsShowShadow) {
                    i2 += floatingActionButton.getShadowRadius() + Math.abs(floatingActionButton.getShadowXOffset());
                    i3 += floatingActionButton.getShadowRadius() + Math.abs(floatingActionButton.getShadowYOffset());
                }
                label.setPadding(i2, i3, this.mLabelsPaddingLeft, this.mLabelsPaddingTop);
                if (this.mLabelsMaxLines < 0 || this.mLabelsSingleLine) {
                    label.setSingleLine(this.mLabelsSingleLine);
                }
            }
            if (this.mCustomTypefaceFromFont != null) {
                label.setTypeface(this.mCustomTypefaceFromFont);
            }
            label.setText(labelText);
            label.setOnClickListener(floatingActionButton.getOnClickListener());
            addView(label);
            floatingActionButton.setTag(Tools.intId("fab_label"), label);
        }
    }

    private int adjustForOvershoot(int i2) {
        return (int) ((((double) i2) * 0.03d) + ((double) i2));
    }

    private void createDefaultIconAnimation() {
        float f2;
        float f3 = OPENED_PLUS_ROTATION_RIGHT;
        float f4 = OPENED_PLUS_ROTATION_LEFT;
        if (this.mOpenDirection == 0) {
            f2 = this.mLabelsPosition == 0 ? -135.0f : 135.0f;
            if (this.mLabelsPosition != 0) {
                f4 = 135.0f;
            }
        } else {
            f2 = this.mLabelsPosition == 0 ? 135.0f : -135.0f;
            if (this.mLabelsPosition != 0) {
                f3 = -135.0f;
            }
            f4 = f3;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mImageToggle, "rotation", new float[]{f2, 0.0f});
        this.mOpenAnimatorSet.play(ObjectAnimator.ofFloat(this.mImageToggle, "rotation", new float[]{0.0f, f4}));
        this.mCloseAnimatorSet.play(ofFloat);
        this.mOpenAnimatorSet.setInterpolator(this.mOpenInterpolator);
        this.mCloseAnimatorSet.setInterpolator(this.mCloseInterpolator);
        this.mOpenAnimatorSet.setDuration((long) ANIMATION_DURATION);
        this.mCloseAnimatorSet.setDuration((long) ANIMATION_DURATION);
    }

    private void createLabels() {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.mButtonsCount) {
                if (getChildAt(i3) != this.mImageToggle) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i3);
                    if (floatingActionButton.getTag(Tools.intId("fab_label")) == null) {
                        addLabel(floatingActionButton);
                        if (floatingActionButton == this.mMenuButton) {
                            this.mMenuButton.setOnClickListener(new View.OnClickListener(this) {
                                private final FloatingActionMenu this$0;

                                {
                                    this.this$0 = r1;
                                }

                                static FloatingActionMenu access$0(AnonymousClass100000002 r1) {
                                    return r1.this$0;
                                }

                                @Override
                                public void onClick(View view) {
                                    this.this$0.toggle(this.this$0.mIsAnimated);
                                }
                            });
                        }
                    }
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    private void createMenuButton() {
        this.mMenuButton = new FloatingActionButton(getContext());
        this.mMenuButton.mShowShadow = this.mMenuShowShadow;
        if (this.mMenuShowShadow) {
            this.mMenuButton.mShadowRadius = Util.dpToPx(getContext(), this.mMenuShadowRadius);
            this.mMenuButton.mShadowXOffset = Util.dpToPx(getContext(), this.mMenuShadowXOffset);
            this.mMenuButton.mShadowYOffset = Util.dpToPx(getContext(), this.mMenuShadowYOffset);
        }
        this.mMenuButton.setColors(this.mMenuColorNormal, this.mMenuColorPressed, this.mMenuColorRipple);
        this.mMenuButton.mShadowColor = this.mMenuShadowColor;
        this.mMenuButton.mFabSize = this.mMenuFabSize;
        this.mMenuButton.updateBackground();
        this.mMenuButton.setLabelText(this.mMenuLabelText);
        this.mImageToggle = new ImageView(getContext());
        this.mImageToggle.setImageDrawable(this.mIcon);
        this.mImageToggle.setColorFilter(Tools.fabIconColor(getContext()), PorterDuff.Mode.SRC_IN);
        addView(this.mMenuButton, super.generateDefaultLayoutParams());
        addView(this.mImageToggle);
        createDefaultIconAnimation();
    }

    /* access modifiers changed from: private */
    public void hideMenuButtonWithImage(boolean z2) {
        if (!isMenuButtonHidden()) {
            this.mMenuButton.hide(z2);
            if (z2) {
                this.mImageToggle.startAnimation(this.mImageToggleHideAnimation);
            }
            this.mImageToggle.setVisibility(4);
            this.mIsMenuButtonAnimationRunning = false;
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.mLabelsPosition = 0;
        this.mLabelsShowAnimation = this.mLabelsPosition == 0 ? Tools.intAnim("fab_slide_in_from_right") : Tools.intAnim("fab_slide_in_from_left");
        this.mLabelsHideAnimation = this.mLabelsPosition == 0 ? Tools.intAnim("fab_slide_out_to_right") : Tools.intAnim("fab_slide_out_to_left");
        this.mLabelsTextColor = ColorStateList.valueOf(Tools.fabLabelColor(getContext()));
        this.mLabelsTextSize = (float) 25;
        this.mLabelsCornerRadius = 20;
        this.mLabelsShowShadow = true;
        Context context2 = getContext();
        this.mLabelsColorNormal = ColorManager.getPrimaryColor();
        Context context3 = getContext();
        this.mLabelsColorPressed = ColorManager.getPrimaryColor();
        Context context4 = getContext();
        this.mLabelsColorRipple = ColorManager.getPrimaryColor();
        this.mMenuShowShadow = true;
        this.mMenuShadowColor = 1711276032;
        Context context5 = getContext();
        this.mMenuColorNormal = ColorManager.getPrimaryColor();
        Context context6 = getContext();
        this.mMenuColorPressed = ColorManager.getPrimaryColor();
        Context context7 = getContext();
        this.mMenuColorRipple = ColorManager.getPrimaryColor();
        this.mAnimationDelayPerItem = 50;
        this.mIcon = getResources().getDrawable(Tools.intDrawable("fab_add"));
        this.mLabelsSingleLine = true;
        this.mMenuFabSize = 1;
        this.mOpenDirection = 1;
        this.mBackgroundColor = 0;
        this.mOpenInterpolator = new OvershootInterpolator();
        this.mCloseInterpolator = new AnticipateInterpolator();
        this.mLabelsContext = new ContextThemeWrapper(getContext(), this.mLabelsStyle);
        initBackgroundDimAnimation();
        createMenuButton();
        initMenuButtonAnimations();
    }

    private void initBackgroundDimAnimation() {
        int alpha = Color.alpha(this.mBackgroundColor);
        int red = Color.red(this.mBackgroundColor);
        int green = Color.green(this.mBackgroundColor);
        int blue = Color.blue(this.mBackgroundColor);
        this.mShowBackgroundAnimator = ValueAnimator.ofInt(new int[]{0, alpha});
        this.mShowBackgroundAnimator.setDuration((long) ANIMATION_DURATION);
        this.mShowBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, red, green, blue) {
            private final FloatingActionMenu this$0;
            private final int val$blue;
            private final int val$green;
            private final int val$red;

            {
                this.this$0 = r1;
                this.val$red = r2;
                this.val$green = r3;
                this.val$blue = r4;
            }

            static FloatingActionMenu access$0(AnonymousClass100000000 r1) {
                return r1.this$0;
            }

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.val$red, this.val$green, this.val$blue));
            }
        });
        this.mHideBackgroundAnimator = ValueAnimator.ofInt(new int[]{alpha, 0});
        this.mHideBackgroundAnimator.setDuration((long) ANIMATION_DURATION);
        this.mHideBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, red, green, blue) {
            private final FloatingActionMenu this$0;
            private final int val$blue;
            private final int val$green;
            private final int val$red;

            {
                this.this$0 = r1;
                this.val$red = r2;
                this.val$green = r3;
                this.val$blue = r4;
            }

            static FloatingActionMenu access$0(AnonymousClass100000001 r1) {
                return r1.this$0;
            }

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.val$red, this.val$green, this.val$blue));
            }
        });
    }

    private void initMenuButtonAnimations() {
        int intAnim = Tools.intAnim("fab_scale_up");
        setMenuButtonShowAnimation(AnimationUtils.loadAnimation(getContext(), intAnim));
        this.mImageToggleShowAnimation = AnimationUtils.loadAnimation(getContext(), intAnim);
        int intAnim2 = Tools.intAnim("fab_scale_down");
        setMenuButtonHideAnimation(AnimationUtils.loadAnimation(getContext(), intAnim2));
        this.mImageToggleHideAnimation = AnimationUtils.loadAnimation(getContext(), intAnim2);
    }

    private void initPadding(int i2) {
        this.mLabelsPaddingTop = i2;
        this.mLabelsPaddingRight = i2;
        this.mLabelsPaddingBottom = i2;
        this.mLabelsPaddingLeft = i2;
    }

    private boolean isBackgroundEnabled() {
        return this.mBackgroundColor != 0;
    }

    private void setLabelEllipsize(Label label) {
        switch (this.mLabelsEllipsize) {
            case 1:
                label.setEllipsize(TextUtils.TruncateAt.START);
                return;
            case 2:
                label.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                return;
            case 3:
                label.setEllipsize(TextUtils.TruncateAt.END);
                return;
            case 4:
                label.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                return;
            default:
                return;
        }
    }

    private void showMenuButtonWithImage(boolean z2) {
        if (isMenuButtonHidden()) {
            this.mMenuButton.show(z2);
            if (z2) {
                this.mImageToggle.startAnimation(this.mImageToggleShowAnimation);
            }
            this.mImageToggle.setVisibility(0);
        }
    }

    public void addMenuButton(FloatingActionButton floatingActionButton) {
        addView(floatingActionButton, this.mButtonsCount - 2);
        this.mButtonsCount++;
        addLabel(floatingActionButton);
    }

    public void addMenuButton(FloatingActionButton floatingActionButton, int i2) {
        int i3 = this.mButtonsCount - 2;
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > i3) {
            i2 = i3;
        }
        addView(floatingActionButton, i2);
        this.mButtonsCount++;
        addLabel(floatingActionButton);
    }

    /* access modifiers changed from: protected */
    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public void close(boolean z2) {
        if (isOpened()) {
            if (isBackgroundEnabled()) {
                this.mHideBackgroundAnimator.start();
            }
            if (this.mIconAnimated) {
                if (this.mIconToggleSet != null) {
                    this.mIconToggleSet.start();
                } else {
                    this.mCloseAnimatorSet.start();
                    this.mOpenAnimatorSet.cancel();
                }
            }
            this.mIsMenuOpening = false;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                    i2++;
                    this.mUiHandler.postDelayed(new Runnable(this, (FloatingActionButton) childAt, z2) {
                        private final FloatingActionMenu this$0;
                        private final boolean val$animate;
                        private final FloatingActionButton val$fab;

                        {
                            this.this$0 = r1;
                            this.val$fab = r2;
                            this.val$animate = r3;
                        }

                        static FloatingActionMenu access$0(AnonymousClass100000005 r1) {
                            return r1.this$0;
                        }

                        @Override
                        public void run() {
                            if (this.this$0.isOpened()) {
                                if (this.val$fab != this.this$0.mMenuButton) {
                                    this.val$fab.hide(this.val$animate);
                                }
                                Label label = (Label) this.val$fab.getTag(Tools.intId("fab_label"));
                                if (label != null && label.isHandleVisibilityChanges()) {
                                    label.hide(this.val$animate);
                                }
                            }
                        }
                    }, (long) i3);
                    i3 += this.mAnimationDelayPerItem;
                }
            }
            this.mUiHandler.postDelayed(new Runnable(this) {
                private final FloatingActionMenu this$0;

                {
                    this.this$0 = r1;
                }

                static FloatingActionMenu access$0(AnonymousClass100000006 r1) {
                    return r1.this$0;
                }

                @Override
                public void run() {
                    this.this$0.mMenuOpened = false;
                    if (this.this$0.mToggleListener != null) {
                        this.this$0.mToggleListener.onMenuToggle(false);
                    }
                }
            }, (long) ((i2 + 1) * this.mAnimationDelayPerItem));
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    @Override
    public ViewGroup.MarginLayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public /* bridge */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override
    public ViewGroup.MarginLayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override
    public ViewGroup.MarginLayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getAnimationDelayPerItem() {
        return this.mAnimationDelayPerItem;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.mIconToggleSet;
    }

    public int getMenuButtonColorNormal() {
        return this.mMenuColorNormal;
    }

    public int getMenuButtonColorPressed() {
        return this.mMenuColorPressed;
    }

    public int getMenuButtonColorRipple() {
        return this.mMenuColorRipple;
    }

    public String getMenuButtonLabelText() {
        return this.mMenuLabelText;
    }

    public ImageView getMenuIconView() {
        return this.mImageToggle;
    }

    public void hideMenu(boolean z2) {
        if (!isMenuHidden() && !this.mIsMenuButtonAnimationRunning) {
            this.mIsMenuButtonAnimationRunning = true;
            if (isOpened()) {
                close(z2);
                this.mUiHandler.postDelayed(new Runnable(this, z2) {
                    private final FloatingActionMenu this$0;
                    private final boolean val$animate;

                    {
                        this.this$0 = r1;
                        this.val$animate = r2;
                    }

                    static FloatingActionMenu access$0(AnonymousClass100000007 r1) {
                        return r1.this$0;
                    }

                    @Override
                    public void run() {
                        if (this.val$animate) {
                            this.this$0.startAnimation(this.this$0.mMenuButtonHideAnimation);
                        }
                        this.this$0.setVisibility(4);
                        this.this$0.mIsMenuButtonAnimationRunning = false;
                    }
                }, (long) (this.mAnimationDelayPerItem * this.mButtonsCount));
                return;
            }
            if (z2) {
                startAnimation(this.mMenuButtonHideAnimation);
            }
            setVisibility(4);
            this.mIsMenuButtonAnimationRunning = false;
        }
    }

    public void hideMenuButton(boolean z2) {
        if (!isMenuButtonHidden() && !this.mIsMenuButtonAnimationRunning) {
            this.mIsMenuButtonAnimationRunning = true;
            if (isOpened()) {
                close(z2);
                this.mUiHandler.postDelayed(new Runnable(this, z2) {
                    private final FloatingActionMenu this$0;
                    private final boolean val$animate;

                    {
                        this.this$0 = r1;
                        this.val$animate = r2;
                    }

                    static FloatingActionMenu access$0(AnonymousClass100000008 r1) {
                        return r1.this$0;
                    }

                    @Override
                    public void run() {
                        this.this$0.hideMenuButtonWithImage(this.val$animate);
                    }
                }, (long) (this.mAnimationDelayPerItem * this.mButtonsCount));
                return;
            }
            hideMenuButtonWithImage(z2);
        }
    }

    public boolean isAnimated() {
        return this.mIsAnimated;
    }

    public boolean isIconAnimated() {
        return this.mIconAnimated;
    }

    public boolean isMenuButtonHidden() {
        return this.mMenuButton.isHidden();
    }

    public boolean isMenuHidden() {
        return getVisibility() == 4;
    }

    public boolean isOpened() {
        return this.mMenuOpened;
    }

    /* access modifiers changed from: protected */
    @Override
    public void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.mMenuButton);
        bringChildToFront(this.mImageToggle);
        this.mButtonsCount = getChildCount();
        createLabels();
    }

    /* access modifiers changed from: protected */
    @Override
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingRight = this.mLabelsPosition == 0 ? ((i4 - i2) - (this.mMaxButtonWidth / 2)) - getPaddingRight() : (this.mMaxButtonWidth / 2) + getPaddingLeft();
        boolean z3 = this.mOpenDirection == 0;
        int measuredHeight = z3 ? ((i5 - i3) - this.mMenuButton.getMeasuredHeight()) - getPaddingBottom() : getPaddingTop();
        int measuredWidth = paddingRight - (this.mMenuButton.getMeasuredWidth() / 2);
        this.mMenuButton.layout(measuredWidth, measuredHeight, this.mMenuButton.getMeasuredWidth() + measuredWidth, this.mMenuButton.getMeasuredHeight() + measuredHeight);
        int measuredWidth2 = paddingRight - (this.mImageToggle.getMeasuredWidth() / 2);
        int measuredHeight2 = ((this.mMenuButton.getMeasuredHeight() / 2) + measuredHeight) - (this.mImageToggle.getMeasuredHeight() / 2);
        this.mImageToggle.layout(measuredWidth2, measuredHeight2, this.mImageToggle.getMeasuredWidth() + measuredWidth2, this.mImageToggle.getMeasuredHeight() + measuredHeight2);
        if (z3) {
            measuredHeight = measuredHeight + this.mMenuButton.getMeasuredHeight() + this.mButtonSpacing;
        }
        int i6 = measuredHeight;
        for (int i7 = this.mButtonsCount - 1; i7 >= 0; i7--) {
            View childAt = getChildAt(i7);
            if (childAt != this.mImageToggle) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) childAt;
                if (floatingActionButton.getVisibility() != 8) {
                    int measuredWidth3 = paddingRight - (floatingActionButton.getMeasuredWidth() / 2);
                    int measuredHeight3 = z3 ? (i6 - floatingActionButton.getMeasuredHeight()) - this.mButtonSpacing : i6;
                    if (floatingActionButton != this.mMenuButton) {
                        floatingActionButton.layout(measuredWidth3, measuredHeight3, floatingActionButton.getMeasuredWidth() + measuredWidth3, floatingActionButton.getMeasuredHeight() + measuredHeight3);
                        if (!this.mIsMenuOpening) {
                            floatingActionButton.hide(false);
                        }
                    }
                    View view = (View) floatingActionButton.getTag(Tools.intId("fab_label"));
                    if (view != null) {
                        int measuredWidth4 = (this.mUsingMenuLabel ? this.mMaxButtonWidth / 2 : floatingActionButton.getMeasuredWidth() / 2) + this.mLabelsMargin;
                        int i8 = this.mLabelsPosition == 0 ? paddingRight - measuredWidth4 : measuredWidth4 + paddingRight;
                        int measuredWidth5 = this.mLabelsPosition == 0 ? i8 - view.getMeasuredWidth() : view.getMeasuredWidth() + i8;
                        int i9 = this.mLabelsPosition == 0 ? measuredWidth5 : i8;
                        if (this.mLabelsPosition != 0) {
                            i8 = measuredWidth5;
                        }
                        int measuredHeight4 = ((floatingActionButton.getMeasuredHeight() - view.getMeasuredHeight()) / 2) + (measuredHeight3 - this.mLabelsVerticalOffset);
                        view.layout(i9, measuredHeight4, i8, view.getMeasuredHeight() + measuredHeight4);
                        if (!this.mIsMenuOpening) {
                            view.setVisibility(4);
                        }
                    }
                    i6 = z3 ? measuredHeight3 - this.mButtonSpacing : childAt.getMeasuredHeight() + measuredHeight3 + this.mButtonSpacing;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        this.mMaxButtonWidth = 0;
        int i6 = 0;
        measureChildWithMargins(this.mImageToggle, i2, 0, i3, 0);
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= this.mButtonsCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (!(childAt.getVisibility() == 8 || childAt == this.mImageToggle)) {
                measureChildWithMargins(childAt, i2, 0, i3, 0);
                this.mMaxButtonWidth = Math.max(this.mMaxButtonWidth, childAt.getMeasuredWidth());
            }
            i7 = i8 + 1;
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < this.mButtonsCount) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() == 8 || childAt2 == this.mImageToggle) {
                i5 = i6;
                i4 = i10;
            } else {
                int measuredWidth = 0 + childAt2.getMeasuredWidth();
                int measuredHeight = i10 + childAt2.getMeasuredHeight();
                Label label = (Label) childAt2.getTag(Tools.intId("fab_label"));
                if (label != null) {
                    int measuredWidth2 = (this.mMaxButtonWidth - childAt2.getMeasuredWidth()) / (this.mUsingMenuLabel ? 1 : 2);
                    measureChildWithMargins(label, i2, childAt2.getMeasuredWidth() + label.calculateShadowWidth() + this.mLabelsMargin + measuredWidth2, i3, 0);
                    i5 = Math.max(i6, label.getMeasuredWidth() + measuredWidth + measuredWidth2);
                    i4 = measuredHeight;
                } else {
                    i5 = i6;
                    i4 = measuredHeight;
                }
            }
            i9++;
            i6 = i5;
            i10 = i4;
        }
        setMeasuredDimension(getLayoutParams().width == -1 ? View.getDefaultSize(getSuggestedMinimumWidth(), i2) : Math.max(this.mMaxButtonWidth, this.mLabelsMargin + i6) + getPaddingLeft() + getPaddingRight(), getLayoutParams().height == -1 ? View.getDefaultSize(getSuggestedMinimumHeight(), i3) : adjustForOvershoot(i10 + (this.mButtonSpacing * (this.mButtonsCount - 1)) + getPaddingTop() + getPaddingBottom()));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mIsSetClosedOnTouchOutside) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                return isOpened();
            case 1:
                close(this.mIsAnimated);
                return true;
            default:
                return false;
        }
    }

    public void open(boolean z2) {
        int i2;
        int i3;
        int i4 = 0;
        if (!isOpened()) {
            if (isBackgroundEnabled()) {
                this.mShowBackgroundAnimator.start();
            }
            if (this.mIconAnimated) {
                if (this.mIconToggleSet != null) {
                    this.mIconToggleSet.start();
                } else {
                    this.mCloseAnimatorSet.cancel();
                    this.mOpenAnimatorSet.start();
                }
            }
            this.mIsMenuOpening = true;
            int childCount = getChildCount() - 1;
            int i5 = 0;
            while (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (!(childAt instanceof FloatingActionButton) || childAt.getVisibility() == 8) {
                    i2 = i4;
                    i3 = i5;
                } else {
                    this.mUiHandler.postDelayed(new Runnable(this, (FloatingActionButton) childAt, z2) {
                        private final FloatingActionMenu this$0;
                        private final boolean val$animate;
                        private final FloatingActionButton val$fab;

                        {
                            this.this$0 = r1;
                            this.val$fab = r2;
                            this.val$animate = r3;
                        }

                        static FloatingActionMenu access$0(AnonymousClass100000003 r1) {
                            return r1.this$0;
                        }

                        @Override
                        public void run() {
                            if (!this.this$0.isOpened()) {
                                if (this.val$fab != this.this$0.mMenuButton) {
                                    this.val$fab.show(this.val$animate);
                                }
                                Label label = (Label) this.val$fab.getTag(Tools.intId("fab_label"));
                                if (label != null && label.isHandleVisibilityChanges()) {
                                    label.show(this.val$animate);
                                }
                            }
                        }
                    }, (long) i5);
                    int i6 = i4 + 1;
                    i3 = this.mAnimationDelayPerItem + i5;
                    i2 = i6;
                }
                childCount--;
                i5 = i3;
                i4 = i2;
            }
            this.mUiHandler.postDelayed(new Runnable(this) {
                private final FloatingActionMenu this$0;

                {
                    this.this$0 = r1;
                }

                static FloatingActionMenu access$0(AnonymousClass100000004 r1) {
                    return r1.this$0;
                }

                @Override
                public void run() {
                    this.this$0.mMenuOpened = true;
                    if (this.this$0.mToggleListener != null) {
                        this.this$0.mToggleListener.onMenuToggle(true);
                    }
                }
            }, (long) ((i4 + 1) * this.mAnimationDelayPerItem));
        }
    }

    public void removeAllMenuButtons() {
        close(true);
        ArrayList<FloatingActionButton> arrayList = new ArrayList<>();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!(childAt == this.mMenuButton || childAt == this.mImageToggle || !(childAt instanceof FloatingActionButton))) {
                arrayList.add((FloatingActionButton) childAt);
            }
            i2 = i3 + 1;
        }
        for (FloatingActionButton removeMenuButton : arrayList) {
            removeMenuButton(removeMenuButton);
        }
    }

    public void removeMenuButton(FloatingActionButton floatingActionButton) {
        removeView(floatingActionButton.getLabelView());
        removeView(floatingActionButton);
        this.mButtonsCount--;
    }

    public void setAnimated(boolean z2) {
        int i2 = ANIMATION_DURATION;
        this.mIsAnimated = z2;
        this.mOpenAnimatorSet.setDuration((long) (z2 ? ANIMATION_DURATION : 0));
        AnimatorSet animatorSet = this.mCloseAnimatorSet;
        if (!z2) {
            i2 = 0;
        }
        animatorSet.setDuration((long) i2);
    }

    public void setAnimationDelayPerItem(int i2) {
        this.mAnimationDelayPerItem = i2;
    }

    public void setClosedOnTouchOutside(boolean z2) {
        this.mIsSetClosedOnTouchOutside = z2;
    }

    public void setIconAnimated(boolean z2) {
        this.mIconAnimated = z2;
    }

    public void setIconAnimationCloseInterpolator(Interpolator interpolator) {
        this.mCloseAnimatorSet.setInterpolator(interpolator);
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.mOpenAnimatorSet.setInterpolator(interpolator);
        this.mCloseAnimatorSet.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator interpolator) {
        this.mOpenAnimatorSet.setInterpolator(interpolator);
    }

    public void setIconToggleAnimatorSet(AnimatorSet animatorSet) {
        this.mIconToggleSet = animatorSet;
    }

    public void setMenuButtonColorNormal(int i2) {
        this.mMenuColorNormal = i2;
        this.mMenuButton.setColorNormal(i2);
    }

    public void setMenuButtonColorNormalResId(int i2) {
        this.mMenuColorNormal = getResources().getColor(i2);
        this.mMenuButton.setColorNormalResId(i2);
    }

    public void setMenuButtonColorPressed(int i2) {
        this.mMenuColorPressed = i2;
        this.mMenuButton.setColorPressed(i2);
    }

    public void setMenuButtonColorPressedResId(int i2) {
        this.mMenuColorPressed = getResources().getColor(i2);
        this.mMenuButton.setColorPressedResId(i2);
    }

    public void setMenuButtonColorRipple(int i2) {
        this.mMenuColorRipple = i2;
        this.mMenuButton.setColorRipple(i2);
    }

    public void setMenuButtonColorRippleResId(int i2) {
        this.mMenuColorRipple = getResources().getColor(i2);
        this.mMenuButton.setColorRippleResId(i2);
    }

    public void setMenuButtonHideAnimation(Animation animation) {
        this.mMenuButtonHideAnimation = animation;
        this.mMenuButton.setHideAnimation(animation);
    }

    public void setMenuButtonLabelText(String str) {
        this.mMenuButton.setLabelText(str);
    }

    public void setMenuButtonShowAnimation(Animation animation) {
        this.mMenuButtonShowAnimation = animation;
        this.mMenuButton.setShowAnimation(animation);
    }

    public void setOnMenuButtonClickListener(View.OnClickListener onClickListener) {
        this.mMenuButton.setOnClickListener(onClickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mMenuButton.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMenuToggleListener(OnMenuToggleListener onMenuToggleListener) {
        this.mToggleListener = onMenuToggleListener;
    }

    public void showMenu(boolean z2) {
        if (isMenuHidden()) {
            if (z2) {
                startAnimation(this.mMenuButtonShowAnimation);
            }
            setVisibility(0);
        }
    }

    public void showMenuButton(boolean z2) {
        if (isMenuButtonHidden()) {
            showMenuButtonWithImage(z2);
        }
    }

    public void toggle(boolean z2) {
        if (isOpened()) {
            close(z2);
        } else {
            open(z2);
        }
    }

    public void toggleMenu(boolean z2) {
        if (isMenuHidden()) {
            showMenu(z2);
        } else {
            hideMenu(z2);
        }
    }

    public void toggleMenuButton(boolean z2) {
        if (isMenuButtonHidden()) {
            showMenuButton(z2);
        } else {
            hideMenuButton(z2);
        }
    }
}
