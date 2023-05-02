package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.IDxLAdapterShape0S0200000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.2P3  reason: invalid class name */
public class AnonymousClass2P3 extends View implements AnonymousClass006 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public AnimatorSet A0P;
    public Bitmap A0Q;
    public Bitmap A0R;
    public Bitmap A0S;
    public Matrix A0T;
    public Paint A0U;
    public Paint A0V;
    public Paint A0W;
    public Paint A0X;
    public RectF A0Y;
    public RectF A0Z;
    public C52662eE A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;

    public AnonymousClass2P3(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0b) {
            this.A0b = true;
            generatedComponent();
        }
        this.A0c = false;
        this.A0I = getResources().getDimensionPixelSize(R.dimen.dimen00c2);
        this.A0M = getResources().getDimensionPixelSize(R.dimen.dimen00c1);
        this.A0H = getResources().getDimensionPixelSize(R.dimen.dimen00bf);
        this.A0F = getResources().getDimensionPixelSize(R.dimen.dimen00bd);
        this.A0J = this.A0I >> 1;
        this.A0O = AnonymousClass00T.A00(getContext(), R.color.color00b6);
        this.A0N = AnonymousClass00T.A00(getContext(), R.color.color00b5);
        this.A0G = AnonymousClass00T.A00(getContext(), R.color.color00b2);
        this.A0Y = new RectF();
        int A002 = AnonymousClass00T.A00(getContext(), R.color.color00b3);
        Paint paint = new Paint(1);
        this.A0V = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A0V.setColor(A002);
        this.A0Z = new RectF();
        int A003 = AnonymousClass00T.A00(getContext(), R.color.color00b4);
        Paint paint2 = new Paint(1);
        this.A0W = paint2;
        paint2.setColor(A003);
        this.A0W.setStyle(Paint.Style.STROKE);
        this.A0W.setStrokeWidth((float) this.A0H);
        Paint paint3 = new Paint(1);
        this.A0X = paint3;
        paint3.setFilterBitmap(true);
        Paint paint4 = new Paint(1);
        this.A0U = paint4;
        paint4.setFilterBitmap(true);
        this.A0U.setColorFilter(new PorterDuffColorFilter(this.A0G, PorterDuff.Mode.SRC_IN));
        this.A0S = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_shackle);
        this.A0R = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_body);
        this.A0Q = BitmapFactory.decodeResource(getResources(), R.drawable.ic_ptt_lock_arrow);
        float height = ((float) this.A0S.getHeight()) * 0.39f;
        this.A05 = height;
        this.A0B = height;
        float height2 = (float) ((this.A0I >> 1) - (this.A0S.getHeight() >> 1));
        this.A0D = height2;
        float height3 = height2 + (((float) this.A0S.getHeight()) * 0.9f);
        this.A0C = height3;
        this.A0A = height3 + ((float) this.A0R.getHeight()) + ((float) getResources().getDimensionPixelSize(R.dimen.dimen00be));
        this.A01 = this.A0B;
        this.A03 = -2.5f;
        this.A06 = (float) (this.A0M + this.A0Q.getHeight());
        float height4 = (float) (this.A0M + this.A0S.getHeight());
        this.A08 = height4;
        this.A07 = height4 + (((float) this.A0S.getHeight()) * 0.9f);
        this.A0T = new Matrix();
        A05();
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation((float) getResources().getDimensionPixelSize(R.dimen.dimen00c0));
            setClipToOutline(false);
            setOutlineProvider(new AnonymousClass3NA(this));
        }
    }

    public static /* synthetic */ void A00(ValueAnimator valueAnimator, AnonymousClass2P3 r3) {
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        float f2 = r3.A06;
        r3.A00 = f2 + ((r3.A0A - f2) * floatValue);
        float f3 = r3.A08;
        r3.A04 = f3 + ((r3.A0D - f3) * floatValue);
        float f4 = r3.A07;
        r3.A02 = f4 + ((r3.A0C - f4) * floatValue);
        r3.A0K = (int) (Math.min(1.0f, floatValue * 1.5f) * 255.0f);
        r3.postInvalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            r3.invalidateOutline();
        }
    }

    public static /* synthetic */ void A01(ValueAnimator valueAnimator, AnonymousClass2P3 r4) {
        r4.A0X.setColorFilter(new PorterDuffColorFilter(((Number) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN));
        r4.postInvalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            r4.invalidateOutline();
        }
    }

    public static /* synthetic */ void A02(ValueAnimator valueAnimator, AnonymousClass2P3 r3) {
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r3.A00 = (r3.A0A - (((float) r3.A0F) * floatValue)) - Math.abs(r3.A0B - r3.A01);
        r3.postInvalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            r3.invalidateOutline();
        }
    }

    public void A03() {
        if (this.A0d) {
            A04();
            int alpha = (int) ((getAlpha() / 1.0f) * 200.0f);
            animate().setListener((Animator.AnimatorListener) null).cancel();
            animate().alpha(0.0f).setDuration((long) alpha).setListener(new IDxLAdapterShape3S0100000_2_I0(this, 29)).start();
        }
    }

    public void A04() {
        if (this.A0c) {
            AnimatorSet animatorSet = this.A0P;
            if (animatorSet != null) {
                animatorSet.end();
                this.A0P.removeAllListeners();
            }
            this.A0P = null;
        }
    }

    public final void A05() {
        this.A01 = this.A0B;
        this.A00 = this.A06;
        this.A04 = this.A08;
        this.A02 = this.A07;
        this.A0K = 0;
        this.A0L = this.A0M;
        this.A0E = MotionEventCompat.ACTION_MASK;
        this.A09 = 0.0f;
        setTranslationY(0.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        this.A0X.setColorFilter(new PorterDuffColorFilter(this.A0O, PorterDuff.Mode.SRC_IN));
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            setPivotY((float) (getMeasuredHeight() >> 1));
            setPivotX((float) (getMeasuredWidth() >> 1));
        }
    }

    public final void A06() {
        if (!this.A0c) {
            this.A0P = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(800);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 35));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(400);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            ofFloat2.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 33));
            this.A0P.playTogether(new Animator[]{ofFloat, ofFloat2});
            this.A0P.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 28));
            this.A0P.start();
        }
    }

    public final void A07(Runnable runnable, long j2) {
        if (!this.A0d) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(j2);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(this, 32));
            ofFloat.addListener(new IDxLAdapterShape0S0200000_2_I0(runnable, 2, this));
            ofFloat.start();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0a;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0a = r0;
        }
        return r0.generatedComponent();
    }

    public int getCollapsedHeightPx() {
        return this.A0I;
    }

    public int getExpandedHeightPx() {
        return this.A0M;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.A0V;
        paint.setAlpha(this.A0K);
        RectF rectF = this.A0Y;
        rectF.left = 0.0f;
        float f2 = (float) ((int) this.A01);
        rectF.top = f2;
        rectF.right = 0.0f + ((float) this.A0I);
        rectF.bottom = f2 + ((float) this.A0L);
        float f3 = (float) this.A0J;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (Build.VERSION.SDK_INT < 21) {
            RectF rectF2 = this.A0Z;
            float f4 = rectF.left;
            float f5 = (float) (this.A0H >> 1);
            float f6 = f4 + f5;
            rectF2.left = f6;
            rectF2.top = rectF.top + f5;
            float f7 = rectF.right - f5;
            rectF2.right = f7;
            rectF2.bottom = rectF.bottom - f5;
            float f8 = (f7 - f6) / 2.0f;
            canvas.drawRoundRect(rectF2, f8, f8, this.A0W);
        }
        float width = (float) (getWidth() >> 1);
        Matrix matrix = this.A0T;
        Bitmap bitmap = this.A0S;
        matrix.setTranslate(width - ((float) (bitmap.getWidth() >> 1)), this.A04);
        matrix.postRotate(this.A03, (float) (bitmap.getWidth() >> 1), (float) bitmap.getHeight());
        Paint paint2 = this.A0X;
        canvas.drawBitmap(bitmap, matrix, paint2);
        Bitmap bitmap2 = this.A0R;
        canvas.drawBitmap(bitmap2, width - ((float) (bitmap2.getWidth() >> 1)), this.A02, paint2);
        Paint paint3 = this.A0U;
        paint3.setAlpha(this.A0E);
        Bitmap bitmap3 = this.A0Q;
        canvas.drawBitmap(bitmap3, width - ((float) (bitmap3.getWidth() >> 1)), this.A00, paint3);
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(this.A0I, (int) (((float) this.A0M) + this.A05));
    }

    public void setPercentageLocked(float f2) {
        boolean z2 = false;
        if (f2 >= 0.0f) {
            z2 = true;
        }
        AnonymousClass00B.A0C("Percentage must be >= 0.0", z2);
        float min = Math.min(1.0f, f2);
        if (this.A09 != min) {
            this.A09 = min;
            int i2 = this.A0M;
            int i3 = this.A0I;
            float f3 = (float) (i2 - i3);
            float height = ((float) this.A0S.getHeight()) * 0.39f;
            this.A0E = 255 - ((int) (Math.min(1.0f, min / 0.65f) * 255.0f));
            this.A0L = Math.min(i2, Math.max((int) (((float) i2) - (f3 * min)), i3));
            setTranslationY((-f3) * Math.min(min, 1.0f));
            if (min >= 0.15f) {
                if (this.A0c) {
                    A04();
                    this.A01 = this.A0B;
                    this.A00 = this.A0A;
                }
                float min2 = Math.min(1.0f, min);
                this.A03 = (2.5f * min2) - 1.75f;
                this.A02 = this.A0C - (height * min2);
                postInvalidate();
                if (Build.VERSION.SDK_INT >= 21) {
                    invalidateOutline();
                }
            } else if (this.A0d && !this.A0c) {
                A06();
            }
        }
    }
}
