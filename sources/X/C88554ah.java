package X;

import java.util.HashMap;

/* renamed from: X.4ah  reason: invalid class name and case insensitive filesystem */
public class C88554ah {
    public static final int[][] A01;
    public static final int[][] A02;
    public static final int[][] A03 = {new int[]{9785}, new int[]{128547}, new int[]{128534}, new int[]{128555}, new int[]{128553}, new int[]{128546}, new int[]{128557}, new int[]{128542}, new int[]{128532}, new int[]{128543}, new int[]{128533}, new int[]{128548}, new int[]{128544}, new int[]{128549}, new int[]{128560}, new int[]{128552}, new int[]{128575}, new int[]{128574}, new int[]{128531}, new int[]{128589, 8205, 9794}, new int[]{128589, 8205, 9792}};
    public static final int[][] A04 = {new int[]{128559}, new int[]{128550}, new int[]{128551}, new int[]{128558}, new int[]{128562}, new int[]{128576}, new int[]{128561}, new int[]{129327}, new int[]{128563}, new int[]{128576}, new int[]{10071}, new int[]{10069}, new int[]{129325}};
    public HashMap A00;

    static {
        int[][] iArr = new int[31][];
        iArr[0] = new int[]{10084};
        iArr[1] = new int[]{128525};
        iArr[2] = new int[]{128536};
        iArr[3] = new int[]{128149};
        iArr[4] = new int[]{128571};
        iArr[5] = new int[]{128145};
        iArr[6] = new int[]{128105, 8205, 10084, 8205, 128105};
        iArr[7] = new int[]{128104, 8205, 10084, 8205, 128104};
        iArr[8] = new int[]{128143};
        iArr[9] = new int[]{128105, 8205, 10084, 8205, 128139, 8205, 128105};
        iArr[10] = new int[]{128104, 8205, 10084, 8205, 128139, 8205, 128104};
        iArr[11] = new int[]{10084};
        iArr[12] = new int[]{129505};
        iArr[13] = new int[]{128155};
        iArr[14] = new int[]{128154};
        iArr[15] = new int[]{128153};
        iArr[16] = new int[]{128156};
        iArr[17] = new int[]{128420};
        iArr[18] = new int[]{128148};
        iArr[19] = new int[]{10083};
        iArr[20] = new int[]{128149};
        iArr[21] = new int[]{128158};
        int[] A1Y = AnonymousClass3K3.A1Y(AnonymousClass3K3.A1W(AnonymousClass3K3.A1V(AnonymousClass3K4.A1F(AnonymousClass3K4.A1G(AnonymousClass3K3.A1X(new int[1], iArr, 128147, 1), iArr, 128151, 1), iArr, 128150), iArr, 128152), iArr, 128157), iArr, 128159, 1);
        A1Y[0] = 9829;
        iArr[28] = A1Y;
        iArr[29] = new int[]{128140};
        iArr[30] = new int[]{128139};
        A02 = iArr;
        int[][] iArr2 = new int[18][];
        iArr2[2] = AnonymousClass3K3.A1U(new int[1], iArr2);
        iArr2[3] = new int[]{128513};
        iArr2[4] = new int[]{128518};
        iArr2[5] = new int[]{128517};
        iArr2[6] = new int[]{128514};
        iArr2[7] = new int[]{129315};
        iArr2[8] = new int[]{128578};
        iArr2[9] = new int[]{128539};
        iArr2[10] = new int[]{128541};
        iArr2[11] = new int[]{128540};
        iArr2[12] = new int[]{129322};
        iArr2[13] = new int[]{129303};
        iArr2[14] = new int[]{128570};
        iArr2[15] = new int[]{128568};
        iArr2[16] = new int[]{128569};
        iArr2[17] = new int[]{9786};
        A01 = iArr2;
    }

    public C88554ah() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            this.A00 = AnonymousClass000.A0x();
        } else {
            hashMap.clear();
        }
        A00(A01, 1);
        A00(A04, 8);
        A00(A03, 4);
        A00(A02, 2);
    }

    public final void A00(int[][] iArr, int i2) {
        for (int[] r0 : iArr) {
            C37781pj r2 = new C37781pj(r0);
            HashMap hashMap = this.A00;
            C13680ns.A1X(r2, hashMap, (hashMap.containsKey(r2) ? AnonymousClass000.A0D(hashMap.get(r2)) : 0) | i2);
        }
    }
}
