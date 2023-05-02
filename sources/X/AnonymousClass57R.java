package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57R  reason: invalid class name */
public abstract class AnonymousClass57R implements Iterator {
    public int A00 = 2;
    public Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r6 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r5 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1 >= r5) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r0 = r3[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r5 = X.AnonymousClass000.A0d(r0);
        r4 = java.lang.Integer.toHexString(java.lang.System.identityHashCode(r0));
        r2 = X.C13690nt.A0g((r5.length() + 1) + X.C13680ns.A06(r4));
        r2.append(r5);
        r2.append('@');
        r4 = X.AnonymousClass000.A0h(r4, r2);
        r9 = java.util.logging.Logger.getLogger("com.google.common.base.Strings");
        r10 = java.util.logging.Level.WARNING;
        r0 = r4.length();
        r9.logp(r10, "com.google.common.base.Strings", "lenientToString", X.AnonymousClass3K3.A0o("Exception during lenientFormat for ", r4, r0), r14);
        r5 = X.AnonymousClass000.A0d(r14);
        r2 = X.C13690nt.A0g((r0 + 9) + r5.length());
        r2.append("<");
        r2.append(r4);
        r2.append(" threw ");
        r2.append(r5);
        r0 = X.AnonymousClass000.A0h(">", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        if (r4 >= r1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e3, code lost:
        r3.charAt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r4 >= r1) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        r3.charAt(r1 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
        if (r5.A04 == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0100, code lost:
        r10 = r8.length();
        r4 = X.C13690nt.A0g((r5 << 4) + r10);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010c, code lost:
        if (r6 >= r5) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010e, code lost:
        r2 = r8.indexOf("%s", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r2 == -1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0116, code lost:
        r4.append(r8, r9, r2);
        r4.append(r3[r6]);
        r9 = r2 + 2;
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0124, code lost:
        r4.append(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        if (r6 >= r5) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        r4.append(" [");
        r2 = r6 + 1;
        r4.append(r3[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        if (r2 >= r5) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0137, code lost:
        r4.append(", ");
        r4.append(r3[r2]);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
        r4.append(']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        throw new java.lang.IndexOutOfBoundsException(r4.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r15 = this;
            int r0 = r15.A00
            r1 = 4
            if (r0 == r1) goto L_0x018f
            int r0 = r0 + -1
            r2 = 1
            if (r0 == 0) goto L_0x018d
            r6 = 2
            r11 = 0
            if (r0 == r6) goto L_0x018e
            r15.A00 = r1
            r5 = r15
            X.3Zk r5 = (X.C66453Zk) r5
        L_0x0013:
            int r4 = r5.A00
        L_0x0015:
            int r1 = r5.A00
            r7 = -1
            if (r1 == r7) goto L_0x0180
            X.4C3 r0 = r5.A05
            X.45H r10 = r0.A00
            java.lang.CharSequence r3 = r5.A03
            int r8 = r3.length()
            java.lang.String r9 = "index"
            if (r1 < 0) goto L_0x00f5
            if (r1 <= r8) goto L_0x00b3
            if (r8 < 0) goto L_0x0154
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r11] = r9
            X.AnonymousClass000.A1M(r3, r1, r2)
            X.AnonymousClass000.A1M(r3, r8, r6)
            java.lang.String r8 = "%s (%s) must not be greater than size (%s)"
        L_0x0039:
            r6 = 0
            r1 = 0
        L_0x003b:
            int r5 = r3.length
            if (r1 >= r5) goto L_0x0100
            r0 = r3[r1]
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "null"
        L_0x0044:
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0049:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x004e }
            goto L_0x0044
        L_0x004e:
            r14 = move-exception
            java.lang.String r5 = X.AnonymousClass000.A0d(r0)
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r4 = java.lang.Integer.toHexString(r0)
            int r0 = r5.length()
            int r2 = X.C13680ns.A06(r4)
            int r0 = r0 + 1
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = X.C13690nt.A0g(r0)
            r2.append(r5)
            r0 = 64
            r2.append(r0)
            java.lang.String r4 = X.AnonymousClass000.A0h(r4, r2)
            java.lang.String r11 = "com.google.common.base.Strings"
            java.util.logging.Logger r9 = java.util.logging.Logger.getLogger(r11)
            java.util.logging.Level r10 = java.util.logging.Level.WARNING
            java.lang.String r2 = "Exception during lenientFormat for "
            int r0 = r4.length()
            java.lang.String r13 = X.AnonymousClass3K3.A0o(r2, r4, r0)
            java.lang.String r12 = "lenientToString"
            r9.logp(r10, r11, r12, r13, r14)
            java.lang.String r5 = X.AnonymousClass000.A0d(r14)
            int r2 = r5.length()
            int r0 = r0 + 9
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "<"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " threw "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = ">"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            goto L_0x0044
        L_0x00b3:
            if (r1 >= r8) goto L_0x00d9
            char r9 = r3.charAt(r1)
            r0 = r10
            X.3Zl r0 = (X.C66463Zl) r0
            char r0 = r0.A00
            if (r9 != r0) goto L_0x00d6
            if (r1 == r7) goto L_0x00d9
            int r0 = r1 + 1
            r5.A00 = r0
        L_0x00c6:
            if (r0 != r4) goto L_0x00e1
            int r1 = r0 + 1
            r5.A00 = r1
            int r0 = r3.length()
            if (r1 <= r0) goto L_0x0015
            r5.A00 = r7
            goto L_0x0015
        L_0x00d6:
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00d9:
            int r1 = r3.length()
            r5.A00 = r7
            r0 = -1
            goto L_0x00c6
        L_0x00e1:
            if (r4 >= r1) goto L_0x00e6
            r3.charAt(r4)
        L_0x00e6:
            if (r4 >= r1) goto L_0x00ed
            int r0 = r1 + -1
            r3.charAt(r0)
        L_0x00ed:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0165
            if (r4 != r1) goto L_0x0165
            goto L_0x0013
        L_0x00f5:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r11] = r9
            X.AnonymousClass000.A1M(r3, r1, r2)
            java.lang.String r8 = "%s (%s) must not be negative"
            goto L_0x0039
        L_0x0100:
            int r10 = r8.length()
            int r0 = r5 << 4
            int r0 = r0 + r10
            java.lang.StringBuilder r4 = X.C13690nt.A0g(r0)
            r9 = 0
        L_0x010c:
            if (r6 >= r5) goto L_0x0124
            java.lang.String r0 = "%s"
            int r2 = r8.indexOf(r0, r9)
            if (r2 == r7) goto L_0x0124
            r4.append(r8, r9, r2)
            int r1 = r6 + 1
            r0 = r3[r6]
            r4.append(r0)
            int r9 = r2 + 2
            r6 = r1
            goto L_0x010c
        L_0x0124:
            r4.append(r8, r9, r10)
            if (r6 >= r5) goto L_0x014a
            java.lang.String r0 = " ["
            r4.append(r0)
            int r2 = r6 + 1
            r0 = r3[r6]
            r4.append(r0)
        L_0x0135:
            if (r2 >= r5) goto L_0x0145
            java.lang.String r0 = ", "
            r4.append(r0)
            int r1 = r2 + 1
            r0 = r3[r2]
            r4.append(r0)
            r2 = r1
            goto L_0x0135
        L_0x0145:
            r0 = 93
            r4.append(r0)
        L_0x014a:
            java.lang.String r1 = r4.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0154:
            r0 = 26
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "negative size: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r8)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0165:
            int r0 = r5.A01
            if (r0 != r2) goto L_0x017b
            int r1 = r3.length()
            r5.A00 = r7
            if (r1 <= r4) goto L_0x0176
            int r0 = r1 + -1
            r3.charAt(r0)
        L_0x0176:
            java.lang.String r0 = X.AnonymousClass3K4.A0Y(r3, r4, r1)
            goto L_0x0184
        L_0x017b:
            int r0 = r0 + -1
            r5.A01 = r0
            goto L_0x0176
        L_0x0180:
            r0 = 3
            r5.A00 = r0
            r0 = 0
        L_0x0184:
            r15.A01 = r0
            int r1 = r15.A00
            r0 = 3
            if (r1 == r0) goto L_0x018e
            r15.A00 = r2
        L_0x018d:
            return r2
        L_0x018e:
            return r11
        L_0x018f:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass57R.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.A00 = 2;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw C13680ns.A0m();
    }
}
