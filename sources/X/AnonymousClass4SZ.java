package X;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4SZ  reason: invalid class name */
public final class AnonymousClass4SZ {
    public final C105925Bs A00(C09200f6... r26) {
        String A0h;
        int i2;
        int i3;
        C09200f6[] r5 = r26;
        int length = r5.length;
        int i4 = 0;
        if (length == 0) {
            return new C105925Bs(new int[]{0, -1}, new C09200f6[0]);
        }
        List A06 = C11330iZ.A06(r5);
        C003301l.A0K(A06);
        ArrayList A0i = C13690nt.A0i(length);
        int i5 = 0;
        do {
            C13690nt.A1O(A0i, -1);
            i5++;
        } while (i5 < length);
        Object[] array = A0i.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            List A0S = AnonymousClass1JA.A0S(Arrays.copyOf(numArr, numArr.length));
            int i6 = 0;
            int i7 = 0;
            while (true) {
                C09200f6 r10 = r26[i6];
                int i8 = i7 + 1;
                int size = A06.size();
                int i9 = 0;
                int size2 = A06.size();
                if (0 > size) {
                    StringBuilder A0q = AnonymousClass000.A0q("fromIndex (");
                    A0q.append(0);
                    A0q.append(") is greater than toIndex (");
                    A0q.append(size);
                    A0h = AnonymousClass000.A0h(").", A0q);
                    break;
                } else if (size <= size2) {
                    int i10 = size - 1;
                    while (true) {
                        i2 = -(i9 + 1);
                        if (i9 > i10) {
                            break;
                        }
                        i2 = (i9 + i10) >>> 1;
                        int A00 = C34181jp.A00((Comparable) A06.get(i2), r10);
                        if (A00 >= 0) {
                            if (A00 <= 0) {
                                break;
                            }
                            i10 = i2 - 1;
                        } else {
                            i9 = i2 + 1;
                        }
                    }
                    A0S.set(i2, Integer.valueOf(i7));
                    i6++;
                    i7 = i8;
                    if (i6 >= length) {
                        if (((C09200f6) A06.get(0)).A01() > 0) {
                            int i11 = 0;
                            while (i11 < A06.size()) {
                                C09200f6 r7 = (C09200f6) A06.get(i11);
                                int i12 = i11 + 1;
                                int i13 = i12;
                                while (i13 < A06.size()) {
                                    C09200f6 r4 = (C09200f6) A06.get(i13);
                                    C18450wi.A0G(r7, 0);
                                    if (!r4.A04(r7, 0, 0, r7.A01())) {
                                        continue;
                                        break;
                                    } else if (r4.A01() == r7.A01()) {
                                        A0h = AnonymousClass000.A0g("duplicate option: ", r4);
                                    } else if (AnonymousClass000.A0D(A0S.get(i13)) > AnonymousClass000.A0D(A0S.get(i11))) {
                                        A06.remove(i13);
                                        A0S.remove(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                                i11 = i12;
                            }
                            C11050i7 r42 = new C11050i7();
                            A01(A06, A0S, r42, 0, 0, A06.size(), 0);
                            int[] iArr = new int[((int) (r42.A00 / ((long) 4)))];
                            while (true) {
                                long j2 = r42.A00;
                                if (j2 == 0) {
                                    return new C105925Bs(iArr, (C09200f6[]) r5.clone());
                                }
                                int i14 = i4 + 1;
                                if (j2 >= 4) {
                                    C89434cA r6 = r42.A01;
                                    if (r6 == null) {
                                        C18450wi.A07();
                                        throw AnonymousClass000.A0Z();
                                    }
                                    int i15 = r6.A01;
                                    int i16 = r6.A00;
                                    if (((long) (i16 - i15)) < 4) {
                                        i3 = ((r42.readByte() & 255) << 24) | ((r42.readByte() & 255) << 16) | ((r42.readByte() & 255) << 8) | (r42.readByte() & 255);
                                    } else {
                                        byte[] bArr = r6.A06;
                                        int i17 = i15 + 1;
                                        int i18 = i17 + 1;
                                        int i19 = i18 + 1;
                                        int A0L = AnonymousClass3K3.A0L(bArr, i18, AnonymousClass3K3.A0M(bArr, i17, (bArr[i15] & 255) << 24));
                                        int i20 = i19 + 1;
                                        i3 = A0L | (bArr[i19] & 255);
                                        r42.A00 = j2 - 4;
                                        if (i20 == i16) {
                                            r42.A01 = r6.A00();
                                            C90404e5.A01(r6);
                                        } else {
                                            r6.A01 = i20;
                                        }
                                    }
                                    iArr[i4] = i3;
                                    i4 = i14;
                                } else {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            A0h = "the empty byte string is not a supported option";
                        }
                    }
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("toIndex (");
                    A0r.append(size);
                    A0r.append(") is greater than size (");
                    A0r.append(size2);
                    throw new IndexOutOfBoundsException(AnonymousClass000.A0h(").", A0r));
                }
            }
            throw AnonymousClass000.A0T(A0h);
        }
        throw new C795240e("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void A01(List list, List list2, C11050i7 r25, int i2, int i3, int i4, long j2) {
        int i5;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        if (AnonymousClass3K3.A1Q(i8, i6)) {
            int i9 = i8;
            while (true) {
                List list3 = list;
                if (i9 >= i6) {
                    C09200f6 r9 = (C09200f6) list3.get(i8);
                    C09200f6 r11 = (C09200f6) list3.get(i4 - 1);
                    List list4 = list2;
                    if (i7 == r9.A01()) {
                        i5 = AnonymousClass000.A0D(list4.get(i8));
                        i8 = i3 + 1;
                        r9 = (C09200f6) list3.get(i8);
                    } else {
                        i5 = -1;
                    }
                    C11050i7 r4 = r25;
                    if (r9.A00(i7) != r11.A00(i7)) {
                        int i10 = 1;
                        for (int i11 = i8 + 1; i11 < i6; i11++) {
                            if (((C09200f6) list3.get(i11 - 1)).A00(i7) != ((C09200f6) list3.get(i11)).A00(i7)) {
                                i10++;
                            }
                        }
                        long j3 = (long) 4;
                        long j4 = j2 + (r4.A00 / j3) + ((long) 2) + ((long) (i10 << 1));
                        r4.A0D(i10);
                        r4.A0D(i5);
                        for (int i12 = i8; i12 < i6; i12++) {
                            byte A00 = ((C09200f6) list3.get(i12)).A00(i7);
                            if (i12 == i8 || A00 != ((C09200f6) list3.get(i12 - 1)).A00(i7)) {
                                r4.A0D(A00 & 255);
                            }
                        }
                        C11050i7 r92 = new C11050i7();
                        while (i8 < i6) {
                            byte A002 = ((C09200f6) list3.get(i8)).A00(i7);
                            int i13 = i8 + 1;
                            int i14 = i13;
                            while (true) {
                                if (i14 < i6) {
                                    if (A002 != ((C09200f6) list3.get(i14)).A00(i7)) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = i6;
                                    break;
                                }
                            }
                            if (i13 == i14 && i2 + 1 == ((C09200f6) list3.get(i8)).A01()) {
                                r4.A0D(AnonymousClass000.A0D(list4.get(i8)));
                            } else {
                                r4.A0D(-((int) (j4 + (r92.A00 / j3))));
                                A01(list3, list4, r92, i2 + 1, i8, i14, j4);
                            }
                            i8 = i14;
                        }
                        do {
                        } while (r92.AbQ(r4, (long) 8192) != -1);
                        return;
                    }
                    int min = Math.min(r9.A01(), r11.A01());
                    int i15 = i7;
                    int i16 = 0;
                    while (i15 < min && r9.A00(i15) == r11.A00(i15)) {
                        i16++;
                        i15++;
                    }
                    long j5 = (long) 4;
                    long j6 = j2 + (r4.A00 / j5) + ((long) 2) + ((long) i16) + 1;
                    r4.A0D(-i16);
                    r4.A0D(i5);
                    int i17 = i2 + i16;
                    while (i7 < i17) {
                        r4.A0D(r9.A00(i7) & 255);
                        i7++;
                    }
                    if (i8 + 1 != i6) {
                        C11050i7 r5 = new C11050i7();
                        r4.A0D(-((int) ((r5.A00 / j5) + j6)));
                        A01(list3, list4, r5, i17, i8, i6, j6);
                        do {
                        } while (r5.AbQ(r4, (long) 8192) != -1);
                        return;
                    } else if (i17 == ((C09200f6) list3.get(i8)).A01()) {
                        r4.A0D(AnonymousClass000.A0D(list4.get(i8)));
                        return;
                    } else {
                        throw AnonymousClass000.A0V("Check failed.");
                    }
                } else if (((C09200f6) list3.get(i9)).A01() >= i7) {
                    i9++;
                } else {
                    throw AnonymousClass000.A0T("Failed requirement.");
                }
            }
        } else {
            throw AnonymousClass000.A0T("Failed requirement.");
        }
    }
}
