package X;

import java.io.Closeable;
import java.util.Arrays;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.0et  reason: invalid class name and case insensitive filesystem */
public abstract class C09090et implements Closeable {
    public static final String[] A04 = new String[128];
    public int A00;
    public int[] A01 = new int[32];
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];

    static {
        String[] strArr;
        int i2 = 0;
        do {
            strArr = A04;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, i2, 0);
            strArr[i2] = String.format("\\u%04x", objArr);
            i2++;
        } while (i2 <= 31);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static float A05(C09090et r2) {
        return (float) r2.A07();
    }

    public static C09090et A06(C13670mq r1) {
        return new C03070Hc(r1);
    }

    public abstract double A07();

    public abstract int A08();

    public abstract int A09(C06000Tv r1);

    public abstract AnonymousClass0KF A0A();

    public final String A0B() {
        int i2 = this.A00;
        int[] iArr = this.A02;
        String[] strArr = this.A03;
        int[] iArr2 = this.A01;
        StringBuilder A0r = AnonymousClass000.A0r("$");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                A0r.append('[');
                A0r.append(iArr2[i3]);
                A0r.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                A0r.append(FilenameUtils.EXTENSION_SEPARATOR);
                if (strArr[i3] != null) {
                    A0r.append(strArr[i3]);
                }
            }
        }
        return A0r.toString();
    }

    public abstract String A0C();

    public abstract String A0D();

    public abstract void A0E();

    public abstract void A0F();

    public abstract void A0G();

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0J();

    public final void A0K(int i2) {
        int i3 = this.A00;
        int[] iArr = this.A02;
        int length = iArr.length;
        if (i3 == length) {
            if (i3 != 256) {
                this.A02 = Arrays.copyOf(iArr, length << 1);
                String[] strArr = this.A03;
                this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                int[] iArr2 = this.A01;
                this.A01 = Arrays.copyOf(iArr2, iArr2.length << 1);
            } else {
                throw new C11090iB(AnonymousClass000.A0h(A0B(), AnonymousClass000.A0r("Nesting too deep at ")));
            }
        }
        int[] iArr3 = this.A02;
        int i4 = this.A00;
        this.A00 = i4 + 1;
        iArr3[i4] = i2;
    }

    public final void A0L(String str) {
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(" at path ");
        throw new AnonymousClass0J8(AnonymousClass000.A0h(A0B(), A0q));
    }

    public abstract boolean A0M();

    public abstract boolean A0N();
}
