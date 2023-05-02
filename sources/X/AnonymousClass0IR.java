package X;

/* renamed from: X.0IR  reason: invalid class name */
public class AnonymousClass0IR extends AnonymousClass0VC {
    public AnonymousClass0IR(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static final int A00(int i2) {
        if (i2 < 48) {
            return -1;
        }
        if (i2 <= 57) {
            return i2 - 48;
        }
        int i3 = 65;
        if (i2 < 65) {
            return -1;
        }
        if (i2 > 70) {
            i3 = 97;
            if (i2 < 97 || i2 > 102) {
                return -1;
            }
        }
        return (i2 - i3) + 10;
    }

    public String A0G() {
        char charAt;
        if (AnonymousClass000.A1R(this.A01, this.A00) || ((charAt = this.A03.charAt(this.A01)) != '\'' && charAt != '\"')) {
            return null;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        this.A01++;
        loop0:
        while (true) {
            int intValue = A09().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = A09().intValue();
                    if (intValue == -1) {
                        break loop0;
                    } else if (!(intValue == 10 || intValue == 13 || intValue == 12)) {
                        int A00 = A00(intValue);
                        if (A00 != -1) {
                            int i2 = 1;
                            do {
                                intValue = A09().intValue();
                                int A002 = A00(intValue);
                                if (A002 == -1) {
                                    break;
                                }
                                A00 = (A00 << 4) + A002;
                                i2++;
                            } while (i2 <= 5);
                            A0o.append((char) A00);
                        }
                    }
                }
                A0o.append((char) intValue);
            }
        }
        return A0o.toString();
    }

