package X;

/* renamed from: X.1Wu  reason: invalid class name and case insensitive filesystem */
public class C28611Wu extends C28621Wv {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    public C28611Wu(byte[] bArr) {
        this.bytes = bArr;
    }

    public int A05() {
        if (this instanceof AnonymousClass2ND) {
            return ((AnonymousClass2ND) this).bytesOffset;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        int A03;
        C28631Ww r7;
        int A032;
        if (obj != this) {
            if ((obj instanceof C28631Ww) && (A03 = A03()) == (A032 = r7.A03())) {
                if (A03 != 0) {
                    if (!(obj instanceof C28611Wu)) {
                        return obj.equals(this);
                    }
                    int i2 = this.hash;
                    int i3 = (r7 = (C28631Ww) obj).hash;
                    if (i2 == 0 || i3 == 0 || i2 == i3) {
                        if (A03 > A032) {
                            StringBuilder sb = new StringBuilder("Length too large: ");
                            sb.append(A03);
                            sb.append(A03);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (A03 <= A032) {
                            boolean z2 = r7 instanceof C28611Wu;
                            C28611Wu r72 = (C28611Wu) r7;
                            if (z2) {
                                byte[] bArr = this.bytes;
                                byte[] bArr2 = r72.bytes;
                                int A05 = A05();
                                int i4 = A03 + A05;
                                int A052 = r72.A05();
                                while (A05 < i4) {
                                    if (bArr[A05] != bArr2[A052]) {
                                        return false;
                                    }
                                    A05++;
                                    A052++;
                                }
                                return true;
                            }
                            int A00 = C28631Ww.A00(0, A03, r72.A03());
                            Object r4 = A00 == 0 ? C28631Ww.A01 : new AnonymousClass2ND(r72.bytes, r72.A05(), A00);
                            int A002 = C28631Ww.A00(0, A03, A03());
                            return r4.equals(A002 == 0 ? C28631Ww.A01 : new AnonymousClass2ND(this.bytes, A05(), A002));
                        } else {
                            StringBuilder sb2 = new StringBuilder("Ran off end of other: ");
                            sb2.append(0);
                            sb2.append(", ");
                            sb2.append(A03);
                            sb2.append(", ");
                            sb2.append(A032);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
