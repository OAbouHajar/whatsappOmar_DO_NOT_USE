package X;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.1Ww  reason: invalid class name and case insensitive filesystem */
public abstract class C28631Ww implements Iterable, Serializable {
    public static final AnonymousClass2NA A00;
    public static final C28631Ww A01 = new C28611Wu(C28601Wt.A04);
    public int hash = 0;

    static {
        AnonymousClass2NA r0;
        try {
            Class.forName("android.content.Context");
            r0 = new AnonymousClass2N9();
        } catch (ClassNotFoundException unused) {
            r0 = new AnonymousClass2NB();
        }
        A00 = r0;
    }

    public static int A00(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("End index: ");
            sb3.append(i3);
            sb3.append(" >= ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static C28631Ww A01(byte[] bArr, int i2, int i3) {
        return new C28611Wu(A00.A6o(bArr, i2, i3));
    }

    public byte A02(int i2) {
        C28611Wu r3 = (C28611Wu) this;
        if (!(r3 instanceof AnonymousClass2ND)) {
            return r3.bytes[i2];
        }
        AnonymousClass2ND r32 = (AnonymousClass2ND) r3;
        int i3 = r32.bytesLength;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return r32.bytes[r32.bytesOffset + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public int A03() {
        C28611Wu r1 = (C28611Wu) this;
        return r1 instanceof AnonymousClass2ND ? ((AnonymousClass2ND) r1).bytesLength : r1.bytes.length;
    }

    public final byte[] A04() {
        int A03 = A03();
        if (A03 == 0) {
            return C28601Wt.A04;
        }
        byte[] bArr = new byte[A03];
        C28611Wu r3 = (C28611Wu) this;
        if (r3 instanceof AnonymousClass2ND) {
            AnonymousClass2ND r32 = (AnonymousClass2ND) r3;
            System.arraycopy(r32.bytes, r32.bytesOffset, bArr, 0, A03);
            return bArr;
        }
        System.arraycopy(r3.bytes, 0, bArr, 0, A03);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.hash;
        if (i2 == 0) {
            int A03 = A03();
            C28611Wu r0 = (C28611Wu) this;
            byte[] bArr = r0.bytes;
            int A05 = r0.A05();
            i2 = A03;
            for (int i3 = A05; i3 < A05 + A03; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.hash = i2;
        }
        return i2;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new AnonymousClass2NC(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(A03())});
    }
}
