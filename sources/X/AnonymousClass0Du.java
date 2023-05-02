package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Du  reason: invalid class name */
public class AnonymousClass0Du extends C07250ar {
    public int A00;
    public ArrayList A01;

    public AnonymousClass0Du(AnonymousClass0SN r7, int i2) {
        super(r7);
        AnonymousClass0SN r1;
        ArrayList A0u = AnonymousClass000.A0u();
        this.A01 = A0u;
        this.A01 = i2;
        AnonymousClass0SN r5 = this.A03;
        AnonymousClass0SN r3 = r5;
        AnonymousClass0S1 r2 = i2 == 0 ? r5.A0W : r5.A0Y;
        while (true) {
            AnonymousClass0S1 r12 = r2.A03;
            AnonymousClass0SN r0 = (r12 == null || r12.A03 != r2) ? null : r12.A06;
            r1 = r5;
            r5 = r0;
            if (r0 == null) {
                break;
            }
            r3 = r0;
            r2 = i2 == 0 ? r0.A0W : r0.A0Y;
        }
        this.A03 = r3;
        Object obj = i2 == 0 ? r3.A0c : r3.A0d;
        while (true) {
            A0u.add(obj);
            AnonymousClass0S1 r22 = i2 == 0 ? r1.A0X : r1.A0S;
            AnonymousClass0S1 r13 = r22.A03;
            if (r13 == null || r13.A03 != r22) {
                Iterator it = A0u.iterator();
            } else {
                r1 = r13.A06;
                obj = i2 == 0 ? r1.A0c : r1.A0d;
            }
        }
        Iterator it2 = A0u.iterator();
        while (it2.hasNext()) {
            C07250ar r14 = (C07250ar) it2.next();
            int i3 = this.A01;
            if (i3 == 0) {
                r14.A03.A0a = this;
            } else if (i3 == 1) {
                r14.A03.A0b = this;
            }
        }
        int i4 = this.A01;
        if (i4 == 0 && ((AnonymousClass0Dp) this.A03.A0Z).A0A && A0u.size() > 1) {
            this.A03 = A00(A0u, A0u.size() - 1);
        }
        AnonymousClass0SN r02 = this.A03;
        this.A00 = i4 == 0 ? r02.A0A : r02.A0L;
    }

    public static AnonymousClass0SN A00(AbstractList abstractList, int i2) {
        return ((C07250ar) abstractList.get(i2)).A03;
    }

