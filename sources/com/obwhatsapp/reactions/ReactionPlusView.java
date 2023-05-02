package com.obwhatsapp.reactions;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass00X;
import X.AnonymousClass2JP;
import X.C018208n;
import X.C109475Sg;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class ReactionPlusView extends View implements C109475Sg {
    public float A00;
    public float A01 = 0.625f;
    public float A02 = 1.0f;
    public int A03;
    public int A04;
    public Drawable A05;
    public final Paint A06 = C13680ns.A0E();

    public ReactionPlusView(Context context) {
        super(context);
        A00();
    }

    public ReactionPlusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ReactionPlusView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public final void A00() {
        this.A04 = getResources().getDimensionPixelSize(R.dimen.dimen0679);
        this.A00 = ((float) getResources().getDimensionPixelSize(R.dimen.dimen0678)) / 2.0f;
        Drawable A042 = AnonymousClass00X.A04(C13700nu.A04(this), getResources(), R.drawable.ic_reactions_plus);
        AnonymousClass00B.A06(A042);
        this.A05 = A042;
        Drawable A032 = C018208n.A03(A042);
        this.A05 = A032;
        C018208n.A0A(A032, AnonymousClass00T.A00(getContext(), R.color.color0690));
        Paint paint = this.A06;
        C13690nt.A0r(getContext(), paint, R.color.color068f);
        this.A03 = paint.getAlpha();
        AnonymousClass2JP.A02(this);
        C13680ns.A0t(getContext(), this, R.string.str1346);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f2 = this.A01;
        canvas.scale(f2, f2, getPivotX(), getPivotY());
        canvas.drawCircle(getPivotX(), getPivotY(), this.A00, this.A06);
        canvas.restore();
        canvas.save();
        float f3 = this.A02;
        canvas.scale(f3, f3, getPivotX(), getPivotY());
        this.A05.draw(canvas);
        canvas.restore();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = i2 >> 1;
        int i7 = i3 >> 1;
        int i8 = this.A04 >> 1;
        this.A05.setBounds(i6 - i8, i7 - i8, i6 + i8, i7 + i8);
    }

    public void setBackgroundAlpha(float f2) {
        this.A06.setAlpha((int) (((float) this.A03) * f2));
        invalidate();
    }

    public void setBackgroundScale(float f2) {
        this.A01 = f2 * 0.625f;
        invalidate();
    }

    public void setForegroundAlpha(float f2) {
        this.A05.setAlpha((int) (f2 * 255.0f));
        invalidate();
    }

    public void setForegroundScale(float f2) {
        this.A02 = f2;
        invalidate();
    }
}
