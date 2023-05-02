package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import com.obwhatsapp.TextData;

/* renamed from: X.2nU  reason: invalid class name and case insensitive filesystem */
public class C56342nU extends Drawable {
    public static final AnonymousClass5QW A08;
    public float A00;
    public int A01;
    public int A02;
    public Layout A03;
    public final Paint A04 = C13680ns.A0E();
    public final Typeface A05;
    public final TextData A06;
    public final CharSequence A07;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            A08 = new AnonymousClass52H();
        } else {
            A08 = new AnonymousClass52I();
        }
    }

    public C56342nU(Context context, Typeface typeface, TextData textData, AnonymousClass01V r5, C17250um r6, C17020u3 r7, String str) {
        this.A07 = AnonymousClass1ZW.A02(C45922Bq.A03(r5, r7, AnonymousClass2Sy.A05(context, r6, str)));
        this.A06 = textData;
        this.A05 = typeface;
    }

    public void draw(Canvas canvas) {
        int i2;
        Rect bounds = getBounds();
        Paint paint = this.A04;
        TextData textData = this.A06;
        if (textData == null || (i2 = textData.backgroundColor) == 0) {
            i2 = 1711276032;
        }
        C13690nt.A0n(i2, paint);
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), ((float) (bounds.width() >> 1)) - this.A00, paint);
        if (this.A03 != null) {
            canvas.translate((float) ((bounds.width() - this.A03.getWidth()) >> 1), (float) ((bounds.height() - this.A03.getHeight()) >> 1));
            this.A03.draw(canvas);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0022 A[SYNTHETIC] */
    public void setBounds(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            super.setBounds(r12, r13, r14, r15)
            int r14 = r14 - r12
            float r1 = (float) r14
            float r4 = r11.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r0
            float r1 = r1 - r4
            double r0 = (double) r1
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.sqrt(r2)
            double r0 = r0 / r2
            int r5 = (int) r0
            int r15 = r15 - r13
            float r0 = (float) r15
            float r0 = r0 - r4
            double r0 = (double) r0
            double r0 = r0 / r2
            int r7 = (int) r0
            int r0 = r11.A01
            if (r0 != r7) goto L_0x0023
            int r0 = r11.A02
            if (r0 != r5) goto L_0x0023
        L_0x0022:
            return
        L_0x0023:
            r11.A02 = r5
            r11.A01 = r7
            r0 = 1
            android.text.TextPaint r6 = new android.text.TextPaint
            r6.<init>(r0)
            int r0 = r7 >> 1
            float r0 = (float) r0
            r6.setTextSize(r0)
            com.obwhatsapp.TextData r0 = r11.A06
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.textColor
            if (r0 == 0) goto L_0x00bd
        L_0x003b:
            r6.setColor(r0)
            android.graphics.Typeface r0 = r11.A05
            java.lang.CharSequence r4 = r11.A07
            r3 = 0
            if (r4 == 0) goto L_0x004d
            int r1 = r4.length()
            r0 = 100
            if (r1 > r0) goto L_0x00ad
        L_0x004d:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0022
            boolean r0 = r4 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x008a
            android.graphics.Paint$FontMetricsInt r10 = X.C89684cj.A00(r6)
            float r1 = r6.getTextSize()
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r9 = (int) r1
            r2 = r4
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r4.length()
            java.lang.Class<X.35o> r0 = X.C607235o.class
            r8 = 0
            java.lang.Object[] r2 = r2.getSpans(r3, r1, r0)
            X.35o[] r2 = (X.C607235o[]) r2
            if (r2 == 0) goto L_0x008a
            int r1 = r2.length
        L_0x007a:
            if (r8 >= r1) goto L_0x008a
            r0 = r2[r8]
            r0.A00 = r10
            android.graphics.drawable.Drawable r0 = r0.A03()
            r0.setBounds(r3, r3, r9, r9)
            int r8 = r8 + 1
            goto L_0x007a
        L_0x008a:
            X.5QW r0 = A08
            android.text.Layout r0 = r0.A7Q(r6, r4, r5)
            r11.A03 = r0
            int r0 = r0.getHeight()
            if (r0 <= r7) goto L_0x0022
            float r2 = r6.getTextSize()
            int r0 = r7 >> 3
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            int r0 = r4.length()
            int r0 = r0 / r1
        L_0x00ad:
            java.lang.CharSequence r4 = r4.subSequence(r3, r0)
            goto L_0x004d
        L_0x00b2:
            float r1 = r6.getTextSize()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r6.setTextSize(r1)
            goto L_0x004d
        L_0x00bd:
            r0 = -1
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56342nU.setBounds(int, int, int, int):void");
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