    public String A0H() {
        int i2;
        boolean A1R = AnonymousClass000.A1R(this.A01, this.A00);
        int i3 = this.A01;
        if (A1R) {
            i2 = i3;
        } else {
            int charAt = this.A03.charAt(i3);
            if (charAt == 45) {
                charAt = A05();
            }
            if (charAt < 65 || (charAt > 90 && (charAt < 97 ? charAt != 95 : charAt > 122))) {
                i2 = i3;
            } else {
                while (true) {
                    int A05 = A05();
                    if (A05 >= 65) {
                        if (A05 > 90) {
                            if (A05 < 97) {
                                if (A05 != 95) {
                                    break;
                                }
                            } else if (A05 > 122) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (A05 >= 48) {
                        if (A05 > 57) {
                            break;
                        }
                    } else if (A05 != 45) {
                        break;
                    }
                }
                i2 = this.A01;
            }
            this.A01 = i3;
        }
        if (i2 == i3) {
            return null;
        }
        String substring = this.A03.substring(i3, i2);
        this.A01 = i2;
        return substring;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.0e8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.0e9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: X.0e9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: X.0e5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: X.0e4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: X.0e6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: X.0e7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: X.0e8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: X.0eA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: X.0eA} */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x022b, code lost:
        if (r4 == X.AnonymousClass0K5.A05) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0237, code lost:
        if (r4 == X.AnonymousClass0K5.A04) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0279, code lost:
        if (A0E('-') == false) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03e2, code lost:
        throw new X.C03920Kk("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03e9, code lost:
        r0.A01 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03fa, code lost:
        throw new X.C03920Kk(X.AnonymousClass000.A0h(r8, X.AnonymousClass000.A0q("Invalid or missing parameter section for pseudo class: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0407, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0409, code lost:
        if (r0 == null) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x040f, code lost:
        if (r0.isEmpty() != false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0411, code lost:
        r14.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0414, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0177, code lost:
        if (A0E(')') != false) goto L_0x0179;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0403 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0I() {
        /*
            r25 = this;
            r0 = r25
            int r2 = r0.A01
            int r1 = r0.A00
            boolean r1 = X.AnonymousClass000.A1R(r2, r1)
            r6 = 0
            if (r1 == 0) goto L_0x000e
            return r6
        L_0x000e:
            r1 = 1
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r1)
        L_0x0014:
            X.0QN r2 = new X.0QN
            r2.<init>()
        L_0x0019:
            int r3 = r0.A01
            int r1 = r0.A00
            boolean r1 = X.AnonymousClass000.A1R(r3, r1)
            if (r1 != 0) goto L_0x0407
            int r1 = r0.A01
            r24 = r1
            java.util.List r1 = r2.A01
            if (r1 == 0) goto L_0x03c4
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x03c4
            r1 = 62
            boolean r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x03b8
            X.0Jo r5 = X.C03710Jo.CHILD
        L_0x003b:
            r0.A0C()
        L_0x003e:
            r1 = 42
            boolean r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x03a2
            X.0QS r1 = new X.0QS
            r1.<init>(r5, r6)
        L_0x004b:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1R(r4, r3)
            if (r3 != 0) goto L_0x0388
            r3 = 46
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0064
            X.0QS r1 = new X.0QS
            r1.<init>(r5, r6)
        L_0x0064:
            java.lang.String r7 = r0.A0H()
            if (r7 == 0) goto L_0x03c7
            X.0K2 r4 = X.AnonymousClass0K2.EQUALS
            java.lang.String r3 = "class"
            r1.A00(r4, r3, r7)
        L_0x0071:
            r2.A00()
            goto L_0x004b
        L_0x0075:
            r3 = 35
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x0084
            X.0QS r1 = new X.0QS
            r1.<init>(r5, r6)
        L_0x0084:
            java.lang.String r7 = r0.A0H()
            if (r7 == 0) goto L_0x03cf
            X.0K2 r4 = X.AnonymousClass0K2.EQUALS
            java.lang.String r3 = "id"
            r1.A00(r4, r3, r7)
            int r4 = r2.A00
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 + r3
            r2.A00 = r4
            goto L_0x004b
        L_0x009a:
            r3 = 91
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x0106
            if (r1 != 0) goto L_0x00a9
            X.0QS r1 = new X.0QS
            r1.<init>(r5, r6)
        L_0x00a9:
            r0.A0C()
            java.lang.String r8 = r0.A0H()
            java.lang.String r7 = "Invalid attribute simpleSelectors"
            if (r8 == 0) goto L_0x03e3
            r0.A0C()
            r3 = 61
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x00ed
            X.0K2 r9 = X.AnonymousClass0K2.EQUALS
        L_0x00c1:
            r0.A0C()
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1R(r4, r3)
            if (r3 != 0) goto L_0x03dd
            java.lang.String r4 = r0.A0A()
            if (r4 != 0) goto L_0x00da
            java.lang.String r4 = r0.A0H()
            if (r4 == 0) goto L_0x03dd
        L_0x00da:
            r0.A0C()
        L_0x00dd:
            r3 = 93
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x03d7
            if (r9 != 0) goto L_0x00e9
            X.0K2 r9 = X.AnonymousClass0K2.EXISTS
        L_0x00e9:
            r1.A00(r9, r8, r4)
            goto L_0x0071
        L_0x00ed:
            java.lang.String r3 = "~="
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x00f8
            X.0K2 r9 = X.AnonymousClass0K2.INCLUDES
            goto L_0x00c1
        L_0x00f8:
            java.lang.String r3 = "|="
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x0103
            X.0K2 r9 = X.AnonymousClass0K2.DASHMATCH
            goto L_0x00c1
        L_0x0103:
            r9 = r6
            r4 = r6
            goto L_0x00dd
        L_0x0106:
            r3 = 58
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x0388
            if (r1 != 0) goto L_0x0115
            X.0QS r1 = new X.0QS
            r1.<init>(r5, r6)
        L_0x0115:
            java.lang.String r8 = r0.A0H()
            if (r8 == 0) goto L_0x03fb
            java.util.Map r3 = X.AnonymousClass0K5.A00
            java.lang.Object r4 = r3.get(r8)
            X.0K5 r4 = (X.AnonymousClass0K5) r4
            if (r4 != 0) goto L_0x0127
            X.0K5 r4 = X.AnonymousClass0K5.UNSUPPORTED
        L_0x0127:
            int r3 = r4.ordinal()
            java.lang.String r18 = "Invalid or missing parameter section for pseudo class: "
            r10 = 1
            r7 = 0
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x030d;
                case 2: goto L_0x0223;
                case 3: goto L_0x0223;
                case 4: goto L_0x0223;
                case 5: goto L_0x0223;
                case 6: goto L_0x035e;
                case 7: goto L_0x034b;
                case 8: goto L_0x0331;
                case 9: goto L_0x0321;
                case 10: goto L_0x0341;
                case 11: goto L_0x0316;
                case 12: goto L_0x0304;
                case 13: goto L_0x0186;
                case 14: goto L_0x0142;
                case 15: goto L_0x0371;
                case 16: goto L_0x0371;
                case 17: goto L_0x0371;
                case 18: goto L_0x0371;
                case 19: goto L_0x0371;
                case 20: goto L_0x0371;
                case 21: goto L_0x0371;
                case 22: goto L_0x0371;
                case 23: goto L_0x0371;
                default: goto L_0x0132;
            }
        L_0x0132:
            java.lang.String r0 = "Unsupported pseudo class: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r8, r0)
            X.0Kk r0 = new X.0Kk
            r0.<init>(r1)
            throw r0
        L_0x0142:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1R(r4, r3)
            if (r3 != 0) goto L_0x0179
            int r4 = r0.A01
            r3 = 40
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x0179
            r0.A0C()
        L_0x0159:
            java.lang.String r3 = r0.A0H()
            if (r3 == 0) goto L_0x0183
            if (r7 != 0) goto L_0x0165
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
        L_0x0165:
            r7.add(r3)
            r0.A0C()
            boolean r3 = r0.A0D()
            if (r3 != 0) goto L_0x0159
            r3 = 41
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x0183
        L_0x0179:
            X.0e8 r15 = new X.0e8
            r15.<init>(r8)
            r2.A00()
            goto L_0x0379
        L_0x0183:
            r0.A01 = r4
            goto L_0x0179
        L_0x0186:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1R(r4, r3)
            if (r3 != 0) goto L_0x01e5
            int r4 = r0.A01
            r3 = 40
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x01e5
            r0.A0C()
            java.util.List r7 = r0.A0I()
            if (r7 == 0) goto L_0x01f3
            r3 = 41
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x01f3
            java.util.Iterator r10 = r7.iterator()
        L_0x01af:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x01f6
            java.lang.Object r3 = r10.next()
            X.0QN r3 = (X.AnonymousClass0QN) r3
            java.util.List r3 = r3.A01
            if (r3 == 0) goto L_0x01f6
            java.util.Iterator r9 = r3.iterator()
        L_0x01c3:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x01af
            java.lang.Object r3 = r9.next()
            X.0QS r3 = (X.AnonymousClass0QS) r3
            java.util.List r3 = r3.A03
            if (r3 == 0) goto L_0x01af
            java.util.Iterator r4 = r3.iterator()
        L_0x01d7:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x01c3
            java.lang.Object r3 = r4.next()
            boolean r3 = r3 instanceof X.C08680e7
            if (r3 == 0) goto L_0x01d7
        L_0x01e5:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r18)
            java.lang.String r1 = X.AnonymousClass000.A0h(r8, r0)
            X.0Kk r0 = new X.0Kk
            r0.<init>(r1)
            throw r0
        L_0x01f3:
            r0.A01 = r4
            goto L_0x01e5
        L_0x01f6:
            X.0e7 r15 = new X.0e7
            r15.<init>(r7)
            java.util.List r3 = r15.A00
            java.util.Iterator r7 = r3.iterator()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0203:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0215
            java.lang.Object r3 = r7.next()
            X.0QN r3 = (X.AnonymousClass0QN) r3
            int r3 = r3.A00
            if (r3 <= r4) goto L_0x0203
            r4 = r3
            goto L_0x0203
        L_0x0215:
            r2.A00 = r4
            goto L_0x0379
        L_0x0219:
            X.0e6 r15 = new X.0e6
            r15.<init>()
            r2.A00()
            goto L_0x0379
        L_0x0223:
            X.0K5 r3 = X.AnonymousClass0K5.nth_child
            if (r4 == r3) goto L_0x022d
            X.0K5 r3 = X.AnonymousClass0K5.nth_of_type
            r19 = 0
            if (r4 != r3) goto L_0x022f
        L_0x022d:
            r19 = 1
        L_0x022f:
            X.0K5 r3 = X.AnonymousClass0K5.nth_of_type
            if (r4 == r3) goto L_0x0239
            X.0K5 r3 = X.AnonymousClass0K5.nth_last_of_type
            r20 = 0
            if (r4 != r3) goto L_0x023b
        L_0x0239:
            r20 = 1
        L_0x023b:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1R(r4, r3)
            r11 = 0
            if (r3 != 0) goto L_0x03ed
            int r3 = r0.A01
            r21 = r3
            r3 = 40
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x03ed
            r0.A0C()
            java.lang.String r3 = "odd"
            boolean r3 = r0.A0F(r3)
            r7 = 2
            r17 = 1
            if (r3 != 0) goto L_0x02a6
            java.lang.String r3 = "even"
            boolean r3 = r0.A0F(r3)
            r10 = 0
            if (r3 != 0) goto L_0x02a6
            r3 = 43
            boolean r3 = r0.A0E(r3)
            r13 = 45
            if (r3 != 0) goto L_0x027b
            boolean r3 = r0.A0E(r13)
            r16 = -1
            if (r3 != 0) goto L_0x027d
        L_0x027b:
            r16 = 1
        L_0x027d:
            java.lang.String r12 = r0.A03
            int r3 = r0.A01
            int r7 = r0.A00
            X.0Tw r9 = X.C06010Tw.A00(r12, r3, r7)
            if (r9 == 0) goto L_0x028d
            int r3 = r9.A00
            r0.A01 = r3
        L_0x028d:
            r3 = 110(0x6e, float:1.54E-43)
            boolean r3 = r0.A0E(r3)
            if (r3 != 0) goto L_0x02ce
            r3 = 78
            boolean r3 = r0.A0E(r3)
            if (r3 != 0) goto L_0x02ce
            r11 = r9
            r7 = 0
        L_0x029f:
            if (r11 == 0) goto L_0x02a6
            long r3 = r11.A01
            int r9 = (int) r3
            int r10 = r16 * r9
        L_0x02a6:
            X.0OF r4 = new X.0OF
            r4.<init>(r7, r10)
            r0.A0C()
            r3 = 41
            boolean r3 = r0.A0E(r3)
            if (r3 == 0) goto L_0x03e9
            int r7 = r4.A00
            int r4 = r4.A01
            java.lang.String r3 = r1.A01
            X.0eA r15 = new X.0eA
            r18 = r15
            r21 = r7
            r22 = r4
            r23 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            r2.A00()
            goto L_0x0379
        L_0x02ce:
            if (r9 != 0) goto L_0x02d9
            int r15 = r0.A01
            r3 = 1
            X.0Tw r9 = new X.0Tw
            r9.<init>(r3, r15)
        L_0x02d9:
            r0.A0C()
            r3 = 43
            boolean r3 = r0.A0E(r3)
            if (r3 != 0) goto L_0x02ec
            boolean r3 = r0.A0E(r13)
            if (r3 == 0) goto L_0x02fb
            r17 = -1
        L_0x02ec:
            r0.A0C()
            int r3 = r0.A01
            X.0Tw r11 = X.C06010Tw.A00(r12, r3, r7)
            if (r11 == 0) goto L_0x03e9
            int r3 = r11.A00
            r0.A01 = r3
        L_0x02fb:
            r7 = r16
            r16 = r17
            long r3 = r9.A01
            int r9 = (int) r3
            int r7 = r7 * r9
            goto L_0x029f
        L_0x0304:
            X.0e4 r15 = new X.0e4
            r15.<init>()
            r2.A00()
            goto L_0x0379
        L_0x030d:
            X.0e5 r15 = new X.0e5
            r15.<init>()
            r2.A00()
            goto L_0x0379
        L_0x0316:
            java.lang.String r3 = r1.A01
            X.0e9 r15 = new X.0e9
            r15.<init>(r3, r10)
            r2.A00()
            goto L_0x0379
        L_0x0321:
            java.lang.String r12 = r1.A01
            X.0eA r15 = new X.0eA
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 1
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A00()
            goto L_0x0379
        L_0x0331:
            java.lang.String r12 = r1.A01
            X.0eA r15 = new X.0eA
            r8 = 1
            r9 = 1
            r10 = 0
            r11 = 1
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A00()
            goto L_0x0379
        L_0x0341:
            r3 = 0
            X.0e9 r15 = new X.0e9
            r15.<init>(r6, r3)
            r2.A00()
            goto L_0x0379
        L_0x034b:
            X.0eA r15 = new X.0eA
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r2.A00()
            goto L_0x0379
        L_0x035e:
            X.0eA r15 = new X.0eA
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r2.A00()
            goto L_0x0379
        L_0x0371:
            X.0e8 r15 = new X.0e8
            r15.<init>(r8)
            r2.A00()
        L_0x0379:
            java.util.List r3 = r1.A03
            if (r3 != 0) goto L_0x0383
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            r1.A03 = r3
        L_0x0383:
            r3.add(r15)
            goto L_0x004b
        L_0x0388:
            if (r1 == 0) goto L_0x0403
            java.util.List r3 = r2.A01
            if (r3 != 0) goto L_0x0394
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            r2.A01 = r3
        L_0x0394:
            r3.add(r1)
            boolean r1 = r0.A0D()
            if (r1 == 0) goto L_0x0019
            r14.add(r2)
            goto L_0x0014
        L_0x03a2:
            java.lang.String r3 = r0.A0H()
            if (r3 == 0) goto L_0x03b5
            X.0QS r1 = new X.0QS
            r1.<init>(r5, r3)
            int r3 = r2.A00
            int r3 = r3 + 1
            r2.A00 = r3
            goto L_0x004b
        L_0x03b5:
            r1 = r6
            goto L_0x004b
        L_0x03b8:
            r1 = 43
            boolean r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x03c4
            X.0Jo r5 = X.C03710Jo.FOLLOWS
            goto L_0x003b
        L_0x03c4:
            r5 = r6
            goto L_0x003e
        L_0x03c7:
            java.lang.String r1 = "Invalid \".class\" simpleSelectors"
            X.0Kk r0 = new X.0Kk
            r0.<init>(r1)
            throw r0
        L_0x03cf:
            java.lang.String r1 = "Invalid \"#id\" simpleSelectors"
            X.0Kk r0 = new X.0Kk
            r0.<init>(r1)
            throw r0
        L_0x03d7:
            X.0Kk r0 = new X.0Kk
            r0.<init>(r7)
            throw r0
        L_0x03dd:
            X.0Kk r0 = new X.0Kk
            r0.<init>(r7)
            throw r0
        L_0x03e3:
            X.0Kk r0 = new X.0Kk
            r0.<init>(r7)
            throw r0
        L_0x03e9:
            r1 = r21
            r0.A01 = r1
        L_0x03ed:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r18)
            java.lang.String r1 = X.AnonymousClass000.A0h(r8, r0)
            X.0Kk r0 = new X.0Kk
            r0.<init>(r1)
            throw r0
        L_0x03fb:
            java.lang.String r1 = "Invalid pseudo class"
            X.0Kk r0 = new X.0Kk
            r0.<init>(r1)
            throw r0
        L_0x0403:
            r1 = r24
            r0.A01 = r1
        L_0x0407:
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L_0x0414
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0414
            r14.add(r2)
        L_0x0414:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IR.A0I():java.util.List");
    }
}
