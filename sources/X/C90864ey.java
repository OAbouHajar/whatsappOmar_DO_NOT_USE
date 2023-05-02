package X;

import java.util.Arrays;

/* renamed from: X.4ey  reason: invalid class name and case insensitive filesystem */
public final class C90864ey {
    public static Object createTable(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        throw AnonymousClass000.A0T(C13680ns.A0i("must be power of 2 between 2^1 and 2^30: ", C13690nt.A0g(52), i2));
    }

    public static int getHashPrefix(int i2, int i3) {
        return i2 & (i3 ^ -1);
    }

    public static int getNext(int i2, int i3) {
        return i2 & i3;
    }

    public static int maskCombine(int i2, int i3, int i4) {
        return (i2 & (i4 ^ -1)) | (i3 & i4);
    }

    public static int newCapacity(int i2) {
        int i3 = 2;
        if (i2 < 32) {
            i3 = 4;
        }
        return i3 * (i2 + 1);
    }

    public static int remove(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int smearedHash = C29041Zv.smearedHash(obj);
        int i5 = smearedHash & i2;
        int tableGet = tableGet(obj3, i5);
        if (tableGet != 0) {
            int hashPrefix = getHashPrefix(smearedHash, i2);
            int i6 = -1;
            while (true) {
                i3 = tableGet - 1;
                i4 = iArr[i3];
                if (getHashPrefix(i4, i2) != hashPrefix || !AnonymousClass45Q.A00(obj, objArr[i3]) || (objArr2 != null && !AnonymousClass45Q.A00(obj2, objArr2[i3]))) {
                    tableGet = getNext(i4, i2);
                    if (tableGet == 0) {
                        break;
                    }
                    i6 = i3;
                }
            }
            int next = getNext(i4, i2);
            if (i6 == -1) {
                tableSet(obj3, i5, next);
                return i3;
            }
            iArr[i6] = maskCombine(iArr[i6], next, i2);
            return i3;
        }
        return -1;
    }

    public static void tableClear(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int tableGet(Object obj, int i2) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static void tableSet(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static int tableSize(int i2) {
        return Math.max(4, C29041Zv.closedTableSize(i2 + 1, 1.0d));
    }
}
