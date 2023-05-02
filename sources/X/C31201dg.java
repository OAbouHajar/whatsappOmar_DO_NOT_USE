package X;

import android.util.SparseArray;
import android.view.View;
import com.bloks.components.bkcomponentsslider.BKBloksComponentsSliderBinderUtil;
import com.bloks.stdlib.components.bkcomponentsstdimplprogressbar.BKBloksComponentsStdImplProgressBarBinderUtil;
import com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil;
import com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil;
import com.facebook.redex.RunnableRunnableShape1S0500000_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1dg  reason: invalid class name and case insensitive filesystem */
public class C31201dg {
    public static final AnonymousClass5OK A06 = new C99094tT();
    public final int A00;
    public final int A01;
    public final SparseArray A02;
    public final C31201dg A03;
    public final LinkedList A04;
    public final List A05;

    public C31201dg(int i2) {
        this.A04 = null;
        this.A02 = new SparseArray();
        this.A01 = i2;
        this.A00 = AnonymousClass494.A00.incrementAndGet();
        this.A05 = null;
        this.A03 = null;
        AnonymousClass4BI.A03.incrementAndGet();
    }

    public C31201dg(C31201dg r5, C31201dg r6, List list, int i2) {
        int i3;
        Integer num;
        int intValue;
        this.A04 = r5.A04;
        SparseArray clone = r5.A02.clone();
        List A0L = r5.A0L();
        C90154da.A00();
        int i4 = r5.A01;
        if (i4 == 13504) {
            i3 = 32;
        } else if (C806344w.A00(i4)) {
            i3 = A03(r5, i4);
        } else {
            num = null;
            if (!(A0L == Collections.EMPTY_LIST || num == null || (intValue = num.intValue()) == -1)) {
                clone.put(intValue, new ArrayList(A0L));
            }
            this.A02 = clone;
            this.A01 = r5.A01;
            this.A00 = i2;
            this.A05 = list;
            this.A03 = r6;
            AnonymousClass4BI.A03.incrementAndGet();
        }
        num = Integer.valueOf(i3);
        clone.put(intValue, new ArrayList(A0L));
        this.A02 = clone;
        this.A01 = r5.A01;
        this.A00 = i2;
        this.A05 = list;
        this.A03 = r6;
        AnonymousClass4BI.A03.incrementAndGet();
    }

    public C31201dg(C31201dg r2, C84624Lg r3) {
        LinkedList linkedList = r2.A04;
        linkedList = linkedList == null ? new LinkedList() : linkedList;
        this.A04 = linkedList;
        linkedList.addFirst(r3);
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A05 = r2.A05;
        C31201dg r0 = r2.A03;
        this.A03 = r0 == null ? null : r0;
        AnonymousClass4BI.A03.incrementAndGet();
    }

    public C31201dg(List list, int i2, int i3) {
        this.A04 = null;
        this.A02 = new SparseArray(i3 + 1);
        this.A01 = i2;
        this.A00 = AnonymousClass494.A00.incrementAndGet();
        this.A05 = list;
        this.A03 = null;
        AnonymousClass4BI.A03.incrementAndGet();
    }

    public static float A00(String str, String str2) {
        if (str != null) {
            try {
                return C62163Bx.A01(str);
            } catch (AnonymousClass40K e2) {
                C29691b2.A01("RichTextBinderUtils", String.format("Error parsing %s: %s", new Object[]{str2, str}), e2);
            }
        }
        return 0.0f;
    }

    public static final int A01(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
    }

