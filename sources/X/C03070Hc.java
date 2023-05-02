package X;

import java.io.EOFException;

/* renamed from: X.0Hc  reason: invalid class name and case insensitive filesystem */
public final class C03070Hc extends C09090et {
    public static final C09200f6 A06 = A03("*/");
    public static final C09200f6 A07 = A03("\"\\");
    public static final C09200f6 A08 = A03("\n\r");
    public static final C09200f6 A09 = A03("'\\");
    public static final C09200f6 A0A = A03("{}[]:, \n\t\r\f/\\;#=");
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final C11050i7 A04;
    public final C13670mq A05;

    public C03070Hc(C13670mq r2) {
        this.A05 = r2;
        this.A04 = r2.A5g();
        A0K(6);
    }

    public static int A00(C03070Hc r1) {
        int i2 = r1.A00;
        return i2 == 0 ? r1.A0P() : i2;
    }

    public static String A01(C09090et r1, StringBuilder sb) {
        sb.append(r1.A0A());
        sb.append(" at path ");
        return r1.A0B();
    }

    public static String A02(C09090et r2, StringBuilder sb) {
        sb.append(r2.A0A());
        sb.append(" at path ");
        return r2.A0B();
    }

    public static final C09200f6 A03(String str) {
        return C90594eQ.A03(str);
    }

