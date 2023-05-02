package X;

import android.text.TextUtils;

/* renamed from: X.4aA  reason: invalid class name and case insensitive filesystem */
public final class C88234aA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C88234aA(int i2, int i3, int i4, int i5, int i6) {
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A01 = i6;
    }

    public static C88234aA A00(String str) {
        C90524eJ.A03(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = split.length;
            if (i2 < length) {
                String A0a = AnonymousClass3K4.A0a(split[i2].trim());
                switch (A0a.hashCode()) {
                    case 100571:
                        if (!A0a.equals("end")) {
                            break;
                        } else {
                            i4 = i2;
                            break;
                        }
                    case 3556653:
                        if (!A0a.equals("text")) {
                            break;
                        } else {
                            i6 = i2;
                            break;
                        }
                    case 109757538:
                        if (!A0a.equals("start")) {
                            break;
                        } else {
                            i3 = i2;
                            break;
                        }
                    case 109780401:
                        if (!A0a.equals("style")) {
                            break;
                        } else {
                            i5 = i2;
                            break;
                        }
                }
                i2++;
            } else if (i3 == -1 || i4 == -1 || i6 == -1) {
                return null;
            } else {
                return new C88234aA(i3, i4, i5, i6, length);
            }
        }
    }
}
