package X;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.LineBackgroundSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0YP  reason: invalid class name */
public class AnonymousClass0YP implements LineBackgroundSpan {
    public final Paint A00;
    public final List A01;

    public AnonymousClass0YP(Layout layout, float f2, float f3, float f4, float f5, float f6, int i2) {
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        int i3 = 0;
        while (true) {
            Layout layout2 = layout;
            if (i3 >= layout2.getLineCount()) {
                break;
            }
            RectF rectF = new RectF(layout2.getLineLeft(i3), (float) layout2.getLineTop(i3), layout2.getLineRight(i3), (float) layout2.getLineBottom(i3));
            String charSequence = layout2.getText().subSequence(layout2.getLineStart(i3), layout2.getLineEnd(i3)).toString();
            if (rectF.width() > 0.0f && !TextUtils.isEmpty(charSequence.replace(IOUtils.LINE_SEPARATOR_UNIX, ""))) {
                A0u2.add(rectF);
            } else if (!A0u2.isEmpty()) {
                A0u.add(A0u2);
                A0u2 = AnonymousClass000.A0u();
            }
            i3++;
        }
        if (!A0u2.isEmpty()) {
            A0u.add(A0u2);
        }
        ArrayList A0u3 = AnonymousClass000.A0u();
        int i4 = 0;
        while (true) {
            float f7 = f6;
            if (i4 < A0u.size()) {
                List list = (List) A0u.get(i4);
                Path A0I = AnonymousClass000.A0I();
                A0u3.add(A0I);
                int size = list.size();
                int i5 = size << 1;
                PointF[] pointFArr = new PointF[i5];
                PointF[] pointFArr2 = new PointF[i5];
                for (int i6 = 0; i6 <= size - 1; i6++) {
                    RectF rectF2 = (RectF) list.get(i6);
                    int i7 = i6 << 1;
                    int i8 = i7 + 1;
                    pointFArr2[i7] = new PointF(rectF2.right + f3, rectF2.top - f4);
                    pointFArr2[i8] = new PointF(rectF2.right + f3, rectF2.bottom + f5);
                    pointFArr[i7] = new PointF(rectF2.left - f2, rectF2.top - f4);
                    pointFArr[i8] = new PointF(rectF2.left - f2, rectF2.bottom + f5);
                }
                for (int i9 = 1; i9 < pointFArr2.length; i9++) {
                    PointF pointF = pointFArr2[i9];
                    PointF pointF2 = pointFArr2[i9 - 1];
                    float f8 = pointF.x;
                    float f9 = pointF2.x;
                    if (f8 > f9) {
                        pointF2.y = pointF.y;
                    } else if (f8 < f9) {
                        pointF.y = pointF2.y;
                    }
                }
                for (int i10 = 1; i10 < pointFArr.length; i10++) {
                    PointF pointF3 = pointFArr[i10];
                    PointF pointF4 = pointFArr[i10 - 1];
                    float f10 = pointF3.x;
                    float f11 = pointF4.x;
                    if (f10 > f11) {
                        pointF3.y = pointF4.y;
                    } else if (f10 < f11) {
                        pointF4.y = pointF3.y;
                    }
                }
                List A002 = A00(pointFArr2, f7, true);
                List A003 = A00(pointFArr, f7, false);
                A0I.moveTo(((PointF) A002.get(0)).x, ((PointF) A002.get(0)).y);
                for (int i11 = 1; i11 < A002.size(); i11++) {
                    A0I.lineTo(((PointF) A002.get(i11)).x, ((PointF) A002.get(i11)).y);
                }
                for (int size2 = A003.size() - 1; size2 >= 0; size2--) {
                    A0I.lineTo(((PointF) A003.get(size2)).x, ((PointF) A003.get(size2)).y);
                }
                A0I.close();
                i4++;
            } else {
                this.A01 = A0u3;
                Paint paint = new Paint(1);
                this.A00 = paint;
                paint.setColor(i2);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setPathEffect(new CornerPathEffect(f7));
                return;
            }
        }
    }

    public static List A00(PointF[] pointFArr, float f2, boolean z2) {
        ArrayList A0u = AnonymousClass000.A0u();
        Collections.addAll(A0u, pointFArr);
        int i2 = 0;
        while (i2 < (A0u.size() >> 1) - 1) {
            int i3 = i2 << 1;
            PointF pointF = (PointF) A0u.get(i3);
            PointF pointF2 = (PointF) A0u.get(i3 + 1);
            PointF pointF3 = (PointF) A0u.get(i3 + 2);
            PointF pointF4 = (PointF) A0u.get(i3 + 3);
            if (Math.abs(pointF2.x - pointF3.x) < f2) {
                A0u.remove(pointF2);
                A0u.remove(pointF3);
                float f3 = pointF.x;
                float f4 = pointF4.x;
                float max = z2 ? Math.max(f3, f4) : Math.min(f3, f4);
                pointF4.x = max;
                pointF.x = max;
                i2--;
            }
            i2++;
        }
        return A0u;
    }

    public void drawBackground(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, int i9) {
        for (Path drawPath : this.A01) {
            canvas.drawPath(drawPath, this.A00);
        }
    }
}
