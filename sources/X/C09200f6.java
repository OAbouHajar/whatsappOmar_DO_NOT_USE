package X;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.0f6  reason: invalid class name and case insensitive filesystem */
public class C09200f6 implements Comparable, Serializable {
    public static final C09200f6 A02 = C90594eQ.A02();
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient String A01;
    public final byte[] data;

    public C09200f6(byte[] bArr) {
        C18450wi.A0G(bArr, 1);
        this.data = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        int i2 = 0;
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            while (i2 < readInt) {
                int read = objectInputStream.read(bArr, i2, readInt - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            C09200f6 r2 = new C09200f6(bArr);
            Field declaredField = C09200f6.class.getDeclaredField("data");
            C18450wi.A08(declaredField);
            declaredField.setAccessible(true);
            declaredField.set(this, r2.data);
            return;
        }
        throw AnonymousClass000.A0U(AnonymousClass000.A0r("byteCount < 0: "), readInt);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public byte A00(int i2) {
        return this.data[i2];
    }

    public int A01() {
        return this.data.length;
    }

    /* renamed from: A02 */
    public int compareTo(C09200f6 r8) {
        C18450wi.A0G(r8, 0);
        int A012 = A01();
        int A013 = r8.A01();
        int min = Math.min(A012, A013);
        for (int i2 = 0; i2 < min; i2++) {
            byte A002 = A00(i2) & 255;
            byte A003 = r8.A00(i2) & 255;
            if (A002 != A003) {
                return A002 < A003 ? -1 : 1;
            }
        }
        if (A012 == A013) {
            return 0;
        }
        return A012 < A013 ? -1 : 1;
    }

    public String A03() {
        return C90594eQ.A00(this);
    }

    public boolean A04(C09200f6 r3, int i2, int i3, int i4) {
        return r3.A05(this.data, 0, 0, i4);
    }

    public boolean A05(byte[] bArr, int i2, int i3, int i4) {
        C18450wi.A0G(bArr, 1);
        if (i2 >= 0) {
            byte[] bArr2 = this.data;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4) {
                int i5 = 0;
                while (i5 < i4) {
                    if (bArr2[i5 + i2] == bArr[i5 + i3]) {
                        i5++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte[] A06() {
        return this.data;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r6 = (X.C09200f6) r6;
        r2 = r6.A01();
        r1 = r5.data;
        r0 = r1.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            r3 = 1
            if (r6 == r5) goto L_0x0019
            boolean r0 = r6 instanceof X.C09200f6
            if (r0 == 0) goto L_0x001a
            X.0f6 r6 = (X.C09200f6) r6
            int r2 = r6.A01()
            byte[] r1 = r5.data
            int r0 = r1.length
            if (r2 != r0) goto L_0x001a
            boolean r0 = r6.A05(r1, r4, r4, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r3
        L_0x001a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09200f6.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.A00 = hashCode;
        return hashCode;
    }

    public String toString() {
        return C90594eQ.A01(this);
    }
}
