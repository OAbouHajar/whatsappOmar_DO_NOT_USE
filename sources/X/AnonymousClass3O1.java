package X;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3O1  reason: invalid class name */
public final class AnonymousClass3O1 extends FrameLayout implements C108345Np {
    public float A00 = 0.08f;
    public float A01 = 0.0533f;
    public C90464eB A02 = C90464eB.A06;
    public List A03 = Collections.emptyList();
    public final WebView A04;
    public final C64133Mw A05;

    public AnonymousClass3O1(Context context) {
        super(context, (AttributeSet) null);
        C64133Mw r1 = new C64133Mw(context, (AttributeSet) null);
        this.A05 = r1;
        C64223Nh r0 = new C64223Nh(context, this);
        this.A04 = r0;
        r0.setBackgroundColor(0);
        addView(r1);
        addView(r0);
    }

    public static String A00(int i2) {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1K(objArr, Color.red(i2));
        AnonymousClass000.A1L(objArr, Color.green(i2));
        AnonymousClass3K2.A1W(objArr, Color.blue(i2));
        objArr[3] = Double.valueOf(((double) Color.alpha(i2)) / 255.0d);
        return AnonymousClass3K4.A0b("rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static String A01(CharSequence charSequence) {
        return C814848m.A00.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(float r5, int r6) {
        /*
            r4 = this;
            int r3 = r4.getHeight()
            int r1 = r4.getHeight()
            int r0 = r4.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r4.getPaddingBottom()
            int r1 = r1 - r0
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            float r1 = (float) r1
            if (r6 == 0) goto L_0x0026
            r0 = 1
            float r1 = (float) r3
            if (r6 == r0) goto L_0x0026
            r0 = 2
            if (r6 == r0) goto L_0x0027
        L_0x0023:
            java.lang.String r0 = "unset"
            return r0
        L_0x0026:
            float r5 = r5 * r1
        L_0x0027:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            android.content.res.Resources r0 = X.C13680ns.A0D(r4)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 / r0
            java.lang.Object[] r2 = X.C13680ns.A1b()
            r1 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r2[r1] = r0
            java.lang.String r0 = "%.2fpx"
            java.lang.String r0 = X.AnonymousClass3K4.A0b(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3O1.A02(float, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02fb, code lost:
        if (((android.text.style.TypefaceSpan) r12).getFamily() != null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051b, code lost:
        if (r10 != false) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x051d, code lost:
        r8 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0520, code lost:
        if (r10 != false) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0522, code lost:
        r29 = r28;
        r1 = 2;
        r28 = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r39 = this;
            java.lang.StringBuilder r19 = X.AnonymousClass000.A0o()
            r7 = 4
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r4 = r39
            X.4eB r0 = r4.A02
            int r0 = r0.A03
            java.lang.String r0 = A00(r0)
            r6 = 0
            r3[r6] = r0
            float r0 = r4.A01
            java.lang.String r0 = r4.A02(r0, r6)
            r1 = 1
            r3[r1] = r0
            r13 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r2 = java.lang.Float.valueOf(r13)
            r0 = 2
            r3[r0] = r2
            X.4eB r5 = r4.A02
            int r2 = r5.A02
            if (r2 == r1) goto L_0x059f
            if (r2 == r0) goto L_0x0592
            r0 = 3
            if (r2 == r0) goto L_0x05ac
            if (r2 == r7) goto L_0x0585
            java.lang.String r2 = "unset"
        L_0x0036:
            r0 = 3
            r3[r0] = r2
            java.lang.String r0 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>"
            java.lang.String r2 = X.AnonymousClass3K4.A0b(r0, r3)
            r0 = r19
            r0.append(r2)
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.lang.String r21 = "default_bg"
            java.lang.String r20 = "."
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r20)
            r0 = r21
            r2.append(r0)
            java.lang.String r22 = ",."
            r0 = r22
            r2.append(r0)
            r0 = r21
            r2.append(r0)
            java.lang.String r23 = " *"
            r0 = r23
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.4eB r0 = r4.A02
            int r0 = r0.A00
            java.lang.String r0 = A00(r0)
            r3[r6] = r0
            java.lang.String r24 = "background-color:%s;"
            r0 = r24
            java.lang.String r0 = X.AnonymousClass3K4.A0b(r0, r3)
            r5.put(r2, r0)
            r3 = 0
        L_0x0081:
            java.util.List r0 = r4.A03
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x05be
            java.util.List r0 = r4.A03
            java.lang.Object r34 = r0.get(r3)
            r0 = r34
            X.4aV r0 = (X.C88444aV) r0
            r34 = r0
            float r0 = r0.A02
            r35 = r0
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0581
            float r35 = r35 * r12
        L_0x00a4:
            r0 = r34
            int r2 = r0.A08
            if (r2 == r1) goto L_0x057d
            r0 = 2
            r11 = -100
            if (r2 == r0) goto L_0x00b0
            r11 = 0
        L_0x00b0:
            r0 = r34
            float r9 = r0.A01
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r8 = "%.2f%%"
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0569
            r0 = r34
            int r0 = r0.A07
            if (r0 == r1) goto L_0x0543
            java.lang.Object[] r0 = new java.lang.Object[r1]
            float r9 = r9 * r12
            java.lang.Float r2 = java.lang.Float.valueOf(r9)
            r0[r6] = r2
            java.lang.String r7 = X.AnonymousClass3K4.A0b(r8, r0)
            r0 = r34
            int r2 = r0.A0A
            int r9 = r0.A06
            if (r9 == r1) goto L_0x053f
            r0 = 2
            r6 = -100
            if (r9 == r0) goto L_0x00dd
            r6 = 0
        L_0x00dd:
            if (r2 != r1) goto L_0x00e0
            int r6 = -r6
        L_0x00e0:
            r10 = 0
        L_0x00e1:
            r0 = r34
            float r2 = r0.A04
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x053b
            java.lang.Object[] r9 = new java.lang.Object[r1]
            float r2 = r2 * r12
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0 = 0
            r9[r0] = r2
            java.lang.String r33 = X.AnonymousClass3K4.A0b(r8, r9)
        L_0x00fa:
            r0 = r34
            android.text.Layout$Alignment r0 = r0.A0D
            java.lang.String r32 = "center"
            if (r0 == 0) goto L_0x0111
            int[] r2 = X.C814948n.A00
            int r0 = r0.ordinal()
            r2 = r2[r0]
            if (r2 == r1) goto L_0x0537
            r0 = 2
            if (r2 != r0) goto L_0x0111
            java.lang.String r32 = "end"
        L_0x0111:
            r0 = r34
            int r0 = r0.A0A
            r38 = r0
            if (r0 == r1) goto L_0x0533
            r1 = 2
            if (r0 == r1) goto L_0x052f
            java.lang.String r2 = "horizontal-tb"
        L_0x011e:
            r0 = r34
            int r1 = r0.A09
            float r0 = r0.A05
            java.lang.String r31 = r4.A02(r0, r1)
            r0 = r34
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x0529
            r0 = r34
            int r0 = r0.A0B
        L_0x0132:
            java.lang.String r30 = A00(r0)
            java.lang.String r8 = "right"
            java.lang.String r29 = "left"
            java.lang.String r28 = "top"
            r1 = 1
            r0 = r38
            if (r0 == r1) goto L_0x051b
            r1 = 2
            if (r0 == r1) goto L_0x0520
            if (r10 == 0) goto L_0x0148
            java.lang.String r28 = "bottom"
        L_0x0148:
            if (r0 == r1) goto L_0x0514
            r1 = 1
            if (r0 == r1) goto L_0x0514
            java.lang.String r27 = "width"
            r37 = r11
        L_0x0151:
            r0 = r34
            java.lang.CharSequence r0 = r0.A0E
            r26 = r0
            android.content.res.Resources r0 = X.C13680ns.A0D(r4)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r25 = r0
            if (r26 != 0) goto L_0x022b
            X.0vs r8 = X.C17930vs.of()
            java.lang.String r0 = ""
            X.4GM r1 = new X.4GM
            r1.<init>(r0, r8)
        L_0x0170:
            java.util.Iterator r10 = X.AnonymousClass3K4.A0e(r5)
        L_0x0174:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x019a
            java.lang.Object r9 = r10.next()
            java.lang.Object r0 = r5.get(r9)
            java.lang.Object r8 = r5.put(r9, r0)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0195
            java.lang.Object r0 = r5.get(r9)
            boolean r8 = r8.equals(r0)
            r0 = 0
            if (r8 == 0) goto L_0x0196
        L_0x0195:
            r0 = 1
        L_0x0196:
            X.C90524eJ.A04(r0)
            goto L_0x0174
        L_0x019a:
            r0 = 13
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r0 = 0
            r9[r0] = r29
            java.lang.Float r8 = java.lang.Float.valueOf(r35)
            r0 = 1
            r9[r0] = r8
            r8 = 2
            r0 = r28
            X.AnonymousClass3K4.A11(r0, r7, r9)
            r10 = r27
            r7 = r33
            r0 = r32
            X.AnonymousClass000.A18(r10, r7, r0, r2, r9)
            r2 = r31
            r0 = r30
            X.AnonymousClass3K3.A1K(r2, r0, r9)
            r2 = 10
            r0 = r37
            X.AnonymousClass000.A1M(r9, r0, r2)
            r0 = 11
            X.AnonymousClass000.A1M(r9, r6, r0)
            r11 = 12
            r0 = r34
            float r10 = r0.A03
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0228
            r7 = 1
            r0 = r38
            if (r0 == r8) goto L_0x0225
            if (r0 == r7) goto L_0x0225
            java.lang.String r6 = "skewX"
        L_0x01de:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r0 = 0
            r2[r0] = r6
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r2[r7] = r0
            java.lang.String r0 = "%s(%.2fdeg)"
            java.lang.String r0 = X.AnonymousClass3K4.A0b(r0, r2)
        L_0x01ef:
            r9[r11] = r0
            java.lang.String r0 = "<div style='position:absolute;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r6, r0, r9)
            r0 = r19
            r0.append(r2)
            java.lang.Object[] r2 = X.AnonymousClass000.A1a(r21)
            java.lang.String r0 = "<span class='%s'>"
            java.lang.String r2 = java.lang.String.format(r6, r0, r2)
            r0 = r19
            r0.append(r2)
            java.lang.String r1 = r1.A00
            r0.append(r1)
            java.lang.String r1 = "</span>"
            r0.append(r1)
            java.lang.String r1 = "</div>"
            r0.append(r1)
            int r3 = r3 + 1
            r13 = 1067030938(0x3f99999a, float:1.2)
            r6 = 0
            r1 = 1
            goto L_0x0081
        L_0x0225:
            java.lang.String r6 = "skewY"
            goto L_0x01de
        L_0x0228:
            java.lang.String r0 = ""
            goto L_0x01ef
        L_0x022b:
            r0 = r26
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x0240
            java.lang.String r8 = A01(r26)
            X.0vs r0 = X.C17930vs.of()
            X.4GM r1 = new X.4GM
            r1.<init>(r8, r0)
            goto L_0x0170
        L_0x0240:
            r0 = r26
            android.text.Spanned r0 = (android.text.Spanned) r0
            r26 = r0
            java.util.HashSet r11 = X.C13680ns.A0o()
            int r8 = r26.length()
            java.lang.Class<android.text.style.BackgroundColorSpan> r1 = android.text.style.BackgroundColorSpan.class
            r9 = 0
            java.lang.Object[] r10 = r0.getSpans(r9, r8, r1)
            android.text.style.BackgroundColorSpan[] r10 = (android.text.style.BackgroundColorSpan[]) r10
            int r8 = r10.length
            r1 = 0
        L_0x0259:
            if (r1 >= r8) goto L_0x0267
            r0 = r10[r1]
            int r0 = r0.getBackgroundColor()
            X.C13690nt.A1O(r11, r0)
            int r1 = r1 + 1
            goto L_0x0259
        L_0x0267:
            java.util.HashMap r18 = X.AnonymousClass000.A0x()
            java.util.Iterator r11 = r11.iterator()
        L_0x026f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r0 = r11.next()
            int r10 = X.AnonymousClass000.A0D(r0)
            java.lang.String r0 = "bg_"
            java.lang.String r8 = X.C13680ns.A0c(r10, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r20)
            r1.append(r8)
            r0 = r22
            r1.append(r0)
            r1.append(r8)
            r0 = r23
            java.lang.String r8 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.Object[] r1 = X.C13680ns.A1b()
            java.lang.String r0 = A00(r10)
            r1[r9] = r0
            r0 = r24
            java.lang.String r1 = X.AnonymousClass3K4.A0b(r0, r1)
            r0 = r18
            r0.put(r8, r1)
            goto L_0x026f
        L_0x02ae:
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            int r11 = r26.length()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r10 = 0
            r0 = r26
            java.lang.Object[] r17 = r0.getSpans(r9, r11, r1)
            r0 = r17
            int r0 = r0.length
            r36 = r0
        L_0x02c5:
            r0 = r36
            if (r10 >= r0) goto L_0x0495
            r12 = r17[r10]
            boolean r0 = r12 instanceof android.text.style.StrikethroughSpan
            if (r0 == 0) goto L_0x037e
            java.lang.String r1 = "<span style='text-decoration:line-through;'>"
        L_0x02d1:
            boolean r0 = r12 instanceof android.text.style.StrikethroughSpan
            java.lang.String r11 = "</span>"
            if (r0 != 0) goto L_0x02fd
            boolean r0 = r12 instanceof android.text.style.ForegroundColorSpan
            if (r0 != 0) goto L_0x02fd
            boolean r0 = r12 instanceof android.text.style.BackgroundColorSpan
            if (r0 != 0) goto L_0x02fd
            boolean r0 = r12 instanceof X.AnonymousClass454
            if (r0 != 0) goto L_0x02fd
            boolean r0 = r12 instanceof android.text.style.AbsoluteSizeSpan
            if (r0 != 0) goto L_0x02fd
            boolean r0 = r12 instanceof android.text.style.RelativeSizeSpan
            if (r0 != 0) goto L_0x02fd
            boolean r0 = r12 instanceof X.C84064Jc
            if (r0 != 0) goto L_0x02fd
            boolean r0 = r12 instanceof android.text.style.TypefaceSpan
            r13 = 0
            if (r0 == 0) goto L_0x033b
            r0 = r12
            android.text.style.TypefaceSpan r0 = (android.text.style.TypefaceSpan) r0
            java.lang.String r0 = r0.getFamily()
            if (r0 == 0) goto L_0x037c
        L_0x02fd:
            r0 = r26
            int r14 = r0.getSpanStart(r12)
            int r13 = r0.getSpanEnd(r12)
            if (r1 == 0) goto L_0x0338
            X.1k1 r12 = new X.1k1
            r12.<init>(r1, r11, r14, r13)
            java.lang.Object r0 = r8.get(r14)
            X.4GN r0 = (X.AnonymousClass4GN) r0
            if (r0 != 0) goto L_0x031e
            X.4GN r0 = new X.4GN
            r0.<init>()
            r8.put(r14, r0)
        L_0x031e:
            java.util.List r0 = r0.A00
            r0.add(r12)
            java.lang.Object r0 = r8.get(r13)
            X.4GN r0 = (X.AnonymousClass4GN) r0
            if (r0 != 0) goto L_0x0333
            X.4GN r0 = new X.4GN
            r0.<init>()
            r8.put(r13, r0)
        L_0x0333:
            java.util.List r0 = r0.A01
            r0.add(r12)
        L_0x0338:
            int r10 = r10 + 1
            goto L_0x02c5
        L_0x033b:
            boolean r0 = r12 instanceof android.text.style.StyleSpan
            if (r0 == 0) goto L_0x0358
            r0 = r12
            android.text.style.StyleSpan r0 = (android.text.style.StyleSpan) r0
            int r11 = r0.getStyle()
            r0 = 1
            if (r11 == r0) goto L_0x0355
            r0 = 2
            if (r11 == r0) goto L_0x0352
            r0 = 3
            if (r11 != r0) goto L_0x037c
            java.lang.String r11 = "</i></b>"
            goto L_0x02fd
        L_0x0352:
            java.lang.String r11 = "</i>"
            goto L_0x02fd
        L_0x0355:
            java.lang.String r11 = "</b>"
            goto L_0x02fd
        L_0x0358:
            boolean r0 = r12 instanceof X.AnonymousClass4GJ
            if (r0 == 0) goto L_0x0375
            r13 = r12
            X.4GJ r13 = (X.AnonymousClass4GJ) r13
            java.lang.String r0 = "<rt>"
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r13.A01
            java.lang.String r0 = A01(r0)
            r11.append(r0)
            java.lang.String r0 = "</rt></ruby>"
            java.lang.String r11 = X.AnonymousClass000.A0h(r0, r11)
            goto L_0x02fd
        L_0x0375:
            boolean r0 = r12 instanceof android.text.style.UnderlineSpan
            if (r0 == 0) goto L_0x037c
            java.lang.String r11 = "</u>"
            goto L_0x02fd
        L_0x037c:
            r11 = r13
            goto L_0x02fd
        L_0x037e:
            boolean r0 = r12 instanceof android.text.style.ForegroundColorSpan
            r14 = 1
            if (r0 == 0) goto L_0x039a
            r0 = r12
            android.text.style.ForegroundColorSpan r0 = (android.text.style.ForegroundColorSpan) r0
            java.lang.Object[] r11 = new java.lang.Object[r14]
            int r0 = r0.getForegroundColor()
            java.lang.String r0 = A00(r0)
            r11[r9] = r0
            java.lang.String r0 = "<span style='color:%s;'>"
        L_0x0394:
            java.lang.String r1 = X.AnonymousClass3K4.A0b(r0, r11)
            goto L_0x02d1
        L_0x039a:
            boolean r0 = r12 instanceof android.text.style.BackgroundColorSpan
            if (r0 == 0) goto L_0x03ad
            r0 = r12
            android.text.style.BackgroundColorSpan r0 = (android.text.style.BackgroundColorSpan) r0
            java.lang.Object[] r11 = new java.lang.Object[r14]
            int r0 = r0.getBackgroundColor()
            X.AnonymousClass000.A1M(r11, r0, r9)
            java.lang.String r0 = "<span class='bg_%s'>"
            goto L_0x0394
        L_0x03ad:
            boolean r0 = r12 instanceof X.AnonymousClass454
            if (r0 == 0) goto L_0x03b5
            java.lang.String r1 = "<span style='text-combine-upright:all;'>"
            goto L_0x02d1
        L_0x03b5:
            boolean r0 = r12 instanceof android.text.style.AbsoluteSizeSpan
            if (r0 == 0) goto L_0x03d4
            r0 = r12
            android.text.style.AbsoluteSizeSpan r0 = (android.text.style.AbsoluteSizeSpan) r0
            boolean r1 = r0.getDip()
            int r0 = r0.getSize()
            float r0 = (float) r0
            if (r1 != 0) goto L_0x03c9
            float r0 = r0 / r25
        L_0x03c9:
            java.lang.Object[] r11 = new java.lang.Object[r14]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r11[r9] = r0
            java.lang.String r0 = "<span style='font-size:%.2fpx;'>"
            goto L_0x0394
        L_0x03d4:
            boolean r0 = r12 instanceof android.text.style.RelativeSizeSpan
            if (r0 == 0) goto L_0x03ed
            java.lang.Object[] r11 = new java.lang.Object[r14]
            r0 = r12
            android.text.style.RelativeSizeSpan r0 = (android.text.style.RelativeSizeSpan) r0
            float r1 = r0.getSizeChange()
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r11[r9] = r0
            java.lang.String r0 = "<span style='font-size:%.2f%%;'>"
            goto L_0x0394
        L_0x03ed:
            boolean r0 = r12 instanceof android.text.style.TypefaceSpan
            r1 = 0
            if (r0 == 0) goto L_0x0407
            r0 = r12
            android.text.style.TypefaceSpan r0 = (android.text.style.TypefaceSpan) r0
            java.lang.String r0 = r0.getFamily()
            if (r0 == 0) goto L_0x02d1
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r9] = r0
            java.lang.String r0 = "<span style='font-family:\"%s\";'>"
            java.lang.String r1 = X.AnonymousClass3K4.A0b(r0, r1)
            goto L_0x02d1
        L_0x0407:
            boolean r0 = r12 instanceof android.text.style.StyleSpan
            r13 = 2
            if (r0 == 0) goto L_0x0426
            r0 = r12
            android.text.style.StyleSpan r0 = (android.text.style.StyleSpan) r0
            int r11 = r0.getStyle()
            if (r11 == r14) goto L_0x0422
            if (r11 == r13) goto L_0x041e
            r0 = 3
            if (r11 != r0) goto L_0x02d1
            java.lang.String r1 = "<b><i>"
            goto L_0x02d1
        L_0x041e:
            java.lang.String r1 = "<i>"
            goto L_0x02d1
        L_0x0422:
            java.lang.String r1 = "<b>"
            goto L_0x02d1
        L_0x0426:
            boolean r0 = r12 instanceof X.AnonymousClass4GJ
            if (r0 == 0) goto L_0x0442
            r0 = r12
            X.4GJ r0 = (X.AnonymousClass4GJ) r0
            int r11 = r0.A00
            r0 = -1
            if (r11 == r0) goto L_0x043e
            if (r11 == r14) goto L_0x043a
            if (r11 != r13) goto L_0x02d1
            java.lang.String r1 = "<ruby style='ruby-position:under;'>"
            goto L_0x02d1
        L_0x043a:
            java.lang.String r1 = "<ruby style='ruby-position:over;'>"
            goto L_0x02d1
        L_0x043e:
            java.lang.String r1 = "<ruby style='ruby-position:unset;'>"
            goto L_0x02d1
        L_0x0442:
            boolean r0 = r12 instanceof android.text.style.UnderlineSpan
            if (r0 == 0) goto L_0x044a
            java.lang.String r1 = "<u>"
            goto L_0x02d1
        L_0x044a:
            boolean r0 = r12 instanceof X.C84064Jc
            if (r0 == 0) goto L_0x02d1
            r11 = r12
            X.4Jc r11 = (X.C84064Jc) r11
            int r15 = r11.A01
            int r0 = r11.A00
            java.lang.StringBuilder r16 = X.AnonymousClass000.A0o()
            if (r0 == r14) goto L_0x0492
            if (r0 != r13) goto L_0x0464
            java.lang.String r0 = "open "
        L_0x045f:
            r1 = r16
            r1.append(r0)
        L_0x0464:
            if (r15 == 0) goto L_0x048f
            if (r15 == r14) goto L_0x048c
            if (r15 == r13) goto L_0x0489
            java.lang.String r1 = "sesame"
        L_0x046c:
            r0 = r16
            java.lang.String r15 = X.AnonymousClass000.A0h(r1, r0)
            int r0 = r11.A02
            if (r0 == r13) goto L_0x0486
            java.lang.String r0 = "over right"
        L_0x0478:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r9] = r15
            r1[r14] = r0
            java.lang.String r0 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r1 = X.AnonymousClass3K4.A0b(r0, r1)
            goto L_0x02d1
        L_0x0486:
            java.lang.String r0 = "under left"
            goto L_0x0478
        L_0x0489:
            java.lang.String r1 = "dot"
            goto L_0x046c
        L_0x048c:
            java.lang.String r1 = "circle"
            goto L_0x046c
        L_0x048f:
            java.lang.String r1 = "none"
            goto L_0x046c
        L_0x0492:
            java.lang.String r0 = "filled "
            goto L_0x045f
        L_0x0495:
            int r0 = r26.length()
            java.lang.StringBuilder r10 = X.C13690nt.A0g(r0)
            r12 = 0
        L_0x049e:
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x04f9
            int r11 = r8.keyAt(r9)
            r0 = r26
            java.lang.CharSequence r0 = r0.subSequence(r12, r11)
            java.lang.String r0 = A01(r0)
            r10.append(r0)
            java.lang.Object r12 = r8.get(r11)
            X.4GN r12 = (X.AnonymousClass4GN) r12
            java.util.List r1 = r12.A01
            java.util.Comparator r0 = X.C34291k1.A04
            java.util.Collections.sort(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x04c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04d8
            java.lang.Object r0 = r1.next()
            X.1k1 r0 = (X.C34291k1) r0
            java.lang.String r0 = r0.A02
            r10.append(r0)
            goto L_0x04c6
        L_0x04d8:
            java.util.List r1 = r12.A00
            java.util.Comparator r0 = X.C34291k1.A05
            java.util.Collections.sort(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x04e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04f5
            java.lang.Object r0 = r1.next()
            X.1k1 r0 = (X.C34291k1) r0
            java.lang.String r0 = r0.A03
            r10.append(r0)
            goto L_0x04e3
        L_0x04f5:
            int r9 = r9 + 1
            r12 = r11
            goto L_0x049e
        L_0x04f9:
            int r1 = r26.length()
            r0 = r26
            java.lang.CharSequence r0 = r0.subSequence(r12, r1)
            java.lang.String r0 = A01(r0)
            java.lang.String r8 = X.AnonymousClass000.A0h(r0, r10)
            X.4GM r1 = new X.4GM
            r0 = r18
            r1.<init>(r8, r0)
            goto L_0x0170
        L_0x0514:
            java.lang.String r27 = "height"
            r37 = r6
            r6 = r11
            goto L_0x0151
        L_0x051b:
            if (r10 == 0) goto L_0x0522
        L_0x051d:
            r8 = r29
            goto L_0x0522
        L_0x0520:
            if (r10 == 0) goto L_0x051d
        L_0x0522:
            r29 = r28
            r1 = 2
            r28 = r8
            goto L_0x0148
        L_0x0529:
            X.4eB r0 = r4.A02
            int r0 = r0.A04
            goto L_0x0132
        L_0x052f:
            java.lang.String r2 = "vertical-lr"
            goto L_0x011e
        L_0x0533:
            java.lang.String r2 = "vertical-rl"
            goto L_0x011e
        L_0x0537:
            java.lang.String r32 = "start"
            goto L_0x0111
        L_0x053b:
            java.lang.String r33 = "fit-content"
            goto L_0x00fa
        L_0x053f:
            r6 = -50
            goto L_0x00dd
        L_0x0543:
            r0 = 0
            java.lang.String r7 = "%.2fem"
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            java.lang.Object[] r2 = new java.lang.Object[r1]
            if (r0 < 0) goto L_0x0559
            float r9 = r9 * r13
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r2[r6] = r0
            java.lang.String r7 = X.AnonymousClass3K4.A0b(r7, r2)
            goto L_0x00e0
        L_0x0559:
            float r0 = -r9
            float r0 = r0 - r10
            float r0 = r0 * r13
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2[r6] = r0
            java.lang.String r7 = X.AnonymousClass3K4.A0b(r7, r2)
            r10 = 1
            goto L_0x00e1
        L_0x0569:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            float r0 = r4.A00
            float r10 = r10 - r0
            float r10 = r10 * r12
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r2[r6] = r0
            java.lang.String r7 = X.AnonymousClass3K4.A0b(r8, r2)
            r6 = -100
            goto L_0x00e0
        L_0x057d:
            r11 = -50
            goto L_0x00b0
        L_0x0581:
            r35 = 1112014848(0x42480000, float:50.0)
            goto L_0x00a4
        L_0x0585:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r0 = "-0.05em -0.05em 0.15em %s"
            goto L_0x05b8
        L_0x0592:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r0 = "0.1em 0.12em 0.15em %s"
            goto L_0x05b8
        L_0x059f:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r0 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            goto L_0x05b8
        L_0x05ac:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r0 = r5.A01
            java.lang.String r0 = A00(r0)
            r2[r6] = r0
            java.lang.String r0 = "0.06em 0.08em 0.15em %s"
        L_0x05b8:
            java.lang.String r2 = X.AnonymousClass3K4.A0b(r0, r2)
            goto L_0x0036
        L_0x05be:
            java.lang.String r2 = "</div></body></html>"
            r0 = r19
            r0.append(r2)
            java.lang.String r0 = "<html><head><style>"
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0r(r0)
            java.util.Iterator r3 = X.AnonymousClass3K4.A0e(r5)
        L_0x05cf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05f0
            java.lang.String r2 = X.AnonymousClass000.A0m(r3)
            r6.append(r2)
            java.lang.String r0 = "{"
            r6.append(r0)
            java.lang.Object r0 = r5.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r6.append(r0)
            java.lang.String r0 = "}"
            r6.append(r0)
            goto L_0x05cf
        L_0x05f0:
            java.lang.String r0 = "</style></head>"
            java.lang.String r3 = X.AnonymousClass000.A0h(r0, r6)
            r2 = 0
            r0 = r19
            r0.insert(r2, r3)
            android.webkit.WebView r3 = r4.A04
            java.lang.String r2 = r19.toString()
            java.nio.charset.Charset r0 = X.AnonymousClass4BH.A05
            byte[] r0 = r2.getBytes(r0)
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "text/html"
            java.lang.String r0 = "base64"
            r3.loadData(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3O1.A03():void");
    }

    public void AhL(C90464eB r10, List list, float f2, float f3, int i2) {
        C90464eB r4 = r10;
        this.A02 = r10;
        float f4 = f2;
        this.A01 = f2;
        float f5 = f3;
        this.A00 = f3;
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C88444aV r1 = (C88444aV) list.get(i3);
            if (r1.A0C != null) {
                A0u.add(r1);
            } else {
                A0u2.add(r1);
            }
        }
        if (!this.A03.isEmpty() || !A0u2.isEmpty()) {
            this.A03 = A0u2;
            A03();
        }
        this.A05.AhL(r4, A0u, f4, f5, 0);
        invalidate();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2 && !this.A03.isEmpty()) {
            A03();
        }
    }
}
