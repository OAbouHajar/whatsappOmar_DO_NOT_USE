package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.redex.IDxPaintShape10S0100000_I1;
import java.util.Map;

/* renamed from: X.0Hb  reason: invalid class name and case insensitive filesystem */
public class C03060Hb extends C08360dV {
    public AnonymousClass0SI A00;
    public AnonymousClass0SI A01;
    public AnonymousClass0SI A02;
    public AnonymousClass0SI A03;
    public AnonymousClass0SI A04;
    public AnonymousClass0SI A05;
    public AnonymousClass0SI A06;
    public AnonymousClass0SI A07;
    public AnonymousClass0SI A08;
    public final Matrix A09 = AnonymousClass000.A0H();
    public final Paint A0A = new IDxPaintShape10S0100000_I1(this, 0);
    public final Paint A0B = new IDxPaintShape10S0100000_I1(this, 1);
    public final RectF A0C = AnonymousClass000.A0K();
    public final AnonymousClass03G A0D = new AnonymousClass03G();
    public final AnonymousClass0Rs A0E;
    public final AnonymousClass0Ak A0F;
    public final AnonymousClass0HG A0G;
    public final StringBuilder A0H = new StringBuilder(2);
    public final Map A0I = AnonymousClass000.A0x();

    public C03060Hb(AnonymousClass0Ak r4, C05320Qf r5) {
        super(r4, r5);
        this.A0F = r4;
        this.A0E = r5.A09;
        AnonymousClass0HG r0 = new AnonymousClass0HG(r5.A0B.A00);
        this.A0G = r0;
        AnonymousClass0SI.A04(r0, this);
        A09(r0);
        AnonymousClass0Oi r2 = r5.A0C;
        if (r2 != null) {
            AnonymousClass0HO r02 = r2.A00;
            if (r02 != null) {
                AnonymousClass0HK r03 = new AnonymousClass0HK(r02.A00);
                this.A00 = r03;
                AnonymousClass0SI.A04(r03, this);
                A09(this.A00);
            }
            AnonymousClass0HO r04 = r2.A01;
            if (r04 != null) {
                AnonymousClass0HK r05 = new AnonymousClass0HK(r04.A00);
                this.A02 = r05;
                AnonymousClass0SI.A04(r05, this);
                A09(this.A02);
            }
            AnonymousClass0HT r06 = r2.A02;
            if (r06 != null) {
                AnonymousClass0HM A002 = AnonymousClass0HC.A00(r06);
                this.A04 = A002;
                AnonymousClass0SI.A04(A002, this);
                A09(this.A04);
            }
            AnonymousClass0HT r07 = r2.A03;
            if (r07 != null) {
                AnonymousClass0HM A003 = AnonymousClass0HC.A00(r07);
                this.A07 = A003;
                AnonymousClass0SI.A04(A003, this);
                A09(this.A07);
            }
        }
    }

    public static C05200Pr A00(AnonymousClass0Rs r3, AnonymousClass0OR r4, String str, int i2) {
        return (C05200Pr) r3.A06.A01((((str.charAt(i2) * 31) + r4.A00.hashCode()) * 31) + r4.A02.hashCode());
    }

