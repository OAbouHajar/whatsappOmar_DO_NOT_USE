package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape0S0220102_I0;

/* renamed from: X.2Kn  reason: invalid class name and case insensitive filesystem */
public class C47792Kn implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Context A05;
    public Matrix A06;
    public Matrix A07 = new Matrix();
    public Matrix A08 = new Matrix();
    public RectF A09 = new RectF();
    public RectF A0A = new RectF();
    public RectF A0B = new RectF();
    public View.OnClickListener A0C;
    public View A0D;
    public RunnableRunnableShape0S0220102_I0 A0E;
    public RunnableRunnableShape0S0220102_I0 A0F;
    public C47782Km A0G;
    public C1045956b A0H;
    public C1044955p A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public C47792Kn(Context context, View view, C47782Km r5) {
        this.A05 = context;
        this.A0D = view;
        this.A0G = r5;
        this.A0H = new C1045956b(view, this);
        this.A0F = new RunnableRunnableShape0S0220102_I0(view, this, 1);
        this.A0E = new RunnableRunnableShape0S0220102_I0(view, this, 0);
        this.A0I = new C1044955p(view, this);
    }

    public final void A00() {
        if (this.A0K) {
            RectF rectF = this.A09;
            float width = rectF.width();
            float height = rectF.height();
            View view = this.A0D;
            float width2 = (float) ((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight());
            float height2 = (float) ((view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom());
            this.A03 = 0.0f;
            Matrix matrix = this.A07;
            matrix.reset();
            this.A0A.set(0.0f, 0.0f, width2, height2);
            float f2 = width2 / width;
            float f3 = height2 / height;
            float min = Math.min(f2, f3);
            this.A02 = min;
            float min2 = Math.min(min, Float.MAX_VALUE);
            this.A02 = min2;
            float f4 = min2;
            if (Math.abs((f2 / f3) - 1.0f) < 0.0f) {
                min2 = Math.max(f2, f3);
                this.A03 = min2;
            }
            this.A00 = Math.min(min2, Float.MAX_VALUE);
            this.A03 = Math.min(this.A03, Float.MAX_VALUE);
            this.A01 = Math.max(f4 * 8.0f, 8.0f);
            float f5 = width / 2.0f;
            float f6 = height / 2.0f;
            matrix.setTranslate((width2 / 2.0f) - f5, (height2 / 2.0f) - f6);
            float f7 = this.A00;
            matrix.preScale(f7, f7, f5, f6);
            this.A04 = this.A00;
            this.A08.set(matrix);
            this.A06 = matrix;
            this.A0G.A00(matrix);
        }
    }

    public final void A01(float f2, float f3, float f4) {
        float min = Math.min(Math.max(f2, this.A02 * 0.8f), this.A01);
        float f5 = min / this.A00;
        Matrix matrix = this.A07;
        matrix.postScale(f5, f5, f3, f4);
        this.A00 = min;
        A02(true);
        this.A0G.A00(matrix);
    }

    public final void A02(boolean z2) {
        RectF rectF = this.A0B;
        rectF.set(this.A09);
        Matrix matrix = this.A07;
        matrix.mapRect(rectF);
        View view = this.A0D;
        float width = (float) view.getWidth();
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = width - 0.0f;
        float f6 = f3 - f2 < f5 ? ((f5 - (f3 + f2)) / 2.0f) + 0.0f : f2 > 0.0f ? 0.0f - f2 : f3 < width ? width - f3 : 0.0f;
        float height = (float) view.getHeight();
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
            RunnableRunnableShape0S0220102_I0 runnableRunnableShape0S0220102_I0 = this.A0E;
            if (runnableRunnableShape0S0220102_I0 != null && !runnableRunnableShape0S0220102_I0.A05) {
                runnableRunnableShape0S0220102_I0.A02 = -1;
                runnableRunnableShape0S0220102_I0.A00 = f6;
                runnableRunnableShape0S0220102_I0.A01 = f4;
                runnableRunnableShape0S0220102_I0.A06 = false;
                runnableRunnableShape0S0220102_I0.A05 = true;
                ((View) runnableRunnableShape0S0220102_I0.A04).postDelayed(runnableRunnableShape0S0220102_I0, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f6, f4);
        this.A0G.A00(matrix);
    }

    public final boolean A03(float f2, float f3) {
        RectF rectF = this.A0B;
        rectF.set(this.A09);
        Matrix matrix = this.A07;
        matrix.mapRect(rectF);
        View view = this.A0D;
        float width = (float) view.getWidth();
        float f4 = rectF.left;
        float f5 = rectF.right;
        float f6 = width - 0.0f;
        float max = f5 - f4 < f6 ? ((f6 - (f5 + f4)) / 2.0f) + 0.0f : Math.max(width - f5, Math.min(0.0f - f4, f2));
        float height = (float) view.getHeight();
        float f7 = rectF.top;
        float f8 = rectF.bottom;
        float f9 = height - 0.0f;
        float max2 = f8 - f7 < f9 ? ((f9 - (f8 + f7)) / 2.0f) + 0.0f : Math.max(height - f8, Math.min(0.0f - f7, f3));
        matrix.postTranslate(max, max2);
        this.A0G.A00(matrix);
        return max == f2 && max2 == f3;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x2;
        float y2;
        boolean z2 = false;
        if (!this.A0M) {
            return false;
        }
        if (!this.A0J) {
            float f2 = this.A00;
            float f3 = this.A02;
            float f4 = f3;
            if (f2 == f3) {
                f4 = 2.0f * f3;
            }
            float min = Math.min(this.A01, Math.max(f3, f4));
            C1045956b r5 = this.A0H;
            if (r5 != null) {
                if (min == f3) {
                    View view = this.A0D;
                    x2 = (float) (view.getWidth() >> 1);
                    y2 = (float) (view.getHeight() >> 1);
                } else {
                    x2 = motionEvent.getX();
                    y2 = motionEvent.getY();
                }
                r5.A00(f2, min, x2, y2, 200);
            }
        }
        this.A0J = false;
        C47782Km r3 = this.A0G;
        if (this.A00 != this.A02) {
            z2 = true;
        }
        r3.A01(z2);
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0M) {
            return true;
        }
        RunnableRunnableShape0S0220102_I0 runnableRunnableShape0S0220102_I0 = this.A0F;
        if (runnableRunnableShape0S0220102_I0 != null) {
            runnableRunnableShape0S0220102_I0.A05 = false;
            runnableRunnableShape0S0220102_I0.A06 = true;
        }
        RunnableRunnableShape0S0220102_I0 runnableRunnableShape0S0220102_I02 = this.A0E;
        if (runnableRunnableShape0S0220102_I02 == null) {
            return true;
        }
        runnableRunnableShape0S0220102_I02.A05 = false;
        runnableRunnableShape0S0220102_I02.A06 = true;
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        RunnableRunnableShape0S0220102_I0 runnableRunnableShape0S0220102_I0;
        if (!this.A0M || (runnableRunnableShape0S0220102_I0 = this.A0F) == null || runnableRunnableShape0S0220102_I0.A05) {
            return true;
        }
        runnableRunnableShape0S0220102_I0.A02 = -1;
        runnableRunnableShape0S0220102_I0.A00 = f2;
        runnableRunnableShape0S0220102_I0.A01 = f3;
        runnableRunnableShape0S0220102_I0.A06 = false;
        runnableRunnableShape0S0220102_I0.A05 = true;
        ((View) runnableRunnableShape0S0220102_I0.A04).post(runnableRunnableShape0S0220102_I0);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0M) {
            this.A0L = false;
            A01(this.A00 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0M) {
            return false;
        }
        C1045956b r1 = this.A0H;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        this.A0L = true;
        C47782Km r2 = this.A0G;
        boolean z2 = false;
        if (this.A00 <= this.A02) {
            z2 = true;
        }
        r2.A01(z2);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C1045956b r2;
        if (this.A0M && this.A0L) {
            this.A0J = true;
            Matrix matrix = this.A07;
            matrix.set(this.A08);
            this.A00 = this.A04;
            this.A0G.A00(matrix);
        }
        float f2 = this.A00;
        float f3 = this.A02;
        if (f2 < f3 && (r2 = this.A0H) != null) {
            View view = this.A0D;
            r2.A00(f2, f3, (float) (view.getWidth() >> 1), (float) (view.getHeight() >> 1), 100);
        }
        C47782Km r22 = this.A0G;
        boolean z2 = false;
        if (this.A00 <= this.A02) {
            z2 = true;
        }
        r22.A01(z2);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.A0M) {
            A03(-f2, -f3);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.A0C;
        if (!(onClickListener == null || this.A0L || onClickListener == null)) {
            onClickListener.onClick(this.A0D);
        }
        this.A0L = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
