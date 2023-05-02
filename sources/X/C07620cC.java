package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0cC  reason: invalid class name and case insensitive filesystem */
public class C07620cC implements C12480kT {
    public int A00 = 0;
    public C13010lK A01 = new AnonymousClass0b2(30);
    public final C13200ld A02;
    public final AnonymousClass0NS A03;
    public final ArrayList A04 = AnonymousClass000.A0u();
    public final ArrayList A05 = AnonymousClass000.A0u();

    public C07620cC(C13200ld r3) {
        this.A02 = r3;
        this.A03 = new AnonymousClass0NS(this);
    }

    public static void A00(AnonymousClass0RN r1, C07620cC r2) {
        r1.A03 = null;
        r2.A01.Abi(r1);
    }

    public int A01(int i2, int i3) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        while (i3 < size) {
            AnonymousClass0RN r3 = (AnonymousClass0RN) arrayList.get(i3);
            int i4 = r3.A00;
            if (i4 == 8) {
                int i5 = r3.A02;
                if (i5 == i2) {
                    i2 = r3.A01;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (r3.A01 <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = r3.A02;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = r3.A01;
                    int i8 = i2;
                    i2 -= i7;
                    if (i8 < i6 + i7) {
                        return -1;
                    }
                } else if (i4 == 1) {
                    i2 += r3.A01;
                }
            }
            i3++;
        }
        return i2;
    }

