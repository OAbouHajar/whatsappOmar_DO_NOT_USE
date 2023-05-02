package com.facebook.redex;

import java.util.Comparator;

public class IDxComparatorShape20S0000000_2_I1 implements Comparator {
    public final int A00;

    public IDxComparatorShape20S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x01b4;
                case 1: goto L_0x019d;
                case 2: goto L_0x0192;
                case 3: goto L_0x0188;
                case 4: goto L_0x003a;
                case 5: goto L_0x0029;
                case 6: goto L_0x017e;
                case 7: goto L_0x0171;
                case 8: goto L_0x0159;
                case 9: goto L_0x0145;
                case 10: goto L_0x0020;
                case 11: goto L_0x0131;
                case 12: goto L_0x0145;
                case 13: goto L_0x0145;
                case 14: goto L_0x00ed;
                case 15: goto L_0x00db;
                case 16: goto L_0x00ce;
                case 17: goto L_0x00c3;
                case 18: goto L_0x00b4;
                case 19: goto L_0x00a9;
                case 20: goto L_0x009c;
                case 21: goto L_0x0091;
                case 22: goto L_0x0005;
                case 23: goto L_0x007c;
                case 24: goto L_0x0063;
                case 25: goto L_0x0058;
                case 26: goto L_0x0047;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1jm r8 = (X.C34151jm) r8
            X.1jm r9 = (X.C34151jm) r9
            if (r8 == r9) goto L_0x003a
            if (r8 == 0) goto L_0x01d0
            if (r9 == 0) goto L_0x0045
            java.lang.String r1 = r8.A0E
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = ""
        L_0x0015:
            java.lang.String r0 = r9.A0E
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = ""
        L_0x001b:
            int r4 = r1.compareTo(r0)
        L_0x001f:
            return r4
        L_0x0020:
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Number r9 = (java.lang.Number) r9
            if (r8 != 0) goto L_0x01c1
            if (r9 != 0) goto L_0x0045
            goto L_0x003a
        L_0x0029:
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r2 = r8.intValue()
            r4 = -1
            if (r2 != r4) goto L_0x003c
            int r0 = r9.intValue()
            if (r0 != r4) goto L_0x001f
        L_0x003a:
            r4 = 0
            return r4
        L_0x003c:
            int r1 = r9.intValue()
            r0 = -1
            int r4 = r2 - r1
            if (r1 != r0) goto L_0x001f
        L_0x0045:
            r4 = 1
            return r4
        L_0x0047:
            android.util.Pair r8 = (android.util.Pair) r8
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r1 = r9.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r8.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r1.compareTo(r0)
            return r4
        L_0x0058:
            X.1jn r8 = (X.C34161jn) r8
            X.1jn r9 = (X.C34161jn) r9
            long r2 = r9.A00
            long r0 = r8.A00
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x0063:
            java.io.File r8 = (java.io.File) r8
            java.io.File r9 = (java.io.File) r9
            long r0 = r8.lastModified()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r9.lastModified()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = r2.compareTo(r0)
            return r4
        L_0x007c:
            X.1jo r8 = (X.C34171jo) r8
            int r0 = r8.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1jo r9 = (X.C34171jo) r9
            int r0 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.C34181jp.A00(r1, r0)
            return r4
        L_0x0091:
            X.1jq r8 = (X.C34191jq) r8
            X.1jq r9 = (X.C34191jq) r9
            long r2 = r8.A00
            long r0 = r9.A00
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x009c:
            com.obwhatsapp.location.PlaceInfo r8 = (com.obwhatsapp.location.PlaceInfo) r8
            com.obwhatsapp.location.PlaceInfo r9 = (com.obwhatsapp.location.PlaceInfo) r9
            double r2 = r8.A00
            double r0 = r9.A00
            int r4 = java.lang.Double.compare(r2, r0)
            return r4
        L_0x00a9:
            X.0tZ r8 = (X.C16740tZ) r8
            X.0tZ r9 = (X.C16740tZ) r9
            long r2 = r8.A13
            long r0 = r9.A13
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x00b4:
            java.io.File r8 = (java.io.File) r8
            java.io.File r9 = (java.io.File) r9
            long r2 = r9.lastModified()
            long r0 = r8.lastModified()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x00c3:
            X.1js r8 = (X.C34201js) r8
            X.1js r9 = (X.C34201js) r9
            long r2 = r9.A00
            long r0 = r8.A00
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x00ce:
            X.1cl r8 = (X.C30671cl) r8
            X.1cl r9 = (X.C30671cl) r9
            java.lang.String r1 = r8.A0A
            java.lang.String r0 = r9.A0A
            int r4 = r1.compareTo(r0)
            return r4
        L_0x00db:
            X.1Vv r8 = (X.C28371Vv) r8
            X.1Vv r9 = (X.C28371Vv) r9
            java.lang.String r0 = "id"
            int r4 = r8.A09(r0)     // Catch:{ 1W9 -> 0x00eb }
            int r0 = r9.A09(r0)     // Catch:{ 1W9 -> 0x00eb }
            int r4 = r4 - r0
            return r4
        L_0x00eb:
            r4 = 0
            return r4
        L_0x00ed:
            X.1XC r8 = (X.AnonymousClass1XC) r8
            X.1XC r9 = (X.AnonymousClass1XC) r9
            int r0 = r8.A00
            r3 = 1
            r0 = r0 & 1
            if (r0 == r3) goto L_0x00f9
            r3 = 0
        L_0x00f9:
            r1 = 0
            if (r3 == 0) goto L_0x012e
            X.1jt r0 = r8.A08
            r4 = r0
            if (r0 != 0) goto L_0x0104
            X.1jt r0 = X.C34211jt.A02
        L_0x0104:
            int r0 = r0.A00
            r3 = 1
            r0 = r0 & 1
            if (r0 != r3) goto L_0x012e
            if (r4 != 0) goto L_0x010f
            X.1jt r4 = X.C34211jt.A02
        L_0x010f:
            long r5 = r4.A01
        L_0x0111:
            int r0 = r9.A00
            r4 = 1
            r0 = r0 & 1
            if (r0 != r4) goto L_0x012b
            X.1jt r0 = r9.A08
            r3 = r0
            if (r0 != 0) goto L_0x011f
            X.1jt r0 = X.C34211jt.A02
        L_0x011f:
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 != r4) goto L_0x012b
            if (r3 != 0) goto L_0x0129
            X.1jt r3 = X.C34211jt.A02
        L_0x0129:
            long r1 = r3.A01
        L_0x012b:
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            return r4
        L_0x012e:
            r5 = 0
            goto L_0x0111
        L_0x0131:
            X.1US r8 = (X.AnonymousClass1US) r8
            X.1US r9 = (X.AnonymousClass1US) r9
            r0 = 10
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r2 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r2.<init>(r0)
            java.lang.Double r1 = r9.A02
            java.lang.Double r0 = r8.A02
            int r4 = r2.compare(r1, r0)
            return r4
        L_0x0145:
            X.1US r8 = (X.AnonymousClass1US) r8
            X.1US r9 = (X.AnonymousClass1US) r9
            r0 = 10
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r2 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r2.<init>(r0)
            java.lang.Double r1 = r8.A02
            java.lang.Double r0 = r9.A02
            int r4 = r2.compare(r1, r0)
            return r4
        L_0x0159:
            X.1ju r8 = (X.C34221ju) r8
            X.1ju r9 = (X.C34221ju) r9
            java.lang.Integer r0 = r8.A03
            X.AnonymousClass00B.A06(r0)
            int r4 = r0.intValue()
            java.lang.Integer r0 = r9.A03
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.intValue()
            int r4 = r4 - r0
            return r4
        L_0x0171:
            X.1jv r8 = (X.C34231jv) r8
            X.1jv r9 = (X.C34231jv) r9
            float r1 = r8.A00
            float r0 = r9.A00
            int r4 = java.lang.Float.compare(r1, r0)
            return r4
        L_0x017e:
            X.1jv r8 = (X.C34231jv) r8
            X.1jv r9 = (X.C34231jv) r9
            int r4 = r8.A01
            int r0 = r9.A01
            int r4 = r4 - r0
            return r4
        L_0x0188:
            X.1gT r8 = (X.C32491gT) r8
            X.1gT r9 = (X.C32491gT) r9
            int r4 = r9.A05
            int r0 = r8.A05
            int r4 = r4 - r0
            return r4
        L_0x0192:
            X.1jw r8 = (X.C34241jw) r8
            X.1jw r9 = (X.C34241jw) r9
            long r2 = r8.A01
            long r0 = r9.A01
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x019d:
            X.1k0 r8 = (X.C34281k0) r8
            X.1k0 r9 = (X.C34281k0) r9
            java.lang.Long r2 = r8.A01
            java.lang.Long r1 = r9.A01
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x01af
            java.lang.Long r1 = r9.A00
            java.lang.Long r2 = r8.A00
        L_0x01af:
            int r4 = r1.compareTo(r2)
            return r4
        L_0x01b4:
            X.1k0 r8 = (X.C34281k0) r8
            X.1k0 r9 = (X.C34281k0) r9
            java.lang.Long r1 = r8.A00
            java.lang.Long r0 = r9.A00
            int r4 = r1.compareTo(r0)
            return r4
        L_0x01c1:
            if (r9 == 0) goto L_0x01d0
            double r2 = r8.doubleValue()
            double r0 = r9.doubleValue()
            int r4 = java.lang.Double.compare(r2, r0)
            return r4
        L_0x01d0:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxComparatorShape20S0000000_2_I1.compare(java.lang.Object, java.lang.Object):int");
    }
}
