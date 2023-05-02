package X;

import android.graphics.Path;

/* renamed from: X.07g  reason: invalid class name and case insensitive filesystem */
public class C015107g {
    public static Path A00(String str) {
        Path path = new Path();
        C015207h[] A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            C015207h.A01(path, A02);
            return path;
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder("Error in parsing ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public static boolean A01(C015207h[] r5, C015207h[] r6) {
        int length;
        if (!(r5 == null || r6 == null || (length = r5.length) != r6.length)) {
            int i2 = 0;
            while (i2 < length) {
                if (r5[i2].A00 == r6[i2].A00 && r5[i2].A01.length == r6[i2].A01.length) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r13 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C015207h[] A02(java.lang.String r15) {
        /*
            if (r15 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r9 = 1
            r8 = 0
            r7 = 1
            r5 = 0
        L_0x000d:
            int r3 = r15.length()
            if (r7 < r3) goto L_0x0033
            int r7 = r7 - r5
            if (r7 != r9) goto L_0x0026
            if (r5 >= r3) goto L_0x0026
            char r2 = r15.charAt(r5)
            float[] r1 = new float[r8]
            X.07h r0 = new X.07h
            r0.<init>(r1, r2)
            r4.add(r0)
        L_0x0026:
            int r0 = r4.size()
            X.07h[] r0 = new X.C015207h[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.07h[] r0 = (X.C015207h[]) r0
            return r0
        L_0x0033:
            if (r7 >= r3) goto L_0x004f
            char r2 = r15.charAt(r7)
            int r1 = r2 + -65
            int r0 = r2 + -90
            int r1 = r1 * r0
            if (r1 <= 0) goto L_0x0047
            int r1 = r2 + -97
            int r0 = r2 + -122
            int r1 = r1 * r0
            if (r1 > 0) goto L_0x006e
        L_0x0047:
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x006e
            r0 = 69
            if (r2 == r0) goto L_0x006e
        L_0x004f:
            java.lang.String r0 = r15.substring(r5, r7)
            java.lang.String r5 = r0.trim()
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00d5
            char r1 = r5.charAt(r8)
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x00c7
            char r1 = r5.charAt(r8)
            r0 = 90
            if (r1 == r0) goto L_0x00c7
            goto L_0x0071
        L_0x006e:
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0071:
            int r10 = r5.length()     // Catch:{ NumberFormatException -> 0x00e1 }
            float[] r6 = new float[r10]     // Catch:{ NumberFormatException -> 0x00e1 }
            r11 = 1
            r3 = 0
        L_0x0079:
            if (r11 >= r10) goto L_0x00bb
            r14 = 0
            r2 = r11
            r13 = 0
            r12 = 0
        L_0x007f:
            if (r2 >= r10) goto L_0x008f
            char r1 = r5.charAt(r2)     // Catch:{ NumberFormatException -> 0x00e1 }
            r0 = 32
            if (r1 == r0) goto L_0x008f
            goto L_0x0092
        L_0x008a:
            if (r2 == r11) goto L_0x009d
            if (r13 != 0) goto L_0x009d
        L_0x008e:
            r14 = 1
        L_0x008f:
            if (r11 >= r2) goto L_0x00b5
            goto L_0x00a8
        L_0x0092:
            r0 = 69
            if (r1 == r0) goto L_0x00a6
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x00a6
            switch(r1) {
                case 44: goto L_0x008f;
                case 45: goto L_0x008a;
                case 46: goto L_0x00a1;
                default: goto L_0x009d;
            }     // Catch:{ NumberFormatException -> 0x00e1 }
        L_0x009d:
            r13 = 0
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x007f
        L_0x00a1:
            if (r12 != 0) goto L_0x008e
            r13 = 0
            r12 = 1
            goto L_0x009e
        L_0x00a6:
            r13 = 1
            goto L_0x009e
        L_0x00a8:
            int r1 = r3 + 1
            java.lang.String r0 = r5.substring(r11, r2)     // Catch:{ NumberFormatException -> 0x00e1 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x00e1 }
            r6[r3] = r0     // Catch:{ NumberFormatException -> 0x00e1 }
            r3 = r1
        L_0x00b5:
            int r11 = r2 + 1
            if (r14 == 0) goto L_0x0079
            r11 = r2
            goto L_0x0079
        L_0x00bb:
            if (r8 > r3) goto L_0x00db
            int r0 = java.lang.Math.min(r3, r10)     // Catch:{ NumberFormatException -> 0x00e1 }
            float[] r2 = new float[r3]     // Catch:{ NumberFormatException -> 0x00e1 }
            java.lang.System.arraycopy(r6, r8, r2, r8, r0)     // Catch:{ NumberFormatException -> 0x00e1 }
            goto L_0x00c9
        L_0x00c7:
            float[] r2 = new float[r8]
        L_0x00c9:
            char r1 = r5.charAt(r8)
            X.07h r0 = new X.07h
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x00d5:
            int r0 = r7 + 1
            r5 = r7
            r7 = r0
            goto L_0x000d
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x00e1 }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x00e1 }
            throw r0     // Catch:{ NumberFormatException -> 0x00e1 }
        L_0x00e1:
            r2 = move-exception
            java.lang.String r0 = "error in parsing \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = "\""
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015107g.A02(java.lang.String):X.07h[]");
    }
}
