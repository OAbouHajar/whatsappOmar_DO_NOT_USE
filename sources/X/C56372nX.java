package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.2nX  reason: invalid class name and case insensitive filesystem */
public class C56372nX extends InsetDrawable {
    public int A00;
    public int A01;
    public final Rect A02 = AnonymousClass000.A0J();
    public final TextPaint A03;
    public final String A04;

    public C56372nX(Context context, String str, int i2, int i3) {
        super(AnonymousClass00T.A04(context, i2), 0);
        TextPaint textPaint = new TextPaint();
        this.A03 = textPaint;
        this.A04 = str;
        textPaint.setAntiAlias(true);
        C13690nt.A0r(context, textPaint, 17170443);
        textPaint.setTextSize((float) i3);
        textPaint.setTextAlign(Paint.Align.CENTER);
        Typeface create = Typeface.create(Typeface.DEFAULT, 1);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            if (!(this.A01 == getBounds().width() && this.A00 == getBounds().height())) {
                this.A01 = getBounds().width();
                int height = getBounds().height();
                this.A00 = height;
                float f2 = (float) (height >> 1);
                TextPaint textPaint = this.A03;
                textPaint.setTextSize(f2);
                int length = str.length();
                Rect rect = this.A02;
                textPaint.getTextBounds(str, 0, length, rect);
                float f3 = f2;
                float f4 = f2;
                float f5 = 2.0f;
                while (f3 - f5 > 2.0f) {
                    textPaint.setTextSize(f4);
                    textPaint.getTextBounds(str, 0, length, rect);
                    if (rect.width() >= (this.A01 << 3) / 10 || rect.height() >= (this.A00 >> 1)) {
                        f3 = f4;
                    } else {
                        f5 = f4;
                        if (f2 == f4) {
                            break;
                        }
                    }
                    f4 = (f5 + f3) / 2.0f;
                }
                textPaint.setTextSize(f5);
            }
            canvas.drawText(str, (float) getBounds().centerX(), (float) (getBounds().centerY() + (this.A02.height() >> 1) + (this.A00 / 10)), this.A03);
        }
    }
}
