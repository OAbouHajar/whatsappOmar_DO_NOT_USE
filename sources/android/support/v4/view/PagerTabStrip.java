package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;

public class PagerTabStrip extends PagerTitleStrip {
    private static final int FULL_UNDERLINE_HEIGHT = 1;
    private static final int INDICATOR_HEIGHT = 3;
    private static final int MIN_PADDING_BOTTOM = 6;
    private static final int MIN_STRIP_HEIGHT = 32;
    private static final int MIN_TEXT_SPACING = 64;
    private static final int TAB_PADDING = 16;
    private static final int TAB_SPACING = 32;
    private static final String TAG = "PagerTabStrip";
    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final Paint mTabPaint;
    private final Rect mTempRect;
    private int mTouchSlop;

    public PagerTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabPaint = new Paint();
        this.mTempRect = new Rect();
        this.mTabAlpha = MotionEventCompat.ACTION_MASK;
        this.mDrawFullUnderline = false;
        this.mDrawFullUnderlineSet = false;
        this.mIndicatorColor = this.mTextColor;
        this.mTabPaint.setColor(this.mIndicatorColor);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.mIndicatorHeight = (int) ((3.0f * f2) + 0.5f);
        this.mMinPaddingBottom = (int) ((6.0f * f2) + 0.5f);
        this.mMinTextSpacing = (int) (64.0f * f2);
        this.mTabPadding = (int) ((16.0f * f2) + 0.5f);
        this.mFullUnderlineHeight = (int) ((1.0f * f2) + 0.5f);
        this.mMinStripHeight = (int) ((32.0f * f2) + 0.5f);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.mPrevText.setFocusable(true);
        this.mPrevText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PagerTabStrip.this.mPager.setCurrentItem(PagerTabStrip.this.mPager.getCurrentItem() - 1);
            }
        });
        this.mNextText.setFocusable(true);
        this.mNextText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PagerTabStrip.this.mPager.setCurrentItem(PagerTabStrip.this.mPager.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.mDrawFullUnderline = true;
        }
    }

    public boolean getDrawFullUnderline() {
        return this.mDrawFullUnderline;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.mMinStripHeight);
    }

    public int getTabIndicatorColor() {
        return this.mIndicatorColor;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int i2 = height;
        int left = this.mCurrText.getLeft() - this.mTabPadding;
        int right = this.mCurrText.getRight() + this.mTabPadding;
        int i3 = i2 - this.mIndicatorHeight;
        this.mTabPaint.setColor((this.mTabAlpha << 24) | (this.mIndicatorColor & ViewCompat.MEASURED_SIZE_MASK));
        canvas.drawRect((float) left, (float) i3, (float) right, (float) i2, this.mTabPaint);
        if (this.mDrawFullUnderline) {
            this.mTabPaint.setColor(-16777216 | (this.mIndicatorColor & ViewCompat.MEASURED_SIZE_MASK));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.mFullUnderlineHeight), (float) (getWidth() - getPaddingRight()), (float) height, this.mTabPaint);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.mIgnoreTap) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        switch (action) {
            case 0:
                this.mInitialMotionX = x2;
                this.mInitialMotionY = y2;
                this.mIgnoreTap = false;
                break;
            case 1:
                if (x2 >= ((float) (this.mCurrText.getLeft() - this.mTabPadding))) {
                    if (x2 > ((float) (this.mCurrText.getRight() + this.mTabPadding))) {
                        this.mPager.setCurrentItem(this.mPager.getCurrentItem() + 1);
                        break;
                    }
                } else {
                    this.mPager.setCurrentItem(this.mPager.getCurrentItem() - 1);
                    break;
                }
                break;
            case 2:
                if (Math.abs(x2 - this.mInitialMotionX) > ((float) this.mTouchSlop) || Math.abs(y2 - this.mInitialMotionY) > ((float) this.mTouchSlop)) {
                    this.mIgnoreTap = true;
                    break;
                }
        }
        return true;
    }

    public void setBackgroundColor(int i2) {
        super.setBackgroundColor(i2);
        if (!this.mDrawFullUnderlineSet) {
            this.mDrawFullUnderline = (-16777216 & i2) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.mDrawFullUnderlineSet) {
            this.mDrawFullUnderline = drawable == null;
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (!this.mDrawFullUnderlineSet) {
            this.mDrawFullUnderline = i2 == 0;
        }
    }

    public void setDrawFullUnderline(boolean z2) {
        this.mDrawFullUnderline = z2;
        this.mDrawFullUnderlineSet = true;
        invalidate();
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        if (i5 < this.mMinPaddingBottom) {
            i5 = this.mMinPaddingBottom;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    public void setTabIndicatorColor(int i2) {
        this.mIndicatorColor = i2;
        this.mTabPaint.setColor(this.mIndicatorColor);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i2) {
        setTabIndicatorColor(getContext().getResources().getColor(i2));
    }

    public void setTextSpacing(int i2) {
        if (i2 < this.mMinTextSpacing) {
            i2 = this.mMinTextSpacing;
        }
        super.setTextSpacing(i2);
    }

    /* access modifiers changed from: package-private */
    public void updateTextPositions(int i2, float f2, boolean z2) {
        Rect rect = this.mTempRect;
        int height = getHeight();
        int left = this.mCurrText.getLeft() - this.mTabPadding;
        int right = this.mCurrText.getRight() + this.mTabPadding;
        int i3 = height - this.mIndicatorHeight;
        rect.set(left, i3, right, height);
        super.updateTextPositions(i2, f2, z2);
        this.mTabAlpha = (int) (Math.abs(f2 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.mCurrText.getLeft() - this.mTabPadding, i3, this.mCurrText.getRight() + this.mTabPadding, height);
        invalidate(rect);
    }
}
