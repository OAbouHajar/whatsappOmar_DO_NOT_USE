package com.google.zxing.qrcode.decoder;

import X.C801242q;

public class IDxDMaskShape9S0000000_2_I1 extends C801242q {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxDMaskShape9S0000000_2_I1(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0010;
                case 2: goto L_0x0014;
                case 3: goto L_0x0018;
                case 4: goto L_0x001c;
                case 5: goto L_0x0020;
                case 6: goto L_0x0024;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = "DATA_MASK_111"
            r0 = 7
        L_0x0008:
            r2.<init>(r1, r0)
            return
        L_0x000c:
            java.lang.String r1 = "DATA_MASK_000"
            r0 = 0
            goto L_0x0008
        L_0x0010:
            java.lang.String r1 = "DATA_MASK_001"
            r0 = 1
            goto L_0x0008
        L_0x0014:
            java.lang.String r1 = "DATA_MASK_010"
            r0 = 2
            goto L_0x0008
        L_0x0018:
            java.lang.String r1 = "DATA_MASK_011"
            r0 = 3
            goto L_0x0008
        L_0x001c:
            java.lang.String r1 = "DATA_MASK_100"
            r0 = 4
            goto L_0x0008
        L_0x0020:
            java.lang.String r1 = "DATA_MASK_101"
            r0 = 5
            goto L_0x0008
        L_0x0024:
            java.lang.String r1 = "DATA_MASK_110"
            r0 = 6
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.IDxDMaskShape9S0000000_2_I1.<init>(int):void");
    }

    public boolean A00(int i2, int i3) {
        int i4;
        switch (this.A00) {
            case 0:
                i2 += i3;
                break;
            case 1:
                break;
            case 2:
                i4 = i3 % 3;
                break;
            case 3:
                i4 = (i2 + i3) % 3;
                break;
            case 4:
                i4 = ((i2 >> 1) + (i3 / 3)) & 1;
                break;
            case 5:
                i4 = (i2 * i3) % 6;
                break;
            case 6:
                return (i2 * i3) % 6 < 3;
            default:
                return (((i2 + i3) + ((i2 * i3) % 3)) & 1) == 0;
        }
        i4 = i2 & 1;
        return i4 == 0;
    }
}
