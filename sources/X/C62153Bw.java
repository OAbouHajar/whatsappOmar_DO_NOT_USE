package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.3Bw  reason: invalid class name and case insensitive filesystem */
public class C62153Bw {
    public static final int[] A00 = {129777, 8205, 129778};
    public static final int[] A01 = {128104, 8205, 129309, 8205, 128104};
    public static final int[] A02 = {128104, 8205, 10084, 65039, 8205, 128104};
    public static final int[] A03 = {129489, 8205, 10084, 65039, 8205, 128139, 8205, 129489};
    public static final int[] A04 = {129489, 8205, 10084, 65039, 8205, 129489};
    public static final int[] A05 = {127995, 127996, 127997, 127998, 127999};
    public static final int[] A06 = {128104, 8205, 10084, 65039, 8205, 128139, 8205, 128104};
    public static final int[] A07 = {128105, 8205, 10084, 65039, 8205, 128139, 8205, 128105};
    public static final int[] A08 = {128105, 8205, 129309, 8205, 128104};
    public static final int[] A09 = {128105, 8205, 10084, 65039, 8205, 128139, 8205, 128104};
    public static final int[] A0A = {128105, 8205, 10084, 65039, 8205, 128104};
    public static final int[] A0B = {128105, 8205, 129309, 8205, 128105};
    public static final int[] A0C = {128105, 8205, 10084, 65039, 8205, 128105};

    public static boolean A00(int i2) {
        if (!(i2 == 9792 || i2 == 9794)) {
            switch (i2) {
                case 9877:
                case 9878:
                case 9992:
                case 127806:
                case 127859:
                case 127868:
                case 127891:
                case 127908:
                case 127912:
                case 127979:
                case 127981:
                case 128187:
                case 128188:
                case 128295:
                case 128300:
                case 128640:
                case 128658:
                case 129455:
                case 129468:
                case 129469:
                    break;
                default:
                    return i2 == 129456 || i2 == 129459 || i2 == 129457 || i2 == 129458;
            }
        }
    }

    public static boolean A01(int[] iArr) {
        if (iArr.length < 2) {
            return false;
        }
        return C43041zF.A04(A05, iArr[1]);
    }

