package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.557  reason: invalid class name */
public abstract class AnonymousClass557 implements Iterable, Serializable {
    public static final AnonymousClass557 A00 = new C66963am(AnonymousClass4ZC.A04);
    public static final AnonymousClass5O5 A01 = (C87864Yy.A00() ? new C98374sJ() : new C98364sI());
    public int zzc = 0;

    public static int A01(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder A0g = C13690nt.A0g(32);
            A0g.append("Beginning index: ");
            A0g.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0h(" < 0", A0g));
        } else if (i3 < i2) {
            StringBuilder A0g2 = C13690nt.A0g(66);
            A0g2.append("Beginning index larger than ending index: ");
            A0g2.append(i2);
            throw new IndexOutOfBoundsException(C13680ns.A0i(", ", A0g2, i3));
        } else {
            StringBuilder A0g3 = C13690nt.A0g(37);
            A0g3.append("End index: ");
            A0g3.append(i3);
            throw new IndexOutOfBoundsException(C13680ns.A0i(" >= ", A0g3, i4));
        }
    }

    public int A02() {
        C66963am r1 = (C66963am) this;
        return r1 instanceof C66953al ? ((C66953al) r1).zzd : r1.zzb.length;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int A02 = A02();
            C66963am r0 = (C66963am) this;
            byte[] bArr = r0.zzb;
            int A03 = r0.A03();
            i2 = A02;
            for (int i3 = A03; i3 < A03 + A02; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    public /* synthetic */ Iterator iterator() {
        return new AnonymousClass57V(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        int A02 = A02();
        AnonymousClass000.A1L(objArr, A02);
        objArr[2] = A02 <= 50 ? AnonymousClass45L.A00(this) : String.valueOf(AnonymousClass45L.A00(C66963am.A00((C66963am) this, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
