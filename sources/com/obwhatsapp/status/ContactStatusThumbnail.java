package com.obwhatsapp.status;

import X.AnonymousClass00T;
import X.C55362jQ;
import X.C817749r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.Map;
import rc.whatsapp.stories.value.Stories;

public class ContactStatusThumbnail extends C55362jQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final RectF A05 = new RectF();
    public final Map A06 = new HashMap();

    public ContactStatusThumbnail(Context context) {
        super(context);
        A02(context, (AttributeSet) null);
    }

    public ContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public ContactStatusThumbnail(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02(context, attributeSet);
    }

    private void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C817749r.A00);
            int integer = obtainStyledAttributes.getInteger(1, 0);
            this.A01 = Stories.seenColor();
            int integer2 = obtainStyledAttributes.getInteger(2, 0);
            this.A03 = Stories.unseenColor();
            obtainStyledAttributes.recycle();
        }
        this.A00 = AnonymousClass00T.A00(context, R.color.color017b);
    }

    public void A04(Canvas canvas) {
        if (this.A02 > 0) {
            this.A05.setStrokeWidth(this.A01);
            this.A05.setStyle(Paint.Style.STROKE);
            this.A05.setStrokeCap(Paint.Cap.ROUND);
            RectF rectF = this.A05;
            float f2 = 0.0f;
            rectF.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            float f3 = this.A01 / 2.0f;
            rectF.inset(f3, f3);
            Paint paint = this.A05;
            int i2 = this.A00;
            paint.setColor(0);
            Canvas canvas2 = canvas;
            canvas.drawOval(rectF, this.A05);
            int i3 = this.A02;
            float f4 = 360.0f / ((float) i3);
            float f5 = -90.0f;
            if (i3 != 1) {
                f2 = f4 <= 24.0f ? f4 / 2.0f : 12.0f;
            }
            this.A05.setStrokeWidth(this.A01 - 1.0f);
            int i4 = 0;
            while (i4 < this.A02) {
                Paint paint2 = this.A05;
                Map map = this.A06;
                paint2.setColor(map.containsKey(Integer.valueOf(i4)) ? ((Number) map.get(Integer.valueOf(i4))).intValue() : i4 < this.A04 ? this.A03 : this.A01);
                canvas2.drawArc(rectF, f5 + (f2 / 2.0f), f4 - f2, false, this.A05);
                f5 += f4;
                i4++;
            }
        }
    }

    public void A05(int i2, int i3) {
        this.A04 = i2;
        this.A02 = i3;
        invalidate();
    }

    public void a(int i2, int i3) {
        this.A04 = i2;
        this.A02 = i3;
        invalidate();
    }

    public int getTotalCount() {
        return this.A02;
    }

    public void seen(int i2) {
        this.A01 = i2;
        invalidate();
    }

    public void unseen(int i2) {
        this.A03 = i2;
        invalidate();
    }
}
