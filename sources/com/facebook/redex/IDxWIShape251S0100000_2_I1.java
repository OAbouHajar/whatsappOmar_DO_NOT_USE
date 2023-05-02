package com.facebook.redex;

import X.AnonymousClass5R0;
import X.C90044dP;

public class IDxWIShape251S0100000_2_I1 implements AnonymousClass5R0 {
    public Object A00;
    public final int A01;

    public IDxWIShape251S0100000_2_I1(C90044dP r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r6.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e7, code lost:
        r6.append(']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void AiI(java.lang.Appendable r6, java.lang.Object r7, X.C89984dJ r8) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000b;
                case 1: goto L_0x0018;
                case 2: goto L_0x002c;
                case 3: goto L_0x003f;
                case 4: goto L_0x005b;
                case 5: goto L_0x0077;
                case 6: goto L_0x0093;
                case 7: goto L_0x00af;
                case 8: goto L_0x00cb;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r7 = (java.lang.String) r7
            r8.A00(r6, r7)
            return
        L_0x000b:
            java.lang.Double r7 = (java.lang.Double) r7
            boolean r0 = r7.isInfinite()
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = r7.toString()
            goto L_0x0038
        L_0x0018:
            r2 = 34
            r6.append(r2)
            java.lang.String r1 = r7.toString()
            if (r1 == 0) goto L_0x0028
            X.5Qz r0 = r8.A02
            r0.A8h(r6, r1)
        L_0x0028:
            r6.append(r2)
            return
        L_0x002c:
            java.lang.Float r7 = (java.lang.Float) r7
            boolean r0 = r7.isInfinite()
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = r7.toString()
        L_0x0038:
            r6.append(r0)
            return
        L_0x003c:
            java.lang.String r0 = "null"
            goto L_0x0038
        L_0x003f:
            int[] r7 = (int[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x0049:
            if (r2 >= r3) goto L_0x00e7
            r0 = r7[r2]
            boolean r1 = X.AnonymousClass3K3.A1S(r6, r1)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x0049
        L_0x005b:
            short[] r7 = (short[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x0065:
            if (r2 >= r3) goto L_0x00e7
            short r0 = r7[r2]
            boolean r1 = X.AnonymousClass3K3.A1S(r6, r1)
            java.lang.String r0 = java.lang.Short.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0077:
            long[] r7 = (long[]) r7
            r0 = 91
            r6.append(r0)
            int r4 = r7.length
            r3 = 0
            r2 = 0
        L_0x0081:
            if (r3 >= r4) goto L_0x00e7
            r0 = r7[r3]
            boolean r2 = X.AnonymousClass3K3.A1S(r6, r2)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r6.append(r0)
            int r3 = r3 + 1
            goto L_0x0081
        L_0x0093:
            float[] r7 = (float[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x009d:
            if (r2 >= r3) goto L_0x00e7
            r0 = r7[r2]
            boolean r1 = X.AnonymousClass3K3.A1S(r6, r1)
            java.lang.String r0 = java.lang.Float.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00af:
            double[] r7 = (double[]) r7
            r0 = 91
            r6.append(r0)
            int r4 = r7.length
            r3 = 0
            r2 = 0
        L_0x00b9:
            if (r3 >= r4) goto L_0x00e7
            r0 = r7[r3]
            boolean r2 = X.AnonymousClass3K3.A1S(r6, r2)
            java.lang.String r0 = java.lang.Double.toString(r0)
            r6.append(r0)
            int r3 = r3 + 1
            goto L_0x00b9
        L_0x00cb:
            boolean[] r7 = (boolean[]) r7
            r0 = 91
            r6.append(r0)
            int r3 = r7.length
            r2 = 0
            r1 = 0
        L_0x00d5:
            if (r2 >= r3) goto L_0x00e7
            boolean r0 = r7[r2]
            boolean r1 = X.AnonymousClass3K3.A1S(r6, r1)
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x00d5
        L_0x00e7:
            r0 = 93
            r6.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxWIShape251S0100000_2_I1.AiI(java.lang.Appendable, java.lang.Object, X.4dJ):void");
    }
}
