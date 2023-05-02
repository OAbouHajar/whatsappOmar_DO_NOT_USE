package com.obwhatsapp.mediaview;

import X.AnonymousClass09P;
import X.AnonymousClass296;
import X.AnonymousClass3A1;
import X.AnonymousClass3HF;
import X.C1044055f;
import X.C1045155r;
import X.C1045856a;
import X.C63963Mf;
import X.C76943uy;
import X.C93954k2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape0S0120102_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.obwhatsapp.InteractiveAnnotation;

public class PhotoView extends AnonymousClass296 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02 = Float.MAX_VALUE;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08 = 0.8f;
    public int A09 = 0;
    public Matrix A0A;
    public Matrix A0B = new Matrix();
    public Matrix A0C = new Matrix();
    public Paint A0D = new Paint();
    public PointF A0E = new PointF();
    public Rect A0F = new Rect();
    public RectF A0G = new RectF();
    public RectF A0H = new RectF();
    public RectF A0I = new RectF();
    public BitmapDrawable A0J;
    public Drawable A0K;
    public ScaleGestureDetector A0L;
    public View.OnClickListener A0M;
    public AnonymousClass09P A0N;
    public RunnableRunnableShape0S0120102_I0 A0O;
    public RunnableRunnableShape0S0120102_I0 A0P;
    public C1045155r A0Q;
    public C1045856a A0R;
    public C1044055f A0S;
    public boolean A0T = false;
    public boolean A0U;
    public boolean A0V = true;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Runnable A0Z = new RunnableRunnableShape11S0100000_I0_10((Object) this, 6);

    public PhotoView(Context context) {
        super(context);
        A03();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A03();
    }

    public static void A01(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                A01(viewGroup.getChildAt(i2));
            }
        } else if (view instanceof PhotoView) {
            ((PhotoView) view).A02();
        }
    }

    private int getScaledMinScalingSpan() {
        Resources resources = getContext().getResources();
        try {
            return resources.getDimensionPixelSize(resources.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            return (int) TypedValue.applyDimension(5, 27.0f, resources.getDisplayMetrics());
        }
    }

    public void A02() {
        this.A0N = null;
        this.A0L = null;
        this.A0J = null;
        setImageDrawable((Drawable) null);
        C1045856a r1 = this.A0R;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0R = null;
        RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I0 = this.A0P;
        if (runnableRunnableShape0S0120102_I0 != null) {
            runnableRunnableShape0S0120102_I0.A04 = false;
            runnableRunnableShape0S0120102_I0.A05 = true;
        }
        this.A0P = null;
        RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I02 = this.A0O;
        if (runnableRunnableShape0S0120102_I02 != null) {
            runnableRunnableShape0S0120102_I02.A04 = false;
            runnableRunnableShape0S0120102_I02.A05 = true;
        }
        this.A0O = null;
        C1045155r r0 = this.A0Q;
        if (r0 != null) {
            r0.A02 = true;
            PhotoView photoView = r0.A03;
            photoView.A07 = (float) Math.round(photoView.A07);
            photoView.A09(true);
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.A0Q = null;
        C1044055f r12 = this.A0S;
        if (r12 != null) {
            r12.A01 = true;
        }
        this.A0S = null;
        this.A0M = null;
        this.A0M = null;
    }

    public final void A03() {
        Context context = getContext();
        this.A0N = new AnonymousClass09P(context, this);
        C63963Mf r2 = new C63963Mf(context, this, this, getScaledMinScalingSpan());
        this.A0L = r2;
        if (Build.VERSION.SDK_INT >= 19) {
            r2.setQuickScaleEnabled(false);
        }
        this.A0R = new C1045856a(this);
        this.A0P = new RunnableRunnableShape0S0120102_I0(this, 1);
        this.A0O = new RunnableRunnableShape0S0120102_I0(this, 0);
        this.A0Q = new C1045155r(this);
        this.A0S = new C1044055f(this);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void A04(float f2, float f3) {
        View.OnClickListener onClickListener = this.A0M;
        if (onClickListener == null) {
            return;
        }
        if (onClickListener instanceof C93954k2) {
            C76943uy r8 = (C76943uy) ((C93954k2) onClickListener);
            AnonymousClass3HF r6 = r8.A00;
            PhotoView photoView = r6.A01;
            Bitmap photo = photoView.getPhoto();
            if (photo != null) {
                Matrix matrix = new Matrix();
                photoView.getImageMatrix().invert(matrix);
                float[] fArr = {f2, f3};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A012 = AnonymousClass3A1.A01(r8.A01, fArr, fArr2);
                if (A012 != null) {
                    MediaViewFragment.A04(A012, r6.A00, photoView);
                    return;
                }
            }
            MediaViewFragment mediaViewFragment = r6.A00;
            mediaViewFragment.A1P(!mediaViewFragment.A0G, true);
            return;
        }
        onClickListener.onClick(this);
    }

    public final void A05(float f2, float f3, float f4) {
        float min = Math.min(Math.max(f2, this.A04 * this.A08), this.A03);
        float f5 = min / this.A00;
        Matrix matrix = this.A0B;
        matrix.postRotate(-this.A07, (float) (getWidth() >> 1), (float) (getHeight() >> 1));
        matrix.postScale(f5, f5, f3, f4);
        this.A00 = min;
        matrix.postRotate(this.A07, (float) (getWidth() >> 1), (float) (getHeight() >> 1));
        A0A(true);
        setImageMatrix(matrix);
    }

    public void A06(Bitmap bitmap) {
        A07(bitmap == null ? null : new BitmapDrawable(getResources(), bitmap));
    }

    public void A07(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = this.A0J;
        if (bitmapDrawable != bitmapDrawable2) {
            boolean z2 = false;
            if (bitmapDrawable2 != null) {
                if (!(bitmapDrawable != null && bitmapDrawable2.getIntrinsicWidth() == bitmapDrawable.getIntrinsicWidth() && this.A0J.getIntrinsicHeight() == bitmapDrawable.getIntrinsicHeight())) {
                    z2 = true;
                }
                this.A04 = 0.0f;
            }
            this.A0J = bitmapDrawable;
            setImageDrawable(bitmapDrawable);
            A09(z2);
            invalidate();
        }
    }

    public void A08(boolean z2) {
        this.A0Y = z2;
        if (!z2) {
            Matrix matrix = this.A0B;
            matrix.set(this.A0C);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
    }

    public final void A09(boolean z2) {
        float f2;
        float f3;
        float min;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable != null && this.A0W) {
            this.A0J.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.A0J.getIntrinsicHeight());
            if (z2 || (this.A04 == 0.0f && this.A0J != null && this.A0W)) {
                float intrinsicWidth = (float) this.A0J.getIntrinsicWidth();
                float intrinsicHeight = (float) this.A0J.getIntrinsicHeight();
                float width = (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
                float height = (float) ((getHeight() - getPaddingTop()) - getPaddingBottom());
                this.A05 = 0.0f;
                Matrix matrix = this.A0B;
                matrix.reset();
                this.A0H.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                this.A0G.set(0.0f, 0.0f, width, height);
                float f10 = intrinsicWidth / 2.0f;
                float f11 = intrinsicHeight / 2.0f;
                matrix.setTranslate((width / 2.0f) - f10, (height / 2.0f) - f11);
                boolean z3 = this.A0T;
                float abs = Math.abs(this.A07 % 180.0f);
                int i2 = (abs > 90.0f ? 1 : (abs == 90.0f ? 0 : -1));
                if (z3) {
                    if (i2 == 0) {
                        f8 = width / intrinsicHeight;
                        f9 = height / intrinsicWidth;
                    } else {
                        f8 = width / intrinsicWidth;
                        f9 = height / intrinsicHeight;
                    }
                    min = Math.max(f8, f9);
                } else {
                    if (i2 == 0) {
                        f2 = width / intrinsicHeight;
                        f3 = height / intrinsicWidth;
                    } else {
                        f2 = width / intrinsicWidth;
                        f3 = height / intrinsicHeight;
                    }
                    min = Math.min(f2, f3);
                }
                this.A04 = min;
                float f12 = this.A02;
                float min2 = Math.min(min, f12);
                this.A04 = min2;
                int i3 = this.A09;
                if (i3 == 3) {
                    if (abs == 90.0f) {
                        f6 = width / intrinsicHeight;
                        f7 = height / intrinsicWidth;
                    } else {
                        f6 = width / intrinsicWidth;
                        f7 = height / intrinsicHeight;
                    }
                    min2 = Math.max(f6, f7);
                } else if (i3 == 1) {
                    min2 = abs == 90.0f ? width / intrinsicHeight : width / intrinsicWidth;
                } else if (i3 == 2) {
                    min2 = abs == 90.0f ? height / intrinsicWidth : height / intrinsicHeight;
                }
                if (abs == 90.0f) {
                    f4 = width / intrinsicHeight;
                    f5 = height / intrinsicWidth;
                } else {
                    f4 = width / intrinsicWidth;
                    f5 = height / intrinsicHeight;
                }
                if (Math.abs((f4 / f5) - 1.0f) < this.A01) {
                    min2 = Math.max(f4, f5);
                    this.A05 = min2;
                }
                float min3 = Math.min(min2, f12);
                this.A00 = min3;
                this.A05 = Math.min(this.A05, f12);
                matrix.preScale(min3, min3, f10, f11);
                this.A03 = Math.max(this.A04 * 8.0f, 8.0f);
                matrix.postRotate(this.A07, (float) (getWidth() / 2), (float) (getHeight() / 2));
                this.A06 = this.A00;
                this.A0C.set(matrix);
            }
            Matrix matrix2 = this.A0B;
            this.A0A = matrix2;
            setImageMatrix(matrix2);
        }
    }

    public final void A0A(boolean z2) {
        RectF rectF = this.A0I;
        rectF.set(this.A0H);
        Matrix matrix = this.A0B;
        matrix.mapRect(rectF);
        float width = (float) getWidth();
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = width - 0.0f;
        float f6 = f3 - f2 < f5 ? ((f5 - (f3 + f2)) / 2.0f) + 0.0f : f2 > 0.0f ? 0.0f - f2 : f3 < width ? width - f3 : 0.0f;
        float height = (float) getHeight();
        float f7 = rectF.top;
        float f8 = rectF.bottom;
        float f9 = height - 0.0f;
        if (f8 - f7 < f9) {
            f4 = 0.0f + ((f9 - (f8 + f7)) / 2.0f);
        } else if (f7 > 0.0f) {
            f4 = 0.0f - f7;
        } else if (f8 < height) {
            f4 = height - f8;
        }
        if ((Math.abs(f6) > 20.0f || Math.abs(f4) > 20.0f) && !z2) {
            RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I0 = this.A0O;
            if (runnableRunnableShape0S0120102_I0 != null && !runnableRunnableShape0S0120102_I0.A04) {
                runnableRunnableShape0S0120102_I0.A02 = -1;
                runnableRunnableShape0S0120102_I0.A00 = f6;
                runnableRunnableShape0S0120102_I0.A01 = f4;
                runnableRunnableShape0S0120102_I0.A05 = false;
                runnableRunnableShape0S0120102_I0.A04 = true;
                ((View) runnableRunnableShape0S0120102_I0.A03).postDelayed(runnableRunnableShape0S0120102_I0, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f6, f4);
        setImageMatrix(matrix);
    }

    public boolean A0B() {
        if (this.A0Y) {
            RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I0 = this.A0P;
            if (runnableRunnableShape0S0120102_I0 != null && runnableRunnableShape0S0120102_I0.A04) {
                return true;
            }
            float f2 = this.A05;
            int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            float f3 = this.A00;
            if (i2 == 0) {
                if (f3 != this.A04) {
                    return true;
                }
            } else if (f3 > f2) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0C(float f2, float f3) {
        RectF rectF = this.A0I;
        rectF.set(this.A0H);
        Matrix matrix = this.A0B;
        matrix.mapRect(rectF);
        float width = (float) getWidth();
        float f4 = rectF.left;
        float f5 = rectF.right;
        float f6 = width - 0.0f;
        float max = f5 - f4 < f6 ? ((f6 - (f5 + f4)) / 2.0f) + 0.0f : Math.max(width - f5, Math.min(0.0f - f4, f2));
        float height = (float) getHeight();
        float f7 = rectF.top;
        float f8 = rectF.bottom;
        float f9 = height - 0.0f;
        float max2 = f8 - f7 < f9 ? ((f9 - (f8 + f7)) / 2.0f) + 0.0f : Math.max(height - f8, Math.min(0.0f - f7, f3));
        matrix.postTranslate(max, max2);
        setImageMatrix(matrix);
        return max == f2 && max2 == f3;
    }

    public Bitmap getFullViewCroppedBitmap() {
        if (!this.A0T) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix(this.A0A);
        if (this.A0J == null) {
            return createBitmap;
        }
        canvas.concat(matrix);
        this.A0J.draw(canvas);
        return createBitmap;
    }

    public float getMinScale() {
        return this.A04;
    }

    public float getOriginalScale() {
        return this.A06;
    }

    public Bitmap getPhoto() {
        BitmapDrawable bitmapDrawable = this.A0J;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public float getScale() {
        return this.A00;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x2;
        float y2;
        if (!this.A0V || !this.A0Y) {
            return false;
        }
        if (!this.A0U) {
            float f2 = this.A00;
            float f3 = this.A04;
            float f4 = f3 * 2.0f;
            if (f2 == f4) {
                f4 = f3;
            }
            float min = Math.min(this.A03, Math.max(f3, f4));
            C1045856a r4 = this.A0R;
            if (r4 != null) {
                if (min == f3) {
                    x2 = (float) (getWidth() >> 1);
                    y2 = (float) (getHeight() >> 1);
                } else {
                    x2 = motionEvent.getX();
                    y2 = motionEvent.getY();
                }
                r4.A00(f2, min, x2, y2, 200);
            }
        }
        this.A0U = false;
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0Y) {
            return true;
        }
        RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I0 = this.A0P;
        if (runnableRunnableShape0S0120102_I0 != null) {
            runnableRunnableShape0S0120102_I0.A04 = false;
            runnableRunnableShape0S0120102_I0.A05 = true;
        }
        RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I02 = this.A0O;
        if (runnableRunnableShape0S0120102_I02 == null) {
            return true;
        }
        runnableRunnableShape0S0120102_I02.A04 = false;
        runnableRunnableShape0S0120102_I02.A05 = true;
        return true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0J != null && this.A0K != null) {
            int width = (getWidth() - this.A0K.getIntrinsicWidth()) >> 1;
            int height = (getHeight() - this.A0K.getIntrinsicHeight()) >> 1;
            Drawable drawable = this.A0K;
            drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, this.A0K.getIntrinsicHeight() + height);
            this.A0K.draw(canvas);
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I0;
        if (!this.A0Y || (runnableRunnableShape0S0120102_I0 = this.A0P) == null || runnableRunnableShape0S0120102_I0.A04) {
            return true;
        }
        runnableRunnableShape0S0120102_I0.A02 = -1;
        runnableRunnableShape0S0120102_I0.A00 = f2;
        runnableRunnableShape0S0120102_I0.A01 = f3;
        runnableRunnableShape0S0120102_I0.A05 = false;
        runnableRunnableShape0S0120102_I0.A04 = true;
        ((View) runnableRunnableShape0S0120102_I0.A03).post(runnableRunnableShape0S0120102_I0);
        return true;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.A0W = true;
        Matrix matrix = this.A0A;
        if (matrix == null || matrix.equals(getImageMatrix())) {
            A09(z2);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0Y) {
            this.A0X = false;
            A05(this.A00 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0Y) {
            return false;
        }
        C1045856a r1 = this.A0R;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0X = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C1045856a r1;
        if (this.A0Y && this.A0X) {
            this.A0U = true;
            Matrix matrix = this.A0B;
            matrix.set(this.A0C);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
        float f2 = this.A00;
        float f3 = this.A04;
        if (f2 < f3 && (r1 = this.A0R) != null) {
            r1.A00(f2, f3, (float) (getWidth() >> 1), (float) (getHeight() >> 1), 100);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (!this.A0Y) {
            return true;
        }
        A0C(-f2, -f3);
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0M != null && !this.A0X && this.A0V) {
            A04(motionEvent.getX(), motionEvent.getY());
        }
        this.A0X = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.A0L == null || this.A0N == null)) {
            if (!isEnabled()) {
                return false;
            }
            this.A0L.onTouchEvent(motionEvent);
            this.A0N.A00(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return true;
                }
            } else if (this.A0M != null && !this.A0X && pointerCount == 1 && !this.A0V) {
                this.A0E.set(motionEvent.getX(), motionEvent.getY());
                post(this.A0Z);
            }
            RunnableRunnableShape0S0120102_I0 runnableRunnableShape0S0120102_I0 = this.A0P;
            if (runnableRunnableShape0S0120102_I0 != null && !runnableRunnableShape0S0120102_I0.A04) {
                A0A(false);
            }
        }
        return true;
    }

    public void setAllowFullViewCrop(boolean z2) {
        if (z2 != this.A0T) {
            this.A0T = z2;
            requestLayout();
            invalidate();
        }
    }

    public void setDoubleTapToZoomEnabled(boolean z2) {
        this.A0V = z2;
    }

    public void setInitialFitTolerance(float f2) {
        this.A01 = f2;
    }

    public void setInitialScaleType(int i2) {
        this.A09 = i2;
    }

    public void setIsLongpressEnabled(boolean z2) {
        this.A0N.A00.Ae4(z2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0M = onClickListener;
    }

    public void setOverlay(Drawable drawable) {
        this.A0K = drawable;
    }

    public void setUnderscaleAmount(float f2) {
        this.A08 = f2;
    }
}
