package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.00O  reason: invalid class name */
public class AnonymousClass00O {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public int A00;
    public int[] A01;
    public Object[] A02;

    public AnonymousClass00O() {
        this.A01 = AnonymousClass00R.A00;
        this.A02 = AnonymousClass00R.A02;
        this.A00 = 0;
    }

    public AnonymousClass00O(int i2) {
        if (i2 == 0) {
            this.A01 = AnonymousClass00R.A00;
            this.A02 = AnonymousClass00R.A02;
        } else {
            A00(i2);
        }
        this.A00 = 0;
    }

    private void A00(int i2) {
        Class<AnonymousClass00O> cls = AnonymousClass00O.class;
        if (i2 == 8) {
            synchronized (cls) {
                Object[] objArr = A06;
                if (objArr != null) {
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                Object[] objArr2 = A05;
                if (objArr2 != null) {
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i2];
        this.A02 = new Object[(i2 << 1)];
    }

    public static void A01(int[] iArr, Object[] objArr, int i2) {
        Class<AnonymousClass00O> cls = AnonymousClass00O.class;
        int length = iArr.length;
        if (length == 8) {
            synchronized (cls) {
                int i3 = A04;
                if (i3 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    A06 = objArr;
                    A04 = i3 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (cls) {
                int i5 = A03;
                if (i5 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i6 = (i2 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    A05 = objArr;
                    A03 = i5 + 1;
                }
            }
        }
    }

    public int A02() {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        int[] iArr = this.A01;
        try {
            int A002 = AnonymousClass00R.A00(iArr, i2, 0);
            if (A002 >= 0) {
                Object[] objArr = this.A02;
                if (objArr[A002 << 1] != null) {
                    int i3 = A002 + 1;
                    while (i3 < i2 && iArr[i3] == 0) {
                        if (objArr[i3 << 1] == null) {
                            return i3;
                        }
                        i3++;
                    }
                    do {
                        A002--;
                        if (A002 < 0 || iArr[A002] != 0) {
                            return i3 ^ -1;
                        }
                    } while (objArr[A002 << 1] != null);
                    return A002;
                }
            }
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int A03(Object obj) {
        return obj == null ? A02() : A05(obj, obj.hashCode());
    }

    public int A04(Object obj) {
        int i2 = this.A00 << 1;
        Object[] objArr = this.A02;
        int i3 = 1;
        if (obj == null) {
            while (i3 < i2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
                i3 += 2;
            }
            return -1;
        }
        while (i3 < i2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
            i3 += 2;
        }
        return -1;
    }

    public int A05(Object obj, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        try {
            int A002 = AnonymousClass00R.A00(this.A01, i3, i2);
            if (A002 < 0 || obj.equals(this.A02[A002 << 1])) {
                return A002;
            }
            int i4 = A002 + 1;
            while (i4 < i3 && this.A01[i4] == i2) {
                if (obj.equals(this.A02[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            do {
                A002--;
                if (A002 < 0 || this.A01[A002] != i2) {
                    return i4 ^ -1;
                }
            } while (!obj.equals(this.A02[A002 << 1]));
            return A002;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public Object A06(int i2) {
        Object[] objArr = this.A02;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.A00;
        int i5 = 0;
        if (i4 <= 1) {
            A01(this.A01, objArr, i4);
            this.A01 = AnonymousClass00R.A00;
            this.A02 = AnonymousClass00R.A02;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.A01;
            int length = iArr.length;
            int i7 = 8;
            if (length <= 8 || i4 >= length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.A02;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.A02;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                A00(i7);
                if (i4 == this.A00) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.A01, 0, i2);
                        System.arraycopy(objArr, 0, this.A02, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.A01, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.A02, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.A00) {
            this.A00 = i5;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public void A07(int i2) {
        int i3 = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < i2) {
            Object[] objArr = this.A02;
            A00(i2);
            if (this.A00 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i3);
                System.arraycopy(objArr, 0, this.A02, 0, i3 << 1);
            }
            A01(iArr, objArr, i3);
        }
        if (this.A00 != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void A08(AnonymousClass00O r6) {
        int i2 = r6.A00;
        A07(this.A00 + i2);
        if (this.A00 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr = r6.A02;
                int i4 = i3 << 1;
                put(objArr[i4], objArr[i4 + 1]);
            }
        } else if (i2 > 0) {
            System.arraycopy(r6.A01, 0, this.A01, 0, i2);
            System.arraycopy(r6.A02, 0, this.A02, 0, i2 << 1);
            this.A00 = i2;
        }
    }

    public void clear() {
        int i2 = this.A00;
        if (i2 > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            this.A01 = AnonymousClass00R.A00;
            this.A02 = AnonymousClass00R.A02;
            this.A00 = 0;
            A01(iArr, objArr, i2);
        }
        if (this.A00 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return A03(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return A04(obj) >= 0;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0051=Splitter:B:27:0x0051, B:7:0x0015=Splitter:B:7:0x0015} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 == r7) goto L_0x007e
            boolean r0 = r7 instanceof X.AnonymousClass00O
            r4 = 0
            if (r0 == 0) goto L_0x0040
            X.00O r7 = (X.AnonymousClass00O) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 != r0) goto L_0x007c
            r3 = 0
        L_0x0015:
            int r0 = r6.A00     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r3 >= r0) goto L_0x007e
            java.lang.Object[] r1 = r6.A02     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            r2 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            int r0 = r0 + 1
            r1 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            java.lang.Object r0 = r7.get(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r1 != 0) goto L_0x0034
            if (r0 != 0) goto L_0x007c
            boolean r0 = r7.containsKey(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x003b
            goto L_0x003e
        L_0x0034:
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x003e:
            return r4
        L_0x003f:
            return r4
        L_0x0040:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L_0x007d
            java.util.Map r7 = (java.util.Map) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 != r0) goto L_0x007c
            r3 = 0
        L_0x0051:
            int r0 = r6.A00     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r3 >= r0) goto L_0x007e
            java.lang.Object[] r1 = r6.A02     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            r2 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            int r0 = r3 << 1
            int r0 = r0 + 1
            r1 = r1[r0]     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            java.lang.Object r0 = r7.get(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r1 != 0) goto L_0x0070
            if (r0 != 0) goto L_0x007c
            boolean r0 = r7.containsKey(r2)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x0077
            goto L_0x007a
        L_0x0070:
            boolean r0 = r1.equals(r0)     // Catch:{ ClassCastException | NullPointerException -> 0x007d }
            if (r0 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x007a:
            return r4
        L_0x007b:
            return r4
        L_0x007c:
            return r4
        L_0x007d:
            return r4
        L_0x007e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00O.equals(java.lang.Object):boolean");
    }

    public Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int A032 = A03(obj);
        return A032 >= 0 ? this.A02[(A032 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i2 = this.A00;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public boolean isEmpty() {
        return this.A00 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int hashCode;
        int A052;
        int i2 = this.A00;
        if (obj == null) {
            A052 = A02();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A052 = A05(obj, hashCode);
        }
        if (A052 >= 0) {
            int i3 = (A052 << 1) + 1;
            Object[] objArr = this.A02;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = A052 ^ -1;
        int[] iArr = this.A01;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.A02;
            A00(i5);
            if (i2 == this.A00) {
                int[] iArr2 = this.A01;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
                }
                A01(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.A01;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.A00 - i4) << 1);
        }
        int i7 = this.A00;
        if (i2 == i7) {
            int[] iArr4 = this.A01;
            if (i4 < iArr4.length) {
                iArr4[i4] = hashCode;
                Object[] objArr4 = this.A02;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.A00 = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int A032 = A03(obj);
        if (A032 >= 0) {
            return A06(A032);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int A032 = A03(obj);
        if (A032 < 0) {
            return false;
        }
        Object obj3 = this.A02[(A032 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        A06(A032);
        return true;
    }

    public Object replace(Object obj, Object obj2) {
        int A032 = A03(obj);
        if (A032 < 0) {
            return null;
        }
        int i2 = (A032 << 1) + 1;
        Object[] objArr = this.A02;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int A032 = A03(obj);
        if (A032 < 0) {
            return false;
        }
        int i2 = (A032 << 1) + 1;
        Object obj4 = this.A02[i2];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        this.A02[i2] = obj3;
        return true;
    }

    public int size() {
        return this.A00;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.A02[i2 << 1];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.A02[(i2 << 1) + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
