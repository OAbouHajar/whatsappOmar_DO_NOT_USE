package X;

import com.google.common.base.Strings;

/* renamed from: X.1Zu  reason: invalid class name and case insensitive filesystem */
public final class C29031Zu {
    public static String A00(String str, int i2, int i3) {
        Object[] objArr;
        String str2;
        if (i2 < 0) {
            objArr = new Object[]{str, Integer.valueOf(i2)};
            str2 = "%s (%s) must not be negative";
        } else if (i3 >= 0) {
            objArr = new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)};
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        return Strings.A00(str2, objArr);
    }

    public static void A01(int i2, int i3) {
        Object[] objArr;
        String str;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                objArr = new Object[]{"index", Integer.valueOf(i2)};
                str = "%s (%s) must not be negative";
            } else if (i3 >= 0) {
                objArr = new Object[]{"index", Integer.valueOf(i2), Integer.valueOf(i3)};
                str = "%s (%s) must be less than size (%s)";
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IndexOutOfBoundsException(Strings.A00(str, objArr));
        }
    }

    public static void A02(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(A00("index", i2, i3));
        }
    }

    public static void A03(int i2, int i3, int i4) {
        String str;
        if (i2 >= 0) {
            if (i3 >= i2 && i3 <= i4) {
                return;
            }
            if (i2 <= i4) {
                if (i3 < 0 || i3 > i4) {
                    str = A00("end index", i3, i4);
                } else {
                    str = Strings.A00("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
                }
                throw new IndexOutOfBoundsException(str);
            }
        }
        str = A00("start index", i2, i4);
        throw new IndexOutOfBoundsException(str);
    }

    public static void A04(Object obj, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
