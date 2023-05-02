package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableMap;

/* renamed from: X.28m  reason: invalid class name */
public final class AnonymousClass28m<K, V> implements Map<K, V>, Serializable, KMutableMap {
    public C106095Cm entriesView;
    public int[] hashArray;
    public int hashShift;
    public boolean isReadOnly;
    public Object[] keysArray;
    public C106115Co keysView;
    public int length;
    public int maxProbeDistance;
    public int[] presenceArray;
    public int size;
    public Object[] valuesArray;
    public C105865Bm valuesView;

    public AnonymousClass28m(int i2) {
        Object[] objArr = new Object[i2];
        int[] iArr = new int[i2];
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.keysArray = objArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[highestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new AnonymousClass54W(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int A00(Object obj) {
        A02();
        while (true) {
            int hashCode = ((obj == null ? 0 : obj.hashCode()) * -1640531527) >>> this.hashShift;
            int i2 = this.maxProbeDistance << 1;
            int length2 = this.hashArray.length >> 1;
            if (i2 > length2) {
                i2 = length2;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i4 = iArr[hashCode];
                if (i4 <= 0) {
                    int i5 = this.length;
                    Object[] objArr = this.keysArray;
                    if (i5 >= objArr.length) {
                        A03(1);
                    } else {
                        int i6 = i5 + 1;
                        this.length = i6;
                        objArr[i5] = obj;
                        this.presenceArray[i5] = hashCode;
                        iArr[hashCode] = i6;
                        this.size = size() + 1;
                        if (i3 > this.maxProbeDistance) {
                            this.maxProbeDistance = i3;
                        }
                        return i5;
                    }
                } else if (C18450wi.A0R(this.keysArray[i4 - 1], obj)) {
                    return -i4;
                } else {
                    i3++;
                    if (i3 > i2) {
                        A04(this.hashArray.length << 1);
                        break;
                    }
                    hashCode = hashCode == 0 ? this.hashArray.length - 1 : hashCode - 1;
                }
            }
        }
    }

    public final int A01(Object obj) {
        int hashCode = ((obj == null ? 0 : obj.hashCode()) * -1640531527) >>> this.hashShift;
        int i2 = this.maxProbeDistance;
        while (true) {
            int i3 = this.hashArray[hashCode];
            if (i3 != 0) {
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    if (C18450wi.A0R(this.keysArray[i4], obj)) {
                        return i4;
                    }
                }
                i2--;
                if (i2 < 0) {
                    break;
                }
                hashCode = hashCode == 0 ? this.hashArray.length - 1 : hashCode - 1;
            } else {
                break;
            }
        }
        return -1;
    }

    public final void A02() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final void A03(int i2) {
        int length2;
        Object[] copyOf;
        int i3 = this.length;
        int i4 = i3 + i2;
        if (i4 >= 0) {
            Object[] objArr = this.keysArray;
            int length3 = objArr.length;
            if (i4 > length3) {
                int i5 = (length3 * 3) >> 1;
                if (i4 <= i5) {
                    i4 = i5;
                }
                Object[] copyOf2 = Arrays.copyOf(objArr, i4);
                C18450wi.A0B(copyOf2);
                this.keysArray = copyOf2;
                Object[] objArr2 = this.valuesArray;
                if (objArr2 == null) {
                    copyOf = null;
                } else {
                    copyOf = Arrays.copyOf(objArr2, i4);
                    C18450wi.A0B(copyOf);
                }
                this.valuesArray = copyOf;
                int[] copyOf3 = Arrays.copyOf(this.presenceArray, i4);
                C18450wi.A0B(copyOf3);
                this.presenceArray = copyOf3;
                length2 = Integer.highestOneBit(i4 * 3);
                if (length2 <= this.hashArray.length) {
                    return;
                }
            } else if ((i3 + i4) - size() > length3) {
                length2 = this.hashArray.length;
            } else {
                return;
            }
            A04(length2);
            return;
        }
        throw new OutOfMemoryError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r2[r4] = r6 + 1;
        r7.presenceArray[r6] = r4;
        r6 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r8) {
        /*
            r7 = this;
            int r5 = r7.length
            int r0 = r7.size()
            if (r5 <= r0) goto L_0x0033
            java.lang.Object[] r4 = r7.valuesArray
            r3 = 0
            r2 = 0
        L_0x000c:
            if (r3 >= r5) goto L_0x0025
            int[] r0 = r7.presenceArray
            r0 = r0[r3]
            if (r0 < 0) goto L_0x0022
            java.lang.Object[] r1 = r7.keysArray
            r0 = r1[r3]
            r1[r2] = r0
            if (r4 == 0) goto L_0x0020
            r0 = r4[r3]
            r4[r2] = r0
        L_0x0020:
            int r2 = r2 + 1
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0025:
            java.lang.Object[] r0 = r7.keysArray
            X.C813847y.A00(r0, r2, r5)
            if (r4 == 0) goto L_0x0031
            int r0 = r7.length
            X.C813847y.A00(r4, r2, r0)
        L_0x0031:
            r7.length = r2
        L_0x0033:
            int[] r1 = r7.hashArray
            int r0 = r1.length
            r6 = 0
            if (r8 == r0) goto L_0x0086
            int[] r0 = new int[r8]
            r7.hashArray = r0
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.hashShift = r0
        L_0x0045:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x008a
            int r5 = r6 + 1
            java.lang.Object[] r0 = r7.keysArray
            r0 = r0[r6]
            if (r0 != 0) goto L_0x0081
            r4 = 0
        L_0x0052:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r0
            int r0 = r7.hashShift
            int r4 = r4 >>> r0
            int r3 = r7.maxProbeDistance
        L_0x005b:
            int[] r2 = r7.hashArray
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L_0x006c
            int r0 = r6 + 1
            r2[r4] = r0
            int[] r0 = r7.presenceArray
            r0[r6] = r4
            r6 = r5
            goto L_0x0045
        L_0x006c:
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x0078
            java.lang.String r1 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0078:
            int r0 = r4 + -1
            if (r4 != 0) goto L_0x007f
            int r4 = r2.length
            int r4 = r4 - r1
            goto L_0x005b
        L_0x007f:
            r4 = r0
            goto L_0x005b
        L_0x0081:
            int r4 = r0.hashCode()
            goto L_0x0052
        L_0x0086:
            java.util.Arrays.fill(r1, r6, r0, r6)
            goto L_0x0045
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28m.A04(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r13) {
        /*
            r12 = this;
            java.lang.Object[] r1 = r12.keysArray
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            r0 = 0
            r1[r13] = r0
            int[] r0 = r12.presenceArray
            r11 = r0[r13]
            int r0 = r12.maxProbeDistance
            int r5 = r0 << 1
            int[] r9 = r12.hashArray
            int r8 = r9.length
            int r0 = r8 >> 1
            if (r5 <= r0) goto L_0x0019
            r5 = r0
        L_0x0019:
            r10 = 0
            r6 = 0
            r7 = r11
        L_0x001c:
            int r1 = r11 + -1
            r0 = r11
            r11 = r1
            if (r0 != 0) goto L_0x0024
            int r11 = r8 + -1
        L_0x0024:
            int r6 = r6 + 1
            int r0 = r12.maxProbeDistance
            if (r6 > r0) goto L_0x006e
            r4 = r9[r11]
            if (r4 == 0) goto L_0x006e
            r3 = -1
            if (r4 >= 0) goto L_0x0049
            r9[r7] = r3
        L_0x0033:
            r7 = r11
            r6 = 0
        L_0x0035:
            int r5 = r5 + -1
            if (r5 >= 0) goto L_0x001c
            r9[r7] = r3
        L_0x003b:
            int[] r1 = r12.presenceArray
            r0 = -1
            r1[r13] = r0
            int r0 = r12.size()
            int r0 = r0 + -1
            r12.size = r0
            return
        L_0x0049:
            java.lang.Object[] r0 = r12.keysArray
            int r2 = r4 + -1
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0069
            r1 = 0
        L_0x0052:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r1 = r1 * r0
            int r0 = r12.hashShift
            int r1 = r1 >>> r0
            int r1 = r1 - r11
            int[] r9 = r12.hashArray
            int r8 = r9.length
            int r0 = r8 + -1
            r1 = r1 & r0
            if (r1 < r6) goto L_0x0035
            r9[r7] = r4
            int[] r0 = r12.presenceArray
            r0[r2] = r7
            goto L_0x0033
        L_0x0069:
            int r1 = r0.hashCode()
            goto L_0x0052
        L_0x006e:
            r9[r7] = r10
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28m.A05(int):void");
    }

    public final boolean A06(Map.Entry entry) {
        C18450wi.A0H(entry, 0);
        int A01 = A01(entry.getKey());
        if (A01 < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        C18450wi.A0F(objArr);
        return C18450wi.A0R(objArr[A01], entry.getValue());
    }

    public void clear() {
        A02();
        int i2 = this.length;
        int i3 = i2 - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                int[] iArr = this.presenceArray;
                int i6 = iArr[i4];
                if (i6 >= 0) {
                    this.hashArray[i6] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i3) {
                    break;
                }
                i4 = i5;
            }
        }
        C813847y.A00(this.keysArray, 0, i2);
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            C813847y.A00(objArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public boolean containsKey(Object obj) {
        return A01(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        int i2 = this.length;
        while (true) {
            i2--;
            if (i2 < 0) {
                return false;
            }
            if (this.presenceArray[i2] >= 0) {
                Object[] objArr = this.valuesArray;
                C18450wi.A0F(objArr);
                if (C18450wi.A0R(objArr[i2], obj)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5Cm, java.util.Set] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.5Cm, java.util.Set] */
    public final /* bridge */ Set entrySet() {
        ? r0 = this.entriesView;
        if (r0 != 0) {
            return r0;
        }
        ? r02 = new C106095Cm(this);
        this.entriesView = r02;
        return r02;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        C18450wi.A0H(entrySet, 0);
        for (Object next : entrySet) {
            if (next == null) {
                return false;
            }
            try {
                if (!A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    public Object get(Object obj) {
        int A01 = A01(obj);
        if (A01 < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        C18450wi.A0F(objArr);
        return objArr[A01];
    }

    public int hashCode() {
        C106125Cp r5 = new C106125Cp(this);
        int i2 = 0;
        while (r5.hasNext()) {
            int i3 = r5.A00;
            AnonymousClass28m r1 = r5.A02;
            if (i3 < r1.length) {
                r5.A00 = i3 + 1;
                r5.A01 = i3;
                Object obj = r1.keysArray[i3];
                int i4 = 0;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object[] objArr = r1.valuesArray;
                C18450wi.A0F(objArr);
                Object obj2 = objArr[r5.A01];
                if (obj2 != null) {
                    i4 = obj2.hashCode();
                }
                r5.A00();
                i2 += hashCode ^ i4;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i2;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ Set keySet() {
        C106115Co r0 = this.keysView;
        if (r0 != null) {
            return r0;
        }
        C106115Co r02 = new C106115Co(this);
        this.keysView = r02;
        return r02;
    }

    public Object put(Object obj, Object obj2) {
        A02();
        int A00 = A00(obj);
        Object[] objArr = this.valuesArray;
        if (objArr == null) {
            objArr = new Object[this.keysArray.length];
            this.valuesArray = objArr;
        }
        if (A00 < 0) {
            int i2 = (-A00) - 1;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        objArr[A00] = obj2;
        return null;
    }

    public void putAll(Map map) {
        C18450wi.A0H(map, 0);
        A02();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            A03(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int A00 = A00(entry.getKey());
                Object[] objArr = this.valuesArray;
                if (objArr == null) {
                    objArr = new Object[this.keysArray.length];
                    this.valuesArray = objArr;
                }
                if (A00 < 0) {
                    A00 = (-A00) - 1;
                    if (C18450wi.A0R(entry.getValue(), objArr[A00])) {
                    }
                }
                objArr[A00] = entry.getValue();
            }
        }
    }

    public Object remove(Object obj) {
        A02();
        int A01 = A01(obj);
        if (A01 < 0) {
            return null;
        }
        A05(A01);
        Object[] objArr = this.valuesArray;
        C18450wi.A0F(objArr);
        Object obj2 = objArr[A01];
        objArr[A01] = null;
        return obj2;
    }

    public final /* bridge */ int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C106125Cp r5 = new C106125Cp(this);
        int i2 = 0;
        while (r5.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = r5.A00;
            AnonymousClass28m r3 = r5.A02;
            if (i3 < r3.length) {
                r5.A00 = i3 + 1;
                r5.A01 = i3;
                Object obj = r3.keysArray[i3];
                if (C18450wi.A0R(obj, r3)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = r3.valuesArray;
                C18450wi.A0F(objArr);
                Object obj2 = objArr[r5.A01];
                if (C18450wi.A0R(obj2, r3)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                r5.A00();
                i2++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String obj3 = sb.toString();
        C18450wi.A0B(obj3);
        return obj3;
    }

    public final /* bridge */ Collection values() {
        C105865Bm r0 = this.valuesView;
        if (r0 != null) {
            return r0;
        }
        C105865Bm r02 = new C105865Bm(this);
        this.valuesView = r02;
        return r02;
    }
}
