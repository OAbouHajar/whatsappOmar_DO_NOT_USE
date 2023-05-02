package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.35o  reason: invalid class name and case insensitive filesystem */
public class C607235o extends C56522nn {
    public Paint.FontMetricsInt A00;
    public AnonymousClass3Ky A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final CharSequence A05;

    public C607235o(Context context, Paint.FontMetricsInt fontMetricsInt, Drawable drawable, CharSequence charSequence) {
        super(drawable);
        this.A05 = charSequence;
        this.A04 = AnonymousClass00T.A00(context, R.color.color04f8);
        this.A03 = (int) C13680ns.A01(context);
        this.A00 = fontMetricsInt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r2[0] == r6) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof android.text.Spanned
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x002b
            r2 = r7
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r6.A05
            int r1 = r0.length()
            int r1 = r1 + r8
            java.lang.Class<X.35o> r0 = X.C607235o.class
            java.lang.Object[] r2 = r2.getSpans(r8, r1, r0)
            X.35o[] r2 = (X.C607235o[]) r2
            char r1 = r7.charAt(r8)
            r0 = 65532(0xfffc, float:9.183E-41)
            if (r1 != r0) goto L_0x002b
            if (r2 == 0) goto L_0x002b
            int r0 = r2.length
            if (r0 <= 0) goto L_0x002b
            r0 = r2[r4]
            if (r0 != r6) goto L_0x002b
        L_0x002a:
            return r5
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.lang.CharSequence r1 = r6.A05
            int r0 = r1.length()
            if (r3 >= r0) goto L_0x002a
            int r2 = r8 + r3
            int r0 = r7.length()
            if (r2 >= r0) goto L_0x002a
            char r1 = r1.charAt(r3)
            char r0 = r7.charAt(r2)
            if (r1 == r0) goto L_0x0047
            return r4
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C607235o.A04(java.lang.CharSequence, int):boolean");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        CharSequence charSequence2 = charSequence;
        int i7 = i2;
        if (A04(charSequence2, i7)) {
            Canvas canvas2 = canvas;
            float f3 = f2;
            int i8 = i5;
            Paint paint2 = paint;
            if (this.A02) {
                AnonymousClass3Ky r4 = this.A01;
                if (r4 == null) {
                    r4 = new AnonymousClass3Ky(this.A04, paint2);
                    this.A01 = r4;
                }
                float f4 = (float) (A03().getBounds().right + this.A03);
                float f5 = ((float) i8) + r4.A00 + (r4.A01 / 2.0f);
                Canvas canvas3 = canvas2;
                float f6 = f3;
                canvas3.drawLine(f6, f5, f2 + f4, f5, r4);
            }
            super.draw(canvas2, charSequence2, i7, i3, f3, i4, i8, i6, paint2);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = A03().getBounds();
        if (fontMetricsInt != null) {
            int height = bounds.height();
            Paint.FontMetricsInt fontMetricsInt2 = this.A00;
            int i4 = fontMetricsInt2.descent;
            int i5 = fontMetricsInt2.ascent;
            int max = Math.max(0, (height - i4) + i5);
            fontMetricsInt.ascent = i5 - max;
            fontMetricsInt.descent = i4 + max;
            fontMetricsInt.top = fontMetricsInt2.top - max;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + max;
        }
        if (A04(charSequence, i2)) {
            return bounds.right + this.A03;
        }
        return 0;
    }
}
