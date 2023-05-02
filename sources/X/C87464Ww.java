package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Ww  reason: invalid class name and case insensitive filesystem */
public final class C87464Ww {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final StringBuilder A05 = AnonymousClass000.A0o();
    public final List A06;
    public final List A07 = AnonymousClass000.A0u();

    public C87464Ww(int i2, int i3) {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A06 = A0u;
        this.A00 = i2;
        A0u.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
        this.A01 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r6 == -1) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r14 != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r8 == -1) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r1 != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r8 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString A00() {
        /*
            r15 = this;
            java.lang.StringBuilder r0 = r15.A05
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r0)
            int r5 = r4.length()
            r7 = -1
            r10 = 0
            r8 = -1
            r6 = -1
            r3 = 0
            r2 = -1
            r11 = -1
            r14 = 0
        L_0x0013:
            java.util.List r12 = r15.A06
            int r0 = r12.size()
            if (r10 >= r0) goto L_0x0088
            java.lang.Object r13 = r12.get(r10)
            X.4Ja r13 = (X.C84044Ja) r13
            boolean r1 = r13.A02
            int r9 = r13.A01
            r0 = 8
            if (r9 == r0) goto L_0x0034
            r0 = 7
            r14 = 1
            if (r9 == r0) goto L_0x0034
            r14 = 0
            if (r9 == r0) goto L_0x0034
            int[] r0 = X.C65543Ve.A0O
            r11 = r0[r9]
        L_0x0034:
            int r9 = r13.A00
            int r10 = r10 + 1
            int r0 = r12.size()
            if (r10 >= r0) goto L_0x0086
            java.lang.Object r0 = r12.get(r10)
            X.4Ja r0 = (X.C84044Ja) r0
            int r0 = r0.A00
        L_0x0046:
            if (r9 == r0) goto L_0x0013
            if (r8 == r7) goto L_0x0082
            if (r1 != 0) goto L_0x007f
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            r0 = 33
            r4.setSpan(r1, r8, r9, r0)
            r8 = -1
        L_0x0057:
            if (r6 == r7) goto L_0x007b
            if (r14 != 0) goto L_0x0078
            r0 = 2
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r0)
            r0 = 33
            r4.setSpan(r1, r6, r9, r0)
            r6 = -1
        L_0x0067:
            if (r11 == r2) goto L_0x0013
            if (r2 == r7) goto L_0x0075
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r2)
            r0 = 33
            r4.setSpan(r1, r3, r9, r0)
        L_0x0075:
            r2 = r11
            r3 = r9
            goto L_0x0013
        L_0x0078:
            if (r6 != r7) goto L_0x0067
            goto L_0x007d
        L_0x007b:
            if (r14 == 0) goto L_0x0067
        L_0x007d:
            r6 = r9
            goto L_0x0067
        L_0x007f:
            if (r8 != r7) goto L_0x0057
            goto L_0x0084
        L_0x0082:
            if (r1 == 0) goto L_0x0057
        L_0x0084:
            r8 = r9
            goto L_0x0057
        L_0x0086:
            r0 = r5
            goto L_0x0046
        L_0x0088:
            if (r8 == r7) goto L_0x0096
            if (r8 == r5) goto L_0x0096
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            r0 = 33
            r4.setSpan(r1, r8, r5, r0)
        L_0x0096:
            if (r6 == r7) goto L_0x00a5
            if (r6 == r5) goto L_0x00a5
            r0 = 2
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r0)
            r0 = 33
            r4.setSpan(r1, r6, r5, r0)
        L_0x00a5:
            if (r3 == r5) goto L_0x00b3
            if (r2 == r7) goto L_0x00b3
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r2)
            r0 = 33
            r4.setSpan(r1, r3, r5, r0)
        L_0x00b3:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87464Ww.A00():android.text.SpannableString");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r0 != 1) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        if (r0 == 2) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r2 <= 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C88444aV A01(int r23) {
        /*
            r22 = this;
            r0 = r23
            r5 = r22
            int r7 = r5.A02
            int r1 = r5.A04
            int r7 = r7 + r1
            int r6 = 32 - r7
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            r3 = 0
        L_0x0011:
            java.util.List r2 = r5.A07
            int r1 = r2.size()
            if (r3 >= r1) goto L_0x0035
            java.lang.Object r2 = r2.get(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r1 = r2.length()
            if (r1 <= r6) goto L_0x002a
            r1 = 0
            java.lang.CharSequence r2 = r2.subSequence(r1, r6)
        L_0x002a:
            r8.append(r2)
            r1 = 10
            r8.append(r1)
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0035:
            android.text.SpannableString r2 = r5.A00()
            int r1 = r2.length()
            if (r1 <= r6) goto L_0x0044
            r1 = 0
            java.lang.CharSequence r2 = r2.subSequence(r1, r6)
        L_0x0044:
            r8.append(r2)
            int r1 = r8.length()
            if (r1 != 0) goto L_0x004f
            r5 = 0
            return r5
        L_0x004f:
            int r1 = r8.length()
            int r6 = r6 - r1
            int r2 = r7 - r6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 2
            r15 = 1
            if (r0 == r1) goto L_0x00a0
            if (r0 == r15) goto L_0x00ae
        L_0x005e:
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r1 = 1107296256(0x42000000, float:32.0)
            if (r0 != r4) goto L_0x006a
            int r7 = 32 - r6
        L_0x006a:
            float r10 = (float) r7
            float r10 = r10 / r1
            float r10 = r10 * r2
            float r10 = r10 + r3
        L_0x006e:
            int r2 = r5.A03
            r1 = 7
            if (r2 <= r1) goto L_0x0097
            int r1 = r2 + -15
            int r2 = r1 + -2
        L_0x0077:
            r6 = 0
            android.text.Layout$Alignment r7 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r9 = (float) r2
            r14 = 0
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = 0
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            X.4aV r5 = new X.4aV
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r5
        L_0x0097:
            int r1 = r5.A00
            if (r1 != r15) goto L_0x0077
            int r1 = r5.A01
            int r1 = r1 - r15
            int r2 = r2 - r1
            goto L_0x0077
        L_0x00a0:
            int r0 = r5.A00
            if (r0 != r4) goto L_0x00b1
            int r1 = java.lang.Math.abs(r2)
            r0 = 3
            if (r1 < r0) goto L_0x00ad
            if (r6 >= 0) goto L_0x00b3
        L_0x00ad:
            r0 = 1
        L_0x00ae:
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x006e
        L_0x00b1:
            if (r0 != r4) goto L_0x00b6
        L_0x00b3:
            r0 = 2
            if (r2 > 0) goto L_0x005e
        L_0x00b6:
            r0 = 0
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87464Ww.A01(int):X.4aV");
    }

    public void A02() {
        C84044Ja r1;
        int i2;
        StringBuilder sb = this.A05;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            List list = this.A06;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0 && (i2 = (r1 = (C84044Ja) list.get(size)).A00) == length) {
                    r1.A00 = i2 - 1;
                } else {
                    return;
                }
            }
        }
    }
}
