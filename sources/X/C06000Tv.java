package X;

import java.io.IOException;

/* renamed from: X.0Tv  reason: invalid class name and case insensitive filesystem */
public final class C06000Tv {
    public final C105925Bs A00;
    public final String[] A01;

    public C06000Tv(C105925Bs r1, String[] strArr) {
        this.A01 = strArr;
        this.A00 = r1;
    }

    public static C06000Tv A00(Object obj, String[] strArr, int i2) {
        strArr[i2] = obj;
        return A01(strArr);
    }

    public static C06000Tv A01(String... strArr) {
        String str;
        try {
            int length = strArr.length;
            C09200f6[] r9 = new C09200f6[length];
            C11050i7 r8 = new C11050i7();
            for (int i2 = 0; i2 < length; i2++) {
                String str2 = strArr[i2];
                String[] strArr2 = C09090et.A04;
                r8.A0B();
                int length2 = str2.length();
                int i3 = 0;
                for (int i4 = 0; i4 < length2; i4++) {
                    char charAt = str2.charAt(i4);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                    } else if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i3 < i4) {
                        r8.A0F(i3, str2, i4);
                    }
                    r8.A0I(str);
                    i3 = i4 + 1;
                }
                if (i3 < length2) {
                    r8.A0F(i3, str2, length2);
                }
                r8.A0B();
                r8.readByte();
                r9[i2] = r8.A08();
            }
            return new C06000Tv(C105925Bs.A00(r9), (String[]) strArr.clone());
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
