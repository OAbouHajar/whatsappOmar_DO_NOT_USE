package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.07C  reason: invalid class name */
public class AnonymousClass07C {
    public final int A00;
    public final int A01;
    public final AnonymousClass07A A02;
    public final List A03;
    public final int[] A04;
    public final int[] A05;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
        r3 = r14.A02;
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        r3 = r13.A01;
        r14 = r14 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass07C(X.AnonymousClass07A r19, java.util.List r20, int[] r21, int[] r22) {
        /*
            r18 = this;
            r17 = 1
            r6 = r18
            r6.<init>()
            r0 = r20
            r6.A03 = r0
            r2 = r21
            r6.A05 = r2
            r1 = r22
            r6.A04 = r1
            r0 = 0
            java.util.Arrays.fill(r2, r0)
            java.util.Arrays.fill(r1, r0)
            r1 = r19
            r6.A02 = r1
            int r0 = r1.A01()
            r6.A01 = r0
            int r0 = r1.A00()
            r6.A00 = r0
            java.util.List r3 = r6.A03
            boolean r0 = r3.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0043
            java.lang.Object r1 = r3.get(r2)
            X.0Or r1 = (X.C04960Or) r1
            if (r1 == 0) goto L_0x0043
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0043
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0055
        L_0x0043:
            X.0Or r0 = new X.0Or
            r0.<init>()
            r0.A01 = r2
            r0.A02 = r2
            r0.A03 = r2
            r0.A00 = r2
            r0.A04 = r2
            r3.add(r2, r0)
        L_0x0055:
            int r10 = r6.A01
            int r5 = r6.A00
            java.util.List r9 = r6.A03
            int r8 = r9.size()
            int r8 = r8 - r17
        L_0x0061:
            if (r8 < 0) goto L_0x012e
            java.lang.Object r7 = r9.get(r8)
            X.0Or r7 = (X.C04960Or) r7
            int r11 = r7.A01
            int r0 = r7.A00
            int r11 = r11 + r0
            int r4 = r7.A02
            int r4 = r4 + r0
        L_0x0071:
            if (r10 <= r11) goto L_0x00bb
            r3 = r5
            r15 = r8
            int[] r12 = r6.A05
            int r2 = r10 + -1
            r0 = r12[r2]
            if (r0 == 0) goto L_0x007f
        L_0x007d:
            r10 = r2
            goto L_0x0071
        L_0x007f:
            java.lang.Object r14 = r9.get(r15)
            X.0Or r14 = (X.C04960Or) r14
            int r0 = r14.A00
            int r13 = r14.A02
            int r13 = r13 + r0
            r16 = 8
            int r3 = r3 - r17
        L_0x008e:
            if (r3 < r13) goto L_0x00b4
            X.07A r1 = r6.A02
            boolean r0 = r1.A04(r2, r3)
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r1.A03(r2, r3)
            if (r0 != 0) goto L_0x00a0
            r16 = 4
        L_0x00a0:
            int r10 = r10 - r17
            int r0 = r3 << 5
            r0 = r0 | 16
            r12[r10] = r0
            int[] r1 = r6.A04
            int r0 = r10 << 5
            r0 = r0 | r16
            r1[r3] = r0
            goto L_0x007d
        L_0x00b1:
            int r3 = r3 + -1
            goto L_0x008e
        L_0x00b4:
            int r3 = r14.A02
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x007d
            goto L_0x007f
        L_0x00bb:
            if (r5 <= r4) goto L_0x0100
            r3 = r10
            r14 = r8
            int[] r11 = r6.A04
            int r5 = r5 + -1
            r0 = r11[r5]
            if (r0 == 0) goto L_0x00c8
            goto L_0x00bb
        L_0x00c8:
            java.lang.Object r13 = r9.get(r14)
            X.0Or r13 = (X.C04960Or) r13
            int r12 = r13.A01
            int r0 = r13.A00
            int r12 = r12 + r0
            r2 = 8
            int r3 = r3 - r17
        L_0x00d7:
            if (r3 < r12) goto L_0x00f9
            X.07A r1 = r6.A02
            boolean r0 = r1.A04(r3, r5)
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r1.A03(r3, r5)
            if (r0 != 0) goto L_0x00e8
            r2 = 4
        L_0x00e8:
            int r0 = r3 << 5
            r0 = r0 | 16
            r11[r5] = r0
            int[] r1 = r6.A05
            int r0 = r5 << 5
            r0 = r0 | r2
            r1[r3] = r0
            goto L_0x00bb
        L_0x00f6:
            int r3 = r3 + -1
            goto L_0x00d7
        L_0x00f9:
            int r3 = r13.A01
            int r14 = r14 + -1
            if (r14 < 0) goto L_0x00bb
            goto L_0x00c8
        L_0x0100:
            r5 = 0
        L_0x0101:
            int r0 = r7.A00
            if (r5 >= r0) goto L_0x0126
            int r4 = r7.A01
            int r4 = r4 + r5
            int r3 = r7.A02
            int r3 = r3 + r5
            X.07A r0 = r6.A02
            boolean r0 = r0.A03(r4, r3)
            r2 = 2
            if (r0 == 0) goto L_0x0115
            r2 = 1
        L_0x0115:
            int[] r1 = r6.A05
            int r0 = r3 << 5
            r0 = r0 | r2
            r1[r4] = r0
            int[] r1 = r6.A04
            int r0 = r4 << 5
            r0 = r0 | r2
            r1[r3] = r0
            int r5 = r5 + 1
            goto L_0x0101
        L_0x0126:
            int r10 = r7.A01
            int r5 = r7.A02
            int r8 = r8 + -1
            goto L_0x0061
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07C.<init>(X.07A, java.util.List, int[], int[]):void");
    }

    public static AnonymousClass0OM A00(List list, int i2, boolean z2) {
        int size = list.size() - 1;
        while (size >= 0) {
            AnonymousClass0OM r3 = (AnonymousClass0OM) list.get(size);
            if (r3.A01 == i2 && r3.A02 == z2) {
                list.remove(size);
                while (size < list.size()) {
                    AnonymousClass0OM r2 = (AnonymousClass0OM) list.get(size);
                    int i3 = r2.A00;
                    int i4 = -1;
                    if (z2) {
                        i4 = 1;
                    }
                    r2.A00 = i3 + i4;
                    size++;
                }
                return r3;
            }
            size--;
        }
        return null;
    }

    public void A01(C13290lm r19) {
        C13290lm r5 = r19;
        C07600cA r52 = r5 instanceof C07600cA ? (C07600cA) r5 : new C07600cA(r5);
        ArrayList arrayList = new ArrayList();
        int i2 = this.A01;
        int i3 = this.A00;
        List list = this.A03;
        for (int size = list.size() - 1; size >= 0; size--) {
            C04960Or r8 = (C04960Or) list.get(size);
            int i4 = r8.A00;
            int i5 = r8.A01 + i4;
            int i6 = r8.A02 + i4;
            if (i5 < i2) {
                for (int i7 = (i2 - i5) - 1; i7 >= 0; i7--) {
                    int[] iArr = this.A05;
                    int i8 = i5 + i7;
                    int i9 = iArr[i8] & 31;
                    if (i9 == 0) {
                        r52.AW0(i5 + i7, 1);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AnonymousClass0OM) it.next()).A00--;
                        }
                    } else if (i9 == 4 || i9 == 8) {
                        int i10 = iArr[i8] >> 5;
                        AnonymousClass0OM A002 = A00(arrayList, i10, false);
                        r52.ATo(i5 + i7, A002.A00 - 1);
                        if (i9 == 4) {
                            r52.AOI(this.A02.A02(i8, i10), A002.A00 - 1, 1);
                        }
                    } else if (i9 == 16) {
                        arrayList.add(new AnonymousClass0OM(i8, i5 + i7, true));
                    } else {
                        StringBuilder sb = new StringBuilder("unknown flag for pos ");
                        sb.append(i8);
                        sb.append(" ");
                        sb.append(Long.toBinaryString((long) i9));
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (i6 < i3) {
                for (int i11 = (i3 - i6) - 1; i11 >= 0; i11--) {
                    int[] iArr2 = this.A04;
                    int i12 = i6 + i11;
                    int i13 = iArr2[i12] & 31;
                    if (i13 == 0) {
                        r52.ASG(i5, 1);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((AnonymousClass0OM) it2.next()).A00++;
                        }
                    } else if (i13 == 4 || i13 == 8) {
                        int i14 = iArr2[i12] >> 5;
                        r52.ATo(A00(arrayList, i14, true).A00, i5);
                        if (i13 == 4) {
                            r52.AOI(this.A02.A02(i14, i12), i5, 1);
                        }
                    } else if (i13 == 16) {
                        arrayList.add(new AnonymousClass0OM(i12, i5, false));
                    } else {
                        StringBuilder sb2 = new StringBuilder("unknown flag for pos ");
                        sb2.append(i12);
                        sb2.append(" ");
                        sb2.append(Long.toBinaryString((long) i13));
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
            while (true) {
                i4--;
                if (i4 < 0) {
                    break;
                }
                int[] iArr3 = this.A05;
                int i15 = r8.A01;
                if ((iArr3[i15 + i4] & 31) == 2) {
                    int i16 = i15 + i4;
                    r52.AOI(this.A02.A02(i16, r8.A02 + i4), i16, 1);
                }
            }
            i2 = r8.A01;
            i3 = r8.A02;
        }
        r52.A00();
    }

    public void A02(AnonymousClass01X r2) {
        A01(new C07590c9(r2));
    }
}
