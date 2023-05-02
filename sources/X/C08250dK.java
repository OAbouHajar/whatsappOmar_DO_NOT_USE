package X;

import android.graphics.Path;
import android.os.Build;
import java.util.List;

/* renamed from: X.0dK  reason: invalid class name and case insensitive filesystem */
public class C08250dK implements C13520mW, C12640kj {
    public final Path A00 = AnonymousClass000.A0I();
    public final Path A01 = AnonymousClass000.A0I();
    public final Path A02 = AnonymousClass000.A0I();
    public final C08490dj A03;
    public final String A04;
    public final List A05 = AnonymousClass000.A0u();

    public C08250dK(C08490dj r3) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A04 = r3.A01;
            this.A03 = r3;
            return;
        }
        throw AnonymousClass000.A0V("Merge paths are not supported pre-KitKat.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4J(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.previous()
            boolean r0 = r1 instanceof X.C13520mW
            if (r0 == 0) goto L_0x000d
            java.util.List r0 = r2.A05
            r0.add(r1)
            r3.remove()
            goto L_0x000d
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08250dK.A4J(java.util.ListIterator):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r6 = r12.A02;
        r6.reset();
        r5 = r12.A00;
        r5.reset();
        r9 = r12.A05;
        r10 = r9.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r10 < 1) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r11 = (X.C13520mW) r9.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if ((r11 instanceof X.C08310dQ) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r11 = (X.C08310dQ) r11;
        r3 = r11.A00();
        r2 = r3.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r2 < 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r1 = ((X.C13520mW) r3.get(r2)).AEK();
        r0 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r0 = r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r1.transform(r0);
        r6.addPath(r1);
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r0 = r11.A04;
        r0.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        r6.addPath(r11.AEK());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        r10 = r10 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r4 = 0;
        r3 = (X.C13520mW) r9.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        if ((r3 instanceof X.C08310dQ) == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        r3 = (X.C08310dQ) r3;
        r2 = r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (r4 >= r2.size()) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r1 = ((X.C13520mW) r2.get(r4)).AEK();
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (r0 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        r0 = r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r1.transform(r0);
        r5.addPath(r1);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        r0 = r3.A04;
        r0.reset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r5.set(r3.AEK());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        r8.op(r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Path AEK() {
        /*
            r12 = this;
            android.graphics.Path r8 = r12.A01
            r8.reset()
            X.0dj r1 = r12.A03
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0014
            X.0K4 r0 = r1.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0031;
                case 2: goto L_0x0034;
                case 3: goto L_0x002e;
                case 4: goto L_0x0037;
                default: goto L_0x0014;
            }
        L_0x0014:
            return r8
        L_0x0015:
            r2 = 0
        L_0x0016:
            java.util.List r1 = r12.A05
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0014
            java.lang.Object r0 = r1.get(r2)
            X.0mW r0 = (X.C13520mW) r0
            android.graphics.Path r0 = r0.AEK()
            r8.addPath(r0)
            int r2 = r2 + 1
            goto L_0x0016
        L_0x002e:
            android.graphics.Path$Op r7 = android.graphics.Path.Op.INTERSECT
            goto L_0x0039
        L_0x0031:
            android.graphics.Path$Op r7 = android.graphics.Path.Op.UNION
            goto L_0x0039
        L_0x0034:
            android.graphics.Path$Op r7 = android.graphics.Path.Op.REVERSE_DIFFERENCE
            goto L_0x0039
        L_0x0037:
            android.graphics.Path$Op r7 = android.graphics.Path.Op.XOR
        L_0x0039:
            android.graphics.Path r6 = r12.A02
            r6.reset()
            android.graphics.Path r5 = r12.A00
            r5.reset()
            java.util.List r9 = r12.A05
            int r10 = r9.size()
            r4 = 1
            int r10 = r10 - r4
        L_0x004b:
            if (r10 < r4) goto L_0x008f
            java.lang.Object r11 = r9.get(r10)
            X.0mW r11 = (X.C13520mW) r11
            boolean r0 = r11 instanceof X.C08310dQ
            if (r0 == 0) goto L_0x0085
            X.0dQ r11 = (X.C08310dQ) r11
            java.util.List r3 = r11.A00()
            int r2 = r3.size()
            int r2 = r2 - r4
        L_0x0062:
            if (r2 < 0) goto L_0x008c
            java.lang.Object r0 = r3.get(r2)
            X.0mW r0 = (X.C13520mW) r0
            android.graphics.Path r1 = r0.AEK()
            X.0S6 r0 = r11.A02
            if (r0 == 0) goto L_0x007f
            android.graphics.Matrix r0 = r0.A00()
        L_0x0076:
            r1.transform(r0)
            r6.addPath(r1)
            int r2 = r2 + -1
            goto L_0x0062
        L_0x007f:
            android.graphics.Matrix r0 = r11.A04
            r0.reset()
            goto L_0x0076
        L_0x0085:
            android.graphics.Path r0 = r11.AEK()
            r6.addPath(r0)
        L_0x008c:
            int r10 = r10 + -1
            goto L_0x004b
        L_0x008f:
            r4 = 0
            java.lang.Object r3 = r9.get(r4)
            X.0mW r3 = (X.C13520mW) r3
            boolean r0 = r3 instanceof X.C08310dQ
            if (r0 == 0) goto L_0x00c7
            X.0dQ r3 = (X.C08310dQ) r3
            java.util.List r2 = r3.A00()
        L_0x00a0:
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x00ce
            java.lang.Object r0 = r2.get(r4)
            X.0mW r0 = (X.C13520mW) r0
            android.graphics.Path r1 = r0.AEK()
            X.0S6 r0 = r3.A02
            if (r0 == 0) goto L_0x00c1
            android.graphics.Matrix r0 = r0.A00()
        L_0x00b8:
            r1.transform(r0)
            r5.addPath(r1)
            int r4 = r4 + 1
            goto L_0x00a0
        L_0x00c1:
            android.graphics.Matrix r0 = r3.A04
            r0.reset()
            goto L_0x00b8
        L_0x00c7:
            android.graphics.Path r0 = r3.AEK()
            r5.set(r0)
        L_0x00ce:
            r8.op(r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08250dK.AEK():android.graphics.Path");
    }

    public void Adk(List list, List list2) {
        int i2 = 0;
        while (true) {
            List list3 = this.A05;
            if (i2 < list3.size()) {
                ((C13150lY) list3.get(i2)).Adk(list, list2);
                i2++;
            } else {
                return;
            }
        }
    }

    public String getName() {
        return this.A04;
    }
}
