package X;

import java.util.List;

/* renamed from: X.3VW  reason: invalid class name */
public final class AnonymousClass3VW extends C65323Ui {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C90504eH A04 = new C90504eH();
    public final String A05;
    public final boolean A06;

    public AnonymousClass3VW(List list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z2 = true;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.A03 = bArr[24];
            this.A02 = AnonymousClass3K3.A0L(bArr, 28, AnonymousClass3K3.A0M(bArr, 27, (bArr[26] & 255) << 24)) | (bArr[29] & 255);
            this.A05 = "Serif".equals(new String(bArr, 43, bArr.length - 43, AnonymousClass4BH.A05)) ? "serif" : str;
            int i2 = bArr[25] * 20;
            this.A01 = i2;
            z2 = (bArr[0] & 32) == 0 ? false : z2;
            this.A06 = z2;
            if (z2) {
                this.A00 = AnonymousClass000.A02(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i2), 0.95f, 0.0f);
            } else {
                this.A00 = 0.85f;
            }
        } else {
            this.A02 = -1;
            this.A05 = str;
            this.A00 = 0.85f;
            this.A01 = -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.text.SpannableStringBuilder r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            if (r7 == r8) goto L_0x002b
            r5 = r11 | 33
            r0 = r7 & 1
            r4 = 0
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1O(r0)
            r0 = r7 & 2
            boolean r1 = X.AnonymousClass000.A1O(r0)
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0017
            r3 = 3
        L_0x0017:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r3)
            r6.setSpan(r0, r9, r10, r5)
        L_0x001f:
            r0 = r7 & 4
            if (r0 == 0) goto L_0x002c
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r6.setSpan(r0, r9, r10, r5)
        L_0x002b:
            return
        L_0x002c:
            if (r2 != 0) goto L_0x002b
            if (r1 != 0) goto L_0x002b
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            r6.setSpan(r0, r9, r10, r5)
            return
        L_0x0039:
            if (r1 == 0) goto L_0x001f
            r3 = 2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VW.A01(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }
}
