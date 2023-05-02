package X;

import java.io.InputStream;

/* renamed from: X.4WD  reason: invalid class name */
public class AnonymousClass4WD {
    public final int A00;
    public final InputStream A01;
    public final byte[][] A02 = new byte[11][];

    public AnonymousClass4WD(InputStream inputStream, int i2) {
        this.A01 = inputStream;
        this.A00 = i2;
    }

    public C32071fb A00() {
        AnonymousClass4WD r1;
        String str;
        InputStream inputStream = this.A01;
        int read = inputStream.read();
        if (read == -1) {
            return null;
        }
        boolean z2 = false;
        if (inputStream instanceof AnonymousClass5J3) {
            AnonymousClass5J3 r0 = (AnonymousClass5J3) inputStream;
            r0.A02 = false;
            r0.A01();
        }
        int A002 = C33011hn.A00(inputStream, read);
        boolean A1O = AnonymousClass000.A1O(read & 32);
        int i2 = this.A00;
        if (A002 == 4 || A002 == 16 || A002 == 17 || A002 == 8) {
            z2 = true;
        }
        int A012 = C33011hn.A01(inputStream, i2, z2);
        if (A012 >= 0) {
            AnonymousClass5J4 r2 = new AnonymousClass5J4(inputStream, A012, i2);
            if ((read & 64) != 0) {
                return new AnonymousClass5HW(r2.A01(), A002, A1O);
            }
            if ((read & 128) != 0) {
                return new AnonymousClass59W(new AnonymousClass4WD(r2, C32551gZ.A02(r2)), A002, A1O);
            }
            if (A1O) {
                if (A002 == 4) {
                    r1 = new AnonymousClass4WD(r2, C32551gZ.A02(r2));
                    return new AnonymousClass59Q(r1);
                } else if (A002 == 8) {
                    r1 = new AnonymousClass4WD(r2, C32551gZ.A02(r2));
                    return new AnonymousClass59O(r1);
                } else if (A002 == 16) {
                    return new AnonymousClass59T(new AnonymousClass4WD(r2, C32551gZ.A02(r2)));
                } else {
                    if (A002 == 17) {
                        return new AnonymousClass59V(new AnonymousClass4WD(r2, C32551gZ.A02(r2)));
                    }
                    StringBuilder A0r = AnonymousClass000.A0r("unknown tag ");
                    A0r.append(A002);
                    str = AnonymousClass000.A0h(" encountered", A0r);
                }
            } else if (A002 == 4) {
                return new AnonymousClass59R(r2);
            } else {
                try {
                    return C33011hn.A03(r2, this.A02, A002);
                } catch (IllegalArgumentException e2) {
                    throw new AnonymousClass40L("corrupted stream detected", e2);
                }
            }
        } else if (A1O) {
            r1 = new AnonymousClass4WD(new AnonymousClass5J3(inputStream, i2), i2);
            if ((read & 64) != 0) {
                return new AnonymousClass59P(r1, A002);
            }
            if ((read & 128) != 0) {
                return new AnonymousClass59W(r1, A002, true);
            }
            if (A002 != 4) {
                if (A002 != 8) {
                    if (A002 == 16) {
                        return new AnonymousClass59S(r1);
                    }
                    if (A002 == 17) {
                        return new AnonymousClass59U(r1);
                    }
                    throw new AnonymousClass40L(AnonymousClass000.A0h(Integer.toHexString(A002), AnonymousClass000.A0r("unknown BER object encountered: 0x")));
                }
                return new AnonymousClass59O(r1);
            }
            return new AnonymousClass59Q(r1);
        } else {
            str = "indefinite-length primitive encoding encountered";
        }
        throw AnonymousClass3K3.A0e(str);
    }

    public C32391gH A01() {
        C32071fb A002 = A00();
        if (A002 == null) {
            return new C32391gH(0);
        }
        C32391gH r1 = new C32391gH();
        do {
            r1.A02(A002 instanceof AnonymousClass5R2 ? ((AnonymousClass5R2) A002).ADB() : A002.Agm());
            A002 = A00();
        } while (A002 != null);
        return r1;
    }

    public C32051fZ A02(int i2, boolean z2) {
        if (!z2) {
            return new C107615Iw(new AnonymousClass5IT(((AnonymousClass5J4) this.A01).A01()), i2, false);
        }
        C32391gH A012 = A01();
        boolean z3 = this.A01 instanceof AnonymousClass5J3;
        int i3 = A012.A00;
        if (z3) {
            if (i3 == 1) {
                return new C107605Iv(A012.A01(0), i2, true);
            }
            return new C107605Iv(i3 < 1 ? C81994Ap.A00 : new C107545Ip(A012), i2, false);
        } else if (i3 == 1) {
            return new C107615Iw(A012.A01(0), i2, true);
        } else {
            return new C107615Iw(i3 < 1 ? C82004Aq.A00 : new C107555Iq(A012), i2, false);
        }
    }
}
