package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;

/* renamed from: X.1VR  reason: invalid class name */
public abstract class AnonymousClass1VR extends AnonymousClass1VS implements TextWatcher {
    public float A00;
    public int A01;
    public int A02;
    public Handler A03 = new Handler(Looper.getMainLooper());
    public Runnable A04 = new RunnableRunnableShape11S0100000_I0_10((Object) this, 47);
    public boolean A05 = false;
    public boolean A06;
    public boolean A07;
    public final Paint A08 = new Paint(1);
    public final RectF A09 = new RectF();

    public AnonymousClass1VR(Context context) {
        super(context);
        A06();
    }

    public AnonymousClass1VR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06();
    }

    public AnonymousClass1VR(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A06();
    }

    public abstract float A05(String str);

    public final void A06() {
        this.A02 = getCursorWidth();
        this.A01 = getCursorVerticalPadding();
        Paint paint = this.A08;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getCursorColor());
    }

    public abstract void A07(boolean z2);

    public abstract void afterTextChanged(Editable editable);

    public abstract void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4);

    public abstract int getCursorColor();

    public abstract int getCursorVerticalPadding();

    public abstract int getCursorWidth();

    public boolean hasFocus() {
        return this.A06;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A05 && this.A07) {
            RectF rectF = this.A09;
            float f2 = this.A00;
            rectF.set(f2, (float) this.A01, ((float) this.A02) + f2, (float) (getHeight() - this.A01));
            canvas.drawRect(rectF, this.A08);
        }
    }

    public void onMeasure(int i2, int i3) {
        if (getText() == null || TextUtils.isEmpty(getText().toString())) {
            this.A00 = 0.0f;
        } else {
            float A052 = A05(getText().toString());
            this.A00 = A052;
            i2 = View.MeasureSpec.makeMeasureSpec((int) (A052 + ((float) (this.A05 ? this.A02 : 0)) + ((float) getPaddingLeft()) + ((float) getPaddingRight())), 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void setCustomCursorEnabled(boolean z2) {
        if (this.A05 != z2) {
            this.A05 = z2;
            Handler handler = this.A03;
            Runnable runnable = this.A04;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            boolean z3 = !z2;
            setFocusable(z3);
            setCursorVisible(z3);
            if (z2) {
                addTextChangedListener(this);
            } else {
                removeTextChangedListener(this);
            }
        }
    }

    public void setHasFocus(boolean z2) {
        if (z2 != this.A06) {
            this.A06 = z2;
            Handler handler = this.A03;
            Runnable runnable = this.A04;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            A07(z2);
        }
    }
}