    public final int A02(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AnonymousClass0RN r6 = (AnonymousClass0RN) arrayList.get(size);
            int i8 = r6.A00;
            int i9 = r6.A02;
            if (i8 == 8) {
                int i10 = r6.A01;
                int i11 = i9;
                int i12 = i10;
                if (i9 < i10) {
                    i12 = i9;
                    i11 = i10;
                }
                if (i2 < i12 || i2 > i11) {
                    if (i2 < i9) {
                        if (i3 == 1) {
                            r6.A02 = i9 + 1;
                            i5 = i10 + 1;
                        } else if (i3 == 2) {
                            r6.A02 = i9 - 1;
                            i5 = i10 - 1;
                        }
                        r6.A01 = i5;
                    }
                } else if (i12 == i9) {
                    if (i3 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i3 == 2) {
                            i7 = i10 - 1;
                        }
                        i2++;
                    }
                    r6.A01 = i7;
                    i2++;
                } else {
                    if (i3 == 1) {
                        i6 = i9 + 1;
                    } else {
                        if (i3 == 2) {
                            i6 = i9 - 1;
                        }
                        i2--;
                    }
                    r6.A02 = i6;
                    i2--;
                }
            } else if (i9 > i2) {
                if (i3 == 1) {
                    i4 = i9 + 1;
                } else if (i3 == 2) {
                    i4 = i9 - 1;
                }
                r6.A02 = i4;
            } else if (i8 == 1) {
                i2 -= r6.A01;
            } else if (i8 == 2) {
                i2 += r6.A01;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            AnonymousClass0RN r2 = (AnonymousClass0RN) arrayList.get(size2);
            int i13 = r2.A00;
            int i14 = r2.A01;
            if (i13 == 8) {
                if (i14 != r2.A02 && i14 >= 0) {
                }
            } else if (i14 > 0) {
            }
            arrayList.remove(size2);
            A00(r2, this);
        }
        return i2;
    }

    public void A03() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C07560c6) this.A02).A00((AnonymousClass0RN) arrayList.get(i2));
        }
        A09(arrayList);
        this.A00 = 0;
    }

    public void A04() {
        A03();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0RN r8 = (AnonymousClass0RN) arrayList.get(i2);
            int i3 = r8.A00;
            if (i3 == 1) {
                C13200ld r2 = this.A02;
                ((C07560c6) r2).A00(r8);
                r2.ALu(r8.A02, r8.A01);
            } else if (i3 == 2) {
                C07560c6 r0 = (C07560c6) this.A02;
                r0.A00(r8);
                int i4 = r8.A02;
                int i5 = r8.A01;
                RecyclerView recyclerView = r0.A00;
                recyclerView.A0f(i4, i5, true);
                recyclerView.A0k = true;
                recyclerView.A0y.A00 += i5;
            } else if (i3 == 4) {
                C13200ld r3 = this.A02;
                ((C07560c6) r3).A00(r8);
                r3.AKe(r8.A03, r8.A02, r8.A01);
            } else if (i3 == 8) {
                C13200ld r22 = this.A02;
                ((C07560c6) r22).A00(r8);
                r22.ALv(r8.A02, r8.A01);
            }
        }
        A09(arrayList);
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e6, code lost:
        if (r12.A0K.A02.contains(r1.A0H) != false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x021e, code lost:
        if (r3 == 0) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0243, code lost:
        if (r13.A0K.A02.contains(r1.A0H) != false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0281, code lost:
        if (r4 == 0) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if (r4.A01 != (r11 - r13)) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0101, code lost:
        if (r4.A01 != (r13 - r11)) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0105, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0130, code lost:
        if (r1 > r4.A02) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0175, code lost:
        if (r1 >= r4.A02) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
            r15 = this;
            X.0NS r9 = r15.A03
            java.util.ArrayList r8 = r15.A04
        L_0x0004:
            int r7 = r8.size()
            r0 = 1
            int r7 = r7 - r0
            r2 = 0
        L_0x000b:
            if (r7 < 0) goto L_0x01a6
            java.lang.Object r0 = r8.get(r7)
            X.0RN r0 = (X.AnonymousClass0RN) r0
            int r1 = r0.A00
            r0 = 8
            if (r1 != r0) goto L_0x01a1
            if (r2 == 0) goto L_0x01a2
            int r6 = r7 + 1
            java.lang.Object r5 = r8.get(r7)
            X.0RN r5 = (X.AnonymousClass0RN) r5
            java.lang.Object r4 = r8.get(r6)
            X.0RN r4 = (X.AnonymousClass0RN) r4
            int r1 = r4.A00
            r0 = 1
            if (r1 == r0) goto L_0x0178
            r10 = 2
            if (r1 == r10) goto L_0x0093
            r3 = 4
            if (r1 != r3) goto L_0x0004
            int r2 = r5.A01
            int r1 = r4.A02
            r10 = 0
            r11 = 1
            if (r2 >= r1) goto L_0x0080
            int r1 = r1 - r0
            r4.A02 = r1
        L_0x003f:
            r11 = r10
        L_0x0040:
            int r1 = r5.A02
            int r12 = r4.A02
            if (r1 > r12) goto L_0x006a
            int r0 = r12 + 1
            r4.A02 = r0
        L_0x004a:
            r8.set(r6, r5)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x005f
            r8.set(r7, r4)
        L_0x0054:
            if (r11 == 0) goto L_0x0059
            r8.add(r7, r11)
        L_0x0059:
            if (r10 == 0) goto L_0x0004
            r8.add(r7, r10)
            goto L_0x0004
        L_0x005f:
            r8.remove(r7)
            X.0kT r0 = r9.A00
            X.0cC r0 = (X.C07620cC) r0
            A00(r4, r0)
            goto L_0x0054
        L_0x006a:
            int r0 = r4.A01
            int r12 = r12 + r0
            if (r1 >= r12) goto L_0x004a
            int r12 = r12 - r1
            X.0kT r2 = r9.A00
            int r1 = r1 + 1
            java.lang.Object r0 = r4.A03
            X.0RN r10 = r2.ALt(r0, r3, r1, r12)
            int r0 = r4.A01
            int r0 = r0 - r12
            r4.A01 = r0
            goto L_0x004a
        L_0x0080:
            int r0 = r4.A01
            int r1 = r1 + r0
            if (r2 >= r1) goto L_0x003f
            int r0 = r0 - r11
            r4.A01 = r0
            X.0kT r2 = r9.A00
            int r1 = r5.A02
            java.lang.Object r0 = r4.A03
            X.0RN r11 = r2.ALt(r0, r3, r1, r11)
            goto L_0x0040
        L_0x0093:
            int r13 = r5.A02
            int r11 = r5.A01
            r14 = 0
            r2 = 1
            int r3 = r4.A02
            if (r13 >= r11) goto L_0x00f9
            if (r3 != r13) goto L_0x00a6
            int r1 = r4.A01
            int r0 = r11 - r13
            r12 = 0
            if (r1 == r0) goto L_0x0105
        L_0x00a6:
            r12 = 0
        L_0x00a7:
            if (r11 >= r3) goto L_0x00dc
            int r3 = r3 - r2
            r4.A02 = r3
        L_0x00ac:
            int r11 = r5.A02
            r2 = 0
            if (r11 > r3) goto L_0x00c6
            int r0 = r3 + 1
            r4.A02 = r0
        L_0x00b5:
            if (r14 == 0) goto L_0x0107
            r8.set(r7, r4)
            r8.remove(r6)
            X.0kT r0 = r9.A00
            X.0cC r0 = (X.C07620cC) r0
            A00(r5, r0)
            goto L_0x0004
        L_0x00c6:
            int r0 = r4.A01
            int r3 = r3 + r0
            if (r11 >= r3) goto L_0x00b5
            int r3 = r3 - r11
            X.0kT r1 = r9.A00
            int r0 = r11 + 1
            X.0RN r2 = r1.ALt(r2, r10, r0, r3)
            int r1 = r5.A02
            int r0 = r4.A02
            int r1 = r1 - r0
            r4.A01 = r1
            goto L_0x00b5
        L_0x00dc:
            int r1 = r4.A01
            int r0 = r3 + r1
            if (r11 >= r0) goto L_0x00ac
            int r1 = r1 - r2
            r4.A01 = r1
            r5.A00 = r10
            r5.A01 = r2
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0004
            r8.remove(r6)
            X.0kT r0 = r9.A00
            X.0cC r0 = (X.C07620cC) r0
            A00(r4, r0)
            goto L_0x0004
        L_0x00f9:
            int r0 = r11 + 1
            if (r3 != r0) goto L_0x0103
            int r0 = r4.A01
            int r13 = r13 - r11
            r12 = 1
            if (r0 == r13) goto L_0x0105
        L_0x0103:
            r12 = 1
            goto L_0x00a7
        L_0x0105:
            r14 = 1
            goto L_0x00a7
        L_0x0107:
            if (r12 == 0) goto L_0x014e
            if (r2 == 0) goto L_0x0121
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0116
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0116:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0121
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0121:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x012c
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x012c:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x0137
        L_0x0132:
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0137:
            r8.set(r7, r4)
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 == r0) goto L_0x014a
            r8.set(r6, r5)
        L_0x0143:
            if (r2 == 0) goto L_0x0004
            r8.add(r7, r2)
            goto L_0x0004
        L_0x014a:
            r8.remove(r6)
            goto L_0x0143
        L_0x014e:
            if (r2 == 0) goto L_0x0166
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 < r0) goto L_0x015b
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x015b:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 < r0) goto L_0x0166
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0166:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 < r0) goto L_0x0171
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0171:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 < r0) goto L_0x0137
            goto L_0x0132
        L_0x0178:
            int r3 = r5.A01
            int r0 = r4.A02
            r2 = 0
            if (r3 >= r0) goto L_0x0180
            r2 = -1
        L_0x0180:
            int r1 = r5.A02
            if (r1 >= r0) goto L_0x0186
            int r2 = r2 + 1
        L_0x0186:
            if (r0 > r1) goto L_0x018d
            int r0 = r4.A01
            int r1 = r1 + r0
            r5.A02 = r1
        L_0x018d:
            int r1 = r4.A02
            if (r1 > r3) goto L_0x0196
            int r0 = r4.A01
            int r3 = r3 + r0
            r5.A01 = r3
        L_0x0196:
            int r1 = r1 + r2
            r4.A02 = r1
            r8.set(r7, r4)
            r8.set(r6, r5)
            goto L_0x0004
        L_0x01a1:
            r2 = 1
        L_0x01a2:
            int r7 = r7 + -1
            goto L_0x000b
        L_0x01a6:
            int r7 = r8.size()
            r6 = 0
        L_0x01ab:
            if (r6 >= r7) goto L_0x028d
            java.lang.Object r5 = r8.get(r6)
            X.0RN r5 = (X.AnonymousClass0RN) r5
            int r1 = r5.A00
            r0 = 1
            if (r1 == r0) goto L_0x0288
            r10 = 2
            if (r1 == r10) goto L_0x0221
            r9 = 4
            if (r1 == r9) goto L_0x01c5
            r0 = 8
            if (r1 == r0) goto L_0x0288
        L_0x01c2:
            int r6 = r6 + 1
            goto L_0x01ab
        L_0x01c5:
            int r11 = r5.A02
            int r10 = r5.A01
            int r10 = r10 + r11
            r4 = r11
            r3 = -1
            r2 = 0
        L_0x01cd:
            if (r11 >= r10) goto L_0x0211
            X.0ld r0 = r15.A02
            X.0c6 r0 = (X.C07560c6) r0
            androidx.recyclerview.widget.RecyclerView r12 = r0.A00
            r0 = 1
            X.02k r1 = r12.A0E(r11, r0)
            if (r1 == 0) goto L_0x01e8
            X.0SK r0 = r12.A0K
            android.view.View r1 = r1.A0H
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0202
        L_0x01e8:
            r1 = 1
            boolean r0 = r15.A0A(r11)
            if (r0 != 0) goto L_0x0202
            if (r3 != r1) goto L_0x01fc
            java.lang.Object r0 = r5.A03
            X.0RN r0 = r15.ALt(r0, r9, r4, r2)
            r15.A07(r0)
            r4 = r11
            r2 = 0
        L_0x01fc:
            r3 = 0
        L_0x01fd:
            int r2 = r2 + 1
            int r11 = r11 + 1
            goto L_0x01cd
        L_0x0202:
            if (r3 != 0) goto L_0x020f
            java.lang.Object r0 = r5.A03
            X.0RN r0 = r15.ALt(r0, r9, r4, r2)
            r15.A06(r0)
            r4 = r11
            r2 = 0
        L_0x020f:
            r3 = 1
            goto L_0x01fd
        L_0x0211:
            int r0 = r5.A01
            if (r2 == r0) goto L_0x021e
            java.lang.Object r0 = r5.A03
            A00(r5, r15)
            X.0RN r5 = r15.ALt(r0, r9, r4, r2)
        L_0x021e:
            if (r3 != 0) goto L_0x0288
            goto L_0x0283
        L_0x0221:
            int r9 = r5.A02
            int r12 = r5.A01
            int r12 = r12 + r9
            r4 = -1
            r11 = r9
            r3 = 0
        L_0x0229:
            r2 = 0
            if (r11 >= r12) goto L_0x0272
            X.0ld r0 = r15.A02
            X.0c6 r0 = (X.C07560c6) r0
            androidx.recyclerview.widget.RecyclerView r13 = r0.A00
            r0 = 1
            X.02k r1 = r13.A0E(r11, r0)
            if (r1 == 0) goto L_0x0245
            X.0SK r0 = r13.A0K
            android.view.View r1 = r1.A0H
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0264
        L_0x0245:
            r1 = 1
            boolean r0 = r15.A0A(r11)
            if (r0 != 0) goto L_0x0264
            if (r4 != r1) goto L_0x0262
            X.0RN r0 = r15.ALt(r2, r10, r9, r3)
            r15.A07(r0)
            r0 = 1
        L_0x0256:
            r4 = 0
        L_0x0257:
            if (r0 == 0) goto L_0x025f
            int r11 = r11 - r3
            int r12 = r12 - r3
            r3 = 1
        L_0x025c:
            int r11 = r11 + 1
            goto L_0x0229
        L_0x025f:
            int r3 = r3 + 1
            goto L_0x025c
        L_0x0262:
            r0 = 0
            goto L_0x0256
        L_0x0264:
            if (r4 != 0) goto L_0x0270
            X.0RN r0 = r15.ALt(r2, r10, r9, r3)
            r15.A06(r0)
            r0 = 1
        L_0x026e:
            r4 = 1
            goto L_0x0257
        L_0x0270:
            r0 = 0
            goto L_0x026e
        L_0x0272:
            int r0 = r5.A01
            if (r3 == r0) goto L_0x0281
            r5.A03 = r2
            X.0lK r0 = r15.A01
            r0.Abi(r5)
            X.0RN r5 = r15.ALt(r2, r10, r9, r3)
        L_0x0281:
            if (r4 != 0) goto L_0x0288
        L_0x0283:
            r15.A06(r5)
            goto L_0x01c2
        L_0x0288:
            r15.A07(r5)
            goto L_0x01c2
        L_0x028d:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07620cC.A05():void");
    }

    public final void A06(AnonymousClass0RN r11) {
        String str;
        int i2;
        int i3 = r11.A00;
        if (i3 == 1 || i3 == 8) {
            str = "should not dispatch add or move for pre layout";
        } else {
            int A022 = A02(r11.A02, i3);
            int i4 = r11.A02;
            int i5 = r11.A00;
            if (i5 == 2) {
                i2 = 0;
            } else if (i5 == 4) {
                i2 = 1;
            } else {
                str = AnonymousClass000.A0g("op should be remove or update.", r11);
            }
            int i6 = 1;
            for (int i7 = 1; i7 < r11.A01; i7++) {
                int A023 = A02(r11.A02 + (i2 * i7), i5);
                i5 = r11.A00;
                if (i5 == 2 ? A023 != A022 : !(i5 == 4 && A023 == A022 + 1)) {
                    AnonymousClass0RN ALt = ALt(r11.A03, i5, A022, i6);
                    A08(ALt, i4);
                    A00(ALt, this);
                    i5 = r11.A00;
                    if (i5 == 4) {
                        i4 += i6;
                    }
                    A022 = A023;
                    i6 = 1;
                } else {
                    i6++;
                }
            }
            Object obj = r11.A03;
            r11.A03 = null;
            C13010lK r2 = this.A01;
            r2.Abi(r11);
            if (i6 > 0) {
                AnonymousClass0RN ALt2 = ALt(obj, r11.A00, A022, i6);
                A08(ALt2, i4);
                ALt2.A03 = null;
                r2.Abi(ALt2);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0T(str);
    }

    public final void A07(AnonymousClass0RN r5) {
        this.A05.add(r5);
        int i2 = r5.A00;
        if (i2 == 1) {
            this.A02.ALu(r5.A02, r5.A01);
        } else if (i2 == 2) {
            C13200ld r0 = this.A02;
            int i3 = r5.A02;
            int i4 = r5.A01;
            RecyclerView recyclerView = ((C07560c6) r0).A00;
            recyclerView.A0f(i3, i4, false);
            recyclerView.A0k = true;
        } else if (i2 == 4) {
            this.A02.AKe(r5.A03, r5.A02, r5.A01);
        } else if (i2 == 8) {
            this.A02.ALv(r5.A02, r5.A01);
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0g("Unknown update op type for ", r5));
        }
    }

    public void A08(AnonymousClass0RN r5, int i2) {
        C13200ld r2 = this.A02;
        C07560c6 r3 = (C07560c6) r2;
        r3.A00(r5);
        int i3 = r5.A00;
        if (i3 == 2) {
            int i4 = r5.A01;
            RecyclerView recyclerView = r3.A00;
            recyclerView.A0f(i2, i4, true);
            recyclerView.A0k = true;
            recyclerView.A0y.A00 += i4;
        } else if (i3 == 4) {
            r2.AKe(r5.A03, i2, r5.A01);
        } else {
            throw AnonymousClass000.A0T("only remove and update ops can be dispatched in first pass");
        }
    }

    public void A09(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00((AnonymousClass0RN) list.get(i2), this);
        }
        list.clear();
    }

    public final boolean A0A(int i2) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            AnonymousClass0RN r4 = (AnonymousClass0RN) arrayList.get(i3);
            int i4 = r4.A00;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = r4.A02;
                    int i6 = r4.A01 + i5;
                    while (i5 < i6) {
                        if (A01(i5, i3 + 1) != i2) {
                            i5++;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i3++;
            } else if (A01(r4.A01, i3 + 1) != i2) {
                i3++;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass0RN ALt(Object obj, int i2, int i3, int i4) {
        AnonymousClass0RN r0 = (AnonymousClass0RN) this.A01.A4T();
        if (r0 == null) {
            return new AnonymousClass0RN(obj, i2, i3, i4);
        }
        r0.A00 = i2;
        r0.A02 = i3;
        r0.A01 = i4;
        r0.A03 = obj;
        return r0;
    }
}
