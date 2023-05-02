package X;

/* renamed from: X.1Zt  reason: invalid class name and case insensitive filesystem */
public final class C29021Zt<K, V> extends C17930vs<K, V> {
    public static final C17930vs EMPTY = new C29021Zt((Object) null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] alternatingKeysAndValues;
    public final transient Object hashTable;
    public final transient int size;

    public C29021Zt(Object obj, Object[] objArr, int i2) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i2;
    }

    public static C29021Zt create(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (C29021Zt) EMPTY;
        }
        if (i2 == 1) {
            C29011Zs.checkEntryNotNull(objArr[0], objArr[1]);
            return new C29021Zt((Object) null, objArr, 1);
        }
        C29031Zu.A02(i2, objArr.length >> 1);
        return new C29021Zt(createHashTable(objArr, i2, C17380uz.chooseTableSize(i2), 0), objArr, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r3[r1] = (byte) r2;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r3[r1] = (short) r2;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        r6[r2] = r5;
        r7 = r7 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object createHashTable(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r1 = 0
            r0 = 1
            if (r11 != r0) goto L_0x000d
            r1 = r10[r1]
            r0 = r10[r0]
            X.C29011Zs.checkEntryNotNull(r1, r0)
            r0 = 0
            return r0
        L_0x000d:
            int r9 = r12 + -1
            r0 = 128(0x80, float:1.794E-43)
            r7 = 0
            r8 = -1
            if (r12 > r0) goto L_0x0049
            byte[] r3 = new byte[r12]
            java.util.Arrays.fill(r3, r8)
        L_0x001a:
            if (r7 >= r11) goto L_0x0048
            int r2 = r7 << 1
            r5 = r10[r2]
            r0 = r2 ^ 1
            r6 = r10[r0]
            X.C29011Zs.checkEntryNotNull(r5, r6)
            int r0 = r5.hashCode()
            int r1 = X.C29041Zv.smear(r0)
        L_0x002f:
            r1 = r1 & r9
            byte r4 = r3[r1]
            r0 = 255(0xff, float:3.57E-43)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x003d
            byte r0 = (byte) r2
            r3[r1] = r0
            int r7 = r7 + 1
            goto L_0x001a
        L_0x003d:
            r0 = r10[r4]
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0082
            int r1 = r1 + 1
            goto L_0x002f
        L_0x0048:
            return r3
        L_0x0049:
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r12 > r0) goto L_0x0088
            short[] r3 = new short[r12]
            java.util.Arrays.fill(r3, r8)
        L_0x0053:
            if (r7 >= r11) goto L_0x0087
            int r2 = r7 << 1
            r5 = r10[r2]
            r0 = r2 ^ 1
            r6 = r10[r0]
            X.C29011Zs.checkEntryNotNull(r5, r6)
            int r0 = r5.hashCode()
            int r1 = X.C29041Zv.smear(r0)
        L_0x0068:
            r1 = r1 & r9
            short r4 = r3[r1]
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0077
            short r0 = (short) r2
            r3[r1] = r0
            int r7 = r7 + 1
            goto L_0x0053
        L_0x0077:
            r0 = r10[r4]
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0082
            int r1 = r1 + 1
            goto L_0x0068
        L_0x0082:
            java.lang.IllegalArgumentException r0 = duplicateKeyException(r5, r6, r10, r4)
            throw r0
        L_0x0087:
            return r3
        L_0x0088:
            int[] r6 = new int[r12]
            java.util.Arrays.fill(r6, r8)
        L_0x008d:
            if (r7 >= r11) goto L_0x00bc
            int r5 = r7 << 1
            r4 = r10[r5]
            r0 = r5 ^ 1
            r3 = r10[r0]
            X.C29011Zs.checkEntryNotNull(r4, r3)
            int r0 = r4.hashCode()
            int r2 = X.C29041Zv.smear(r0)
        L_0x00a2:
            r2 = r2 & r9
            r1 = r6[r2]
            if (r1 != r8) goto L_0x00ac
            r6[r2] = r5
            int r7 = r7 + 1
            goto L_0x008d
        L_0x00ac:
            r0 = r10[r1]
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00b7
            int r2 = r2 + 1
            goto L_0x00a2
        L_0x00b7:
            java.lang.IllegalArgumentException r0 = duplicateKeyException(r4, r3, r10, r1)
            throw r0
        L_0x00bc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29021Zt.createHashTable(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static IllegalArgumentException duplicateKeyException(Object obj, Object obj2, Object[] objArr, int i2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i2]);
        String valueOf4 = String.valueOf(objArr[i2 ^ 1]);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    public static Object get(Object obj, Object[] objArr, int i2, int i3, Object obj2) {
        int i4;
        if (obj2 == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[0].equals(obj2)) {
                return objArr[1];
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int smear = C29041Zv.smear(obj2.hashCode());
                while (true) {
                    int i5 = smear & length;
                    i4 = bArr[i5] & 255;
                    if (i4 != 255) {
                        if (obj2.equals(objArr[i4])) {
                            break;
                        }
                        smear = i5 + 1;
                    } else {
                        return null;
                    }
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int smear2 = C29041Zv.smear(obj2.hashCode());
                while (true) {
                    int i6 = smear2 & length2;
                    i4 = sArr[i6] & 65535;
                    if (i4 != 65535) {
                        if (obj2.equals(objArr[i4])) {
                            break;
                        }
                        smear2 = i6 + 1;
                    } else {
                        return null;
                    }
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int smear3 = C29041Zv.smear(obj2.hashCode());
                while (true) {
                    int i7 = smear3 & length3;
                    i4 = iArr[i7];
                    if (i4 != -1) {
                        if (obj2.equals(objArr[i4])) {
                            break;
                        }
                        smear3 = i7 + 1;
                    } else {
                        return null;
                    }
                }
            }
            return objArr[i4 ^ 1];
        }
    }

    public C17380uz createEntrySet() {
        return new C67913ca(this, this.alternatingKeysAndValues, 0, this.size);
    }

    public C17380uz createKeySet() {
        return new C67893cY(this, new AnonymousClass2Tq(this.alternatingKeysAndValues, 0, this.size));
    }

    public C17390v0 createValues() {
        return new AnonymousClass2Tq(this.alternatingKeysAndValues, 1, this.size);
    }

    public Object get(Object obj) {
        Object obj2 = get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public int size() {
        return this.size;
    }
}
