package X;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.556  reason: invalid class name */
public abstract class AnonymousClass556 implements Iterable, Serializable {
    public static final AnonymousClass556 A00 = new AnonymousClass3ZC(AnonymousClass4ZB.A04);
    public static final AnonymousClass5O0 A01 = ((C87854Yx.A00 == null || C87854Yx.A01) ? new C98194rF() : new C98204rG());
    public int zzfk = 0;

    public static int A00(int i2, int i3, int i4) {
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

    public byte A01(int i2) {
        AnonymousClass3ZC r3 = (AnonymousClass3ZC) this;
        if (!(r3 instanceof AnonymousClass3ZB)) {
            return r3.zzfp[i2];
        }
        AnonymousClass3ZB r32 = (AnonymousClass3ZB) r3;
        int i3 = r32.zzfn;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return r32.zzfp[r32.zzfm + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C13680ns.A0i("Index < 0: ", C13690nt.A0g(22), i2));
        }
        StringBuilder A0g = C13690nt.A0g(40);
        A0g.append("Index > length: ");
        A0g.append(i2);
        throw new ArrayIndexOutOfBoundsException(C13680ns.A0i(", ", A0g, i3));
    }

    public int A02() {
        AnonymousClass3ZC r1 = (AnonymousClass3ZC) this;
        return r1 instanceof AnonymousClass3ZB ? ((AnonymousClass3ZB) r1).zzfn : r1.zzfp.length;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzfk;
        if (i2 == 0) {
            int A02 = A02();
            AnonymousClass3ZC r0 = (AnonymousClass3ZC) this;
            byte[] bArr = r0.zzfp;
            int A03 = r0.A03();
            i2 = A02;
            for (int i3 = A03; i3 < A03 + A02; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzfk = i2;
        }
        return i2;
    }

    public /* synthetic */ Iterator iterator() {
        return new AnonymousClass57U(this);
    }

    public final String toString() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = Integer.toHexString(System.identityHashCode(this));
        AnonymousClass000.A1L(A1Z, A02());
        return String.format("<ByteString@%s size=%d>", A1Z);
    }
}
