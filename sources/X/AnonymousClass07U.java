package X;

/* renamed from: X.07U  reason: invalid class name */
public class AnonymousClass07U implements Cloneable {
    public static final Object A03 = new Object();
    public int A00;
    public int[] A01;
    public Object[] A02;

    public AnonymousClass07U() {
        int i2 = 40;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (40 > i4) {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            } else {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 >> 2;
        this.A01 = new int[i5];
        this.A02 = new Object[i5];
    }

    /* renamed from: A00 */
    public AnonymousClass07U clone() {
        try {
            AnonymousClass07U r1 = (AnonymousClass07U) super.clone();
            r1.A01 = (int[]) this.A01.clone();
            r1.A02 = (Object[]) this.A02.clone();
            return r1;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public Object A01(int i2) {
        Object obj;
        int A002 = AnonymousClass00R.A00(this.A01, this.A00, i2);
        if (A002 < 0 || (obj = this.A02[A002]) == A03) {
            return null;
        }
        return obj;
    }

    public void A02(int i2, Object obj) {
        int i3 = this.A00;
        if (i3 == 0 || i2 > this.A01[i3 - 1]) {
            int[] iArr = this.A01;
            int[] iArr2 = iArr;
            int length = iArr.length;
            if (i3 >= length) {
                int i4 = (i3 + 1) << 2;
                int i5 = 4;
                while (true) {
                    int i6 = (1 << i5) - 12;
                    if (i4 > i6) {
                        i5++;
                        if (i5 >= 32) {
                            break;
                        }
                    } else {
                        i4 = i6;
                        break;
                    }
                }
                int i7 = i4 >> 2;
                iArr2 = new int[i7];
                Object[] objArr = new Object[i7];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                Object[] objArr2 = this.A02;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.A01 = iArr2;
                this.A02 = objArr;
            }
            iArr2[i3] = i2;
            this.A02[i3] = obj;
            this.A00 = i3 + 1;
            return;
        }
        A03(i2, obj);
    }

    public void A03(int i2, Object obj) {
        int[] iArr = this.A01;
        int i3 = this.A00;
        int A002 = AnonymousClass00R.A00(iArr, i3, i2);
        if (A002 >= 0) {
            this.A02[A002] = obj;
            return;
        }
        int i4 = A002 ^ -1;
        if (i4 < i3) {
            Object[] objArr = this.A02;
            if (objArr[i4] == A03) {
                iArr[i4] = i2;
                objArr[i4] = obj;
                return;
            }
        }
        int length = iArr.length;
        if (i3 >= length) {
            int i5 = (i3 + 1) << 2;
            int i6 = 4;
            while (true) {
                int i7 = (1 << i6) - 12;
                if (i5 > i7) {
                    i6++;
                    if (i6 >= 32) {
                        break;
                    }
                } else {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 >> 2;
            int[] iArr2 = new int[i8];
            Object[] objArr2 = new Object[i8];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A01 = iArr2;
            iArr = iArr2;
            this.A02 = objArr2;
        }
        int i9 = this.A00 - i4;
        if (i9 != 0) {
            int i10 = i4 + 1;
            System.arraycopy(iArr, i4, iArr, i10, i9);
            Object[] objArr4 = this.A02;
            System.arraycopy(objArr4, i4, objArr4, i10, this.A00 - i4);
        }
        this.A01[i4] = i2;
        this.A02[i4] = obj;
        this.A00++;
    }

    public String toString() {
        int i2 = this.A00;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.A00; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.A01[i3]);
            sb.append('=');
            Object obj = this.A02[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