    public static final void A01(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawPath(path, paint);
        }
    }

    public static final void A02(Canvas canvas, Paint paint, String str) {
        Paint paint2 = paint;
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint2);
        }
    }

    public static final void A03(Canvas canvas, AnonymousClass0JN r4, float f2) {
        float f3;
        switch (r4.ordinal()) {
            case 1:
                f3 = -f2;
                break;
            case 2:
                f3 = (-f2) / 2.0f;
                break;
            default:
                return;
        }
        canvas.translate(f3, 0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0280, code lost:
        if (r5 == null) goto L_0x0282;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            r26 = this;
            r10 = r27
            r10.save()
            r9 = r26
            X.0Ak r8 = r9.A0F
            X.0Rs r0 = r8.A04
            X.07U r0 = r0.A06
            int r0 = r0.A00
            r25 = r28
            if (r0 > 0) goto L_0x0018
            r0 = r25
            r10.concat(r0)
        L_0x0018:
            X.0HG r0 = r9.A0G
            java.lang.Object r21 = r0.A08()
            r0 = r21
            X.0Q4 r0 = (X.AnonymousClass0Q4) r0
            r21 = r0
            X.0Rs r0 = r9.A0E
            r24 = r0
            java.util.Map r1 = r0.A09
            r0 = r21
            java.lang.String r0 = r0.A08
            java.lang.Object r20 = r1.get(r0)
            r0 = r20
            X.0OR r0 = (X.AnonymousClass0OR) r0
            r20 = r0
            if (r0 == 0) goto L_0x0282
            X.0SI r1 = r9.A01
            if (r1 != 0) goto L_0x0203
            X.0SI r1 = r9.A00
            if (r1 != 0) goto L_0x0203
            android.graphics.Paint r0 = r9.A0A
            r23 = r0
            r0 = r21
            int r1 = r0.A04
        L_0x004a:
            r0 = r23
            r0.setColor(r1)
            X.0SI r1 = r9.A03
            if (r1 != 0) goto L_0x01f5
            X.0SI r1 = r9.A02
            if (r1 != 0) goto L_0x01f5
            android.graphics.Paint r0 = r9.A0B
            r22 = r0
            r0 = r21
            int r1 = r0.A05
        L_0x005f:
            r0 = r22
            r0.setColor(r1)
            X.0S6 r0 = r9.A0L
            X.0SI r0 = r0.A02
            r2 = 100
            if (r0 != 0) goto L_0x01eb
            r0 = 100
        L_0x006e:
            int r1 = r0 * 255
            int r1 = r1 / r2
            r0 = r23
            r0.setAlpha(r1)
            r0 = r22
            r0.setAlpha(r1)
            X.0SI r0 = r9.A05
            if (r0 != 0) goto L_0x01e5
            X.0SI r0 = r9.A04
            if (r0 != 0) goto L_0x01e5
            float r2 = X.AnonymousClass0XD.A02(r25)
            r0 = r21
            float r1 = r0.A03
            float r0 = X.AnonymousClass0XD.A00()
            float r1 = r1 * r0
            float r1 = r1 * r2
        L_0x0091:
            r0 = r22
            r0.setStrokeWidth(r1)
            X.0Rs r0 = r8.A04
            X.07U r0 = r0.A06
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0211
            X.0SI r0 = r9.A06
            if (r0 == 0) goto L_0x01df
            float r7 = X.AnonymousClass0SI.A02(r0)
        L_0x00a6:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r0
            float r12 = X.AnonymousClass0XD.A02(r25)
            r0 = r21
            java.lang.String r1 = r0.A09
            float r0 = r0.A01
            r19 = r0
            float r0 = X.AnonymousClass0XD.A00()
            float r19 = r19 * r0
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r18 = java.util.Arrays.asList(r0)
            int r17 = r18.size()
            r6 = 0
        L_0x00d6:
            r0 = r17
            if (r6 >= r0) goto L_0x0282
            r0 = r18
            java.lang.String r16 = X.AnonymousClass000.A0n(r0, r6)
            r3 = 0
            r11 = 0
        L_0x00e2:
            int r0 = r16.length()
            if (r11 >= r0) goto L_0x0106
            r2 = r24
            r1 = r20
            r0 = r16
            X.0Pr r0 = A00(r2, r1, r0, r11)
            if (r0 == 0) goto L_0x0103
            double r4 = (double) r3
            double r2 = r0.A01
            double r0 = (double) r7
            double r2 = r2 * r0
            float r0 = X.AnonymousClass0XD.A00()
            double r0 = (double) r0
            double r2 = r2 * r0
            double r0 = (double) r12
            double r2 = r2 * r0
            double r4 = r4 + r2
            float r3 = (float) r4
        L_0x0103:
            int r11 = r11 + 1
            goto L_0x00e2
        L_0x0106:
            r10.save()
            r0 = r21
            X.0JN r0 = r0.A07
            A03(r10, r0, r3)
            int r0 = r17 + -1
            float r1 = (float) r0
            float r1 = r1 * r19
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = (float) r6
            float r0 = r0 * r19
            float r0 = r0 - r1
            r4 = 0
            r10.translate(r4, r0)
            r3 = 0
        L_0x0121:
            int r0 = r16.length()
            if (r3 >= r0) goto L_0x01d8
            r2 = r24
            r1 = r20
            r0 = r16
            X.0Pr r13 = A00(r2, r1, r0, r3)
            if (r13 == 0) goto L_0x01d4
            java.util.Map r15 = r9.A0I
            boolean r0 = r15.containsKey(r13)
            if (r0 == 0) goto L_0x018d
            java.lang.Object r11 = r15.get(r13)
            java.util.List r11 = (java.util.List) r11
        L_0x0141:
            r5 = 0
            r2 = 0
        L_0x0143:
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x01b0
            java.lang.Object r0 = r11.get(r2)
            X.0dQ r0 = (X.C08310dQ) r0
            android.graphics.Path r1 = r0.AEK()
            android.graphics.RectF r0 = r9.A0C
            r1.computeBounds(r0, r5)
            android.graphics.Matrix r14 = r9.A09
            r0 = r25
            r14.set(r0)
            r0 = r21
            float r0 = r0.A00
            float r15 = -r0
            float r0 = X.AnonymousClass0XD.A00()
            float r15 = r15 * r0
            r14.preTranslate(r4, r15)
            r14.preScale(r7, r7)
            r1.transform(r14)
            r0 = r21
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0185
            r0 = r23
            A01(r10, r0, r1)
            r0 = r22
        L_0x017f:
            A01(r10, r0, r1)
            int r2 = r2 + 1
            goto L_0x0143
        L_0x0185:
            r0 = r22
            A01(r10, r0, r1)
            r0 = r23
            goto L_0x017f
        L_0x018d:
            java.util.List r14 = r13.A04
            int r5 = r14.size()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
            r2 = 0
        L_0x0199:
            if (r2 >= r5) goto L_0x01ac
            java.lang.Object r1 = r14.get(r2)
            X.0dk r1 = (X.C08500dk) r1
            X.0dQ r0 = new X.0dQ
            r0.<init>(r8, r1, r9)
            r11.add(r0)
            int r2 = r2 + 1
            goto L_0x0199
        L_0x01ac:
            r15.put(r13, r11)
            goto L_0x0141
        L_0x01b0:
            double r0 = r13.A01
            float r2 = (float) r0
            float r2 = r2 * r7
            float r0 = X.AnonymousClass0XD.A00()
            float r2 = r2 * r0
            float r2 = r2 * r12
            r0 = r21
            int r0 = r0.A06
            float r1 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r0
            X.0SI r0 = r9.A08
            if (r0 != 0) goto L_0x01ca
            X.0SI r0 = r9.A07
            if (r0 == 0) goto L_0x01cf
        L_0x01ca:
            float r0 = X.AnonymousClass0SI.A02(r0)
            float r1 = r1 + r0
        L_0x01cf:
            float r1 = r1 * r12
            float r2 = r2 + r1
            r10.translate(r2, r4)
        L_0x01d4:
            int r3 = r3 + 1
            goto L_0x0121
        L_0x01d8:
            r10.restore()
            int r6 = r6 + 1
            goto L_0x00d6
        L_0x01df:
            r0 = r21
            float r7 = r0.A02
            goto L_0x00a6
        L_0x01e5:
            float r1 = X.AnonymousClass0SI.A02(r0)
            goto L_0x0091
        L_0x01eb:
            java.lang.Object r0 = r0.A08()
            int r0 = X.AnonymousClass000.A0D(r0)
            goto L_0x006e
        L_0x01f5:
            android.graphics.Paint r0 = r9.A0B
            r22 = r0
            java.lang.Object r0 = r1.A08()
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x005f
        L_0x0203:
            android.graphics.Paint r0 = r9.A0A
            r23 = r0
            java.lang.Object r0 = r1.A08()
            int r1 = X.AnonymousClass000.A0D(r0)
            goto L_0x004a
        L_0x0211:
            X.AnonymousClass0XD.A02(r25)
            r0 = r20
            java.lang.String r7 = r0.A00
            java.lang.String r6 = r0.A02
            android.graphics.drawable.Drawable$Callback r0 = r8.getCallback()
            if (r0 == 0) goto L_0x0282
            X.0Ow r11 = r8.A06
            if (r11 != 0) goto L_0x022f
            android.graphics.drawable.Drawable$Callback r1 = r8.getCallback()
            X.0Ow r11 = new X.0Ow
            r11.<init>(r1)
            r8.A06 = r11
        L_0x022f:
            X.0R7 r4 = r11.A02
            r4.A00 = r7
            r4.A01 = r6
            java.util.Map r3 = r11.A04
            java.lang.Object r5 = r3.get(r4)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 != 0) goto L_0x028b
            java.util.Map r2 = r11.A03
            java.lang.Object r5 = r2.get(r7)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 != 0) goto L_0x0261
            java.lang.String r0 = "fonts/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = ".ttf"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            android.content.res.AssetManager r0 = r11.A01
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromAsset(r0, r1)
            r2.put(r7, r5)
        L_0x0261:
            java.lang.String r0 = "Italic"
            boolean r1 = r6.contains(r0)
            java.lang.String r0 = "Bold"
            boolean r0 = r6.contains(r0)
            if (r1 == 0) goto L_0x0286
            r1 = 2
            if (r0 == 0) goto L_0x0273
            r1 = 3
        L_0x0273:
            int r0 = r5.getStyle()
            if (r0 == r1) goto L_0x027d
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r1)
        L_0x027d:
            r3.put(r4, r5)
            if (r5 != 0) goto L_0x028b
        L_0x0282:
            r10.restore()
            return
        L_0x0286:
            boolean r1 = X.AnonymousClass000.A1O(r0)
            goto L_0x0273
        L_0x028b:
            r0 = r21
            java.lang.String r1 = r0.A09
            r0 = r23
            X.0SI r0 = r9.A06
            if (r0 == 0) goto L_0x03cf
            float r2 = X.AnonymousClass0SI.A02(r0)
        L_0x0299:
            float r3 = X.AnonymousClass0XD.A00()
            float r3 = r3 * r2
            r0 = r23
            r0.setTextSize(r3)
            android.graphics.Typeface r3 = r23.getTypeface()
            r0 = r22
            float r3 = r23.getTextSize()
            r0.setTextSize(r3)
            r0 = r21
            float r6 = r0.A01
            float r0 = X.AnonymousClass0XD.A00()
            float r6 = r6 * r0
            r0 = r21
            int r0 = r0.A06
            float r7 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 / r0
            X.0SI r0 = r9.A08
            if (r0 != 0) goto L_0x02c9
            X.0SI r0 = r9.A07
            if (r0 == 0) goto L_0x02ce
        L_0x02c9:
            float r0 = X.AnonymousClass0SI.A02(r0)
            float r7 = r7 + r0
        L_0x02ce:
            float r0 = X.AnonymousClass0XD.A00()
            float r7 = r7 * r0
            float r7 = r7 * r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r0
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r5 = java.util.Arrays.asList(r0)
            int r4 = r5.size()
            r3 = 0
        L_0x02f2:
            if (r3 >= r4) goto L_0x0282
            java.lang.String r2 = X.AnonymousClass000.A0n(r5, r3)
            r0 = r22
            float r1 = r0.measureText(r2)
            int r0 = r2.length()
            int r0 = r0 + -1
            float r0 = (float) r0
            float r0 = r0 * r7
            float r1 = r1 + r0
            r10.save()
            r0 = r21
            X.0JN r0 = r0.A07
            A03(r10, r0, r1)
            int r0 = r4 + -1
            float r8 = (float) r0
            float r8 = r8 * r6
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r0
            float r1 = (float) r3
            float r1 = r1 * r6
            float r1 = r1 - r8
            r0 = 0
            r10.translate(r0, r1)
            r11 = 0
        L_0x0320:
            int r12 = r2.length()
            if (r11 >= r12) goto L_0x03c8
            r15 = r11
            int r0 = r2.codePointAt(r11)
            int r14 = java.lang.Character.charCount(r0)
            int r14 = r14 + r11
        L_0x0330:
            if (r14 >= r12) goto L_0x0366
            int r13 = r2.codePointAt(r14)
            int r8 = java.lang.Character.getType(r13)
            r1 = 16
            if (r8 == r1) goto L_0x035d
            int r8 = java.lang.Character.getType(r13)
            r1 = 27
            if (r8 == r1) goto L_0x035d
            int r8 = java.lang.Character.getType(r13)
            r1 = 6
            if (r8 == r1) goto L_0x035d
            int r8 = java.lang.Character.getType(r13)
            r1 = 28
            if (r8 == r1) goto L_0x035d
            int r8 = java.lang.Character.getType(r13)
            r1 = 19
            if (r8 != r1) goto L_0x0366
        L_0x035d:
            int r1 = java.lang.Character.charCount(r13)
            int r14 = r14 + r1
            int r0 = r0 * 31
            int r0 = r0 + r13
            goto L_0x0330
        L_0x0366:
            X.03G r13 = r9.A0D
            long r0 = (long) r0
            boolean r8 = r13.A01
            if (r8 == 0) goto L_0x0370
            r13.A06()
        L_0x0370:
            long[] r12 = r13.A02
            int r8 = r13.A00
            int r8 = X.AnonymousClass00R.A01(r12, r8, r0)
            if (r8 < 0) goto L_0x03ab
            r8 = 0
            java.lang.Object r8 = r13.A04(r0, r8)
            java.lang.String r8 = (java.lang.String) r8
        L_0x0381:
            int r0 = r8.length()
            int r11 = r11 + r0
            r0 = r21
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x03a3
            r0 = r23
            A02(r10, r0, r8)
            r0 = r22
        L_0x0393:
            A02(r10, r0, r8)
            r0 = r23
            float r1 = r0.measureText(r8)
            float r1 = r1 + r7
            r0 = 0
            r10.translate(r1, r0)
            goto L_0x0320
        L_0x03a3:
            r0 = r22
            A02(r10, r0, r8)
            r0 = r23
            goto L_0x0393
        L_0x03ab:
            java.lang.StringBuilder r12 = r9.A0H
            r8 = 0
            r12.setLength(r8)
        L_0x03b1:
            if (r15 >= r14) goto L_0x03c0
            int r8 = r2.codePointAt(r15)
            r12.appendCodePoint(r8)
            int r8 = java.lang.Character.charCount(r8)
            int r15 = r15 + r8
            goto L_0x03b1
        L_0x03c0:
            java.lang.String r8 = r12.toString()
            r13.A09(r0, r8)
            goto L_0x0381
        L_0x03c8:
            r10.restore()
            int r3 = r3 + 1
            goto L_0x02f2
        L_0x03cf:
            r0 = r21
            float r2 = r0.A02
            goto L_0x0299
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03060Hb.A08(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public void A4l(AnonymousClass0UV r4, Object obj) {
        AnonymousClass0SI r0;
        super.A4l(r4, obj);
        if (obj == C13480m6.A0R) {
            AnonymousClass0SI r1 = this.A01;
            if (r1 != null) {
                this.A0O.remove(r1);
            }
            if (r4 == null) {
                this.A01 = null;
                return;
            }
            AnonymousClass0HF r02 = new AnonymousClass0HF(r4, (Object) null);
            this.A01 = r02;
            AnonymousClass0SI.A04(r02, this);
            r0 = this.A01;
        } else if (obj == C13480m6.A0T) {
            AnonymousClass0SI r12 = this.A03;
            if (r12 != null) {
                this.A0O.remove(r12);
            }
            if (r4 == null) {
                this.A03 = null;
                return;
            }
            AnonymousClass0HF r03 = new AnonymousClass0HF(r4, (Object) null);
            this.A03 = r03;
            AnonymousClass0SI.A04(r03, this);
            r0 = this.A03;
        } else if (obj == C13480m6.A0G) {
            AnonymousClass0SI r13 = this.A05;
            if (r13 != null) {
                this.A0O.remove(r13);
            }
            if (r4 == null) {
                this.A05 = null;
                return;
            }
            AnonymousClass0HF r04 = new AnonymousClass0HF(r4, (Object) null);
            this.A05 = r04;
            AnonymousClass0SI.A04(r04, this);
            r0 = this.A05;
        } else if (obj == C13480m6.A0I) {
            AnonymousClass0SI r14 = this.A08;
            if (r14 != null) {
                this.A0O.remove(r14);
            }
            if (r4 == null) {
                this.A08 = null;
                return;
            }
            AnonymousClass0HF r05 = new AnonymousClass0HF(r4, (Object) null);
            this.A08 = r05;
            AnonymousClass0SI.A04(r05, this);
            r0 = this.A08;
        } else if (obj == C13480m6.A0H) {
            AnonymousClass0SI r15 = this.A06;
            if (r15 != null) {
                this.A0O.remove(r15);
            }
            if (r4 == null) {
                this.A06 = null;
                return;
            }
            AnonymousClass0HF r06 = new AnonymousClass0HF(r4, (Object) null);
            this.A06 = r06;
            AnonymousClass0SI.A04(r06, this);
            r0 = this.A06;
        } else {
            return;
        }
        A09(r0);
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        super.AAB(matrix, rectF, z2);
        AnonymousClass0Rs r1 = this.A0E;
        rectF.set(0.0f, 0.0f, (float) r1.A04.width(), (float) r1.A04.height());
    }
}
