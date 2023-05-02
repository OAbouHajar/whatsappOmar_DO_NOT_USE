package X;

import java.util.Enumeration;

/* renamed from: X.5IQ  reason: invalid class name */
public class AnonymousClass5IQ extends C32061fa implements AnonymousClass5NM {
    public static C89394c5 A05 = AnonymousClass5J5.A0g;
    public int A00;
    public C32401gI A01;
    public C89394c5 A02;
    public boolean A03;
    public AnonymousClass5IJ[] A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.5IJ[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.1fY[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.1fY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: X.1fY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.String} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5IQ() {
        /*
            r12 = this;
            java.lang.String r1 = "CN=WAUser"
            X.4c5 r5 = A05
            r0 = 44
            X.4Uq r4 = new X.4Uq
            r4.<init>(r1, r0)
            X.4Zf r6 = new X.4Zf
            r6.<init>(r5)
        L_0x0010:
            int r1 = r4.A01
            java.lang.String r0 = r4.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass3K2.A1X(r1, r0)
            if (r0 == 0) goto L_0x0148
            java.lang.String r2 = r4.A00()
            r1 = 43
            int r0 = r2.indexOf(r1)
            java.lang.String r11 = "badly formatted directory string"
            r9 = 61
            if (r0 <= 0) goto L_0x0105
            X.4Uq r10 = new X.4Uq
            r10.<init>(r2, r1)
            java.lang.String r0 = r10.A00()
            X.4Uq r3 = new X.4Uq
            r3.<init>(r0, r9)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass3K2.A1X(r1, r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r8 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.1fY r3 = r5.A03(r0)
            int r1 = r10.A01
            java.lang.String r0 = r10.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass3K2.A1X(r1, r0)
            if (r0 == 0) goto L_0x012d
            java.util.Vector r7 = new java.util.Vector
            r7.<init>()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
        L_0x0072:
            r7.addElement(r3)
            java.lang.String r0 = A00(r8)
            r2.addElement(r0)
            int r1 = r10.A01
            java.lang.String r0 = r10.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass3K2.A1X(r1, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = r10.A00()
            X.4Uq r8 = new X.4Uq
            r8.<init>(r0, r9)
            java.lang.String r3 = r8.A00()
            int r1 = r8.A01
            java.lang.String r0 = r8.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass3K2.A1X(r1, r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r8 = r8.A00()
            java.lang.String r0 = r3.trim()
            X.1fY r3 = r5.A03(r0)
            goto L_0x0072
        L_0x00b2:
            int r10 = r7.size()
            X.1fY[] r9 = new X.C32041fY[r10]
            r1 = 0
        L_0x00b9:
            if (r1 == r10) goto L_0x00c4
            java.lang.Object r0 = r7.elementAt(r1)
            r9[r1] = r0
            int r1 = r1 + 1
            goto L_0x00b9
        L_0x00c4:
            int r11 = r2.size()
            java.lang.String[] r7 = new java.lang.String[r11]
            r1 = 0
        L_0x00cb:
            if (r1 == r11) goto L_0x00d6
            java.lang.Object r0 = r2.elementAt(r1)
            r7[r1] = r0
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00d6:
            X.1fb[] r8 = new X.C32071fb[r11]
            r3 = 0
        L_0x00d9:
            if (r3 == r11) goto L_0x00ea
            X.4c5 r2 = r6.A01
            r1 = r9[r3]
            r0 = r7[r3]
            X.1fb r0 = r2.A02(r0, r1)
            r8[r3] = r0
            int r3 = r3 + 1
            goto L_0x00d9
        L_0x00ea:
            X.5I9[] r7 = new X.AnonymousClass5I9[r10]
            r3 = 0
        L_0x00ed:
            if (r3 == r10) goto L_0x00fd
            r2 = r9[r3]
            r1 = r8[r3]
            X.5I9 r0 = new X.5I9
            r0.<init>(r1, r2)
            r7[r3] = r0
            int r3 = r3 + 1
            goto L_0x00ed
        L_0x00fd:
            java.util.Vector r1 = r6.A00
            X.5IJ r0 = new X.5IJ
            r0.<init>((X.AnonymousClass5I9[]) r7)
            goto L_0x013e
        L_0x0105:
            X.4Uq r3 = new X.4Uq
            r3.<init>(r2, r9)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass3K2.A1X(r1, r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r1 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.1fY r3 = r5.A03(r0)
            java.lang.String r1 = A00(r1)
            goto L_0x0131
        L_0x012d:
            java.lang.String r1 = A00(r8)
        L_0x0131:
            X.4c5 r0 = r6.A01
            X.1fb r2 = r0.A02(r1, r3)
            java.util.Vector r1 = r6.A00
            X.5IJ r0 = new X.5IJ
            r0.<init>(r2, r3)
        L_0x013e:
            r1.addElement(r0)
            goto L_0x0010
        L_0x0143:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r11)
            throw r0
        L_0x0148:
            java.util.Vector r4 = r6.A00
            int r3 = r4.size()
            X.5IJ[] r2 = new X.AnonymousClass5IJ[r3]
            r1 = 0
        L_0x0151:
            if (r1 == r3) goto L_0x015c
            java.lang.Object r0 = r4.elementAt(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0151
        L_0x015c:
            X.4c5 r1 = r6.A01
            X.5IQ r0 = new X.5IQ
            r0.<init>((X.C89394c5) r1, (X.AnonymousClass5IJ[]) r2)
            X.5IJ[] r0 = r0.A03()
            r12.<init>((X.C89394c5) r5, (X.AnonymousClass5IJ[]) r0)
            r12.A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IQ.<init>():void");
    }

    public AnonymousClass5IQ(C32411gJ r7, C89394c5 r8) {
        this.A02 = r8;
        this.A04 = new AnonymousClass5IJ[r7.A0A()];
        Enumeration A0B = r7.A0B();
        boolean z2 = true;
        int i2 = 0;
        while (A0B.hasMoreElements()) {
            Object nextElement = A0B.nextElement();
            AnonymousClass5IJ A002 = AnonymousClass5IJ.A00(nextElement);
            z2 &= AnonymousClass000.A1Y(A002, nextElement);
            this.A04[i2] = A002;
            i2++;
        }
        this.A01 = z2 ? (C32401gI) r7.A05() : new C32401gI((C32071fb[]) this.A04);
    }

    public AnonymousClass5IQ(C89394c5 r3, AnonymousClass5IJ[] r4) {
        this.A02 = r3;
        AnonymousClass5IJ[] r1 = (AnonymousClass5IJ[]) r4.clone();
        this.A04 = r1;
        this.A01 = new C32401gI((C32071fb[]) r1);
    }

    public AnonymousClass5IQ(AnonymousClass5IQ r2, C89394c5 r3) {
        this.A02 = r3;
        this.A04 = r2.A04;
        this.A01 = r2.A01;
    }

    public static String A00(String str) {
        int i2;
        int length = str.length();
        if (length == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(length);
        if (charArray[0] == '\\' && charArray[1] == '#') {
            i2 = 2;
            stringBuffer.append("\\#");
        } else {
            i2 = 0;
        }
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        char c2 = 0;
        while (i2 != charArray.length) {
            char c3 = charArray[i2];
            if (c3 != ' ') {
                z4 = true;
                if (c3 == '\"') {
                    if (!z2) {
                        z3 = !z3;
                        z2 = false;
                        i2++;
                    }
                } else if (c3 == '\\') {
                    if (!z2 && !z3) {
                        i3 = stringBuffer.length();
                        z2 = true;
                        i2++;
                    }
                } else if (c3 != ' ') {
                    if (z2 && '0' <= c3 && (c3 <= '9' || ('a' > c3 ? !('A' > c3 || c3 > 'F') : c3 <= 'f'))) {
                        if (c2 != 0) {
                            stringBuffer.append((char) ((C90744ej.A00(c2) << 4) + C90744ej.A00(c3)));
                            z2 = false;
                            c2 = 0;
                        } else {
                            c2 = c3;
                        }
                        i2++;
                    }
                }
                stringBuffer.append(c3);
                z2 = false;
                i2++;
            }
            if (!z2 && !z4) {
                i2++;
            }
            stringBuffer.append(c3);
            z2 = false;
            i2++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i3 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static AnonymousClass5IQ A01(Object obj) {
        if (obj instanceof AnonymousClass5IQ) {
            return (AnonymousClass5IQ) obj;
        }
        if (obj != null) {
            return new AnonymousClass5IQ(C32411gJ.A00(obj), A05);
        }
        return null;
    }

    public static AnonymousClass5IQ A02(Object obj, C89394c5 r3) {
        if (obj instanceof AnonymousClass5IQ) {
            return new AnonymousClass5IQ((AnonymousClass5IQ) obj, r3);
        }
        if (obj != null) {
            return new AnonymousClass5IQ(C32411gJ.A00(obj), r3);
        }
        return null;
    }

    public AnonymousClass5IJ[] A03() {
        return (AnonymousClass5IJ[]) this.A04.clone();
    }

    public C32051fZ Agm() {
        return this.A01;
    }

    public boolean equals(Object obj) {
        int i2;
        if (obj != this) {
            if (!(obj instanceof AnonymousClass5IQ) && !(obj instanceof C32411gJ)) {
                return false;
            }
            C32071fb r13 = (C32071fb) obj;
            if (!this.A01.A04(r13.Agm())) {
                try {
                    C89394c5 r3 = this.A02;
                    AnonymousClass5IQ r1 = new AnonymousClass5IQ(C32411gJ.A00(r13.Agm()), A05);
                    if (r3 instanceof AnonymousClass5J7) {
                        AnonymousClass5IJ[] A032 = A03();
                        AnonymousClass5IJ[] A033 = r1.A03();
                        int length = A032.length;
                        if (length != A033.length) {
                            return false;
                        }
                        for (int i3 = 0; i3 != length; i3++) {
                            if (!C90744ej.A06(A032[i3], A033[i3])) {
                                return false;
                            }
                        }
                        return true;
                    }
                    AnonymousClass5IJ[] A034 = A03();
                    AnonymousClass5IJ[] A035 = r1.A03();
                    int length2 = A034.length;
                    int length3 = A035.length;
                    if (length2 != length3) {
                        return false;
                    }
                    boolean z2 = (A034[0].A03() == null || A035[0].A03() == null) ? false : !A034[0].A03().A01.A04(A035[0].A03().A01);
                    for (int i4 = 0; i4 != length2; i4++) {
                        AnonymousClass5IJ r32 = A034[i4];
                        int i5 = 0;
                        if (z2) {
                            i2 = length3 - 1;
                            while (i2 >= 0) {
                                if (A035[i2] == null || !C90744ej.A06(r32, A035[i2])) {
                                    i2--;
                                }
                            }
                            return false;
                        }
                        while (i2 != length3) {
                            if (A035[i2] == null || !C90744ej.A06(r32, A035[i2])) {
                                i5 = i2 + 1;
                            }
                        }
                        return false;
                        A035[i2] = null;
                    }
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.A03) {
            return this.A00;
        }
        this.A03 = true;
        AnonymousClass5IJ[] A032 = A03();
        int i2 = 0;
        for (int i3 = 0; i3 != A032.length; i3++) {
            AnonymousClass5IJ r5 = A032[i3];
            if (r5.A00.A01.length > 1) {
                AnonymousClass5I9[] A042 = r5.A04();
                for (int i4 = 0; i4 != A042.length; i4++) {
                    AnonymousClass5I9 r4 = A042[i4];
                    i2 = (i2 ^ r4.A01.hashCode()) ^ C90744ej.A01(r4.A00).hashCode();
                }
            } else {
                i2 = (i2 ^ r5.A03().A01.hashCode()) ^ C90744ej.A01(A032[i3].A03().A00).hashCode();
            }
        }
        this.A00 = i2;
        return i2;
    }

    public String toString() {
        return this.A02.A01(this);
    }
}
