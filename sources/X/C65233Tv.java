package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

/* renamed from: X.3Tv  reason: invalid class name and case insensitive filesystem */
public class C65233Tv extends C49832Wc {
    public AnonymousClass4SJ A00 = new AnonymousClass4SJ(this);

    public C65233Tv(Context context) {
        super(context, (AttributeSet) null);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        AnonymousClass4SJ r4 = this.A00;
        if (r4.A04) {
            Path path = r4.A08;
            if (path.isEmpty()) {
                RectF rectF = r4.A09;
                float f2 = r4.A00;
                RectF rectF2 = r4.A0A;
                rectF.set(f2, f2, rectF2.right - f2, rectF2.bottom - f2);
                path.addRect(rectF2, Path.Direction.CW);
                int i2 = r4.A03;
                boolean A02 = C89544cP.A02(i2);
                float f3 = r4.A02;
                if (A02) {
                    path.addRoundRect(rectF2, f3, f3, Path.Direction.CCW);
                } else {
                    float[] fArr = r4.A0C;
                    C89544cP.A01(fArr, f3, i2);
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    Path path2 = r4.A07;
                    path2.reset();
                    C89544cP.A01(fArr, r4.A01, r4.A03);
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                }
            }
            canvas.drawPath(path, r4.A06);
            if (C89544cP.A02(r4.A03)) {
                RectF rectF3 = r4.A09;
                float f4 = r4.A01;
                canvas.drawRoundRect(rectF3, f4, f4, r4.A05);
                return;
            }
            canvas.drawPath(r4.A07, r4.A05);
        }
    }

    public AnonymousClass4SJ getDecorationHelper() {
        return this.A00;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        AnonymousClass4SJ r5 = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = r5.A0A;
        float f2 = (float) measuredWidth;
        if (rectF.right != f2 || rectF.bottom != ((float) measuredHeight)) {
            rectF.set(0.0f, 0.0f, f2, (float) measuredHeight);
            r5.A08.reset();
        }
    }
}
