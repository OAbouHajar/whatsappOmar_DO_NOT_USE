package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.obwhatsapp.R;
import java.text.DecimalFormat;

/* renamed from: X.2nQ  reason: invalid class name and case insensitive filesystem */
public class C56302nQ extends Drawable {
    public double A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A05;

    public C56302nQ(Context context) {
        TextPaint textPaint = new TextPaint();
        this.A04 = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(36.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        Rect A0J = AnonymousClass000.A0J();
        this.A05 = A0J;
        textPaint.getTextBounds("9.9B", 0, 4, A0J);
        Paint A0E = C13680ns.A0E();
        this.A03 = A0E;
        C13690nt.A0n(-1, A0E);
        int A002 = C87594Xo.A00(context, 4.0f);
        this.A02 = A002;
        A0E.setShadowLayer((float) A002, 0.0f, 0.0f, context.getResources().getColor(R.color.color009f));
        int width = A0J.width() + C87594Xo.A00(context, 24.0f) + A002;
        this.A01 = width;
        setBounds(0, 0, width, width);
    }

    public void draw(Canvas canvas) {
        String A0h;
        StringBuilder A0o;
        Rect bounds = getBounds();
        float centerX = (float) bounds.centerX();
        canvas.drawCircle(centerX, (float) bounds.centerY(), (float) ((bounds.width() >> 1) - this.A02), this.A03);
        int i2 = this.A01;
        Rect rect = this.A05;
        float height = (float) (((i2 - rect.height()) >> 1) + rect.height());
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        double d2 = this.A00;
        if (d2 < 0.0d || d2 > 999.0d) {
            String str = "k";
            double d3 = 1000.0d;
            if (d2 < 1000.0d || d2 > 9999.0d) {
                if (d2 < 10000.0d || d2 > 99999.0d) {
                    str = "M";
                    d3 = 1000000.0d;
                    if (d2 < 100000.0d || d2 > 9999999.0d) {
                        if (d2 < 1.0E7d || d2 > 9.9999999E7d) {
                            StringBuilder A0o2 = AnonymousClass000.A0o();
                            A0o2.append(decimalFormat.format(d2 / 1.0E9d));
                            A0h = AnonymousClass000.A0h("B", A0o2);
                        }
                    }
                }
                A0o = AnonymousClass000.A0o();
                A0o.append(Math.round((float) ((int) (d2 / d3))));
                A0h = AnonymousClass000.A0h(str, A0o);
            }
            A0o = AnonymousClass000.A0o();
            A0o.append(decimalFormat.format(d2 / d3));
            A0h = AnonymousClass000.A0h(str, A0o);
        } else {
            A0h = String.valueOf((int) d2);
        }
        canvas.drawText(A0h, centerX, height, this.A04);
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i2) {
        this.A03.setAlpha(i2);
        this.A04.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }
}
