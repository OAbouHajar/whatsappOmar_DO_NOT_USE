package X;

import android.text.TextUtils;

/* renamed from: X.1aE  reason: invalid class name and case insensitive filesystem */
public class C29211aE {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final int[] A05;
    public final int[] A06;
    public final String[] A07;
    public final String[] A08;
    public final String[] A09;
    public final String[] A0A;

    public C29211aE(String[] strArr) {
        int[] iArr;
        int[] iArr2;
        int length;
        int length2;
        int length3 = strArr.length;
        if (length3 >= 12) {
            boolean z2 = false;
            String str = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            String str4 = strArr[3];
            String str5 = strArr[4];
            String str6 = strArr[5];
            if (str2 == null || str3 == null) {
                throw new IllegalArgumentException();
            }
            this.A03 = str2;
            this.A02 = str;
            this.A00 = Integer.parseInt(str3);
            String[] strArr2 = null;
            if (str4 == null || str4.trim().length() <= 0) {
                iArr = null;
            } else {
                String[] split = TextUtils.split(str4, ",");
                iArr = null;
                if (!(split == null || (length2 = split.length) == 0)) {
                    iArr = new int[length2];
                    int i2 = 0;
                    do {
                        iArr[i2] = Integer.parseInt(split[i2]);
                        i2++;
                    } while (i2 < length2);
                }
            }
            this.A06 = iArr;
            if (str5 == null || str5.trim().length() <= 0) {
                iArr2 = null;
            } else {
                String[] split2 = TextUtils.split(str5, ",");
                iArr2 = null;
                if (!(split2 == null || (length = split2.length) == 0)) {
                    iArr2 = new int[length];
                    int i3 = 0;
                    do {
                        iArr2[i3] = Integer.parseInt(split2[i3]);
                        i3++;
                    } while (i3 < length);
                }
            }
            this.A05 = iArr2;
            this.A0A = (str6 == null || str6.trim().length() <= 0) ? null : TextUtils.split(str6, ",");
            String str7 = strArr[7];
            z2 = (str7.length() > 0 || strArr[8].length() > 0 || strArr[9].length() > 0) ? true : z2;
            this.A09 = z2 ? TextUtils.split(str7, ";") : null;
            this.A07 = z2 ? TextUtils.split(strArr[8], ";") : null;
            this.A08 = z2 ? TextUtils.split(strArr[9], ";") : strArr2;
            this.A01 = strArr[10];
            this.A04 = length3 >= 14 ? strArr[13] : "";
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int A00(int i2) {
        int i3;
        int i4;
        int length;
        int length2;
        int length3;
        int[] iArr = this.A05;
        if (iArr == null || (length3 = iArr.length) == 0) {
            i3 = 5;
        } else {
            i3 = iArr[0];
            for (int i5 = 1; i5 < length3; i5++) {
                if (iArr[i5] < i3) {
                    i3 = iArr[i5];
                }
            }
        }
        if (i2 < i3) {
            return -1;
        }
        if (iArr == null || (length2 = iArr.length) == 0) {
            i4 = 14;
        } else {
            i4 = iArr[0];
            for (int i6 = 1; i6 < length2; i6++) {
                if (iArr[i6] > i4) {
                    i4 = iArr[i6];
                }
            }
        }
        if (i2 > i4) {
            return 1;
        }
        if (!(iArr == null || (length = iArr.length) == 0)) {
            int i7 = 0;
            while (iArr[i7] != i2) {
                i7++;
                if (i7 >= length) {
                }
            }
        }
        return 0;
        return 1;
    }
}
