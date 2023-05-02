package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.5Iu  reason: invalid class name and case insensitive filesystem */
public abstract class C107595Iu extends C32051fZ implements C32421gK {
    public final boolean A00;
    public final C32071fb[] A01;

    public C107595Iu() {
        this.A01 = C32391gH.A03;
        this.A00 = true;
    }

    public C107595Iu(C32071fb r4) {
        if (r4 != null) {
            this.A01 = new C32071fb[]{r4};
            this.A00 = true;
            return;
        }
        throw AnonymousClass000.A0W("'element' cannot be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r2.length < 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C107595Iu(X.C32391gH r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r4 = 2
            if (r7 == 0) goto L_0x0021
            int r3 = r6.A00
            if (r3 < r4) goto L_0x0021
            X.1fb[] r2 = new X.C32071fb[r3]
            X.1fb[] r1 = r6.A02
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            A03(r2)
        L_0x0015:
            r5.A01 = r2
            if (r7 != 0) goto L_0x001d
            int r1 = r2.length
            r0 = 0
            if (r1 >= r4) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r5.A00 = r0
            return
        L_0x0021:
            X.1fb[] r2 = r6.A03()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107595Iu.<init>(X.1gH, boolean):void");
    }

    public C107595Iu(C32071fb[] r4) {
        for (C32071fb r0 : r4) {
            if (r0 == null) {
                throw AnonymousClass000.A0W("'elements' cannot be null, or contain null");
            }
        }
        C32071fb[] A002 = C32391gH.A00(r4);
        if (A002.length >= 2) {
            A03(A002);
        }
        this.A01 = A002;
        this.A00 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.length < 2) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C107595Iu(X.C32071fb[] r4, boolean r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A01 = r4
            if (r5 != 0) goto L_0x000c
            int r2 = r4.length
            r1 = 2
            r0 = 0
            if (r2 >= r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107595Iu.<init>(X.1fb[], boolean):void");
    }

    public static C107595Iu A00(Object obj) {
        if (obj == null || (obj instanceof C107595Iu)) {
            return (C107595Iu) obj;
        }
        if (obj instanceof AnonymousClass5VL) {
            return A00(((C32071fb) obj).Agm());
        }
        if (obj instanceof byte[]) {
            try {
                return A00(C32051fZ.A02((byte[]) obj));
            } catch (IOException e2) {
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("failed to construct set from byte[]: ")));
            }
        } else {
            if (obj instanceof C32071fb) {
                C32051fZ Agm = ((C32071fb) obj).Agm();
                if (Agm instanceof C107595Iu) {
                    return (C107595Iu) Agm;
                }
            }
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(obj), AnonymousClass000.A0r("unknown object in getInstance: ")));
        }
    }

    public static C107595Iu A01(C107525In r3) {
        C32051fZ A002 = C107525In.A00(r3);
        if (r3.A02) {
            return r3 instanceof C107605Iv ? new C107565Ir((C32071fb) A002) : new C107575Is((C32071fb) A002);
        }
        if (A002 instanceof C107595Iu) {
            C107595Iu r2 = (C107595Iu) A002;
            return r3 instanceof C107605Iv ? r2 : (C107595Iu) r2.A06();
        } else if (A002 instanceof C32411gJ) {
            C32071fb[] A0D = ((C32411gJ) A002).A0D();
            return r3 instanceof C107605Iv ? new C107565Ir(A0D) : new C107575Is(A0D, false);
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(r3), AnonymousClass000.A0r("unknown object in getInstance: ")));
        }
    }

    public static void A03(C32071fb[] r12) {
        int length = r12.length;
        if (length >= 2) {
            C32071fb r11 = r12[0];
            C32071fb r9 = r12[1];
            try {
                byte[] A1E = AnonymousClass3K4.A1E(r11);
                byte[] A1E2 = AnonymousClass3K4.A1E(r9);
                byte[] bArr = A1E2;
                if (A04(A1E2, A1E)) {
                    C32071fb r0 = r9;
                    r9 = r11;
                    r11 = r0;
                    bArr = A1E;
                    A1E = A1E2;
                }
                for (int i2 = 2; i2 < length; i2++) {
                    C32071fb r4 = r12[i2];
                    byte[] A1E3 = AnonymousClass3K4.A1E(r4);
                    if (A04(bArr, A1E3)) {
                        r12[i2 - 2] = r11;
                        r11 = r9;
                        A1E = bArr;
                        r9 = r4;
                        bArr = A1E3;
                    } else if (A04(A1E, A1E3)) {
                        r12[i2 - 2] = r11;
                        r11 = r4;
                        A1E = A1E3;
                    } else {
                        int i3 = i2 - 1;
                        while (true) {
                            i3--;
                            if (i3 <= 0) {
                                break;
                            }
                            C32071fb r1 = r12[i3 - 1];
                            if (A04(AnonymousClass3K4.A1E(r1), A1E3)) {
                                break;
                            }
                            r12[i3] = r1;
                        }
                        r12[i3] = r4;
                    }
                }
                r12[length - 2] = r11;
                r12[length - 1] = r9;
            } catch (IOException unused) {
                throw AnonymousClass000.A0T("cannot encode object added to SET");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(byte[] r5, byte[] r6) {
        /*
            r4 = 0
            byte r0 = r5[r4]
            r1 = r0 & -33
            byte r0 = r6[r4]
            r0 = r0 & -33
            r3 = 1
            if (r1 != r0) goto L_0x001f
            int r1 = r5.length
            int r0 = r6.length
            int r2 = java.lang.Math.min(r1, r0)
            int r2 = r2 - r3
        L_0x0013:
            if (r3 >= r2) goto L_0x0026
            byte r1 = r5[r3]
            byte r0 = r6[r3]
            if (r1 == r0) goto L_0x0023
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x001f:
            if (r1 >= r0) goto L_0x0022
        L_0x0021:
            r4 = 1
        L_0x0022:
            return r4
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0026:
            byte r0 = r5[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r6[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x0022
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107595Iu.A04(byte[], byte[]):boolean");
    }

    public C32051fZ A05() {
        boolean z2 = this.A00;
        C32071fb[] r0 = this.A01;
        if (!z2) {
            r0 = (C32071fb[]) r0.clone();
            A03(r0);
        }
        return new C107585It(r0, true);
    }

    public C32051fZ A06() {
        return new C107575Is(this.A01, this.A00);
    }

    public void A07(C33061hs r11, boolean z2) {
        if (this instanceof C107575Is) {
            C107575Is r9 = (C107575Is) this;
            if (z2) {
                r11.A00.write(49);
            }
            C33061hs A002 = r11.A00();
            C32071fb[] r8 = r9.A01;
            int length = r8.length;
            int i2 = r9.A00;
            int i3 = 0;
            if (i2 < 0) {
                if (length > 16) {
                    int i4 = 0;
                    i2 = 0;
                    do {
                        i2 = AnonymousClass3K3.A0P(r8, i4, i2);
                        i4++;
                    } while (i4 < length);
                    r9.A00 = i2;
                } else {
                    C32051fZ[] r3 = new C32051fZ[length];
                    int i5 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        C32051fZ A06 = r8[i6].Agm().A06();
                        r3[i6] = A06;
                        i5 += A06.A03();
                    }
                    r9.A00 = i5;
                    r11.A02(i5);
                    while (i3 < length) {
                        A002.A04(r3[i3], true);
                        i3++;
                    }
                    return;
                }
            }
            r11.A02(i2);
            while (i3 < length) {
                A002.A04(r8[i3].Agm(), true);
                i3++;
            }
        } else if (this instanceof C107585It) {
            C107585It r92 = (C107585It) this;
            if (z2) {
                r11.A00.write(49);
            }
            C33071ht A012 = r11.A01();
            C32071fb[] r7 = r92.A01;
            int length2 = r7.length;
            int i7 = r92.A00;
            int i8 = 0;
            if (i7 < 0) {
                if (length2 > 16) {
                    int i9 = 0;
                    i7 = 0;
                    do {
                        i7 += r7[i9].Agm().A05().A03();
                        i9++;
                    } while (i9 < length2);
                    r92.A00 = i7;
                } else {
                    C32051fZ[] r82 = new C32051fZ[length2];
                    int i10 = 0;
                    for (int i11 = 0; i11 < length2; i11++) {
                        C32051fZ A05 = r7[i11].Agm().A05();
                        r82[i11] = A05;
                        i10 += A05.A03();
                    }
                    r92.A00 = i10;
                    r11.A02(i10);
                    while (i8 < length2) {
                        r82[i8].A07(A012, true);
                        i8++;
                    }
                    return;
                }
            }
            r11.A02(i7);
            while (i8 < length2) {
                r7[i8].Agm().A05().A07(A012, true);
                i8++;
            }
        } else {
            r11.A07(this.A01, 49, z2);
        }
    }

    public boolean A08() {
        return true;
    }

    public boolean A09(C32051fZ r8) {
        if (r8 instanceof C107595Iu) {
            C107595Iu r82 = (C107595Iu) r8;
            int length = this.A01.length;
            if (r82.A01.length == length) {
                C107595Iu r4 = (C107595Iu) A05();
                C107595Iu r3 = (C107595Iu) r82.A05();
                int i2 = 0;
                while (i2 < length) {
                    C32051fZ Agm = r4.A01[i2].Agm();
                    C32051fZ Agm2 = r3.A01[i2].Agm();
                    if (Agm == Agm2 || Agm.A09(Agm2)) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C32071fb[] r3 = this.A01;
        int length = r3.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = AnonymousClass3K2.A06(r3[length].Agm(), i2);
        }
    }

    public Iterator iterator() {
        return new AnonymousClass57T(C32391gH.A00(this.A01));
    }

    public String toString() {
        C32071fb[] r4 = this.A01;
        int length = r4.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i2 = 0;
        while (true) {
            stringBuffer.append(r4[i2]);
            i2++;
            if (i2 >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
