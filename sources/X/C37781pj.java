package X;

/* renamed from: X.1pj  reason: invalid class name and case insensitive filesystem */
public class C37781pj {
    public final int[] A00;

    public C37781pj(String str) {
        int codePointCount = str.codePointCount(0, str.length());
        this.A00 = new int[codePointCount];
        int i2 = 0;
        for (int i3 = 0; i3 < codePointCount; i3++) {
            this.A00[i3] = str.codePointAt(i2);
            i2 += Character.charCount(this.A00[i3]);
        }
    }

    public C37781pj(int[] iArr) {
        this.A00 = iArr;
    }

    public static String A00(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int appendCodePoint : iArr) {
            sb.appendCodePoint(appendCodePoint);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                int[] iArr = this.A00;
                int[] iArr2 = ((C37781pj) obj).A00;
                if (iArr != iArr2) {
                    int length = iArr.length;
                    if (length == iArr2.length) {
                        int i2 = 0;
                        while (i2 < length) {
                            if (iArr[i2] == iArr2[i2]) {
                                i2++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 : this.A00) {
            i2 = (i2 * 31) + i3;
        }
        return i2;
    }

    public String toString() {
        return A00(this.A00);
    }
}