    public static boolean A02(int[] iArr) {
        int[] A062 = A06(C37941pz.A03(iArr));
        switch (A062[0]) {
            case 128107:
            case 128108:
            case 128109:
            case 128143:
            case 128145:
            case 129309:
                return true;
            default:
                return A04(A0B, A062) || A04(A01, A062) || A04(A08, A062) || A04(A07, A062) || A04(A09, A062) || A04(A06, A062) || A04(A03, A062) || A04(A02, A062) || A04(A0C, A062) || A04(A0A, A062) || A04(A04, A062) || A04(A00, A062);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(int[] r7) {
        /*
            int[] r7 = X.C37941pz.A03(r7)
            r6 = 0
            r0 = r7[r6]
            switch(r0) {
                case 9757: goto L_0x0026;
                case 9977: goto L_0x0026;
                case 127877: goto L_0x0026;
                case 127943: goto L_0x0026;
                case 127995: goto L_0x0026;
                case 128107: goto L_0x0026;
                case 128108: goto L_0x0026;
                case 128109: goto L_0x0026;
                case 128110: goto L_0x0026;
                case 128111: goto L_0x0026;
                case 128112: goto L_0x0026;
                case 128113: goto L_0x0026;
                case 128114: goto L_0x0026;
                case 128115: goto L_0x0026;
                case 128116: goto L_0x0026;
                case 128117: goto L_0x0026;
                case 128118: goto L_0x0026;
                case 128119: goto L_0x0026;
                case 128120: goto L_0x0026;
                case 128124: goto L_0x0026;
                case 128170: goto L_0x0026;
                case 128378: goto L_0x0026;
                case 128400: goto L_0x0026;
                case 128405: goto L_0x0026;
                case 128406: goto L_0x0026;
                case 128581: goto L_0x0026;
                case 128582: goto L_0x0026;
                case 128583: goto L_0x0026;
                case 128587: goto L_0x0026;
                case 128588: goto L_0x0026;
                case 128589: goto L_0x0026;
                case 128590: goto L_0x0026;
                case 128591: goto L_0x0026;
                case 128675: goto L_0x0026;
                case 128692: goto L_0x0026;
                case 128693: goto L_0x0026;
                case 128694: goto L_0x0026;
                case 128704: goto L_0x0026;
                case 128716: goto L_0x0026;
                case 129292: goto L_0x0026;
                case 129295: goto L_0x0026;
                case 129304: goto L_0x0026;
                case 129305: goto L_0x0026;
                case 129306: goto L_0x0026;
                case 129307: goto L_0x0026;
                case 129308: goto L_0x0026;
                case 129309: goto L_0x0026;
                case 129310: goto L_0x0026;
                case 129311: goto L_0x0026;
                case 129318: goto L_0x0026;
                case 129328: goto L_0x0026;
                case 129329: goto L_0x0026;
                case 129330: goto L_0x0026;
                case 129331: goto L_0x0026;
                case 129332: goto L_0x0026;
                case 129333: goto L_0x0026;
                case 129334: goto L_0x0026;
                case 129335: goto L_0x0026;
                case 129336: goto L_0x0026;
                case 129337: goto L_0x0026;
                case 129341: goto L_0x0026;
                case 129342: goto L_0x0026;
                case 129399: goto L_0x0026;
                case 129461: goto L_0x0026;
                case 129462: goto L_0x0026;
                case 129464: goto L_0x0026;
                case 129465: goto L_0x0026;
                case 129467: goto L_0x0026;
                case 129485: goto L_0x0026;
                case 129486: goto L_0x0026;
                case 129487: goto L_0x0026;
                case 129489: goto L_0x0026;
                case 129490: goto L_0x0026;
                case 129491: goto L_0x0026;
                case 129492: goto L_0x0026;
                case 129493: goto L_0x0026;
                case 129494: goto L_0x0026;
                case 129495: goto L_0x0026;
                case 129496: goto L_0x0026;
                case 129497: goto L_0x0026;
                case 129498: goto L_0x0026;
                case 129499: goto L_0x0026;
                case 129500: goto L_0x0026;
                case 129501: goto L_0x0026;
                case 129731: goto L_0x0026;
                case 129732: goto L_0x0026;
                case 129733: goto L_0x0026;
                case 129776: goto L_0x0026;
                case 129777: goto L_0x0026;
                case 129778: goto L_0x0026;
                case 129779: goto L_0x0026;
                case 129780: goto L_0x0026;
                case 129781: goto L_0x0026;
                case 129782: goto L_0x0026;
                case 129783: goto L_0x0026;
                case 129784: goto L_0x0026;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r0) {
                case 9994: goto L_0x0026;
                case 9995: goto L_0x0026;
                case 9996: goto L_0x0026;
                case 9997: goto L_0x0026;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r0) {
                case 127939: goto L_0x0026;
                case 127940: goto L_0x0026;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r0) {
                case 127946: goto L_0x0026;
                case 127947: goto L_0x0026;
                case 127948: goto L_0x0026;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r0) {
                case 128066: goto L_0x0026;
                case 128067: goto L_0x0026;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r0) {
                case 128070: goto L_0x0026;
                case 128071: goto L_0x0026;
                case 128072: goto L_0x0026;
                case 128073: goto L_0x0026;
                case 128074: goto L_0x0026;
                case 128075: goto L_0x0026;
                case 128076: goto L_0x0026;
                case 128077: goto L_0x0026;
                case 128078: goto L_0x0026;
                case 128079: goto L_0x0026;
                case 128080: goto L_0x0026;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r0) {
                case 128102: goto L_0x0026;
                case 128103: goto L_0x0026;
                case 128104: goto L_0x0026;
                case 128105: goto L_0x0026;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r0) {
                case 128129: goto L_0x0026;
                case 128130: goto L_0x0026;
                case 128131: goto L_0x0026;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r0) {
                case 128133: goto L_0x0026;
                case 128134: goto L_0x0026;
                case 128135: goto L_0x0026;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r0) {
                case 128372: goto L_0x0026;
                case 128373: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            return r6
        L_0x0026:
            int r5 = r7.length
            r1 = 1
            if (r5 != r1) goto L_0x002b
            return r1
        L_0x002b:
            r4 = 8205(0x200d, float:1.1498E-41)
            r3 = 3
            r2 = 2
            if (r5 != r3) goto L_0x003f
            r0 = r7[r1]
            if (r0 != r4) goto L_0x0025
            r0 = r7[r2]
        L_0x0037:
            boolean r0 = A00(r0)
            if (r0 == 0) goto L_0x0025
            r6 = 1
            return r6
        L_0x003f:
            if (r5 != r2) goto L_0x004a
            r1 = r7[r1]
            int[] r0 = A05
            boolean r0 = X.C43041zF.A04(r0, r1)
            return r0
        L_0x004a:
            r0 = 4
            if (r5 != r0) goto L_0x0025
            r1 = r7[r1]
            int[] r0 = A05
            boolean r0 = X.C43041zF.A04(r0, r1)
            if (r0 == 0) goto L_0x0025
            r0 = r7[r2]
            if (r0 != r4) goto L_0x0025
            r0 = r7[r3]
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62153Bw.A03(int[]):boolean");
    }

    public static boolean A04(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr2, C37941pz.A03(iArr));
    }

    public static int[] A05(int[] iArr) {
        switch (iArr[0]) {
            case 128107:
                return A08;
            case 128108:
                return A01;
            case 128109:
                return A0B;
            case 128143:
                return A03;
            case 128145:
                return A04;
            case 129309:
                return A00;
            default:
                return iArr;
        }
    }

    public static int[] A06(int[] iArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i2 : iArr) {
            if (!C43041zF.A04(A05, i2)) {
                C13690nt.A1O(A0u, i2);
            }
        }
        return AnonymousClass45T.A00(A0u);
    }

    public static int[] A07(int[] iArr) {
        int i2;
        int[] A062 = A06(iArr);
        if (C61733Ac.A02.contains(Integer.valueOf(A062[0]))) {
            if (Arrays.equals(A08, A062)) {
                A062 = new int[1];
                i2 = 128107;
            } else if (Arrays.equals(A0B, A062)) {
                A062 = new int[1];
                i2 = 128109;
            } else if (Arrays.equals(A01, A062)) {
                A062 = new int[1];
                i2 = 128108;
            } else if (Arrays.equals(A03, A062)) {
                A062 = new int[1];
                i2 = 128143;
            } else if (Arrays.equals(A04, A062)) {
                A062 = new int[1];
                i2 = 128145;
            } else if (Arrays.equals(A00, A062)) {
                A062 = new int[1];
                i2 = 129309;
            }
            A062[0] = i2;
        }
        return A062;
    }

    public static int[] A08(int[] iArr, int i2) {
        boolean A042 = C43041zF.A04(A05, i2);
        boolean A012 = A01(iArr);
        if (A042) {
            if (!A012) {
                return A09(iArr, i2);
            }
            int length = iArr.length;
            int[] iArr2 = new int[length];
            iArr2[0] = iArr[0];
            iArr2[1] = i2;
            System.arraycopy(iArr, 2, iArr2, 2, length - 2);
            return iArr2;
        } else if (!A012) {
            return (int[]) iArr.clone();
        } else {
            int length2 = iArr.length;
            int[] iArr3 = new int[(length2 - 1)];
            iArr3[0] = iArr[0];
            System.arraycopy(iArr, 2, iArr3, 1, length2 - 2);
            return iArr3;
        }
    }

    public static int[] A09(int[] iArr, int i2) {
        int length = iArr.length;
        if (length < 2 || iArr[1] != 65039) {
            int[] iArr2 = new int[(length + 1)];
            iArr2[0] = iArr[0];
            iArr2[1] = i2;
            System.arraycopy(iArr, 1, iArr2, 2, length - 1);
            return iArr2;
        }
        int[] iArr3 = new int[length];
        iArr3[0] = iArr[0];
        iArr3[1] = i2;
        System.arraycopy(iArr, 2, iArr3, 2, length - 2);
        return iArr3;
    }

    public static int[][] A0A(int[] iArr) {
        Object obj;
        int[][] iArr2 = new int[6][];
        if (A01(iArr)) {
            int length = iArr.length;
            int[] iArr3 = new int[(length - 1)];
            iArr3[0] = iArr[0];
            System.arraycopy(iArr, 2, iArr3, 1, length - 2);
            obj = iArr3;
        } else {
            obj = iArr.clone();
        }
        iArr2[0] = obj;
        int i2 = 0;
        while (true) {
            int[] iArr4 = A05;
            if (i2 >= iArr4.length) {
                return iArr2;
            }
            int i3 = i2 + 1;
            iArr2[i3] = A09(iArr2[0], iArr4[i2]);
            i2 = i3;
        }
    }
}
