package X;

import java.util.List;

/* renamed from: X.4cP  reason: invalid class name and case insensitive filesystem */
public class C89544cP {
    public static int A00(List list, int i2) {
        if (list == null || list.isEmpty()) {
            return i2;
        }
        int i3 = 0;
        for (Object next : list) {
            String obj = next.toString();
            switch (obj.hashCode()) {
                case -1699597560:
                    if (!obj.equals("bottom_right")) {
                        break;
                    } else {
                        i3 |= 4;
                        continue;
                    }
                case -966253391:
                    if (!obj.equals("top_left")) {
                        break;
                    } else {
                        i3 |= 1;
                        continue;
                    }
                case -609197669:
                    if (!obj.equals("bottom_left")) {
                        break;
                    } else {
                        i3 |= 8;
                        continue;
                    }
                case 116576946:
                    if (!obj.equals("top_right")) {
                        break;
                    } else {
                        i3 |= 2;
                        continue;
                    }
            }
            throw new AnonymousClass40K(AnonymousClass000.A0g("Can't parse corner: ", next));
        }
        return i3;
    }

    public static void A01(float[] fArr, float f2, int i2) {
        float f3 = 0.0f;
        if ((i2 & 1) != 0) {
            f3 = f2;
        }
        float f4 = 0.0f;
        if ((i2 & 2) != 0) {
            f4 = f2;
        }
        float f5 = 0.0f;
        if ((i2 & 4) != 0) {
            f5 = f2;
        }
        if ((i2 & 8) == 0) {
            f2 = 0.0f;
        }
        fArr[1] = f3;
        fArr[0] = f3;
        fArr[3] = f4;
        fArr[2] = f4;
        fArr[5] = f5;
        fArr[4] = f5;
        fArr[7] = f2;
        fArr[6] = f2;
    }

    public static boolean A02(int i2) {
        if (i2 != 0) {
            return ((i2 & 1) == 0 || (i2 & 2) == 0 || (i2 & 4) == 0 || (i2 & 8) == 0) ? false : true;
        }
        return true;
    }
}
