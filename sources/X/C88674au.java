package X;

import android.icu.text.UnicodeSet;
import android.os.Build;

/* renamed from: X.4au  reason: invalid class name and case insensitive filesystem */
public class C88674au {
    public static final C88674au A02 = new C88674au("");
    public static final boolean A03 = AnonymousClass3K3.A1P(Build.VERSION.SDK_INT, 24);
    public final UnicodeSet A00;
    public final String A01;

    public C88674au(String str) {
        this.A01 = str;
        this.A00 = A03 ? str.isEmpty() ? UnicodeSet.EMPTY : new UnicodeSet(str) : null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r1 = java.lang.Character.getType(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(int r5) {
        /*
            r4 = this;
            boolean r0 = A03
            if (r0 == 0) goto L_0x000d
            android.icu.text.UnicodeSet r0 = r4.A00
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.contains(r5)
            return r0
        L_0x000d:
            java.lang.String r3 = r4.A01
            int r1 = r3.hashCode()
            r0 = -1633268329(0xffffffff9ea64d97, float:-1.7608024E-20)
            r2 = 0
            if (r1 == r0) goto L_0x0050
            r0 = -1605334735(0xffffffffa0508931, float:-1.7663678E-19)
            if (r1 == r0) goto L_0x0043
            if (r1 == 0) goto L_0x0042
            r0 = 888719627(0x34f8c90b, float:4.6339878E-7)
            if (r1 != r0) goto L_0x0042
            java.lang.String r0 = "[[:^S:]&[:^Z:]]"
        L_0x0027:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0042
            int r1 = java.lang.Character.getType(r5)
            r0 = 26
            if (r1 == r0) goto L_0x0042
            r0 = 25
            if (r1 == r0) goto L_0x0042
            r0 = 27
            if (r1 == r0) goto L_0x0042
            r0 = 28
            if (r1 == r0) goto L_0x0042
            r2 = 1
        L_0x0042:
            return r2
        L_0x0043:
            java.lang.String r0 = "[:digit:]"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0042
            boolean r0 = java.lang.Character.isDigit(r5)
            return r0
        L_0x0050:
            java.lang.String r0 = "[:^S:]"
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88674au.A00(int):boolean");
    }
}
