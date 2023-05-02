package com.obwhatsapp.reactions;

import X.C109475Sg;
import X.C13690nt;
import X.C13700nu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class ReactionEmojiTextView extends TextEmojiLabel implements C109475Sg {
    public float A00 = 1.0f;
    public float A01;
    public float A02 = 1.0f;
    public int A03;
    public Paint A04;

    public ReactionEmojiTextView(Context context) {
        super(context);
        A06();
    }

    public ReactionEmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06();
    }

    public ReactionEmojiTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A06();
    }

    private void A06() {
        Paint A05 = C13700nu.A05();
        this.A04 = A05;
        C13690nt.A0r(getContext(), A05, R.color.color0691);
        this.A03 = this.A04.getAlpha();
        this.A01 = ((float) getResources().getDimensionPixelSize(R.dimen.dimen0678)) / 2.0f;
    }

    public void onDraw(Canvas canvas) {
        if (isSelected()) {
            canvas.save();
            float f2 = this.A02;
            canvas.scale(f2, f2, getPivotX(), getPivotY());
            canvas.drawCircle(getPivotX(), getPivotY(), this.A01, this.A04);
            canvas.restore();
        }
        canvas.save();
        float f3 = this.A00;
        canvas.scale(f3, f3, getPivotX(), getPivotY());
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setBackgroundAlpha(float f2) {
        this.A04.setAlpha((int) (f2 * ((float) this.A03)));
        invalidate();
    }

    public void setBackgroundScale(float f2) {
        this.A02 = f2;
        invalidate();
    }

    public void setForegroundAlpha(float f2) {
        getPaint().setAlpha((int) (f2 * 255.0f));
        invalidate();
    }

    public void setForegroundScale(float f2) {
        this.A00 = f2;
        invalidate();
    }
}