    public long A0A() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C07250ar r2 = (C07250ar) arrayList.get(i2);
            j2 = j2 + ((long) r2.A05.A00) + r2.A0A() + ((long) r2.A04.A00);
        }
        return j2;
    }

    public void A0B() {
        C07240aq A03;
        int A002;
        AnonymousClass0S1 r0;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C07250ar) it.next()).A0B();
        }
        int size = arrayList.size();
        if (size >= 1) {
            AnonymousClass0SN A003 = A00(arrayList, 0);
            AnonymousClass0SN A004 = A00(arrayList, size - 1);
            if (this.A01 != 0) {
                AnonymousClass0S1 r02 = A003.A0Y;
                AnonymousClass0S1 r6 = A004.A0S;
                C07240aq A032 = C07250ar.A03(r02, 1);
                int A005 = r02.A00();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    AnonymousClass0SN A006 = A00(arrayList, i2);
                    if (A006.A0N != 8) {
                        A005 = A006.A0Y.A00();
                        break;
                    }
                    i2++;
                }
                if (A032 != null) {
                    C07250ar.A06(this.A05, A032, A005);
                }
                A03 = C07250ar.A03(r6, 1);
                A002 = r6.A00();
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    AnonymousClass0SN A007 = A00(arrayList, size2);
                    if (A007.A0N != 8) {
                        r0 = A007.A0S;
                        break;
                    }
                }
            } else {
                AnonymousClass0S1 r03 = A003.A0W;
                AnonymousClass0S1 r62 = A004.A0X;
                C07240aq A033 = C07250ar.A03(r03, 0);
                int A008 = r03.A00();
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    AnonymousClass0SN A009 = A00(arrayList, i3);
                    if (A009.A0N != 8) {
                        A008 = A009.A0W.A00();
                        break;
                    }
                    i3++;
                }
                if (A033 != null) {
                    C07250ar.A06(this.A05, A033, A008);
                }
                A03 = C07250ar.A03(r62, 0);
                A002 = r62.A00();
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    AnonymousClass0SN A0010 = A00(arrayList, size3);
                    if (A0010.A0N != 8) {
                        r0 = A0010.A0X;
                        break;
                    }
                }
            }
            A002 = r0.A00();
            if (A03 != null) {
                C07250ar.A06(this.A04, A03, -A002);
            }
            this.A05.A03 = this;
            this.A04.A03 = this;
        }
    }

    public void A0C() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i2 < arrayList.size()) {
                ((C07250ar) arrayList.get(i2)).A0C();
                i2++;
            } else {
                return;
            }
        }
    }

    public void A0D() {
        this.A07 = null;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C07250ar) it.next()).A0D();
        }
    }

    public boolean A0G() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((C07250ar) arrayList.get(i2)).A0G()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x023b, code lost:
        if (r19 != false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02bc, code lost:
        if (r19 != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0348, code lost:
        if (r19 != false) goto L_0x0319;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AhI(X.C12360kG r24) {
        /*
            r23 = this;
            r14 = r23
            X.0aq r3 = r14.A05
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0357
            X.0aq r2 = r14.A04
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0357
            X.0SN r0 = r14.A03
            X.0SN r1 = r0.A0Z
            if (r1 == 0) goto L_0x0041
            boolean r0 = r1 instanceof X.AnonymousClass0Dp
            if (r0 == 0) goto L_0x0041
            X.0Dp r1 = (X.AnonymousClass0Dp) r1
            boolean r0 = r1.A0A
            r19 = r0
        L_0x001e:
            int r0 = r2.A02
            r17 = r0
            int r13 = r3.A02
            int r12 = r0 - r13
            java.util.ArrayList r0 = r14.A01
            r22 = r0
            int r11 = r22.size()
            r10 = 0
        L_0x002f:
            r9 = -1
            r2 = 8
            if (r10 >= r11) goto L_0x0044
            r0 = r22
            X.0SN r0 = A00(r0, r10)
            int r0 = r0.A0N
            if (r0 != r2) goto L_0x0045
            int r10 = r10 + 1
            goto L_0x002f
        L_0x0041:
            r19 = 0
            goto L_0x001e
        L_0x0044:
            r10 = -1
        L_0x0045:
            int r8 = r11 + -1
            r1 = r8
        L_0x0048:
            if (r1 < 0) goto L_0x0058
            r0 = r22
            X.0SN r0 = A00(r0, r1)
            int r0 = r0.A0N
            if (r0 != r2) goto L_0x0057
            int r1 = r1 + -1
            goto L_0x0048
        L_0x0057:
            r9 = r1
        L_0x0058:
            r1 = 0
        L_0x0059:
            r3 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r18 = 0
        L_0x005f:
            if (r3 >= r11) goto L_0x00d7
            r0 = r22
            java.lang.Object r4 = r0.get(r3)
            X.0ar r4 = (X.C07250ar) r4
            X.0SN r0 = r4.A03
            int r0 = r0.A0N
            if (r0 == r2) goto L_0x00bc
            int r5 = r5 + 1
            if (r3 <= 0) goto L_0x007a
            if (r3 < r10) goto L_0x007a
            X.0aq r0 = r4.A05
            int r0 = r0.A00
            int r7 = r7 + r0
        L_0x007a:
            X.0Dr r2 = r4.A06
            int r0 = r2.A02
            r16 = r0
            X.0Jy r15 = r4.A02
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r15 == r0) goto L_0x00a3
            r2 = 1
            int r0 = r14.A01
            if (r0 != 0) goto L_0x0096
            X.0SN r0 = r4.A03
            X.0Dw r0 = r0.A0c
            X.0Dr r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00b0
            return
        L_0x0096:
            if (r0 != r2) goto L_0x00b0
            X.0SN r0 = r4.A03
            X.0Dv r0 = r0.A0d
            X.0Dr r0 = r0.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00b0
            return
        L_0x00a3:
            r15 = 1
            int r0 = r4.A00
            if (r0 != r15) goto L_0x00c1
            if (r1 != 0) goto L_0x00c1
            int r0 = r2.A00
            r16 = r0
            int r6 = r6 + 1
        L_0x00b0:
            int r7 = r7 + r16
        L_0x00b2:
            if (r3 >= r8) goto L_0x00bc
            if (r3 >= r9) goto L_0x00bc
            X.0aq r0 = r4.A04
            int r0 = r0.A00
            int r0 = -r0
            int r7 = r7 + r0
        L_0x00bc:
            int r3 = r3 + 1
            r2 = 8
            goto L_0x005f
        L_0x00c1:
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x00b0
            int r6 = r6 + 1
            X.0SN r0 = r4.A03
            float[] r2 = r0.A0j
            int r0 = r14.A01
            r2 = r2[r0]
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b2
            float r18 = r18 + r2
            goto L_0x00b2
        L_0x00d7:
            if (r7 < r12) goto L_0x00e7
            if (r6 == 0) goto L_0x00e7
            int r1 = r1 + 1
            r0 = 2
            r5 = 0
            r7 = 0
            r6 = 0
            r18 = 0
            if (r1 >= r0) goto L_0x00e7
            goto L_0x0059
        L_0x00e7:
            if (r19 == 0) goto L_0x00eb
            r13 = r17
        L_0x00eb:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r7 <= r12) goto L_0x00fa
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r7 - r12
            float r0 = (float) r0
            float r0 = r0 / r1
            float r0 = r0 + r2
            int r0 = (int) r0
            if (r19 == 0) goto L_0x0177
            int r13 = r13 + r0
        L_0x00fa:
            if (r6 <= 0) goto L_0x01ac
            int r0 = r12 - r7
            float r0 = (float) r0
            r17 = r0
            float r0 = (float) r6
            float r0 = r17 / r0
            float r0 = r0 + r2
            int r0 = (int) r0
            r21 = r0
            r4 = 0
            r16 = 0
        L_0x010b:
            if (r4 >= r11) goto L_0x0179
            r0 = r22
            java.lang.Object r15 = r0.get(r4)
            X.0ar r15 = (X.C07250ar) r15
            X.0SN r0 = r15.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 == r0) goto L_0x016a
            X.0Jy r1 = r15.A02
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x016a
            X.0Dr r3 = r15.A06
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x016a
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
            X.0SN r0 = r15.A03
            float[] r1 = r0.A0j
            int r0 = r14.A01
            r1 = r1[r0]
            float r1 = r1 * r17
            float r1 = r1 / r18
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r2 = (int) r1
        L_0x013e:
            int r1 = r14.A01
            X.0SN r0 = r15.A03
            if (r1 != 0) goto L_0x016f
            int r1 = r0.A0F
            int r0 = r0.A0H
        L_0x0148:
            r20 = r0
            int r0 = r15.A00
            r15 = r0
            r0 = 1
            if (r15 != r0) goto L_0x016d
            int r0 = r3.A00
            int r15 = java.lang.Math.min(r2, r0)
        L_0x0156:
            r0 = r20
            int r0 = java.lang.Math.max(r0, r15)
            if (r1 <= 0) goto L_0x0162
            int r0 = java.lang.Math.min(r1, r0)
        L_0x0162:
            if (r0 == r2) goto L_0x0167
            int r16 = r16 + 1
            r2 = r0
        L_0x0167:
            r3.A02(r2)
        L_0x016a:
            int r4 = r4 + 1
            goto L_0x010b
        L_0x016d:
            r15 = r2
            goto L_0x0156
        L_0x016f:
            int r1 = r0.A0E
            int r0 = r0.A0G
            goto L_0x0148
        L_0x0174:
            r2 = r21
            goto L_0x013e
        L_0x0177:
            int r13 = r13 - r0
            goto L_0x00fa
        L_0x0179:
            if (r16 <= 0) goto L_0x01ae
            int r6 = r6 - r16
            r1 = 0
            r7 = 0
        L_0x017f:
            if (r1 >= r11) goto L_0x01ae
            r0 = r22
            java.lang.Object r2 = r0.get(r1)
            X.0ar r2 = (X.C07250ar) r2
            X.0SN r0 = r2.A03
            int r3 = r0.A0N
            r0 = 8
            if (r3 == r0) goto L_0x01a9
            if (r1 <= 0) goto L_0x019a
            if (r1 < r10) goto L_0x019a
            X.0aq r0 = r2.A05
            int r0 = r0.A00
            int r7 = r7 + r0
        L_0x019a:
            X.0Dr r0 = r2.A06
            int r0 = r0.A02
            int r7 = r7 + r0
            if (r1 >= r8) goto L_0x01a9
            if (r1 >= r9) goto L_0x01a9
            X.0aq r0 = r2.A04
            int r0 = r0.A00
            int r0 = -r0
            int r7 = r7 + r0
        L_0x01a9:
            int r1 = r1 + 1
            goto L_0x017f
        L_0x01ac:
            r1 = 2
            goto L_0x01b8
        L_0x01ae:
            int r0 = r14.A00
            r1 = 2
            if (r0 != r1) goto L_0x01b8
            if (r16 != 0) goto L_0x01b8
            r0 = 0
            r14.A00 = r0
        L_0x01b8:
            if (r7 <= r12) goto L_0x01bc
            r14.A00 = r1
        L_0x01bc:
            if (r5 <= 0) goto L_0x01c4
            if (r6 != 0) goto L_0x01c4
            if (r10 != r9) goto L_0x01c4
            r14.A00 = r1
        L_0x01c4:
            int r1 = r14.A00
            r0 = 1
            if (r1 != r0) goto L_0x024b
            if (r5 <= r0) goto L_0x0244
            int r12 = r12 - r7
            int r0 = r5 + -1
        L_0x01ce:
            int r12 = r12 / r0
        L_0x01cf:
            if (r6 <= 0) goto L_0x01d2
            r12 = 0
        L_0x01d2:
            r2 = 0
        L_0x01d3:
            if (r2 >= r11) goto L_0x0357
            r1 = r2
            if (r19 == 0) goto L_0x01dc
            int r0 = r2 + 1
            int r1 = r11 - r0
        L_0x01dc:
            r0 = r22
            java.lang.Object r5 = r0.get(r1)
            X.0ar r5 = (X.C07250ar) r5
            X.0SN r0 = r5.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x01f9
            X.0aq r0 = r5.A05
            r0.A02(r13)
            X.0aq r0 = r5.A04
            r0.A02(r13)
        L_0x01f6:
            int r2 = r2 + 1
            goto L_0x01d3
        L_0x01f9:
            if (r2 <= 0) goto L_0x023b
            if (r19 == 0) goto L_0x0239
            int r13 = r13 - r12
        L_0x01fe:
            if (r2 < r10) goto L_0x023b
            X.0aq r0 = r5.A05
            int r0 = r0.A00
            if (r19 == 0) goto L_0x023e
            int r13 = r13 - r0
        L_0x0207:
            X.0aq r0 = r5.A04
        L_0x0209:
            r0.A02(r13)
            X.0Dr r4 = r5.A06
            int r3 = r4.A02
            X.0Jy r1 = r5.A02
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x021d
            int r1 = r5.A00
            r0 = 1
            if (r1 != r0) goto L_0x021d
            int r3 = r4.A00
        L_0x021d:
            if (r19 == 0) goto L_0x0235
            int r13 = r13 - r3
            X.0aq r0 = r5.A05
        L_0x0222:
            r0.A02(r13)
            r0 = 1
            r5.A09 = r0
            if (r2 >= r8) goto L_0x01f6
            if (r2 >= r9) goto L_0x01f6
            X.0aq r0 = r5.A04
            int r0 = r0.A00
            int r0 = -r0
            if (r19 == 0) goto L_0x0242
            int r13 = r13 - r0
            goto L_0x01f6
        L_0x0235:
            int r13 = r13 + r3
            X.0aq r0 = r5.A04
            goto L_0x0222
        L_0x0239:
            int r13 = r13 + r12
            goto L_0x01fe
        L_0x023b:
            if (r19 == 0) goto L_0x023f
            goto L_0x0207
        L_0x023e:
            int r13 = r13 + r0
        L_0x023f:
            X.0aq r0 = r5.A05
            goto L_0x0209
        L_0x0242:
            int r13 = r13 + r0
            goto L_0x01f6
        L_0x0244:
            if (r5 != r0) goto L_0x0249
            int r12 = r12 - r7
            r0 = 2
            goto L_0x01ce
        L_0x0249:
            r12 = 0
            goto L_0x01cf
        L_0x024b:
            if (r1 != 0) goto L_0x02c7
            int r12 = r12 - r7
            int r0 = r5 + 1
            int r12 = r12 / r0
            if (r6 <= 0) goto L_0x0254
            r12 = 0
        L_0x0254:
            r2 = 0
        L_0x0255:
            if (r2 >= r11) goto L_0x0357
            r1 = r2
            if (r19 == 0) goto L_0x025e
            int r0 = r2 + 1
            int r1 = r11 - r0
        L_0x025e:
            r0 = r22
            java.lang.Object r5 = r0.get(r1)
            X.0ar r5 = (X.C07250ar) r5
            X.0SN r0 = r5.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x027b
            X.0aq r0 = r5.A05
            r0.A02(r13)
            X.0aq r0 = r5.A04
            r0.A02(r13)
        L_0x0278:
            int r2 = r2 + 1
            goto L_0x0255
        L_0x027b:
            if (r19 == 0) goto L_0x02c3
            int r13 = r13 - r12
        L_0x027e:
            if (r2 <= 0) goto L_0x02bc
            if (r2 < r10) goto L_0x02bc
            X.0aq r0 = r5.A05
            int r0 = r0.A00
            if (r19 == 0) goto L_0x02bf
            int r13 = r13 - r0
        L_0x0289:
            X.0aq r0 = r5.A04
        L_0x028b:
            r0.A02(r13)
            X.0Dr r4 = r5.A06
            int r3 = r4.A02
            X.0Jy r1 = r5.A02
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x02a3
            int r1 = r5.A00
            r0 = 1
            if (r1 != r0) goto L_0x02a3
            int r0 = r4.A00
            int r3 = java.lang.Math.min(r3, r0)
        L_0x02a3:
            if (r19 == 0) goto L_0x02b8
            int r13 = r13 - r3
            X.0aq r0 = r5.A05
        L_0x02a8:
            r0.A02(r13)
            if (r2 >= r8) goto L_0x0278
            if (r2 >= r9) goto L_0x0278
            X.0aq r0 = r5.A04
            int r0 = r0.A00
            int r0 = -r0
            if (r19 == 0) goto L_0x02c5
            int r13 = r13 - r0
            goto L_0x0278
        L_0x02b8:
            int r13 = r13 + r3
            X.0aq r0 = r5.A04
            goto L_0x02a8
        L_0x02bc:
            if (r19 == 0) goto L_0x02c0
            goto L_0x0289
        L_0x02bf:
            int r13 = r13 + r0
        L_0x02c0:
            X.0aq r0 = r5.A05
            goto L_0x028b
        L_0x02c3:
            int r13 = r13 + r12
            goto L_0x027e
        L_0x02c5:
            int r13 = r13 + r0
            goto L_0x0278
        L_0x02c7:
            r0 = 2
            if (r1 != r0) goto L_0x0357
            int r1 = r14.A01
            X.0SN r0 = r14.A03
            if (r1 != 0) goto L_0x0353
            float r2 = r0.A02
        L_0x02d2:
            if (r19 == 0) goto L_0x02d8
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0 - r2
        L_0x02d8:
            int r12 = r12 - r7
            float r1 = (float) r12
            float r1 = r1 * r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            if (r0 < 0) goto L_0x02e3
            if (r6 <= 0) goto L_0x02e4
        L_0x02e3:
            r0 = 0
        L_0x02e4:
            if (r19 == 0) goto L_0x0351
            int r13 = r13 - r0
        L_0x02e7:
            r3 = 0
        L_0x02e8:
            if (r3 >= r11) goto L_0x0357
            r1 = r3
            if (r19 == 0) goto L_0x02f1
            int r0 = r3 + 1
            int r1 = r11 - r0
        L_0x02f1:
            r0 = r22
            java.lang.Object r5 = r0.get(r1)
            X.0ar r5 = (X.C07250ar) r5
            X.0SN r0 = r5.A03
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x030e
            X.0aq r0 = r5.A05
            r0.A02(r13)
            X.0aq r0 = r5.A04
            r0.A02(r13)
        L_0x030b:
            int r3 = r3 + 1
            goto L_0x02e8
        L_0x030e:
            if (r3 <= 0) goto L_0x0348
            if (r3 < r10) goto L_0x0348
            X.0aq r0 = r5.A05
            int r0 = r0.A00
            if (r19 == 0) goto L_0x034b
            int r13 = r13 - r0
        L_0x0319:
            X.0aq r0 = r5.A04
        L_0x031b:
            r0.A02(r13)
            X.0Dr r4 = r5.A06
            int r2 = r4.A02
            X.0Jy r1 = r5.A02
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x032f
            int r1 = r5.A00
            r0 = 1
            if (r1 != r0) goto L_0x032f
            int r2 = r4.A00
        L_0x032f:
            if (r19 == 0) goto L_0x0344
            int r13 = r13 - r2
            X.0aq r0 = r5.A05
        L_0x0334:
            r0.A02(r13)
            if (r3 >= r8) goto L_0x030b
            if (r3 >= r9) goto L_0x030b
            X.0aq r0 = r5.A04
            int r0 = r0.A00
            int r0 = -r0
            if (r19 == 0) goto L_0x034f
            int r13 = r13 - r0
            goto L_0x030b
        L_0x0344:
            int r13 = r13 + r2
            X.0aq r0 = r5.A04
            goto L_0x0334
        L_0x0348:
            if (r19 == 0) goto L_0x034c
            goto L_0x0319
        L_0x034b:
            int r13 = r13 + r0
        L_0x034c:
            X.0aq r0 = r5.A05
            goto L_0x031b
        L_0x034f:
            int r13 = r13 + r0
            goto L_0x030b
        L_0x0351:
            int r13 = r13 + r0
            goto L_0x02e7
        L_0x0353:
            float r2 = r0.A06
            goto L_0x02d2
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Du.AhI(X.0kG):void");
    }

    public String toString() {
        String A0h = AnonymousClass000.A0h(this.A01 == 0 ? "horizontal : " : "vertical : ", AnonymousClass000.A0r("ChainRun "));
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A0h = AnonymousClass000.A0h("> ", AnonymousClass000.A0q(AnonymousClass000.A0f(it.next(), AnonymousClass000.A0q(AnonymousClass000.A0h("<", AnonymousClass000.A0q(A0h))))));
        }
        return A0h;
    }
}