    public static void A04(C03070Hc r3) {
        r3.A00 = 0;
        int[] iArr = r3.A01;
        int i2 = r3.A00 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double A07() {
        /*
            r6 = this;
            int r2 = A00(r6)
            r1 = 16
            if (r2 != r1) goto L_0x000f
            A04(r6)
            long r0 = r6.A02
            double r2 = (double) r0
            return r2
        L_0x000f:
            r0 = 17
            java.lang.String r5 = "Expected a double but was "
            r3 = 11
            java.lang.String r4 = " at path "
            if (r2 != r0) goto L_0x0027
            X.0i7 r2 = r6.A04
            int r0 = r6.A01
            long r0 = (long) r0
            java.lang.String r0 = r2.A05(r0)
        L_0x0022:
            r6.A03 = r0
        L_0x0024:
            r6.A00 = r3
            goto L_0x0056
        L_0x0027:
            r0 = 9
            if (r2 != r0) goto L_0x0032
            X.0f6 r0 = A07
        L_0x002d:
            java.lang.String r0 = r6.A0S(r0)
            goto L_0x0022
        L_0x0032:
            r0 = 8
            if (r2 != r0) goto L_0x0039
            X.0f6 r0 = A09
            goto L_0x002d
        L_0x0039:
            r0 = 10
            if (r2 != r0) goto L_0x0042
            java.lang.String r0 = r6.A0R()
            goto L_0x0022
        L_0x0042:
            if (r2 == r3) goto L_0x0024
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r5)
            java.lang.String r0 = A02(r6, r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.0iB r0 = new X.0iB
            r0.<init>(r1)
            throw r0
        L_0x0056:
            java.lang.String r0 = r6.A03     // Catch:{ NumberFormatException -> 0x0089 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0089 }
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L_0x006f
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto L_0x006f
            r0 = 0
            r6.A03 = r0
            A04(r6)
            return r2
        L_0x006f:
            java.lang.String r0 = "JSON forbids NaN and infinities: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r6.A0B()
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.0J8 r0 = new X.0J8
            r0.<init>(r1)
            throw r0
        L_0x0089:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r5)
            java.lang.String r0 = r6.A03
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A0B()
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.0iB r0 = new X.0iB
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03070Hc.A07():double");
    }

    public int A08() {
        C09200f6 r0;
        int A002 = A00(this);
        if (A002 == 16) {
            long j2 = this.A02;
            int i2 = (int) j2;
            if (j2 == ((long) i2)) {
                A04(this);
                return i2;
            }
            StringBuilder A0q = AnonymousClass000.A0q("Expected an int but was ");
            A0q.append(j2);
            A0q.append(" at path ");
            throw new C11090iB(AnonymousClass000.A0h(A0B(), A0q));
        }
        if (A002 == 17) {
            this.A03 = this.A04.A05((long) this.A01);
        } else {
            if (A002 == 9) {
                r0 = A07;
            } else if (A002 == 8) {
                r0 = A09;
            } else if (A002 != 11) {
                StringBuilder A0q2 = AnonymousClass000.A0q("Expected an int but was ");
                throw new C11090iB(AnonymousClass000.A0h(A02(this, A0q2), A0q2));
            }
            String A0S = A0S(r0);
            this.A03 = A0S;
            try {
                int parseInt = Integer.parseInt(A0S);
                A04(this);
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.A00 = 11;
        try {
            String str = this.A03;
            double parseDouble = Double.parseDouble(str);
            int i3 = (int) parseDouble;
            if (((double) i3) == parseDouble) {
                this.A03 = null;
                A04(this);
                return i3;
            }
            StringBuilder A0q3 = AnonymousClass000.A0q("Expected an int but was ");
            A0q3.append(str);
            A0q3.append(" at path ");
            throw new C11090iB(AnonymousClass000.A0h(A0B(), A0q3));
        } catch (NumberFormatException unused2) {
            StringBuilder A0q4 = AnonymousClass000.A0q("Expected an int but was ");
            A0q4.append(this.A03);
            A0q4.append(" at path ");
            throw new C11090iB(AnonymousClass000.A0h(A0B(), A0q4));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r6 == -1) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A09(X.C06000Tv r10) {
        /*
            r9 = this;
            int r1 = A00(r9)
            r0 = 12
            r8 = -1
            if (r1 < r0) goto L_0x0083
            r7 = 15
            if (r1 > r7) goto L_0x0083
            if (r1 != r7) goto L_0x002e
            java.lang.String r4 = r9.A03
            java.lang.String[] r3 = r10.A01
            int r2 = r3.length
            r1 = 0
            r6 = 0
        L_0x0016:
            if (r6 >= r2) goto L_0x0081
            r0 = r3[r6]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002b
            r9.A00 = r1
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r1[r0] = r4
        L_0x002a:
            return r6
        L_0x002b:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x002e:
            X.0mq r1 = r9.A05
            X.5Bs r0 = r10.A00
            int r3 = r1.AdH(r0)
            if (r3 == r8) goto L_0x0048
            r0 = 0
            r9.A00 = r0
            java.lang.String[] r2 = r9.A03
            int r0 = r9.A00
            int r1 = r0 + -1
            java.lang.String[] r0 = r10.A01
            r0 = r0[r3]
            r2[r1] = r0
            return r3
        L_0x0048:
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r5 = r1[r0]
            java.lang.String r4 = r9.A0C()
            java.lang.String[] r3 = r10.A01
            int r2 = r3.length
            r1 = 0
            r6 = 0
        L_0x0059:
            if (r6 >= r2) goto L_0x007f
            r0 = r3[r6]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007c
            r9.A00 = r1
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r1[r0] = r4
            if (r6 != r8) goto L_0x002a
        L_0x006f:
            r9.A00 = r7
            r9.A03 = r4
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r1[r0] = r5
            return r6
        L_0x007c:
            int r6 = r6 + 1
            goto L_0x0059
        L_0x007f:
            r6 = -1
            goto L_0x006f
        L_0x0081:
            r6 = -1
            return r6
        L_0x0083:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03070Hc.A09(X.0Tv):int");
    }

    public AnonymousClass0KF A0A() {
        switch (A00(this)) {
            case 1:
                return AnonymousClass0KF.BEGIN_OBJECT;
            case 2:
                return AnonymousClass0KF.END_OBJECT;
            case 3:
                return AnonymousClass0KF.BEGIN_ARRAY;
            case 4:
                return AnonymousClass0KF.END_ARRAY;
            case 5:
            case 6:
                return AnonymousClass0KF.BOOLEAN;
            case 7:
                return AnonymousClass0KF.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AnonymousClass0KF.STRING;
            case 16:
            case 17:
                return AnonymousClass0KF.NUMBER;
            case 18:
                return AnonymousClass0KF.END_DOCUMENT;
            default:
                return AnonymousClass0KF.NAME;
        }
    }

    public String A0C() {
        String str;
        C09200f6 r0;
        int A002 = A00(this);
        if (A002 == 14) {
            str = A0R();
        } else {
            if (A002 == 13) {
                r0 = A07;
            } else if (A002 == 12) {
                r0 = A09;
            } else if (A002 == 15) {
                str = this.A03;
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("Expected a name but was ");
                throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
            }
            str = A0S(r0);
        }
        this.A00 = 0;
        this.A03[this.A00 - 1] = str;
        return str;
    }

    public String A0D() {
        String A052;
        int A002 = A00(this);
        if (A002 == 10) {
            A052 = A0R();
        } else if (A002 == 9) {
            A052 = A0S(A07);
        } else if (A002 == 8) {
            A052 = A0S(A09);
        } else if (A002 == 11) {
            A052 = this.A03;
            this.A03 = null;
        } else if (A002 == 16) {
            A052 = Long.toString(this.A02);
        } else if (A002 == 17) {
            A052 = this.A04.A05((long) this.A01);
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("Expected a string but was ");
            throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
        }
        A04(this);
        return A052;
    }

    public void A0E() {
        if (A00(this) == 3) {
            A0K(1);
            this.A01[this.A00 - 1] = 0;
            this.A00 = 0;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Expected BEGIN_ARRAY but was ");
        throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
    }

    public void A0F() {
        if (A00(this) == 1) {
            A0K(3);
            this.A00 = 0;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Expected BEGIN_OBJECT but was ");
        throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
    }

    public void A0G() {
        if (A00(this) == 4) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            int[] iArr = this.A01;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.A00 = 0;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Expected END_ARRAY but was ");
        throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
    }

    public void A0H() {
        if (A00(this) == 2) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            this.A03[i2] = null;
            int[] iArr = this.A01;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.A00 = 0;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Expected END_OBJECT but was ");
        throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
    }

    public void A0I() {
        C09200f6 r0;
        int A002 = A00(this);
        if (A002 == 14) {
            long AHt = this.A05.AHt(A0A);
            C11050i7 r3 = this.A04;
            if (AHt == -1) {
                AHt = r3.A03();
            }
            r3.A0G(AHt);
        } else {
            if (A002 == 13) {
                r0 = A07;
            } else if (A002 == 12) {
                r0 = A09;
            } else if (A002 != 15) {
                StringBuilder A0r = AnonymousClass000.A0r("Expected a name but was ");
                throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
            }
            A0U(r0);
        }
        this.A00 = 0;
        this.A03[this.A00 - 1] = "null";
    }

    public void A0J() {
        C09200f6 r0;
        int i2 = 0;
        do {
            int A002 = A00(this);
            if (A002 == 3) {
                A0K(1);
            } else if (A002 == 1) {
                A0K(3);
            } else {
                if (A002 == 4) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder A0q = AnonymousClass000.A0q("Expected a value but was ");
                        throw new C11090iB(AnonymousClass000.A0h(A02(this, A0q), A0q));
                    }
                } else if (A002 == 2) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder A0q2 = AnonymousClass000.A0q("Expected a value but was ");
                        throw new C11090iB(AnonymousClass000.A0h(A02(this, A0q2), A0q2));
                    }
                } else if (A002 == 14 || A002 == 10) {
                    long AHt = this.A05.AHt(A0A);
                    C11050i7 r7 = this.A04;
                    if (AHt == -1) {
                        AHt = r7.A03();
                    }
                    r7.A0G(AHt);
                    this.A00 = 0;
                } else {
                    if (A002 == 9 || A002 == 13) {
                        r0 = A07;
                    } else if (A002 == 8 || A002 == 12) {
                        r0 = A09;
                    } else {
                        if (A002 == 17) {
                            this.A04.A0G((long) this.A01);
                        } else if (A002 == 18) {
                            StringBuilder A0q3 = AnonymousClass000.A0q("Expected a value but was ");
                            throw new C11090iB(AnonymousClass000.A0h(A02(this, A0q3), A0q3));
                        }
                        this.A00 = 0;
                    }
                    A0U(r0);
                    this.A00 = 0;
                }
                this.A00--;
                this.A00 = 0;
            }
            i2++;
            this.A00 = 0;
        } while (i2 != 0);
        int[] iArr = this.A01;
        int i3 = this.A00;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.A03[i3 - 1] = "null";
    }

    public boolean A0M() {
        int A002 = A00(this);
        return (A002 == 2 || A002 == 4 || A002 == 18) ? false : true;
    }

    public boolean A0N() {
        int A002 = A00(this);
        if (A002 == 5) {
            this.A00 = 0;
            int[] iArr = this.A01;
            int i2 = this.A00 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (A002 == 6) {
            this.A00 = 0;
            int[] iArr2 = this.A01;
            int i3 = this.A00 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("Expected a boolean but was ");
            throw new C11090iB(AnonymousClass000.A0h(A01(this, A0r), A0r));
        }
    }

    public final char A0O() {
        String str;
        StringBuilder A0r;
        int i2;
        C13670mq r3 = this.A05;
        if (r3.AcF(1)) {
            C11050i7 r6 = this.A04;
            byte readByte = r6.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                A0r = AnonymousClass000.A0r("Invalid escape sequence: \\");
                A0r.append((char) readByte);
            } else if (r3.AcF(4)) {
                int i3 = 0;
                char c2 = 0;
                do {
                    byte A012 = r6.A01((long) i3);
                    char c3 = (char) (c2 << 4);
                    if (A012 >= 48) {
                        int i4 = A012 - 48;
                        if (A012 > 57) {
                            if (A012 >= 97) {
                                if (A012 <= 102) {
                                    i2 = A012 - 97;
                                }
                            } else if (A012 >= 65 && A012 <= 70) {
                                i2 = A012 - 65;
                            }
                            i4 = i2 + 10;
                        }
                        c2 = (char) (c3 + i4);
                        i3++;
                    }
                    A0r = AnonymousClass000.A0r("\\u");
                    A0r.append(r6.A05(4));
                } while (i3 < 4);
                r6.A0G(4);
                return c2;
            } else {
                throw new EOFException(AnonymousClass000.A0h(A0B(), AnonymousClass000.A0r("Unterminated escape sequence at path ")));
            }
            str = A0r.toString();
        } else {
            str = "Unterminated escape sequence";
        }
        A0L(str);
        throw AnonymousClass000.A0Z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x012f, code lost:
        if (r11 != 7) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0131, code lost:
        r8.A01 = r13;
        r5 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0108, code lost:
        if (A0V(r1) != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x010a, code lost:
        if (r11 != 2) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x010c, code lost:
        if (r18 == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0112, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0114, code lost:
        if (r17 == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0118, code lost:
        if (r4 != 0) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x011a, code lost:
        if (r17 != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x011c, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x011d, code lost:
        r8.A02 = r4;
        r6.A0G((long) r13);
        r5 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0127, code lost:
        if (r17 == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x012a, code lost:
        if (r11 == 2) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012d, code lost:
        if (r11 == 4) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x010a A[EDGE_INSN: B:181:0x010a->B:86:0x010a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0P() {
        /*
            r19 = this;
            r8 = r19
            int[] r15 = r8.A02
            int r14 = r8.A00
            int r0 = r14 + -1
            r4 = r15[r0]
            r2 = 0
            r1 = 8
            r6 = 34
            r13 = 93
            r9 = 3
            r10 = 7
            r11 = 59
            r5 = 44
            r0 = 4
            r12 = 2
            r7 = 1
            if (r4 != r7) goto L_0x018e
            int r14 = r14 - r7
            r15[r14] = r12
        L_0x0020:
            int r1 = r8.A0Q(r7)
            if (r1 == r6) goto L_0x0185
            r0 = 39
            if (r1 == r0) goto L_0x021e
            if (r1 == r5) goto L_0x017d
            if (r1 == r11) goto L_0x017d
            r0 = 91
            if (r1 == r0) goto L_0x0233
            if (r1 == r13) goto L_0x0173
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x022b
            X.0i7 r6 = r8.A04
            byte r1 = r6.A01(r2)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L_0x016c
            r0 = 84
            if (r1 == r0) goto L_0x016c
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L_0x0165
            r0 = 70
            if (r1 == r0) goto L_0x0165
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x0056
            r0 = 78
            if (r1 != r0) goto L_0x007e
        L_0x0056:
            r5 = 7
            java.lang.String r13 = "null"
            java.lang.String r12 = "NULL"
        L_0x005b:
            int r4 = r13.length()
            r11 = 1
        L_0x0060:
            if (r11 >= r4) goto L_0x0147
            X.0mq r15 = r8.A05
            int r14 = r11 + 1
            long r0 = (long) r14
            boolean r0 = r15.AcF(r0)
            if (r0 == 0) goto L_0x007e
            long r0 = (long) r11
            byte r1 = r6.A01(r0)
            char r0 = r13.charAt(r11)
            if (r1 == r0) goto L_0x0144
            char r0 = r12.charAt(r11)
            if (r1 == r0) goto L_0x0144
        L_0x007e:
            r4 = 0
            r13 = 0
            r11 = 0
            r18 = 1
            r17 = 0
        L_0x0086:
            X.0mq r14 = r8.A05
            int r12 = r13 + 1
            long r0 = (long) r12
            boolean r0 = r14.AcF(r0)
            r14 = 2
            if (r0 == 0) goto L_0x010a
            long r0 = (long) r13
            byte r1 = r6.A01(r0)
            r0 = 43
            r15 = 5
            if (r1 == r0) goto L_0x0100
            r0 = 69
            if (r1 == r0) goto L_0x00f9
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x00f9
            r0 = 45
            if (r1 == r0) goto L_0x00f3
            r0 = 46
            if (r1 == r0) goto L_0x00ef
            r0 = 48
            if (r1 < r0) goto L_0x0104
            r0 = 57
            if (r1 > r0) goto L_0x0104
            if (r11 == r7) goto L_0x00e9
            if (r11 == 0) goto L_0x00e9
            if (r11 != r14) goto L_0x00de
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0137
            r15 = 10
            long r15 = r15 * r4
            int r0 = r1 + -48
            long r0 = (long) r0
            long r15 = r15 - r0
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00d6
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00dc
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dc
        L_0x00d6:
            r0 = 1
        L_0x00d7:
            r18 = r18 & r0
            r4 = r15
        L_0x00da:
            r13 = r12
            goto L_0x0086
        L_0x00dc:
            r0 = 0
            goto L_0x00d7
        L_0x00de:
            if (r11 != r9) goto L_0x00e2
            r11 = 4
            goto L_0x00da
        L_0x00e2:
            if (r11 == r15) goto L_0x00e7
            r0 = 6
            if (r11 != r0) goto L_0x00da
        L_0x00e7:
            r11 = 7
            goto L_0x00da
        L_0x00e9:
            int r0 = r1 + -48
            int r0 = -r0
            long r4 = (long) r0
            r11 = 2
            goto L_0x00da
        L_0x00ef:
            if (r11 != r14) goto L_0x0137
            r11 = 3
            goto L_0x00da
        L_0x00f3:
            if (r11 != 0) goto L_0x0100
            r11 = 1
            r17 = 1
            goto L_0x00da
        L_0x00f9:
            if (r11 == r14) goto L_0x00fe
            r0 = 4
            if (r11 != r0) goto L_0x0137
        L_0x00fe:
            r11 = 5
            goto L_0x00da
        L_0x0100:
            if (r11 != r15) goto L_0x0137
            r11 = 6
            goto L_0x00da
        L_0x0104:
            boolean r0 = r8.A0V(r1)
            if (r0 != 0) goto L_0x0137
        L_0x010a:
            if (r11 != r14) goto L_0x012a
            if (r18 == 0) goto L_0x0131
            r9 = -9223372036854775808
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0116
            if (r17 == 0) goto L_0x0131
        L_0x0116:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0127
            if (r17 != 0) goto L_0x0131
        L_0x011c:
            long r4 = -r4
        L_0x011d:
            r8.A02 = r4
            long r0 = (long) r13
            r6.A0G(r0)
            r5 = 16
            goto L_0x0216
        L_0x0127:
            if (r17 == 0) goto L_0x011c
            goto L_0x011d
        L_0x012a:
            if (r11 == r14) goto L_0x0131
            r0 = 4
            if (r11 == r0) goto L_0x0131
            if (r11 != r10) goto L_0x0137
        L_0x0131:
            r8.A01 = r13
            r5 = 17
            goto L_0x0216
        L_0x0137:
            byte r0 = r6.A01(r2)
            boolean r0 = r8.A0V(r0)
            if (r0 != 0) goto L_0x021e
            java.lang.String r0 = "Expected value"
            goto L_0x01c2
        L_0x0144:
            r11 = r14
            goto L_0x0060
        L_0x0147:
            X.0mq r11 = r8.A05
            int r0 = r4 + 1
            long r0 = (long) r0
            boolean r0 = r11.AcF(r0)
            if (r0 == 0) goto L_0x015f
            long r0 = (long) r4
            byte r0 = r6.A01(r0)
            boolean r0 = r8.A0V(r0)
            if (r0 == 0) goto L_0x015f
            goto L_0x007e
        L_0x015f:
            long r0 = (long) r4
            r6.A0G(r0)
            goto L_0x0216
        L_0x0165:
            r5 = 6
            java.lang.String r13 = "false"
            java.lang.String r12 = "FALSE"
            goto L_0x005b
        L_0x016c:
            r5 = 5
            java.lang.String r13 = "true"
            java.lang.String r12 = "TRUE"
            goto L_0x005b
        L_0x0173:
            if (r4 != r7) goto L_0x017d
            X.0i7 r0 = r8.A04
            r0.readByte()
            r5 = 4
            goto L_0x0216
        L_0x017d:
            if (r4 == r7) goto L_0x021e
            r0 = 2
            if (r4 == r0) goto L_0x021e
            java.lang.String r0 = "Unexpected value"
            goto L_0x01c2
        L_0x0185:
            X.0i7 r0 = r8.A04
            r0.readByte()
            r5 = 9
            goto L_0x0216
        L_0x018e:
            if (r4 != r12) goto L_0x01a5
            int r12 = r8.A0Q(r7)
            X.0i7 r1 = r8.A04
            r1.readByte()
            if (r12 == r5) goto L_0x0020
            if (r12 == r11) goto L_0x021e
            if (r12 != r13) goto L_0x01a2
            r8.A00 = r0
            return r0
        L_0x01a2:
            java.lang.String r0 = "Unterminated array"
            goto L_0x01c2
        L_0x01a5:
            r12 = 5
            if (r4 == r9) goto L_0x01d2
            if (r4 == r12) goto L_0x01d2
            if (r4 != r0) goto L_0x01ca
            int r14 = r14 - r7
            r15[r14] = r12
            int r1 = r8.A0Q(r7)
            X.0i7 r0 = r8.A04
            r0.readByte()
            r0 = 58
            if (r1 == r0) goto L_0x0020
            r0 = 61
            if (r1 == r0) goto L_0x021e
            java.lang.String r0 = "Expected ':'"
        L_0x01c2:
            r8.A0L(r0)
        L_0x01c5:
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x01ca:
            r0 = 6
            if (r4 != r0) goto L_0x020a
            int r14 = r14 - r7
            r15[r14] = r10
            goto L_0x0020
        L_0x01d2:
            int r14 = r14 - r7
            r15[r14] = r0
            r2 = 125(0x7d, float:1.75E-43)
            if (r4 != r12) goto L_0x01eb
            int r1 = r8.A0Q(r7)
            X.0i7 r0 = r8.A04
            r0.readByte()
            if (r1 == r5) goto L_0x01eb
            if (r1 == r11) goto L_0x021e
            if (r1 == r2) goto L_0x0200
            java.lang.String r0 = "Unterminated object"
            goto L_0x01c2
        L_0x01eb:
            int r1 = r8.A0Q(r7)
            if (r1 == r6) goto L_0x0202
            r0 = 39
            if (r1 == r0) goto L_0x0219
            java.lang.String r0 = "Expected name"
            if (r1 != r2) goto L_0x021e
            if (r4 == r12) goto L_0x01c2
            X.0i7 r0 = r8.A04
            r0.readByte()
        L_0x0200:
            r5 = 2
            goto L_0x0216
        L_0x0202:
            X.0i7 r0 = r8.A04
            r0.readByte()
            r5 = 13
            goto L_0x0216
        L_0x020a:
            if (r4 != r10) goto L_0x0222
            r0 = 0
            int r1 = r8.A0Q(r0)
            r0 = -1
            if (r1 != r0) goto L_0x021e
            r5 = 18
        L_0x0216:
            r8.A00 = r5
            return r5
        L_0x0219:
            X.0i7 r0 = r8.A04
            r0.readByte()
        L_0x021e:
            r8.A0T()
            goto L_0x01c5
        L_0x0222:
            if (r4 != r1) goto L_0x0020
            java.lang.String r0 = "JsonReader is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x022b:
            X.0i7 r0 = r8.A04
            r0.readByte()
            r8.A00 = r7
            return r7
        L_0x0233:
            X.0i7 r0 = r8.A04
            r0.readByte()
            r8.A00 = r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03070Hc.A0P():int");
    }

    public final int A0Q(boolean z2) {
        int i2 = 0;
        while (true) {
            C13670mq r3 = this.A05;
            int i3 = i2 + 1;
            if (r3.AcF((long) i3)) {
                C11050i7 r4 = this.A04;
                byte A012 = r4.A01((long) i2);
                if (A012 == 10 || A012 == 32 || A012 == 13 || A012 == 9) {
                    i2 = i3;
                } else {
                    r4.A0G((long) (i3 - 1));
                    if (A012 != 47 ? A012 != 35 : !r3.AcF(2)) {
                        return A012;
                    }
                    A0T();
                    throw AnonymousClass000.A0Z();
                }
            } else if (!z2) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String A0R() {
        long AHt = this.A05.AHt(A0A);
        return AHt != -1 ? this.A04.A05(AHt) : this.A04.A04();
    }

    public final String A0S(C09200f6 r8) {
        StringBuilder sb = null;
        while (true) {
            long AHt = this.A05.AHt(r8);
            if (AHt != -1) {
                C11050i7 r4 = this.A04;
                if (r4.A01(AHt) == 92) {
                    if (sb == null) {
                        sb = AnonymousClass000.A0o();
                    }
                    sb.append(r4.A05(AHt));
                    r4.readByte();
                    sb.append(A0O());
                } else {
                    String A052 = r4.A05(AHt);
                    if (sb == null) {
                        r4.readByte();
                        return A052;
                    }
                    sb.append(A052);
                    r4.readByte();
                    return sb.toString();
                }
            } else {
                A0L("Unterminated string");
                throw AnonymousClass000.A0Z();
            }
        }
    }

    public final void A0T() {
        A0L("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw AnonymousClass000.A0Z();
    }

    public final void A0U(C09200f6 r8) {
        while (true) {
            long AHt = this.A05.AHt(r8);
            if (AHt != -1) {
                C11050i7 r6 = this.A04;
                byte A012 = r6.A01(AHt);
                long j2 = AHt + 1;
                if (A012 == 92) {
                    r6.A0G(j2);
                    A0O();
                } else {
                    r6.A0G(j2);
                    return;
                }
            } else {
                A0L("Unterminated string");
                throw AnonymousClass000.A0Z();
            }
        }
    }

    public final boolean A0V(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A0T();
        throw AnonymousClass000.A0Z();
    }

    public void close() {
        this.A00 = 0;
        this.A02[0] = 8;
        this.A00 = 1;
        this.A04.A0A();
        this.A05.close();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("JsonReader(");
        A0r.append(this.A05);
        return AnonymousClass000.A0h(")", A0r);
    }
}