    public static int A02(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < i2) ? size : i2;
    }

    public static int A03(C31201dg r2, int i2) {
        if (i2 == 13317 || i2 == 13320) {
            return 32;
        }
        if (i2 == 13326 || i2 == 13336) {
            return -1;
        }
        if (i2 == 16160) {
            return BKBloksComponentsSliderBinderUtil.getChildrenKeyForComponent(r2);
        }
        if (i2 == 15778 || i2 == 15728 || i2 == 13334 || i2 == 13666 || i2 == 13329 || i2 == 13335) {
            return -1;
        }
        if (i2 == 13797) {
            return 32;
        }
        if (i2 == 16229) {
            return BKBloksComponentsStdImplProgressBarBinderUtil.getChildrenKeyForComponent(r2);
        }
        if (i2 == 13708) {
            return BKBloksComponentsTooltipBinderUtil.getChildrenKeyForComponent(r2);
        }
        if (i2 == 16444) {
            return BKBloksComponentsTooltipContainerBinderUtil.getChildrenKeyForComponent(r2);
        }
        if (i2 == 13327) {
            return 35;
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i2)}));
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102 A[SYNTHETIC, Splitter:B:44:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0OD A04(X.C14990q7 r20, X.C31201dg r21, java.util.List r22) {
        /*
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r11 = r22.iterator()
        L_0x000e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0217
            java.lang.Object r15 = r11.next()
            X.1dg r15 = (X.C31201dg) r15
            int r3 = r2.length()
            r0 = 59
            X.1dg r0 = r15.A0G(r0)
            if (r0 == 0) goto L_0x01f4
            java.lang.String r1 = " "
        L_0x0029:
            r2.append(r1)
            int r5 = r2.length()
            r0 = 59
            X.1dg r6 = r15.A0G(r0)
            r0 = 0
            if (r6 == 0) goto L_0x003a
            r0 = 1
        L_0x003a:
            r13 = r20
            if (r0 == 0) goto L_0x0076
            java.lang.String r9 = "Error parsing image width"
            r0 = 62
            java.lang.String r7 = r15.A0J(r0)
            r0 = 61
            java.lang.String r6 = r15.A0J(r0)
            r0 = 59
            X.1dg r0 = r15.A0G(r0)
            java.lang.String r8 = "TextNodeUtils"
            if (r7 == 0) goto L_0x006f
            if (r6 == 0) goto L_0x006f
            if (r0 == 0) goto L_0x006f
            float r7 = X.C62163Bx.A01(r7)     // Catch:{ 40K -> 0x0069 }
            float r0 = X.C62163Bx.A01(r6)     // Catch:{ 40K -> 0x0069 }
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01e8
            goto L_0x0181
        L_0x0069:
            r0 = move-exception
            X.C29691b2.A01(r8, r9, r0)
            goto L_0x01a4
        L_0x006f:
            java.lang.String r0 = "Invalid image span attributes specified."
            X.C29691b2.A00(r8, r0)
            goto L_0x01a4
        L_0x0076:
            r0 = 44
            X.1dg r0 = r15.A0G(r0)
            if (r0 == 0) goto L_0x009d
            int r0 = X.C87564Xk.A00(r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0086:
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r0)
            r0 = 0
            r2.setSpan(r6, r3, r5, r0)
        L_0x0093:
            r0 = 42
            java.lang.String r0 = r15.A0J(r0)
            if (r0 == 0) goto L_0x00dc
            r7 = 2
            goto L_0x00b7
        L_0x009d:
            r0 = 40
            java.lang.String r0 = r15.A0J(r0)
            if (r0 == 0) goto L_0x0093
            int r0 = X.C62163Bx.A05(r0)     // Catch:{ 40K -> 0x00ae }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 40K -> 0x00ae }
            goto L_0x0086
        L_0x00ae:
            r7 = move-exception
            java.lang.String r6 = "TextNodeUtils"
            java.lang.String r0 = "Error parsing TextSpan color"
            X.C29691b2.A01(r6, r0, r7)
            goto L_0x0093
        L_0x00b7:
            float r6 = X.C62163Bx.A02(r0)     // Catch:{ 40K -> 0x00d4 }
            android.content.Context r0 = r13.A00     // Catch:{ 40K -> 0x00d4 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ 40K -> 0x00d4 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ 40K -> 0x00d4 }
            float r0 = android.util.TypedValue.applyDimension(r7, r6, r0)     // Catch:{ 40K -> 0x00d4 }
            int r0 = (int) r0     // Catch:{ 40K -> 0x00d4 }
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan     // Catch:{ 40K -> 0x00d4 }
            r6.<init>(r0)     // Catch:{ 40K -> 0x00d4 }
            r0 = 0
            r2.setSpan(r6, r3, r5, r0)     // Catch:{ 40K -> 0x00d4 }
            goto L_0x00dc
        L_0x00d4:
            r7 = move-exception
            java.lang.String r6 = "TextNodeUtils"
            java.lang.String r0 = "Error parsing TextSpan size"
            X.C29691b2.A01(r6, r0, r7)
        L_0x00dc:
            r0 = 35
            java.lang.String r6 = r15.A0J(r0)
            if (r6 == 0) goto L_0x00f9
            X.4da r0 = X.C90154da.A00()
            X.1MO r0 = r0.A04()
            r7 = 0
            android.graphics.Typeface r6 = r0.A00(r13, r6, r7)
            X.0BV r0 = new X.0BV
            r0.<init>(r6)
            r2.setSpan(r0, r3, r5, r7)
        L_0x00f9:
            r0 = 43
            java.lang.String r0 = r15.A0J(r0)
            r10 = 0
            if (r0 == 0) goto L_0x0117
            int r6 = X.C62163Bx.A09(r0)     // Catch:{ 40K -> 0x010f }
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan     // Catch:{ 40K -> 0x010f }
            r0.<init>(r6)     // Catch:{ 40K -> 0x010f }
            r2.setSpan(r0, r3, r5, r10)     // Catch:{ 40K -> 0x010f }
            goto L_0x0117
        L_0x010f:
            r7 = move-exception
            java.lang.String r6 = "TextNodeUtils"
            java.lang.String r0 = "Error parsing TextSpan textStyle"
            X.C29691b2.A01(r6, r0, r7)
        L_0x0117:
            r0 = 45
            boolean r0 = r15.A0P(r0, r10)
            if (r0 == 0) goto L_0x0127
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r2.setSpan(r0, r3, r5, r10)
        L_0x0127:
            r0 = 52
            boolean r0 = r15.A0P(r0, r10)
            if (r0 == 0) goto L_0x0137
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r2.setSpan(r0, r3, r5, r10)
        L_0x0137:
            r0 = 56
            r6 = 0
            float r9 = r15.A08(r0, r6)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0162
            r0 = 54
            float r8 = r15.A08(r0, r6)
            r0 = 55
            float r7 = r15.A08(r0, r6)
            r0 = 53
            X.1dg r0 = r15.A0G(r0)
            if (r0 == 0) goto L_0x017f
            int r6 = X.C87564Xk.A00(r13, r0)
        L_0x015a:
            X.0BT r0 = new X.0BT
            r0.<init>(r9, r8, r7, r6)
            r2.setSpan(r0, r3, r5, r10)
        L_0x0162:
            r6 = 49
            r0 = 1
            float r7 = r15.A08(r6, r0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a4
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r6 < r0) goto L_0x01a4
            X.4da r0 = X.C90154da.A00()
            android.content.Context r0 = r0.A02()
            X.AnonymousClass0MX.A00(r0, r2, r7, r3, r5)
            goto L_0x01a4
        L_0x017f:
            r6 = 0
            goto L_0x015a
        L_0x0181:
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01e8
            r0 = 68
            r15.A0J(r0)
            r0 = 69
            X.1dg r6 = r15.A0G(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r6 == 0) goto L_0x01a4
            X.0Rp r6 = X.C87554Xj.A01(r6)
            android.content.Context r0 = r13.A00
            boolean r0 = X.C806945c.A00(r0)
            r6.A00(r0)
        L_0x01a4:
            r0 = 66
            java.lang.String r17 = r15.A0J(r0)
            r0 = 67
            java.lang.String r18 = r15.A0J(r0)
            r0 = 36
            X.0q1 r16 = r15.A0H(r0)
            r0 = 0
            r14 = r21
            if (r16 == 0) goto L_0x01c5
            r19 = 0
            X.0Iw r12 = new X.0Iw
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r2.setSpan(r12, r3, r5, r0)
        L_0x01c5:
            r6 = 57
            X.0q1 r16 = r15.A0H(r6)
            if (r16 == 0) goto L_0x01d7
            r19 = 1
            X.0Iw r12 = new X.0Iw
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r2.setSpan(r12, r3, r5, r0)
        L_0x01d7:
            r0 = 66
            java.lang.String r3 = r15.A0J(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01ef
            r4.append(r3)
            goto L_0x000e
        L_0x01e8:
            r6 = 0
            java.lang.String r0 = "Invalid dimensions specified for image span"
            X.C29691b2.A01(r8, r0, r6)
            goto L_0x01a4
        L_0x01ef:
            r4.append(r1)
            goto L_0x000e
        L_0x01f4:
            r0 = 41
            X.1dg r5 = r15.A0G(r0)
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x020f
            X.4da r0 = X.C90154da.A00()
            X.4aX r0 = r0.A05()
            java.lang.CharSequence r0 = r0.A00(r5)
            if (r0 == 0) goto L_0x0029
            r1 = r0
            goto L_0x0029
        L_0x020f:
            r0 = 38
            java.lang.String r1 = r15.A0K(r0, r1)
            goto L_0x0029
        L_0x0217:
            java.lang.String r1 = r4.toString()
            X.0OD r0 = new X.0OD
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31201dg.A04(X.0q7, X.1dg, java.util.List):X.0OD");
    }

    public static void A05(RunnableRunnableShape1S0500000_I1 runnableRunnableShape1S0500000_I1, C31201dg r7, int i2) {
        C14930q1 A0H = r7.A0H(i2);
        if (A0H != null) {
            C31201dg r3 = (C31201dg) runnableRunnableShape1S0500000_I1.A00;
            C14990q7 r2 = (C14990q7) runnableRunnableShape1S0500000_I1.A01;
            C14940q2 r0 = new C14940q2();
            r0.A02(r3, 0);
            r0.A02(r2, 1);
            C29701b3.A01(r2, r3, new C14950q3(r0.A00), A0H);
        }
    }

    public static void A06(AnonymousClass3HU r2, Integer num) {
        int intValue = num.intValue();
        r2.A0U = intValue != 1 ? (intValue == 8388611 || intValue != 8388613) ? AnonymousClass422.TEXT_START : AnonymousClass422.TEXT_END : AnonymousClass422.CENTER;
    }

    public static boolean A07(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (i2 == i3) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        if (mode == 1073741824 && size == i4) {
            return true;
        }
        return (mode == Integer.MIN_VALUE && mode2 == 0) ? size >= i4 : mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 > size && i4 <= size;
    }

    public float A08(int i2, float f2) {
        Number number = (Number) this.A02.get(i2);
        return number != null ? number.floatValue() : f2;
    }

    public int A09() {
        return this.A01;
    }

    public int A0A(int i2, int i3) {
        Object obj = this.A02.get(i2);
        if (obj == null) {
            return i3;
        }
        if (!(obj instanceof String)) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            C29691b2.A00("BloksModel", "Non-int string parsed as int");
            return i3;
        }
    }

    public long A0B(long j2, int i2) {
        Object obj = this.A02.get(i2);
        if (obj == null) {
            return j2;
        }
        if (!(obj instanceof String)) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            C29691b2.A00("BloksModel", "Non-long string parsed as long");
            return j2;
        }
    }

    public View A0C(C14990q7 r3) {
        if (r3 == null) {
            return null;
        }
        return ((AnonymousClass4CI) r3.A03(A06, this, R.id.bk_context_key_associated_mutable_container)).A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.3U0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: X.3U0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v246, resolved type: com.obwhatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v235, resolved type: X.2uc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v236, resolved type: X.3fh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v237, resolved type: X.3fk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v238, resolved type: X.3fi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v239, resolved type: X.3fa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v240, resolved type: X.3Tz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v241, resolved type: X.3fc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v242, resolved type: X.3fb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v243, resolved type: X.0Iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v244, resolved type: X.3fe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v245, resolved type: X.3fj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v246, resolved type: X.2ug} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v247, resolved type: X.3fg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v248, resolved type: X.2ub} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v249, resolved type: X.2uf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v250, resolved type: X.2ud} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v251, resolved type: X.3fd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v252, resolved type: X.3ff} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v257, resolved type: X.3Tz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v259, resolved type: X.3Tz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v269, resolved type: X.2ue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v273, resolved type: X.3Tz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v274, resolved type: X.3Ty} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v275, resolved type: X.3Ty} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v276, resolved type: X.3Ty} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v277, resolved type: X.0J1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v278, resolved type: X.0Ix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v279, resolved type: X.0J0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v280, resolved type: X.0Iz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v282, resolved type: X.2uh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v283, resolved type: X.3fZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v284, resolved type: X.3U0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v285, resolved type: X.3U0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v286, resolved type: X.3U0} */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.5TP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v121, types: [X.4nL] */
    /* JADX WARNING: type inference failed for: r3v727 */
    /* JADX WARNING: type inference failed for: r3v728 */
    /* JADX WARNING: type inference failed for: r5v71, types: [X.0ec] */
    /* JADX WARNING: type inference failed for: r3v729 */
    /* JADX WARNING: type inference failed for: r3v730 */
    /* JADX WARNING: type inference failed for: r5v72, types: [X.4nL] */
    /* JADX WARNING: type inference failed for: r3v731 */
    /* JADX WARNING: type inference failed for: r3v732 */
    /* JADX WARNING: type inference failed for: r3v733 */
    /* JADX WARNING: type inference failed for: r9v59, types: [X.0eb] */
    /* JADX WARNING: type inference failed for: r3v734 */
    /* JADX WARNING: type inference failed for: r3v735 */
    /* JADX WARNING: type inference failed for: r3v737 */
    /* JADX WARNING: type inference failed for: r3v738 */
    /* JADX WARNING: type inference failed for: r3v739 */
    /* JADX WARNING: type inference failed for: r3v740 */
    /* JADX WARNING: type inference failed for: r5v73, types: [X.4nL] */
    /* JADX WARNING: type inference failed for: r3v741 */
    /* JADX WARNING: type inference failed for: r3v742 */
    /* JADX WARNING: type inference failed for: r7v115, types: [X.4nL] */
    /* JADX WARNING: type inference failed for: r8v99, types: [X.4nL] */
    /* JADX WARNING: type inference failed for: r7v116, types: [X.4nL] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final X.AnonymousClass5TP A0D(X.C86794Ue r43, int r44, int r45) {
        /*
            r42 = this;
            r2 = r43
            X.4ZW r16 = r2.A00()
            r0 = r16
            X.4G0 r1 = r0.A00
            r0 = r42
            r41 = r44
            r40 = r45
            if (r1 == 0) goto L_0x0065
            java.util.Map r1 = r1.A01
            java.lang.Object r4 = r1.get(r0)
            X.5TP r4 = (X.AnonymousClass5TP) r4
            if (r4 == 0) goto L_0x0065
            int r5 = r4.AH7()
            int r3 = r4.getWidth()
            r1 = r41
            boolean r1 = A07(r5, r1, r3)
            if (r1 == 0) goto L_0x0065
            int r5 = r4.ACb()
            int r3 = r4.getHeight()
            r1 = r40
            boolean r1 = A07(r5, r1, r3)
            if (r1 == 0) goto L_0x0065
            X.4VL r1 = X.C89644cb.A00
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = "Bloks cacheTraversal: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            int r1 = r0.A01
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            X.C89644cb.A01(r1)
        L_0x0057:
            X.4th r2 = new X.4th
            r1 = r16
            r2.<init>(r1, r0)
            r0.A0Q(r2)
            X.C89644cb.A00()
            return r4
        L_0x0065:
            X.4VL r1 = X.C89644cb.A00
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x0087
            r1 = 128(0x80, float:1.794E-43)
            r0.A0J(r1)
            java.lang.String r1 = "Bloks Layout: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            int r1 = r0.A01
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            X.4VL r1 = X.C89644cb.A00
            r1.A01(r3)
        L_0x0087:
            X.4da r1 = X.C90154da.A00()
            X.1JY r12 = r1.A0B
            java.lang.Object r1 = r2.A03
            r17 = r1
            r5 = r17
            X.0q7 r5 = (X.C14990q7) r5
            X.4ZW r3 = r2.A00()
            X.4da r1 = X.C90154da.A00()
            X.1JY r4 = r1.A0B
            int r6 = r0.A01
            r1 = 13323(0x340b, float:1.867E-41)
            if (r6 == r1) goto L_0x094a
            r1 = 13648(0x3550, float:1.9125E-41)
            if (r6 == r1) goto L_0x0942
            r1 = 13889(0x3641, float:1.9463E-41)
            if (r6 == r1) goto L_0x093a
            r1 = 13948(0x367c, float:1.9545E-41)
            if (r6 == r1) goto L_0x0932
            r1 = 14005(0x36b5, float:1.9625E-41)
            if (r6 == r1) goto L_0x092c
            r1 = 14093(0x370d, float:1.9748E-41)
            if (r6 == r1) goto L_0x08e5
            r1 = 15763(0x3d93, float:2.2089E-41)
            if (r6 == r1) goto L_0x08dc
            r1 = 15972(0x3e64, float:2.2382E-41)
            if (r6 == r1) goto L_0x08d5
            r1 = 15981(0x3e6d, float:2.2394E-41)
            if (r6 == r1) goto L_0x08c8
            r1 = 16094(0x3ede, float:2.2552E-41)
            if (r6 == r1) goto L_0x08bf
            switch(r6) {
                case 13496: goto L_0x08b6;
                case 13497: goto L_0x08ad;
                case 13498: goto L_0x08a4;
                case 13499: goto L_0x089b;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            switch(r6) {
                case 13501: goto L_0x0892;
                case 13502: goto L_0x0889;
                case 13503: goto L_0x0880;
                case 13504: goto L_0x0877;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            boolean r1 = X.C806344w.A00(r6)
            if (r1 == 0) goto L_0x08fa
            r1 = 13317(0x3405, float:1.8661E-41)
            if (r6 != r1) goto L_0x054f
            java.lang.Object r8 = X.C62183Bz.A05(r5, r0)
            X.39I r8 = (X.AnonymousClass39I) r8
            int r10 = X.AnonymousClass45Z.A00(r0)
            int r1 = r0.A00
            long r3 = (long) r1
            X.2rJ r9 = r8.A02
            X.4CJ r7 = new X.4CJ
            r7.<init>(r0)
            X.3U0 r1 = new X.3U0
            r1.<init>(r9, r7, r3)
            X.41R r3 = X.C806745a.A00(r0)
            r1.A08 = r3
            X.4Bp r3 = r8.A01
            r1.A09 = r3
            r1.A02 = r10
            r3 = 73
            r10 = 0
            boolean r3 = r0.A0P(r3, r10)
            r1.A0E = r3
            r3 = 67
            boolean r3 = r0.A0P(r3, r10)
            r11 = 1
            r9 = 0
            if (r3 == 0) goto L_0x024c
            r3 = 71
            java.lang.String r7 = r0.A0J(r3)
            r4 = 1082130432(0x40800000, float:4.0)
            android.content.Context r3 = r5.A00     // Catch:{ 40K -> 0x012d }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ 40K -> 0x012d }
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch:{ 40K -> 0x012d }
            float r3 = r3.density     // Catch:{ 40K -> 0x012d }
            float r3 = r3 * r4
            if (r7 == 0) goto L_0x0135
            float r3 = X.C62163Bx.A01(r7)     // Catch:{ 40K -> 0x012d }
            goto L_0x0135
        L_0x012d:
            java.lang.String r1 = "Invalid pixel format for scroll indicator size"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0135:
            int r3 = (int) r3
            r29 = r3
            r3 = 70
            X.1dg r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x0333
            int r21 = X.C87564Xk.A01(r5, r3, r10)
        L_0x0144:
            r3 = 78
            X.1dg r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x032f
            int r20 = X.C87564Xk.A01(r5, r3, r10)
        L_0x0150:
            r3 = 68
            boolean r19 = r0.A0P(r3, r10)
            r3 = 72
            java.lang.String r3 = r0.A0J(r3)
            if (r3 != 0) goto L_0x0329
            r3 = 0
        L_0x015f:
            int r3 = (int) r3
            r28 = r3
            X.2rN r7 = r8.A06
            r3 = 87
            X.1dg r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x0312
            X.0Rp r3 = X.C87554Xj.A01(r3)
            int r15 = r3.A04
            if (r15 != 0) goto L_0x0176
            int r15 = r3.A02
        L_0x0176:
            int r14 = r3.A05
            int r13 = r3.A01
            if (r13 != 0) goto L_0x017e
            int r13 = r3.A03
        L_0x017e:
            int r3 = r3.A00
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r15, r14, r13, r3)
        L_0x0185:
            r3 = 81
            X.1dg r3 = r0.A0G(r3)
            if (r3 != 0) goto L_0x0197
            r3 = 87
            X.1dg r3 = r0.A0G(r3)
            r18 = 0
            if (r3 == 0) goto L_0x0199
        L_0x0197:
            r18 = 1
        L_0x0199:
            r3 = 90
            java.lang.String r3 = r0.A0J(r3)
            if (r3 != 0) goto L_0x030c
            r23 = 0
        L_0x01a3:
            r3 = 89
            java.lang.String r3 = r0.A0J(r3)
            if (r3 != 0) goto L_0x0306
            r24 = 0
        L_0x01ad:
            r3 = 93
            java.lang.String r3 = r0.A0J(r3)
            if (r3 != 0) goto L_0x0300
            r26 = 0
        L_0x01b7:
            r3 = 91
            float r25 = r0.A08(r3, r9)
            int r3 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x04fb
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x04fb
            r3 = 88
            X.1dg r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x02fc
            int r27 = X.C87564Xk.A01(r5, r3, r10)
        L_0x01d3:
            X.4Nb r3 = new X.4Nb
            r22 = r3
            r22.<init>(r23, r24, r25, r26, r27)
            if (r7 == 0) goto L_0x02e3
            int r14 = r7.A05
            r13 = r21
            if (r14 != r13) goto L_0x02e3
            int r14 = r7.A03
            r13 = r20
            if (r14 != r13) goto L_0x02e3
            int r14 = r7.A07
            r13 = r29
            if (r14 != r13) goto L_0x02e3
            int r14 = r7.A06
            r13 = r28
            if (r14 != r13) goto L_0x02e3
            boolean r14 = r7.A0E
            r13 = r19
            if (r14 != r13) goto L_0x02e3
            android.graphics.Rect r13 = r7.A0A
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L_0x02e3
            boolean r14 = r7.A0F
            r13 = r18
            if (r14 != r13) goto L_0x02e3
            X.4Nb r15 = r7.A0D
            float r14 = r15.A01
            float r13 = r3.A01
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x02e3
            float r14 = r15.A00
            float r13 = r3.A00
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x02e3
            float r14 = r15.A02
            float r13 = r3.A02
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x02e3
            float r14 = r15.A03
            float r13 = r3.A03
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x02e3
            int r14 = r15.A04
            int r13 = r3.A04
            if (r14 != r13) goto L_0x02e3
        L_0x0230:
            r3 = 77
            boolean r4 = r0.A0P(r3, r10)
            X.2rU r3 = new X.2rU
            r3.<init>(r7, r4)
            r1.A07(r3)
            java.util.List r3 = r1.A0A
            if (r3 != 0) goto L_0x0249
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.A0A = r3
        L_0x0249:
            r3.add(r7)
        L_0x024c:
            r3 = 50
            X.0q1 r4 = r0.A0H(r3)
            if (r4 == 0) goto L_0x025c
            X.3RQ r3 = new X.3RQ
            r3.<init>(r5, r0, r4)
            r1.A07(r3)
        L_0x025c:
            r3 = 61
            X.0q1 r4 = r0.A0H(r3)
            if (r4 == 0) goto L_0x026c
            X.3RP r3 = new X.3RP
            r3.<init>(r5, r0, r4)
            r1.A07(r3)
        L_0x026c:
            r3 = 49
            X.0q1 r3 = r0.A0H(r3)
            if (r3 == 0) goto L_0x0281
            X.4R6 r4 = new X.4R6
            r4.<init>(r5, r0, r3)
            X.2rV r3 = new X.2rV
            r3.<init>(r4)
            r1.A07(r3)
        L_0x0281:
            r3 = 54
            java.lang.String r4 = r0.A0J(r3)
            if (r4 != 0) goto L_0x029b
            X.41l r14 = X.C798241l.A03
        L_0x028b:
            X.41l r3 = X.C798241l.A03
            if (r14 == r3) goto L_0x040c
            X.41C r15 = X.AnonymousClass41C.A02
            r3 = 69
            java.lang.String r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x0367
            goto L_0x0338
        L_0x029b:
            int r3 = r4.hashCode()     // Catch:{ 40K -> 0x04f3 }
            switch(r3) {
                case -1364013995: goto L_0x02d8;
                case 100571: goto L_0x02cd;
                case 3387192: goto L_0x02c2;
                case 109757538: goto L_0x02b6;
                default: goto L_0x02a2;
            }     // Catch:{ 40K -> 0x04f3 }
        L_0x02a2:
            java.lang.String r1 = "can't parse unknown snap gravity: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 40K -> 0x04f3 }
            r0.<init>(r1)     // Catch:{ 40K -> 0x04f3 }
            r0.append(r4)     // Catch:{ 40K -> 0x04f3 }
            java.lang.String r1 = r0.toString()     // Catch:{ 40K -> 0x04f3 }
            X.40K r0 = new X.40K     // Catch:{ 40K -> 0x04f3 }
            r0.<init>(r1)     // Catch:{ 40K -> 0x04f3 }
            throw r0     // Catch:{ 40K -> 0x04f3 }
        L_0x02b6:
            java.lang.String r3 = "start"
            boolean r3 = r4.equals(r3)     // Catch:{ 40K -> 0x04f3 }
            if (r3 == 0) goto L_0x02a2
            X.41l r14 = X.C798241l.A04     // Catch:{ 40K -> 0x04f3 }
            goto L_0x028b
        L_0x02c2:
            java.lang.String r3 = "none"
            boolean r3 = r4.equals(r3)     // Catch:{ 40K -> 0x04f3 }
            if (r3 == 0) goto L_0x02a2
            X.41l r14 = X.C798241l.A03     // Catch:{ 40K -> 0x04f3 }
            goto L_0x028b
        L_0x02cd:
            java.lang.String r3 = "end"
            boolean r3 = r4.equals(r3)     // Catch:{ 40K -> 0x04f3 }
            if (r3 == 0) goto L_0x02a2
            X.41l r14 = X.C798241l.A02     // Catch:{ 40K -> 0x04f3 }
            goto L_0x028b
        L_0x02d8:
            java.lang.String r3 = "center"
            boolean r3 = r4.equals(r3)     // Catch:{ 40K -> 0x04f3 }
            if (r3 == 0) goto L_0x02a2
            X.41l r14 = X.C798241l.A01     // Catch:{ 40K -> 0x04f3 }
            goto L_0x028b
        L_0x02e3:
            X.2rN r7 = new X.2rN
            r27 = r29
            r29 = r19
            r30 = r18
            r22 = r7
            r23 = r4
            r24 = r3
            r25 = r21
            r26 = r20
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r8.A06 = r7
            goto L_0x0230
        L_0x02fc:
            r27 = 0
            goto L_0x01d3
        L_0x0300:
            float r26 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0503 }
            goto L_0x01b7
        L_0x0306:
            float r24 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0517 }
            goto L_0x01ad
        L_0x030c:
            float r23 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x052b }
            goto L_0x01a3
        L_0x0312:
            r3 = 76
            java.lang.String r3 = r0.A0J(r3)     // Catch:{ 40K -> 0x053f }
            if (r3 != 0) goto L_0x031b
            goto L_0x0320
        L_0x031b:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x053f }
            goto L_0x0321
        L_0x0320:
            r3 = 0
        L_0x0321:
            int r3 = (int) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r3, r3, r3)
            goto L_0x0185
        L_0x0329:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0547 }
            goto L_0x015f
        L_0x032f:
            r20 = 0
            goto L_0x0150
        L_0x0333:
            r21 = -7829368(0xffffffffff888888, float:NaN)
            goto L_0x0144
        L_0x0338:
            java.lang.String r4 = "linear"
            boolean r4 = r3.equals(r4)     // Catch:{ 40K -> 0x035f }
            if (r4 != 0) goto L_0x035c
            java.lang.String r4 = "pager"
            boolean r4 = r3.equals(r4)     // Catch:{ 40K -> 0x035f }
            if (r4 != 0) goto L_0x0367
            java.lang.String r1 = "can't parse unknown snap style: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 40K -> 0x035f }
            r0.<init>(r1)     // Catch:{ 40K -> 0x035f }
            r0.append(r3)     // Catch:{ 40K -> 0x035f }
            java.lang.String r1 = r0.toString()     // Catch:{ 40K -> 0x035f }
            X.40K r0 = new X.40K     // Catch:{ 40K -> 0x035f }
            r0.<init>(r1)     // Catch:{ 40K -> 0x035f }
            throw r0     // Catch:{ 40K -> 0x035f }
        L_0x035c:
            X.41C r15 = X.AnonymousClass41C.A01     // Catch:{ 40K -> 0x035f }
            goto L_0x0367
        L_0x035f:
            java.lang.String r1 = "Invalid snap style value"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0367:
            r3 = 45
            java.lang.String r3 = r0.A0J(r3)
            if (r3 != 0) goto L_0x039a
            r3 = 0
        L_0x0370:
            java.lang.Float r13 = java.lang.Float.valueOf(r3)
            X.0Fl r7 = r8.A05
            int r15 = r15.ordinal()
            java.lang.String r3 = "Invalid gravity type :"
            int r4 = r14.ordinal()
            if (r15 == 0) goto L_0x03bb
            switch(r4) {
                case 0: goto L_0x039f;
                case 1: goto L_0x039f;
                case 2: goto L_0x039f;
                default: goto L_0x0385;
            }
        L_0x0385:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r14)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x039a:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x03d3 }
            goto L_0x0370
        L_0x039f:
            boolean r3 = r7 instanceof X.C64543Qs
            if (r3 == 0) goto L_0x03b5
            r3 = r7
            X.3Qs r3 = (X.C64543Qs) r3
            X.4Wr r4 = r3.A00
            X.41l r3 = r4.A02
            if (r3 != r14) goto L_0x03b5
            java.lang.Float r3 = r4.A03
            boolean r3 = X.AnonymousClass45W.A00(r3, r13)
            if (r3 == 0) goto L_0x03b5
            goto L_0x03f0
        L_0x03b5:
            X.3Qs r7 = new X.3Qs
            r7.<init>(r14, r13)
            goto L_0x03f0
        L_0x03bb:
            switch(r4) {
                case 0: goto L_0x03db;
                case 1: goto L_0x03db;
                case 2: goto L_0x03db;
                default: goto L_0x03be;
            }
        L_0x03be:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r14)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03d3:
            java.lang.String r1 = "Invalid pixel format for left offset on snap"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x03db:
            boolean r3 = r7 instanceof X.C64483Qm
            if (r3 == 0) goto L_0x04d4
            r3 = r7
            X.3Qm r3 = (X.C64483Qm) r3
            X.4Wr r4 = r3.A00
            X.41l r3 = r4.A02
            if (r3 != r14) goto L_0x04d4
            java.lang.Float r3 = r4.A03
            boolean r3 = X.AnonymousClass45W.A00(r3, r13)
            if (r3 == 0) goto L_0x04d4
        L_0x03f0:
            r1.A07 = r7
            r8.A05 = r7
            r3 = 51
            X.0q1 r4 = r0.A0H(r3)
            r3 = 97
            X.0q1 r3 = r0.A0H(r3)
            if (r4 != 0) goto L_0x0404
            if (r3 == 0) goto L_0x040c
        L_0x0404:
            X.2rW r3 = new X.2rW
            r3.<init>(r7, r5, r0)
            r1.A07(r3)
        L_0x040c:
            android.content.Context r4 = r5.A00
            X.C18450wi.A0H(r4, r11)
            X.41R r3 = X.C806745a.A00(r0)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0435
            X.3AG r3 = X.AnonymousClass3AG.A00
            X.4Nh r3 = r3.A00(r4, r0)
            android.graphics.Rect r4 = r3.A04
            int r3 = r4.left
            if (r3 != 0) goto L_0x0433
            int r3 = r4.top
            if (r3 != 0) goto L_0x0433
            int r3 = r4.right
            if (r3 != 0) goto L_0x0433
            int r3 = r4.bottom
            if (r3 == 0) goto L_0x0435
        L_0x0433:
            r1.A05 = r4
        L_0x0435:
            X.41R r3 = X.C806745a.A00(r0)
            int r3 = r3.ordinal()
            switch(r3) {
                case 0: goto L_0x048a;
                case 1: goto L_0x04cd;
                default: goto L_0x0440;
            }
        L_0x0440:
            X.3RF r9 = new X.3RF
            r9.<init>(r5, r0)
        L_0x0445:
            java.util.List r3 = r1.A0A
            if (r3 != 0) goto L_0x0450
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.A0A = r3
        L_0x0450:
            r3.add(r9)
        L_0x0453:
            r3 = 43
            boolean r3 = r0.A0P(r3, r10)
            if (r3 == 0) goto L_0x0467
            X.0Fr r3 = r8.A04
            if (r3 == 0) goto L_0x0484
            X.0Fr r3 = r8.A04
        L_0x0461:
            r8.A04 = r3
            r3.A00 = r10
            r1.A06 = r3
        L_0x0467:
            r3 = 35
            boolean r4 = r0.A0P(r3, r10)
            r3 = 2
            if (r4 == 0) goto L_0x0471
            r3 = 0
        L_0x0471:
            r1.A03 = r3
            r3 = 41
            X.1dg r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x0481
            int r3 = X.C87564Xk.A01(r5, r3, r10)
            r1.A00 = r3
        L_0x0481:
            r3 = 75
            goto L_0x04db
        L_0x0484:
            X.0Fr r3 = new X.0Fr
            r3.<init>()
            goto L_0x0461
        L_0x048a:
            r3 = 55
            java.lang.String r7 = r0.A0J(r3)     // Catch:{ 40K -> 0x04eb }
            r3 = 56
            java.lang.String r4 = r0.A0J(r3)     // Catch:{ 40K -> 0x04eb }
            r3 = 44
            java.lang.String r3 = r0.A0J(r3)     // Catch:{ 40K -> 0x04eb }
            if (r7 != 0) goto L_0x049f
            goto L_0x04a4
        L_0x049f:
            float r13 = X.C62163Bx.A01(r7)     // Catch:{ 40K -> 0x04eb }
            goto L_0x04a5
        L_0x04a4:
            r13 = 0
        L_0x04a5:
            if (r4 != 0) goto L_0x04bd
            r7 = 0
        L_0x04a8:
            if (r3 != 0) goto L_0x04b8
            r4 = 0
        L_0x04ab:
            int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x04c2
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x04c2
            int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x04c2
            goto L_0x0453
        L_0x04b8:
            float r4 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x04eb }
            goto L_0x04ab
        L_0x04bd:
            float r7 = X.C62163Bx.A01(r4)     // Catch:{ 40K -> 0x04eb }
            goto L_0x04a8
        L_0x04c2:
            int r3 = X.C806845b.A00(r0)     // Catch:{ 40K -> 0x04eb }
            X.0Ff r9 = new X.0Ff     // Catch:{ 40K -> 0x04eb }
            r9.<init>(r7, r4, r13, r3)     // Catch:{ 40K -> 0x04eb }
            goto L_0x0445
        L_0x04cd:
            X.3RE r9 = new X.3RE
            r9.<init>(r5, r0)
            goto L_0x0445
        L_0x04d4:
            X.3Qm r7 = new X.3Qm
            r7.<init>(r14, r13)
            goto L_0x03f0
        L_0x04db:
            java.lang.String r3 = r0.A0J(r3)     // Catch:{ 40K -> 0x0952 }
            if (r3 != 0) goto L_0x04e2
            goto L_0x04e7
        L_0x04e2:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0952 }
            goto L_0x04e8
        L_0x04e7:
            r3 = 0
        L_0x04e8:
            int r10 = (int) r3     // Catch:{ 40K -> 0x0952 }
            goto L_0x095a
        L_0x04eb:
            java.lang.String r1 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x04f3:
            java.lang.String r1 = "Invalid snap gravity value"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x04fb:
            java.lang.String r1 = "Error parsing scroll indicator's shadow opacity: it should be in range [0..1]"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0503:
            java.lang.String r1 = "Error parsing scroll indicator's shadow Radius: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0517:
            java.lang.String r1 = "Error parsing scroll indicator's shadow Height: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x052b:
            java.lang.String r1 = "Error parsing scroll indicator's shadow Width: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x053f:
            java.lang.String r1 = "Invalid pixel format for scroll indicator margin"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0547:
            java.lang.String r1 = "Invalid pixel format for scroll indicator corner radius"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x054f:
            r4 = 13320(0x3408, float:1.8665E-41)
            r1 = 38
            if (r6 == r4) goto L_0x0643
            r1 = 13326(0x340e, float:1.8674E-41)
            if (r6 != r1) goto L_0x0560
            X.3fZ r1 = new X.3fZ
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x0560:
            r1 = 13336(0x3418, float:1.8688E-41)
            if (r6 != r1) goto L_0x056b
            X.2uh r1 = new X.2uh
            r1.<init>(r5, r5, r0)
            goto L_0x09a2
        L_0x056b:
            r1 = 16160(0x3f20, float:2.2645E-41)
            if (r6 != r1) goto L_0x0575
            X.3BJ r1 = com.bloks.components.bkcomponentsslider.BKBloksComponentsSliderBinderUtil.createRenderUnit(r5, r0, r3)
            goto L_0x09a2
        L_0x0575:
            r1 = 15778(0x3da2, float:2.211E-41)
            if (r6 != r1) goto L_0x0580
            X.0Iz r1 = new X.0Iz
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x0580:
            r1 = 15728(0x3d70, float:2.204E-41)
            if (r6 != r1) goto L_0x058b
            X.0J0 r1 = new X.0J0
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x058b:
            r1 = 13334(0x3416, float:1.8685E-41)
            if (r6 != r1) goto L_0x0596
            X.0Ix r1 = new X.0Ix
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x0596:
            r1 = 13666(0x3562, float:1.915E-41)
            if (r6 != r1) goto L_0x05a1
            X.0J1 r1 = new X.0J1
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x05a1:
            r1 = 13329(0x3411, float:1.8678E-41)
            if (r6 != r1) goto L_0x05d0
            int r1 = r0.A00
            long r3 = (long) r1
            X.3Ty r1 = new X.3Ty
            r1.<init>(r3)
            r3 = 41
            X.0q1 r4 = r0.A0H(r3)
            if (r4 == 0) goto L_0x05c1
            X.0ed r3 = new X.0ed
            r3.<init>(r5, r0, r4)
            X.4aj r3 = X.C88574aj.A00(r3, r1)
            r1.A05(r3)
        L_0x05c1:
            X.0ee r4 = new X.0ee
            r4.<init>(r5)
            X.4aj r3 = new X.4aj
            r3.<init>(r4, r1)
            r1.A05(r3)
            goto L_0x09a2
        L_0x05d0:
            r1 = 13335(0x3417, float:1.8686E-41)
            if (r6 != r1) goto L_0x05f2
            int r1 = r0.A00
            long r3 = (long) r1
            X.3Ty r1 = new X.3Ty
            r1.<init>(r3)
            r3 = 40
            X.0q1 r4 = r0.A0H(r3)
            if (r4 == 0) goto L_0x09a2
            X.0ed r3 = new X.0ed
            r3.<init>(r5, r0, r4)
            X.4aj r3 = X.C88574aj.A00(r3, r1)
            r1.A05(r3)
            goto L_0x09a2
        L_0x05f2:
            r1 = 13797(0x35e5, float:1.9334E-41)
            if (r6 != r1) goto L_0x0604
            int r1 = r0.A00
            long r3 = (long) r1
            boolean r7 = X.C62183Bz.A0A(r5)
            X.3Tz r1 = new X.3Tz
            r1.<init>(r5, r3, r7)
            goto L_0x09a2
        L_0x0604:
            r1 = 16229(0x3f65, float:2.2742E-41)
            if (r6 != r1) goto L_0x060e
            X.3BJ r1 = com.bloks.stdlib.components.bkcomponentsstdimplprogressbar.BKBloksComponentsStdImplProgressBarBinderUtil.createRenderUnit(r5, r0, r3)
            goto L_0x09a2
        L_0x060e:
            r1 = 13708(0x358c, float:1.9209E-41)
            if (r6 != r1) goto L_0x0618
            X.3BJ r1 = com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil.createRenderUnit(r5, r0, r3)
            goto L_0x09a2
        L_0x0618:
            r1 = 16444(0x403c, float:2.3043E-41)
            if (r6 != r1) goto L_0x0622
            X.3BJ r1 = com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil.createRenderUnit(r5, r0, r3)
            goto L_0x09a2
        L_0x0622:
            r1 = 13327(0x340f, float:1.8675E-41)
            if (r6 != r1) goto L_0x062d
            X.2ue r1 = new X.2ue
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x062d:
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2[r1] = r0
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0643:
            X.1dg r8 = r0.A0G(r1)     // Catch:{ IOException -> 0x0870 }
            boolean r7 = X.C62183Bz.A0A(r5)     // Catch:{ IOException -> 0x0870 }
            if (r8 == 0) goto L_0x0653
            r1 = 43
            boolean r7 = r8.A0P(r1, r7)     // Catch:{ IOException -> 0x0870 }
        L_0x0653:
            r1 = 49
            java.lang.String r3 = r0.A0J(r1)     // Catch:{ IOException -> 0x0870 }
            if (r3 == 0) goto L_0x069d
            int r1 = r3.hashCode()     // Catch:{ IOException -> 0x0870 }
            r4 = 0
            switch(r1) {
                case -1901805651: goto L_0x0686;
                case 3178655: goto L_0x068f;
                case 466743410: goto L_0x0678;
                default: goto L_0x0663;
            }     // Catch:{ IOException -> 0x0870 }
        L_0x0663:
            java.lang.String r1 = "unknown visibility "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0870 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0870 }
            r0.append(r3)     // Catch:{ IOException -> 0x0870 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException -> 0x0870 }
            X.40K r0 = new X.40K     // Catch:{ IOException -> 0x0870 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0870 }
            throw r0     // Catch:{ IOException -> 0x0870 }
        L_0x0678:
            java.lang.String r1 = "visible"
            boolean r1 = r3.equals(r1)     // Catch:{ IOException -> 0x0870 }
            if (r1 == 0) goto L_0x0663
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0870 }
            goto L_0x06a3
        L_0x0686:
            java.lang.String r1 = "invisible"
            boolean r1 = r3.equals(r1)     // Catch:{ IOException -> 0x0870 }
            if (r1 == 0) goto L_0x0663
            goto L_0x0698
        L_0x068f:
            java.lang.String r1 = "gone"
            boolean r1 = r3.equals(r1)     // Catch:{ IOException -> 0x0870 }
            if (r1 == 0) goto L_0x0663
            goto L_0x069a
        L_0x0698:
            r1 = 4
            goto L_0x069f
        L_0x069a:
            r1 = 8
            goto L_0x069f
        L_0x069d:
            r1 = 0
            goto L_0x06b4
        L_0x069f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0870 }
        L_0x06a3:
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0870 }
            r9 = 4
            if (r1 != r9) goto L_0x069d
            int r1 = r0.A00     // Catch:{ IOException -> 0x0870 }
            long r3 = (long) r1     // Catch:{ IOException -> 0x0870 }
            X.3Tz r1 = new X.3Tz     // Catch:{ IOException -> 0x0870 }
            r1.<init>(r5, r3, r7)     // Catch:{ IOException -> 0x0870 }
            r1.A02 = r9     // Catch:{ IOException -> 0x0870 }
        L_0x06b4:
            r4 = 40
            r3 = 1
            boolean r3 = r0.A0P(r4, r3)     // Catch:{ IOException -> 0x0870 }
            if (r3 != 0) goto L_0x06ca
            if (r1 != 0) goto L_0x06c7
            int r1 = r0.A00     // Catch:{ IOException -> 0x0870 }
            long r3 = (long) r1     // Catch:{ IOException -> 0x0870 }
            X.3Tz r1 = new X.3Tz     // Catch:{ IOException -> 0x0870 }
            r1.<init>(r5, r3, r7)     // Catch:{ IOException -> 0x0870 }
        L_0x06c7:
            r3 = 0
            r1.A09 = r3     // Catch:{ IOException -> 0x0870 }
        L_0x06ca:
            r3 = 45
            X.0q1 r9 = r0.A0H(r3)     // Catch:{ IOException -> 0x0870 }
            if (r9 == 0) goto L_0x06e4
            if (r1 != 0) goto L_0x06dc
            int r1 = r0.A00     // Catch:{ IOException -> 0x0870 }
            long r3 = (long) r1     // Catch:{ IOException -> 0x0870 }
            X.3Tz r1 = new X.3Tz     // Catch:{ IOException -> 0x0870 }
            r1.<init>(r5, r3, r7)     // Catch:{ IOException -> 0x0870 }
        L_0x06dc:
            r4 = 0
            com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1 r3 = new com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1     // Catch:{ IOException -> 0x0870 }
            r3.<init>((X.C14990q7) r5, (X.C31201dg) r0, (X.C14930q1) r9, (int) r4)     // Catch:{ IOException -> 0x0870 }
            r1.A06 = r3     // Catch:{ IOException -> 0x0870 }
        L_0x06e4:
            if (r8 == 0) goto L_0x07aa
            if (r1 != 0) goto L_0x06f0
            int r1 = r0.A00     // Catch:{ IOException -> 0x0870 }
            long r3 = (long) r1     // Catch:{ IOException -> 0x0870 }
            X.3Tz r1 = new X.3Tz     // Catch:{ IOException -> 0x0870 }
            r1.<init>(r5, r3, r7)     // Catch:{ IOException -> 0x0870 }
        L_0x06f0:
            r1.A07 = r8     // Catch:{ IOException -> 0x0870 }
            r3 = 35
            X.1dg r13 = r8.A0G(r3)     // Catch:{ IOException -> 0x0870 }
            X.0q7 r10 = r1.A0A     // Catch:{ IOException -> 0x0870 }
            r9 = 0
            r4 = 0
            if (r13 == 0) goto L_0x0751
            X.4da r3 = X.C90154da.A00()     // Catch:{ IOException -> 0x0870 }
            X.1Bi r8 = r3.A06     // Catch:{ IOException -> 0x0870 }
            X.1dg r3 = r1.A07     // Catch:{ IOException -> 0x0870 }
            android.graphics.drawable.Drawable r8 = r8.A01(r10, r13, r3)     // Catch:{ IOException -> 0x0870 }
            X.4da r3 = X.C90154da.A00()     // Catch:{ IOException -> 0x0870 }
            X.1Bi r3 = r3.A06     // Catch:{ IOException -> 0x0870 }
            boolean r3 = r3 instanceof X.AnonymousClass1Bh     // Catch:{ IOException -> 0x0870 }
            if (r3 == 0) goto L_0x074f
            int r11 = r13.A01     // Catch:{ IOException -> 0x0870 }
            r3 = 13761(0x35c1, float:1.9283E-41)
            if (r11 != r3) goto L_0x074f
            r11 = 40
            r3 = 1
            boolean r15 = r13.A0P(r11, r3)     // Catch:{ IOException -> 0x0870 }
        L_0x0721:
            X.1dg r11 = r1.A07     // Catch:{ IOException -> 0x0870 }
            r3 = 49
            X.1dg r13 = r11.A0G(r3)     // Catch:{ IOException -> 0x0870 }
            if (r13 == 0) goto L_0x0756
            X.4da r3 = X.C90154da.A00()     // Catch:{ IOException -> 0x0870 }
            X.1Bi r9 = r3.A06     // Catch:{ IOException -> 0x0870 }
            X.1dg r3 = r1.A07     // Catch:{ IOException -> 0x0870 }
            android.graphics.drawable.Drawable r9 = r9.A01(r10, r13, r3)     // Catch:{ IOException -> 0x0870 }
            X.4da r3 = X.C90154da.A00()     // Catch:{ IOException -> 0x0870 }
            X.1Bi r3 = r3.A06     // Catch:{ IOException -> 0x0870 }
            boolean r3 = r3 instanceof X.AnonymousClass1Bh     // Catch:{ IOException -> 0x0870 }
            if (r3 == 0) goto L_0x0754
            int r11 = r13.A01     // Catch:{ IOException -> 0x0870 }
            r3 = 13761(0x35c1, float:1.9283E-41)
            if (r11 != r3) goto L_0x0754
            r11 = 40
            r3 = 1
            boolean r3 = r13.A0P(r11, r3)     // Catch:{ IOException -> 0x0870 }
            goto L_0x0755
        L_0x074f:
            r15 = 0
            goto L_0x0721
        L_0x0751:
            r8 = r9
            r15 = 0
            goto L_0x0721
        L_0x0754:
            r3 = 0
        L_0x0755:
            r15 = r15 | r3
        L_0x0756:
            if (r8 != 0) goto L_0x07a1
            X.1dg r11 = r1.A07     // Catch:{ 40K -> 0x079b }
            r3 = 43
            boolean r3 = r11.A0P(r3, r4)     // Catch:{ 40K -> 0x079b }
            r14 = 1
            r13 = 0
            if (r3 != 0) goto L_0x0765
            r13 = 1
        L_0x0765:
            X.1dg r11 = r1.A07     // Catch:{ 40K -> 0x079b }
            r3 = 46
            java.lang.String r3 = r11.A0J(r3)     // Catch:{ 40K -> 0x079b }
            r11 = 0
            if (r3 != 0) goto L_0x0771
            goto L_0x0776
        L_0x0771:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x079b }
            goto L_0x0777
        L_0x0776:
            r3 = 0
        L_0x0777:
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x077c
            r14 = 0
        L_0x077c:
            if (r13 != 0) goto L_0x0780
            if (r14 == 0) goto L_0x07a1
        L_0x0780:
            X.1dg r11 = r1.A07     // Catch:{ 40K -> 0x079b }
            r3 = 40
            java.lang.String r3 = r11.A0J(r3)     // Catch:{ 40K -> 0x079b }
            if (r3 != 0) goto L_0x078b
            goto L_0x0790
        L_0x078b:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x079b }
            goto L_0x0791
        L_0x0790:
            r3 = 0
        L_0x0791:
            int r3 = (int) r3     // Catch:{ 40K -> 0x079b }
            if (r3 == 0) goto L_0x07a1
            X.1dg r3 = r1.A07     // Catch:{ 40K -> 0x079b }
            X.2nR r8 = X.C61833Ao.A01(r10, r3, r4)     // Catch:{ 40K -> 0x079b }
            goto L_0x07a1
        L_0x079b:
            r4 = move-exception
            java.lang.String r3 = "HostWithDecoratorRenderUnit"
            X.C29691b2.A02(r3, r4)     // Catch:{ IOException -> 0x0870 }
        L_0x07a1:
            r1.A04 = r8     // Catch:{ IOException -> 0x0870 }
            r1.A05 = r9     // Catch:{ IOException -> 0x0870 }
            if (r15 == 0) goto L_0x07aa
            r3 = 2
            r1.A01 = r3     // Catch:{ IOException -> 0x0870 }
        L_0x07aa:
            java.util.List r13 = r0.A0L()     // Catch:{ IOException -> 0x0870 }
            r8 = 0
            r11 = 0
        L_0x07b0:
            int r3 = r13.size()     // Catch:{ IOException -> 0x0870 }
            if (r11 >= r3) goto L_0x0855
            java.lang.Object r9 = r13.get(r11)     // Catch:{ IOException -> 0x0870 }
            X.1dg r9 = (X.C31201dg) r9     // Catch:{ IOException -> 0x0870 }
            r3 = 132(0x84, float:1.85E-43)
            X.1dg r10 = r9.A0G(r3)     // Catch:{ IOException -> 0x0870 }
            if (r10 == 0) goto L_0x0851
            int r4 = r10.A01     // Catch:{ IOException -> 0x0870 }
            r3 = 13368(0x3438, float:1.8733E-41)
            if (r4 != r3) goto L_0x0851
            r3 = 75
            X.1dg r4 = r10.A0G(r3)     // Catch:{ IOException -> 0x0870 }
            if (r4 == 0) goto L_0x0851
            if (r8 != 0) goto L_0x07d9
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ IOException -> 0x0870 }
            r8.<init>()     // Catch:{ IOException -> 0x0870 }
        L_0x07d9:
            X.4O4 r10 = new X.4O4     // Catch:{ IOException -> 0x0870 }
            r10.<init>()     // Catch:{ IOException -> 0x0870 }
            int r3 = r9.A00     // Catch:{ IOException -> 0x0870 }
            r10.A06 = r3     // Catch:{ IOException -> 0x0870 }
            r3 = 42
            java.lang.String r3 = r4.A0J(r3)     // Catch:{ 40K -> 0x0843 }
            if (r3 != 0) goto L_0x07ec
            r3 = 1
            goto L_0x07f0
        L_0x07ec:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0843 }
        L_0x07f0:
            r10.A05 = r3     // Catch:{ 40K -> 0x0843 }
            r3 = 35
            java.lang.String r3 = r4.A0J(r3)     // Catch:{ 40K -> 0x0843 }
            if (r3 != 0) goto L_0x07fc
            r3 = 1
            goto L_0x0800
        L_0x07fc:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0843 }
        L_0x0800:
            r10.A00 = r3     // Catch:{ 40K -> 0x0843 }
            r3 = 41
            java.lang.String r3 = r4.A0J(r3)     // Catch:{ 40K -> 0x0843 }
            if (r3 != 0) goto L_0x080c
            r3 = 1
            goto L_0x0810
        L_0x080c:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0843 }
        L_0x0810:
            r10.A04 = r3     // Catch:{ 40K -> 0x0843 }
            r3 = 36
            java.lang.String r3 = r4.A0J(r3)     // Catch:{ 40K -> 0x0843 }
            if (r3 != 0) goto L_0x081c
            r3 = 1
            goto L_0x0820
        L_0x081c:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0843 }
        L_0x0820:
            r10.A01 = r3     // Catch:{ 40K -> 0x0843 }
            r3 = 38
            java.lang.String r3 = r4.A0J(r3)     // Catch:{ 40K -> 0x0843 }
            if (r3 != 0) goto L_0x082c
            r3 = 1
            goto L_0x0830
        L_0x082c:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0843 }
        L_0x0830:
            r10.A02 = r3     // Catch:{ 40K -> 0x0843 }
            r3 = 40
            java.lang.String r3 = r4.A0J(r3)     // Catch:{ 40K -> 0x0843 }
            if (r3 != 0) goto L_0x083c
            r3 = 1
            goto L_0x0840
        L_0x083c:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x0843 }
        L_0x0840:
            r10.A03 = r3     // Catch:{ 40K -> 0x0843 }
            goto L_0x084e
        L_0x0843:
            r9 = move-exception
            java.lang.String r4 = "FlexboxBinderUtils"
            java.lang.String r3 = "Error parsing touch expansion property"
            X.C29691b2.A00(r4, r3)     // Catch:{ IOException -> 0x0870 }
            r9.printStackTrace()     // Catch:{ IOException -> 0x0870 }
        L_0x084e:
            r8.add(r10)     // Catch:{ IOException -> 0x0870 }
        L_0x0851:
            int r11 = r11 + 1
            goto L_0x07b0
        L_0x0855:
            if (r8 == 0) goto L_0x09a2
            if (r1 != 0) goto L_0x0861
            int r1 = r0.A00     // Catch:{ IOException -> 0x0870 }
            long r3 = (long) r1     // Catch:{ IOException -> 0x0870 }
            X.3Tz r1 = new X.3Tz     // Catch:{ IOException -> 0x0870 }
            r1.<init>(r5, r3, r7)     // Catch:{ IOException -> 0x0870 }
        L_0x0861:
            X.4nf r4 = new X.4nf     // Catch:{ IOException -> 0x0870 }
            r4.<init>(r8)     // Catch:{ IOException -> 0x0870 }
            X.4aj r3 = new X.4aj     // Catch:{ IOException -> 0x0870 }
            r3.<init>(r4, r8)     // Catch:{ IOException -> 0x0870 }
            r1.A05(r3)     // Catch:{ IOException -> 0x0870 }
            goto L_0x09a2
        L_0x0870:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0877:
            X.1JW r3 = r4.A01
            X.3ff r1 = new X.3ff
            r1.<init>(r5, r0, r3)
            goto L_0x09a2
        L_0x0880:
            X.1JW r3 = r4.A01
            X.3fd r1 = new X.3fd
            r1.<init>(r5, r0, r3)
            goto L_0x09a2
        L_0x0889:
            X.1JW r3 = r4.A01
            X.2ud r1 = new X.2ud
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x0892:
            X.1JW r3 = r4.A01
            X.2uf r1 = new X.2uf
            r1.<init>(r5, r0, r3)
            goto L_0x09a2
        L_0x089b:
            X.1JW r3 = r4.A01
            X.2ub r1 = new X.2ub
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x08a4:
            X.1JW r3 = r4.A01
            X.3fg r1 = new X.3fg
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x08ad:
            X.1JW r3 = r4.A01
            X.2ug r1 = new X.2ug
            r1.<init>(r5, r0, r3)
            goto L_0x09a2
        L_0x08b6:
            X.1JX r3 = r4.A00
            X.3fj r1 = new X.3fj
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x08bf:
            X.1JW r3 = r4.A01
            X.3fe r1 = new X.3fe
            r1.<init>(r5, r0, r3)
            goto L_0x09a2
        L_0x08c8:
            X.1JX r1 = r4.A00
            X.0ko r3 = r1.AKA()
            X.0Iy r1 = new X.0Iy
            r1.<init>(r3, r5, r0)
            goto L_0x09a2
        L_0x08d5:
            X.3fb r1 = new X.3fb
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x08dc:
            X.1JW r3 = r4.A01
            X.3fc r1 = new X.3fc
            r1.<init>(r5, r0, r3)
            goto L_0x09a2
        L_0x08e5:
            r3 = 2131362665(0x7f0a0369, float:1.8345117E38)
            android.util.SparseArray r1 = r5.A01
            java.lang.Object r8 = r1.get(r3)
            X.0Pd r8 = (X.C05070Pd) r8
            if (r8 != 0) goto L_0x0912
            java.lang.String r3 = "CDSBottomSheetWrapperBinderUtils"
            java.lang.String r1 = "Rendering a bk.cds.bottomsheet.Wrapper outside of a CDS bottom sheet. The header will not render properly."
            X.C29691b2.A00(r3, r1)
            goto L_0x090f
        L_0x08fa:
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r3 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r4[r3] = r1
            java.lang.String r1 = "Attempting to createRenderUnit for unrecognized component style id %s"
            java.lang.String r3 = java.lang.String.format(r1, r4)
            java.lang.String r1 = "ComponentMapper"
            X.C29691b2.A00(r1, r3)
        L_0x090f:
            r1 = 0
            goto L_0x09a2
        L_0x0912:
            int r1 = r0.A00
            long r3 = (long) r1
            boolean r7 = X.C62183Bz.A0A(r5)
            X.3Tz r1 = new X.3Tz
            r1.<init>(r5, r3, r7)
            X.0eg r4 = new X.0eg
            r4.<init>(r8)
            X.4aj r3 = new X.4aj
            r3.<init>(r4, r0)
            r1.A05(r3)
            goto L_0x09a2
        L_0x092c:
            X.3fa r1 = new X.3fa
            r1.<init>(r5, r0)
            goto L_0x09a2
        L_0x0932:
            X.1JW r3 = r4.A01
            X.3fi r1 = new X.3fi
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x093a:
            X.1JW r3 = r4.A01
            X.3fk r1 = new X.3fk
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x0942:
            X.1JW r3 = r4.A01
            X.3fh r1 = new X.3fh
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x094a:
            X.1JW r3 = r4.A01
            X.2uc r1 = new X.2uc
            r1.<init>(r5, r0, r0, r3)
            goto L_0x09a2
        L_0x0952:
            r7 = move-exception
            java.lang.String r4 = "CollectionBinderUtils"
            java.lang.String r3 = "Invalid dimension for fading edge length"
            X.C29691b2.A01(r4, r3, r7)
        L_0x095a:
            r1.A01 = r10
            r4 = 66
            r3 = -1
            int r3 = r0.A0A(r4, r3)
            r1.A04 = r3
            r3 = 95
            boolean r3 = r0.A0P(r3, r11)
            r1.A0D = r3
            r3 = 98
            boolean r3 = r0.A0P(r3, r11)
            r1.A0C = r3
            X.4Oi r7 = r8.A03
            X.4CG r3 = new X.4CG
            r3.<init>(r5)
            X.3Dw r4 = new X.3Dw
            r4.<init>(r3, r7)
            X.4aj r3 = new X.4aj
            r3.<init>(r4, r1)
            r1.A05(r3)
            r3 = 65
            java.lang.String r4 = r0.A0J(r3)
            if (r4 == 0) goto L_0x09a2
            java.lang.String r3 = "on_drag"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x09a2
            r4 = 0
            com.facebook.redex.IDxSListenerShape34S0100000_2_I0 r3 = new com.facebook.redex.IDxSListenerShape34S0100000_2_I0
            r3.<init>(r5, r4)
            r1.A07(r3)
        L_0x09a2:
            r3 = 136(0x88, float:1.9E-43)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.A08(r3, r7)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x09e9
            r3 = 137(0x89, float:1.92E-43)
            float r3 = r0.A08(r3, r7)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x09e9
            r3 = 138(0x8a, float:1.93E-43)
            r4 = 0
            float r3 = r0.A08(r3, r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x09e9
            r3 = 141(0x8d, float:1.98E-43)
            float r3 = r0.A08(r3, r7)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x09e9
            r3 = 144(0x90, float:2.02E-43)
            float r3 = r0.A08(r3, r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x09e9
            r3 = 145(0x91, float:2.03E-43)
            float r3 = r0.A08(r3, r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x09e9
            if (r1 == 0) goto L_0x09fa
            X.416 r4 = r1.A04
            X.416 r3 = X.AnonymousClass416.A01
            if (r4 != r3) goto L_0x09fa
        L_0x09e9:
            X.3BJ r1 = r0.A0E(r1, r5)
            X.4ng r4 = new X.4ng
            r4.<init>(r0)
            X.4aj r3 = new X.4aj
            r3.<init>(r4, r1)
            r1.A05(r3)
        L_0x09fa:
            r3 = 133(0x85, float:1.86E-43)
            java.util.List r4 = r0.A0N(r3)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0a1e
            r3 = 0
            if (r1 != 0) goto L_0x0a0d
            X.3BJ r1 = r0.A0E(r3, r5)
        L_0x0a0d:
            java.util.List r3 = java.util.Collections.unmodifiableList(r4)
            X.4nl r4 = new X.4nl
            r4.<init>(r5, r0, r3)
            X.4aj r3 = new X.4aj
            r3.<init>(r4, r1)
            r1.A05(r3)
        L_0x0a1e:
            r3 = 13323(0x340b, float:1.867E-41)
            if (r6 == r3) goto L_0x2093
            r3 = 13889(0x3641, float:1.9463E-41)
            if (r6 == r3) goto L_0x1945
            r3 = 13948(0x367c, float:1.9545E-41)
            if (r6 == r3) goto L_0x18f5
            r3 = 14005(0x36b5, float:1.9625E-41)
            if (r6 == r3) goto L_0x18e7
            r3 = 14093(0x370d, float:1.9748E-41)
            if (r6 == r3) goto L_0x187c
            r3 = 15763(0x3d93, float:2.2089E-41)
            if (r6 == r3) goto L_0x1824
            r3 = 15972(0x3e64, float:2.2382E-41)
            if (r6 == r3) goto L_0x18e7
            r3 = 15981(0x3e6d, float:2.2394E-41)
            if (r6 == r3) goto L_0x1813
            r3 = 16094(0x3ede, float:2.2552E-41)
            if (r6 == r3) goto L_0x17e6
            switch(r6) {
                case 13496: goto L_0x1919;
                case 13497: goto L_0x17e6;
                case 13498: goto L_0x1799;
                case 13499: goto L_0x178c;
                default: goto L_0x0a45;
            }
        L_0x0a45:
            switch(r6) {
                case 13501: goto L_0x175b;
                case 13502: goto L_0x16f4;
                case 13503: goto L_0x1723;
                case 13504: goto L_0x16c5;
                default: goto L_0x0a48;
            }
        L_0x0a48:
            boolean r3 = X.C806344w.A00(r6)
            if (r3 == 0) goto L_0x19a0
            r3 = 13317(0x3405, float:1.8661E-41)
            if (r6 != r3) goto L_0x146a
            r4 = 2
            X.C18450wi.A0H(r1, r4)
            X.41R r3 = X.C806745a.A00(r0)
            int r3 = r3.ordinal()
            switch(r3) {
                case 0: goto L_0x0d65;
                case 1: goto L_0x1042;
                default: goto L_0x0a61;
            }
        L_0x0a61:
            r10 = 0
            r9 = 1
            X.3AG r3 = X.AnonymousClass3AG.A00
            android.content.Context r4 = r2.A02
            X.C18450wi.A0B(r4)
            X.4Nh r6 = r3.A00(r4, r0)
            int r3 = r6.A01
            r27 = r3
            int r3 = r6.A02
            r26 = r3
            android.graphics.Rect r8 = r6.A04
            int r12 = r6.A00
            int r3 = r6.A03
            r17 = r3
            boolean r25 = X.C806945c.A00(r4)
            java.util.List r3 = r0.A0L()
            int r4 = r3.size()
            java.util.ArrayList r24 = new java.util.ArrayList
            r3 = r24
            r3.<init>(r4)
            X.38i r23 = new X.38i
            r3 = r23
            r3.<init>(r2, r0)
            int r4 = android.view.View.MeasureSpec.getSize(r41)
            int r2 = r8.left
            int r4 = r4 - r2
            int r2 = r8.right
            int r4 = r4 - r2
            int r3 = android.view.View.MeasureSpec.getSize(r40)
            int r2 = r8.top
            int r3 = r3 - r2
            int r2 = r8.bottom
            int r3 = r3 - r2
            r2 = r27
            if (r2 == r9) goto L_0x0ab1
            r4 = r3
        L_0x0ab1:
            r2 = r26
            int[] r2 = new int[r2]
            r22 = r2
            int r7 = r4 / r26
            int r4 = r4 % r26
            r6 = 0
            r3 = 0
        L_0x0abd:
            r2 = r26
            if (r6 >= r2) goto L_0x0ad3
            int r3 = r3 + r4
            if (r3 <= 0) goto L_0x0ad1
            int r2 = r26 - r3
            if (r2 >= r4) goto L_0x0ad1
            int r2 = r7 + 1
            int r3 = r3 - r26
        L_0x0acc:
            r22[r6] = r2
            int r6 = r6 + 1
            goto L_0x0abd
        L_0x0ad1:
            r2 = r7
            goto L_0x0acc
        L_0x0ad3:
            r11 = r17
            r2 = r27
            if (r2 != r9) goto L_0x0ada
            r11 = r12
        L_0x0ada:
            r2 = r26
            android.graphics.Rect[] r2 = new android.graphics.Rect[r2]
            r21 = r2
            r4 = 0
            r3 = 0
        L_0x0ae2:
            r2 = r26
            if (r3 >= r2) goto L_0x0af0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r21[r3] = r2
            int r3 = r3 + 1
            goto L_0x0ae2
        L_0x0af0:
            if (r11 == 0) goto L_0x0b21
            double r6 = (double) r11
            double r2 = (double) r2
            double r6 = r6 / r2
        L_0x0af5:
            r2 = r26
            if (r4 >= r2) goto L_0x0b21
            double r2 = (double) r4
            double r2 = r2 * r6
            int r14 = A01(r2)
            int r13 = r4 + 1
            double r2 = (double) r13
            double r2 = r2 * r6
            int r2 = A01(r2)
            int r3 = r11 - r2
            r4 = r21[r4]
            r2 = r27
            if (r2 != r9) goto L_0x0b1c
            if (r25 != 0) goto L_0x0b17
            r4.left = r14
            r4.right = r3
        L_0x0b15:
            r4 = r13
            goto L_0x0af5
        L_0x0b17:
            r4.left = r3
            r4.right = r14
            goto L_0x0b15
        L_0x0b1c:
            r4.top = r14
            r4.bottom = r3
            goto L_0x0b15
        L_0x0b21:
            int r15 = r12 >> 1
            r2 = r27
            if (r2 != r9) goto L_0x0b29
            int r15 = r17 >> 1
        L_0x0b29:
            r2 = r26
            X.4Gm[] r14 = new X.C83394Gm[r2]
            r3 = 0
        L_0x0b2e:
            r2 = r26
            if (r3 >= r2) goto L_0x0b3c
            X.4Gm r2 = new X.4Gm
            r2.<init>()
            r14[r3] = r2
            int r3 = r3 + 1
            goto L_0x0b2e
        L_0x0b3c:
            java.util.List r2 = r0.A0L()
            int r2 = r2.size()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
            java.util.List r2 = r0.A0L()
            X.C18450wi.A0B(r2)
            java.util.Iterator r20 = r2.iterator()
            r12 = 0
        L_0x0b55:
            boolean r2 = r20.hasNext()
            if (r2 == 0) goto L_0x0d38
            java.lang.Object r11 = r20.next()
            int r19 = r12 + 1
            if (r12 >= 0) goto L_0x0b6e
            X.AnonymousClass1JA.A0T()
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0b6e:
            X.1dg r11 = (X.C31201dg) r11
            X.C18450wi.A09(r11)
            r2 = 132(0x84, float:1.85E-43)
            X.1dg r4 = r11.A0G(r2)
            r18 = 0
            if (r4 == 0) goto L_0x0c19
            int r3 = r4.A01
            r2 = 16482(0x4062, float:2.3096E-41)
            if (r3 != r2) goto L_0x0c19
            r2 = 36
            boolean r18 = r4.A0P(r2, r10)
            if (r18 == 0) goto L_0x0c19
            X.5Ej r3 = new X.5Ej
            r3.<init>(r14)
            X.558 r2 = new X.558
            r2.<init>(r3)
            java.util.Iterator r7 = r2.iterator()
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0c59
            java.lang.Object r4 = r7.next()
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0bc9
            r2 = r4
            X.4Vu r2 = (X.C87194Vu) r2
            java.lang.Object r2 = r2.A01
            X.4Gm r2 = (X.C83394Gm) r2
            int r3 = r2.A00
        L_0x0bb2:
            java.lang.Object r6 = r7.next()
            r2 = r6
            X.4Vu r2 = (X.C87194Vu) r2
            java.lang.Object r2 = r2.A01
            X.4Gm r2 = (X.C83394Gm) r2
            int r2 = r2.A00
            if (r3 >= r2) goto L_0x0bc3
            r3 = r2
            r4 = r6
        L_0x0bc3:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x0bb2
        L_0x0bc9:
            X.4Vu r4 = (X.C87194Vu) r4
            if (r4 == 0) goto L_0x0d32
            int r7 = r4.A00
            if (r18 == 0) goto L_0x0c11
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
        L_0x0bd6:
            r13.add(r6)
            r2 = 132(0x84, float:1.85E-43)
            X.1dg r4 = r11.A0G(r2)
            r17 = 0
            if (r4 == 0) goto L_0x0c03
            int r3 = r4.A01
            r2 = 16482(0x4062, float:2.3096E-41)
            if (r3 != r2) goto L_0x0c03
            r2 = 35
            android.util.SparseArray r3 = r4.A02
            java.lang.Object r3 = r3.get(r2)
            if (r3 == 0) goto L_0x0c03
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0c03
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0c03
            float r2 = r3.floatValue()
            java.lang.Float r17 = java.lang.Float.valueOf(r2)
        L_0x0c03:
            if (r18 == 0) goto L_0x0c5c
            r4 = 0
            r3 = 0
        L_0x0c07:
            r2 = r26
            if (r4 >= r2) goto L_0x0c5e
            r2 = r22[r4]
            int r4 = r4 + 1
            int r3 = r3 + r2
            goto L_0x0c07
        L_0x0c11:
            r2 = r21[r7]
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r2)
            goto L_0x0bd6
        L_0x0c19:
            X.5Ej r3 = new X.5Ej
            r3.<init>(r14)
            X.558 r2 = new X.558
            r2.<init>(r3)
            java.util.Iterator r7 = r2.iterator()
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0c59
            java.lang.Object r4 = r7.next()
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0bc9
            r2 = r4
            X.4Vu r2 = (X.C87194Vu) r2
            java.lang.Object r2 = r2.A01
            X.4Gm r2 = (X.C83394Gm) r2
            int r3 = r2.A00
        L_0x0c40:
            java.lang.Object r6 = r7.next()
            r2 = r6
            X.4Vu r2 = (X.C87194Vu) r2
            java.lang.Object r2 = r2.A01
            X.4Gm r2 = (X.C83394Gm) r2
            int r2 = r2.A00
            if (r3 <= r2) goto L_0x0c51
            r3 = r2
            r4 = r6
        L_0x0c51:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x0c40
            goto L_0x0bc9
        L_0x0c59:
            r4 = 0
            goto L_0x0bc9
        L_0x0c5c:
            r3 = r22[r7]
        L_0x0c5e:
            r2 = r27
            if (r2 != r9) goto L_0x0cfa
            int r2 = r6.left
            int r3 = r3 - r2
            int r2 = r6.right
        L_0x0c67:
            int r3 = r3 - r2
            if (r17 == 0) goto L_0x0cf5
            if (r18 != 0) goto L_0x0cf5
            float r4 = (float) r3
            float r2 = r17.floatValue()
            float r4 = r4 * r2
            int r4 = (int) r4
            r2 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L_0x0c79:
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r3 = r2
            if (r27 != 0) goto L_0x0c84
            r3 = r6
            r6 = r2
        L_0x0c84:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            X.1Jq r3 = new X.1Jq
            r3.<init>(r4, r2)
            java.lang.Object r2 = r3.first
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            java.lang.Object r2 = r3.second
            java.lang.Number r2 = (java.lang.Number) r2
            int r3 = r2.intValue()
            r2 = r23
            X.4Gj r3 = r2.A00(r11, r4, r3)
            r2 = r24
            r2.add(r3)
            X.38o r2 = r3.A00
            X.4dK r2 = r2.A00()
            X.3AI r2 = r2.A02
            r3 = r27
            com.facebook.rendercore.RenderTreeNode r2 = r2.A03
            android.graphics.Rect r2 = r2.A04
            if (r3 != r9) goto L_0x0cf0
            int r2 = r2.height()
        L_0x0cc0:
            r4 = r14[r7]
            int r3 = r4.A00
            int r3 = r3 + r2
            X.4CK r2 = r4.A01
            if (r2 == 0) goto L_0x0d0d
            int r2 = r15 << 1
            int r3 = r3 + r2
            r6 = 0
        L_0x0ccd:
            r2 = r26
            if (r6 >= r2) goto L_0x0d01
            r2 = r14[r6]
            X.4CK r2 = r2.A01
            if (r2 == 0) goto L_0x0ce5
            int r2 = r2.A00
            java.lang.Object r7 = r13.get(r2)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            r2 = r27
            if (r2 != r9) goto L_0x0ce8
            r7.bottom = r15
        L_0x0ce5:
            int r6 = r6 + 1
            goto L_0x0ccd
        L_0x0ce8:
            if (r25 != 0) goto L_0x0ced
            r7.right = r15
            goto L_0x0ce5
        L_0x0ced:
            r7.left = r15
            goto L_0x0ce5
        L_0x0cf0:
            int r2 = r2.width()
            goto L_0x0cc0
        L_0x0cf5:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)
            goto L_0x0c79
        L_0x0cfa:
            int r2 = r6.top
            int r3 = r3 - r2
            int r2 = r6.bottom
            goto L_0x0c67
        L_0x0d01:
            java.lang.Object r6 = r13.get(r12)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            r2 = r27
            if (r2 != r9) goto L_0x0d22
            r6.top = r15
        L_0x0d0d:
            X.4CK r6 = new X.4CK
            r6.<init>(r12)
            if (r18 == 0) goto L_0x0d2a
            r4 = 0
        L_0x0d15:
            r2 = r26
            if (r4 >= r2) goto L_0x0d2e
            r2 = r14[r4]
            r2.A01 = r6
            r2.A00 = r3
            int r4 = r4 + 1
            goto L_0x0d15
        L_0x0d22:
            if (r25 != 0) goto L_0x0d27
            r6.left = r15
            goto L_0x0d0d
        L_0x0d27:
            r6.right = r15
            goto L_0x0d0d
        L_0x0d2a:
            r4.A01 = r6
            r4.A00 = r3
        L_0x0d2e:
            r12 = r19
            goto L_0x0b55
        L_0x0d32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0d38:
            if (r5 == 0) goto L_0x0d45
            java.lang.Object r2 = X.C62183Bz.A05(r5, r0)
            X.C18450wi.A0B(r2)
            X.39I r2 = (X.AnonymousClass39I) r2
            r2.A07 = r13
        L_0x0d45:
            int r6 = android.view.View.MeasureSpec.getMode(r41)
            int r5 = android.view.View.MeasureSpec.getMode(r40)
            r2 = r27
            if (r2 != r9) goto L_0x0d5b
            if (r6 != 0) goto L_0x20b7
            java.lang.String r1 = "StaggeredGridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d5b:
            if (r5 != 0) goto L_0x20b7
            java.lang.String r1 = "StaggeredGridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d65:
            r13 = 0
            r12 = 1
            int r5 = X.C806845b.A00(r0)
            java.util.List r6 = r0.A0L()
            X.38i r27 = new X.38i
            r3 = r27
            r3.<init>(r2, r0)
            java.util.List r2 = r0.A0L()
            int r2 = r2.size()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r2)
            X.C18450wi.A0B(r6)
            java.util.Iterator r15 = r6.iterator()
        L_0x0d8a:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0e6e
            java.lang.Object r6 = r15.next()
            X.1dg r6 = (X.C31201dg) r6
            X.C18450wi.A09(r6)
            int r9 = android.view.View.MeasureSpec.getSize(r41)
            if (r5 != r12) goto L_0x0e68
            if (r9 == 0) goto L_0x0e68
            r2 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r2)
        L_0x0da7:
            r2 = 132(0x84, float:1.85E-43)
            X.1dg r8 = r6.A0G(r2)
            if (r8 == 0) goto L_0x0df8
            int r3 = r8.A01
            r2 = 13366(0x3436, float:1.873E-41)
            if (r3 != r2) goto L_0x0df8
            r2 = 41
            java.lang.String r8 = r8.A0J(r2)
            if (r5 != 0) goto L_0x0df8
            if (r8 == 0) goto L_0x0df8
            X.4at r2 = X.C62163Bx.A0B(r8)     // Catch:{ 40K -> 0x0de5 }
            float r3 = r2.A00     // Catch:{ 40K -> 0x0de5 }
            X.41V r2 = r2.A01     // Catch:{ 40K -> 0x0de5 }
            int r2 = r2.ordinal()     // Catch:{ 40K -> 0x0de5 }
            switch(r2) {
                case 0: goto L_0x0dcf;
                case 1: goto L_0x0dd7;
                default: goto L_0x0dce;
            }     // Catch:{ 40K -> 0x0de5 }
        L_0x0dce:
            goto L_0x0df8
        L_0x0dcf:
            int r3 = (int) r3     // Catch:{ 40K -> 0x0de5 }
            r2 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)     // Catch:{ 40K -> 0x0de5 }
            goto L_0x0df8
        L_0x0dd7:
            float r2 = (float) r9     // Catch:{ 40K -> 0x0de5 }
            float r3 = r3 * r2
            double r2 = (double) r3     // Catch:{ 40K -> 0x0de5 }
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r9
            int r9 = (int) r2     // Catch:{ 40K -> 0x0de5 }
            r2 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r2)     // Catch:{ 40K -> 0x0de5 }
            goto L_0x0df8
        L_0x0de5:
            java.lang.String r3 = "Error parsing style width: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "ListCollectionMeasureHelper"
            X.C29691b2.A00(r2, r3)
        L_0x0df8:
            int r10 = android.view.View.MeasureSpec.getSize(r40)
            if (r5 == r12) goto L_0x0e1f
            if (r10 == 0) goto L_0x0e1f
            r2 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
        L_0x0e06:
            r2 = 132(0x84, float:1.85E-43)
            X.1dg r9 = r6.A0G(r2)
            if (r9 == 0) goto L_0x0e5d
            int r3 = r9.A01
            r2 = 13366(0x3436, float:1.873E-41)
            if (r3 != r2) goto L_0x0e5d
            r2 = 35
            java.lang.String r9 = r9.A0J(r2)
            if (r5 != r12) goto L_0x0e5d
            if (r9 == 0) goto L_0x0e5d
            goto L_0x0e24
        L_0x0e1f:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
            goto L_0x0e06
        L_0x0e24:
            X.4at r2 = X.C62163Bx.A0B(r9)     // Catch:{ 40K -> 0x0e4a }
            float r3 = r2.A00     // Catch:{ 40K -> 0x0e4a }
            X.41V r2 = r2.A01     // Catch:{ 40K -> 0x0e4a }
            int r2 = r2.ordinal()     // Catch:{ 40K -> 0x0e4a }
            switch(r2) {
                case 0: goto L_0x0e34;
                case 1: goto L_0x0e3c;
                default: goto L_0x0e33;
            }     // Catch:{ 40K -> 0x0e4a }
        L_0x0e33:
            goto L_0x0e5d
        L_0x0e34:
            int r3 = (int) r3     // Catch:{ 40K -> 0x0e4a }
            r2 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)     // Catch:{ 40K -> 0x0e4a }
            goto L_0x0e5d
        L_0x0e3c:
            float r2 = (float) r10     // Catch:{ 40K -> 0x0e4a }
            float r3 = r3 * r2
            double r2 = (double) r3     // Catch:{ 40K -> 0x0e4a }
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r10
            int r10 = (int) r2     // Catch:{ 40K -> 0x0e4a }
            r2 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)     // Catch:{ 40K -> 0x0e4a }
            goto L_0x0e5d
        L_0x0e4a:
            java.lang.String r3 = "Error parsing style height: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "ListCollectionMeasureHelper"
            X.C29691b2.A00(r2, r3)
        L_0x0e5d:
            r2 = r27
            X.4Gj r2 = r2.A00(r6, r7, r8)
            r14.add(r2)
            goto L_0x0d8a
        L_0x0e68:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
            goto L_0x0da7
        L_0x0e6e:
            r2 = 63
            boolean r2 = r0.A0P(r2, r13)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0ea7
            int r7 = android.view.View.MeasureSpec.getMode(r41)
            int r6 = android.view.View.MeasureSpec.getMode(r40)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == r2) goto L_0x0e88
            if (r7 != r3) goto L_0x0ea7
        L_0x0e88:
            if (r6 == r2) goto L_0x0e8c
            if (r6 != r3) goto L_0x0ea7
        L_0x0e8c:
            int[] r11 = new int[r4]
            int r2 = android.view.View.MeasureSpec.getSize(r41)
            r11[r13] = r2
            int r2 = android.view.View.MeasureSpec.getSize(r40)
            r11[r12] = r2
        L_0x0e9a:
            r6 = r11[r13]
            r7 = r11[r12]
            r2 = r27
            int r11 = r2.A00
            java.lang.Class<X.0rr> r10 = X.C15790rr.class
            monitor-enter(r10)
            goto L_0x0fec
        L_0x0ea7:
            r2 = 55
            java.lang.String r6 = r0.A0J(r2)     // Catch:{ 40K -> 0x103a }
            r2 = 56
            java.lang.String r7 = r0.A0J(r2)     // Catch:{ 40K -> 0x103a }
            r2 = 44
            java.lang.String r3 = r0.A0J(r2)     // Catch:{ 40K -> 0x103a }
            if (r6 != 0) goto L_0x0ebc
            goto L_0x0ec1
        L_0x0ebc:
            float r6 = X.C62163Bx.A01(r6)     // Catch:{ 40K -> 0x103a }
            goto L_0x0ec2
        L_0x0ec1:
            r6 = 0
        L_0x0ec2:
            if (r7 != 0) goto L_0x0ee2
            r2 = 0
        L_0x0ec5:
            if (r3 != 0) goto L_0x0edd
            r3 = 0
        L_0x0ec8:
            int r2 = (int) r2     // Catch:{ 40K -> 0x103a }
            r26 = r2
            int r2 = (int) r3     // Catch:{ 40K -> 0x103a }
            r25 = r2
            int r2 = (int) r6     // Catch:{ 40K -> 0x103a }
            r24 = r2
            r10 = 0
            r23 = 0
            r22 = 1
            if (r5 != 0) goto L_0x0ee7
            r23 = 1
            r22 = 0
            goto L_0x0ee7
        L_0x0edd:
            float r3 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x103a }
            goto L_0x0ec8
        L_0x0ee2:
            float r2 = X.C62163Bx.A01(r7)     // Catch:{ 40K -> 0x103a }
            goto L_0x0ec5
        L_0x0ee7:
            int r9 = android.view.View.MeasureSpec.getMode(r41)     // Catch:{ 40K -> 0x103a }
            int r8 = android.view.View.MeasureSpec.getMode(r40)     // Catch:{ 40K -> 0x103a }
            int[] r11 = new int[r4]     // Catch:{ 40K -> 0x103a }
            r11 = {-1, -1} // fill-array     // Catch:{ 40K -> 0x103a }
            int r7 = android.view.View.MeasureSpec.getSize(r41)     // Catch:{ 40K -> 0x103a }
            r2 = 1073741824(0x40000000, float:2.0)
            if (r9 != r2) goto L_0x0efe
            r11[r13] = r7     // Catch:{ 40K -> 0x103a }
        L_0x0efe:
            int r6 = android.view.View.MeasureSpec.getSize(r40)     // Catch:{ 40K -> 0x103a }
            if (r8 != r2) goto L_0x0f06
            r11[r12] = r6     // Catch:{ 40K -> 0x103a }
        L_0x0f06:
            if (r9 != r2) goto L_0x0f0b
            if (r8 != r2) goto L_0x0f0b
            goto L_0x0e9a
        L_0x0f0b:
            r21 = 0
            r20 = 0
            r19 = 0
            if (r23 == 0) goto L_0x0f19
            r21 = r26
            r20 = r25
            r19 = r24
        L_0x0f19:
            if (r22 != 0) goto L_0x0f21
            r26 = 0
            r25 = 0
            r24 = 0
        L_0x0f21:
            r5 = 0
            r18 = 0
            r4 = 0
            r3 = 0
        L_0x0f26:
            int r2 = r14.size()     // Catch:{ 40K -> 0x103a }
            if (r5 >= r2) goto L_0x0fb5
            java.lang.Object r2 = r14.get(r5)     // Catch:{ 40K -> 0x103a }
            X.4Gj r2 = (X.C83364Gj) r2     // Catch:{ 40K -> 0x103a }
            X.38o r2 = r2.A00     // Catch:{ 40K -> 0x103a }
            X.4dK r2 = r2.A00()     // Catch:{ 40K -> 0x103a }
            X.3AI r2 = r2.A02     // Catch:{ 40K -> 0x103a }
            r28 = r2
            r17 = 0
            if (r5 != 0) goto L_0x0f42
            r17 = 1
        L_0x0f42:
            int r2 = r14.size()     // Catch:{ 40K -> 0x103a }
            int r2 = r2 + -1
            r15 = 0
            if (r5 == r2) goto L_0x0f4c
            r15 = 1
        L_0x0f4c:
            r2 = r28
            com.facebook.rendercore.RenderTreeNode r2 = r2.A03     // Catch:{ 40K -> 0x103a }
            android.graphics.Rect r2 = r2.A04     // Catch:{ 40K -> 0x103a }
            int r2 = r2.width()     // Catch:{ 40K -> 0x103a }
            if (r15 == 0) goto L_0x0f5f
            if (r17 == 0) goto L_0x0f5c
            int r2 = r21 + r2
        L_0x0f5c:
            int r2 = r2 + r20
            goto L_0x0f65
        L_0x0f5f:
            if (r17 == 0) goto L_0x0f63
            int r2 = r21 + r2
        L_0x0f63:
            int r2 = r2 + r19
        L_0x0f65:
            int r10 = java.lang.Math.max(r10, r2)     // Catch:{ 40K -> 0x103a }
            int r18 = r18 + r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r2) goto L_0x0f7b
            if (r23 == 0) goto L_0x0f75
            r2 = r18
            if (r2 >= r7) goto L_0x0f79
        L_0x0f75:
            if (r22 == 0) goto L_0x0f7b
            if (r10 < r7) goto L_0x0f7b
        L_0x0f79:
            r11[r13] = r7     // Catch:{ 40K -> 0x103a }
        L_0x0f7b:
            r2 = r28
            com.facebook.rendercore.RenderTreeNode r2 = r2.A03     // Catch:{ 40K -> 0x103a }
            android.graphics.Rect r2 = r2.A04     // Catch:{ 40K -> 0x103a }
            int r2 = r2.height()     // Catch:{ 40K -> 0x103a }
            if (r15 == 0) goto L_0x0f8e
            if (r17 == 0) goto L_0x0f8b
            int r2 = r2 + r26
        L_0x0f8b:
            int r2 = r2 + r25
            goto L_0x0f94
        L_0x0f8e:
            if (r17 == 0) goto L_0x0f92
            int r2 = r2 + r26
        L_0x0f92:
            int r2 = r2 + r24
        L_0x0f94:
            int r4 = java.lang.Math.max(r4, r2)     // Catch:{ 40K -> 0x103a }
            int r3 = r3 + r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r2) goto L_0x0fa7
            if (r22 == 0) goto L_0x0fa1
            if (r3 >= r6) goto L_0x0fa5
        L_0x0fa1:
            if (r23 == 0) goto L_0x0fa7
            if (r4 < r6) goto L_0x0fa7
        L_0x0fa5:
            r11[r12] = r6     // Catch:{ 40K -> 0x103a }
        L_0x0fa7:
            r15 = r11[r13]     // Catch:{ 40K -> 0x103a }
            r2 = -1
            if (r15 <= r2) goto L_0x0fb1
            r15 = r11[r12]     // Catch:{ 40K -> 0x103a }
            if (r15 <= r2) goto L_0x0fb1
            goto L_0x0fb5
        L_0x0fb1:
            int r5 = r5 + 1
            goto L_0x0f26
        L_0x0fb5:
            if (r9 != 0) goto L_0x0fbc
            if (r23 == 0) goto L_0x0fcd
            r10 = r18
            goto L_0x0fcd
        L_0x0fbc:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r2) goto L_0x0fcf
            if (r23 == 0) goto L_0x0fc9
            r2 = r18
            int r10 = java.lang.Math.min(r2, r7)     // Catch:{ 40K -> 0x103a }
            goto L_0x0fcd
        L_0x0fc9:
            int r10 = java.lang.Math.min(r10, r7)     // Catch:{ 40K -> 0x103a }
        L_0x0fcd:
            r11[r13] = r10     // Catch:{ 40K -> 0x103a }
        L_0x0fcf:
            if (r8 != 0) goto L_0x0fd8
            if (r22 == 0) goto L_0x0fd4
            r4 = r3
        L_0x0fd4:
            r11[r12] = r4     // Catch:{ 40K -> 0x103a }
            goto L_0x0e9a
        L_0x0fd8:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r2) goto L_0x0e9a
            if (r22 == 0) goto L_0x0fdf
            goto L_0x0fe4
        L_0x0fdf:
            int r2 = java.lang.Math.min(r4, r6)     // Catch:{ 40K -> 0x103a }
            goto L_0x0fe8
        L_0x0fe4:
            int r2 = java.lang.Math.min(r3, r6)     // Catch:{ 40K -> 0x103a }
        L_0x0fe8:
            r11[r12] = r2     // Catch:{ 40K -> 0x103a }
            goto L_0x0e9a
        L_0x0fec:
            android.os.Handler r8 = X.C15790rr.A00()     // Catch:{ all -> 0x1037 }
            java.util.List r9 = X.C15790rr.A01     // Catch:{ all -> 0x1037 }
            java.util.Iterator r4 = r9.iterator()     // Catch:{ all -> 0x1037 }
        L_0x0ff6:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x1037 }
            if (r2 == 0) goto L_0x100f
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x1037 }
            com.facebook.redex.RunnableRunnableShape0S0111000_I0 r3 = (com.facebook.redex.RunnableRunnableShape0S0111000_I0) r3     // Catch:{ all -> 0x1037 }
            int r2 = r3.A00     // Catch:{ all -> 0x1037 }
            if (r2 != r11) goto L_0x0ff6
            r3.A02 = r12     // Catch:{ all -> 0x1037 }
            r8.removeCallbacksAndMessages(r3)     // Catch:{ all -> 0x1037 }
            r4.remove()     // Catch:{ all -> 0x1037 }
            goto L_0x0ff6
        L_0x100f:
            com.facebook.redex.RunnableRunnableShape0S0111000_I0 r5 = new com.facebook.redex.RunnableRunnableShape0S0111000_I0     // Catch:{ all -> 0x1037 }
            r5.<init>(r14, r11)     // Catch:{ all -> 0x1037 }
            r9.add(r5)     // Catch:{ all -> 0x1037 }
            com.facebook.redex.RunnableRunnableShape1S0100000_I0 r4 = new com.facebook.redex.RunnableRunnableShape1S0100000_I0     // Catch:{ all -> 0x1037 }
            r4.<init>((java.lang.Object) r5, (int) r12)     // Catch:{ all -> 0x1037 }
            r2 = 0
            r8.postAtTime(r4, r5, r2)     // Catch:{ all -> 0x1037 }
            monitor-exit(r10)
            X.4JP r2 = new X.4JP
            r2.<init>(r14, r6, r7)
            X.4nL r3 = new X.4nL
            r8 = r3
            r9 = r1
            r10 = r2
            r11 = r41
            r12 = r40
            r13 = r6
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x2122
        L_0x1037:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x103a:
            java.lang.String r1 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1042:
            r10 = 1
            X.3AG r4 = X.AnonymousClass3AG.A00
            android.content.Context r3 = r2.A02
            r39 = r3
            X.C18450wi.A0B(r39)
            X.4Nh r4 = r4.A00(r3, r0)
            int r3 = r4.A01
            r37 = r3
            int r3 = r4.A02
            r36 = r3
            int r3 = r4.A00
            r35 = r3
            int r3 = r4.A03
            r34 = r3
            android.graphics.Rect r3 = r4.A04
            r38 = r3
            X.1dg r3 = r4.A05
            r4 = 35
            android.util.SparseArray r3 = r3.A02
            java.lang.Object r15 = r3.get(r4)
            boolean r3 = r15 instanceof java.lang.Number
            r33 = 0
            if (r3 == 0) goto L_0x10cf
            java.lang.Number r15 = (java.lang.Number) r15
        L_0x1076:
            java.util.List r9 = r0.A0L()
            X.C18450wi.A0B(r9)
            java.util.ArrayList r32 = new java.util.ArrayList
            r32.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r7 = r9.size()
            r6 = 0
            r11 = 0
        L_0x108d:
            if (r6 >= r7) goto L_0x10d2
            java.lang.Object r12 = r9.get(r6)
            X.1dg r12 = (X.C31201dg) r12
            boolean r3 = X.AnonymousClass4Xl.A01(r12)
            if (r3 == 0) goto L_0x10ca
            r13 = r36
        L_0x109d:
            int r11 = r11 + r13
            r3 = r36
            if (r11 <= r3) goto L_0x10c6
            java.util.List r4 = X.C003101j.A0A(r8)
            r3 = r32
            r3.add(r4)
            r8.clear()
            r8.add(r12)
            r11 = r13
        L_0x10b2:
            int r3 = r9.size()
            int r3 = r3 + -1
            if (r6 != r3) goto L_0x10c3
            java.util.List r4 = X.C003101j.A0A(r8)
            r3 = r32
            r3.add(r4)
        L_0x10c3:
            int r6 = r6 + 1
            goto L_0x108d
        L_0x10c6:
            r8.add(r12)
            goto L_0x10b2
        L_0x10ca:
            int r13 = X.AnonymousClass4Xl.A00(r12)
            goto L_0x109d
        L_0x10cf:
            r15 = r33
            goto L_0x1076
        L_0x10d2:
            int r31 = r32.size()
            java.util.ArrayList r30 = new java.util.ArrayList
            r4 = r30
            r3 = r31
            r4.<init>(r3)
            java.util.List r3 = r0.A0L()
            int r4 = r3.size()
            java.util.ArrayList r29 = new java.util.ArrayList
            r3 = r29
            r3.<init>(r4)
            X.38i r28 = new X.38i
            r3 = r28
            r3.<init>(r2, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r41)
            r2 = r38
            int r2 = r2.left
            int r3 = r3 - r2
            r2 = r38
            int r2 = r2.right
            int r3 = r3 - r2
            int r4 = android.view.View.MeasureSpec.getSize(r40)
            r2 = r38
            int r2 = r2.top
            int r4 = r4 - r2
            r2 = r38
            int r2 = r2.bottom
            int r4 = r4 - r2
            r2 = r37
            if (r2 == r10) goto L_0x1116
            r3 = r4
        L_0x1116:
            r2 = r36
            int[] r2 = new int[r2]
            r27 = r2
            int r7 = r3 / r36
            int r3 = r3 % r36
            r6 = 0
            r4 = 0
        L_0x1122:
            r2 = r36
            if (r6 >= r2) goto L_0x1138
            int r4 = r4 + r3
            if (r4 <= 0) goto L_0x1136
            int r2 = r36 - r4
            if (r2 >= r3) goto L_0x1136
            int r2 = r7 + 1
            int r4 = r4 - r36
        L_0x1131:
            r27[r6] = r2
            int r6 = r6 + 1
            goto L_0x1122
        L_0x1136:
            r2 = r7
            goto L_0x1131
        L_0x1138:
            java.util.List r2 = r0.A0L()
            int r3 = r2.size()
            java.util.ArrayList r26 = new java.util.ArrayList
            r2 = r26
            r2.<init>(r3)
            int r25 = r32.size()
            r11 = 0
        L_0x114c:
            r2 = r25
            if (r11 >= r2) goto L_0x1349
            r2 = r32
            java.lang.Object r14 = r2.get(r11)
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            boolean r22 = X.C806945c.A00(r39)
            int r3 = r14.size()
            java.util.ArrayList r21 = new java.util.ArrayList
            r2 = r21
            r2.<init>(r3)
            java.util.Iterator r20 = r14.iterator()
            r13 = 0
        L_0x1176:
            boolean r2 = r20.hasNext()
            if (r2 == 0) goto L_0x1236
            java.lang.Object r3 = r20.next()
            X.1dg r3 = (X.C31201dg) r3
            boolean r2 = X.AnonymousClass4Xl.A01(r3)
            if (r2 == 0) goto L_0x1230
            r4 = r36
        L_0x118a:
            int r4 = r4 + r13
            int r4 = r4 - r10
            r2 = r37
            if (r2 != r10) goto L_0x1228
            if (r11 != 0) goto L_0x122c
        L_0x1192:
            r19 = 1
        L_0x1194:
            if (r2 != r10) goto L_0x1221
            if (r13 != 0) goto L_0x1225
        L_0x1198:
            r12 = 1
        L_0x1199:
            if (r2 != r10) goto L_0x1219
            int r2 = r36 + -1
            if (r4 != r2) goto L_0x121e
        L_0x119f:
            r18 = 1
        L_0x11a1:
            r2 = r37
            if (r2 != r10) goto L_0x1211
            int r2 = r31 + -1
            if (r11 != r2) goto L_0x1216
        L_0x11a9:
            r17 = 1
        L_0x11ab:
            r2 = r35
            double r8 = (double) r2
            r2 = r36
            double r2 = (double) r2
            double r8 = r8 / r2
            r6 = r34
            double r6 = (double) r6
            double r6 = r6 / r2
            if (r12 == 0) goto L_0x1203
            r12 = 0
        L_0x11b9:
            if (r19 == 0) goto L_0x11f7
            r13 = 0
        L_0x11bc:
            if (r18 == 0) goto L_0x11e5
            r8 = 0
        L_0x11bf:
            if (r17 == 0) goto L_0x11d5
            r2 = 0
        L_0x11c2:
            android.graphics.Rect r3 = new android.graphics.Rect
            if (r22 != 0) goto L_0x11d1
            r3.<init>(r12, r13, r8, r2)
        L_0x11c9:
            r2 = r21
            r2.add(r3)
            int r13 = r4 + 1
            goto L_0x1176
        L_0x11d1:
            r3.<init>(r8, r13, r12, r2)
            goto L_0x11c9
        L_0x11d5:
            if (r37 != 0) goto L_0x11e2
            int r2 = r4 + 1
            double r2 = (double) r2
            double r2 = r2 * r6
            int r2 = A01(r2)
            int r2 = r34 - r2
            goto L_0x11c2
        L_0x11e2:
            int r2 = r34 >> 1
            goto L_0x11c2
        L_0x11e5:
            r2 = r37
            if (r2 != r10) goto L_0x11f4
            int r2 = r4 + 1
            double r2 = (double) r2
            double r2 = r2 * r8
            int r2 = A01(r2)
            int r8 = r35 - r2
            goto L_0x11bf
        L_0x11f4:
            int r8 = r35 >> 1
            goto L_0x11bf
        L_0x11f7:
            if (r37 != 0) goto L_0x1200
            double r2 = (double) r13
            double r2 = r2 * r6
            int r13 = A01(r2)
            goto L_0x11bc
        L_0x1200:
            int r13 = r34 >> 1
            goto L_0x11bc
        L_0x1203:
            r2 = r37
            if (r2 != r10) goto L_0x120e
            double r2 = (double) r13
            double r2 = r2 * r8
            int r12 = A01(r2)
            goto L_0x11b9
        L_0x120e:
            int r12 = r35 >> 1
            goto L_0x11b9
        L_0x1211:
            int r2 = r36 + -1
            if (r4 != r2) goto L_0x1216
            goto L_0x11a9
        L_0x1216:
            r17 = 0
            goto L_0x11ab
        L_0x1219:
            int r2 = r31 + -1
            if (r11 != r2) goto L_0x121e
            goto L_0x119f
        L_0x121e:
            r18 = 0
            goto L_0x11a1
        L_0x1221:
            if (r11 != 0) goto L_0x1225
            goto L_0x1198
        L_0x1225:
            r12 = 0
            goto L_0x1199
        L_0x1228:
            if (r13 != 0) goto L_0x122c
            goto L_0x1192
        L_0x122c:
            r19 = 0
            goto L_0x1194
        L_0x1230:
            int r4 = X.AnonymousClass4Xl.A00(r3)
            goto L_0x118a
        L_0x1236:
            int r13 = r14.size()
            r12 = 0
            r9 = 0
            r8 = 0
        L_0x123d:
            if (r8 >= r13) goto L_0x12fe
            java.lang.Object r7 = r14.get(r8)
            X.1dg r7 = (X.C31201dg) r7
            boolean r19 = X.AnonymousClass4Xl.A01(r7)
            if (r19 == 0) goto L_0x12f8
            r4 = r36
        L_0x124d:
            r2 = r21
            java.lang.Object r2 = r2.get(r8)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r3 = r26
            r3.add(r2)
            if (r15 == 0) goto L_0x12f4
            float r3 = r15.floatValue()
            java.lang.Float r18 = java.lang.Float.valueOf(r3)
        L_0x1264:
            r3 = r8
            int r4 = r4 + r8
            r6 = 0
        L_0x1267:
            if (r3 >= r4) goto L_0x1270
            r17 = r27[r3]
            int r6 = r6 + r17
            int r3 = r3 + 1
            goto L_0x1267
        L_0x1270:
            r3 = r37
            if (r3 != r10) goto L_0x12ef
            int r4 = r2.left
            int r3 = r2.right
        L_0x1278:
            int r4 = r4 + r3
            int r6 = r6 - r4
            if (r18 == 0) goto L_0x12e9
            if (r19 != 0) goto L_0x12e9
            float r3 = (float) r6
            float r4 = r18.floatValue()
            float r3 = r3 * r4
            int r4 = (int) r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
        L_0x128b:
            if (r37 != 0) goto L_0x12e2
            r4 = r17
            r3 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
        L_0x1295:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            X.1Jq r3 = new X.1Jq
            r3.<init>(r6, r4)
            java.lang.Object r4 = r3.first
            java.lang.Number r4 = (java.lang.Number) r4
            int r6 = r4.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Number r3 = (java.lang.Number) r3
            int r4 = r3.intValue()
            X.4Jw r3 = new X.4Jw
            r3.<init>(r2, r6, r4)
            r2 = r24
            r2.add(r3)
            r2 = r28
            X.4Gj r2 = r2.A00(r7, r6, r4)
            X.38o r2 = r2.A00
            X.4dK r2 = r2.A00()
            X.3AI r2 = r2.A02
            com.facebook.rendercore.RenderTreeNode r2 = r2.A03
            android.graphics.Rect r3 = r2.A04
            int r2 = r3.width()
            int r9 = java.lang.Math.max(r9, r2)
            int r2 = r3.height()
            int r12 = java.lang.Math.max(r12, r2)
            int r8 = r8 + 1
            goto L_0x123d
        L_0x12e2:
            r3 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            goto L_0x1295
        L_0x12e9:
            r3 = 0
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            goto L_0x128b
        L_0x12ef:
            int r4 = r2.top
            int r3 = r2.bottom
            goto L_0x1278
        L_0x12f4:
            r18 = r33
            goto L_0x1264
        L_0x12f8:
            int r4 = X.AnonymousClass4Xl.A00(r7)
            goto L_0x124d
        L_0x12fe:
            int r13 = r14.size()
            r8 = 0
        L_0x1303:
            if (r8 >= r13) goto L_0x133e
            java.lang.Object r7 = r14.get(r8)
            X.1dg r7 = (X.C31201dg) r7
            r2 = r24
            java.lang.Object r6 = r2.get(r8)
            X.4Jw r6 = (X.C84264Jw) r6
            if (r37 != 0) goto L_0x1335
            r2 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r2)
            int r3 = r6.A00
        L_0x131d:
            r2 = r28
            X.4Gj r3 = r2.A00(r7, r4, r3)
            X.4Gl r4 = new X.4Gl
            r4.<init>(r3, r6)
            r2 = r23
            r2.add(r4)
            r2 = r29
            r2.add(r3)
            int r8 = r8 + 1
            goto L_0x1303
        L_0x1335:
            int r4 = r6.A01
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            goto L_0x131d
        L_0x133e:
            r3 = r30
            r2 = r23
            r3.add(r2)
            int r11 = r11 + 1
            goto L_0x114c
        L_0x1349:
            if (r5 == 0) goto L_0x1358
            java.lang.Object r3 = X.C62183Bz.A05(r5, r0)
            X.C18450wi.A0B(r3)
            X.39I r3 = (X.AnonymousClass39I) r3
            r2 = r26
            r3.A07 = r2
        L_0x1358:
            int r22 = android.view.View.MeasureSpec.getMode(r41)
            int r15 = android.view.View.MeasureSpec.getMode(r40)
            r2 = r37
            if (r2 != r10) goto L_0x136e
            if (r22 != 0) goto L_0x1378
            java.lang.String r1 = "GridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x136e:
            if (r15 != 0) goto L_0x1378
            java.lang.String r1 = "GridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1378:
            int r21 = android.view.View.MeasureSpec.getSize(r41)
            r3 = 1073741824(0x40000000, float:2.0)
            r14 = -1
            r2 = r22
            if (r2 == r3) goto L_0x1388
            r13 = -1
            r2 = r37
            if (r2 != r10) goto L_0x138a
        L_0x1388:
            r13 = r21
        L_0x138a:
            int r20 = android.view.View.MeasureSpec.getSize(r40)
            if (r15 == r3) goto L_0x1392
            if (r37 != 0) goto L_0x1394
        L_0x1392:
            r14 = r20
        L_0x1394:
            r3 = -1
            if (r13 == r3) goto L_0x13cd
            if (r14 == r3) goto L_0x13cd
        L_0x1399:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x139d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            X.1Jq r3 = new X.1Jq
            r3.<init>(r4, r2)
            java.lang.Object r2 = r3.first
            java.lang.Number r2 = (java.lang.Number) r2
            int r6 = r2.intValue()
            java.lang.Object r2 = r3.second
            java.lang.Number r2 = (java.lang.Number) r2
            int r5 = r2.intValue()
            X.4JP r4 = new X.4JP
            r2 = r29
            r4.<init>(r2, r6, r5)
            X.4nL r3 = new X.4nL
            r7 = r3
            r8 = r1
            r9 = r4
            r10 = r41
            r11 = r40
            r12 = r6
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x2122
        L_0x13cd:
            r2 = r38
            int r2 = r2.left
            r19 = r2
            r2 = r38
            int r2 = r2.right
            int r19 = r19 + r2
            r2 = r38
            int r12 = r2.top
            int r2 = r2.bottom
            int r12 = r12 + r2
            int r18 = r30.size()
            r11 = 0
        L_0x13e5:
            r2 = r18
            if (r11 >= r2) goto L_0x1458
            r2 = r30
            java.lang.Object r9 = r2.get(r11)
            java.util.List r9 = (java.util.List) r9
            int r17 = r9.size()
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x13f8:
            r2 = r17
            if (r6 >= r2) goto L_0x1434
            java.lang.Object r3 = r9.get(r6)
            X.4Gl r3 = (X.C83384Gl) r3
            X.4Jw r2 = r3.A01
            android.graphics.Rect r5 = r2.A02
            X.4Gj r2 = r3.A00
            X.38o r2 = r2.A00
            X.4dK r2 = r2.A00()
            X.3AI r2 = r2.A02
            com.facebook.rendercore.RenderTreeNode r2 = r2.A03
            android.graphics.Rect r2 = r2.A04
            r3 = r2
            int r4 = r2.width()
            int r2 = r5.left
            int r4 = r4 + r2
            int r2 = r5.right
            int r4 = r4 + r2
            int r3 = r3.height()
            int r2 = r5.top
            int r3 = r3 + r2
            int r2 = r5.bottom
            int r3 = r3 + r2
            int r8 = java.lang.Math.max(r8, r4)
            int r7 = java.lang.Math.max(r7, r3)
            int r6 = r6 + 1
            goto L_0x13f8
        L_0x1434:
            int r19 = r19 + r8
            int r12 = r12 + r7
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r37 != 0) goto L_0x144d
            r2 = r22
            if (r2 != r3) goto L_0x1446
            r3 = r19
            r2 = r21
            if (r3 < r2) goto L_0x1446
            r13 = r2
        L_0x1446:
            r3 = -1
            if (r13 == r3) goto L_0x1455
            if (r14 == r3) goto L_0x1455
            goto L_0x1399
        L_0x144d:
            if (r15 != r3) goto L_0x1446
            r2 = r20
            if (r12 < r2) goto L_0x1446
            r14 = r2
            goto L_0x1446
        L_0x1455:
            int r11 = r11 + 1
            goto L_0x13e5
        L_0x1458:
            r2 = r37
            if (r2 != r10) goto L_0x1467
            if (r14 != r3) goto L_0x145f
            r14 = r12
        L_0x145f:
            r19 = r13
        L_0x1461:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            goto L_0x139d
        L_0x1467:
            if (r13 == r3) goto L_0x1461
            goto L_0x145f
        L_0x146a:
            r12 = 13320(0x3408, float:1.8665E-41)
            if (r6 != r12) goto L_0x161d
            X.3Bu r20 = X.AnonymousClass495.A00
            r3 = 49
            java.lang.String r4 = r0.A0J(r3)
            if (r4 == 0) goto L_0x1484
            java.lang.String r3 = "gone"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x1484
            X.5TP r3 = X.C89724cn.A01
            goto L_0x2122
        L_0x1484:
            android.content.Context r3 = r2.A02
            boolean r3 = X.AnonymousClass44u.A00(r3)
            r14 = r3 ^ 1
            X.1dg r7 = X.C62143Bu.A02(r0)
            X.0W8 r6 = new X.0W8
            r6.<init>()
            X.4tR r3 = new X.4tR
            r3.<init>(r6, r0)
            r0.A0O(r3)
            if (r14 != 0) goto L_0x14ba
            X.0KN r9 = X.AnonymousClass0KN.A03
            r3 = 2
            X.AnonymousClass0W8.A00(r6, r3)
            float[] r8 = r6.A01
            int r5 = r6.A00
            int r4 = r5 + 1
            r6.A00 = r4
            r3 = 0
            float r3 = (float) r3
            r8[r5] = r3
            int r3 = r4 + 1
            r6.A00 = r3
            int r3 = r9.mIntValue
            float r3 = (float) r3
            r8[r4] = r3
        L_0x14ba:
            if (r7 == 0) goto L_0x14c4
            X.4tS r3 = new X.4tS
            r3.<init>(r6, r14)
            r7.A0O(r3)
        L_0x14c4:
            float[] r4 = r6.A01
            int r3 = r6.A00
            float[] r21 = java.util.Arrays.copyOf(r4, r3)
            java.util.List r19 = r0.A0L()
            int r3 = r19.size()
            float[][] r4 = new float[r3][]
            int r3 = r19.size()
            com.facebook.flexlayout.styles.FlexItemCallback[] r3 = new com.facebook.flexlayout.styles.FlexItemCallback[r3]
            java.util.Iterator r18 = r19.iterator()
            r13 = 0
        L_0x14e1:
            boolean r5 = r18.hasNext()
            if (r5 == 0) goto L_0x1576
            java.lang.Object r11 = r18.next()
            X.1dg r11 = (X.C31201dg) r11
            if (r11 == 0) goto L_0x1504
            int r5 = r11.A01
            if (r5 != r12) goto L_0x1504
            r5 = 49
            java.lang.String r6 = r11.A0J(r5)
            if (r6 == 0) goto L_0x1504
            java.lang.String r5 = "gone"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x1504
            goto L_0x14e1
        L_0x1504:
            X.1dg r10 = X.C62143Bu.A02(r11)
            if (r10 == 0) goto L_0x1573
            X.02n r9 = new X.02n
            r9.<init>()
            r6 = 62
            java.lang.String r5 = r10.A0J(r6)
            if (r5 == 0) goto L_0x1571
            java.lang.String r6 = r10.A0J(r6)
            java.lang.String r5 = "absolute"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x1571
            r8 = 1
            X.0KM r17 = X.AnonymousClass0KM.A01
            r5 = 2
            X.C005902n.A00(r9, r5)
            float[] r7 = r9.A01
            int r6 = r9.A00
            int r5 = r6 + 1
            r9.A00 = r5
            r15 = 21
            float r15 = (float) r15
            r7[r6] = r15
            int r6 = r5 + 1
            r9.A00 = r6
            r6 = r17
            int r6 = r6.mIntValue
            float r6 = (float) r6
            r7[r5] = r6
        L_0x1542:
            if (r14 == 0) goto L_0x156c
            X.0Kb r7 = X.C03840Kb.A02
            X.0Kb r6 = X.C03840Kb.A03
        L_0x1548:
            X.3EV r5 = new X.3EV
            r5.<init>(r7, r6, r9, r8)
            r10.A0O(r5)
        L_0x1550:
            float[] r6 = r9.A01
            int r5 = r9.A00
            float[] r5 = java.util.Arrays.copyOf(r6, r5)
            r4[r13] = r5
            X.4n2 r6 = new X.4n2
            r5 = r20
            r6.<init>(r2, r5, r11, r14)
            com.facebook.flexlayout.styles.FlexItemCallback r5 = new com.facebook.flexlayout.styles.FlexItemCallback
            r5.<init>(r6)
            r3[r13] = r5
            int r13 = r13 + 1
            goto L_0x14e1
        L_0x156c:
            X.0Kb r7 = X.C03840Kb.A03
            X.0Kb r6 = X.C03840Kb.A02
            goto L_0x1548
        L_0x1571:
            r8 = 0
            goto L_0x1542
        L_0x1573:
            X.02n r9 = X.C62143Bu.A00
            goto L_0x1550
        L_0x1576:
            int r2 = r19.size()
            if (r2 <= r13) goto L_0x1588
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r13)
            float[][] r4 = (float[][]) r4
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r13)
            com.facebook.flexlayout.styles.FlexItemCallback[] r3 = (com.facebook.flexlayout.styles.FlexItemCallback[]) r3
        L_0x1588:
            float[] r14 = X.C89724cn.A01(r41)
            float[] r12 = X.C89724cn.A01(r40)
            r6 = 1
            r11 = r14[r6]
            r10 = r12[r6]
            X.1dg r9 = X.C62143Bu.A02(r0)
            if (r9 != 0) goto L_0x15e4
            r8 = 0
        L_0x159c:
            r11 = 0
            if (r8 == 0) goto L_0x15bf
            r10 = r8[r11]
            r2 = 2
            r9 = r8[r2]
            r2 = 4
            r7 = r8[r2]
            r5 = r14[r11]
            r2 = r14[r6]
            float[] r14 = X.C89724cn.A00(r10, r9, r7, r5, r2)
            r10 = r8[r6]
            r2 = 3
            r9 = r8[r2]
            r2 = 5
            r7 = r8[r2]
            r5 = r12[r11]
            r2 = r12[r6]
            float[] r12 = X.C89724cn.A00(r10, r9, r7, r5, r2)
        L_0x15bf:
            com.facebook.flexlayout.layoutoutput.LayoutOutput r5 = new com.facebook.flexlayout.layoutoutput.LayoutOutput
            r5.<init>(r13)
            r23 = r14[r11]
            r24 = r14[r6]
            r25 = r12[r11]
            r26 = r12[r6]
            r22 = r4
            r27 = r24
            r28 = r26
            r29 = r5
            r30 = r3
            com.facebook.flexlayout.FlexLayoutNative.jni_calculateLayout(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.4nK r3 = new X.4nK
            r4 = r41
            r2 = r40
            r3.<init>(r5, r1, r4, r2)
            goto L_0x2122
        L_0x15e4:
            r2 = 6
            float[] r8 = new float[r2]
            r2 = 68
            float r2 = X.C62143Bu.A00(r9, r11, r2, r6)
            r7 = 0
            r8[r7] = r2
            r2 = 42
            float r2 = X.C62143Bu.A00(r9, r10, r2, r6)
            r8[r6] = r2
            r5 = 2
            r2 = 54
            float r2 = X.C62143Bu.A00(r9, r11, r2, r7)
            r8[r5] = r2
            r5 = 3
            r2 = 53
            float r2 = X.C62143Bu.A00(r9, r10, r2, r7)
            r8[r5] = r2
            r5 = 4
            r2 = 52
            float r2 = X.C62143Bu.A00(r9, r11, r2, r7)
            r8[r5] = r2
            r5 = 5
            r2 = 51
            float r2 = X.C62143Bu.A00(r9, r10, r2, r7)
            r8[r5] = r2
            goto L_0x159c
        L_0x161d:
            r3 = 13326(0x340e, float:1.8674E-41)
            if (r6 != r3) goto L_0x162b
            if (r1 != 0) goto L_0x1a45
            java.lang.String r1 = "ProgressBar binder returned a null ProgressBarView from createView"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x162b:
            r3 = 13336(0x3418, float:1.8688E-41)
            if (r6 != r3) goto L_0x16b7
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r7 = r3.A7G(r2)
            com.instagram.common.bloks.component.BloksEditText r7 = (com.instagram.common.bloks.component.BloksEditText) r7
            r2 = 35
            java.lang.String r8 = r0.A0J(r2)
            java.lang.String r6 = "TextInputBinderUtils"
            if (r8 == 0) goto L_0x1663
            r4 = 0
            r2 = 54
            java.lang.String r2 = r0.A0J(r2)
            if (r2 == 0) goto L_0x1658
            int r4 = X.C62163Bx.A09(r2)     // Catch:{ 40K -> 0x1652 }
            goto L_0x1658
        L_0x1652:
            r3 = move-exception
            java.lang.String r2 = "Error parsing text style for text input"
            X.C29691b2.A01(r6, r2, r3)
        L_0x1658:
            X.4da r2 = X.C90154da.A00()
            X.1MO r2 = r2.A02
            android.graphics.Typeface r8 = r2.A00(r5, r8, r4)
            goto L_0x1664
        L_0x1663:
            r8 = 0
        L_0x1664:
            r4 = 31
            r3 = 50
            java.lang.String r2 = ""
            java.lang.String r2 = r0.A0K(r3, r2)
            java.lang.String r13 = r0.A0K(r4, r2)
            r11 = 0
            r9 = r5
            r10 = r7
            r12 = r0
            X.C15490rD.A00(r8, r9, r10, r11, r12, r13)
            r3 = r41
            r2 = r40
            r7.measure(r3, r2)
            int r2 = r7.getLineCount()
            X.4Gk r4 = new X.4Gk
            r4.<init>(r8, r2)
            int r3 = android.view.View.MeasureSpec.getMode(r41)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r2) goto L_0x16b2
            int r10 = android.view.View.MeasureSpec.getSize(r41)
        L_0x1695:
            int r11 = r7.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.getMode(r41)
            if (r2 != 0) goto L_0x16a4
            java.lang.String r2 = "TextInput is being measured with unspecified width"
            X.C29691b2.A00(r6, r2)
        L_0x16a4:
            X.4nL r3 = new X.4nL
            r5 = r3
            r6 = r1
            r7 = r4
            r8 = r41
            r9 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x2122
        L_0x16b2:
            int r10 = r7.getMeasuredWidth()
            goto L_0x1695
        L_0x16b7:
            r3 = 16160(0x3f20, float:2.2645E-41)
            if (r6 != r3) goto L_0x1982
            r4 = r41
            r3 = r40
            X.5TP r3 = com.bloks.components.bkcomponentsslider.BKBloksComponentsSliderBinderUtil.calculateLayoutForComponent(r2, r0, r1, r4, r3)
            goto L_0x2122
        L_0x16c5:
            X.1JW r6 = r12.A01
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r4 = r3.A7G(r2)
            X.02Z r4 = (X.AnonymousClass02Z) r4
            if (r5 == 0) goto L_0x16ec
            android.text.Spannable r2 = X.C61933Az.A00(r4, r5, r0, r6)
            X.C61933Az.A01(r2, r4, r0)
            r3 = r41
            r2 = r40
            r4.measure(r3, r2)
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            goto L_0x1994
        L_0x16ec:
            java.lang.String r1 = "Cannot measure WaRichTextComponent's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x16f4:
            r2 = 45
            java.lang.String r2 = r0.A0J(r2)     // Catch:{ 40K -> 0x171c }
            if (r2 != 0) goto L_0x16fd
            goto L_0x1702
        L_0x16fd:
            float r2 = X.C62163Bx.A01(r2)     // Catch:{ 40K -> 0x171c }
            goto L_0x1704
        L_0x1702:
            r2 = 1183252480(0x46870000, float:17280.0)
        L_0x1704:
            int r4 = (int) r2     // Catch:{ 40K -> 0x171c }
            r2 = 40
            java.lang.String r2 = r0.A0J(r2)     // Catch:{ 40K -> 0x1715 }
            if (r2 != 0) goto L_0x170f
            goto L_0x184e
        L_0x170f:
            float r2 = X.C62163Bx.A01(r2)     // Catch:{ 40K -> 0x1715 }
            goto L_0x1850
        L_0x1715:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x171c:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1723:
            X.1JW r7 = r12.A01
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r6 = r3.A7G(r2)
            android.view.View r6 = (android.view.View) r6
            if (r5 == 0) goto L_0x1753
            r4 = 0
            X.C808645w.A00(r6, r5, r0, r7)
            r3 = r41
            r2 = r40
            r6.measure(r3, r2)
            int r7 = r6.getMeasuredWidth()
            int r8 = r6.getMeasuredHeight()
            r2 = 2131365701(0x7f0a0f45, float:1.8351275E38)
            android.view.View r2 = X.C004601z.A0E(r6, r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r2.setAdapter(r4)
            goto L_0x1994
        L_0x1753:
            java.lang.String r1 = "Cannot measure WaRcListViewBinderUtil's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x175b:
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r4 = r3.A7G(r2)
            android.view.View r4 = (android.view.View) r4
            if (r5 == 0) goto L_0x1784
            r3 = 50
            java.lang.String r2 = ""
            java.lang.String r2 = r0.A0K(r3, r2)
            X.C61923Ay.A01(r4, r5, r0, r2)
            r3 = r41
            r2 = r40
            r4.measure(r3, r2)
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            goto L_0x1994
        L_0x1784:
            java.lang.String r1 = "Cannot measure WaRcFormInputComponentBinderUtils's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x178c:
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r4 = r3.A7G(r2)
            android.view.View r4 = (android.view.View) r4
            goto L_0x1903
        L_0x1799:
            X.1JW r7 = r12.A01
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r8 = r3.A7G(r2)
            android.view.View r8 = (android.view.View) r8
            long r3 = X.C808545v.A00(r0)
            r2 = 2
            int[] r6 = new int[r2]
            r12 = 1
            r11 = 0
            r9 = 0
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x17e0
            r2 = 38
            java.lang.String r5 = r0.A0J(r2)
            r2 = 2131366336(0x7f0a11c0, float:1.8352563E38)
            android.view.View r2 = X.C004601z.A0E(r8, r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r5)
            r7.Aez(r8, r3)
            r3 = r41
            r2 = r40
            r8.measure(r3, r2)
            int r2 = r8.getMeasuredWidth()
            r6[r11] = r2
            int r2 = r8.getMeasuredHeight()
            r6[r12] = r2
            r7.Ah8(r8)
        L_0x17e0:
            r7 = r6[r11]
            r8 = r6[r12]
            goto L_0x1994
        L_0x17e6:
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 0
            int r4 = android.view.View.MeasureSpec.getMode(r41)
            int r3 = android.view.View.MeasureSpec.getSize(r41)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r2) goto L_0x180f
            r2 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x180f
        L_0x17fa:
            r7 = 0
            r5[r7] = r6
            r9 = 0
            int r4 = android.view.View.MeasureSpec.getMode(r40)
            int r3 = android.view.View.MeasureSpec.getSize(r40)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r2) goto L_0x1811
            r2 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x1811
            goto L_0x1863
        L_0x180f:
            r6 = r3
            goto L_0x17fa
        L_0x1811:
            r9 = r3
            goto L_0x1863
        L_0x1813:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r41
            int r7 = A02(r3, r2)
            r2 = r40
            int r8 = A02(r3, r2)
            goto L_0x1994
        L_0x1824:
            X.1JW r6 = r12.A01
            if (r5 == 0) goto L_0x1874
            if (r1 == 0) goto L_0x1874
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r4 = r3.A7G(r2)
            android.view.View r4 = (android.view.View) r4
            X.AnonymousClass385.A00(r4, r5, r0, r6)
            r3 = r41
            r2 = r40
            r4.measure(r3, r2)
            r2 = 2
            int[] r5 = new int[r2]
            int r2 = r4.getMeasuredWidth()
            r7 = 0
            r5[r7] = r2
            int r9 = r4.getMeasuredHeight()
            goto L_0x1863
        L_0x184e:
            r2 = 1183252480(0x46870000, float:17280.0)
        L_0x1850:
            int r3 = (int) r2
            r2 = 2
            int[] r5 = new int[r2]
            r2 = r41
            int r2 = A02(r4, r2)
            r7 = 0
            r5[r7] = r2
            r2 = r40
            int r9 = A02(r3, r2)
        L_0x1863:
            r2 = 1
            r5[r2] = r9
            r8 = r5[r7]
            X.4nL r3 = new X.4nL
            r4 = r1
            r6 = r41
            r7 = r40
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x2122
        L_0x1874:
            java.lang.String r1 = "Cannot measure WaRcCheckBoxComponentBinderUtils's render unit with a null BloksContext or RenderUnit"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x187c:
            r3 = 36
            X.1dg r5 = r0.A0G(r3)
            if (r5 == 0) goto L_0x18df
            int r3 = android.view.View.MeasureSpec.getSize(r40)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            r3 = 40
            X.1dg r4 = r0.A0G(r3)
            r8 = 0
            if (r4 == 0) goto L_0x18aa
            r3 = r41
            X.5TP r10 = r4.A0D(r2, r3, r7)
            X.0rq r11 = X.C89994dK.A01(r4)
            r9 = r2
            r12 = r4
            r13 = r8
            r14 = r3
            r15 = r7
            X.4dK r8 = X.C89994dK.A00(r9, r10, r11, r12, r13, r14, r15)
        L_0x18aa:
            int r4 = android.view.View.MeasureSpec.getSize(r40)
            if (r8 == 0) goto L_0x18dd
            X.3AI r3 = r8.A02()
            com.facebook.rendercore.RenderTreeNode r3 = r3.A03
            android.graphics.Rect r3 = r3.A04
            int r13 = r3.height()
        L_0x18bc:
            int r4 = r4 - r13
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r3 = r41
            X.5TP r6 = r5.A0D(r2, r3, r4)
            int r9 = android.view.View.MeasureSpec.getSize(r41)
            int r10 = r6.getHeight()
            int r10 = r10 + r13
            X.0ec r3 = new X.0ec
            r5 = r3
            r7 = r1
            r11 = r41
            r12 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x2122
        L_0x18dd:
            r13 = 0
            goto L_0x18bc
        L_0x18df:
            java.lang.String r1 = "bk.cds.bottomsheet.Wrapper has no content."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x18e7:
            r7 = 1
            r8 = 1
            X.4nL r3 = new X.4nL
            r4 = r1
            r5 = r41
            r6 = r40
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x2122
        L_0x18f5:
            X.1JW r3 = r12.A01
            android.content.Context r2 = r2.A02
            com.obwhatsapp.TextEmojiLabel r4 = new com.obwhatsapp.TextEmojiLabel
            r4.<init>(r2)
            if (r5 == 0) goto L_0x193d
            X.AnonymousClass386.A00(r4, r5, r0, r3)
        L_0x1903:
            r3 = r41
            r2 = r40
            r4.measure(r3, r2)
            r2 = 2
            int[] r6 = new int[r2]
            int r2 = r4.getMeasuredWidth()
            r5 = 0
            r6[r5] = r2
            int r8 = r4.getMeasuredHeight()
            goto L_0x1937
        L_0x1919:
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r4 = r2.getDisplayMetrics()
            r2 = 2
            int[] r6 = new int[r2]
            int r3 = r4.widthPixels
            r2 = r41
            int r2 = A02(r3, r2)
            r5 = 0
            r6[r5] = r2
            int r3 = r4.heightPixels
            r2 = r40
            int r8 = A02(r3, r2)
        L_0x1937:
            r2 = 1
            r6[r2] = r8
            r7 = r6[r5]
            goto L_0x1994
        L_0x193d:
            java.lang.String r1 = "Cannot measure WaTextWithEntitiesComponent's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x1945:
            X.1JW r6 = r12.A01
            if (r17 == 0) goto L_0x208b
            android.content.Context r4 = r2.A02
            r3 = 2131558560(0x7f0d00a0, float:1.874244E38)
            r2 = 0
            android.view.View r7 = android.view.View.inflate(r4, r3, r2)
            r2 = 36
            java.lang.String r3 = r0.A0J(r2)
            r2 = 35
            r5 = 0
            boolean r2 = r0.A0P(r2, r5)
            r6.A5b(r7, r3, r2)
            r3 = r41
            r2 = r40
            r7.measure(r3, r2)
            r2 = 2
            int[] r4 = new int[r2]
            int r2 = r7.getMeasuredWidth()
            r4[r5] = r2
            int r3 = r7.getMeasuredHeight()
            r2 = 1
            r4[r2] = r3
            r6.Ah9(r7)
            r7 = r4[r5]
            r8 = r4[r2]
            goto L_0x1994
        L_0x1982:
            r3 = 15778(0x3da2, float:2.211E-41)
            if (r6 != r3) goto L_0x19d3
            int r2 = android.view.View.MeasureSpec.getMode(r41)
            if (r2 != 0) goto L_0x19ce
            r7 = 0
        L_0x198d:
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            if (r2 != 0) goto L_0x19c7
            r8 = 0
        L_0x1994:
            X.4nL r3 = new X.4nL
            r4 = r1
            r5 = r41
            r6 = r40
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x2122
        L_0x19a0:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r3[r8] = r2
            java.lang.String r2 = "Attempting to calculateLayoutForComponent for unrecognized component style id %s"
            java.lang.String r3 = java.lang.String.format(r2, r3)
            java.lang.String r2 = "ComponentMapper"
            X.C29691b2.A00(r2, r3)
            int r2 = android.view.View.MeasureSpec.getMode(r41)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 != r3) goto L_0x19cc
            int r7 = android.view.View.MeasureSpec.getSize(r41)
        L_0x19c1:
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            if (r2 != r3) goto L_0x1994
        L_0x19c7:
            int r8 = android.view.View.MeasureSpec.getSize(r40)
            goto L_0x1994
        L_0x19cc:
            r7 = 0
            goto L_0x19c1
        L_0x19ce:
            int r7 = android.view.View.MeasureSpec.getSize(r41)
            goto L_0x198d
        L_0x19d3:
            r3 = 15728(0x3d70, float:2.204E-41)
            if (r6 != r3) goto L_0x1a04
            r2 = 35
            X.1dg r3 = r0.A0G(r2)
            r2 = 36
            if (r3 != 0) goto L_0x19f1
            r2 = 24
        L_0x19e3:
            r8 = r2
            X.4nL r3 = new X.4nL
            r4 = r1
            r5 = r41
            r6 = r40
            r7 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x2122
        L_0x19f1:
            java.lang.String r2 = r3.A0J(r2)     // Catch:{ 40K -> 0x1a01 }
            if (r2 != 0) goto L_0x19f8
            goto L_0x19fd
        L_0x19f8:
            float r2 = X.C62163Bx.A01(r2)     // Catch:{ 40K -> 0x1a01 }
            goto L_0x19ff
        L_0x19fd:
            r2 = 1103101952(0x41c00000, float:24.0)
        L_0x19ff:
            int r2 = (int) r2     // Catch:{ 40K -> 0x1a01 }
            goto L_0x19e3
        L_0x1a01:
            r2 = 24
            goto L_0x19e3
        L_0x1a04:
            r3 = 13334(0x3416, float:1.8685E-41)
            if (r6 != r3) goto L_0x1a37
            if (r1 == 0) goto L_0x1a2f
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r4 = r3.A7G(r2)
            X.0lr r4 = (X.C13330lr) r4
            r3 = r41
            r2 = r40
            r4.measure(r3, r2)
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            X.4nL r3 = new X.4nL
            r4 = r1
            r5 = r41
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x2122
        L_0x1a2f:
            java.lang.String r1 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1a37:
            r3 = 13666(0x3562, float:1.915E-41)
            if (r6 != r3) goto L_0x1a6a
            if (r1 != 0) goto L_0x1a45
            java.lang.String r1 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1a45:
            r3 = r1
            X.5Na r3 = (X.C108195Na) r3
            android.content.Context r2 = r2.A02
            java.lang.Object r4 = r3.A7G(r2)
            android.view.View r4 = (android.view.View) r4
            r3 = r41
            r2 = r40
            r4.measure(r3, r2)
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            X.4nL r3 = new X.4nL
            r4 = r1
            r5 = r41
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x2122
        L_0x1a6a:
            r3 = 13329(0x3411, float:1.8678E-41)
            if (r6 != r3) goto L_0x1ce9
            android.content.Context r3 = r2.A02
            X.3HU r9 = X.AnonymousClass3BY.A01(r3)
            r3 = 1
            r9.A0a = r3
            r3 = 0
            r9.A09 = r3
            X.02F r6 = X.AnonymousClass02G.A03
            r9.A0T = r6
            r3 = 42
            java.lang.String r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x1a99
            int r8 = X.C62163Bx.A07(r3)     // Catch:{ 40K -> 0x1a92 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            A06(r9, r3)
            goto L_0x1a9c
        L_0x1a92:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1a99:
            r8 = 8388611(0x800003, float:1.1754948E-38)
        L_0x1a9c:
            r3 = 40
            r4 = -1
            int r3 = r0.A0A(r3, r4)
            if (r3 <= r4) goto L_0x1aab
            r9.A0H = r3
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r9.A0S = r3
        L_0x1aab:
            r3 = 44
            java.util.List r4 = r0.A0N(r3)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x1abf
            X.0OD r3 = A04(r5, r0, r4)
            java.lang.CharSequence r3 = r3.A00
            r9.A0W = r3
        L_0x1abf:
            r3 = 54
            java.lang.String r4 = r0.A0J(r3)
            if (r4 == 0) goto L_0x1adc
            java.lang.String r3 = "text_first_strong"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x1ada
            android.content.Context r3 = r5.A00
            boolean r3 = X.AnonymousClass44u.A00(r3)
            if (r3 == 0) goto L_0x1b2c
            X.02F r6 = X.AnonymousClass02G.A02
        L_0x1ada:
            r9.A0T = r6
        L_0x1adc:
            r3 = 53
            X.1dg r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x1b2a
            int r3 = X.C87564Xk.A00(r5, r3)
        L_0x1ae8:
            r9.A09 = r3
            r3 = 52
            r4 = 0
            int r3 = r0.A0A(r3, r4)
            r9.A0A = r3
            r3 = 46
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r0.A0A(r3, r7)
            r3 = 48
            int r10 = r0.A0A(r3, r7)
            if (r6 == r7) goto L_0x1b06
            r11 = 1
            if (r10 != r7) goto L_0x1b07
        L_0x1b06:
            r11 = 0
        L_0x1b07:
            if (r11 == 0) goto L_0x1b25
            android.content.Context r3 = r5.A00
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r7 = r3.density
            float r3 = (float) r6
            float r3 = r3 * r7
            int r6 = java.lang.Math.round(r3)
            float r3 = (float) r10
            float r3 = r3 * r7
            int r3 = java.lang.Math.round(r3)
            r9.A0E = r6
            r9.A0F = r3
        L_0x1b25:
            r3 = 67
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x1b2f
        L_0x1b2a:
            r3 = 0
            goto L_0x1ae8
        L_0x1b2c:
            X.02F r6 = X.AnonymousClass02G.A01
            goto L_0x1ada
        L_0x1b2f:
            java.lang.String r3 = r0.A0J(r3)     // Catch:{ 40K -> 0x1b45 }
            if (r3 != 0) goto L_0x1b36
            goto L_0x1b3b
        L_0x1b36:
            float r6 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x1b45 }
            goto L_0x1b3d
        L_0x1b3b:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x1b3d:
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x1b4d
            r9.A02 = r6     // Catch:{ 40K -> 0x1b45 }
            goto L_0x1b4d
        L_0x1b45:
            r7 = move-exception
            java.lang.String r6 = "RichTextBinderUtils"
            java.lang.String r3 = "Error parsing lineHeight for RichText"
            X.C29691b2.A01(r6, r3, r7)
        L_0x1b4d:
            r3 = 38
            float r7 = r0.A08(r3, r10)
            r6 = r11 ^ 1
            r3 = 0
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x1b5e
            r9.A0Z = r6
            r9.A03 = r7
        L_0x1b5e:
            r3 = 32
            java.util.List r3 = r0.A0N(r3)
            X.0OD r18 = A04(r5, r0, r3)
            r3 = r18
            java.lang.CharSequence r3 = r3.A00
            android.text.SpannableString r17 = android.text.SpannableString.valueOf(r3)
            r3 = 50
            boolean r3 = r0.A0P(r3, r4)
            if (r3 == 0) goto L_0x1b7b
            X.C90154da.A00()
        L_0x1b7b:
            X.3Ty r1 = (X.C65263Ty) r1
            r3 = r1
            r4 = r9
            r5 = r17
            r6 = r41
            r7 = r40
            X.4nL r3 = X.AnonymousClass3B2.A01(r2, r3, r4, r5, r6, r7)
            r1 = 140(0x8c, float:1.96E-43)
            X.1dg r14 = r0.A0G(r1)
            if (r14 == 0) goto L_0x1cdd
            r1 = 65
            java.lang.String r4 = r0.A0J(r1)
            java.lang.String r1 = "background start padding"
            float r11 = A00(r4, r1)
            r1 = 63
            java.lang.String r4 = r0.A0J(r1)
            java.lang.String r1 = "background end padding"
            float r10 = A00(r4, r1)
            r1 = 66
            java.lang.String r4 = r0.A0J(r1)
            java.lang.String r1 = "background top padding"
            float r7 = A00(r4, r1)
            r1 = 62
            java.lang.String r4 = r0.A0J(r1)
            java.lang.String r1 = "background bottom padding"
            float r6 = A00(r4, r1)
            r1 = 58
            java.lang.String r4 = r0.A0J(r1)
            java.lang.String r1 = "background corner radius"
            float r25 = A00(r4, r1)
            java.lang.Object r5 = r3.AD4()
            X.4OP r5 = (X.AnonymousClass4OP) r5
            int r28 = r3.ACb()
            int r1 = android.view.View.MeasureSpec.getMode(r28)
            if (r1 == 0) goto L_0x1c09
            int r1 = android.view.View.MeasureSpec.getSize(r28)
            android.text.Layout r4 = r5.A02
            int r4 = X.C04330Mc.A00(r4)
            float r12 = (float) r4
            float r12 = r12 + r7
            float r12 = r12 + r6
            float r4 = (float) r1
            float r1 = r4 - r12
            r13 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r13
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x1c09
            r4 = 0
            float r4 = java.lang.Math.max(r4, r1)
            float r1 = java.lang.Math.min(r7, r4)
            float r7 = java.lang.Math.abs(r1)
            float r1 = java.lang.Math.min(r6, r4)
            float r6 = java.lang.Math.abs(r1)
        L_0x1c09:
            int r27 = r3.AH7()
            int r1 = android.view.View.MeasureSpec.getMode(r27)
            r4 = 0
            if (r1 == 0) goto L_0x1c4c
            int r13 = android.view.View.MeasureSpec.getSize(r27)
            android.text.Layout r1 = r5.A02
            r19 = r1
            r12 = 0
            r1 = 0
        L_0x1c1e:
            int r15 = r19.getLineCount()
            if (r12 >= r15) goto L_0x1c33
            float r15 = (float) r1
            r1 = r19
            float r1 = r1.getLineWidth(r12)
            float r1 = java.lang.Math.max(r15, r1)
            int r1 = (int) r1
            int r12 = r12 + 1
            goto L_0x1c1e
        L_0x1c33:
            float r12 = (float) r1
            float r12 = r12 + r11
            float r12 = r12 + r10
            int r1 = r13 - r1
            int r15 = r1 >> 1
            float r1 = (float) r13
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x1c4c
            int r1 = java.lang.Math.max(r4, r15)
            float r1 = (float) r1
            float r11 = java.lang.Math.min(r11, r1)
            float r10 = java.lang.Math.min(r10, r1)
        L_0x1c4c:
            java.lang.Object r1 = r2.A01()
            X.0q7 r1 = (X.C14990q7) r1
            int r26 = X.C87564Xk.A00(r1, r14)
            android.text.Layout r1 = r5.A02
            X.0YP r5 = new X.0YP
            r19 = r5
            r20 = r1
            r21 = r11
            r22 = r10
            r23 = r7
            r24 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            int r13 = r17.length()
            r12 = 18
            r1 = r17
            r1.setSpan(r5, r4, r13, r12)
            r9.A00 = r11
            r9.A01 = r10
            X.3BJ r1 = r3.AFR()
            X.3Ty r1 = (X.C65263Ty) r1
            r19 = r2
            r20 = r1
            r21 = r9
            r22 = r17
            r23 = r27
            r24 = r28
            X.4nL r12 = X.AnonymousClass3B2.A01(r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r12.AD4()
            X.4OP r5 = (X.AnonymousClass4OP) r5
            r5.A01 = r7
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r8 == r2) goto L_0x1cbc
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r8 != r2) goto L_0x1cc4
            int r2 = r12.getWidth()
            float r9 = (float) r2
            android.text.Layout r11 = r5.A02
            r8 = 0
            if (r11 == 0) goto L_0x1cbf
            int r3 = r11.getLineCount()
        L_0x1cae:
            if (r8 >= r3) goto L_0x1cbf
            float r2 = r11.getLineRight(r8)
            int r2 = (int) r2
            int r4 = java.lang.Math.max(r4, r2)
            int r8 = r8 + 1
            goto L_0x1cae
        L_0x1cbc:
            r5.A00 = r11
            goto L_0x1cc4
        L_0x1cbf:
            float r2 = (float) r4
            float r2 = r2 + r10
            float r9 = r9 - r2
            r5.A00 = r9
        L_0x1cc4:
            int r29 = r12.getWidth()
            android.text.Layout r2 = r5.A02
            int r30 = X.C04330Mc.A00(r2)
            float r7 = r7 + r6
            int r2 = (int) r7
            int r30 = r30 + r2
            X.4nL r3 = new X.4nL
            r24 = r3
            r25 = r1
            r26 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30)
        L_0x1cdd:
            java.lang.Object r2 = r3.A05
            X.4OP r2 = (X.AnonymousClass4OP) r2
            r1 = r18
            java.lang.String r1 = r1.A01
            r2.A05 = r1
            goto L_0x2122
        L_0x1ce9:
            r3 = 13335(0x3417, float:1.8686E-41)
            if (r6 != r3) goto L_0x1ed3
            android.content.Context r6 = r2.A02
            X.3HU r9 = X.AnonymousClass3BY.A01(r6)
            r3 = 1
            r9.A0a = r3
            r3 = 0
            r9.A09 = r3
            X.02F r3 = X.AnonymousClass02G.A03
            r9.A0T = r3
            r3 = 42
            java.lang.String r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x1d18
            int r3 = X.C62163Bx.A07(r3)     // Catch:{ 40K -> 0x1d11 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            A06(r9, r3)
            goto L_0x1d18
        L_0x1d11:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1d18:
            r3 = 38
            r4 = -1
            int r3 = r0.A0A(r3, r4)
            if (r3 <= r4) goto L_0x1d27
            r9.A0H = r3
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r9.A0S = r3
        L_0x1d27:
            r3 = 51
            java.util.List r4 = r0.A0N(r3)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x1d50
            X.0OD r3 = A04(r5, r0, r4)
            java.lang.CharSequence r3 = r3.A00
        L_0x1d39:
            r9.A0W = r3
        L_0x1d3b:
            r3 = 45
            java.lang.String r10 = r0.A0J(r3)
            java.lang.String r12 = ""
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 == 0) goto L_0x1dbb
            r3 = 53
            java.lang.String r4 = r0.A0J(r3)
            if (r4 == 0) goto L_0x1dae
            goto L_0x1d59
        L_0x1d50:
            r3 = 49
            java.lang.String r3 = r0.A0J(r3)
            if (r3 == 0) goto L_0x1d3b
            goto L_0x1d39
        L_0x1d59:
            java.lang.String r3 = "[^0-9.]"
            java.lang.String r8 = r10.replaceAll(r3, r12)     // Catch:{ 40K -> 0x1db4 }
            int r7 = r8.length()     // Catch:{ 40K -> 0x1db4 }
            int r3 = r10.length()     // Catch:{ 40K -> 0x1db4 }
            if (r7 == r3) goto L_0x1d71
            java.lang.String r7 = "text_size_ignored"
            java.lang.String r3 = "Only specify a size value for text_size if also specifying the text_size_unit property."
            X.C29691b2.A00(r7, r3)     // Catch:{ 40K -> 0x1db4 }
        L_0x1d71:
            float r10 = java.lang.Float.parseFloat(r8)     // Catch:{ 40K -> 0x1db4 }
            int r3 = r4.hashCode()     // Catch:{ 40K -> 0x1db4 }
            switch(r3) {
                case 3212: goto L_0x1d90;
                case 3592: goto L_0x1d99;
                case 3677: goto L_0x1da2;
                default: goto L_0x1d7c;
            }     // Catch:{ 40K -> 0x1db4 }
        L_0x1d7c:
            java.lang.String r1 = "can't parse unknown textUniSize: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 40K -> 0x1db4 }
            r0.<init>(r1)     // Catch:{ 40K -> 0x1db4 }
            r0.append(r4)     // Catch:{ 40K -> 0x1db4 }
            java.lang.String r1 = r0.toString()     // Catch:{ 40K -> 0x1db4 }
            X.40K r0 = new X.40K     // Catch:{ 40K -> 0x1db4 }
            r0.<init>(r1)     // Catch:{ 40K -> 0x1db4 }
            throw r0     // Catch:{ 40K -> 0x1db4 }
        L_0x1d90:
            java.lang.String r3 = "dp"
            boolean r3 = r4.equals(r3)     // Catch:{ 40K -> 0x1db4 }
            if (r3 == 0) goto L_0x1d7c
            goto L_0x1dac
        L_0x1d99:
            java.lang.String r3 = "px"
            boolean r3 = r4.equals(r3)     // Catch:{ 40K -> 0x1db4 }
            if (r3 == 0) goto L_0x1d7c
            goto L_0x1dbf
        L_0x1da2:
            java.lang.String r3 = "sp"
            boolean r3 = r4.equals(r3)     // Catch:{ 40K -> 0x1db4 }
            if (r3 != 0) goto L_0x1db2
            goto L_0x1d7c
        L_0x1dac:
            r8 = 1
            goto L_0x1dc0
        L_0x1dae:
            float r10 = X.C62163Bx.A02(r10)     // Catch:{ 40K -> 0x1db4 }
        L_0x1db2:
            r8 = 2
            goto L_0x1dc0
        L_0x1db4:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1dbb:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = -1
            goto L_0x1dcf
        L_0x1dbf:
            r8 = 0
        L_0x1dc0:
            android.content.res.Resources r3 = r6.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r8, r10, r3)
            int r3 = (int) r3
            r9.A0O = r3
        L_0x1dcf:
            r3 = 46
            java.lang.String r4 = r0.A0J(r3)
            if (r4 == 0) goto L_0x1de9
            boolean r3 = r4.isEmpty()     // Catch:{ 40K -> 0x1de2 }
            if (r3 != 0) goto L_0x1de9
            int r7 = X.C62163Bx.A09(r4)     // Catch:{ 40K -> 0x1de2 }
            goto L_0x1dea
        L_0x1de2:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1de9:
            r7 = -1
        L_0x1dea:
            r3 = 35
            java.lang.String r4 = r0.A0J(r3)
            if (r4 == 0) goto L_0x1dfe
            X.4da r3 = X.C90154da.A00()
            X.1MO r3 = r3.A02
            android.graphics.Typeface r3 = r3.A00(r5, r4, r7)
            r9.A0R = r3
        L_0x1dfe:
            r3 = 59
            java.lang.String r3 = r0.A0J(r3)     // Catch:{ 40K -> 0x1e16 }
            if (r3 != 0) goto L_0x1e07
            goto L_0x1e0c
        L_0x1e07:
            float r4 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x1e16 }
            goto L_0x1e0e
        L_0x1e0c:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x1e0e:
            r3 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x1e1e
            r9.A02 = r4     // Catch:{ 40K -> 0x1e16 }
            goto L_0x1e1e
        L_0x1e16:
            r13 = move-exception
            java.lang.String r4 = "TextBinderUtils"
            java.lang.String r3 = "Error parsing lineHeight for Text"
            X.C29691b2.A01(r4, r3, r13)
        L_0x1e1e:
            r3 = 36
            float r13 = r0.A08(r3, r11)
            r4 = 1
            r3 = 0
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x1e2e
            r9.A0Z = r4
            r9.A03 = r13
        L_0x1e2e:
            r3 = 44
            X.1dg r4 = r0.A0G(r3)
            if (r4 == 0) goto L_0x1ec4
            X.4da r3 = X.C90154da.A00()
            X.4aX r3 = r3.A07
            java.lang.CharSequence r12 = r3.A00(r4)
        L_0x1e40:
            android.content.res.Resources r3 = r6.getResources()
            android.util.DisplayMetrics r6 = r3.getDisplayMetrics()
            r3 = 48
            X.1dg r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x1eb1
            int r3 = X.C87564Xk.A00(r5, r3)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
        L_0x1e58:
            r3 = 50
            r13 = 0
            boolean r15 = r0.A0P(r3, r13)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            int r4 = r5.length()
            r5.append(r12)
            int r12 = r5.length()
            if (r14 == 0) goto L_0x1e7d
            int r14 = r14.intValue()
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r14)
            r5.setSpan(r3, r4, r12, r13)
        L_0x1e7d:
            int r3 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x1e8e
            float r3 = android.util.TypedValue.applyDimension(r8, r10, r6)
            int r6 = (int) r3
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            r3.<init>(r6)
            r5.setSpan(r3, r4, r12, r13)
        L_0x1e8e:
            r3 = -1
            if (r7 == r3) goto L_0x1e99
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r7)
            r5.setSpan(r3, r4, r12, r13)
        L_0x1e99:
            if (r15 == 0) goto L_0x1ea3
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            r5.setSpan(r3, r4, r12, r13)
        L_0x1ea3:
            X.3Ty r1 = (X.C65263Ty) r1
            r3 = r1
            r4 = r9
            r6 = r41
            r7 = r40
            X.4nL r3 = X.AnonymousClass3B2.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x2122
        L_0x1eb1:
            r3 = 43
            java.lang.String r3 = r0.A0J(r3)
            if (r3 != 0) goto L_0x1ebb
            r14 = 0
            goto L_0x1e58
        L_0x1ebb:
            int r3 = X.C62163Bx.A05(r3)     // Catch:{ 40K -> 0x1ecc }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ 40K -> 0x1ecc }
            goto L_0x1e58
        L_0x1ec4:
            r3 = 41
            java.lang.String r12 = r0.A0K(r3, r12)
            goto L_0x1e40
        L_0x1ecc:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x1ed3:
            r3 = 13797(0x35e5, float:1.9334E-41)
            if (r6 != r3) goto L_0x1fe3
            r4 = 35
            r3 = 0
            float r14 = r0.A08(r4, r3)
            java.util.List r9 = r0.A0L()
            r10 = 0
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x1f12
            java.lang.Object r5 = r9.get(r10)
        L_0x1eeb:
            X.1dg r5 = (X.C31201dg) r5
            r4 = r41
            r3 = r40
            X.5TP r3 = r5.A0D(r2, r4, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r3)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            X.0eb r3 = new X.0eb
            r4 = r1
            r5 = r2
            r8 = r41
            r9 = r40
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x2122
        L_0x1f12:
            r8 = 1
            int r3 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x1f1c
            java.lang.Object r5 = r9.get(r8)
            goto L_0x1eeb
        L_0x1f1c:
            java.lang.Object r6 = r9.get(r10)
            X.1dg r6 = (X.C31201dg) r6
            r4 = r41
            r3 = r40
            X.5TP r11 = r6.A0D(r2, r4, r3)
            java.lang.Object r6 = r9.get(r8)
            X.1dg r6 = (X.C31201dg) r6
            X.5TP r9 = r6.A0D(r2, r4, r3)
            int r4 = r11.getWidth()
            float r3 = (float) r4
            int r2 = r9.getWidth()
            int r2 = r2 - r4
            float r2 = (float) r2
            float r2 = r2 * r14
            float r3 = r3 + r2
            int r8 = (int) r3
            int r4 = r11.getHeight()
            float r3 = (float) r4
            int r2 = r9.getHeight()
            int r2 = r2 - r4
            float r2 = (float) r2
            float r2 = r2 * r14
            float r3 = r3 + r2
            int r6 = (int) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r5 == 0) goto L_0x1fdb
            java.lang.Object r12 = X.C62183Bz.A05(r5, r0)
            android.util.Pair r12 = (android.util.Pair) r12
            if (r12 == 0) goto L_0x1fd3
            r2 = 36
            boolean r2 = r0.A0P(r2, r10)
            if (r2 == 0) goto L_0x1fcc
            java.lang.Object r2 = r12.first
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            boolean r10 = X.C62183Bz.A0A(r5)
            X.3Tz r13 = new X.3Tz
            r13.<init>(r5, r2, r10)
            float r7 = r7 - r14
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
            X.0ef r2 = new X.0ef
            r2.<init>()
            X.4aj r2 = X.C88574aj.A00(r2, r3)
            r13.A05(r2)
            X.0ec r10 = new X.0ec
            r10.<init>(r11, r13)
            java.lang.Object r2 = r12.second
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            boolean r11 = X.C62183Bz.A0A(r5)
            X.3Tz r7 = new X.3Tz
            r7.<init>(r5, r2, r11)
            java.lang.Float r3 = java.lang.Float.valueOf(r14)
            X.0ef r2 = new X.0ef
            r2.<init>()
            X.4aj r2 = X.C88574aj.A00(r2, r3)
            r7.A05(r2)
            X.0ec r2 = new X.0ec
            r2.<init>(r9, r7)
            r4.add(r10)
            r4.add(r2)
        L_0x1fbc:
            X.0eb r3 = new X.0eb
            r9 = r3
            r10 = r1
            r11 = r4
            r12 = r8
            r13 = r6
            r14 = r41
            r15 = r40
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x2122
        L_0x1fcc:
            r4.add(r11)
            r4.add(r9)
            goto L_0x1fbc
        L_0x1fd3:
            java.lang.String r1 = "Controller for component returned null but it should have returned a Pair<Integer, Integer>"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1fdb:
            java.lang.String r1 = "Calculate layout was called without a valid BloksContext"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1fe3:
            r3 = 16229(0x3f65, float:2.2742E-41)
            if (r6 != r3) goto L_0x1ff1
            r4 = r41
            r3 = r40
            X.5TP r3 = com.bloks.stdlib.components.bkcomponentsstdimplprogressbar.BKBloksComponentsStdImplProgressBarBinderUtil.calculateLayoutForComponent(r2, r0, r1, r4, r3)
            goto L_0x2122
        L_0x1ff1:
            r3 = 13708(0x358c, float:1.9209E-41)
            if (r6 != r3) goto L_0x1fff
            r4 = r41
            r3 = r40
            X.5TP r3 = com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil.calculateLayoutForComponent(r2, r0, r1, r4, r3)
            goto L_0x2122
        L_0x1fff:
            r3 = 16444(0x403c, float:2.3043E-41)
            if (r6 != r3) goto L_0x200d
            r4 = r41
            r3 = r40
            X.5TP r3 = com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil.calculateLayoutForComponent(r2, r0, r1, r4, r3)
            goto L_0x2122
        L_0x200d:
            r3 = 13327(0x340f, float:1.8675E-41)
            if (r6 != r3) goto L_0x2075
            r4 = 35
            android.util.SparseArray r3 = r0.A02
            java.lang.Object r5 = r3.get(r4)
            X.1dg r5 = (X.C31201dg) r5
            if (r5 == 0) goto L_0x206d
            r4 = r41
            r3 = r40
            X.5TP r6 = r5.A0D(r2, r4, r3)
            android.content.Context r5 = r2.A02
            X.3AI r4 = X.C90304dv.A00(r5, r6, r4, r3)
            r2.A00()
            r2 = 2
            int[] r5 = new int[r2]
            int r2 = android.view.View.MeasureSpec.getMode(r41)
            if (r2 != 0) goto L_0x2068
            com.facebook.rendercore.RenderTreeNode r2 = r4.A03
            android.graphics.Rect r2 = r2.A04
            int r2 = r2.width()
        L_0x203f:
            r3 = 0
            r5[r3] = r2
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            if (r2 != 0) goto L_0x2063
            com.facebook.rendercore.RenderTreeNode r2 = r4.A03
            android.graphics.Rect r2 = r2.A04
            int r11 = r2.height()
        L_0x2050:
            r2 = 1
            r5[r2] = r11
            r10 = r5[r3]
            X.4nL r3 = new X.4nL
            r5 = r3
            r6 = r1
            r7 = r4
            r8 = r41
            r9 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x2122
        L_0x2063:
            int r11 = android.view.View.MeasureSpec.getSize(r40)
            goto L_0x2050
        L_0x2068:
            int r2 = android.view.View.MeasureSpec.getSize(r41)
            goto L_0x203f
        L_0x206d:
            java.lang.String r1 = "PTR container has no child"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x2075:
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2[r1] = r0
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x208b:
            java.lang.String r1 = "Cannot measure WaRcVideoViewComponentBinderUtils's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x2093:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r41
            int r5 = A02(r3, r2)
            r2 = r40
            int r4 = A02(r3, r2)
            r3 = 0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3, r3, r5, r4)
            X.4nL r3 = new X.4nL
            r6 = r3
            r7 = r1
            r8 = r2
            r9 = r41
            r10 = r40
            r11 = r5
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x2122
        L_0x20b7:
            r4 = 0
            if (r26 == 0) goto L_0x20c4
            r10 = r14[r10]
            int r3 = r26 + -1
            if (r3 != 0) goto L_0x2138
            if (r10 == 0) goto L_0x20c4
        L_0x20c2:
            int r4 = r10.A00
        L_0x20c4:
            r2 = r27
            if (r2 != r9) goto L_0x2133
            int r3 = r8.top
            int r2 = r8.bottom
        L_0x20cc:
            int r3 = r3 + r2
            int r4 = r4 + r3
            int r7 = android.view.View.MeasureSpec.getSize(r41)
            if (r27 != 0) goto L_0x20de
            r2 = 1073741824(0x40000000, float:2.0)
            if (r6 == r2) goto L_0x20de
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r2) goto L_0x2131
            if (r4 < r7) goto L_0x2131
        L_0x20de:
            int r3 = android.view.View.MeasureSpec.getSize(r40)
            r2 = r27
            if (r2 != r9) goto L_0x20f0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r5 == r2) goto L_0x20f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r2) goto L_0x212f
            if (r4 < r3) goto L_0x212f
        L_0x20f0:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            X.1Jq r3 = new X.1Jq
            r3.<init>(r4, r2)
            java.lang.Object r2 = r3.first
            java.lang.Number r2 = (java.lang.Number) r2
            int r6 = r2.intValue()
            java.lang.Object r2 = r3.second
            java.lang.Number r2 = (java.lang.Number) r2
            int r5 = r2.intValue()
            X.4JP r4 = new X.4JP
            r2 = r24
            r4.<init>(r2, r6, r5)
            X.4nL r3 = new X.4nL
            r7 = r3
            r8 = r1
            r9 = r4
            r10 = r41
            r11 = r40
            r12 = r6
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x2122:
            r1 = r16
            X.4G0 r1 = r1.A01
            java.util.Map r1 = r1.A01
            r1.put(r0, r3)
            X.C89644cb.A00()
            return r3
        L_0x212f:
            r3 = r4
            goto L_0x20f0
        L_0x2131:
            r7 = r4
            goto L_0x20de
        L_0x2133:
            int r3 = r8.left
            int r2 = r8.right
            goto L_0x20cc
        L_0x2138:
            int r7 = r10.A00
            X.22s r2 = new X.22s
            r2.<init>(r9, r3)
            int r11 = r2.A00
            int r3 = r2.A01
            int r2 = r2.A02
            X.2dL r4 = new X.2dL
            r4.<init>(r11, r3, r2)
        L_0x214a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x20c2
            int r2 = r4.A00()
            r3 = r14[r2]
            int r2 = r3.A00
            if (r7 >= r2) goto L_0x214a
            r10 = r3
            r7 = r2
            goto L_0x214a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31201dg.A0D(X.4Ue, int, int):X.5TP");
    }

    public final AnonymousClass3BJ A0E(AnonymousClass3BJ r4, C14990q7 r5) {
        if (r4 == null) {
            r4 = new C65273Tz(r5, (long) this.A00, C62183Bz.A0A(r5));
        }
        r4.A05(new C88574aj(new C96044nh((AnonymousClass4CI) r5.A03(A06, this, R.id.bk_context_key_associated_mutable_container)), r4));
        return r4;
    }

    public C31201dg A0F() {
        return A0G(132);
    }

    public C31201dg A0G(int i2) {
        SparseArray sparseArray = this.A02;
        Object obj = sparseArray.get(i2);
        if (obj instanceof List) {
            List A0M = A0M(i2);
            if (!A0M.isEmpty()) {
                return (C31201dg) A0M.get(0);
            }
            return null;
        } else if (obj instanceof C31201dg) {
            return (C31201dg) sparseArray.get(i2);
        } else {
            return null;
        }
    }

    public C14930q1 A0H(int i2) {
        Object obj = this.A02.get(i2);
        if (obj == null) {
            return null;
        }
        return obj instanceof C14930q1 ? (C14930q1) obj : obj instanceof C31411e8 ? ((C31411e8) obj).A00 : C87574Xm.A01((String) obj);
    }

    public String A0I() {
        Object obj = this.A02.get(33);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return String.valueOf(((Number) obj).longValue());
        }
        StringBuilder sb = new StringBuilder("Bloks id only supports long and String types but got: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public String A0J(int i2) {
        return (String) this.A02.get(i2);
    }

    public String A0K(int i2, String str) {
        String str2 = (String) this.A02.get(i2);
        return str2 != null ? str2 : str;
    }

    public List A0L() {
        int i2;
        int intValue;
        List A0M;
        C90154da.A00();
        int i3 = this.A01;
        if (i3 != 13504) {
            if (C806344w.A00(i3)) {
                i2 = A03(this, i3);
            }
            return Collections.EMPTY_LIST;
        }
        i2 = 32;
        Integer valueOf = Integer.valueOf(i2);
        if (!(valueOf == null || (intValue = valueOf.intValue()) == -1 || (A0M = A0M(intValue)) == null)) {
            return A0M;
        }
        return Collections.EMPTY_LIST;
    }

    public List A0M(int i2) {
        Object obj = this.A02.get(i2);
        if (obj == null) {
            return Collections.emptyList();
        }
        if (!(obj instanceof C31201dg)) {
            return (List) obj;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        return arrayList;
    }

    public List A0N(int i2) {
        List list = (List) this.A02.get(i2);
        return list == null ? Collections.emptyList() : list;
    }

    public void A0O(AnonymousClass5OJ r5) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A02;
            if (i2 < sparseArray.size()) {
                Object valueAt = sparseArray.valueAt(i2);
                if (valueAt == null) {
                    C29691b2.A00("BloksModel", "Null value found during traversal");
                } else {
                    r5.Ahk(sparseArray.keyAt(i2), valueAt);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public boolean A0P(int i2, boolean z2) {
        Object obj = this.A02.get(i2);
        if (obj == null) {
            return z2;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        }
        C29691b2.A00("ParseUtils", "Attempting to extract boolean value from unrecognized value type");
        return z2;
    }

    public boolean A0Q(AnonymousClass5ON r8) {
        if (!r8.Ahl(this)) {
            int[] A012 = C90154da.A00().A06().A01(this);
            int i2 = 0;
            while (i2 < A012.length) {
                C31201dg A0G = A0G(A012[i2]);
                if (A0G == null || !A0G.A0Q(r8)) {
                    i2++;
                }
            }
            int[] A002 = C90154da.A00().A06().A00(this);
            for (int A0M : A002) {
                List A0M2 = A0M(A0M);
                for (int i3 = 0; i3 < A0M2.size(); i3++) {
                    C31201dg r0 = (C31201dg) A0M2.get(i3);
                    if (r0 != null && r0.A0Q(r8)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
