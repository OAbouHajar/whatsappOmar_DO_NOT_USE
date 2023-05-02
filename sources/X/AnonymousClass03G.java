package X;

/* renamed from: X.03G  reason: invalid class name */
public class AnonymousClass03G implements Cloneable {
    public static final Object A04 = new Object();
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public AnonymousClass03G() {
        this(10);
    }

    public AnonymousClass03G(int i2) {
        Object[] objArr;
        this.A01 = false;
        if (i2 == 0) {
            this.A02 = AnonymousClass00R.A01;
            objArr = AnonymousClass00R.A02;
        } else {
            int i3 = i2 << 3;
            int i4 = 4;
            while (true) {
                int i5 = (1 << i4) - 12;
                if (i3 > i5) {
                    i4++;
                    if (i4 >= 32) {
                        break;
                    }
                } else {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 >> 3;
            this.A02 = new long[i6];
            objArr = new Object[i6];
        }
        this.A03 = objArr;
    }

    public int A00() {
        if (this.A01) {
            A06();
        }
        return this.A00;
    }

    public long A01(int i2) {
        if (this.A01) {
            A06();
        }
        return this.A02[i2];
    }

    /* renamed from: A02 */
    public AnonymousClass03G clone() {
        try {
            AnonymousClass03G r1 = (AnonymousClass03G) super.clone();
            r1.A02 = (long[]) this.A02.clone();
            r1.A03 = (Object[]) this.A03.clone();
            return r1;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public Object A03(int i2) {
        if (this.A01) {
            A06();
        }
        return this.A03[i2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r2.A03[r1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(long r3, java.lang.Object r5) {
        /*
            r2 = this;
            long[] r1 = r2.A02
            int r0 = r2.A00
            int r1 = X.AnonymousClass00R.A01(r1, r0, r3)
            if (r1 < 0) goto L_0x0013
            java.lang.Object[] r0 = r2.A03
            r1 = r0[r1]
            java.lang.Object r0 = A04
            if (r1 == r0) goto L_0x0013
            return r1
        L_0x0013:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03G.A04(long, java.lang.Object):java.lang.Object");
    }

    public void A05() {
        int i2 = this.A00;
        Object[] objArr = this.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    public final void A06() {
        int i2 = this.A00;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != A04) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.A01 = false;
        this.A00 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(long r5) {
        /*
            r4 = this;
            long[] r1 = r4.A02
            int r0 = r4.A00
            int r3 = X.AnonymousClass00R.A01(r1, r0, r5)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r2 = r4.A03
            r1 = r2[r3]
            java.lang.Object r0 = A04
            if (r1 == r0) goto L_0x0017
            r2[r3] = r0
            r0 = 1
            r4.A01 = r0
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03G.A07(long):void");
    }

    public void A08(long j2, Object obj) {
        int i2 = this.A00;
        if (i2 == 0 || j2 > this.A02[i2 - 1]) {
            if (this.A01 && i2 >= this.A02.length) {
                A06();
            }
            int i3 = this.A00;
            long[] jArr = this.A02;
            long[] jArr2 = jArr;
            int length = jArr.length;
            if (i3 >= length) {
                int i4 = (i3 + 1) << 3;
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
                int i7 = i4 >> 3;
                jArr2 = new long[i7];
                Object[] objArr = new Object[i7];
                System.arraycopy(jArr, 0, jArr2, 0, length);
                Object[] objArr2 = this.A03;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.A02 = jArr2;
                this.A03 = objArr;
            }
            jArr2[i3] = j2;
            this.A03[i3] = obj;
            this.A00 = i3 + 1;
            return;
        }
        A09(j2, obj);
    }

    public void A09(long j2, Object obj) {
        long[] jArr = this.A02;
        int i2 = this.A00;
        int A012 = AnonymousClass00R.A01(jArr, i2, j2);
        if (A012 >= 0) {
            this.A03[A012] = obj;
            return;
        }
        int i3 = A012 ^ -1;
        if (i3 < i2) {
            Object[] objArr = this.A03;
            if (objArr[i3] == A04) {
                jArr[i3] = j2;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.A01 && i2 >= jArr.length) {
            A06();
            i2 = this.A00;
            i3 = AnonymousClass00R.A01(jArr, i2, j2) ^ -1;
        }
        int length = jArr.length;
        if (i2 >= length) {
            int i4 = (i2 + 1) << 3;
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
            int i7 = i4 >> 3;
            long[] jArr2 = new long[i7];
            Object[] objArr2 = new Object[i7];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr2;
            jArr = jArr2;
            this.A03 = objArr2;
        }
        int i8 = this.A00 - i3;
        if (i8 != 0) {
            int i9 = i3 + 1;
            System.arraycopy(jArr, i3, jArr, i9, i8);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i3, objArr4, i9, this.A00 - i3);
        }
        this.A02[i3] = j2;
        this.A03[i3] = obj;
        this.A00++;
    }

    public String toString() {
        if (A00() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(A01(i2));
            sb.append('=');
            Object A032 = A03(i2);
            if (A032 != this) {
                sb.append(A032);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
