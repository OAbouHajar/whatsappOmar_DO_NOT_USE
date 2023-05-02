package com.obwhatsapp.calling.views;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass2JP;
import X.AnonymousClass2Tr;
import X.AnonymousClass49M;
import X.AnonymousClass5MZ;
import X.C101164wp;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.obwhatsapp.R;

public class VoipCallControlBottomSheetDragIndicator extends View implements AnonymousClass006 {
    public float A00;
    public float A01;
    public int A02;
    public AnonymousClass5MZ A03;
    public AnonymousClass013 A04;
    public C52662eE A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;

    public VoipCallControlBottomSheetDragIndicator(Context context) {
        super(context);
        A00();
        this.A08 = new Paint(1);
        this.A09 = new Path();
        this.A01 = -1.0f;
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = new Paint(1);
        this.A09 = new Path();
        this.A01 = -1.0f;
        A01(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A08 = new Paint(1);
        this.A09 = new Path();
        this.A01 = -1.0f;
        A01(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A08 = new Paint(1);
        this.A09 = new Path();
        this.A01 = -1.0f;
        A01(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            this.A04 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass49M.A00);
            try {
                int color = obtainStyledAttributes.getColor(0, -1);
                obtainStyledAttributes.recycle();
                Paint paint = this.A08;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(context.getResources().getDisplayMetrics().density * 4.0f);
                paint.setColor(color);
                this.A00 = TypedValue.applyDimension(1, 2.5f, getResources().getDisplayMetrics());
                AnonymousClass2JP.A02(this);
                Context context2 = getContext();
                int i2 = (this.A01 > 0.0f ? 1 : (this.A01 == 0.0f ? 0 : -1));
                int i3 = R.string.str1abc;
                if (i2 > 0) {
                    i3 = R.string.str1ac9;
                }
                setContentDescription(context2.getString(i3));
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final boolean A02(int i2) {
        AnonymousClass5MZ r0;
        if (i2 == 0) {
            this.A06 = true;
            return false;
        } else if (i2 != 1) {
            if (i2 != 2) {
                this.A06 = false;
            }
            return false;
        } else {
            if (this.A06 && (r0 = this.A03) != null) {
                float f2 = this.A01;
                AnonymousClass2Tr r2 = ((C101164wp) r0).A00.A0H;
                if (r2 != null) {
                    int i3 = 3;
                    if (f2 > 0.0f) {
                        i3 = 4;
                    }
                    r2.A02(i3);
                }
            }
            this.A06 = false;
            return true;
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float width = (float) (getWidth() - getPaddingRight());
        float height = (float) (getHeight() - getPaddingBottom());
        float f2 = (height + paddingTop) / 2.0f;
        float f3 = this.A01;
        float f4 = (((height - paddingTop) / 2.0f) * f3) + f2;
        float f5 = f2 + (this.A00 * (-f3));
        Path path = this.A09;
        path.reset();
        path.moveTo(paddingLeft, f5);
        path.lineTo((paddingLeft + width) / 2.0f, f4);
        path.lineTo(width, f5);
        canvas.drawPath(path, this.A08);
    }

    public void setOnClickListener(AnonymousClass5MZ r3) {
        this.A03 = r3;
        super.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 2));
    }

    public void setSlideOffset(float f2) {
        float f3 = f2 > 1.0f ? 1.0f : f2 <= 0.0f ? -1.0f : (f2 - 0.5f) * 2.0f;
        this.A01 = f3;
        if (f3 == 1.0f || f3 == -1.0f) {
            Context context = getContext();
            int i2 = (this.A01 > 0.0f ? 1 : (this.A01 == 0.0f ? 0 : -1));
            int i3 = R.string.str1abc;
            if (i2 > 0) {
                i3 = R.string.str1ac9;
            }
            setContentDescription(context.getString(i3));
        }
        invalidate();
    }
}
