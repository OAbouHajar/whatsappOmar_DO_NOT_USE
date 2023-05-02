package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* renamed from: X.08U  reason: invalid class name */
public final class AnonymousClass08U {
    public final int A00;
    public final int A01;
    public final PrecomputedText.Params A02;
    public final TextDirectionHeuristic A03;
    public final TextPaint A04;

    public AnonymousClass08U(PrecomputedText.Params params) {
        this.A04 = params.getTextPaint();
        this.A03 = params.getTextDirection();
        this.A00 = params.getBreakStrategy();
        this.A01 = params.getHyphenationFrequency();
        this.A02 = Build.VERSION.SDK_INT < 29 ? null : params;
    }

    public AnonymousClass08U(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, int i2, int i3) {
        this.A02 = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build() : null;
        this.A04 = textPaint;
        this.A03 = textDirectionHeuristic;
        this.A00 = i2;
        this.A01 = i3;
    }

    public int A00() {
        return this.A00;
    }

    public int A01() {
        return this.A01;
    }

    public TextDirectionHeuristic A02() {
        return this.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bf A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x00bf
            boolean r0 = r8 instanceof X.AnonymousClass08U
            r5 = 0
            if (r0 == 0) goto L_0x0020
            X.08U r8 = (X.AnonymousClass08U) r8
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r2 < r0) goto L_0x0021
            int r1 = r7.A00
            int r0 = r8.A00()
            if (r1 != r0) goto L_0x0020
            int r1 = r7.A01
            int r0 = r8.A01()
            if (r1 == r0) goto L_0x0021
        L_0x0020:
            return r5
        L_0x0021:
            android.text.TextPaint r4 = r7.A04
            float r1 = r4.getTextSize()
            android.text.TextPaint r3 = r8.A04
            float r0 = r3.getTextSize()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            float r1 = r4.getTextScaleX()
            float r0 = r3.getTextScaleX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            float r1 = r4.getTextSkewX()
            float r0 = r3.getTextSkewX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            r0 = 21
            if (r2 < r0) goto L_0x0068
            float r1 = r4.getLetterSpacing()
            float r0 = r3.getLetterSpacing()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            java.lang.String r1 = r4.getFontFeatureSettings()
            java.lang.String r0 = r3.getFontFeatureSettings()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0068
            return r5
        L_0x0068:
            int r1 = r4.getFlags()
            int r0 = r3.getFlags()
            if (r1 != r0) goto L_0x0020
            r0 = 24
            if (r2 < r0) goto L_0x0085
            android.os.LocaleList r1 = r4.getTextLocales()
            android.os.LocaleList r0 = r3.getTextLocales()
            boolean r0 = r1.equals(r0)
        L_0x0082:
            if (r0 != 0) goto L_0x0096
            return r5
        L_0x0085:
            r0 = 17
            if (r2 < r0) goto L_0x0096
            java.util.Locale r1 = r4.getTextLocale()
            java.util.Locale r0 = r3.getTextLocale()
            boolean r0 = r1.equals(r0)
            goto L_0x0082
        L_0x0096:
            android.graphics.Typeface r0 = r4.getTypeface()
            if (r0 != 0) goto L_0x00a3
            android.graphics.Typeface r0 = r3.getTypeface()
            if (r0 == 0) goto L_0x00b2
            return r5
        L_0x00a3:
            android.graphics.Typeface r1 = r4.getTypeface()
            android.graphics.Typeface r0 = r3.getTypeface()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b2
            return r5
        L_0x00b2:
            r0 = 18
            if (r2 < r0) goto L_0x00bf
            android.text.TextDirectionHeuristic r1 = r7.A03
            android.text.TextDirectionHeuristic r0 = r8.A02()
            if (r1 == r0) goto L_0x00bf
            return r5
        L_0x00bf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08U.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr;
        boolean isElegantTextHeight;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            objArr = new Object[11];
            TextPaint textPaint = this.A04;
            objArr[0] = Float.valueOf(textPaint.getTextSize());
            objArr[1] = Float.valueOf(textPaint.getTextScaleX());
            objArr[2] = Float.valueOf(textPaint.getTextSkewX());
            objArr[3] = Float.valueOf(textPaint.getLetterSpacing());
            objArr[4] = Integer.valueOf(textPaint.getFlags());
            objArr[5] = textPaint.getTextLocales();
            objArr[6] = textPaint.getTypeface();
            isElegantTextHeight = textPaint.isElegantTextHeight();
        } else if (i2 >= 21) {
            objArr = new Object[11];
            TextPaint textPaint2 = this.A04;
            objArr[0] = Float.valueOf(textPaint2.getTextSize());
            objArr[1] = Float.valueOf(textPaint2.getTextScaleX());
            objArr[2] = Float.valueOf(textPaint2.getTextSkewX());
            objArr[3] = Float.valueOf(textPaint2.getLetterSpacing());
            objArr[4] = Integer.valueOf(textPaint2.getFlags());
            objArr[5] = textPaint2.getTextLocale();
            objArr[6] = textPaint2.getTypeface();
            isElegantTextHeight = textPaint2.isElegantTextHeight();
        } else {
            if (i2 >= 18 || i2 >= 17) {
                TextPaint textPaint3 = this.A04;
                objArr = new Object[]{Float.valueOf(textPaint3.getTextSize()), Float.valueOf(textPaint3.getTextScaleX()), Float.valueOf(textPaint3.getTextSkewX()), Integer.valueOf(textPaint3.getFlags()), textPaint3.getTextLocale(), textPaint3.getTypeface(), this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01)};
            } else {
                TextPaint textPaint4 = this.A04;
                objArr = new Object[]{Float.valueOf(textPaint4.getTextSize()), Float.valueOf(textPaint4.getTextScaleX()), Float.valueOf(textPaint4.getTextSkewX()), Integer.valueOf(textPaint4.getFlags()), textPaint4.getTypeface(), this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01)};
            }
            return AnonymousClass08I.A00(objArr);
        }
        objArr[7] = Boolean.valueOf(isElegantTextHeight);
        objArr[8] = this.A03;
        objArr[9] = Integer.valueOf(this.A00);
        objArr[10] = Integer.valueOf(this.A01);
        return AnonymousClass08I.A00(objArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.A04;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder(", textScaleX=");
        sb3.append(textPaint.getTextScaleX());
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder(", textSkewX=");
        sb4.append(textPaint.getTextSkewX());
        sb.append(sb4.toString());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            StringBuilder sb5 = new StringBuilder(", letterSpacing=");
            sb5.append(textPaint.getLetterSpacing());
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
            sb6.append(textPaint.isElegantTextHeight());
            sb.append(sb6.toString());
        }
        if (i2 >= 24) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(", textLocale=");
            sb7.append(textPaint.getTextLocales());
            sb.append(sb7.toString());
        } else if (i2 >= 17) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(", textLocale=");
            sb8.append(textPaint.getTextLocale());
            sb.append(sb8.toString());
        }
        StringBuilder sb9 = new StringBuilder(", typeface=");
        sb9.append(textPaint.getTypeface());
        sb.append(sb9.toString());
        if (i2 >= 26) {
            StringBuilder sb10 = new StringBuilder(", variationSettings=");
            sb10.append(textPaint.getFontVariationSettings());
            sb.append(sb10.toString());
        }
        StringBuilder sb11 = new StringBuilder(", textDir=");
        sb11.append(this.A03);
        sb.append(sb11.toString());
        StringBuilder sb12 = new StringBuilder(", breakStrategy=");
        sb12.append(this.A00);
        sb.append(sb12.toString());
        StringBuilder sb13 = new StringBuilder(", hyphenationFrequency=");
        sb13.append(this.A01);
        sb.append(sb13.toString());
        sb.append("}");
        return sb.toString();
    }
}
